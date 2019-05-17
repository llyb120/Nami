sample
===
* 注释

	select #use("cols")# from ra_navigation  where  #use("condition")#

cols
===
	nav_id,nav_type,nav_title,nav_url,nav_location,nav_new_open,nav_sort,item_id

updateSample
===
	
	nav_id=#navId#,nav_type=#navType#,nav_title=#navTitle#,nav_url=#navUrl#,nav_location=#navLocation#,nav_new_open=#navNewOpen#,nav_sort=#navSort#,item_id=#itemId#

condition
===

	1 = 1  
	@if(!isEmpty(navId)){
	 and nav_id=#navId#
	@}
	@if(!isEmpty(navType)){
	 and nav_type=#navType#
	@}
	@if(!isEmpty(navTitle)){
	 and nav_title=#navTitle#
	@}
	@if(!isEmpty(navUrl)){
	 and nav_url=#navUrl#
	@}
	@if(!isEmpty(navLocation)){
	 and nav_location=#navLocation#
	@}
	@if(!isEmpty(navNewOpen)){
	 and nav_new_open=#navNewOpen#
	@}
	@if(!isEmpty(navSort)){
	 and nav_sort=#navSort#
	@}
	@if(!isEmpty(itemId)){
	 and item_id=#itemId#
	@}
	
	