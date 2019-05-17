sample
===
* 注释

	select #use("cols")# from ra_p_bundling_goods  where  #use("condition")#

cols
===
	bl_goods_id,bl_id,goods_id,goods_name,goods_image,bl_goods_price,bl_appoint

updateSample
===
	
	bl_goods_id=#blGoodsId#,bl_id=#blId#,goods_id=#goodsId#,goods_name=#goodsName#,goods_image=#goodsImage#,bl_goods_price=#blGoodsPrice#,bl_appoint=#blAppoint#

condition
===

	1 = 1  
	@if(!isEmpty(blGoodsId)){
	 and bl_goods_id=#blGoodsId#
	@}
	@if(!isEmpty(blId)){
	 and bl_id=#blId#
	@}
	@if(!isEmpty(goodsId)){
	 and goods_id=#goodsId#
	@}
	@if(!isEmpty(goodsName)){
	 and goods_name=#goodsName#
	@}
	@if(!isEmpty(goodsImage)){
	 and goods_image=#goodsImage#
	@}
	@if(!isEmpty(blGoodsPrice)){
	 and bl_goods_price=#blGoodsPrice#
	@}
	@if(!isEmpty(blAppoint)){
	 and bl_appoint=#blAppoint#
	@}
	
	