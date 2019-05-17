sample
===
* 注释

	select #use("cols")# from ra_stat_order  where  #use("condition")#

cols
===
	order_id,order_sn,order_add_time,payment_code,order_amount,shipping_fee,evaluation_state,order_state,refund_state,refund_amount,order_from,order_isvalid,reciver_province_id,store_id,store_name,grade_id,sc_id,buyer_id,buyer_name

updateSample
===
	
	order_id=#orderId#,order_sn=#orderSn#,order_add_time=#orderAddTime#,payment_code=#paymentCode#,order_amount=#orderAmount#,shipping_fee=#shippingFee#,evaluation_state=#evaluationState#,order_state=#orderState#,refund_state=#refundState#,refund_amount=#refundAmount#,order_from=#orderFrom#,order_isvalid=#orderIsvalid#,reciver_province_id=#reciverProvinceId#,store_id=#storeId#,store_name=#storeName#,grade_id=#gradeId#,sc_id=#scId#,buyer_id=#buyerId#,buyer_name=#buyerName#

condition
===

	1 = 1  
	@if(!isEmpty(orderId)){
	 and order_id=#orderId#
	@}
	@if(!isEmpty(orderSn)){
	 and order_sn=#orderSn#
	@}
	@if(!isEmpty(orderAddTime)){
	 and order_add_time=#orderAddTime#
	@}
	@if(!isEmpty(paymentCode)){
	 and payment_code=#paymentCode#
	@}
	@if(!isEmpty(orderAmount)){
	 and order_amount=#orderAmount#
	@}
	@if(!isEmpty(shippingFee)){
	 and shipping_fee=#shippingFee#
	@}
	@if(!isEmpty(evaluationState)){
	 and evaluation_state=#evaluationState#
	@}
	@if(!isEmpty(orderState)){
	 and order_state=#orderState#
	@}
	@if(!isEmpty(refundState)){
	 and refund_state=#refundState#
	@}
	@if(!isEmpty(refundAmount)){
	 and refund_amount=#refundAmount#
	@}
	@if(!isEmpty(orderFrom)){
	 and order_from=#orderFrom#
	@}
	@if(!isEmpty(orderIsvalid)){
	 and order_isvalid=#orderIsvalid#
	@}
	@if(!isEmpty(reciverProvinceId)){
	 and reciver_province_id=#reciverProvinceId#
	@}
	@if(!isEmpty(storeId)){
	 and store_id=#storeId#
	@}
	@if(!isEmpty(storeName)){
	 and store_name=#storeName#
	@}
	@if(!isEmpty(gradeId)){
	 and grade_id=#gradeId#
	@}
	@if(!isEmpty(scId)){
	 and sc_id=#scId#
	@}
	@if(!isEmpty(buyerId)){
	 and buyer_id=#buyerId#
	@}
	@if(!isEmpty(buyerName)){
	 and buyer_name=#buyerName#
	@}
	
	