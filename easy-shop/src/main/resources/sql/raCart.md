sample
===
* 注释

	select #use("cols")# from ra_cart  where  #use("condition")#

cols
===
	cart_id,buyer_id,store_id,store_name,goods_id,goods_name,goods_price,goods_num,goods_image,bl_id,checked

updateSample
===
	
	cart_id=#cartId#,buyer_id=#buyerId#,store_id=#storeId#,store_name=#storeName#,goods_id=#goodsId#,goods_name=#goodsName#,goods_price=#goodsPrice#,goods_num=#goodsNum#,goods_image=#goodsImage#,bl_id=#blId#,checked=#checked#

condition
===

	1 = 1  
	@if(!isEmpty(cartId)){
	 and cart_id=#cartId#
	@}
	@if(!isEmpty(buyerId)){
	 and buyer_id=#buyerId#
	@}
	@if(!isEmpty(storeId)){
	 and store_id=#storeId#
	@}
	@if(!isEmpty(storeName)){
	 and store_name=#storeName#
	@}
	@if(!isEmpty(goodsId)){
	 and goods_id=#goodsId#
	@}
	@if(!isEmpty(goodsName)){
	 and goods_name=#goodsName#
	@}
	@if(!isEmpty(goodsPrice)){
	 and goods_price=#goodsPrice#
	@}
	@if(!isEmpty(goodsNum)){
	 and goods_num=#goodsNum#
	@}
	@if(!isEmpty(goodsImage)){
	 and goods_image=#goodsImage#
	@}
	@if(!isEmpty(blId)){
	 and bl_id=#blId#
	@}
	@if(!isEmpty(checked)){
	 and checked=#checked#
	@}
	
	