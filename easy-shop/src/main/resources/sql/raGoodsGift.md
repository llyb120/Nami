sample
===
* 注释

	select #use("cols")# from ra_goods_gift  where  #use("condition")#

cols
===
	gift_id,goods_id,goods_commonid,gift_goodsid,gift_goodsname,gift_goodsimage,gift_amount

updateSample
===
	
	gift_id=#giftId#,goods_id=#goodsId#,goods_commonid=#goodsCommonid#,gift_goodsid=#giftGoodsid#,gift_goodsname=#giftGoodsname#,gift_goodsimage=#giftGoodsimage#,gift_amount=#giftAmount#

condition
===

	1 = 1  
	@if(!isEmpty(giftId)){
	 and gift_id=#giftId#
	@}
	@if(!isEmpty(goodsId)){
	 and goods_id=#goodsId#
	@}
	@if(!isEmpty(goodsCommonid)){
	 and goods_commonid=#goodsCommonid#
	@}
	@if(!isEmpty(giftGoodsid)){
	 and gift_goodsid=#giftGoodsid#
	@}
	@if(!isEmpty(giftGoodsname)){
	 and gift_goodsname=#giftGoodsname#
	@}
	@if(!isEmpty(giftGoodsimage)){
	 and gift_goodsimage=#giftGoodsimage#
	@}
	@if(!isEmpty(giftAmount)){
	 and gift_amount=#giftAmount#
	@}
	
	