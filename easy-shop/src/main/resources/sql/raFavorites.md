sample
===
* 注释

	select #use("cols")# from ra_favorites  where  #use("condition")#

cols
===
	id,member_id,fav_id,fav_type,fav_time

updateSample
===
	
	id=#id#,member_id=#memberId#,fav_id=#favId#,fav_type=#favType#,fav_time=#favTime#

condition
===

	1 = 1  
	@if(!isEmpty(id)){
	 and id=#id#
	@}
	@if(!isEmpty(memberId)){
	 and member_id=#memberId#
	@}
	@if(!isEmpty(favId)){
	 and fav_id=#favId#
	@}
	@if(!isEmpty(favType)){
	 and fav_type=#favType#
	@}
	@if(!isEmpty(favTime)){
	 and fav_time=#favTime#
	@}
	
	