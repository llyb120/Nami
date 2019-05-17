sample
===
* 注释

	select #use("cols")# from ra_offpay_area  where  #use("condition")#

cols
===
	store_id,area_id

updateSample
===
	
	store_id=#storeId#,area_id=#areaId#

condition
===

	1 = 1  
	@if(!isEmpty(storeId)){
	 and store_id=#storeId#
	@}
	@if(!isEmpty(areaId)){
	 and area_id=#areaId#
	@}
	
	