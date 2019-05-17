sample
===
* 注释

	select #use("cols")# from ra_member_msg_setting  where  #use("condition")#

cols
===
	mmt_code,member_id,is_receive

updateSample
===
	
	mmt_code=#mmtCode#,member_id=#memberId#,is_receive=#isReceive#

condition
===

	1 = 1  
	@if(!isEmpty(mmtCode)){
	 and mmt_code=#mmtCode#
	@}
	@if(!isEmpty(memberId)){
	 and member_id=#memberId#
	@}
	@if(!isEmpty(isReceive)){
	 and is_receive=#isReceive#
	@}
	
	