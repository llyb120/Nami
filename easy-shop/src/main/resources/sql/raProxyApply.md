sample
===
* 注释

	select #use("cols")# from ra_proxy_apply  where  #use("condition")#

cols
===
	id,member_id,proxy_member_id,contact,time,msg,status,idcard,phone,name

updateSample
===
	
	id=#id#,member_id=#memberId#,proxy_member_id=#proxyMemberId#,contact=#contact#,time=#time#,msg=#msg#,status=#status#,idcard=#idcard#,phone=#phone#,name=#name#

condition
===

	1 = 1  
	@if(!isEmpty(id)){
	 and id=#id#
	@}
	@if(!isEmpty(memberId)){
	 and member_id=#memberId#
	@}
	@if(!isEmpty(proxyMemberId)){
	 and proxy_member_id=#proxyMemberId#
	@}
	@if(!isEmpty(contact)){
	 and contact=#contact#
	@}
	@if(!isEmpty(time)){
	 and time=#time#
	@}
	@if(!isEmpty(msg)){
	 and msg=#msg#
	@}
	@if(!isEmpty(status)){
	 and status=#status#
	@}
	@if(!isEmpty(idcard)){
	 and idcard=#idcard#
	@}
	@if(!isEmpty(phone)){
	 and phone=#phone#
	@}
	@if(!isEmpty(name)){
	 and name=#name#
	@}
	
	