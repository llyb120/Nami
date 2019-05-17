店铺订单查询
===
select 
@pageTag(){
#use("cols")# 
@}
from ra_order  where  #use("condition")#

sample
===
* 注释

	select #use("cols")# from ra_order  where  #use("condition")#

cols
===
	order_id,order_sn,pay_sn,store_id,store_name,buyer_id,buyer_name,buyer_email,add_time,payment_code,payment_time,finnshed_time,goods_amount,order_amount,rcb_amount,pd_amount,shipping_fee,evaluation_state,order_state,refund_state,lock_state,delete_state,refund_amount,delay_time,order_from,shipping_code,margin,wxpay,vertify_state,is_tax_order,phone,address,idcard,receiver_name,order_tax,hangzhou_state,hangzhou_details,print_pdf,shenzhen_record_status,shenzhen_audit_status,express_status,payStatus,proAmount,shenzhen_record_status_traffic,shenzhen_audit_status_traffic,out_order,is_we_groupbuy,we_groupbuying_id,out_order_sn,out_order_sn2,is_zhiyou,out_source_data,import_sn,api_pay_sn,is_whole,n_buyer_phone,n_buyer_true_name,n_buyer_idcard,zip,order_weight,is_pull_kjy,is_joinpay_alloc

updateSample
===
	
	order_id=#orderId#,order_sn=#orderSn#,pay_sn=#paySn#,store_id=#storeId#,store_name=#storeName#,buyer_id=#buyerId#,buyer_name=#buyerName#,buyer_email=#buyerEmail#,add_time=#addTime#,payment_code=#paymentCode#,payment_time=#paymentTime#,finnshed_time=#finnshedTime#,goods_amount=#goodsAmount#,order_amount=#orderAmount#,rcb_amount=#rcbAmount#,pd_amount=#pdAmount#,shipping_fee=#shippingFee#,evaluation_state=#evaluationState#,order_state=#orderState#,refund_state=#refundState#,lock_state=#lockState#,delete_state=#deleteState#,refund_amount=#refundAmount#,delay_time=#delayTime#,order_from=#orderFrom#,shipping_code=#shippingCode#,margin=#margin#,wxpay=#wxpay#,vertify_state=#vertifyState#,is_tax_order=#isTaxOrder#,phone=#phone#,address=#address#,idcard=#idcard#,receiver_name=#receiverName#,order_tax=#orderTax#,hangzhou_state=#hangzhouState#,hangzhou_details=#hangzhouDetails#,print_pdf=#printPdf#,shenzhen_record_status=#shenzhenRecordStatus#,shenzhen_audit_status=#shenzhenAuditStatus#,express_status=#expressStatus#,payStatus=#paystatus#,proAmount=#proamount#,shenzhen_record_status_traffic=#shenzhenRecordStatusTraffic#,shenzhen_audit_status_traffic=#shenzhenAuditStatusTraffic#,out_order=#outOrder#,is_we_groupbuy=#isWeGroupbuy#,we_groupbuying_id=#weGroupbuyingId#,out_order_sn=#outOrderSn#,out_order_sn2=#outOrderSn2#,is_zhiyou=#isZhiyou#,out_source_data=#outSourceData#,import_sn=#importSn#,api_pay_sn=#apiPaySn#,is_whole=#isWhole#,n_buyer_phone=#nBuyerPhone#,n_buyer_true_name=#nBuyerTrueName#,n_buyer_idcard=#nBuyerIdcard#,zip=#zip#,order_weight=#orderWeight#,is_pull_kjy=#isPullKjy#,is_joinpay_alloc=#isJoinpayAlloc#

