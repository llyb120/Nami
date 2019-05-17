sample
===
* 注释

	select #use("cols")# from ra_sns_comment  where  #use("condition")#

cols
===
	comment_id,comment_memberid,comment_membername,comment_memberavatar,comment_originalid,comment_originaltype,comment_content,comment_addtime,comment_ip,comment_state

updateSample
===
	
	comment_id=#commentId#,comment_memberid=#commentMemberid#,comment_membername=#commentMembername#,comment_memberavatar=#commentMemberavatar#,comment_originalid=#commentOriginalid#,comment_originaltype=#commentOriginaltype#,comment_content=#commentContent#,comment_addtime=#commentAddtime#,comment_ip=#commentIp#,comment_state=#commentState#

condition
===

	1 = 1  
	@if(!isEmpty(commentId)){
	 and comment_id=#commentId#
	@}
	@if(!isEmpty(commentMemberid)){
	 and comment_memberid=#commentMemberid#
	@}
	@if(!isEmpty(commentMembername)){
	 and comment_membername=#commentMembername#
	@}
	@if(!isEmpty(commentMemberavatar)){
	 and comment_memberavatar=#commentMemberavatar#
	@}
	@if(!isEmpty(commentOriginalid)){
	 and comment_originalid=#commentOriginalid#
	@}
	@if(!isEmpty(commentOriginaltype)){
	 and comment_originaltype=#commentOriginaltype#
	@}
	@if(!isEmpty(commentContent)){
	 and comment_content=#commentContent#
	@}
	@if(!isEmpty(commentAddtime)){
	 and comment_addtime=#commentAddtime#
	@}
	@if(!isEmpty(commentIp)){
	 and comment_ip=#commentIp#
	@}
	@if(!isEmpty(commentState)){
	 and comment_state=#commentState#
	@}
	
	