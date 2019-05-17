sample
===
* 注释

	select #use("cols")# from ra_sns_mtagmember  where  #use("condition")#

cols
===
	mtag_id,member_id,recommend

updateSample
===
	
	mtag_id=#mtagId#,member_id=#memberId#,recommend=#recommend#

condition
===

	1 = 1  
	@if(!isEmpty(mtagId)){
	 and mtag_id=#mtagId#
	@}
	@if(!isEmpty(memberId)){
	 and member_id=#memberId#
	@}
	@if(!isEmpty(recommend)){
	 and recommend=#recommend#
	@}
	
	