sample
===
* 注释

	select #use("cols")# from ra_goods_common  where  #use("condition")#

cols
===
	goods_commonid,goods_name,goods_jingle,gc_id,gc_id_1,gc_id_2,gc_id_3,gc_name,store_id,store_name,spec_name,spec_value,brand_id,brand_name,type_id,goods_image,goods_attr,goods_body,mobile_body,goods_state,goods_stateremark,goods_verify,goods_verifyremark,goods_lock,goods_addtime,goods_selltime,goods_specname,goods_price,goods_marketprice,goods_costprice,goods_discount,goods_serial,goods_storage_alarm,transport_id,transport_title,goods_commend,goods_freight,goods_vat,areaid_1,areaid_2,goods_stcids,plateid_top,plateid_bottom,is_virtual,virtual_indate,virtual_limit,virtual_invalid_refund,is_fcode,is_appoint,appoint_satedate,is_presell,presell_deliverdate,is_own_shop,tax,open_tax,gextends,sharp,weight,from_place,shenzhen_record_status,shenzhen_audit_status,trafMode,shipName,index_recommend,agree_distribute,distribute_rate,distribute_special,distribute_price,dis_inv_rate,dis_spec_rate,is_zhiyou,mao_weight,is_pull_kjy

updateSample
===
	
	goods_commonid=#goodsCommonid#,goods_name=#goodsName#,goods_jingle=#goodsJingle#,gc_id=#gcId#,gc_id_1=#gcId1#,gc_id_2=#gcId2#,gc_id_3=#gcId3#,gc_name=#gcName#,store_id=#storeId#,store_name=#storeName#,spec_name=#specName#,spec_value=#specValue#,brand_id=#brandId#,brand_name=#brandName#,type_id=#typeId#,goods_image=#goodsImage#,goods_attr=#goodsAttr#,goods_body=#goodsBody#,mobile_body=#mobileBody#,goods_state=#goodsState#,goods_stateremark=#goodsStateremark#,goods_verify=#goodsVerify#,goods_verifyremark=#goodsVerifyremark#,goods_lock=#goodsLock#,goods_addtime=#goodsAddtime#,goods_selltime=#goodsSelltime#,goods_specname=#goodsSpecname#,goods_price=#goodsPrice#,goods_marketprice=#goodsMarketprice#,goods_costprice=#goodsCostprice#,goods_discount=#goodsDiscount#,goods_serial=#goodsSerial#,goods_storage_alarm=#goodsStorageAlarm#,transport_id=#transportId#,transport_title=#transportTitle#,goods_commend=#goodsCommend#,goods_freight=#goodsFreight#,goods_vat=#goodsVat#,areaid_1=#areaid1#,areaid_2=#areaid2#,goods_stcids=#goodsStcids#,plateid_top=#plateidTop#,plateid_bottom=#plateidBottom#,is_virtual=#isVirtual#,virtual_indate=#virtualIndate#,virtual_limit=#virtualLimit#,virtual_invalid_refund=#virtualInvalidRefund#,is_fcode=#isFcode#,is_appoint=#isAppoint#,appoint_satedate=#appointSatedate#,is_presell=#isPresell#,presell_deliverdate=#presellDeliverdate#,is_own_shop=#isOwnShop#,tax=#tax#,open_tax=#openTax#,gextends=#gextends#,sharp=#sharp#,weight=#weight#,from_place=#fromPlace#,shenzhen_record_status=#shenzhenRecordStatus#,shenzhen_audit_status=#shenzhenAuditStatus#,trafMode=#trafmode#,shipName=#shipname#,index_recommend=#indexRecommend#,agree_distribute=#agreeDistribute#,distribute_rate=#distributeRate#,distribute_special=#distributeSpecial#,distribute_price=#distributePrice#,dis_inv_rate=#disInvRate#,dis_spec_rate=#disSpecRate#,is_zhiyou=#isZhiyou#,mao_weight=#maoWeight#,is_pull_kjy=#isPullKjy#

