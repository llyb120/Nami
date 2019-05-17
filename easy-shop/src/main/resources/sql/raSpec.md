sample
===
* 注释

	select #use("cols")# from ra_spec  where  #use("condition")#

cols
===
	sp_id,sp_name,sp_sort,class_id,class_name

updateSample
===
	
	sp_id=#spId#,sp_name=#spName#,sp_sort=#spSort#,class_id=#classId#,class_name=#className#

condition
===

	1 = 1  
	@if(!isEmpty(spId)){
	 and sp_id=#spId#
	@}
	@if(!isEmpty(spName)){
	 and sp_name=#spName#
	@}
	@if(!isEmpty(spSort)){
	 and sp_sort=#spSort#
	@}
	@if(!isEmpty(classId)){
	 and class_id=#classId#
	@}
	@if(!isEmpty(className)){
	 and class_name=#className#
	@}
	
	