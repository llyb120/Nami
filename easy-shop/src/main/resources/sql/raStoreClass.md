sample
===
* 注释

	select #use("cols")# from ra_store_class  where  #use("condition")#

cols
===
	sc_id,sc_name,sc_bail,sc_sort

updateSample
===
	
	sc_id=#scId#,sc_name=#scName#,sc_bail=#scBail#,sc_sort=#scSort#

condition
===

	1 = 1  
	@if(!isEmpty(scId)){
	 and sc_id=#scId#
	@}
	@if(!isEmpty(scName)){
	 and sc_name=#scName#
	@}
	@if(!isEmpty(scBail)){
	 and sc_bail=#scBail#
	@}
	@if(!isEmpty(scSort)){
	 and sc_sort=#scSort#
	@}
	
	