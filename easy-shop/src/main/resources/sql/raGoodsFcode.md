sample
===
* 注释

	select #use("cols")# from ra_goods_fcode  where  #use("condition")#

cols
===
	fc_id,goods_commonid,fc_code,fc_state

updateSample
===
	
	fc_id=#fcId#,goods_commonid=#goodsCommonid#,fc_code=#fcCode#,fc_state=#fcState#

condition
===

	1 = 1  
	@if(!isEmpty(fcId)){
	 and fc_id=#fcId#
	@}
	@if(!isEmpty(goodsCommonid)){
	 and goods_commonid=#goodsCommonid#
	@}
	@if(!isEmpty(fcCode)){
	 and fc_code=#fcCode#
	@}
	@if(!isEmpty(fcState)){
	 and fc_state=#fcState#
	@}
	
	