sample
===
* 注释

	select #use("cols")# from ra_member_msg_tpl  where  #use("condition")#

cols
===
	mmt_code,mmt_name,mmt_message_switch,mmt_message_content,mmt_short_switch,mmt_short_content,mmt_mail_switch,mmt_mail_subject,mmt_mail_content

updateSample
===
	
	mmt_code=#mmtCode#,mmt_name=#mmtName#,mmt_message_switch=#mmtMessageSwitch#,mmt_message_content=#mmtMessageContent#,mmt_short_switch=#mmtShortSwitch#,mmt_short_content=#mmtShortContent#,mmt_mail_switch=#mmtMailSwitch#,mmt_mail_subject=#mmtMailSubject#,mmt_mail_content=#mmtMailContent#

condition
===

	1 = 1  
	@if(!isEmpty(mmtCode)){
	 and mmt_code=#mmtCode#
	@}
	@if(!isEmpty(mmtName)){
	 and mmt_name=#mmtName#
	@}
	@if(!isEmpty(mmtMessageSwitch)){
	 and mmt_message_switch=#mmtMessageSwitch#
	@}
	@if(!isEmpty(mmtMessageContent)){
	 and mmt_message_content=#mmtMessageContent#
	@}
	@if(!isEmpty(mmtShortSwitch)){
	 and mmt_short_switch=#mmtShortSwitch#
	@}
	@if(!isEmpty(mmtShortContent)){
	 and mmt_short_content=#mmtShortContent#
	@}
	@if(!isEmpty(mmtMailSwitch)){
	 and mmt_mail_switch=#mmtMailSwitch#
	@}
	@if(!isEmpty(mmtMailSubject)){
	 and mmt_mail_subject=#mmtMailSubject#
	@}
	@if(!isEmpty(mmtMailContent)){
	 and mmt_mail_content=#mmtMailContent#
	@}
	
	