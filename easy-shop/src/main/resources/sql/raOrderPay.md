sample
===
* 注释

	select #use("cols")# from ra_order_pay  where  #use("condition")#

cols
===
	pay_id,pay_sn,buyer_id,api_pay_state

updateSample
===
	
	pay_id=#payId#,pay_sn=#paySn#,buyer_id=#buyerId#,api_pay_state=#apiPayState#

condition
===

	1 = 1  
	@if(!isEmpty(payId)){
	 and pay_id=#payId#
	@}
	@if(!isEmpty(paySn)){
	 and pay_sn=#paySn#
	@}
	@if(!isEmpty(buyerId)){
	 and buyer_id=#buyerId#
	@}
	@if(!isEmpty(apiPayState)){
	 and api_pay_state=#apiPayState#
	@}
	
	