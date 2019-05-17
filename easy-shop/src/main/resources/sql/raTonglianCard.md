sample
===
* 注释

	select #use("cols")# from ra_tonglian_card  where  #use("condition")#

cols
===
	id,name,idcard,tonglian_card,balance

updateSample
===
	
	id=#id#,name=#name#,idcard=#idcard#,tonglian_card=#tonglianCard#,balance=#balance#

condition
===

	1 = 1  
	@if(!isEmpty(id)){
	 and id=#id#
	@}
	@if(!isEmpty(name)){
	 and name=#name#
	@}
	@if(!isEmpty(idcard)){
	 and idcard=#idcard#
	@}
	@if(!isEmpty(tonglianCard)){
	 and tonglian_card=#tonglianCard#
	@}
	@if(!isEmpty(balance)){
	 and balance=#balance#
	@}
	
	