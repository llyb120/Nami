sample
===
* 注释

	select #use("cols")# from ra_help_type  where  #use("condition")#

cols
===
	type_id,type_name,type_sort,help_code,help_show,page_show

updateSample
===
	
	type_id=#typeId#,type_name=#typeName#,type_sort=#typeSort#,help_code=#helpCode#,help_show=#helpShow#,page_show=#pageShow#

condition
===

	1 = 1  
	@if(!isEmpty(typeId)){
	 and type_id=#typeId#
	@}
	@if(!isEmpty(typeName)){
	 and type_name=#typeName#
	@}
	@if(!isEmpty(typeSort)){
	 and type_sort=#typeSort#
	@}
	@if(!isEmpty(helpCode)){
	 and help_code=#helpCode#
	@}
	@if(!isEmpty(helpShow)){
	 and help_show=#helpShow#
	@}
	@if(!isEmpty(pageShow)){
	 and page_show=#pageShow#
	@}
	
	