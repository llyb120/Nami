sample
===
* 注释

	select #use("cols")# from ra_circle_thg  where  #use("condition")#

cols
===
	themegoods_id,theme_id,reply_id,circle_id,goods_id,goods_name,goods_price,goods_image,store_id,thg_type,thg_url

updateSample
===
	
	themegoods_id=#themegoodsId#,theme_id=#themeId#,reply_id=#replyId#,circle_id=#circleId#,goods_id=#goodsId#,goods_name=#goodsName#,goods_price=#goodsPrice#,goods_image=#goodsImage#,store_id=#storeId#,thg_type=#thgType#,thg_url=#thgUrl#

condition
===

	1 = 1  
	@if(!isEmpty(themegoodsId)){
	 and themegoods_id=#themegoodsId#
	@}
	@if(!isEmpty(themeId)){
	 and theme_id=#themeId#
	@}
	@if(!isEmpty(replyId)){
	 and reply_id=#replyId#
	@}
	@if(!isEmpty(circleId)){
	 and circle_id=#circleId#
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
	@if(!isEmpty(goodsImage)){
	 and goods_image=#goodsImage#
	@}
	@if(!isEmpty(storeId)){
	 and store_id=#storeId#
	@}
	@if(!isEmpty(thgType)){
	 and thg_type=#thgType#
	@}
	@if(!isEmpty(thgUrl)){
	 and thg_url=#thgUrl#
	@}
	
	