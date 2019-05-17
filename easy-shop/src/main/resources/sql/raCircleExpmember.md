sample
===
* 注释

	select #use("cols")# from ra_circle_expmember  where  #use("condition")#

cols
===
	member_id,circle_id,em_exp,em_time

updateSample
===
	
	member_id=#memberId#,circle_id=#circleId#,em_exp=#emExp#,em_time=#emTime#

condition
===

	1 = 1  
	@if(!isEmpty(memberId)){
	 and member_id=#memberId#
	@}
	@if(!isEmpty(circleId)){
	 and circle_id=#circleId#
	@}
	@if(!isEmpty(emExp)){
	 and em_exp=#emExp#
	@}
	@if(!isEmpty(emTime)){
	 and em_time=#emTime#
	@}
	
	