sample
===
* 注释

	select #use("cols")# from ra_circle_class  where  #use("condition")#

cols
===
	class_id,class_name,class_addtime,class_sort,class_status,is_recommend

updateSample
===
	
	class_id=#classId#,class_name=#className#,class_addtime=#classAddtime#,class_sort=#classSort#,class_status=#classStatus#,is_recommend=#isRecommend#

condition
===

	1 = 1  
	@if(!isEmpty(classId)){
	 and class_id=#classId#
	@}
	@if(!isEmpty(className)){
	 and class_name=#className#
	@}
	@if(!isEmpty(classAddtime)){
	 and class_addtime=#classAddtime#
	@}
	@if(!isEmpty(classSort)){
	 and class_sort=#classSort#
	@}
	@if(!isEmpty(classStatus)){
	 and class_status=#classStatus#
	@}
	@if(!isEmpty(isRecommend)){
	 and is_recommend=#isRecommend#
	@}
	
	