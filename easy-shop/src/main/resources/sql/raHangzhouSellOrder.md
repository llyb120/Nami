sample
===
* 注释

	select #use("cols")# from ra_hangzhou_sell_order  where  #use("condition")#

cols
===
	id,order_sn,orderCode,status

updateSample
===
	
	id=#id#,order_sn=#orderSn#,orderCode=#ordercode#,status=#status#

condition
===

	1 = 1  
	@if(!isEmpty(id)){
	 and id=#id#
	@}
	@if(!isEmpty(orderSn)){
	 and order_sn=#orderSn#
	@}
	@if(!isEmpty(ordercode)){
	 and orderCode=#ordercode#
	@}
	@if(!isEmpty(status)){
	 and status=#status#
	@}
	
	