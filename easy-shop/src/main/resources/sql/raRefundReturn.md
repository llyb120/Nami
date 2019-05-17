sample
===
* 注释

	select #use("cols")# from ra_refund_return  where  #use("condition")#

cols
===
	refund_id,order_id,order_sn,refund_sn,store_id,store_name,buyer_id,buyer_name,goods_id,order_goods_id,goods_name,goods_num,refund_amount,goods_image,order_goods_type,refund_type,seller_state,refund_state,return_type,order_lock,goods_state,add_time,seller_time,admin_time,reason_id,reason_info,pic_info,buyer_message,seller_message,admin_message,express_id,invoice_no,ship_time,delay_time,receive_time,receive_message,commis_rate,daddress_id,refund_address

updateSample
===
	
	refund_id=#refundId#,order_id=#orderId#,order_sn=#orderSn#,refund_sn=#refundSn#,store_id=#storeId#,store_name=#storeName#,buyer_id=#buyerId#,buyer_name=#buyerName#,goods_id=#goodsId#,order_goods_id=#orderGoodsId#,goods_name=#goodsName#,goods_num=#goodsNum#,refund_amount=#refundAmount#,goods_image=#goodsImage#,order_goods_type=#orderGoodsType#,refund_type=#refundType#,seller_state=#sellerState#,refund_state=#refundState#,return_type=#returnType#,order_lock=#orderLock#,goods_state=#goodsState#,add_time=#addTime#,seller_time=#sellerTime#,admin_time=#adminTime#,reason_id=#reasonId#,reason_info=#reasonInfo#,pic_info=#picInfo#,buyer_message=#buyerMessage#,seller_message=#sellerMessage#,admin_message=#adminMessage#,express_id=#expressId#,invoice_no=#invoiceNo#,ship_time=#shipTime#,delay_time=#delayTime#,receive_time=#receiveTime#,receive_message=#receiveMessage#,commis_rate=#commisRate#,daddress_id=#daddressId#,refund_address=#refundAddress#

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
	@if(!isEmpty(orderGoodsId)){
	 and order_goods_id=#orderGoodsId#
	@}
	@if(!isEmpty(goodsName)){
	 and goods_name=#goodsName#
	@}
	@if(!isEmpty(goodsNum)){
	 and goods_num=#goodsNum#
	@}
	@if(!isEmpty(refundAmount)){
	 and refund_amount=#refundAmount#
	@}
	@if(!isEmpty(goodsImage)){
	 and goods_image=#goodsImage#
	@}
	@if(!isEmpty(orderGoodsType)){
	 and order_goods_type=#orderGoodsType#
	@}
	@if(!isEmpty(refundType)){
	 and refund_type=#refundType#
	@}
	@if(!isEmpty(sellerState)){
	 and seller_state=#sellerState#
	@}
	@if(!isEmpty(refundState)){
	 and refund_state=#refundState#
	@}
	@if(!isEmpty(returnType)){
	 and return_type=#returnType#
	@}
	@if(!isEmpty(orderLock)){
	 and order_lock=#orderLock#
	@}
	@if(!isEmpty(goodsState)){
	 and goods_state=#goodsState#
	@}
	@if(!isEmpty(addTime)){
	 and add_time=#addTime#
	@}
	@if(!isEmpty(sellerTime)){
	 and seller_time=#sellerTime#
	@}
	@if(!isEmpty(adminTime)){
	 and admin_time=#adminTime#
	@}
	@if(!isEmpty(reasonId)){
	 and reason_id=#reasonId#
	@}
	@if(!isEmpty(reasonInfo)){
	 and reason_info=#reasonInfo#
	@}
	@if(!isEmpty(picInfo)){
	 and pic_info=#picInfo#
	@}
	@if(!isEmpty(buyerMessage)){
	 and buyer_message=#buyerMessage#
	@}
	@if(!isEmpty(sellerMessage)){
	 and seller_message=#sellerMessage#
	@}
	@if(!isEmpty(adminMessage)){
	 and admin_message=#adminMessage#
	@}
	@if(!isEmpty(expressId)){
	 and express_id=#expressId#
	@}
	@if(!isEmpty(invoiceNo)){
	 and invoice_no=#invoiceNo#
	@}
	@if(!isEmpty(shipTime)){
	 and ship_time=#shipTime#
	@}
	@if(!isEmpty(delayTime)){
	 and delay_time=#delayTime#
	@}
	@if(!isEmpty(receiveTime)){
	 and receive_time=#receiveTime#
	@}
	@if(!isEmpty(receiveMessage)){
	 and receive_message=#receiveMessage#
	@}
	@if(!isEmpty(commisRate)){
	 and commis_rate=#commisRate#
	@}
	@if(!isEmpty(daddressId)){
	 and daddress_id=#daddressId#
	@}
	@if(!isEmpty(refundAddress)){
	 and refund_address=#refundAddress#
	@}
	
	