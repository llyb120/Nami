sample
===
* 注释

	select #use("cols")# from ra_store_reopen  where  #use("condition")#

cols
===
	re_id,re_grade_id,re_grade_name,re_grade_price,re_year,re_pay_amount,re_store_name,re_store_id,re_state,re_start_time,re_end_time,re_create_time,re_pay_cert,re_pay_cert_explain

updateSample
===
	
	re_id=#reId#,re_grade_id=#reGradeId#,re_grade_name=#reGradeName#,re_grade_price=#reGradePrice#,re_year=#reYear#,re_pay_amount=#rePayAmount#,re_store_name=#reStoreName#,re_store_id=#reStoreId#,re_state=#reState#,re_start_time=#reStartTime#,re_end_time=#reEndTime#,re_create_time=#reCreateTime#,re_pay_cert=#rePayCert#,re_pay_cert_explain=#rePayCertExplain#

condition
===

	1 = 1  
	@if(!isEmpty(reId)){
	 and re_id=#reId#
	@}
	@if(!isEmpty(reGradeId)){
	 and re_grade_id=#reGradeId#
	@}
	@if(!isEmpty(reGradeName)){
	 and re_grade_name=#reGradeName#
	@}
	@if(!isEmpty(reGradePrice)){
	 and re_grade_price=#reGradePrice#
	@}
	@if(!isEmpty(reYear)){
	 and re_year=#reYear#
	@}
	@if(!isEmpty(rePayAmount)){
	 and re_pay_amount=#rePayAmount#
	@}
	@if(!isEmpty(reStoreName)){
	 and re_store_name=#reStoreName#
	@}
	@if(!isEmpty(reStoreId)){
	 and re_store_id=#reStoreId#
	@}
	@if(!isEmpty(reState)){
	 and re_state=#reState#
	@}
	@if(!isEmpty(reStartTime)){
	 and re_start_time=#reStartTime#
	@}
	@if(!isEmpty(reEndTime)){
	 and re_end_time=#reEndTime#
	@}
	@if(!isEmpty(reCreateTime)){
	 and re_create_time=#reCreateTime#
	@}
	@if(!isEmpty(rePayCert)){
	 and re_pay_cert=#rePayCert#
	@}
	@if(!isEmpty(rePayCertExplain)){
	 and re_pay_cert_explain=#rePayCertExplain#
	@}
	
	