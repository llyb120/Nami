sample
===
* 注释

	select #use("cols")# from ra_tgb_ads  where  #use("condition")#

cols
===
	id,content,member_id,name,time,recommand

updateSample
===
	
	id=#id#,content=#content#,member_id=#memberId#,name=#name#,time=#time#,recommand=#recommand#

condition
===

	1 = 1  
	@if(!isEmpty(id)){
	 and id=#id#
	@}
	@if(!isEmpty(content)){
	 and content=#content#
	@}
	@if(!isEmpty(memberId)){
	 and member_id=#memberId#
	@}
	@if(!isEmpty(name)){
	 and name=#name#
	@}
	@if(!isEmpty(time)){
	 and time=#time#
	@}
	@if(!isEmpty(recommand)){
	 and recommand=#recommand#
	@}
	
	