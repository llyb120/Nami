sample
===
* 注释

	select #use("cols")# from ra_out_order  where  #use("condition")#

cols
===
	id,order_sn,member_id,order_info

updateSample
===
	
	id=#id#,order_sn=#orderSn#,member_id=#memberId#,order_info=#orderInfo#

condition
===

	1 = 1  
	@if(!isEmpty(id)){
	 and id=#id#
	@}
	@if(!isEmpty(orderSn)){
	 and order_sn=#orderSn#
	@}
	@if(!isEmpty(memberId)){
	 and member_id=#memberId#
	@}
	@if(!isEmpty(orderInfo)){
	 and order_info=#orderInfo#
	@}
	
	