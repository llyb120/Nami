sample
===
* 注释

	select #use("cols")# from ra_p_xianshi_goods  where  #use("condition")#

cols
===
	xianshi_goods_id,xianshi_id,xianshi_name,xianshi_title,xianshi_explain,goods_id,store_id,goods_name,goods_price,xianshi_price,goods_image,start_time,end_time,lower_limit,state,xianshi_recommend

updateSample
===
	
	xianshi_goods_id=#xianshiGoodsId#,xianshi_id=#xianshiId#,xianshi_name=#xianshiName#,xianshi_title=#xianshiTitle#,xianshi_explain=#xianshiExplain#,goods_id=#goodsId#,store_id=#storeId#,goods_name=#goodsName#,goods_price=#goodsPrice#,xianshi_price=#xianshiPrice#,goods_image=#goodsImage#,start_time=#startTime#,end_time=#endTime#,lower_limit=#lowerLimit#,state=#state#,xianshi_recommend=#xianshiRecommend#

condition
===

	1 = 1  
	@if(!isEmpty(xianshiGoodsId)){
	 and xianshi_goods_id=#xianshiGoodsId#
	@}
	@if(!isEmpty(xianshiId)){
	 and xianshi_id=#xianshiId#
	@}
	@if(!isEmpty(xianshiName)){
	 and xianshi_name=#xianshiName#
	@}
	@if(!isEmpty(xianshiTitle)){
	 and xianshi_title=#xianshiTitle#
	@}
	@if(!isEmpty(xianshiExplain)){
	 and xianshi_explain=#xianshiExplain#
	@}
	@if(!isEmpty(goodsId)){
	 and goods_id=#goodsId#
	@}
	@if(!isEmpty(storeId)){
	 and store_id=#storeId#
	@}
	@if(!isEmpty(goodsName)){
	 and goods_name=#goodsName#
	@}
	@if(!isEmpty(goodsPrice)){
	 and goods_price=#goodsPrice#
	@}
	@if(!isEmpty(xianshiPrice)){
	 and xianshi_price=#xianshiPrice#
	@}
	@if(!isEmpty(goodsImage)){
	 and goods_image=#goodsImage#
	@}
	@if(!isEmpty(startTime)){
	 and start_time=#startTime#
	@}
	@if(!isEmpty(endTime)){
	 and end_time=#endTime#
	@}
	@if(!isEmpty(lowerLimit)){
	 and lower_limit=#lowerLimit#
	@}
	@if(!isEmpty(state)){
	 and state=#state#
	@}
	@if(!isEmpty(xianshiRecommend)){
	 and xianshi_recommend=#xianshiRecommend#
	@}
	
	