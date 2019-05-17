sample
===
* 注释

	select #use("cols")# from ra_voucher_price  where  #use("condition")#

cols
===
	voucher_price_id,voucher_price_describe,voucher_price,voucher_defaultpoints

updateSample
===
	
	voucher_price_id=#voucherPriceId#,voucher_price_describe=#voucherPriceDescribe#,voucher_price=#voucherPrice#,voucher_defaultpoints=#voucherDefaultpoints#

condition
===

	1 = 1  
	@if(!isEmpty(voucherPriceId)){
	 and voucher_price_id=#voucherPriceId#
	@}
	@if(!isEmpty(voucherPriceDescribe)){
	 and voucher_price_describe=#voucherPriceDescribe#
	@}
	@if(!isEmpty(voucherPrice)){
	 and voucher_price=#voucherPrice#
	@}
	@if(!isEmpty(voucherDefaultpoints)){
	 and voucher_defaultpoints=#voucherDefaultpoints#
	@}
	
	