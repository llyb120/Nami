sample
===
* 注释

	select #use("cols")# from ra_weproxy_order_goods_margin  where  #use("condition")#

cols
===
	id,rec_id,goods_id,goods_price,order_id,margin,level,member_id

updateSample
===
	
	id=#id#,rec_id=#recId#,goods_id=#goodsId#,goods_price=#goodsPrice#,order_id=#orderId#,margin=#margin#,level=#level#,member_id=#memberId#

condition
===

	1 = 1  
	@if(!isEmpty(id)){
	 and id=#id#
	@}
	@if(!isEmpty(recId)){
	 and rec_id=#recId#
	@}
	@if(!isEmpty(goodsId)){
	 and goods_id=#goodsId#
	@}
	@if(!isEmpty(goodsPrice)){
	 and goods_price=#goodsPrice#
	@}
	@if(!isEmpty(orderId)){
	 and order_id=#orderId#
	@}
	@if(!isEmpty(margin)){
	 and margin=#margin#
	@}
	@if(!isEmpty(level)){
	 and level=#level#
	@}
	@if(!isEmpty(memberId)){
	 and member_id=#memberId#
	@}
	
	