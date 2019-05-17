sample
===
* 注释

	select #use("cols")# from ra_goods_images  where  #use("condition")#

cols
===
	goods_image_id,goods_commonid,store_id,color_id,goods_image,goods_image_sort,is_default

updateSample
===
	
	goods_image_id=#goodsImageId#,goods_commonid=#goodsCommonid#,store_id=#storeId#,color_id=#colorId#,goods_image=#goodsImage#,goods_image_sort=#goodsImageSort#,is_default=#isDefault#

condition
===

	1 = 1  
	@if(!isEmpty(goodsImageId)){
	 and goods_image_id=#goodsImageId#
	@}
	@if(!isEmpty(goodsCommonid)){
	 and goods_commonid=#goodsCommonid#
	@}
	@if(!isEmpty(storeId)){
	 and store_id=#storeId#
	@}
	@if(!isEmpty(colorId)){
	 and color_id=#colorId#
	@}
	@if(!isEmpty(goodsImage)){
	 and goods_image=#goodsImage#
	@}
	@if(!isEmpty(goodsImageSort)){
	 and goods_image_sort=#goodsImageSort#
	@}
	@if(!isEmpty(isDefault)){
	 and is_default=#isDefault#
	@}
	
	