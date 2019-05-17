sample
===
* 注释

	select #use("cols")# from ra_pd_cash  where  #use("condition")#

cols
===
	pdc_id,pdc_sn,pdc_member_id,pdc_member_name,pdc_amount,pdc_bank_name,pdc_bank_no,pdc_bank_user,pdc_add_time,pdc_payment_time,pdc_payment_state,pdc_payment_admin

updateSample
===
	
	pdc_id=#pdcId#,pdc_sn=#pdcSn#,pdc_member_id=#pdcMemberId#,pdc_member_name=#pdcMemberName#,pdc_amount=#pdcAmount#,pdc_bank_name=#pdcBankName#,pdc_bank_no=#pdcBankNo#,pdc_bank_user=#pdcBankUser#,pdc_add_time=#pdcAddTime#,pdc_payment_time=#pdcPaymentTime#,pdc_payment_state=#pdcPaymentState#,pdc_payment_admin=#pdcPaymentAdmin#

condition
===

	1 = 1  
	@if(!isEmpty(pdcId)){
	 and pdc_id=#pdcId#
	@}
	@if(!isEmpty(pdcSn)){
	 and pdc_sn=#pdcSn#
	@}
	@if(!isEmpty(pdcMemberId)){
	 and pdc_member_id=#pdcMemberId#
	@}
	@if(!isEmpty(pdcMemberName)){
	 and pdc_member_name=#pdcMemberName#
	@}
	@if(!isEmpty(pdcAmount)){
	 and pdc_amount=#pdcAmount#
	@}
	@if(!isEmpty(pdcBankName)){
	 and pdc_bank_name=#pdcBankName#
	@}
	@if(!isEmpty(pdcBankNo)){
	 and pdc_bank_no=#pdcBankNo#
	@}
	@if(!isEmpty(pdcBankUser)){
	 and pdc_bank_user=#pdcBankUser#
	@}
	@if(!isEmpty(pdcAddTime)){
	 and pdc_add_time=#pdcAddTime#
	@}
	@if(!isEmpty(pdcPaymentTime)){
	 and pdc_payment_time=#pdcPaymentTime#
	@}
	@if(!isEmpty(pdcPaymentState)){
	 and pdc_payment_state=#pdcPaymentState#
	@}
	@if(!isEmpty(pdcPaymentAdmin)){
	 and pdc_payment_admin=#pdcPaymentAdmin#
	@}
	
	