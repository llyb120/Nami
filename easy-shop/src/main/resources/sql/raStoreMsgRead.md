sample
===
* 注释

	select #use("cols")# from ra_store_msg_read  where  #use("condition")#

cols
===
	sm_id,seller_id,read_time

updateSample
===
	
	sm_id=#smId#,seller_id=#sellerId#,read_time=#readTime#

condition
===

	1 = 1  
	@if(!isEmpty(smId)){
	 and sm_id=#smId#
	@}
	@if(!isEmpty(sellerId)){
	 and seller_id=#sellerId#
	@}
	@if(!isEmpty(readTime)){
	 and read_time=#readTime#
	@}
	
	