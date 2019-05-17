sample
===
* 注释

	select #use("cols")# from ra_proxy_pre  where  #use("condition")#

cols
===
	openid,parent_id

updateSample
===
	
	openid=#openid#,parent_id=#parentId#

condition
===

	1 = 1  
	@if(!isEmpty(openid)){
	 and openid=#openid#
	@}
	@if(!isEmpty(parentId)){
	 and parent_id=#parentId#
	@}
	
	