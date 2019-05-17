sample
===
* 注释

	select #use("cols")# from ra_proxy_task  where  #use("condition")#

cols
===
	id,start_time,end_time,money,member_id

updateSample
===
	
	id=#id#,start_time=#startTime#,end_time=#endTime#,money=#money#,member_id=#memberId#

condition
===

	1 = 1  
	@if(!isEmpty(id)){
	 and id=#id#
	@}
	@if(!isEmpty(startTime)){
	 and start_time=#startTime#
	@}
	@if(!isEmpty(endTime)){
	 and end_time=#endTime#
	@}
	@if(!isEmpty(money)){
	 and money=#money#
	@}
	@if(!isEmpty(memberId)){
	 and member_id=#memberId#
	@}
	
	