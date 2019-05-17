sample
===
* 注释

	select #use("cols")# from ra_goods_class  where  #use("condition")#

cols
===
	gc_id,gc_name,type_id,type_name,gc_parent_id,commis_rate,gc_sort,gc_virtual,gc_title,gc_keywords,gc_description

updateSample
===
	
	gc_id=#gcId#,gc_name=#gcName#,type_id=#typeId#,type_name=#typeName#,gc_parent_id=#gcParentId#,commis_rate=#commisRate#,gc_sort=#gcSort#,gc_virtual=#gcVirtual#,gc_title=#gcTitle#,gc_keywords=#gcKeywords#,gc_description=#gcDescription#

condition
===

	1 = 1  
	@if(!isEmpty(gcId)){
	 and gc_id=#gcId#
	@}
	@if(!isEmpty(gcName)){
	 and gc_name=#gcName#
	@}
	@if(!isEmpty(typeId)){
	 and type_id=#typeId#
	@}
	@if(!isEmpty(typeName)){
	 and type_name=#typeName#
	@}
	@if(!isEmpty(gcParentId)){
	 and gc_parent_id=#gcParentId#
	@}
	@if(!isEmpty(commisRate)){
	 and commis_rate=#commisRate#
	@}
	@if(!isEmpty(gcSort)){
	 and gc_sort=#gcSort#
	@}
	@if(!isEmpty(gcVirtual)){
	 and gc_virtual=#gcVirtual#
	@}
	@if(!isEmpty(gcTitle)){
	 and gc_title=#gcTitle#
	@}
	@if(!isEmpty(gcKeywords)){
	 and gc_keywords=#gcKeywords#
	@}
	@if(!isEmpty(gcDescription)){
	 and gc_description=#gcDescription#
	@}
	
	