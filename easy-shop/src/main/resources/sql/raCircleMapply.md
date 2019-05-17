sample
===
* 注释

	select #use("cols")# from ra_circle_mapply  where  #use("condition")#

cols
===
	mapply_id,circle_id,member_id,mapply_reason,mapply_time

updateSample
===
	
	mapply_id=#mapplyId#,circle_id=#circleId#,member_id=#memberId#,mapply_reason=#mapplyReason#,mapply_time=#mapplyTime#

condition
===

	1 = 1  
	@if(!isEmpty(mapplyId)){
	 and mapply_id=#mapplyId#
	@}
	@if(!isEmpty(circleId)){
	 and circle_id=#circleId#
	@}
	@if(!isEmpty(memberId)){
	 and member_id=#memberId#
	@}
	@if(!isEmpty(mapplyReason)){
	 and mapply_reason=#mapplyReason#
	@}
	@if(!isEmpty(mapplyTime)){
	 and mapply_time=#mapplyTime#
	@}
	
	