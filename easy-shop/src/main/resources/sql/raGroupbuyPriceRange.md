sample
===
* 注释

	select #use("cols")# from ra_groupbuy_price_range  where  #use("condition")#

cols
===
	range_id,range_name,range_start,range_end

updateSample
===
	
	range_id=#rangeId#,range_name=#rangeName#,range_start=#rangeStart#,range_end=#rangeEnd#

condition
===

	1 = 1  
	@if(!isEmpty(rangeId)){
	 and range_id=#rangeId#
	@}
	@if(!isEmpty(rangeName)){
	 and range_name=#rangeName#
	@}
	@if(!isEmpty(rangeStart)){
	 and range_start=#rangeStart#
	@}
	@if(!isEmpty(rangeEnd)){
	 and range_end=#rangeEnd#
	@}
	
	