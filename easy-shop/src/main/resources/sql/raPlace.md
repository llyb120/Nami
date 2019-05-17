sample
===
* 注释

	select #use("cols")# from ra_place  where  #use("condition")#

cols
===
	id,name,adv,time,ad_word

updateSample
===
	
	id=#id#,name=#name#,adv=#adv#,time=#time#,ad_word=#adWord#

condition
===

	1 = 1  
	@if(!isEmpty(id)){
	 and id=#id#
	@}
	@if(!isEmpty(name)){
	 and name=#name#
	@}
	@if(!isEmpty(adv)){
	 and adv=#adv#
	@}
	@if(!isEmpty(time)){
	 and time=#time#
	@}
	@if(!isEmpty(adWord)){
	 and ad_word=#adWord#
	@}
	
	