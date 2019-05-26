page
===
select 
@pageTag(){
#use("cols")#
@} 
from ra_goods_common  where  #use("condition")#

cols
===
	goods_commonid,goods_name,goods_jingle,gc_id,gc_id_1,gc_id_2,gc_id_3,gc_name,store_id,store_name,spec_name,spec_value,brand_id,brand_name,type_id,goods_image,goods_attr,goods_body,mobile_body,goods_state,goods_stateremark,goods_verify,goods_verifyremark,goods_lock,goods_addtime,goods_selltime,goods_specname,goods_price,goods_marketprice,goods_costprice,goods_discount,goods_serial,goods_storage_alarm,transport_id,transport_title,goods_commend,goods_freight,goods_vat,areaid_1,areaid_2,goods_stcids,plateid_top,plateid_bottom,is_virtual,virtual_indate,virtual_limit,virtual_invalid_refund,is_fcode,is_appoint,appoint_satedate,is_presell,presell_deliverdate,is_own_shop,tax,open_tax,gextends,sharp,weight,from_place,shenzhen_record_status,shenzhen_audit_status,trafMode,shipName,index_recommend,agree_distribute,distribute_rate,distribute_special,distribute_price,dis_inv_rate,dis_spec_rate,is_zhiyou,mao_weight,is_pull_kjy

updateSample
===
	
	goods_commonid=#goods_commonid#,goods_name=#goods_name#,goods_jingle=#goods_jingle#,gc_id=#gc_id#,gc_id_1=#gc_id_1#,gc_id_2=#gc_id_2#,gc_id_3=#gc_id_3#,gc_name=#gc_name#,store_id=#store_id#,store_name=#store_name#,spec_name=#spec_name#,spec_value=#spec_value#,brand_id=#brand_id#,brand_name=#brand_name#,type_id=#type_id#,goods_image=#goods_image#,goods_attr=#goods_attr#,goods_body=#goods_body#,mobile_body=#mobile_body#,goods_state=#goods_state#,goods_stateremark=#goods_stateremark#,goods_verify=#goods_verify#,goods_verifyremark=#goods_verifyremark#,goods_lock=#goods_lock#,goods_addtime=#goods_addtime#,goods_selltime=#goods_selltime#,goods_specname=#goods_specname#,goods_price=#goods_price#,goods_marketprice=#goods_marketprice#,goods_costprice=#goods_costprice#,goods_discount=#goods_discount#,goods_serial=#goods_serial#,goods_storage_alarm=#goods_storage_alarm#,transport_id=#transport_id#,transport_title=#transport_title#,goods_commend=#goods_commend#,goods_freight=#goods_freight#,goods_vat=#goods_vat#,areaid_1=#areaid_1#,areaid_2=#areaid_2#,goods_stcids=#goods_stcids#,plateid_top=#plateid_top#,plateid_bottom=#plateid_bottom#,is_virtual=#is_virtual#,virtual_indate=#virtual_indate#,virtual_limit=#virtual_limit#,virtual_invalid_refund=#virtual_invalid_refund#,is_fcode=#is_fcode#,is_appoint=#is_appoint#,appoint_satedate=#appoint_satedate#,is_presell=#is_presell#,presell_deliverdate=#presell_deliverdate#,is_own_shop=#is_own_shop#,tax=#tax#,open_tax=#open_tax#,gextends=#gextends#,sharp=#sharp#,weight=#weight#,from_place=#from_place#,shenzhen_record_status=#shenzhen_record_status#,shenzhen_audit_status=#shenzhen_audit_status#,trafMode=#trafmode#,shipName=#shipname#,index_recommend=#index_recommend#,agree_distribute=#agree_distribute#,distribute_rate=#distribute_rate#,distribute_special=#distribute_special#,distribute_price=#distribute_price#,dis_inv_rate=#dis_inv_rate#,dis_spec_rate=#dis_spec_rate#,is_zhiyou=#is_zhiyou#,mao_weight=#mao_weight#,is_pull_kjy=#is_pull_kjy#

