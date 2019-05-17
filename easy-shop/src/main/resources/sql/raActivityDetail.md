sample
===
* 注释

	select #use("cols")# from ra_activity_detail  where  #use("condition")#

cols
===
	activity_detail_id,activity_id,item_id,item_name,store_id,store_name,activity_detail_state,activity_detail_sort

updateSample
===
	
	activity_detail_id=#activityDetailId#,activity_id=#activityId#,item_id=#itemId#,item_name=#itemName#,store_id=#storeId#,store_name=#storeName#,activity_detail_state=#activityDetailState#,activity_detail_sort=#activityDetailSort#

condition
===

	1 = 1  
	@if(!isEmpty(activityDetailId)){
	 and activity_detail_id=#activityDetailId#
	@}
	@if(!isEmpty(activityId)){
	 and activity_id=#activityId#
	@}
	@if(!isEmpty(itemId)){
	 and item_id=#itemId#
	@}
	@if(!isEmpty(itemName)){
	 and item_name=#itemName#
	@}
	@if(!isEmpty(storeId)){
	 and store_id=#storeId#
	@}
	@if(!isEmpty(storeName)){
	 and store_name=#storeName#
	@}
	@if(!isEmpty(activityDetailState)){
	 and activity_detail_state=#activityDetailState#
	@}
	@if(!isEmpty(activityDetailSort)){
	 and activity_detail_sort=#activityDetailSort#
	@}
	
	