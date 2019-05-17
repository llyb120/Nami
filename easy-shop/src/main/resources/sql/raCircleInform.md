sample
===
* 注释

	select #use("cols")# from ra_circle_inform  where  #use("condition")#

cols
===
	inform_id,circle_id,circle_name,theme_id,theme_name,reply_id,member_id,member_name,inform_content,inform_time,inform_type,inform_state,inform_opid,inform_opname,inform_opexp,inform_opresult

updateSample
===
	
	inform_id=#informId#,circle_id=#circleId#,circle_name=#circleName#,theme_id=#themeId#,theme_name=#themeName#,reply_id=#replyId#,member_id=#memberId#,member_name=#memberName#,inform_content=#informContent#,inform_time=#informTime#,inform_type=#informType#,inform_state=#informState#,inform_opid=#informOpid#,inform_opname=#informOpname#,inform_opexp=#informOpexp#,inform_opresult=#informOpresult#

condition
===

	1 = 1  
	@if(!isEmpty(informId)){
	 and inform_id=#informId#
	@}
	@if(!isEmpty(circleId)){
	 and circle_id=#circleId#
	@}
	@if(!isEmpty(circleName)){
	 and circle_name=#circleName#
	@}
	@if(!isEmpty(themeId)){
	 and theme_id=#themeId#
	@}
	@if(!isEmpty(themeName)){
	 and theme_name=#themeName#
	@}
	@if(!isEmpty(replyId)){
	 and reply_id=#replyId#
	@}
	@if(!isEmpty(memberId)){
	 and member_id=#memberId#
	@}
	@if(!isEmpty(memberName)){
	 and member_name=#memberName#
	@}
	@if(!isEmpty(informContent)){
	 and inform_content=#informContent#
	@}
	@if(!isEmpty(informTime)){
	 and inform_time=#informTime#
	@}
	@if(!isEmpty(informType)){
	 and inform_type=#informType#
	@}
	@if(!isEmpty(informState)){
	 and inform_state=#informState#
	@}
	@if(!isEmpty(informOpid)){
	 and inform_opid=#informOpid#
	@}
	@if(!isEmpty(informOpname)){
	 and inform_opname=#informOpname#
	@}
	@if(!isEmpty(informOpexp)){
	 and inform_opexp=#informOpexp#
	@}
	@if(!isEmpty(informOpresult)){
	 and inform_opresult=#informOpresult#
	@}
	
	