package com.beeasy.easyshop.ctrl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.beeasy.easyshop.U;
import com.beeasy.easyshop.filter.auth;
import com.beeasy.easyshop.model.*;
import com.beeasy.web.core.Flow;
import com.beeasy.web.core.R;

import java.util.Objects;

import static com.beeasy.easyshop.U.obj;
import static com.beeasy.web.core.DBService.sqlManager;

public class store {

    public R one(String id) {
        return R.ok(sqlManager.unique(RaStore.class, id));
    }


    /**
     * 保存
     * @param body
     * @return
     */
    public R save(
        JSONObject body
    ) {
        //只接受以下属性的更新
        Flow.of(RaStore.class, body)
            .hold(
                RaStore::getStore_qq,
                RaStore::getStore_zy,
                RaStore::getStore_ww,
                RaStore::getStore_phone,
                RaStore::getStore_keywords,
                RaStore::getStore_description,
                RaStore::getN_logo,
                RaStore::getN_avatar,
                RaStore::getN_banner
            );
        // TODO: 2019/5/16 参数必须校验
        //只能更新我自己的店铺
        sqlManager.lambdaQuery(RaStore.class)
            .andEq(RaStore::getStore_id, auth.getStoreId())
            .updateSelective(body);
        return R.ok(true);
    }


    public R orderlist(JSONObject query) {
        //只查我店铺的订单
        query.put("store_id", auth.getStoreId());
        var pq = U.pageQuery("ra_order.page", JSONObject.class, query);
        if (pq.getTotalRow() > 0) {
            //查询订单相关的商品
            var map = new JSONObject();
            for (JSONObject object : pq.getList()) {
                map.put(object.getString("order_id"), object);
                object.put("goods", new JSONArray());
            }
            var ogs = sqlManager.lambdaQuery(RaOrderGoods.class)
                .andIn(RaOrderGoods::getOrder_id, map.keySet())
                .select();
            for (RaOrderGoods og : ogs) {
                map.getJSONObject(og.getOrder_id() + "").getJSONArray("goods").add(og);
            }
        }
        return R.ok(pq);
    }


    public R gallerylist(JSONObject query){
       //只查我的店铺
        query.put("storeId", auth.getStoreId());
        return R.ok(
            sqlManager.select("raAlbumClass.查询相册", JSONObject.class, query)
        );
//        return R.ok(sqlManager.lambdaQuery(RaAlbumClass.class)
//            .andEq(RaAlbumClass::getStoreId, auth.getStoreId())
//            .select());
    }

    /**
     * 添加相册
     * @param body
     * @return
     */
    public R addgallery(JSONObject body){
        var item = Flow.of(RaAlbumClass.class, body)
            .hold(
                RaAlbumClass::getAclass_sort,
                RaAlbumClass::getAclass_id,
                RaAlbumClass::getAclass_name,
                RaAlbumClass::getAclass_des
            )
            .on(RaAlbumClass::getAclass_name, Flow.ValidateType.notempty, "相册名不能为空")
            .cast();
        if(item.getAclass_id() != null){
            sqlManager.lambdaQuery(RaAlbumClass.class)
                .andEq(RaAlbumClass::getStore_id, auth.getStoreId())
                .andEq(RaAlbumClass::getAclass_id, item.getAclass_id())
                .updateSelective(item);
        } else {
            item.setStore_id(Integer.parseInt(auth.getStoreId()));
            item.setIs_default(0);
            sqlManager.insert(item);
        }

        return R.ok();
    }

    /**
     * 删除相册
     * @param id
     * @return
     */
    public R delgallery(String id){
        //验证是我的
        var gallery = sqlManager.unique(RaAlbumClass.class, id);
        if (!auth.getStoreId().equals(gallery.getStore_id() + "")) {
            return R.fail();
        }
        if(Objects.equals(gallery.getIs_default(), 1)){
            return R.fail("默认相册无法删除");
        }

        //该相册下所有的图片都给default
        var dft = sqlManager.lambdaQuery(RaAlbumClass.class)
            .andEq(RaAlbumClass::getStore_id, auth.getStoreId())
            .andEq(RaAlbumClass::getIs_default, 1)
            .single();
        if (dft != null) {
            sqlManager.lambdaQuery(RaAlbumPic.class)
                .andEq(RaAlbumPic::getAclass_id, id)
                .updateSelective(obj("aclass_id", dft.getAclass_id()));
        }
        sqlManager.deleteObject(gallery);
        return R.ok();
    }
}
