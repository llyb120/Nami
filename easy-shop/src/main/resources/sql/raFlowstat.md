sample
===
* 注释

	select #use("cols")# from ra_flowstat  where  #use("condition")#

cols
===
	stattime,clicknum,store_id,type,goods_id

updateSample
===
	
	stattime=#stattime#,clicknum=#clicknum#,store_id=#storeId#,type=#type#,goods_id=#goodsId#

condition
===

	1 = 1  
	@if(!isEmpty(stattime)){
	 and stattime=#stattime#
	@}
	@if(!isEmpty(clicknum)){
	 and clicknum=#clicknum#
	@}
	@if(!isEmpty(storeId)){
	 and store_id=#storeId#
	@}
	@if(!isEmpty(type)){
	 and type=#type#
	@}
	@if(!isEmpty(goodsId)){
	 and goods_id=#goodsId#
	@}
	
	