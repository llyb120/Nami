page
===

	select 
	@pageTag(){
	#use("cols")# 
	@}
	from ra_order  where  #use("condition")#

cols
===
	order_id,order_sn,pay_sn,store_id,store_name,buyer_id,buyer_name,buyer_email,add_time,payment_code,payment_time,finnshed_time,goods_amount,order_amount,rcb_amount,pd_amount,shipping_fee,evaluation_state,order_state,refund_state,lock_state,delete_state,refund_amount,delay_time,order_from,shipping_code,margin,wxpay,vertify_state,is_tax_order,phone,address,idcard,receiver_name,order_tax,hangzhou_state,hangzhou_details,print_pdf,shenzhen_record_status,shenzhen_audit_status,express_status,payStatus,proAmount,shenzhen_record_status_traffic,shenzhen_audit_status_traffic,out_order,is_we_groupbuy,we_groupbuying_id,out_order_sn,out_order_sn2,is_zhiyou,out_source_data,import_sn,api_pay_sn,is_whole,n_buyer_phone,n_buyer_true_name,n_buyer_idcard,zip,order_weight,is_pull_kjy,is_joinpay_alloc

updateSample
===
	
	order_id=#order_id#,order_sn=#order_sn#,pay_sn=#pay_sn#,store_id=#store_id#,store_name=#store_name#,buyer_id=#buyer_id#,buyer_name=#buyer_name#,buyer_email=#buyer_email#,add_time=#add_time#,payment_code=#payment_code#,payment_time=#payment_time#,finnshed_time=#finnshed_time#,goods_amount=#goods_amount#,order_amount=#order_amount#,rcb_amount=#rcb_amount#,pd_amount=#pd_amount#,shipping_fee=#shipping_fee#,evaluation_state=#evaluation_state#,order_state=#order_state#,refund_state=#refund_state#,lock_state=#lock_state#,delete_state=#delete_state#,refund_amount=#refund_amount#,delay_time=#delay_time#,order_from=#order_from#,shipping_code=#shipping_code#,margin=#margin#,wxpay=#wxpay#,vertify_state=#vertify_state#,is_tax_order=#is_tax_order#,phone=#phone#,address=#address#,idcard=#idcard#,receiver_name=#receiver_name#,order_tax=#order_tax#,hangzhou_state=#hangzhou_state#,hangzhou_details=#hangzhou_details#,print_pdf=#print_pdf#,shenzhen_record_status=#shenzhen_record_status#,shenzhen_audit_status=#shenzhen_audit_status#,express_status=#express_status#,payStatus=#paystatus#,proAmount=#proamount#,shenzhen_record_status_traffic=#shenzhen_record_status_traffic#,shenzhen_audit_status_traffic=#shenzhen_audit_status_traffic#,out_order=#out_order#,is_we_groupbuy=#is_we_groupbuy#,we_groupbuying_id=#we_groupbuying_id#,out_order_sn=#out_order_sn#,out_order_sn2=#out_order_sn2#,is_zhiyou=#is_zhiyou#,out_source_data=#out_source_data#,import_sn=#import_sn#,api_pay_sn=#api_pay_sn#,is_whole=#is_whole#,n_buyer_phone=#n_buyer_phone#,n_buyer_true_name=#n_buyer_true_name#,n_buyer_idcard=#n_buyer_idcard#,zip=#zip#,order_weight=#order_weight#,is_pull_kjy=#is_pull_kjy#,is_joinpay_alloc=#is_joinpay_alloc#

