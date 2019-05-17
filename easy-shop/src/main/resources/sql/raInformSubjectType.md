sample
===
* 注释

	select #use("cols")# from ra_inform_subject_type  where  #use("condition")#

cols
===
	inform_type_id,inform_type_name,inform_type_desc,inform_type_state

updateSample
===
	
	inform_type_id=#informTypeId#,inform_type_name=#informTypeName#,inform_type_desc=#informTypeDesc#,inform_type_state=#informTypeState#

condition
===

	1 = 1  
	@if(!isEmpty(informTypeId)){
	 and inform_type_id=#informTypeId#
	@}
	@if(!isEmpty(informTypeName)){
	 and inform_type_name=#informTypeName#
	@}
	@if(!isEmpty(informTypeDesc)){
	 and inform_type_desc=#informTypeDesc#
	@}
	@if(!isEmpty(informTypeState)){
	 and inform_type_state=#informTypeState#
	@}
	
	