sample
===
* 注释

	select #use("cols")# from ra_mall_consult_type  where  #use("condition")#

cols
===
	mct_id,mct_name,mct_introduce,mct_sort

updateSample
===
	
	mct_id=#mctId#,mct_name=#mctName#,mct_introduce=#mctIntroduce#,mct_sort=#mctSort#

condition
===

	1 = 1  
	@if(!isEmpty(mctId)){
	 and mct_id=#mctId#
	@}
	@if(!isEmpty(mctName)){
	 and mct_name=#mctName#
	@}
	@if(!isEmpty(mctIntroduce)){
	 and mct_introduce=#mctIntroduce#
	@}
	@if(!isEmpty(mctSort)){
	 and mct_sort=#mctSort#
	@}
	
	