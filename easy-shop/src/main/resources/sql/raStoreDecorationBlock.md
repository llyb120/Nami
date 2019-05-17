sample
===
* 注释

	select #use("cols")# from ra_store_decoration_block  where  #use("condition")#

cols
===
	block_id,decoration_id,store_id,block_layout,block_content,block_module_type,block_full_width,block_sort

updateSample
===
	
	block_id=#blockId#,decoration_id=#decorationId#,store_id=#storeId#,block_layout=#blockLayout#,block_content=#blockContent#,block_module_type=#blockModuleType#,block_full_width=#blockFullWidth#,block_sort=#blockSort#

condition
===

	1 = 1  
	@if(!isEmpty(blockId)){
	 and block_id=#blockId#
	@}
	@if(!isEmpty(decorationId)){
	 and decoration_id=#decorationId#
	@}
	@if(!isEmpty(storeId)){
	 and store_id=#storeId#
	@}
	@if(!isEmpty(blockLayout)){
	 and block_layout=#blockLayout#
	@}
	@if(!isEmpty(blockContent)){
	 and block_content=#blockContent#
	@}
	@if(!isEmpty(blockModuleType)){
	 and block_module_type=#blockModuleType#
	@}
	@if(!isEmpty(blockFullWidth)){
	 and block_full_width=#blockFullWidth#
	@}
	@if(!isEmpty(blockSort)){
	 and block_sort=#blockSort#
	@}
	
	