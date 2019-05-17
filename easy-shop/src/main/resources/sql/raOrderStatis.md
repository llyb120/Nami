sample
===
* 注释

	select #use("cols")# from ra_order_statis  where  #use("condition")#

cols
===
	os_id,os_month,os_year,os_start_date,os_end_date,os_order_totals,os_shipping_totals,os_order_return_totals,os_commis_totals,os_commis_return_totals,os_store_cost_totals,os_result_totals,os_create_date

updateSample
===
	
	os_id=#osId#,os_month=#osMonth#,os_year=#osYear#,os_start_date=#osStartDate#,os_end_date=#osEndDate#,os_order_totals=#osOrderTotals#,os_shipping_totals=#osShippingTotals#,os_order_return_totals=#osOrderReturnTotals#,os_commis_totals=#osCommisTotals#,os_commis_return_totals=#osCommisReturnTotals#,os_store_cost_totals=#osStoreCostTotals#,os_result_totals=#osResultTotals#,os_create_date=#osCreateDate#

condition
===

	1 = 1  
	@if(!isEmpty(osId)){
	 and os_id=#osId#
	@}
	@if(!isEmpty(osMonth)){
	 and os_month=#osMonth#
	@}
	@if(!isEmpty(osYear)){
	 and os_year=#osYear#
	@}
	@if(!isEmpty(osStartDate)){
	 and os_start_date=#osStartDate#
	@}
	@if(!isEmpty(osEndDate)){
	 and os_end_date=#osEndDate#
	@}
	@if(!isEmpty(osOrderTotals)){
	 and os_order_totals=#osOrderTotals#
	@}
	@if(!isEmpty(osShippingTotals)){
	 and os_shipping_totals=#osShippingTotals#
	@}
	@if(!isEmpty(osOrderReturnTotals)){
	 and os_order_return_totals=#osOrderReturnTotals#
	@}
	@if(!isEmpty(osCommisTotals)){
	 and os_commis_totals=#osCommisTotals#
	@}
	@if(!isEmpty(osCommisReturnTotals)){
	 and os_commis_return_totals=#osCommisReturnTotals#
	@}
	@if(!isEmpty(osStoreCostTotals)){
	 and os_store_cost_totals=#osStoreCostTotals#
	@}
	@if(!isEmpty(osResultTotals)){
	 and os_result_totals=#osResultTotals#
	@}
	@if(!isEmpty(osCreateDate)){
	 and os_create_date=#osCreateDate#
	@}
	
	