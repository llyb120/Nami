sample
===
* 注释

	select #use("cols")# from ra_mb_payment  where  #use("condition")#

cols
===
	payment_id,payment_code,payment_name,payment_config,payment_state

updateSample
===
	
	payment_id=#paymentId#,payment_code=#paymentCode#,payment_name=#paymentName#,payment_config=#paymentConfig#,payment_state=#paymentState#

condition
===

	1 = 1  
	@if(!isEmpty(paymentId)){
	 and payment_id=#paymentId#
	@}
	@if(!isEmpty(paymentCode)){
	 and payment_code=#paymentCode#
	@}
	@if(!isEmpty(paymentName)){
	 and payment_name=#paymentName#
	@}
	@if(!isEmpty(paymentConfig)){
	 and payment_config=#paymentConfig#
	@}
	@if(!isEmpty(paymentState)){
	 and payment_state=#paymentState#
	@}
	
	