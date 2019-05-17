sample
===
* 注释

	select #use("cols")# from ra_store_msg_setting  where  #use("condition")#

cols
===
	smt_code,store_id,sms_message_switch,sms_short_switch,sms_mail_switch,sms_short_number,sms_mail_number

updateSample
===
	
	smt_code=#smtCode#,store_id=#storeId#,sms_message_switch=#smsMessageSwitch#,sms_short_switch=#smsShortSwitch#,sms_mail_switch=#smsMailSwitch#,sms_short_number=#smsShortNumber#,sms_mail_number=#smsMailNumber#

condition
===

	1 = 1  
	@if(!isEmpty(smtCode)){
	 and smt_code=#smtCode#
	@}
	@if(!isEmpty(storeId)){
	 and store_id=#storeId#
	@}
	@if(!isEmpty(smsMessageSwitch)){
	 and sms_message_switch=#smsMessageSwitch#
	@}
	@if(!isEmpty(smsShortSwitch)){
	 and sms_short_switch=#smsShortSwitch#
	@}
	@if(!isEmpty(smsMailSwitch)){
	 and sms_mail_switch=#smsMailSwitch#
	@}
	@if(!isEmpty(smsShortNumber)){
	 and sms_short_number=#smsShortNumber#
	@}
	@if(!isEmpty(smsMailNumber)){
	 and sms_mail_number=#smsMailNumber#
	@}
	
	