condition
===

	1 = 1  
	@if(!isEmpty(goods_commonid)){
	 and goods_commonid=#goods_commonid#
	@}
	@if(!isEmpty(goods_name)){
	 and goods_name=#goods_name#
	@}
	@if(!isEmpty(goods_jingle)){
	 and goods_jingle=#goods_jingle#
	@}
	@if(!isEmpty(gc_id)){
	 and gc_id=#gc_id#
	@}
	@if(!isEmpty(gc_id_1)){
	 and gc_id_1=#gc_id_1#
	@}
	@if(!isEmpty(gc_id_2)){
	 and gc_id_2=#gc_id_2#
	@}
	@if(!isEmpty(gc_id_3)){
	 and gc_id_3=#gc_id_3#
	@}
	@if(!isEmpty(gc_name)){
	 and gc_name=#gc_name#
	@}
	@if(!isEmpty(store_id)){
	 and store_id=#store_id#
	@}
	@if(!isEmpty(store_name)){
	 and store_name=#store_name#
	@}
	@if(!isEmpty(spec_name)){
	 and spec_name=#spec_name#
	@}
	@if(!isEmpty(spec_value)){
	 and spec_value=#spec_value#
	@}
	@if(!isEmpty(brand_id)){
	 and brand_id=#brand_id#
	@}
	@if(!isEmpty(brand_name)){
	 and brand_name=#brand_name#
	@}
	@if(!isEmpty(type_id)){
	 and type_id=#type_id#
	@}
	@if(!isEmpty(goods_image)){
	 and goods_image=#goods_image#
	@}
	@if(!isEmpty(goods_attr)){
	 and goods_attr=#goods_attr#
	@}
	@if(!isEmpty(goods_body)){
	 and goods_body=#goods_body#
	@}
	@if(!isEmpty(mobile_body)){
	 and mobile_body=#mobile_body#
	@}
	@if(!isEmpty(goods_state)){
	 and goods_state=#goods_state#
	@}
	@if(!isEmpty(goods_stateremark)){
	 and goods_stateremark=#goods_stateremark#
	@}
	@if(!isEmpty(goods_verify)){
	 and goods_verify=#goods_verify#
	@}
	@if(!isEmpty(goods_verifyremark)){
	 and goods_verifyremark=#goods_verifyremark#
	@}
	@if(!isEmpty(goods_lock)){
	 and goods_lock=#goods_lock#
	@}
	@if(!isEmpty(goods_addtime)){
	 and goods_addtime=#goods_addtime#
	@}
	@if(!isEmpty(goods_selltime)){
	 and goods_selltime=#goods_selltime#
	@}
	@if(!isEmpty(goods_specname)){
	 and goods_specname=#goods_specname#
	@}
	@if(!isEmpty(goods_price)){
	 and goods_price=#goods_price#
	@}
	@if(!isEmpty(goods_marketprice)){
	 and goods_marketprice=#goods_marketprice#
	@}
	@if(!isEmpty(goods_costprice)){
	 and goods_costprice=#goods_costprice#
	@}
	@if(!isEmpty(goods_discount)){
	 and goods_discount=#goods_discount#
	@}
	@if(!isEmpty(goods_serial)){
	 and goods_serial=#goods_serial#
	@}
	@if(!isEmpty(goods_storage_alarm)){
	 and goods_storage_alarm=#goods_storage_alarm#
	@}
	@if(!isEmpty(transport_id)){
	 and transport_id=#transport_id#
	@}
	@if(!isEmpty(transport_title)){
	 and transport_title=#transport_title#
	@}
	@if(!isEmpty(goods_commend)){
	 and goods_commend=#goods_commend#
	@}
	@if(!isEmpty(goods_freight)){
	 and goods_freight=#goods_freight#
	@}
	@if(!isEmpty(goods_vat)){
	 and goods_vat=#goods_vat#
	@}
	@if(!isEmpty(areaid_1)){
	 and areaid_1=#areaid_1#
	@}
	@if(!isEmpty(areaid_2)){
	 and areaid_2=#areaid_2#
	@}
	@if(!isEmpty(goods_stcids)){
	 and goods_stcids=#goods_stcids#
	@}
	@if(!isEmpty(plateid_top)){
	 and plateid_top=#plateid_top#
	@}
	@if(!isEmpty(plateid_bottom)){
	 and plateid_bottom=#plateid_bottom#
	@}
	@if(!isEmpty(is_virtual)){
	 and is_virtual=#is_virtual#
	@}
	@if(!isEmpty(virtual_indate)){
	 and virtual_indate=#virtual_indate#
	@}
	@if(!isEmpty(virtual_limit)){
	 and virtual_limit=#virtual_limit#
	@}
	@if(!isEmpty(virtual_invalid_refund)){
	 and virtual_invalid_refund=#virtual_invalid_refund#
	@}
	@if(!isEmpty(is_fcode)){
	 and is_fcode=#is_fcode#
	@}
	@if(!isEmpty(is_appoint)){
	 and is_appoint=#is_appoint#
	@}
	@if(!isEmpty(appoint_satedate)){
	 and appoint_satedate=#appoint_satedate#
	@}
	@if(!isEmpty(is_presell)){
	 and is_presell=#is_presell#
	@}
	@if(!isEmpty(presell_deliverdate)){
	 and presell_deliverdate=#presell_deliverdate#
	@}
	@if(!isEmpty(is_own_shop)){
	 and is_own_shop=#is_own_shop#
	@}
	@if(!isEmpty(tax)){
	 and tax=#tax#
	@}
	@if(!isEmpty(open_tax)){
	 and open_tax=#open_tax#
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
	@if(!isEmpty(from_place)){
	 and from_place=#from_place#
	@}
	@if(!isEmpty(shenzhen_record_status)){
	 and shenzhen_record_status=#shenzhen_record_status#
	@}
	@if(!isEmpty(shenzhen_audit_status)){
	 and shenzhen_audit_status=#shenzhen_audit_status#
	@}
	@if(!isEmpty(trafmode)){
	 and trafMode=#trafmode#
	@}
	@if(!isEmpty(shipname)){
	 and shipName=#shipname#
	@}
	@if(!isEmpty(index_recommend)){
	 and index_recommend=#index_recommend#
	@}
	@if(!isEmpty(agree_distribute)){
	 and agree_distribute=#agree_distribute#
	@}
	@if(!isEmpty(distribute_rate)){
	 and distribute_rate=#distribute_rate#
	@}
	@if(!isEmpty(distribute_special)){
	 and distribute_special=#distribute_special#
	@}
	@if(!isEmpty(distribute_price)){
	 and distribute_price=#distribute_price#
	@}
	@if(!isEmpty(dis_inv_rate)){
	 and dis_inv_rate=#dis_inv_rate#
	@}
	@if(!isEmpty(dis_spec_rate)){
	 and dis_spec_rate=#dis_spec_rate#
	@}
	@if(!isEmpty(is_zhiyou)){
	 and is_zhiyou=#is_zhiyou#
	@}
	@if(!isEmpty(mao_weight)){
	 and mao_weight=#mao_weight#
	@}
	@if(!isEmpty(is_pull_kjy)){
	 and is_pull_kjy=#is_pull_kjy#
	@}
	
	