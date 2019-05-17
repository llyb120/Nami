sample
===
* 注释

	select #use("cols")# from ra_attribute  where  #use("condition")#

cols
===
	attr_id,attr_name,type_id,attr_value,attr_show,attr_sort

updateSample
===
	
	attr_id=#attrId#,attr_name=#attrName#,type_id=#typeId#,attr_value=#attrValue#,attr_show=#attrShow#,attr_sort=#attrSort#

condition
===

	1 = 1  
	@if(!isEmpty(attrId)){
	 and attr_id=#attrId#
	@}
	@if(!isEmpty(attrName)){
	 and attr_name=#attrName#
	@}
	@if(!isEmpty(typeId)){
	 and type_id=#typeId#
	@}
	@if(!isEmpty(attrValue)){
	 and attr_value=#attrValue#
	@}
	@if(!isEmpty(attrShow)){
	 and attr_show=#attrShow#
	@}
	@if(!isEmpty(attrSort)){
	 and attr_sort=#attrSort#
	@}
	
	