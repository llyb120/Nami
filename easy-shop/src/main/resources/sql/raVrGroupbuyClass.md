sample
===
* 注释

	select #use("cols")# from ra_vr_groupbuy_class  where  #use("condition")#

cols
===
	class_id,class_name,parent_class_id,class_sort

updateSample
===
	
	class_id=#classId#,class_name=#className#,parent_class_id=#parentClassId#,class_sort=#classSort#

condition
===

	1 = 1  
	@if(!isEmpty(classId)){
	 and class_id=#classId#
	@}
	@if(!isEmpty(className)){
	 and class_name=#className#
	@}
	@if(!isEmpty(parentClassId)){
	 and parent_class_id=#parentClassId#
	@}
	@if(!isEmpty(classSort)){
	 and class_sort=#classSort#
	@}
	
	