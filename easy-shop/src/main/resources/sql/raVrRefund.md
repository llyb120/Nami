sample
===
* 注释

	select #use("cols")# from ra_vr_refund  where  #use("condition")#

cols
===
	refund_id,order_id,order_sn,refund_sn,store_id,store_name,buyer_id,buyer_name,goods_id,goods_num,goods_name,goods_image,code_sn,refund_amount,admin_state,add_time,admin_time,buyer_message,admin_message,commis_rate

updateSample
===
	
	refund_id=#refundId#,order_id=#orderId#,order_sn=#orderSn#,refund_sn=#refundSn#,store_id=#storeId#,store_name=#storeName#,buyer_id=#buyerId#,buyer_name=#buyerName#,goods_id=#goodsId#,goods_num=#goodsNum#,goods_name=#goodsName#,goods_image=#goodsImage#,code_sn=#codeSn#,refund_amount=#refundAmount#,admin_state=#adminState#,add_time=#addTime#,admin_time=#adminTime#,buyer_message=#buyerMessage#,admin_message=#adminMessage#,commis_rate=#commisRate#

condition
===

	1 = 1  
	@if(!isEmpty(refundId)){
	 and refund_id=#refundId#
	@}
	@if(!isEmpty(orderId)){
	 and order_id=#orderId#
	@}
	@if(!isEmpty(orderSn)){
	 and order_sn=#orderSn#
	@}
	@if(!isEmpty(refundSn)){
	 and refund_sn=#refundSn#
	@}
	@if(!isEmpty(storeId)){
	 and store_id=#storeId#
	@}
	@if(!isEmpty(storeName)){
	 and store_name=#storeName#
	@}
	@if(!isEmpty(buyerId)){
	 and buyer_id=#buyerId#
	@}
	@if(!isEmpty(buyerName)){
	 and buyer_name=#buyerName#
	@}
	@if(!isEmpty(goodsId)){
	 and goods_id=#goodsId#
	@}
	@if(!isEmpty(goodsNum)){
	 and goods_num=#goodsNum#
	@}
	@if(!isEmpty(goodsName)){
	 and goods_name=#goodsName#
	@}
	@if(!isEmpty(goodsImage)){
	 and goods_image=#goodsImage#
	@}
	@if(!isEmpty(codeSn)){
	 and code_sn=#codeSn#
	@}
	@if(!isEmpty(refundAmount)){
	 and refund_amount=#refundAmount#
	@}
	@if(!isEmpty(adminState)){
	 and admin_state=#adminState#
	@}
	@if(!isEmpty(addTime)){
	 and add_time=#addTime#
	@}
	@if(!isEmpty(adminTime)){
	 and admin_time=#adminTime#
	@}
	@if(!isEmpty(buyerMessage)){
	 and buyer_message=#buyerMessage#
	@}
	@if(!isEmpty(adminMessage)){
	 and admin_message=#adminMessage#
	@}
	@if(!isEmpty(commisRate)){
	 and commis_rate=#commisRate#
	@}
	
	