package com.beeasy.easyshop.ctrl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.beeasy.easyshop.U;
import com.beeasy.easyshop.filter.auth;
import com.beeasy.easyshop.model.*;
import com.beeasy.web.core.Flow;
import com.beeasy.web.core.R;

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
                RaStore::getStoreQq,
                RaStore::getStoreZy,
                RaStore::getStoreWw,
                RaStore::getStorePhone,
                RaStore::getStoreKeywords,
                RaStore::getStoreDescription,
                RaStore::getnLogo,
                RaStore::getnAvatar,
                RaStore::getnBanner
            );
        // TODO: 2019/5/16 参数必须校验
        //只能更新我自己的店铺
        sqlManager.lambdaQuery(RaStore.class)
            .andEq(RaStore::getStoreId, auth.getStoreId())
            .updateSelective(body);
        return R.ok(true);
    }


    public R orderlist(JSONObject query) {
        //只查我店铺的订单
        query.put("storeId", auth.getStoreId());
        var pq = U.pageQuery("raOrder.店铺订单查询", JSONObject.class, query);
        if (pq.getTotalRow() > 0) {

            //查询订单相关的商品
            var map = new JSONObject();
            for (JSONObject object : pq.getList()) {
                map.put(object.getString("orderId"), object);
                object.put("goods", new JSONArray());
            }
            var ogs = sqlManager.lambdaQuery(RaOrderGoods.class)
                .andIn(RaOrderGoods::getOrderId, map.keySet())
                .select();
            for (RaOrderGoods og : ogs) {
                map.getJSONObject(og.getOrderId() + "").getJSONArray("goods").add(og);
            }
        }
        return R.ok(pq);
    }
}
