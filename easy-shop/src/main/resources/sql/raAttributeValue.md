sample
===
* 注释

	select #use("cols")# from ra_attribute_value  where  #use("condition")#

cols
===
	attr_value_id,attr_value_name,attr_id,type_id,attr_value_sort

updateSample
===
	
	attr_value_id=#attrValueId#,attr_value_name=#attrValueName#,attr_id=#attrId#,type_id=#typeId#,attr_value_sort=#attrValueSort#

condition
===

	1 = 1  
	@if(!isEmpty(attrValueId)){
	 and attr_value_id=#attrValueId#
	@}
	@if(!isEmpty(attrValueName)){
	 and attr_value_name=#attrValueName#
	@}
	@if(!isEmpty(attrId)){
	 and attr_id=#attrId#
	@}
	@if(!isEmpty(typeId)){
	 and type_id=#typeId#
	@}
	@if(!isEmpty(attrValueSort)){
	 and attr_value_sort=#attrValueSort#
	@}
	
	