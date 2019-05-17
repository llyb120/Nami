sample
===
* 注释

	select #use("cols")# from ra_order_goods  where  #use("condition")#

cols
===
	rec_id,order_id,goods_id,goods_name,goods_price,goods_num,goods_image,goods_pay_price,store_id,buyer_id,goods_type,promotions_id,commis_rate,gc_id,tax,source_price,goods_proxy,margin,real_count,hangzhou_details,mobile_margin

updateSample
===
	
	rec_id=#recId#,order_id=#orderId#,goods_id=#goodsId#,goods_name=#goodsName#,goods_price=#goodsPrice#,goods_num=#goodsNum#,goods_image=#goodsImage#,goods_pay_price=#goodsPayPrice#,store_id=#storeId#,buyer_id=#buyerId#,goods_type=#goodsType#,promotions_id=#promotionsId#,commis_rate=#commisRate#,gc_id=#gcId#,tax=#tax#,source_price=#sourcePrice#,goods_proxy=#goodsProxy#,margin=#margin#,real_count=#realCount#,hangzhou_details=#hangzhouDetails#,mobile_margin=#mobileMargin#

condition
===

	1 = 1  
	@if(!isEmpty(recId)){
	 and rec_id=#recId#
	@}
	@if(!isEmpty(orderId)){
	 and order_id=#orderId#
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
	@if(!isEmpty(goodsPayPrice)){
	 and goods_pay_price=#goodsPayPrice#
	@}
	@if(!isEmpty(storeId)){
	 and store_id=#storeId#
	@}
	@if(!isEmpty(buyerId)){
	 and buyer_id=#buyerId#
	@}
	@if(!isEmpty(goodsType)){
	 and goods_type=#goodsType#
	@}
	@if(!isEmpty(promotionsId)){
	 and promotions_id=#promotionsId#
	@}
	@if(!isEmpty(commisRate)){
	 and commis_rate=#commisRate#
	@}
	@if(!isEmpty(gcId)){
	 and gc_id=#gcId#
	@}
	@if(!isEmpty(tax)){
	 and tax=#tax#
	@}
	@if(!isEmpty(sourcePrice)){
	 and source_price=#sourcePrice#
	@}
	@if(!isEmpty(goodsProxy)){
	 and goods_proxy=#goodsProxy#
	@}
	@if(!isEmpty(margin)){
	 and margin=#margin#
	@}
	@if(!isEmpty(realCount)){
	 and real_count=#realCount#
	@}
	@if(!isEmpty(hangzhouDetails)){
	 and hangzhou_details=#hangzhouDetails#
	@}
	@if(!isEmpty(mobileMargin)){
	 and mobile_margin=#mobileMargin#
	@}
	
	