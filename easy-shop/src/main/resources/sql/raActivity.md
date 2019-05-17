sample
===
* 注释

	select #use("cols")# from ra_activity  where  #use("condition")#

cols
===
	activity_id,activity_title,activity_type,activity_banner,activity_style,activity_desc,activity_start_date,activity_end_date,activity_sort,activity_state

updateSample
===
	
	activity_id=#activityId#,activity_title=#activityTitle#,activity_type=#activityType#,activity_banner=#activityBanner#,activity_style=#activityStyle#,activity_desc=#activityDesc#,activity_start_date=#activityStartDate#,activity_end_date=#activityEndDate#,activity_sort=#activitySort#,activity_state=#activityState#

condition
===

	1 = 1  
	@if(!isEmpty(activityId)){
	 and activity_id=#activityId#
	@}
	@if(!isEmpty(activityTitle)){
	 and activity_title=#activityTitle#
	@}
	@if(!isEmpty(activityType)){
	 and activity_type=#activityType#
	@}
	@if(!isEmpty(activityBanner)){
	 and activity_banner=#activityBanner#
	@}
	@if(!isEmpty(activityStyle)){
	 and activity_style=#activityStyle#
	@}
	@if(!isEmpty(activityDesc)){
	 and activity_desc=#activityDesc#
	@}
	@if(!isEmpty(activityStartDate)){
	 and activity_start_date=#activityStartDate#
	@}
	@if(!isEmpty(activityEndDate)){
	 and activity_end_date=#activityEndDate#
	@}
	@if(!isEmpty(activitySort)){
	 and activity_sort=#activitySort#
	@}
	@if(!isEmpty(activityState)){
	 and activity_state=#activityState#
	@}
	
	