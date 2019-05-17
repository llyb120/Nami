sample
===
* 注释

	select #use("cols")# from ra_sns_friend  where  #use("condition")#

cols
===
	friend_id,friend_frommid,friend_frommname,friend_frommavatar,friend_tomid,friend_tomname,friend_tomavatar,friend_addtime,friend_followstate

updateSample
===
	
	friend_id=#friendId#,friend_frommid=#friendFrommid#,friend_frommname=#friendFrommname#,friend_frommavatar=#friendFrommavatar#,friend_tomid=#friendTomid#,friend_tomname=#friendTomname#,friend_tomavatar=#friendTomavatar#,friend_addtime=#friendAddtime#,friend_followstate=#friendFollowstate#

condition
===

	1 = 1  
	@if(!isEmpty(friendId)){
	 and friend_id=#friendId#
	@}
	@if(!isEmpty(friendFrommid)){
	 and friend_frommid=#friendFrommid#
	@}
	@if(!isEmpty(friendFrommname)){
	 and friend_frommname=#friendFrommname#
	@}
	@if(!isEmpty(friendFrommavatar)){
	 and friend_frommavatar=#friendFrommavatar#
	@}
	@if(!isEmpty(friendTomid)){
	 and friend_tomid=#friendTomid#
	@}
	@if(!isEmpty(friendTomname)){
	 and friend_tomname=#friendTomname#
	@}
	@if(!isEmpty(friendTomavatar)){
	 and friend_tomavatar=#friendTomavatar#
	@}
	@if(!isEmpty(friendAddtime)){
	 and friend_addtime=#friendAddtime#
	@}
	@if(!isEmpty(friendFollowstate)){
	 and friend_followstate=#friendFollowstate#
	@}
	
	