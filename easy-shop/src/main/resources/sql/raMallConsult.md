sample
===
* 注释

	select #use("cols")# from ra_mall_consult  where  #use("condition")#

cols
===
	mc_id,mct_id,member_id,member_name,mc_content,mc_addtime,is_reply,mc_reply,mc_reply_time,admin_id,admin_name

updateSample
===
	
	mc_id=#mcId#,mct_id=#mctId#,member_id=#memberId#,member_name=#memberName#,mc_content=#mcContent#,mc_addtime=#mcAddtime#,is_reply=#isReply#,mc_reply=#mcReply#,mc_reply_time=#mcReplyTime#,admin_id=#adminId#,admin_name=#adminName#

condition
===

	1 = 1  
	@if(!isEmpty(mcId)){
	 and mc_id=#mcId#
	@}
	@if(!isEmpty(mctId)){
	 and mct_id=#mctId#
	@}
	@if(!isEmpty(memberId)){
	 and member_id=#memberId#
	@}
	@if(!isEmpty(memberName)){
	 and member_name=#memberName#
	@}
	@if(!isEmpty(mcContent)){
	 and mc_content=#mcContent#
	@}
	@if(!isEmpty(mcAddtime)){
	 and mc_addtime=#mcAddtime#
	@}
	@if(!isEmpty(isReply)){
	 and is_reply=#isReply#
	@}
	@if(!isEmpty(mcReply)){
	 and mc_reply=#mcReply#
	@}
	@if(!isEmpty(mcReplyTime)){
	 and mc_reply_time=#mcReplyTime#
	@}
	@if(!isEmpty(adminId)){
	 and admin_id=#adminId#
	@}
	@if(!isEmpty(adminName)){
	 and admin_name=#adminName#
	@}
	
	