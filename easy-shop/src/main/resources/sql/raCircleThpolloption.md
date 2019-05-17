sample
===
* 注释

	select #use("cols")# from ra_circle_thpolloption  where  #use("condition")#

cols
===
	pollop_id,theme_id,pollop_option,pollop_votes,pollop_sort,pollop_votername

updateSample
===
	
	pollop_id=#pollopId#,theme_id=#themeId#,pollop_option=#pollopOption#,pollop_votes=#pollopVotes#,pollop_sort=#pollopSort#,pollop_votername=#pollopVotername#

condition
===

	1 = 1  
	@if(!isEmpty(pollopId)){
	 and pollop_id=#pollopId#
	@}
	@if(!isEmpty(themeId)){
	 and theme_id=#themeId#
	@}
	@if(!isEmpty(pollopOption)){
	 and pollop_option=#pollopOption#
	@}
	@if(!isEmpty(pollopVotes)){
	 and pollop_votes=#pollopVotes#
	@}
	@if(!isEmpty(pollopSort)){
	 and pollop_sort=#pollopSort#
	@}
	@if(!isEmpty(pollopVotername)){
	 and pollop_votername=#pollopVotername#
	@}
	
	