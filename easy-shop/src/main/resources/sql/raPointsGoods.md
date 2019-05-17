sample
===
* 注释

	select #use("cols")# from ra_points_goods  where  #use("condition")#

cols
===
	pgoods_id,pgoods_name,pgoods_price,pgoods_points,pgoods_image,pgoods_tag,pgoods_serial,pgoods_storage,pgoods_show,pgoods_commend,pgoods_add_time,pgoods_keywords,pgoods_description,pgoods_body,pgoods_state,pgoods_close_reason,pgoods_salenum,pgoods_view,pgoods_islimit,pgoods_limitnum,pgoods_islimittime,pgoods_limitmgrade,pgoods_starttime,pgoods_endtime,pgoods_sort

updateSample
===
	
	pgoods_id=#pgoodsId#,pgoods_name=#pgoodsName#,pgoods_price=#pgoodsPrice#,pgoods_points=#pgoodsPoints#,pgoods_image=#pgoodsImage#,pgoods_tag=#pgoodsTag#,pgoods_serial=#pgoodsSerial#,pgoods_storage=#pgoodsStorage#,pgoods_show=#pgoodsShow#,pgoods_commend=#pgoodsCommend#,pgoods_add_time=#pgoodsAddTime#,pgoods_keywords=#pgoodsKeywords#,pgoods_description=#pgoodsDescription#,pgoods_body=#pgoodsBody#,pgoods_state=#pgoodsState#,pgoods_close_reason=#pgoodsCloseReason#,pgoods_salenum=#pgoodsSalenum#,pgoods_view=#pgoodsView#,pgoods_islimit=#pgoodsIslimit#,pgoods_limitnum=#pgoodsLimitnum#,pgoods_islimittime=#pgoodsIslimittime#,pgoods_limitmgrade=#pgoodsLimitmgrade#,pgoods_starttime=#pgoodsStarttime#,pgoods_endtime=#pgoodsEndtime#,pgoods_sort=#pgoodsSort#

condition
===

	1 = 1  
	@if(!isEmpty(pgoodsId)){
	 and pgoods_id=#pgoodsId#
	@}
	@if(!isEmpty(pgoodsName)){
	 and pgoods_name=#pgoodsName#
	@}
	@if(!isEmpty(pgoodsPrice)){
	 and pgoods_price=#pgoodsPrice#
	@}
	@if(!isEmpty(pgoodsPoints)){
	 and pgoods_points=#pgoodsPoints#
	@}
	@if(!isEmpty(pgoodsImage)){
	 and pgoods_image=#pgoodsImage#
	@}
	@if(!isEmpty(pgoodsTag)){
	 and pgoods_tag=#pgoodsTag#
	@}
	@if(!isEmpty(pgoodsSerial)){
	 and pgoods_serial=#pgoodsSerial#
	@}
	@if(!isEmpty(pgoodsStorage)){
	 and pgoods_storage=#pgoodsStorage#
	@}
	@if(!isEmpty(pgoodsShow)){
	 and pgoods_show=#pgoodsShow#
	@}
	@if(!isEmpty(pgoodsCommend)){
	 and pgoods_commend=#pgoodsCommend#
	@}
	@if(!isEmpty(pgoodsAddTime)){
	 and pgoods_add_time=#pgoodsAddTime#
	@}
	@if(!isEmpty(pgoodsKeywords)){
	 and pgoods_keywords=#pgoodsKeywords#
	@}
	@if(!isEmpty(pgoodsDescription)){
	 and pgoods_description=#pgoodsDescription#
	@}
	@if(!isEmpty(pgoodsBody)){
	 and pgoods_body=#pgoodsBody#
	@}
	@if(!isEmpty(pgoodsState)){
	 and pgoods_state=#pgoodsState#
	@}
	@if(!isEmpty(pgoodsCloseReason)){
	 and pgoods_close_reason=#pgoodsCloseReason#
	@}
	@if(!isEmpty(pgoodsSalenum)){
	 and pgoods_salenum=#pgoodsSalenum#
	@}
	@if(!isEmpty(pgoodsView)){
	 and pgoods_view=#pgoodsView#
	@}
	@if(!isEmpty(pgoodsIslimit)){
	 and pgoods_islimit=#pgoodsIslimit#
	@}
	@if(!isEmpty(pgoodsLimitnum)){
	 and pgoods_limitnum=#pgoodsLimitnum#
	@}
	@if(!isEmpty(pgoodsIslimittime)){
	 and pgoods_islimittime=#pgoodsIslimittime#
	@}
	@if(!isEmpty(pgoodsLimitmgrade)){
	 and pgoods_limitmgrade=#pgoodsLimitmgrade#
	@}
	@if(!isEmpty(pgoodsStarttime)){
	 and pgoods_starttime=#pgoodsStarttime#
	@}
	@if(!isEmpty(pgoodsEndtime)){
	 and pgoods_endtime=#pgoodsEndtime#
	@}
	@if(!isEmpty(pgoodsSort)){
	 and pgoods_sort=#pgoodsSort#
	@}
	
	