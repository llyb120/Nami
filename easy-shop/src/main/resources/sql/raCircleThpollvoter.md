sample
===
* 注释

	select #use("cols")# from ra_circle_thpollvoter  where  #use("condition")#

cols
===
	theme_id,member_id,member_name,pollvo_options,pollvo_time

updateSample
===
	
	theme_id=#themeId#,member_id=#memberId#,member_name=#memberName#,pollvo_options=#pollvoOptions#,pollvo_time=#pollvoTime#

condition
===

	1 = 1  
	@if(!isEmpty(themeId)){
	 and theme_id=#themeId#
	@}
	@if(!isEmpty(memberId)){
	 and member_id=#memberId#
	@}
	@if(!isEmpty(memberName)){
	 and member_name=#memberName#
	@}
	@if(!isEmpty(pollvoOptions)){
	 and pollvo_options=#pollvoOptions#
	@}
	@if(!isEmpty(pollvoTime)){
	 and pollvo_time=#pollvoTime#
	@}
	
	