condition
===

	1 = 1  
	@if(!isEmpty(order_id)){
	 and order_id=#order_id#
	@}
	@if(!isEmpty(order_sn)){
	 and order_sn=#order_sn#
	@}
	@if(!isEmpty(pay_sn)){
	 and pay_sn=#pay_sn#
	@}
	@if(!isEmpty(store_id)){
	 and store_id=#store_id#
	@}
	@if(!isEmpty(store_name)){
	 and store_name=#store_name#
	@}
	@if(!isEmpty(buyer_id)){
	 and buyer_id=#buyer_id#
	@}
	@if(!isEmpty(buyer_name)){
	 and buyer_name=#buyer_name#
	@}
	@if(!isEmpty(buyer_email)){
	 and buyer_email=#buyer_email#
	@}
	@if(!isEmpty(add_time)){
	 and add_time=#add_time#
	@}
	@if(!isEmpty(payment_code)){
	 and payment_code=#payment_code#
	@}
	@if(!isEmpty(payment_time)){
	 and payment_time=#payment_time#
	@}
	@if(!isEmpty(finnshed_time)){
	 and finnshed_time=#finnshed_time#
	@}
	@if(!isEmpty(goods_amount)){
	 and goods_amount=#goods_amount#
	@}
	@if(!isEmpty(order_amount)){
	 and order_amount=#order_amount#
	@}
	@if(!isEmpty(rcb_amount)){
	 and rcb_amount=#rcb_amount#
	@}
	@if(!isEmpty(pd_amount)){
	 and pd_amount=#pd_amount#
	@}
	@if(!isEmpty(shipping_fee)){
	 and shipping_fee=#shipping_fee#
	@}
	@if(!isEmpty(evaluation_state)){
	 and evaluation_state=#evaluation_state#
	@}
	@if(!isEmpty(order_state)){
	 and order_state=#order_state#
	@}
	@if(!isEmpty(refund_state)){
	 and refund_state=#refund_state#
	@}
	@if(!isEmpty(lock_state)){
	 and lock_state=#lock_state#
	@}
	@if(!isEmpty(delete_state)){
	 and delete_state=#delete_state#
	@}
	@if(!isEmpty(refund_amount)){
	 and refund_amount=#refund_amount#
	@}
	@if(!isEmpty(delay_time)){
	 and delay_time=#delay_time#
	@}
	@if(!isEmpty(order_from)){
	 and order_from=#order_from#
	@}
	@if(!isEmpty(shipping_code)){
	 and shipping_code=#shipping_code#
	@}
	@if(!isEmpty(margin)){
	 and margin=#margin#
	@}
	@if(!isEmpty(wxpay)){
	 and wxpay=#wxpay#
	@}
	@if(!isEmpty(vertify_state)){
	 and vertify_state=#vertify_state#
	@}
	@if(!isEmpty(is_tax_order)){
	 and is_tax_order=#is_tax_order#
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
	@if(!isEmpty(receiver_name)){
	 and receiver_name=#receiver_name#
	@}
	@if(!isEmpty(order_tax)){
	 and order_tax=#order_tax#
	@}
	@if(!isEmpty(hangzhou_state)){
	 and hangzhou_state=#hangzhou_state#
	@}
	@if(!isEmpty(hangzhou_details)){
	 and hangzhou_details=#hangzhou_details#
	@}
	@if(!isEmpty(print_pdf)){
	 and print_pdf=#print_pdf#
	@}
	@if(!isEmpty(shenzhen_record_status)){
	 and shenzhen_record_status=#shenzhen_record_status#
	@}
	@if(!isEmpty(shenzhen_audit_status)){
	 and shenzhen_audit_status=#shenzhen_audit_status#
	@}
	@if(!isEmpty(express_status)){
	 and express_status=#express_status#
	@}
	@if(!isEmpty(paystatus)){
	 and payStatus=#paystatus#
	@}
	@if(!isEmpty(proamount)){
	 and proAmount=#proamount#
	@}
	@if(!isEmpty(shenzhen_record_status_traffic)){
	 and shenzhen_record_status_traffic=#shenzhen_record_status_traffic#
	@}
	@if(!isEmpty(shenzhen_audit_status_traffic)){
	 and shenzhen_audit_status_traffic=#shenzhen_audit_status_traffic#
	@}
	@if(!isEmpty(out_order)){
	 and out_order=#out_order#
	@}
	@if(!isEmpty(is_we_groupbuy)){
	 and is_we_groupbuy=#is_we_groupbuy#
	@}
	@if(!isEmpty(we_groupbuying_id)){
	 and we_groupbuying_id=#we_groupbuying_id#
	@}
	@if(!isEmpty(out_order_sn)){
	 and out_order_sn=#out_order_sn#
	@}
	@if(!isEmpty(out_order_sn2)){
	 and out_order_sn2=#out_order_sn2#
	@}
	@if(!isEmpty(is_zhiyou)){
	 and is_zhiyou=#is_zhiyou#
	@}
	@if(!isEmpty(out_source_data)){
	 and out_source_data=#out_source_data#
	@}
	@if(!isEmpty(import_sn)){
	 and import_sn=#import_sn#
	@}
	@if(!isEmpty(api_pay_sn)){
	 and api_pay_sn=#api_pay_sn#
	@}
	@if(!isEmpty(is_whole)){
	 and is_whole=#is_whole#
	@}
	@if(!isEmpty(n_buyer_phone)){
	 and n_buyer_phone=#n_buyer_phone#
	@}
	@if(!isEmpty(n_buyer_true_name)){
	 and n_buyer_true_name=#n_buyer_true_name#
	@}
	@if(!isEmpty(n_buyer_idcard)){
	 and n_buyer_idcard=#n_buyer_idcard#
	@}
	@if(!isEmpty(zip)){
	 and zip=#zip#
	@}
	@if(!isEmpty(order_weight)){
	 and order_weight=#order_weight#
	@}
	@if(!isEmpty(is_pull_kjy)){
	 and is_pull_kjy=#is_pull_kjy#
	@}
	@if(!isEmpty(is_joinpay_alloc)){
	 and is_joinpay_alloc=#is_joinpay_alloc#
	@}
	
	