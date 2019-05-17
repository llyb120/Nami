sample
===
* 注释

	select #use("cols")# from ra_sns_setting  where  #use("condition")#

cols
===
	member_id,setting_skin

updateSample
===
	
	member_id=#memberId#,setting_skin=#settingSkin#

condition
===

	1 = 1  
	@if(!isEmpty(memberId)){
	 and member_id=#memberId#
	@}
	@if(!isEmpty(settingSkin)){
	 and setting_skin=#settingSkin#
	@}
	
	