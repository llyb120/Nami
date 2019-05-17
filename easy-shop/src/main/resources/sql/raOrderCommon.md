sample
===
* 注释

	select #use("cols")# from ra_order_common  where  #use("condition")#

cols
===
	order_id,store_id,shipping_time,shipping_express_id,evaluation_time,evalseller_state,evalseller_time,order_message,order_pointscount,voucher_price,voucher_code,deliver_explain,daddress_id,reciver_name,reciver_info,reciver_province_id,reciver_city_id,reciver_area_id,invoice_info,promotion_info,dlyo_pickup_code,phone,idcard,address

updateSample
===
	
	order_id=#orderId#,store_id=#storeId#,shipping_time=#shippingTime#,shipping_express_id=#shippingExpressId#,evaluation_time=#evaluationTime#,evalseller_state=#evalsellerState#,evalseller_time=#evalsellerTime#,order_message=#orderMessage#,order_pointscount=#orderPointscount#,voucher_price=#voucherPrice#,voucher_code=#voucherCode#,deliver_explain=#deliverExplain#,daddress_id=#daddressId#,reciver_name=#reciverName#,reciver_info=#reciverInfo#,reciver_province_id=#reciverProvinceId#,reciver_city_id=#reciverCityId#,reciver_area_id=#reciverAreaId#,invoice_info=#invoiceInfo#,promotion_info=#promotionInfo#,dlyo_pickup_code=#dlyoPickupCode#,phone=#phone#,idcard=#idcard#,address=#address#

condition
===

	1 = 1  
	@if(!isEmpty(orderId)){
	 and order_id=#orderId#
	@}
	@if(!isEmpty(storeId)){
	 and store_id=#storeId#
	@}
	@if(!isEmpty(shippingTime)){
	 and shipping_time=#shippingTime#
	@}
	@if(!isEmpty(shippingExpressId)){
	 and shipping_express_id=#shippingExpressId#
	@}
	@if(!isEmpty(evaluationTime)){
	 and evaluation_time=#evaluationTime#
	@}
	@if(!isEmpty(evalsellerState)){
	 and evalseller_state=#evalsellerState#
	@}
	@if(!isEmpty(evalsellerTime)){
	 and evalseller_time=#evalsellerTime#
	@}
	@if(!isEmpty(orderMessage)){
	 and order_message=#orderMessage#
	@}
	@if(!isEmpty(orderPointscount)){
	 and order_pointscount=#orderPointscount#
	@}
	@if(!isEmpty(voucherPrice)){
	 and voucher_price=#voucherPrice#
	@}
	@if(!isEmpty(voucherCode)){
	 and voucher_code=#voucherCode#
	@}
	@if(!isEmpty(deliverExplain)){
	 and deliver_explain=#deliverExplain#
	@}
	@if(!isEmpty(daddressId)){
	 and daddress_id=#daddressId#
	@}
	@if(!isEmpty(reciverName)){
	 and reciver_name=#reciverName#
	@}
	@if(!isEmpty(reciverInfo)){
	 and reciver_info=#reciverInfo#
	@}
	@if(!isEmpty(reciverProvinceId)){
	 and reciver_province_id=#reciverProvinceId#
	@}
	@if(!isEmpty(reciverCityId)){
	 and reciver_city_id=#reciverCityId#
	@}
	@if(!isEmpty(reciverAreaId)){
	 and reciver_area_id=#reciverAreaId#
	@}
	@if(!isEmpty(invoiceInfo)){
	 and invoice_info=#invoiceInfo#
	@}
	@if(!isEmpty(promotionInfo)){
	 and promotion_info=#promotionInfo#
	@}
	@if(!isEmpty(dlyoPickupCode)){
	 and dlyo_pickup_code=#dlyoPickupCode#
	@}
	@if(!isEmpty(phone)){
	 and phone=#phone#
	@}
	@if(!isEmpty(idcard)){
	 and idcard=#idcard#
	@}
	@if(!isEmpty(address)){
	 and address=#address#
	@}
	
	