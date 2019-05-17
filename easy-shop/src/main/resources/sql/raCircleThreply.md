sample
===
* 注释

	select #use("cols")# from ra_circle_threply  where  #use("condition")#

cols
===
	theme_id,reply_id,circle_id,member_id,member_name,reply_content,reply_addtime,reply_replyid,reply_replyname,is_closed,reply_exp

updateSample
===
	
	theme_id=#themeId#,reply_id=#replyId#,circle_id=#circleId#,member_id=#memberId#,member_name=#memberName#,reply_content=#replyContent#,reply_addtime=#replyAddtime#,reply_replyid=#replyReplyid#,reply_replyname=#replyReplyname#,is_closed=#isClosed#,reply_exp=#replyExp#

condition
===

	1 = 1  
	@if(!isEmpty(themeId)){
	 and theme_id=#themeId#
	@}
	@if(!isEmpty(replyId)){
	 and reply_id=#replyId#
	@}
	@if(!isEmpty(circleId)){
	 and circle_id=#circleId#
	@}
	@if(!isEmpty(memberId)){
	 and member_id=#memberId#
	@}
	@if(!isEmpty(memberName)){
	 and member_name=#memberName#
	@}
	@if(!isEmpty(replyContent)){
	 and reply_content=#replyContent#
	@}
	@if(!isEmpty(replyAddtime)){
	 and reply_addtime=#replyAddtime#
	@}
	@if(!isEmpty(replyReplyid)){
	 and reply_replyid=#replyReplyid#
	@}
	@if(!isEmpty(replyReplyname)){
	 and reply_replyname=#replyReplyname#
	@}
	@if(!isEmpty(isClosed)){
	 and is_closed=#isClosed#
	@}
	@if(!isEmpty(replyExp)){
	 and reply_exp=#replyExp#
	@}
	
	