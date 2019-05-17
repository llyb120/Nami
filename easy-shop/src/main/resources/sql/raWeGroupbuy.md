sample
===
* 注释

	select #use("cols")# from ra_we_groupbuy  where  #use("condition")#

cols
===
	id,activity_name,start_time,end_time,max_person,content,store_id,goods_id,price,status,min_count,stock,brokerage

updateSample
===
	
	id=#id#,activity_name=#activityName#,start_time=#startTime#,end_time=#endTime#,max_person=#maxPerson#,content=#content#,store_id=#storeId#,goods_id=#goodsId#,price=#price#,status=#status#,min_count=#minCount#,stock=#stock#,brokerage=#brokerage#

condition
===

	1 = 1  
	@if(!isEmpty(id)){
	 and id=#id#
	@}
	@if(!isEmpty(activityName)){
	 and activity_name=#activityName#
	@}
	@if(!isEmpty(startTime)){
	 and start_time=#startTime#
	@}
	@if(!isEmpty(endTime)){
	 and end_time=#endTime#
	@}
	@if(!isEmpty(maxPerson)){
	 and max_person=#maxPerson#
	@}
	@if(!isEmpty(content)){
	 and content=#content#
	@}
	@if(!isEmpty(storeId)){
	 and store_id=#storeId#
	@}
	@if(!isEmpty(goodsId)){
	 and goods_id=#goodsId#
	@}
	@if(!isEmpty(price)){
	 and price=#price#
	@}
	@if(!isEmpty(status)){
	 and status=#status#
	@}
	@if(!isEmpty(minCount)){
	 and min_count=#minCount#
	@}
	@if(!isEmpty(stock)){
	 and stock=#stock#
	@}
	@if(!isEmpty(brokerage)){
	 and brokerage=#brokerage#
	@}
	
	