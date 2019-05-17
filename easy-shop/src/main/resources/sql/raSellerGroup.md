sample
===
* 注释

	select #use("cols")# from ra_seller_group  where  #use("condition")#

cols
===
	group_id,group_name,limits,smt_limits,store_id

updateSample
===
	
	group_id=#groupId#,group_name=#groupName#,limits=#limits#,smt_limits=#smtLimits#,store_id=#storeId#

condition
===

	1 = 1  
	@if(!isEmpty(groupId)){
	 and group_id=#groupId#
	@}
	@if(!isEmpty(groupName)){
	 and group_name=#groupName#
	@}
	@if(!isEmpty(limits)){
	 and limits=#limits#
	@}
	@if(!isEmpty(smtLimits)){
	 and smt_limits=#smtLimits#
	@}
	@if(!isEmpty(storeId)){
	 and store_id=#storeId#
	@}
	
	