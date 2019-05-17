sample
===
* 注释

	select #use("cols")# from ra_circle_member  where  #use("condition")#

cols
===
	member_id,circle_id,circle_name,member_name,cm_applycontent,cm_applytime,cm_state,cm_intro,cm_jointime,cm_level,cm_levelname,cm_exp,cm_nextexp,is_identity,is_allowspeak,is_star,cm_thcount,cm_comcount,cm_lastspeaktime,is_recommend

updateSample
===
	
	member_id=#memberId#,circle_id=#circleId#,circle_name=#circleName#,member_name=#memberName#,cm_applycontent=#cmApplycontent#,cm_applytime=#cmApplytime#,cm_state=#cmState#,cm_intro=#cmIntro#,cm_jointime=#cmJointime#,cm_level=#cmLevel#,cm_levelname=#cmLevelname#,cm_exp=#cmExp#,cm_nextexp=#cmNextexp#,is_identity=#isIdentity#,is_allowspeak=#isAllowspeak#,is_star=#isStar#,cm_thcount=#cmThcount#,cm_comcount=#cmComcount#,cm_lastspeaktime=#cmLastspeaktime#,is_recommend=#isRecommend#

condition
===

	1 = 1  
	@if(!isEmpty(memberId)){
	 and member_id=#memberId#
	@}
	@if(!isEmpty(circleId)){
	 and circle_id=#circleId#
	@}
	@if(!isEmpty(circleName)){
	 and circle_name=#circleName#
	@}
	@if(!isEmpty(memberName)){
	 and member_name=#memberName#
	@}
	@if(!isEmpty(cmApplycontent)){
	 and cm_applycontent=#cmApplycontent#
	@}
	@if(!isEmpty(cmApplytime)){
	 and cm_applytime=#cmApplytime#
	@}
	@if(!isEmpty(cmState)){
	 and cm_state=#cmState#
	@}
	@if(!isEmpty(cmIntro)){
	 and cm_intro=#cmIntro#
	@}
	@if(!isEmpty(cmJointime)){
	 and cm_jointime=#cmJointime#
	@}
	@if(!isEmpty(cmLevel)){
	 and cm_level=#cmLevel#
	@}
	@if(!isEmpty(cmLevelname)){
	 and cm_levelname=#cmLevelname#
	@}
	@if(!isEmpty(cmExp)){
	 and cm_exp=#cmExp#
	@}
	@if(!isEmpty(cmNextexp)){
	 and cm_nextexp=#cmNextexp#
	@}
	@if(!isEmpty(isIdentity)){
	 and is_identity=#isIdentity#
	@}
	@if(!isEmpty(isAllowspeak)){
	 and is_allowspeak=#isAllowspeak#
	@}
	@if(!isEmpty(isStar)){
	 and is_star=#isStar#
	@}
	@if(!isEmpty(cmThcount)){
	 and cm_thcount=#cmThcount#
	@}
	@if(!isEmpty(cmComcount)){
	 and cm_comcount=#cmComcount#
	@}
	@if(!isEmpty(cmLastspeaktime)){
	 and cm_lastspeaktime=#cmLastspeaktime#
	@}
	@if(!isEmpty(isRecommend)){
	 and is_recommend=#isRecommend#
	@}
	
	