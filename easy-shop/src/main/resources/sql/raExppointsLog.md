sample
===
* 注释

	select #use("cols")# from ra_exppoints_log  where  #use("condition")#

cols
===
	exp_id,exp_memberid,exp_membername,exp_points,exp_addtime,exp_desc,exp_stage

updateSample
===
	
	exp_id=#expId#,exp_memberid=#expMemberid#,exp_membername=#expMembername#,exp_points=#expPoints#,exp_addtime=#expAddtime#,exp_desc=#expDesc#,exp_stage=#expStage#

condition
===

	1 = 1  
	@if(!isEmpty(expId)){
	 and exp_id=#expId#
	@}
	@if(!isEmpty(expMemberid)){
	 and exp_memberid=#expMemberid#
	@}
	@if(!isEmpty(expMembername)){
	 and exp_membername=#expMembername#
	@}
	@if(!isEmpty(expPoints)){
	 and exp_points=#expPoints#
	@}
	@if(!isEmpty(expAddtime)){
	 and exp_addtime=#expAddtime#
	@}
	@if(!isEmpty(expDesc)){
	 and exp_desc=#expDesc#
	@}
	@if(!isEmpty(expStage)){
	 and exp_stage=#expStage#
	@}
	
	