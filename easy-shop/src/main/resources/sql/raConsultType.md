sample
===
* 注释

	select #use("cols")# from ra_consult_type  where  #use("condition")#

cols
===
	ct_id,ct_name,ct_introduce,ct_sort

updateSample
===
	
	ct_id=#ctId#,ct_name=#ctName#,ct_introduce=#ctIntroduce#,ct_sort=#ctSort#

condition
===

	1 = 1  
	@if(!isEmpty(ctId)){
	 and ct_id=#ctId#
	@}
	@if(!isEmpty(ctName)){
	 and ct_name=#ctName#
	@}
	@if(!isEmpty(ctIntroduce)){
	 and ct_introduce=#ctIntroduce#
	@}
	@if(!isEmpty(ctSort)){
	 and ct_sort=#ctSort#
	@}
	
	