sample
===
* 注释

	select #use("cols")# from ra_store_navigation  where  #use("condition")#

cols
===
	sn_id,sn_title,sn_store_id,sn_content,sn_sort,sn_if_show,sn_add_time,sn_url,sn_new_open

updateSample
===
	
	sn_id=#snId#,sn_title=#snTitle#,sn_store_id=#snStoreId#,sn_content=#snContent#,sn_sort=#snSort#,sn_if_show=#snIfShow#,sn_add_time=#snAddTime#,sn_url=#snUrl#,sn_new_open=#snNewOpen#

condition
===

	1 = 1  
	@if(!isEmpty(snId)){
	 and sn_id=#snId#
	@}
	@if(!isEmpty(snTitle)){
	 and sn_title=#snTitle#
	@}
	@if(!isEmpty(snStoreId)){
	 and sn_store_id=#snStoreId#
	@}
	@if(!isEmpty(snContent)){
	 and sn_content=#snContent#
	@}
	@if(!isEmpty(snSort)){
	 and sn_sort=#snSort#
	@}
	@if(!isEmpty(snIfShow)){
	 and sn_if_show=#snIfShow#
	@}
	@if(!isEmpty(snAddTime)){
	 and sn_add_time=#snAddTime#
	@}
	@if(!isEmpty(snUrl)){
	 and sn_url=#snUrl#
	@}
	@if(!isEmpty(snNewOpen)){
	 and sn_new_open=#snNewOpen#
	@}
	
	