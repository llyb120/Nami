sample
===
* 注释

	select #use("cols")# from ra_circle_thpoll  where  #use("condition")#

cols
===
	theme_id,poll_multiple,poll_startime,poll_endtime,poll_days,poll_voters

updateSample
===
	
	theme_id=#themeId#,poll_multiple=#pollMultiple#,poll_startime=#pollStartime#,poll_endtime=#pollEndtime#,poll_days=#pollDays#,poll_voters=#pollVoters#

condition
===

	1 = 1  
	@if(!isEmpty(themeId)){
	 and theme_id=#themeId#
	@}
	@if(!isEmpty(pollMultiple)){
	 and poll_multiple=#pollMultiple#
	@}
	@if(!isEmpty(pollStartime)){
	 and poll_startime=#pollStartime#
	@}
	@if(!isEmpty(pollEndtime)){
	 and poll_endtime=#pollEndtime#
	@}
	@if(!isEmpty(pollDays)){
	 and poll_days=#pollDays#
	@}
	@if(!isEmpty(pollVoters)){
	 and poll_voters=#pollVoters#
	@}
	
	