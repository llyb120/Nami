sample
===
* 注释

	select #use("cols")# from ra_weproxy_order_margin  where  #use("condition")#

cols
===
	id,order_id,member_id,margin,level,time,from_member,type

updateSample
===
	
	id=#id#,order_id=#orderId#,member_id=#memberId#,margin=#margin#,level=#level#,time=#time#,from_member=#fromMember#,type=#type#

condition
===

	1 = 1  
	@if(!isEmpty(id)){
	 and id=#id#
	@}
	@if(!isEmpty(orderId)){
	 and order_id=#orderId#
	@}
	@if(!isEmpty(memberId)){
	 and member_id=#memberId#
	@}
	@if(!isEmpty(margin)){
	 and margin=#margin#
	@}
	@if(!isEmpty(level)){
	 and level=#level#
	@}
	@if(!isEmpty(time)){
	 and time=#time#
	@}
	@if(!isEmpty(fromMember)){
	 and from_member=#fromMember#
	@}
	@if(!isEmpty(type)){
	 and type=#type#
	@}
	
	