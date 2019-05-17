sample
===
* 注释

	select #use("cols")# from ra_rechargecard  where  #use("condition")#

cols
===
	id,sn,denomination,batchflag,admin_name,tscreated,tsused,state,member_id,member_name

updateSample
===
	
	id=#id#,sn=#sn#,denomination=#denomination#,batchflag=#batchflag#,admin_name=#adminName#,tscreated=#tscreated#,tsused=#tsused#,state=#state#,member_id=#memberId#,member_name=#memberName#

condition
===

	1 = 1  
	@if(!isEmpty(id)){
	 and id=#id#
	@}
	@if(!isEmpty(sn)){
	 and sn=#sn#
	@}
	@if(!isEmpty(denomination)){
	 and denomination=#denomination#
	@}
	@if(!isEmpty(batchflag)){
	 and batchflag=#batchflag#
	@}
	@if(!isEmpty(adminName)){
	 and admin_name=#adminName#
	@}
	@if(!isEmpty(tscreated)){
	 and tscreated=#tscreated#
	@}
	@if(!isEmpty(tsused)){
	 and tsused=#tsused#
	@}
	@if(!isEmpty(state)){
	 and state=#state#
	@}
	@if(!isEmpty(memberId)){
	 and member_id=#memberId#
	@}
	@if(!isEmpty(memberName)){
	 and member_name=#memberName#
	@}
	
	