sample
===
* 注释

	select #use("cols")# from ra_member_common  where  #use("condition")#

cols
===
	member_id,auth_code,auth_code_check_times,send_acode_time,send_acode_times

updateSample
===
	
	member_id=#memberId#,auth_code=#authCode#,auth_code_check_times=#authCodeCheckTimes#,send_acode_time=#sendAcodeTime#,send_acode_times=#sendAcodeTimes#

condition
===

	1 = 1  
	@if(!isEmpty(memberId)){
	 and member_id=#memberId#
	@}
	@if(!isEmpty(authCode)){
	 and auth_code=#authCode#
	@}
	@if(!isEmpty(authCodeCheckTimes)){
	 and auth_code_check_times=#authCodeCheckTimes#
	@}
	@if(!isEmpty(sendAcodeTime)){
	 and send_acode_time=#sendAcodeTime#
	@}
	@if(!isEmpty(sendAcodeTimes)){
	 and send_acode_times=#sendAcodeTimes#
	@}
	
	