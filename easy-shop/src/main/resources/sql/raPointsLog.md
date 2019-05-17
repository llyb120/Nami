sample
===
* 注释

	select #use("cols")# from ra_points_log  where  #use("condition")#

cols
===
	pl_id,pl_memberid,pl_membername,pl_adminid,pl_adminname,pl_points,pl_addtime,pl_desc,pl_stage

updateSample
===
	
	pl_id=#plId#,pl_memberid=#plMemberid#,pl_membername=#plMembername#,pl_adminid=#plAdminid#,pl_adminname=#plAdminname#,pl_points=#plPoints#,pl_addtime=#plAddtime#,pl_desc=#plDesc#,pl_stage=#plStage#

condition
===

	1 = 1  
	@if(!isEmpty(plId)){
	 and pl_id=#plId#
	@}
	@if(!isEmpty(plMemberid)){
	 and pl_memberid=#plMemberid#
	@}
	@if(!isEmpty(plMembername)){
	 and pl_membername=#plMembername#
	@}
	@if(!isEmpty(plAdminid)){
	 and pl_adminid=#plAdminid#
	@}
	@if(!isEmpty(plAdminname)){
	 and pl_adminname=#plAdminname#
	@}
	@if(!isEmpty(plPoints)){
	 and pl_points=#plPoints#
	@}
	@if(!isEmpty(plAddtime)){
	 and pl_addtime=#plAddtime#
	@}
	@if(!isEmpty(plDesc)){
	 and pl_desc=#plDesc#
	@}
	@if(!isEmpty(plStage)){
	 and pl_stage=#plStage#
	@}
	
	