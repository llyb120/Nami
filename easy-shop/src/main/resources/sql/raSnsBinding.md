sample
===
* 注释

	select #use("cols")# from ra_sns_binding  where  #use("condition")#

cols
===
	snsbind_id,snsbind_memberid,snsbind_membername,snsbind_appsign,snsbind_updatetime,snsbind_openid,snsbind_openinfo,snsbind_accesstoken,snsbind_expiresin,snsbind_refreshtoken

updateSample
===
	
	snsbind_id=#snsbindId#,snsbind_memberid=#snsbindMemberid#,snsbind_membername=#snsbindMembername#,snsbind_appsign=#snsbindAppsign#,snsbind_updatetime=#snsbindUpdatetime#,snsbind_openid=#snsbindOpenid#,snsbind_openinfo=#snsbindOpeninfo#,snsbind_accesstoken=#snsbindAccesstoken#,snsbind_expiresin=#snsbindExpiresin#,snsbind_refreshtoken=#snsbindRefreshtoken#

condition
===

	1 = 1  
	@if(!isEmpty(snsbindId)){
	 and snsbind_id=#snsbindId#
	@}
	@if(!isEmpty(snsbindMemberid)){
	 and snsbind_memberid=#snsbindMemberid#
	@}
	@if(!isEmpty(snsbindMembername)){
	 and snsbind_membername=#snsbindMembername#
	@}
	@if(!isEmpty(snsbindAppsign)){
	 and snsbind_appsign=#snsbindAppsign#
	@}
	@if(!isEmpty(snsbindUpdatetime)){
	 and snsbind_updatetime=#snsbindUpdatetime#
	@}
	@if(!isEmpty(snsbindOpenid)){
	 and snsbind_openid=#snsbindOpenid#
	@}
	@if(!isEmpty(snsbindOpeninfo)){
	 and snsbind_openinfo=#snsbindOpeninfo#
	@}
	@if(!isEmpty(snsbindAccesstoken)){
	 and snsbind_accesstoken=#snsbindAccesstoken#
	@}
	@if(!isEmpty(snsbindExpiresin)){
	 and snsbind_expiresin=#snsbindExpiresin#
	@}
	@if(!isEmpty(snsbindRefreshtoken)){
	 and snsbind_refreshtoken=#snsbindRefreshtoken#
	@}
	
	