sample
===
* 注释

	select #use("cols")# from ra_we_groupbuying  where  #use("condition")#

cols
===
	we_groupbuying_id,store_id,we_groupbuy_id,sponsor_id,sponsor_name,sponsor_time,we_groupbuy_status,is_pay_brokerage

updateSample
===
	
	we_groupbuying_id=#weGroupbuyingId#,store_id=#storeId#,we_groupbuy_id=#weGroupbuyId#,sponsor_id=#sponsorId#,sponsor_name=#sponsorName#,sponsor_time=#sponsorTime#,we_groupbuy_status=#weGroupbuyStatus#,is_pay_brokerage=#isPayBrokerage#

condition
===

	1 = 1  
	@if(!isEmpty(weGroupbuyingId)){
	 and we_groupbuying_id=#weGroupbuyingId#
	@}
	@if(!isEmpty(storeId)){
	 and store_id=#storeId#
	@}
	@if(!isEmpty(weGroupbuyId)){
	 and we_groupbuy_id=#weGroupbuyId#
	@}
	@if(!isEmpty(sponsorId)){
	 and sponsor_id=#sponsorId#
	@}
	@if(!isEmpty(sponsorName)){
	 and sponsor_name=#sponsorName#
	@}
	@if(!isEmpty(sponsorTime)){
	 and sponsor_time=#sponsorTime#
	@}
	@if(!isEmpty(weGroupbuyStatus)){
	 and we_groupbuy_status=#weGroupbuyStatus#
	@}
	@if(!isEmpty(isPayBrokerage)){
	 and is_pay_brokerage=#isPayBrokerage#
	@}
	
	