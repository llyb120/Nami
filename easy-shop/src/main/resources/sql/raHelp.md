sample
===
* 注释

	select #use("cols")# from ra_help  where  #use("condition")#

cols
===
	help_id,help_sort,help_title,help_info,help_url,update_time,type_id,page_show

updateSample
===
	
	help_id=#helpId#,help_sort=#helpSort#,help_title=#helpTitle#,help_info=#helpInfo#,help_url=#helpUrl#,update_time=#updateTime#,type_id=#typeId#,page_show=#pageShow#

condition
===

	1 = 1  
	@if(!isEmpty(helpId)){
	 and help_id=#helpId#
	@}
	@if(!isEmpty(helpSort)){
	 and help_sort=#helpSort#
	@}
	@if(!isEmpty(helpTitle)){
	 and help_title=#helpTitle#
	@}
	@if(!isEmpty(helpInfo)){
	 and help_info=#helpInfo#
	@}
	@if(!isEmpty(helpUrl)){
	 and help_url=#helpUrl#
	@}
	@if(!isEmpty(updateTime)){
	 and update_time=#updateTime#
	@}
	@if(!isEmpty(typeId)){
	 and type_id=#typeId#
	@}
	@if(!isEmpty(pageShow)){
	 and page_show=#pageShow#
	@}
	
	