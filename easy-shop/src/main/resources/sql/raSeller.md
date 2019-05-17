sample
===
* 注释

	select #use("cols")# from ra_seller  where  #use("condition")#

cols
===
	seller_id,seller_name,member_id,seller_group_id,store_id,is_admin,seller_quicklink,last_login_time

updateSample
===
	
	seller_id=#sellerId#,seller_name=#sellerName#,member_id=#memberId#,seller_group_id=#sellerGroupId#,store_id=#storeId#,is_admin=#isAdmin#,seller_quicklink=#sellerQuicklink#,last_login_time=#lastLoginTime#

condition
===

	1 = 1  
	@if(!isEmpty(sellerId)){
	 and seller_id=#sellerId#
	@}
	@if(!isEmpty(sellerName)){
	 and seller_name=#sellerName#
	@}
	@if(!isEmpty(memberId)){
	 and member_id=#memberId#
	@}
	@if(!isEmpty(sellerGroupId)){
	 and seller_group_id=#sellerGroupId#
	@}
	@if(!isEmpty(storeId)){
	 and store_id=#storeId#
	@}
	@if(!isEmpty(isAdmin)){
	 and is_admin=#isAdmin#
	@}
	@if(!isEmpty(sellerQuicklink)){
	 and seller_quicklink=#sellerQuicklink#
	@}
	@if(!isEmpty(lastLoginTime)){
	 and last_login_time=#lastLoginTime#
	@}
	
	