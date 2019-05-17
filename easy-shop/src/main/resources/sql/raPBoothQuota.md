sample
===
* 注释

	select #use("cols")# from ra_p_booth_quota  where  #use("condition")#

cols
===
	booth_quota_id,store_id,store_name,booth_quota_starttime,booth_quota_endtime,booth_state

updateSample
===
	
	booth_quota_id=#boothQuotaId#,store_id=#storeId#,store_name=#storeName#,booth_quota_starttime=#boothQuotaStarttime#,booth_quota_endtime=#boothQuotaEndtime#,booth_state=#boothState#

condition
===

	1 = 1  
	@if(!isEmpty(boothQuotaId)){
	 and booth_quota_id=#boothQuotaId#
	@}
	@if(!isEmpty(storeId)){
	 and store_id=#storeId#
	@}
	@if(!isEmpty(storeName)){
	 and store_name=#storeName#
	@}
	@if(!isEmpty(boothQuotaStarttime)){
	 and booth_quota_starttime=#boothQuotaStarttime#
	@}
	@if(!isEmpty(boothQuotaEndtime)){
	 and booth_quota_endtime=#boothQuotaEndtime#
	@}
	@if(!isEmpty(boothState)){
	 and booth_state=#boothState#
	@}
	
	