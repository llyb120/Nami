sample
===
* 注释

	select #use("cols")# from ra_p_booth_goods  where  #use("condition")#

cols
===
	booth_goods_id,store_id,goods_id,gc_id,booth_state

updateSample
===
	
	booth_goods_id=#boothGoodsId#,store_id=#storeId#,goods_id=#goodsId#,gc_id=#gcId#,booth_state=#boothState#

condition
===

	1 = 1  
	@if(!isEmpty(boothGoodsId)){
	 and booth_goods_id=#boothGoodsId#
	@}
	@if(!isEmpty(storeId)){
	 and store_id=#storeId#
	@}
	@if(!isEmpty(goodsId)){
	 and goods_id=#goodsId#
	@}
	@if(!isEmpty(gcId)){
	 and gc_id=#gcId#
	@}
	@if(!isEmpty(boothState)){
	 and booth_state=#boothState#
	@}
	
	