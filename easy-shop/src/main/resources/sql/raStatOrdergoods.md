sample
===
* 注释

	select #use("cols")# from ra_stat_ordergoods  where  #use("condition")#

cols
===
	rec_id,stat_updatetime,order_id,order_sn,order_add_time,payment_code,order_amount,shipping_fee,evaluation_state,order_state,refund_state,refund_amount,order_from,order_isvalid,reciver_province_id,store_id,store_name,grade_id,sc_id,buyer_id,buyer_name,goods_id,goods_name,goods_commonid,goods_commonname,gc_id,gc_parentid_1,gc_parentid_2,gc_parentid_3,brand_id,brand_name,goods_serial,goods_price,goods_num,goods_image,goods_pay_price,goods_type,promotions_id,commis_rate

updateSample
===
	
	rec_id=#recId#,stat_updatetime=#statUpdatetime#,order_id=#orderId#,order_sn=#orderSn#,order_add_time=#orderAddTime#,payment_code=#paymentCode#,order_amount=#orderAmount#,shipping_fee=#shippingFee#,evaluation_state=#evaluationState#,order_state=#orderState#,refund_state=#refundState#,refund_amount=#refundAmount#,order_from=#orderFrom#,order_isvalid=#orderIsvalid#,reciver_province_id=#reciverProvinceId#,store_id=#storeId#,store_name=#storeName#,grade_id=#gradeId#,sc_id=#scId#,buyer_id=#buyerId#,buyer_name=#buyerName#,goods_id=#goodsId#,goods_name=#goodsName#,goods_commonid=#goodsCommonid#,goods_commonname=#goodsCommonname#,gc_id=#gcId#,gc_parentid_1=#gcParentid1#,gc_parentid_2=#gcParentid2#,gc_parentid_3=#gcParentid3#,brand_id=#brandId#,brand_name=#brandName#,goods_serial=#goodsSerial#,goods_price=#goodsPrice#,goods_num=#goodsNum#,goods_image=#goodsImage#,goods_pay_price=#goodsPayPrice#,goods_type=#goodsType#,promotions_id=#promotionsId#,commis_rate=#commisRate#

condition
===

	1 = 1  
	@if(!isEmpty(recId)){
	 and rec_id=#recId#
	@}
	@if(!isEmpty(statUpdatetime)){
	 and stat_updatetime=#statUpdatetime#
	@}
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
	@if(!isEmpty(goodsId)){
	 and goods_id=#goodsId#
	@}
	@if(!isEmpty(goodsName)){
	 and goods_name=#goodsName#
	@}
	@if(!isEmpty(goodsCommonid)){
	 and goods_commonid=#goodsCommonid#
	@}
	@if(!isEmpty(goodsCommonname)){
	 and goods_commonname=#goodsCommonname#
	@}
	@if(!isEmpty(gcId)){
	 and gc_id=#gcId#
	@}
	@if(!isEmpty(gcParentid1)){
	 and gc_parentid_1=#gcParentid1#
	@}
	@if(!isEmpty(gcParentid2)){
	 and gc_parentid_2=#gcParentid2#
	@}
	@if(!isEmpty(gcParentid3)){
	 and gc_parentid_3=#gcParentid3#
	@}
	@if(!isEmpty(brandId)){
	 and brand_id=#brandId#
	@}
	@if(!isEmpty(brandName)){
	 and brand_name=#brandName#
	@}
	@if(!isEmpty(goodsSerial)){
	 and goods_serial=#goodsSerial#
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
	@if(!isEmpty(goodsType)){
	 and goods_type=#goodsType#
	@}
	@if(!isEmpty(promotionsId)){
	 and promotions_id=#promotionsId#
	@}
	@if(!isEmpty(commisRate)){
	 and commis_rate=#commisRate#
	@}
	
	