sample
===
* 注释

	select #use("cols")# from ra_goods  where  #use("condition")#

cols
===
	goods_id,goods_commonid,goods_name,goods_jingle,store_id,store_name,gc_id,gc_id_1,gc_id_2,gc_id_3,brand_id,goods_price,goods_promotion_price,goods_promotion_type,goods_marketprice,goods_serial,goods_storage_alarm,goods_click,goods_salenum,goods_collect,goods_spec,goods_storage,goods_image,goods_state,goods_verify,goods_addtime,goods_edittime,areaid_1,areaid_2,color_id,transport_id,goods_freight,goods_vat,goods_commend,goods_stcids,evaluation_good_star,evaluation_count,is_virtual,virtual_indate,virtual_limit,virtual_invalid_refund,is_fcode,is_appoint,is_presell,have_gift,is_own_shop,tax,open_tax,proxy_factor,proxy_gold_formula,gextends,sharp,link_goods,spec_name,whole_min,whole_price,is_whole

updateSample
===
	
	goods_id=#goodsId#,goods_commonid=#goodsCommonid#,goods_name=#goodsName#,goods_jingle=#goodsJingle#,store_id=#storeId#,store_name=#storeName#,gc_id=#gcId#,gc_id_1=#gcId1#,gc_id_2=#gcId2#,gc_id_3=#gcId3#,brand_id=#brandId#,goods_price=#goodsPrice#,goods_promotion_price=#goodsPromotionPrice#,goods_promotion_type=#goodsPromotionType#,goods_marketprice=#goodsMarketprice#,goods_serial=#goodsSerial#,goods_storage_alarm=#goodsStorageAlarm#,goods_click=#goodsClick#,goods_salenum=#goodsSalenum#,goods_collect=#goodsCollect#,goods_spec=#goodsSpec#,goods_storage=#goodsStorage#,goods_image=#goodsImage#,goods_state=#goodsState#,goods_verify=#goodsVerify#,goods_addtime=#goodsAddtime#,goods_edittime=#goodsEdittime#,areaid_1=#areaid1#,areaid_2=#areaid2#,color_id=#colorId#,transport_id=#transportId#,goods_freight=#goodsFreight#,goods_vat=#goodsVat#,goods_commend=#goodsCommend#,goods_stcids=#goodsStcids#,evaluation_good_star=#evaluationGoodStar#,evaluation_count=#evaluationCount#,is_virtual=#isVirtual#,virtual_indate=#virtualIndate#,virtual_limit=#virtualLimit#,virtual_invalid_refund=#virtualInvalidRefund#,is_fcode=#isFcode#,is_appoint=#isAppoint#,is_presell=#isPresell#,have_gift=#haveGift#,is_own_shop=#isOwnShop#,tax=#tax#,open_tax=#openTax#,proxy_factor=#proxyFactor#,proxy_gold_formula=#proxyGoldFormula#,gextends=#gextends#,sharp=#sharp#,link_goods=#linkGoods#,spec_name=#specName#,whole_min=#wholeMin#,whole_price=#wholePrice#,is_whole=#isWhole#

