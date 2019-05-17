sample
===
* 注释

	select #use("cols")# from ra_wechat_access_token  where  #use("condition")#

cols
===
	id,access_token,expires_time,member_id

updateSample
===
	
	id=#id#,access_token=#accessToken#,expires_time=#expiresTime#,member_id=#memberId#

condition
===

	1 = 1  
	@if(!isEmpty(id)){
	 and id=#id#
	@}
	@if(!isEmpty(accessToken)){
	 and access_token=#accessToken#
	@}
	@if(!isEmpty(expiresTime)){
	 and expires_time=#expiresTime#
	@}
	@if(!isEmpty(memberId)){
	 and member_id=#memberId#
	@}
	
	