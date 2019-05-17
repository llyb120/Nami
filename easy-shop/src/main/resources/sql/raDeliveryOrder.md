sample
===
* 注释

	select #use("cols")# from ra_delivery_order  where  #use("condition")#

cols
===
	order_id,addtime,order_sn,dlyp_id,shipping_code,express_code,express_name,reciver_name,reciver_telphone,reciver_mobphone,dlyo_state,dlyo_pickup_code

updateSample
===
	
	order_id=#orderId#,addtime=#addtime#,order_sn=#orderSn#,dlyp_id=#dlypId#,shipping_code=#shippingCode#,express_code=#expressCode#,express_name=#expressName#,reciver_name=#reciverName#,reciver_telphone=#reciverTelphone#,reciver_mobphone=#reciverMobphone#,dlyo_state=#dlyoState#,dlyo_pickup_code=#dlyoPickupCode#

condition
===

	1 = 1  
	@if(!isEmpty(orderId)){
	 and order_id=#orderId#
	@}
	@if(!isEmpty(addtime)){
	 and addtime=#addtime#
	@}
	@if(!isEmpty(orderSn)){
	 and order_sn=#orderSn#
	@}
	@if(!isEmpty(dlypId)){
	 and dlyp_id=#dlypId#
	@}
	@if(!isEmpty(shippingCode)){
	 and shipping_code=#shippingCode#
	@}
	@if(!isEmpty(expressCode)){
	 and express_code=#expressCode#
	@}
	@if(!isEmpty(expressName)){
	 and express_name=#expressName#
	@}
	@if(!isEmpty(reciverName)){
	 and reciver_name=#reciverName#
	@}
	@if(!isEmpty(reciverTelphone)){
	 and reciver_telphone=#reciverTelphone#
	@}
	@if(!isEmpty(reciverMobphone)){
	 and reciver_mobphone=#reciverMobphone#
	@}
	@if(!isEmpty(dlyoState)){
	 and dlyo_state=#dlyoState#
	@}
	@if(!isEmpty(dlyoPickupCode)){
	 and dlyo_pickup_code=#dlyoPickupCode#
	@}
	
	