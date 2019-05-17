sample
===
* 注释

	select #use("cols")# from ra_sns_sharegoods  where  #use("condition")#

cols
===
	share_id,share_goodsid,share_memberid,share_membername,share_content,share_addtime,share_likeaddtime,share_privacy,share_commentcount,share_isshare,share_islike

updateSample
===
	
	share_id=#shareId#,share_goodsid=#shareGoodsid#,share_memberid=#shareMemberid#,share_membername=#shareMembername#,share_content=#shareContent#,share_addtime=#shareAddtime#,share_likeaddtime=#shareLikeaddtime#,share_privacy=#sharePrivacy#,share_commentcount=#shareCommentcount#,share_isshare=#shareIsshare#,share_islike=#shareIslike#

condition
===

	1 = 1  
	@if(!isEmpty(shareId)){
	 and share_id=#shareId#
	@}
	@if(!isEmpty(shareGoodsid)){
	 and share_goodsid=#shareGoodsid#
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
	@if(!isEmpty(shareLikeaddtime)){
	 and share_likeaddtime=#shareLikeaddtime#
	@}
	@if(!isEmpty(sharePrivacy)){
	 and share_privacy=#sharePrivacy#
	@}
	@if(!isEmpty(shareCommentcount)){
	 and share_commentcount=#shareCommentcount#
	@}
	@if(!isEmpty(shareIsshare)){
	 and share_isshare=#shareIsshare#
	@}
	@if(!isEmpty(shareIslike)){
	 and share_islike=#shareIslike#
	@}
	
	