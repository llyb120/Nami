sample
===
* 注释

	select #use("cols")# from ra_groupbuy_class  where  #use("condition")#

cols
===
	class_id,class_name,class_parent_id,sort,deep

updateSample
===
	
	class_id=#classId#,class_name=#className#,class_parent_id=#classParentId#,sort=#sort#,deep=#deep#

condition
===

	1 = 1  
	@if(!isEmpty(classId)){
	 and class_id=#classId#
	@}
	@if(!isEmpty(className)){
	 and class_name=#className#
	@}
	@if(!isEmpty(classParentId)){
	 and class_parent_id=#classParentId#
	@}
	@if(!isEmpty(sort)){
	 and sort=#sort#
	@}
	@if(!isEmpty(deep)){
	 and deep=#deep#
	@}
	
	