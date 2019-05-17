sample
===
* 注释

	select #use("cols")# from ra_circle_fs  where  #use("condition")#

cols
===
	circle_id,friendship_id,friendship_name,friendship_sort,friendship_status

updateSample
===
	
	circle_id=#circleId#,friendship_id=#friendshipId#,friendship_name=#friendshipName#,friendship_sort=#friendshipSort#,friendship_status=#friendshipStatus#

condition
===

	1 = 1  
	@if(!isEmpty(circleId)){
	 and circle_id=#circleId#
	@}
	@if(!isEmpty(friendshipId)){
	 and friendship_id=#friendshipId#
	@}
	@if(!isEmpty(friendshipName)){
	 and friendship_name=#friendshipName#
	@}
	@if(!isEmpty(friendshipSort)){
	 and friendship_sort=#friendshipSort#
	@}
	@if(!isEmpty(friendshipStatus)){
	 and friendship_status=#friendshipStatus#
	@}
	
	