condition
===

	1 = 1  
	@if(!isEmpty(orderId)){
	 and order_id=#orderId#
	@}
	@if(!isEmpty(orderSn)){
	 and order_sn=#orderSn#
	@}
	@if(!isEmpty(paySn)){
	 and pay_sn=#paySn#
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
	@if(!isEmpty(buyerEmail)){
	 and buyer_email=#buyerEmail#
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
	@if(!isEmpty(finnshedTime)){
	 and finnshed_time=#finnshedTime#
	@}
	@if(!isEmpty(goodsAmount)){
	 and goods_amount=#goodsAmount#
	@}
	@if(!isEmpty(orderAmount)){
	 and order_amount=#orderAmount#
	@}
	@if(!isEmpty(rcbAmount)){
	 and rcb_amount=#rcbAmount#
	@}
	@if(!isEmpty(pdAmount)){
	 and pd_amount=#pdAmount#
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
	@if(!isEmpty(lockState)){
	 and lock_state=#lockState#
	@}
	@if(!isEmpty(deleteState)){
	 and delete_state=#deleteState#
	@}
	@if(!isEmpty(refundAmount)){
	 and refund_amount=#refundAmount#
	@}
	@if(!isEmpty(delayTime)){
	 and delay_time=#delayTime#
	@}
	@if(!isEmpty(orderFrom)){
	 and order_from=#orderFrom#
	@}
	@if(!isEmpty(shippingCode)){
	 and shipping_code=#shippingCode#
	@}
	@if(!isEmpty(margin)){
	 and margin=#margin#
	@}
	@if(!isEmpty(wxpay)){
	 and wxpay=#wxpay#
	@}
	@if(!isEmpty(vertifyState)){
	 and vertify_state=#vertifyState#
	@}
	@if(!isEmpty(isTaxOrder)){
	 and is_tax_order=#isTaxOrder#
	@}
	@if(!isEmpty(phone)){
	 and phone=#phone#
	@}
	@if(!isEmpty(address)){
	 and address=#address#
	@}
	@if(!isEmpty(idcard)){
	 and idcard=#idcard#
	@}
	@if(!isEmpty(receiverName)){
	 and receiver_name=#receiverName#
	@}
	@if(!isEmpty(orderTax)){
	 and order_tax=#orderTax#
	@}
	@if(!isEmpty(hangzhouState)){
	 and hangzhou_state=#hangzhouState#
	@}
	@if(!isEmpty(hangzhouDetails)){
	 and hangzhou_details=#hangzhouDetails#
	@}
	@if(!isEmpty(printPdf)){
	 and print_pdf=#printPdf#
	@}
	@if(!isEmpty(shenzhenRecordStatus)){
	 and shenzhen_record_status=#shenzhenRecordStatus#
	@}
	@if(!isEmpty(shenzhenAuditStatus)){
	 and shenzhen_audit_status=#shenzhenAuditStatus#
	@}
	@if(!isEmpty(expressStatus)){
	 and express_status=#expressStatus#
	@}
	@if(!isEmpty(paystatus)){
	 and payStatus=#paystatus#
	@}
	@if(!isEmpty(proamount)){
	 and proAmount=#proamount#
	@}
	@if(!isEmpty(shenzhenRecordStatusTraffic)){
	 and shenzhen_record_status_traffic=#shenzhenRecordStatusTraffic#
	@}
	@if(!isEmpty(shenzhenAuditStatusTraffic)){
	 and shenzhen_audit_status_traffic=#shenzhenAuditStatusTraffic#
	@}
	@if(!isEmpty(outOrder)){
	 and out_order=#outOrder#
	@}
	@if(!isEmpty(isWeGroupbuy)){
	 and is_we_groupbuy=#isWeGroupbuy#
	@}
	@if(!isEmpty(weGroupbuyingId)){
	 and we_groupbuying_id=#weGroupbuyingId#
	@}
	@if(!isEmpty(outOrderSn)){
	 and out_order_sn=#outOrderSn#
	@}
	@if(!isEmpty(outOrderSn2)){
	 and out_order_sn2=#outOrderSn2#
	@}
	@if(!isEmpty(isZhiyou)){
	 and is_zhiyou=#isZhiyou#
	@}
	@if(!isEmpty(outSourceData)){
	 and out_source_data=#outSourceData#
	@}
	@if(!isEmpty(importSn)){
	 and import_sn=#importSn#
	@}
	@if(!isEmpty(apiPaySn)){
	 and api_pay_sn=#apiPaySn#
	@}
	@if(!isEmpty(isWhole)){
	 and is_whole=#isWhole#
	@}
	@if(!isEmpty(nBuyerPhone)){
	 and n_buyer_phone=#nBuyerPhone#
	@}
	@if(!isEmpty(nBuyerTrueName)){
	 and n_buyer_true_name=#nBuyerTrueName#
	@}
	@if(!isEmpty(nBuyerIdcard)){
	 and n_buyer_idcard=#nBuyerIdcard#
	@}
	@if(!isEmpty(zip)){
	 and zip=#zip#
	@}
	@if(!isEmpty(orderWeight)){
	 and order_weight=#orderWeight#
	@}
	@if(!isEmpty(isPullKjy)){
	 and is_pull_kjy=#isPullKjy#
	@}
	@if(!isEmpty(isJoinpayAlloc)){
	 and is_joinpay_alloc=#isJoinpayAlloc#
	@}
	
	