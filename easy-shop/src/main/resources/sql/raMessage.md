sample
===
* 注释

	select #use("cols")# from ra_message  where  #use("condition")#

cols
===
	message_id,message_parent_id,from_member_id,to_member_id,message_title,message_body,message_time,message_update_time,message_open,message_state,message_type,read_member_id,del_member_id,message_ismore,from_member_name,to_member_name

updateSample
===
	
	message_id=#messageId#,message_parent_id=#messageParentId#,from_member_id=#fromMemberId#,to_member_id=#toMemberId#,message_title=#messageTitle#,message_body=#messageBody#,message_time=#messageTime#,message_update_time=#messageUpdateTime#,message_open=#messageOpen#,message_state=#messageState#,message_type=#messageType#,read_member_id=#readMemberId#,del_member_id=#delMemberId#,message_ismore=#messageIsmore#,from_member_name=#fromMemberName#,to_member_name=#toMemberName#

condition
===

	1 = 1  
	@if(!isEmpty(messageId)){
	 and message_id=#messageId#
	@}
	@if(!isEmpty(messageParentId)){
	 and message_parent_id=#messageParentId#
	@}
	@if(!isEmpty(fromMemberId)){
	 and from_member_id=#fromMemberId#
	@}
	@if(!isEmpty(toMemberId)){
	 and to_member_id=#toMemberId#
	@}
	@if(!isEmpty(messageTitle)){
	 and message_title=#messageTitle#
	@}
	@if(!isEmpty(messageBody)){
	 and message_body=#messageBody#
	@}
	@if(!isEmpty(messageTime)){
	 and message_time=#messageTime#
	@}
	@if(!isEmpty(messageUpdateTime)){
	 and message_update_time=#messageUpdateTime#
	@}
	@if(!isEmpty(messageOpen)){
	 and message_open=#messageOpen#
	@}
	@if(!isEmpty(messageState)){
	 and message_state=#messageState#
	@}
	@if(!isEmpty(messageType)){
	 and message_type=#messageType#
	@}
	@if(!isEmpty(readMemberId)){
	 and read_member_id=#readMemberId#
	@}
	@if(!isEmpty(delMemberId)){
	 and del_member_id=#delMemberId#
	@}
	@if(!isEmpty(messageIsmore)){
	 and message_ismore=#messageIsmore#
	@}
	@if(!isEmpty(fromMemberName)){
	 and from_member_name=#fromMemberName#
	@}
	@if(!isEmpty(toMemberName)){
	 and to_member_name=#toMemberName#
	@}
	
	