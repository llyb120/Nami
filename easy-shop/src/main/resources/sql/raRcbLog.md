sample
===
* 注释

	select #use("cols")# from ra_rcb_log  where  #use("condition")#

cols
===
	id,member_id,member_name,type,add_time,available_amount,freeze_amount,description

updateSample
===
	
	id=#id#,member_id=#memberId#,member_name=#memberName#,type=#type#,add_time=#addTime#,available_amount=#availableAmount#,freeze_amount=#freezeAmount#,description=#description#

condition
===

	1 = 1  
	@if(!isEmpty(id)){
	 and id=#id#
	@}
	@if(!isEmpty(memberId)){
	 and member_id=#memberId#
	@}
	@if(!isEmpty(memberName)){
	 and member_name=#memberName#
	@}
	@if(!isEmpty(type)){
	 and type=#type#
	@}
	@if(!isEmpty(addTime)){
	 and add_time=#addTime#
	@}
	@if(!isEmpty(availableAmount)){
	 and available_amount=#availableAmount#
	@}
	@if(!isEmpty(freezeAmount)){
	 and freeze_amount=#freezeAmount#
	@}
	@if(!isEmpty(description)){
	 and description=#description#
	@}
	
	