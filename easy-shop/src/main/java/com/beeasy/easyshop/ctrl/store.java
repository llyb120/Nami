package com.beeasy.easyshop.ctrl;

import cn.hutool.core.img.ImgUtil;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.beeasy.easyshop.util.U;
import com.beeasy.easyshop.filter.auth;
import com.beeasy.easyshop.model.*;
import com.beeasy.web.core.Flow;
import com.beeasy.web.core.MultipartFile;
import com.beeasy.web.core.R;
import com.beeasy.web.core.boost.SqlBoost;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static com.beeasy.easyshop.util.U.*;
import static com.beeasy.web.core.Config.config;
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


    public R gallerylist(
        @SqlBoost(model = RaAlbumClass.class, appendField = "(select count(1) from ra_album_pic where aclass_id = b.aclass_id) as total") List<JSONObject> mylist){
       //只查我的店铺
        return R.ok(mylist);
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
                .updateSelective(o("aclass_id", dft.getAclass_id()));
        }
        sqlManager.deleteObject(gallery);
        return R.ok();
    }

    /**
     * 图片列表
     * @param aid
     * @param page
     * @param size
     * @return
     */
    public R piclist(String aid, Integer page, Integer size){
        if (page == null) {
            page = 1;
        }
        if (size == null) {
            size = 10;
        }
        return R.ok(sqlManager.lambdaQuery(RaAlbumPic.class)
            .andEq(RaAlbumPic::getStore_id, auth.getStoreId())
            .andEq(RaAlbumPic::getAclass_id, aid)
            .page(page, size));
    }


    /**
     * 设置封面
     * @param id
     * @param cover
     * @return
     */
    public R setgindex(String id, String cover){
        sqlManager.lambdaQuery(RaAlbumClass.class)
            .andEq(RaAlbumClass::getAclass_id, id)
            .andEq(RaAlbumClass::getStore_id, auth.getStoreId())
            .updateSelective(o("n_conver", cover));
        return R.ok();
    }

    /**
     * 上传图片
     * @param id
     * @param file
     * @return
     */
    public R uploadpic(int id, MultipartFile file) throws IOException {
        String name = U.fixFileName(file.fileName());
        File target = new File(config.uploadDir, name);
        file.transferTo(target);

        RaAlbumPic raAlbumPic = new RaAlbumPic();
        raAlbumPic.setAclass_id(id);
        raAlbumPic.setUpload_time((int) (System.currentTimeMillis() / 1000));
        raAlbumPic.setApic_name(file.fileName());
        raAlbumPic.setStore_id(Integer.parseInt(auth.getStoreId()));
        raAlbumPic.setN_cover(name);
        var img = ImgUtil.read(target);
        raAlbumPic.setApic_size((int) target.length());
        raAlbumPic.setApic_spec(img.getWidth() + "x" + img.getHeight());
        sqlManager.insert(raAlbumPic, true);
        return R.ok(raAlbumPic);
    }

    /**
     * 删除图片
     * @param id
     * @return
     */
    public R delpic(String[] id){
        sqlManager.lambdaQuery(RaAlbumPic.class)
            .andEq(RaAlbumPic::getStore_id, auth.getStoreId())
            .andIn(RaAlbumPic::getApic_id, Arrays.asList(id))
            .delete();
        return R.ok();
    }

    /**
     * 批量转移
     * @param id
     * @param target
     * @return
     */
    public R transformpic(String[] id, String target){
        //只能转移我的相册
        long count = sqlManager.lambdaQuery(RaAlbumClass.class)
            .andEq(RaAlbumClass::getStore_id, auth.getStoreId())
            .andEq(RaAlbumClass::getAclass_id, target)
            .count();
        if(count == 0){
            return R.fail("只能转移到自己的相册");
        }
        sqlManager.lambdaQuery(RaAlbumPic.class)
            .andEq(RaAlbumPic::getStore_id, auth.getStoreId())
            .andIn(RaAlbumPic::getApic_id, Arrays.asList(id))
            .updateSelective(o(
                "aclass_id", target
            ));
        return R.ok();
    }


    /**
     * 出售中的商品
     * @param query
     * @return
     */
    public R salelist(JSONObject query){
        query.put("store_id", auth.getStoreId());
        return R.ok(pageQuery("ra_goods_common.page", JSONObject.class, query));
    }


    /**
     * 查找分类
     * 分类是全部公开的，可以随意查询
     * @param pid
     * @return
     */
    public R getcat(){
        return R.ok(
            tree(
                sqlManager.lambdaQuery(RaGoodsClass.class)
                    .select(JSONObject.class), "gc_parent_id", "gc_id"
            )
        );
    }

    /**
     * 店铺退款查询
     * @param query
     * @return
     */
    public R refundlist(JSONObject query){
        query.put("store_id", auth.getStoreId());
        return R.ok(
          pageQuery("ra_refund_return.page", JSONObject.class, query)
        );
    }


}
