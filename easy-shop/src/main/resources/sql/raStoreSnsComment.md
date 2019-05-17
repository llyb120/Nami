sample
===
* 注释

	select #use("cols")# from ra_store_sns_comment  where  #use("condition")#

cols
===
	scomm_id,strace_id,scomm_content,scomm_memberid,scomm_membername,scomm_memberavatar,scomm_time,scomm_state

updateSample
===
	
	scomm_id=#scommId#,strace_id=#straceId#,scomm_content=#scommContent#,scomm_memberid=#scommMemberid#,scomm_membername=#scommMembername#,scomm_memberavatar=#scommMemberavatar#,scomm_time=#scommTime#,scomm_state=#scommState#

condition
===

	1 = 1  
	@if(!isEmpty(scommId)){
	 and scomm_id=#scommId#
	@}
	@if(!isEmpty(straceId)){
	 and strace_id=#straceId#
	@}
	@if(!isEmpty(scommContent)){
	 and scomm_content=#scommContent#
	@}
	@if(!isEmpty(scommMemberid)){
	 and scomm_memberid=#scommMemberid#
	@}
	@if(!isEmpty(scommMembername)){
	 and scomm_membername=#scommMembername#
	@}
	@if(!isEmpty(scommMemberavatar)){
	 and scomm_memberavatar=#scommMemberavatar#
	@}
	@if(!isEmpty(scommTime)){
	 and scomm_time=#scommTime#
	@}
	@if(!isEmpty(scommState)){
	 and scomm_state=#scommState#
	@}
	
	