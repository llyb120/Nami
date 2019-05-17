sample
===
* 注释

	select #use("cols")# from ra_circle_recycle  where  #use("condition")#

cols
===
	recycle_id,member_id,member_name,circle_id,circle_name,theme_name,recycle_content,recycle_opid,recycle_opname,recycle_type,recycle_time

updateSample
===
	
	recycle_id=#recycleId#,member_id=#memberId#,member_name=#memberName#,circle_id=#circleId#,circle_name=#circleName#,theme_name=#themeName#,recycle_content=#recycleContent#,recycle_opid=#recycleOpid#,recycle_opname=#recycleOpname#,recycle_type=#recycleType#,recycle_time=#recycleTime#

condition
===

	1 = 1  
	@if(!isEmpty(recycleId)){
	 and recycle_id=#recycleId#
	@}
	@if(!isEmpty(memberId)){
	 and member_id=#memberId#
	@}
	@if(!isEmpty(memberName)){
	 and member_name=#memberName#
	@}
	@if(!isEmpty(circleId)){
	 and circle_id=#circleId#
	@}
	@if(!isEmpty(circleName)){
	 and circle_name=#circleName#
	@}
	@if(!isEmpty(themeName)){
	 and theme_name=#themeName#
	@}
	@if(!isEmpty(recycleContent)){
	 and recycle_content=#recycleContent#
	@}
	@if(!isEmpty(recycleOpid)){
	 and recycle_opid=#recycleOpid#
	@}
	@if(!isEmpty(recycleOpname)){
	 and recycle_opname=#recycleOpname#
	@}
	@if(!isEmpty(recycleType)){
	 and recycle_type=#recycleType#
	@}
	@if(!isEmpty(recycleTime)){
	 and recycle_time=#recycleTime#
	@}
	
	