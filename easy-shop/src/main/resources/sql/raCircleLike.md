sample
===
* 注释

	select #use("cols")# from ra_circle_like  where  #use("condition")#

cols
===
	theme_id,member_id,circle_id

updateSample
===
	
	theme_id=#themeId#,member_id=#memberId#,circle_id=#circleId#

condition
===

	1 = 1  
	@if(!isEmpty(themeId)){
	 and theme_id=#themeId#
	@}
	@if(!isEmpty(memberId)){
	 and member_id=#memberId#
	@}
	@if(!isEmpty(circleId)){
	 and circle_id=#circleId#
	@}
	
	