sample
===
* 注释

	select #use("cols")# from ra_vr_order_bill  where  #use("condition")#

cols
===
	ob_no,ob_start_date,ob_end_date,ob_order_totals,ob_commis_totals,ob_result_totals,ob_create_date,os_month,ob_state,ob_pay_date,ob_pay_content,ob_store_id,ob_store_name

updateSample
===
	
	ob_no=#obNo#,ob_start_date=#obStartDate#,ob_end_date=#obEndDate#,ob_order_totals=#obOrderTotals#,ob_commis_totals=#obCommisTotals#,ob_result_totals=#obResultTotals#,ob_create_date=#obCreateDate#,os_month=#osMonth#,ob_state=#obState#,ob_pay_date=#obPayDate#,ob_pay_content=#obPayContent#,ob_store_id=#obStoreId#,ob_store_name=#obStoreName#

condition
===

	1 = 1  
	@if(!isEmpty(obNo)){
	 and ob_no=#obNo#
	@}
	@if(!isEmpty(obStartDate)){
	 and ob_start_date=#obStartDate#
	@}
	@if(!isEmpty(obEndDate)){
	 and ob_end_date=#obEndDate#
	@}
	@if(!isEmpty(obOrderTotals)){
	 and ob_order_totals=#obOrderTotals#
	@}
	@if(!isEmpty(obCommisTotals)){
	 and ob_commis_totals=#obCommisTotals#
	@}
	@if(!isEmpty(obResultTotals)){
	 and ob_result_totals=#obResultTotals#
	@}
	@if(!isEmpty(obCreateDate)){
	 and ob_create_date=#obCreateDate#
	@}
	@if(!isEmpty(osMonth)){
	 and os_month=#osMonth#
	@}
	@if(!isEmpty(obState)){
	 and ob_state=#obState#
	@}
	@if(!isEmpty(obPayDate)){
	 and ob_pay_date=#obPayDate#
	@}
	@if(!isEmpty(obPayContent)){
	 and ob_pay_content=#obPayContent#
	@}
	@if(!isEmpty(obStoreId)){
	 and ob_store_id=#obStoreId#
	@}
	@if(!isEmpty(obStoreName)){
	 and ob_store_name=#obStoreName#
	@}
	
	