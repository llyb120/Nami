sample
===
* 注释

	select #use("cols")# from ra_mb_feedback  where  #use("condition")#

cols
===
	id,content,type,ftime,member_id,member_name

updateSample
===
	
	id=#id#,content=#content#,type=#type#,ftime=#ftime#,member_id=#memberId#,member_name=#memberName#

condition
===

	1 = 1  
	@if(!isEmpty(id)){
	 and id=#id#
	@}
	@if(!isEmpty(content)){
	 and content=#content#
	@}
	@if(!isEmpty(type)){
	 and type=#type#
	@}
	@if(!isEmpty(ftime)){
	 and ftime=#ftime#
	@}
	@if(!isEmpty(memberId)){
	 and member_id=#memberId#
	@}
	@if(!isEmpty(memberName)){
	 and member_name=#memberName#
	@}
	
	