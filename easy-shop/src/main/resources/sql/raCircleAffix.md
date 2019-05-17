sample
===
* 注释

	select #use("cols")# from ra_circle_affix  where  #use("condition")#

cols
===
	affix_id,affix_filename,affix_filethumb,affix_filesize,affix_addtime,affix_type,member_id,theme_id,reply_id,circle_id

updateSample
===
	
	affix_id=#affixId#,affix_filename=#affixFilename#,affix_filethumb=#affixFilethumb#,affix_filesize=#affixFilesize#,affix_addtime=#affixAddtime#,affix_type=#affixType#,member_id=#memberId#,theme_id=#themeId#,reply_id=#replyId#,circle_id=#circleId#

condition
===

	1 = 1  
	@if(!isEmpty(affixId)){
	 and affix_id=#affixId#
	@}
	@if(!isEmpty(affixFilename)){
	 and affix_filename=#affixFilename#
	@}
	@if(!isEmpty(affixFilethumb)){
	 and affix_filethumb=#affixFilethumb#
	@}
	@if(!isEmpty(affixFilesize)){
	 and affix_filesize=#affixFilesize#
	@}
	@if(!isEmpty(affixAddtime)){
	 and affix_addtime=#affixAddtime#
	@}
	@if(!isEmpty(affixType)){
	 and affix_type=#affixType#
	@}
	@if(!isEmpty(memberId)){
	 and member_id=#memberId#
	@}
	@if(!isEmpty(themeId)){
	 and theme_id=#themeId#
	@}
	@if(!isEmpty(replyId)){
	 and reply_id=#replyId#
	@}
	@if(!isEmpty(circleId)){
	 and circle_id=#circleId#
	@}
	
	