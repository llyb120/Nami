sample
===
* 注释

	select #use("cols")# from ra_complain_talk  where  #use("condition")#

cols
===
	talk_id,complain_id,talk_member_id,talk_member_name,talk_member_type,talk_content,talk_state,talk_admin,talk_datetime

updateSample
===
	
	talk_id=#talkId#,complain_id=#complainId#,talk_member_id=#talkMemberId#,talk_member_name=#talkMemberName#,talk_member_type=#talkMemberType#,talk_content=#talkContent#,talk_state=#talkState#,talk_admin=#talkAdmin#,talk_datetime=#talkDatetime#

condition
===

	1 = 1  
	@if(!isEmpty(talkId)){
	 and talk_id=#talkId#
	@}
	@if(!isEmpty(complainId)){
	 and complain_id=#complainId#
	@}
	@if(!isEmpty(talkMemberId)){
	 and talk_member_id=#talkMemberId#
	@}
	@if(!isEmpty(talkMemberName)){
	 and talk_member_name=#talkMemberName#
	@}
	@if(!isEmpty(talkMemberType)){
	 and talk_member_type=#talkMemberType#
	@}
	@if(!isEmpty(talkContent)){
	 and talk_content=#talkContent#
	@}
	@if(!isEmpty(talkState)){
	 and talk_state=#talkState#
	@}
	@if(!isEmpty(talkAdmin)){
	 and talk_admin=#talkAdmin#
	@}
	@if(!isEmpty(talkDatetime)){
	 and talk_datetime=#talkDatetime#
	@}
	
	