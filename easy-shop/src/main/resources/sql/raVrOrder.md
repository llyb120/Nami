sample
===
* 注释

	select #use("cols")# from ra_vr_order  where  #use("condition")#

cols
===
	order_id,order_sn,store_id,store_name,buyer_id,buyer_name,buyer_phone,add_time,payment_code,payment_time,trade_no,close_time,close_reason,finnshed_time,order_amount,refund_amount,rcb_amount,pd_amount,order_state,refund_state,buyer_msg,delete_state,goods_id,goods_name,goods_price,goods_num,goods_image,commis_rate,gc_id,vr_indate,vr_send_times,vr_invalid_refund,order_promotion_type,promotions_id,order_from,evaluation_state,evaluation_time,use_state

updateSample
===
	
	order_id=#orderId#,order_sn=#orderSn#,store_id=#storeId#,store_name=#storeName#,buyer_id=#buyerId#,buyer_name=#buyerName#,buyer_phone=#buyerPhone#,add_time=#addTime#,payment_code=#paymentCode#,payment_time=#paymentTime#,trade_no=#tradeNo#,close_time=#closeTime#,close_reason=#closeReason#,finnshed_time=#finnshedTime#,order_amount=#orderAmount#,refund_amount=#refundAmount#,rcb_amount=#rcbAmount#,pd_amount=#pdAmount#,order_state=#orderState#,refund_state=#refundState#,buyer_msg=#buyerMsg#,delete_state=#deleteState#,goods_id=#goodsId#,goods_name=#goodsName#,goods_price=#goodsPrice#,goods_num=#goodsNum#,goods_image=#goodsImage#,commis_rate=#commisRate#,gc_id=#gcId#,vr_indate=#vrIndate#,vr_send_times=#vrSendTimes#,vr_invalid_refund=#vrInvalidRefund#,order_promotion_type=#orderPromotionType#,promotions_id=#promotionsId#,order_from=#orderFrom#,evaluation_state=#evaluationState#,evaluation_time=#evaluationTime#,use_state=#useState#

condition
===

	1 = 1  
	@if(!isEmpty(orderId)){
	 and order_id=#orderId#
	@}
	@if(!isEmpty(orderSn)){
	 and order_sn=#orderSn#
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
	@if(!isEmpty(buyerPhone)){
	 and buyer_phone=#buyerPhone#
	@}
	@if(!isEmpty(addTime)){
	 and add_time=#addTime#
	@}
	@if(!isEmpty(paymentCode)){
	 and payment_code=#paymentCode#
	@}
	@if(!isEmpty(paymentTime)){
	 and payment_time=#paymentTime#
	@}
	@if(!isEmpty(tradeNo)){
	 and trade_no=#tradeNo#
	@}
	@if(!isEmpty(closeTime)){
	 and close_time=#closeTime#
	@}
	@if(!isEmpty(closeReason)){
	 and close_reason=#closeReason#
	@}
	@if(!isEmpty(finnshedTime)){
	 and finnshed_time=#finnshedTime#
	@}
	@if(!isEmpty(orderAmount)){
	 and order_amount=#orderAmount#
	@}
	@if(!isEmpty(refundAmount)){
	 and refund_amount=#refundAmount#
	@}
	@if(!isEmpty(rcbAmount)){
	 and rcb_amount=#rcbAmount#
	@}
	@if(!isEmpty(pdAmount)){
	 and pd_amount=#pdAmount#
	@}
	@if(!isEmpty(orderState)){
	 and order_state=#orderState#
	@}
	@if(!isEmpty(refundState)){
	 and refund_state=#refundState#
	@}
	@if(!isEmpty(buyerMsg)){
	 and buyer_msg=#buyerMsg#
	@}
	@if(!isEmpty(deleteState)){
	 and delete_state=#deleteState#
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
	@if(!isEmpty(commisRate)){
	 and commis_rate=#commisRate#
	@}
	@if(!isEmpty(gcId)){
	 and gc_id=#gcId#
	@}
	@if(!isEmpty(vrIndate)){
	 and vr_indate=#vrIndate#
	@}
	@if(!isEmpty(vrSendTimes)){
	 and vr_send_times=#vrSendTimes#
	@}
	@if(!isEmpty(vrInvalidRefund)){
	 and vr_invalid_refund=#vrInvalidRefund#
	@}
	@if(!isEmpty(orderPromotionType)){
	 and order_promotion_type=#orderPromotionType#
	@}
	@if(!isEmpty(promotionsId)){
	 and promotions_id=#promotionsId#
	@}
	@if(!isEmpty(orderFrom)){
	 and order_from=#orderFrom#
	@}
	@if(!isEmpty(evaluationState)){
	 and evaluation_state=#evaluationState#
	@}
	@if(!isEmpty(evaluationTime)){
	 and evaluation_time=#evaluationTime#
	@}
	@if(!isEmpty(useState)){
	 and use_state=#useState#
	@}
	
	