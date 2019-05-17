sample
===
* 注释

	select #use("cols")# from ra_waybill  where  #use("condition")#

cols
===
	waybill_id,waybill_name,waybill_image,waybill_width,waybill_height,waybill_data,waybill_usable,waybill_top,waybill_left,express_id,express_name,store_id

updateSample
===
	
	waybill_id=#waybillId#,waybill_name=#waybillName#,waybill_image=#waybillImage#,waybill_width=#waybillWidth#,waybill_height=#waybillHeight#,waybill_data=#waybillData#,waybill_usable=#waybillUsable#,waybill_top=#waybillTop#,waybill_left=#waybillLeft#,express_id=#expressId#,express_name=#expressName#,store_id=#storeId#

condition
===

	1 = 1  
	@if(!isEmpty(waybillId)){
	 and waybill_id=#waybillId#
	@}
	@if(!isEmpty(waybillName)){
	 and waybill_name=#waybillName#
	@}
	@if(!isEmpty(waybillImage)){
	 and waybill_image=#waybillImage#
	@}
	@if(!isEmpty(waybillWidth)){
	 and waybill_width=#waybillWidth#
	@}
	@if(!isEmpty(waybillHeight)){
	 and waybill_height=#waybillHeight#
	@}
	@if(!isEmpty(waybillData)){
	 and waybill_data=#waybillData#
	@}
	@if(!isEmpty(waybillUsable)){
	 and waybill_usable=#waybillUsable#
	@}
	@if(!isEmpty(waybillTop)){
	 and waybill_top=#waybillTop#
	@}
	@if(!isEmpty(waybillLeft)){
	 and waybill_left=#waybillLeft#
	@}
	@if(!isEmpty(expressId)){
	 and express_id=#expressId#
	@}
	@if(!isEmpty(expressName)){
	 and express_name=#expressName#
	@}
	@if(!isEmpty(storeId)){
	 and store_id=#storeId#
	@}
	
	