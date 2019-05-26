page
===
	select 
	@pageTag(){
	#use("cols")#
	@}
	from ra_refund_return  where  #use("condition")#
@pageIgnoreTag(){
order by add_time desc
@}

cols
===
	refund_id,order_id,order_sn,refund_sn,store_id,store_name,buyer_id,buyer_name,goods_id,order_goods_id,goods_name,goods_num,refund_amount,goods_image,order_goods_type,refund_type,seller_state,refund_state,return_type,order_lock,goods_state,add_time,seller_time,admin_time,reason_id,reason_info,pic_info,buyer_message,seller_message,admin_message,express_id,invoice_no,ship_time,delay_time,receive_time,receive_message,commis_rate,daddress_id,refund_address

updateSample
===
	
	refund_id=#refund_id#,order_id=#order_id#,order_sn=#order_sn#,refund_sn=#refund_sn#,store_id=#store_id#,store_name=#store_name#,buyer_id=#buyer_id#,buyer_name=#buyer_name#,goods_id=#goods_id#,order_goods_id=#order_goods_id#,goods_name=#goods_name#,goods_num=#goods_num#,refund_amount=#refund_amount#,goods_image=#goods_image#,order_goods_type=#order_goods_type#,refund_type=#refund_type#,seller_state=#seller_state#,refund_state=#refund_state#,return_type=#return_type#,order_lock=#order_lock#,goods_state=#goods_state#,add_time=#add_time#,seller_time=#seller_time#,admin_time=#admin_time#,reason_id=#reason_id#,reason_info=#reason_info#,pic_info=#pic_info#,buyer_message=#buyer_message#,seller_message=#seller_message#,admin_message=#admin_message#,express_id=#express_id#,invoice_no=#invoice_no#,ship_time=#ship_time#,delay_time=#delay_time#,receive_time=#receive_time#,receive_message=#receive_message#,commis_rate=#commis_rate#,daddress_id=#daddress_id#,refund_address=#refund_address#

condition
===

	1 = 1  
	@if(!isEmpty(refund_id)){
	 and refund_id=#refund_id#
	@}
	@if(!isEmpty(order_id)){
	 and order_id=#order_id#
	@}
	@if(!isEmpty(order_sn)){
	 and order_sn=#order_sn#
	@}
	@if(!isEmpty(refund_sn)){
	 and refund_sn=#refund_sn#
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
	@if(!isEmpty(goods_id)){
	 and goods_id=#goods_id#
	@}
	@if(!isEmpty(order_goods_id)){
	 and order_goods_id=#order_goods_id#
	@}
	@if(!isEmpty(goods_name)){
	 and goods_name=#goods_name#
	@}
	@if(!isEmpty(goods_num)){
	 and goods_num=#goods_num#
	@}
	@if(!isEmpty(refund_amount)){
	 and refund_amount=#refund_amount#
	@}
	@if(!isEmpty(goods_image)){
	 and goods_image=#goods_image#
	@}
	@if(!isEmpty(order_goods_type)){
	 and order_goods_type=#order_goods_type#
	@}
	@if(!isEmpty(refund_type)){
	 and refund_type=#refund_type#
	@}
	@if(!isEmpty(seller_state)){
	 and seller_state=#seller_state#
	@}
	@if(!isEmpty(refund_state)){
	 and refund_state=#refund_state#
	@}
	@if(!isEmpty(return_type)){
	 and return_type=#return_type#
	@}
	@if(!isEmpty(order_lock)){
	 and order_lock=#order_lock#
	@}
	@if(!isEmpty(goods_state)){
	 and goods_state=#goods_state#
	@}
	@if(!isEmpty(add_time)){
	 and add_time=#add_time#
	@}
	@if(!isEmpty(seller_time)){
	 and seller_time=#seller_time#
	@}
	@if(!isEmpty(admin_time)){
	 and admin_time=#admin_time#
	@}
	@if(!isEmpty(reason_id)){
	 and reason_id=#reason_id#
	@}
	@if(!isEmpty(reason_info)){
	 and reason_info=#reason_info#
	@}
	@if(!isEmpty(pic_info)){
	 and pic_info=#pic_info#
	@}
	@if(!isEmpty(buyer_message)){
	 and buyer_message=#buyer_message#
	@}
	@if(!isEmpty(seller_message)){
	 and seller_message=#seller_message#
	@}
	@if(!isEmpty(admin_message)){
	 and admin_message=#admin_message#
	@}
	@if(!isEmpty(express_id)){
	 and express_id=#express_id#
	@}
	@if(!isEmpty(invoice_no)){
	 and invoice_no=#invoice_no#
	@}
	@if(!isEmpty(ship_time)){
	 and ship_time=#ship_time#
	@}
	@if(!isEmpty(delay_time)){
	 and delay_time=#delay_time#
	@}
	@if(!isEmpty(receive_time)){
	 and receive_time=#receive_time#
	@}
	@if(!isEmpty(receive_message)){
	 and receive_message=#receive_message#
	@}
	@if(!isEmpty(commis_rate)){
	 and commis_rate=#commis_rate#
	@}
	@if(!isEmpty(daddress_id)){
	 and daddress_id=#daddress_id#
	@}
	@if(!isEmpty(refund_address)){
	 and refund_address=#refund_address#
	@}
	
	