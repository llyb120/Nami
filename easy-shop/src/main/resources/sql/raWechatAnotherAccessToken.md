sample
===
* 注释

	select #use("cols")# from ra_wechat_another_access_token  where  #use("condition")#

cols
===
	id,access_token,expr_time

updateSample
===
	
	id=#id#,access_token=#accessToken#,expr_time=#exprTime#

condition
===

	1 = 1  
	@if(!isEmpty(id)){
	 and id=#id#
	@}
	@if(!isEmpty(accessToken)){
	 and access_token=#accessToken#
	@}
	@if(!isEmpty(exprTime)){
	 and expr_time=#exprTime#
	@}
	
	