condition
===

	1 = 1  
	@if(!isEmpty(goodsId)){
	 and goods_id=#goodsId#
	@}
	@if(!isEmpty(goodsCommonid)){
	 and goods_commonid=#goodsCommonid#
	@}
	@if(!isEmpty(goodsName)){
	 and goods_name=#goodsName#
	@}
	@if(!isEmpty(goodsJingle)){
	 and goods_jingle=#goodsJingle#
	@}
	@if(!isEmpty(storeId)){
	 and store_id=#storeId#
	@}
	@if(!isEmpty(storeName)){
	 and store_name=#storeName#
	@}
	@if(!isEmpty(gcId)){
	 and gc_id=#gcId#
	@}
	@if(!isEmpty(gcId1)){
	 and gc_id_1=#gcId1#
	@}
	@if(!isEmpty(gcId2)){
	 and gc_id_2=#gcId2#
	@}
	@if(!isEmpty(gcId3)){
	 and gc_id_3=#gcId3#
	@}
	@if(!isEmpty(brandId)){
	 and brand_id=#brandId#
	@}
	@if(!isEmpty(goodsPrice)){
	 and goods_price=#goodsPrice#
	@}
	@if(!isEmpty(goodsPromotionPrice)){
	 and goods_promotion_price=#goodsPromotionPrice#
	@}
	@if(!isEmpty(goodsPromotionType)){
	 and goods_promotion_type=#goodsPromotionType#
	@}
	@if(!isEmpty(goodsMarketprice)){
	 and goods_marketprice=#goodsMarketprice#
	@}
	@if(!isEmpty(goodsSerial)){
	 and goods_serial=#goodsSerial#
	@}
	@if(!isEmpty(goodsStorageAlarm)){
	 and goods_storage_alarm=#goodsStorageAlarm#
	@}
	@if(!isEmpty(goodsClick)){
	 and goods_click=#goodsClick#
	@}
	@if(!isEmpty(goodsSalenum)){
	 and goods_salenum=#goodsSalenum#
	@}
	@if(!isEmpty(goodsCollect)){
	 and goods_collect=#goodsCollect#
	@}
	@if(!isEmpty(goodsSpec)){
	 and goods_spec=#goodsSpec#
	@}
	@if(!isEmpty(goodsStorage)){
	 and goods_storage=#goodsStorage#
	@}
	@if(!isEmpty(goodsImage)){
	 and goods_image=#goodsImage#
	@}
	@if(!isEmpty(goodsState)){
	 and goods_state=#goodsState#
	@}
	@if(!isEmpty(goodsVerify)){
	 and goods_verify=#goodsVerify#
	@}
	@if(!isEmpty(goodsAddtime)){
	 and goods_addtime=#goodsAddtime#
	@}
	@if(!isEmpty(goodsEdittime)){
	 and goods_edittime=#goodsEdittime#
	@}
	@if(!isEmpty(areaid1)){
	 and areaid_1=#areaid1#
	@}
	@if(!isEmpty(areaid2)){
	 and areaid_2=#areaid2#
	@}
	@if(!isEmpty(colorId)){
	 and color_id=#colorId#
	@}
	@if(!isEmpty(transportId)){
	 and transport_id=#transportId#
	@}
	@if(!isEmpty(goodsFreight)){
	 and goods_freight=#goodsFreight#
	@}
	@if(!isEmpty(goodsVat)){
	 and goods_vat=#goodsVat#
	@}
	@if(!isEmpty(goodsCommend)){
	 and goods_commend=#goodsCommend#
	@}
	@if(!isEmpty(goodsStcids)){
	 and goods_stcids=#goodsStcids#
	@}
	@if(!isEmpty(evaluationGoodStar)){
	 and evaluation_good_star=#evaluationGoodStar#
	@}
	@if(!isEmpty(evaluationCount)){
	 and evaluation_count=#evaluationCount#
	@}
	@if(!isEmpty(isVirtual)){
	 and is_virtual=#isVirtual#
	@}
	@if(!isEmpty(virtualIndate)){
	 and virtual_indate=#virtualIndate#
	@}
	@if(!isEmpty(virtualLimit)){
	 and virtual_limit=#virtualLimit#
	@}
	@if(!isEmpty(virtualInvalidRefund)){
	 and virtual_invalid_refund=#virtualInvalidRefund#
	@}
	@if(!isEmpty(isFcode)){
	 and is_fcode=#isFcode#
	@}
	@if(!isEmpty(isAppoint)){
	 and is_appoint=#isAppoint#
	@}
	@if(!isEmpty(isPresell)){
	 and is_presell=#isPresell#
	@}
	@if(!isEmpty(haveGift)){
	 and have_gift=#haveGift#
	@}
	@if(!isEmpty(isOwnShop)){
	 and is_own_shop=#isOwnShop#
	@}
	@if(!isEmpty(tax)){
	 and tax=#tax#
	@}
	@if(!isEmpty(openTax)){
	 and open_tax=#openTax#
	@}
	@if(!isEmpty(proxyFactor)){
	 and proxy_factor=#proxyFactor#
	@}
	@if(!isEmpty(proxyGoldFormula)){
	 and proxy_gold_formula=#proxyGoldFormula#
	@}
	@if(!isEmpty(gextends)){
	 and gextends=#gextends#
	@}
	@if(!isEmpty(sharp)){
	 and sharp=#sharp#
	@}
	@if(!isEmpty(linkGoods)){
	 and link_goods=#linkGoods#
	@}
	@if(!isEmpty(specName)){
	 and spec_name=#specName#
	@}
	@if(!isEmpty(wholeMin)){
	 and whole_min=#wholeMin#
	@}
	@if(!isEmpty(wholePrice)){
	 and whole_price=#wholePrice#
	@}
	@if(!isEmpty(isWhole)){
	 and is_whole=#isWhole#
	@}
	
	