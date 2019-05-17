sample
===
* 注释

	select #use("cols")# from ra_vr_order_statis  where  #use("condition")#

cols
===
	os_month,os_year,os_start_date,os_end_date,os_order_totals,os_commis_totals,os_result_totals,os_create_date

updateSample
===
	
	os_month=#osMonth#,os_year=#osYear#,os_start_date=#osStartDate#,os_end_date=#osEndDate#,os_order_totals=#osOrderTotals#,os_commis_totals=#osCommisTotals#,os_result_totals=#osResultTotals#,os_create_date=#osCreateDate#

condition
===

	1 = 1  
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
	@if(!isEmpty(osCommisTotals)){
	 and os_commis_totals=#osCommisTotals#
	@}
	@if(!isEmpty(osResultTotals)){
	 and os_result_totals=#osResultTotals#
	@}
	@if(!isEmpty(osCreateDate)){
	 and os_create_date=#osCreateDate#
	@}
	
	