sample
===
* 注释

	select #use("cols")# from ra_article_class  where  #use("condition")#

cols
===
	ac_id,ac_code,ac_name,ac_parent_id,ac_sort

updateSample
===
	
	ac_id=#acId#,ac_code=#acCode#,ac_name=#acName#,ac_parent_id=#acParentId#,ac_sort=#acSort#

condition
===

	1 = 1  
	@if(!isEmpty(acId)){
	 and ac_id=#acId#
	@}
	@if(!isEmpty(acCode)){
	 and ac_code=#acCode#
	@}
	@if(!isEmpty(acName)){
	 and ac_name=#acName#
	@}
	@if(!isEmpty(acParentId)){
	 and ac_parent_id=#acParentId#
	@}
	@if(!isEmpty(acSort)){
	 and ac_sort=#acSort#
	@}
	
	