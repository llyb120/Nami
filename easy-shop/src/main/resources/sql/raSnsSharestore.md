sample
===
* 注释

	select #use("cols")# from ra_sns_sharestore  where  #use("condition")#

cols
===
	share_id,share_storeid,share_storename,share_memberid,share_membername,share_content,share_addtime,share_privacy

updateSample
===
	
	share_id=#shareId#,share_storeid=#shareStoreid#,share_storename=#shareStorename#,share_memberid=#shareMemberid#,share_membername=#shareMembername#,share_content=#shareContent#,share_addtime=#shareAddtime#,share_privacy=#sharePrivacy#

condition
===

	1 = 1  
	@if(!isEmpty(shareId)){
	 and share_id=#shareId#
	@}
	@if(!isEmpty(shareStoreid)){
	 and share_storeid=#shareStoreid#
	@}
	@if(!isEmpty(shareStorename)){
	 and share_storename=#shareStorename#
	@}
	@if(!isEmpty(shareMemberid)){
	 and share_memberid=#shareMemberid#
	@}
	@if(!isEmpty(shareMembername)){
	 and share_membername=#shareMembername#
	@}
	@if(!isEmpty(shareContent)){
	 and share_content=#shareContent#
	@}
	@if(!isEmpty(shareAddtime)){
	 and share_addtime=#shareAddtime#
	@}
	@if(!isEmpty(sharePrivacy)){
	 and share_privacy=#sharePrivacy#
	@}
	
	