condition
===

	1 = 1  
	@if(!isEmpty(goodsCommonid)){
	 and goods_commonid=#goodsCommonid#
	@}
	@if(!isEmpty(goodsName)){
	 and goods_name=#goodsName#
	@}
	@if(!isEmpty(goodsJingle)){
	 and goods_jingle=#goodsJingle#
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
	@if(!isEmpty(gcName)){
	 and gc_name=#gcName#
	@}
	@if(!isEmpty(storeId)){
	 and store_id=#storeId#
	@}
	@if(!isEmpty(storeName)){
	 and store_name=#storeName#
	@}
	@if(!isEmpty(specName)){
	 and spec_name=#specName#
	@}
	@if(!isEmpty(specValue)){
	 and spec_value=#specValue#
	@}
	@if(!isEmpty(brandId)){
	 and brand_id=#brandId#
	@}
	@if(!isEmpty(brandName)){
	 and brand_name=#brandName#
	@}
	@if(!isEmpty(typeId)){
	 and type_id=#typeId#
	@}
	@if(!isEmpty(goodsImage)){
	 and goods_image=#goodsImage#
	@}
	@if(!isEmpty(goodsAttr)){
	 and goods_attr=#goodsAttr#
	@}
	@if(!isEmpty(goodsBody)){
	 and goods_body=#goodsBody#
	@}
	@if(!isEmpty(mobileBody)){
	 and mobile_body=#mobileBody#
	@}
	@if(!isEmpty(goodsState)){
	 and goods_state=#goodsState#
	@}
	@if(!isEmpty(goodsStateremark)){
	 and goods_stateremark=#goodsStateremark#
	@}
	@if(!isEmpty(goodsVerify)){
	 and goods_verify=#goodsVerify#
	@}
	@if(!isEmpty(goodsVerifyremark)){
	 and goods_verifyremark=#goodsVerifyremark#
	@}
	@if(!isEmpty(goodsLock)){
	 and goods_lock=#goodsLock#
	@}
	@if(!isEmpty(goodsAddtime)){
	 and goods_addtime=#goodsAddtime#
	@}
	@if(!isEmpty(goodsSelltime)){
	 and goods_selltime=#goodsSelltime#
	@}
	@if(!isEmpty(goodsSpecname)){
	 and goods_specname=#goodsSpecname#
	@}
	@if(!isEmpty(goodsPrice)){
	 and goods_price=#goodsPrice#
	@}
	@if(!isEmpty(goodsMarketprice)){
	 and goods_marketprice=#goodsMarketprice#
	@}
	@if(!isEmpty(goodsCostprice)){
	 and goods_costprice=#goodsCostprice#
	@}
	@if(!isEmpty(goodsDiscount)){
	 and goods_discount=#goodsDiscount#
	@}
	@if(!isEmpty(goodsSerial)){
	 and goods_serial=#goodsSerial#
	@}
	@if(!isEmpty(goodsStorageAlarm)){
	 and goods_storage_alarm=#goodsStorageAlarm#
	@}
	@if(!isEmpty(transportId)){
	 and transport_id=#transportId#
	@}
	@if(!isEmpty(transportTitle)){
	 and transport_title=#transportTitle#
	@}
	@if(!isEmpty(goodsCommend)){
	 and goods_commend=#goodsCommend#
	@}
	@if(!isEmpty(goodsFreight)){
	 and goods_freight=#goodsFreight#
	@}
	@if(!isEmpty(goodsVat)){
	 and goods_vat=#goodsVat#
	@}
	@if(!isEmpty(areaid1)){
	 and areaid_1=#areaid1#
	@}
	@if(!isEmpty(areaid2)){
	 and areaid_2=#areaid2#
	@}
	@if(!isEmpty(goodsStcids)){
	 and goods_stcids=#goodsStcids#
	@}
	@if(!isEmpty(plateidTop)){
	 and plateid_top=#plateidTop#
	@}
	@if(!isEmpty(plateidBottom)){
	 and plateid_bottom=#plateidBottom#
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
	@if(!isEmpty(appointSatedate)){
	 and appoint_satedate=#appointSatedate#
	@}
	@if(!isEmpty(isPresell)){
	 and is_presell=#isPresell#
	@}
	@if(!isEmpty(presellDeliverdate)){
	 and presell_deliverdate=#presellDeliverdate#
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
	@if(!isEmpty(gextends)){
	 and gextends=#gextends#
	@}
	@if(!isEmpty(sharp)){
	 and sharp=#sharp#
	@}
	@if(!isEmpty(weight)){
	 and weight=#weight#
	@}
	@if(!isEmpty(fromPlace)){
	 and from_place=#fromPlace#
	@}
	@if(!isEmpty(shenzhenRecordStatus)){
	 and shenzhen_record_status=#shenzhenRecordStatus#
	@}
	@if(!isEmpty(shenzhenAuditStatus)){
	 and shenzhen_audit_status=#shenzhenAuditStatus#
	@}
	@if(!isEmpty(trafmode)){
	 and trafMode=#trafmode#
	@}
	@if(!isEmpty(shipname)){
	 and shipName=#shipname#
	@}
	@if(!isEmpty(indexRecommend)){
	 and index_recommend=#indexRecommend#
	@}
	@if(!isEmpty(agreeDistribute)){
	 and agree_distribute=#agreeDistribute#
	@}
	@if(!isEmpty(distributeRate)){
	 and distribute_rate=#distributeRate#
	@}
	@if(!isEmpty(distributeSpecial)){
	 and distribute_special=#distributeSpecial#
	@}
	@if(!isEmpty(distributePrice)){
	 and distribute_price=#distributePrice#
	@}
	@if(!isEmpty(disInvRate)){
	 and dis_inv_rate=#disInvRate#
	@}
	@if(!isEmpty(disSpecRate)){
	 and dis_spec_rate=#disSpecRate#
	@}
	@if(!isEmpty(isZhiyou)){
	 and is_zhiyou=#isZhiyou#
	@}
	@if(!isEmpty(maoWeight)){
	 and mao_weight=#maoWeight#
	@}
	@if(!isEmpty(isPullKjy)){
	 and is_pull_kjy=#isPullKjy#
	@}
	
	