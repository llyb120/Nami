sample
===
* 注释

	select #use("cols")# from ra_pd_recharge  where  #use("condition")#

cols
===
	pdr_id,pdr_sn,pdr_member_id,pdr_member_name,pdr_amount,pdr_payment_code,pdr_payment_name,pdr_trade_sn,pdr_add_time,pdr_payment_state,pdr_payment_time,pdr_admin

updateSample
===
	
	pdr_id=#pdrId#,pdr_sn=#pdrSn#,pdr_member_id=#pdrMemberId#,pdr_member_name=#pdrMemberName#,pdr_amount=#pdrAmount#,pdr_payment_code=#pdrPaymentCode#,pdr_payment_name=#pdrPaymentName#,pdr_trade_sn=#pdrTradeSn#,pdr_add_time=#pdrAddTime#,pdr_payment_state=#pdrPaymentState#,pdr_payment_time=#pdrPaymentTime#,pdr_admin=#pdrAdmin#

condition
===

	1 = 1  
	@if(!isEmpty(pdrId)){
	 and pdr_id=#pdrId#
	@}
	@if(!isEmpty(pdrSn)){
	 and pdr_sn=#pdrSn#
	@}
	@if(!isEmpty(pdrMemberId)){
	 and pdr_member_id=#pdrMemberId#
	@}
	@if(!isEmpty(pdrMemberName)){
	 and pdr_member_name=#pdrMemberName#
	@}
	@if(!isEmpty(pdrAmount)){
	 and pdr_amount=#pdrAmount#
	@}
	@if(!isEmpty(pdrPaymentCode)){
	 and pdr_payment_code=#pdrPaymentCode#
	@}
	@if(!isEmpty(pdrPaymentName)){
	 and pdr_payment_name=#pdrPaymentName#
	@}
	@if(!isEmpty(pdrTradeSn)){
	 and pdr_trade_sn=#pdrTradeSn#
	@}
	@if(!isEmpty(pdrAddTime)){
	 and pdr_add_time=#pdrAddTime#
	@}
	@if(!isEmpty(pdrPaymentState)){
	 and pdr_payment_state=#pdrPaymentState#
	@}
	@if(!isEmpty(pdrPaymentTime)){
	 and pdr_payment_time=#pdrPaymentTime#
	@}
	@if(!isEmpty(pdrAdmin)){
	 and pdr_admin=#pdrAdmin#
	@}
	
	