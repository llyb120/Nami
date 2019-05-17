sample
===
* 注释

	select #use("cols")# from ra_spec_value  where  #use("condition")#

cols
===
	sp_value_id,sp_value_name,sp_id,gc_id,store_id,sp_value_color,sp_value_sort

updateSample
===
	
	sp_value_id=#spValueId#,sp_value_name=#spValueName#,sp_id=#spId#,gc_id=#gcId#,store_id=#storeId#,sp_value_color=#spValueColor#,sp_value_sort=#spValueSort#

condition
===

	1 = 1  
	@if(!isEmpty(spValueId)){
	 and sp_value_id=#spValueId#
	@}
	@if(!isEmpty(spValueName)){
	 and sp_value_name=#spValueName#
	@}
	@if(!isEmpty(spId)){
	 and sp_id=#spId#
	@}
	@if(!isEmpty(gcId)){
	 and gc_id=#gcId#
	@}
	@if(!isEmpty(storeId)){
	 and store_id=#storeId#
	@}
	@if(!isEmpty(spValueColor)){
	 and sp_value_color=#spValueColor#
	@}
	@if(!isEmpty(spValueSort)){
	 and sp_value_sort=#spValueSort#
	@}
	
	