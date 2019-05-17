sample
===
* 注释

	select #use("cols")# from ra_voucher  where  #use("condition")#

cols
===
	voucher_id,voucher_code,voucher_t_id,voucher_title,voucher_desc,voucher_start_date,voucher_end_date,voucher_price,voucher_limit,voucher_store_id,voucher_state,voucher_active_date,voucher_type,voucher_owner_id,voucher_owner_name,voucher_order_id

updateSample
===
	
	voucher_id=#voucherId#,voucher_code=#voucherCode#,voucher_t_id=#voucherTId#,voucher_title=#voucherTitle#,voucher_desc=#voucherDesc#,voucher_start_date=#voucherStartDate#,voucher_end_date=#voucherEndDate#,voucher_price=#voucherPrice#,voucher_limit=#voucherLimit#,voucher_store_id=#voucherStoreId#,voucher_state=#voucherState#,voucher_active_date=#voucherActiveDate#,voucher_type=#voucherType#,voucher_owner_id=#voucherOwnerId#,voucher_owner_name=#voucherOwnerName#,voucher_order_id=#voucherOrderId#

condition
===

	1 = 1  
	@if(!isEmpty(voucherId)){
	 and voucher_id=#voucherId#
	@}
	@if(!isEmpty(voucherCode)){
	 and voucher_code=#voucherCode#
	@}
	@if(!isEmpty(voucherTId)){
	 and voucher_t_id=#voucherTId#
	@}
	@if(!isEmpty(voucherTitle)){
	 and voucher_title=#voucherTitle#
	@}
	@if(!isEmpty(voucherDesc)){
	 and voucher_desc=#voucherDesc#
	@}
	@if(!isEmpty(voucherStartDate)){
	 and voucher_start_date=#voucherStartDate#
	@}
	@if(!isEmpty(voucherEndDate)){
	 and voucher_end_date=#voucherEndDate#
	@}
	@if(!isEmpty(voucherPrice)){
	 and voucher_price=#voucherPrice#
	@}
	@if(!isEmpty(voucherLimit)){
	 and voucher_limit=#voucherLimit#
	@}
	@if(!isEmpty(voucherStoreId)){
	 and voucher_store_id=#voucherStoreId#
	@}
	@if(!isEmpty(voucherState)){
	 and voucher_state=#voucherState#
	@}
	@if(!isEmpty(voucherActiveDate)){
	 and voucher_active_date=#voucherActiveDate#
	@}
	@if(!isEmpty(voucherType)){
	 and voucher_type=#voucherType#
	@}
	@if(!isEmpty(voucherOwnerId)){
	 and voucher_owner_id=#voucherOwnerId#
	@}
	@if(!isEmpty(voucherOwnerName)){
	 and voucher_owner_name=#voucherOwnerName#
	@}
	@if(!isEmpty(voucherOrderId)){
	 and voucher_order_id=#voucherOrderId#
	@}
	
	