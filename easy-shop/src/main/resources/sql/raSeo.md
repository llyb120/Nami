sample
===
* 注释

	select #use("cols")# from ra_seo  where  #use("condition")#

cols
===
	id,title,keywords,description,type

updateSample
===
	
	id=#id#,title=#title#,keywords=#keywords#,description=#description#,type=#type#

condition
===

	1 = 1  
	@if(!isEmpty(id)){
	 and id=#id#
	@}
	@if(!isEmpty(title)){
	 and title=#title#
	@}
	@if(!isEmpty(keywords)){
	 and keywords=#keywords#
	@}
	@if(!isEmpty(description)){
	 and description=#description#
	@}
	@if(!isEmpty(type)){
	 and type=#type#
	@}
	
	