sample
===
* 注释

	select #use("cols")# from ra_stat_member  where  #use("condition")#

cols
===
	statm_id,statm_memberid,statm_membername,statm_time,statm_ordernum,statm_orderamount,statm_goodsnum,statm_predincrease,statm_predreduce,statm_pointsincrease,statm_pointsreduce,statm_updatetime

updateSample
===
	
	statm_id=#statmId#,statm_memberid=#statmMemberid#,statm_membername=#statmMembername#,statm_time=#statmTime#,statm_ordernum=#statmOrdernum#,statm_orderamount=#statmOrderamount#,statm_goodsnum=#statmGoodsnum#,statm_predincrease=#statmPredincrease#,statm_predreduce=#statmPredreduce#,statm_pointsincrease=#statmPointsincrease#,statm_pointsreduce=#statmPointsreduce#,statm_updatetime=#statmUpdatetime#

condition
===

	1 = 1  
	@if(!isEmpty(statmId)){
	 and statm_id=#statmId#
	@}
	@if(!isEmpty(statmMemberid)){
	 and statm_memberid=#statmMemberid#
	@}
	@if(!isEmpty(statmMembername)){
	 and statm_membername=#statmMembername#
	@}
	@if(!isEmpty(statmTime)){
	 and statm_time=#statmTime#
	@}
	@if(!isEmpty(statmOrdernum)){
	 and statm_ordernum=#statmOrdernum#
	@}
	@if(!isEmpty(statmOrderamount)){
	 and statm_orderamount=#statmOrderamount#
	@}
	@if(!isEmpty(statmGoodsnum)){
	 and statm_goodsnum=#statmGoodsnum#
	@}
	@if(!isEmpty(statmPredincrease)){
	 and statm_predincrease=#statmPredincrease#
	@}
	@if(!isEmpty(statmPredreduce)){
	 and statm_predreduce=#statmPredreduce#
	@}
	@if(!isEmpty(statmPointsincrease)){
	 and statm_pointsincrease=#statmPointsincrease#
	@}
	@if(!isEmpty(statmPointsreduce)){
	 and statm_pointsreduce=#statmPointsreduce#
	@}
	@if(!isEmpty(statmUpdatetime)){
	 and statm_updatetime=#statmUpdatetime#
	@}
	
	