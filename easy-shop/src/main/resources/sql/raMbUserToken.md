sample
===
* 注释

	select #use("cols")# from ra_mb_user_token  where  #use("condition")#

cols
===
	token_id,member_id,member_name,token,login_time,client_type

updateSample
===
	
	token_id=#tokenId#,member_id=#memberId#,member_name=#memberName#,token=#token#,login_time=#loginTime#,client_type=#clientType#

condition
===

	1 = 1  
	@if(!isEmpty(tokenId)){
	 and token_id=#tokenId#
	@}
	@if(!isEmpty(memberId)){
	 and member_id=#memberId#
	@}
	@if(!isEmpty(memberName)){
	 and member_name=#memberName#
	@}
	@if(!isEmpty(token)){
	 and token=#token#
	@}
	@if(!isEmpty(loginTime)){
	 and login_time=#loginTime#
	@}
	@if(!isEmpty(clientType)){
	 and client_type=#clientType#
	@}
	
	