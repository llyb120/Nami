sample
===
* 注释

	select #use("cols")# from ra_store_waybill  where  #use("condition")#

cols
===
	store_waybill_id,store_id,express_id,waybill_id,waybill_name,store_waybill_data,is_default,store_waybill_left,store_waybill_top

updateSample
===
	
	store_waybill_id=#storeWaybillId#,store_id=#storeId#,express_id=#expressId#,waybill_id=#waybillId#,waybill_name=#waybillName#,store_waybill_data=#storeWaybillData#,is_default=#isDefault#,store_waybill_left=#storeWaybillLeft#,store_waybill_top=#storeWaybillTop#

condition
===

	1 = 1  
	@if(!isEmpty(storeWaybillId)){
	 and store_waybill_id=#storeWaybillId#
	@}
	@if(!isEmpty(storeId)){
	 and store_id=#storeId#
	@}
	@if(!isEmpty(expressId)){
	 and express_id=#expressId#
	@}
	@if(!isEmpty(waybillId)){
	 and waybill_id=#waybillId#
	@}
	@if(!isEmpty(waybillName)){
	 and waybill_name=#waybillName#
	@}
	@if(!isEmpty(storeWaybillData)){
	 and store_waybill_data=#storeWaybillData#
	@}
	@if(!isEmpty(isDefault)){
	 and is_default=#isDefault#
	@}
	@if(!isEmpty(storeWaybillLeft)){
	 and store_waybill_left=#storeWaybillLeft#
	@}
	@if(!isEmpty(storeWaybillTop)){
	 and store_waybill_top=#storeWaybillTop#
	@}
	
	