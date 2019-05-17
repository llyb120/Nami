sample
===
* 注释

	select #use("cols")# from ra_circle_theme  where  #use("condition")#

cols
===
	theme_id,theme_name,theme_content,circle_id,circle_name,thclass_id,thclass_name,member_id,member_name,is_identity,theme_addtime,theme_editname,theme_edittime,theme_likecount,theme_commentcount,theme_browsecount,theme_sharecount,is_stick,is_digest,lastspeak_id,lastspeak_name,lastspeak_time,has_goods,has_affix,is_closed,is_recommend,is_shut,theme_exp,theme_readperm,theme_special

updateSample
===
	
	theme_id=#themeId#,theme_name=#themeName#,theme_content=#themeContent#,circle_id=#circleId#,circle_name=#circleName#,thclass_id=#thclassId#,thclass_name=#thclassName#,member_id=#memberId#,member_name=#memberName#,is_identity=#isIdentity#,theme_addtime=#themeAddtime#,theme_editname=#themeEditname#,theme_edittime=#themeEdittime#,theme_likecount=#themeLikecount#,theme_commentcount=#themeCommentcount#,theme_browsecount=#themeBrowsecount#,theme_sharecount=#themeSharecount#,is_stick=#isStick#,is_digest=#isDigest#,lastspeak_id=#lastspeakId#,lastspeak_name=#lastspeakName#,lastspeak_time=#lastspeakTime#,has_goods=#hasGoods#,has_affix=#hasAffix#,is_closed=#isClosed#,is_recommend=#isRecommend#,is_shut=#isShut#,theme_exp=#themeExp#,theme_readperm=#themeReadperm#,theme_special=#themeSpecial#

condition
===

	1 = 1  
	@if(!isEmpty(themeId)){
	 and theme_id=#themeId#
	@}
	@if(!isEmpty(themeName)){
	 and theme_name=#themeName#
	@}
	@if(!isEmpty(themeContent)){
	 and theme_content=#themeContent#
	@}
	@if(!isEmpty(circleId)){
	 and circle_id=#circleId#
	@}
	@if(!isEmpty(circleName)){
	 and circle_name=#circleName#
	@}
	@if(!isEmpty(thclassId)){
	 and thclass_id=#thclassId#
	@}
	@if(!isEmpty(thclassName)){
	 and thclass_name=#thclassName#
	@}
	@if(!isEmpty(memberId)){
	 and member_id=#memberId#
	@}
	@if(!isEmpty(memberName)){
	 and member_name=#memberName#
	@}
	@if(!isEmpty(isIdentity)){
	 and is_identity=#isIdentity#
	@}
	@if(!isEmpty(themeAddtime)){
	 and theme_addtime=#themeAddtime#
	@}
	@if(!isEmpty(themeEditname)){
	 and theme_editname=#themeEditname#
	@}
	@if(!isEmpty(themeEdittime)){
	 and theme_edittime=#themeEdittime#
	@}
	@if(!isEmpty(themeLikecount)){
	 and theme_likecount=#themeLikecount#
	@}
	@if(!isEmpty(themeCommentcount)){
	 and theme_commentcount=#themeCommentcount#
	@}
	@if(!isEmpty(themeBrowsecount)){
	 and theme_browsecount=#themeBrowsecount#
	@}
	@if(!isEmpty(themeSharecount)){
	 and theme_sharecount=#themeSharecount#
	@}
	@if(!isEmpty(isStick)){
	 and is_stick=#isStick#
	@}
	@if(!isEmpty(isDigest)){
	 and is_digest=#isDigest#
	@}
	@if(!isEmpty(lastspeakId)){
	 and lastspeak_id=#lastspeakId#
	@}
	@if(!isEmpty(lastspeakName)){
	 and lastspeak_name=#lastspeakName#
	@}
	@if(!isEmpty(lastspeakTime)){
	 and lastspeak_time=#lastspeakTime#
	@}
	@if(!isEmpty(hasGoods)){
	 and has_goods=#hasGoods#
	@}
	@if(!isEmpty(hasAffix)){
	 and has_affix=#hasAffix#
	@}
	@if(!isEmpty(isClosed)){
	 and is_closed=#isClosed#
	@}
	@if(!isEmpty(isRecommend)){
	 and is_recommend=#isRecommend#
	@}
	@if(!isEmpty(isShut)){
	 and is_shut=#isShut#
	@}
	@if(!isEmpty(themeExp)){
	 and theme_exp=#themeExp#
	@}
	@if(!isEmpty(themeReadperm)){
	 and theme_readperm=#themeReadperm#
	@}
	@if(!isEmpty(themeSpecial)){
	 and theme_special=#themeSpecial#
	@}
	
	