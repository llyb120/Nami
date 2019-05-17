sample
===
* 注释

	select #use("cols")# from ra_cron  where  #use("condition")#

cols
===
	id,type,exeid,exetime

updateSample
===
	
	id=#id#,type=#type#,exeid=#exeid#,exetime=#exetime#

condition
===

	1 = 1  
	@if(!isEmpty(id)){
	 and id=#id#
	@}
	@if(!isEmpty(type)){
	 and type=#type#
	@}
	@if(!isEmpty(exeid)){
	 and exeid=#exeid#
	@}
	@if(!isEmpty(exetime)){
	 and exetime=#exetime#
	@}
	
	