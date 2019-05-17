sample
===
* 注释

	select #use("cols")# from ra_store_extend  where  #use("condition")#

cols
===
	store_id,express,pricerange,orderpricerange

updateSample
===
	
	store_id=#storeId#,express=#express#,pricerange=#pricerange#,orderpricerange=#orderpricerange#

condition
===

	1 = 1  
	@if(!isEmpty(storeId)){
	 and store_id=#storeId#
	@}
	@if(!isEmpty(express)){
	 and express=#express#
	@}
	@if(!isEmpty(pricerange)){
	 and pricerange=#pricerange#
	@}
	@if(!isEmpty(orderpricerange)){
	 and orderpricerange=#orderpricerange#
	@}
	
	