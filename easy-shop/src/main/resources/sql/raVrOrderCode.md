sample
===
* 注释

	select #use("cols")# from ra_vr_order_code  where  #use("condition")#

cols
===
	rec_id,order_id,store_id,buyer_id,vr_code,vr_state,vr_usetime,pay_price,vr_indate,commis_rate,refund_lock,vr_invalid_refund

updateSample
===
	
	rec_id=#recId#,order_id=#orderId#,store_id=#storeId#,buyer_id=#buyerId#,vr_code=#vrCode#,vr_state=#vrState#,vr_usetime=#vrUsetime#,pay_price=#payPrice#,vr_indate=#vrIndate#,commis_rate=#commisRate#,refund_lock=#refundLock#,vr_invalid_refund=#vrInvalidRefund#

condition
===

	1 = 1  
	@if(!isEmpty(recId)){
	 and rec_id=#recId#
	@}
	@if(!isEmpty(orderId)){
	 and order_id=#orderId#
	@}
	@if(!isEmpty(storeId)){
	 and store_id=#storeId#
	@}
	@if(!isEmpty(buyerId)){
	 and buyer_id=#buyerId#
	@}
	@if(!isEmpty(vrCode)){
	 and vr_code=#vrCode#
	@}
	@if(!isEmpty(vrState)){
	 and vr_state=#vrState#
	@}
	@if(!isEmpty(vrUsetime)){
	 and vr_usetime=#vrUsetime#
	@}
	@if(!isEmpty(payPrice)){
	 and pay_price=#payPrice#
	@}
	@if(!isEmpty(vrIndate)){
	 and vr_indate=#vrIndate#
	@}
	@if(!isEmpty(commisRate)){
	 and commis_rate=#commisRate#
	@}
	@if(!isEmpty(refundLock)){
	 and refund_lock=#refundLock#
	@}
	@if(!isEmpty(vrInvalidRefund)){
	 and vr_invalid_refund=#vrInvalidRefund#
	@}
	
	