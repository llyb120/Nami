//package com.beeasy.easyshop.ctrl;
//
//import com.alibaba.fastjson.Obj;
//import com.beeasy.easyshop.model.RaOrder;
//import com.beeasy.easyshop.model.RaOrderGoods;
//import com.github.llyb120.nami.core.Flow;
//
//import java.util.ArrayList;
//
//public class cart {
//
//    /**
//     * addressId:
//     * goods:
//     * [
//     *
//     * ]
//     */
//    public void test(
//        Obj body
//    ){
//        Flow.of(body)
//            //转换为商品
//            .map("goods", g -> {
//                return []
//            })
//            //商品分组
//            .map("goods", g -> {
//                return new ArrayList<>();
//            })
//            .each("goods")
//            //失败分类
//            .计算
//            .flow(RaOrder.class)
//            .flow(RaOrderGoods.class)
//
//            //订单
//            .flow(RaOrder.class)
//            //商品
//            .flow(RaOrderGoods.class)
//            .end()
//    }
//}
