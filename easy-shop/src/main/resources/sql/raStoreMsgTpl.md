sample
===
* 注释

	select #use("cols")# from ra_store_msg_tpl  where  #use("condition")#

cols
===
	smt_code,smt_name,smt_message_switch,smt_message_content,smt_message_forced,smt_short_switch,smt_short_content,smt_short_forced,smt_mail_switch,smt_mail_subject,smt_mail_content,smt_mail_forced

updateSample
===
	
	smt_code=#smtCode#,smt_name=#smtName#,smt_message_switch=#smtMessageSwitch#,smt_message_content=#smtMessageContent#,smt_message_forced=#smtMessageForced#,smt_short_switch=#smtShortSwitch#,smt_short_content=#smtShortContent#,smt_short_forced=#smtShortForced#,smt_mail_switch=#smtMailSwitch#,smt_mail_subject=#smtMailSubject#,smt_mail_content=#smtMailContent#,smt_mail_forced=#smtMailForced#

condition
===

	1 = 1  
	@if(!isEmpty(smtCode)){
	 and smt_code=#smtCode#
	@}
	@if(!isEmpty(smtName)){
	 and smt_name=#smtName#
	@}
	@if(!isEmpty(smtMessageSwitch)){
	 and smt_message_switch=#smtMessageSwitch#
	@}
	@if(!isEmpty(smtMessageContent)){
	 and smt_message_content=#smtMessageContent#
	@}
	@if(!isEmpty(smtMessageForced)){
	 and smt_message_forced=#smtMessageForced#
	@}
	@if(!isEmpty(smtShortSwitch)){
	 and smt_short_switch=#smtShortSwitch#
	@}
	@if(!isEmpty(smtShortContent)){
	 and smt_short_content=#smtShortContent#
	@}
	@if(!isEmpty(smtShortForced)){
	 and smt_short_forced=#smtShortForced#
	@}
	@if(!isEmpty(smtMailSwitch)){
	 and smt_mail_switch=#smtMailSwitch#
	@}
	@if(!isEmpty(smtMailSubject)){
	 and smt_mail_subject=#smtMailSubject#
	@}
	@if(!isEmpty(smtMailContent)){
	 and smt_mail_content=#smtMailContent#
	@}
	@if(!isEmpty(smtMailForced)){
	 and smt_mail_forced=#smtMailForced#
	@}
	
	