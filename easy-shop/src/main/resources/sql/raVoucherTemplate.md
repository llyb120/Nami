sample
===
* 注释

	select #use("cols")# from ra_voucher_template  where  #use("condition")#

cols
===
	voucher_t_id,voucher_t_title,voucher_t_desc,voucher_t_start_date,voucher_t_end_date,voucher_t_price,voucher_t_limit,voucher_t_store_id,voucher_t_storename,voucher_t_sc_id,voucher_t_creator_id,voucher_t_state,voucher_t_total,voucher_t_giveout,voucher_t_used,voucher_t_add_date,voucher_t_quotaid,voucher_t_points,voucher_t_eachlimit,voucher_t_styleimg,voucher_t_customimg,voucher_t_recommend

updateSample
===
	
	voucher_t_id=#voucherTId#,voucher_t_title=#voucherTTitle#,voucher_t_desc=#voucherTDesc#,voucher_t_start_date=#voucherTStartDate#,voucher_t_end_date=#voucherTEndDate#,voucher_t_price=#voucherTPrice#,voucher_t_limit=#voucherTLimit#,voucher_t_store_id=#voucherTStoreId#,voucher_t_storename=#voucherTStorename#,voucher_t_sc_id=#voucherTScId#,voucher_t_creator_id=#voucherTCreatorId#,voucher_t_state=#voucherTState#,voucher_t_total=#voucherTTotal#,voucher_t_giveout=#voucherTGiveout#,voucher_t_used=#voucherTUsed#,voucher_t_add_date=#voucherTAddDate#,voucher_t_quotaid=#voucherTQuotaid#,voucher_t_points=#voucherTPoints#,voucher_t_eachlimit=#voucherTEachlimit#,voucher_t_styleimg=#voucherTStyleimg#,voucher_t_customimg=#voucherTCustomimg#,voucher_t_recommend=#voucherTRecommend#

condition
===

	1 = 1  
	@if(!isEmpty(voucherTId)){
	 and voucher_t_id=#voucherTId#
	@}
	@if(!isEmpty(voucherTTitle)){
	 and voucher_t_title=#voucherTTitle#
	@}
	@if(!isEmpty(voucherTDesc)){
	 and voucher_t_desc=#voucherTDesc#
	@}
	@if(!isEmpty(voucherTStartDate)){
	 and voucher_t_start_date=#voucherTStartDate#
	@}
	@if(!isEmpty(voucherTEndDate)){
	 and voucher_t_end_date=#voucherTEndDate#
	@}
	@if(!isEmpty(voucherTPrice)){
	 and voucher_t_price=#voucherTPrice#
	@}
	@if(!isEmpty(voucherTLimit)){
	 and voucher_t_limit=#voucherTLimit#
	@}
	@if(!isEmpty(voucherTStoreId)){
	 and voucher_t_store_id=#voucherTStoreId#
	@}
	@if(!isEmpty(voucherTStorename)){
	 and voucher_t_storename=#voucherTStorename#
	@}
	@if(!isEmpty(voucherTScId)){
	 and voucher_t_sc_id=#voucherTScId#
	@}
	@if(!isEmpty(voucherTCreatorId)){
	 and voucher_t_creator_id=#voucherTCreatorId#
	@}
	@if(!isEmpty(voucherTState)){
	 and voucher_t_state=#voucherTState#
	@}
	@if(!isEmpty(voucherTTotal)){
	 and voucher_t_total=#voucherTTotal#
	@}
	@if(!isEmpty(voucherTGiveout)){
	 and voucher_t_giveout=#voucherTGiveout#
	@}
	@if(!isEmpty(voucherTUsed)){
	 and voucher_t_used=#voucherTUsed#
	@}
	@if(!isEmpty(voucherTAddDate)){
	 and voucher_t_add_date=#voucherTAddDate#
	@}
	@if(!isEmpty(voucherTQuotaid)){
	 and voucher_t_quotaid=#voucherTQuotaid#
	@}
	@if(!isEmpty(voucherTPoints)){
	 and voucher_t_points=#voucherTPoints#
	@}
	@if(!isEmpty(voucherTEachlimit)){
	 and voucher_t_eachlimit=#voucherTEachlimit#
	@}
	@if(!isEmpty(voucherTStyleimg)){
	 and voucher_t_styleimg=#voucherTStyleimg#
	@}
	@if(!isEmpty(voucherTCustomimg)){
	 and voucher_t_customimg=#voucherTCustomimg#
	@}
	@if(!isEmpty(voucherTRecommend)){
	 and voucher_t_recommend=#voucherTRecommend#
	@}
	
	