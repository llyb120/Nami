sample
===
* 注释

	select #use("cols")# from ra_sns_tracelog  where  #use("condition")#

cols
===
	trace_id,trace_originalid,trace_originalmemberid,trace_originalstate,trace_memberid,trace_membername,trace_memberavatar,trace_title,trace_content,trace_addtime,trace_state,trace_privacy,trace_commentcount,trace_copycount,trace_orgcommentcount,trace_orgcopycount,trace_from

updateSample
===
	
	trace_id=#traceId#,trace_originalid=#traceOriginalid#,trace_originalmemberid=#traceOriginalmemberid#,trace_originalstate=#traceOriginalstate#,trace_memberid=#traceMemberid#,trace_membername=#traceMembername#,trace_memberavatar=#traceMemberavatar#,trace_title=#traceTitle#,trace_content=#traceContent#,trace_addtime=#traceAddtime#,trace_state=#traceState#,trace_privacy=#tracePrivacy#,trace_commentcount=#traceCommentcount#,trace_copycount=#traceCopycount#,trace_orgcommentcount=#traceOrgcommentcount#,trace_orgcopycount=#traceOrgcopycount#,trace_from=#traceFrom#

condition
===

	1 = 1  
	@if(!isEmpty(traceId)){
	 and trace_id=#traceId#
	@}
	@if(!isEmpty(traceOriginalid)){
	 and trace_originalid=#traceOriginalid#
	@}
	@if(!isEmpty(traceOriginalmemberid)){
	 and trace_originalmemberid=#traceOriginalmemberid#
	@}
	@if(!isEmpty(traceOriginalstate)){
	 and trace_originalstate=#traceOriginalstate#
	@}
	@if(!isEmpty(traceMemberid)){
	 and trace_memberid=#traceMemberid#
	@}
	@if(!isEmpty(traceMembername)){
	 and trace_membername=#traceMembername#
	@}
	@if(!isEmpty(traceMemberavatar)){
	 and trace_memberavatar=#traceMemberavatar#
	@}
	@if(!isEmpty(traceTitle)){
	 and trace_title=#traceTitle#
	@}
	@if(!isEmpty(traceContent)){
	 and trace_content=#traceContent#
	@}
	@if(!isEmpty(traceAddtime)){
	 and trace_addtime=#traceAddtime#
	@}
	@if(!isEmpty(traceState)){
	 and trace_state=#traceState#
	@}
	@if(!isEmpty(tracePrivacy)){
	 and trace_privacy=#tracePrivacy#
	@}
	@if(!isEmpty(traceCommentcount)){
	 and trace_commentcount=#traceCommentcount#
	@}
	@if(!isEmpty(traceCopycount)){
	 and trace_copycount=#traceCopycount#
	@}
	@if(!isEmpty(traceOrgcommentcount)){
	 and trace_orgcommentcount=#traceOrgcommentcount#
	@}
	@if(!isEmpty(traceOrgcopycount)){
	 and trace_orgcopycount=#traceOrgcopycount#
	@}
	@if(!isEmpty(traceFrom)){
	 and trace_from=#traceFrom#
	@}
	
	