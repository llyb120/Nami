sample
===
* 注释

	select #use("cols")# from ra_store_msg  where  #use("condition")#

cols
===
	sm_id,smt_code,store_id,sm_content,sm_addtime,sm_readids

updateSample
===
	
	sm_id=#smId#,smt_code=#smtCode#,store_id=#storeId#,sm_content=#smContent#,sm_addtime=#smAddtime#,sm_readids=#smReadids#

condition
===

	1 = 1  
	@if(!isEmpty(smId)){
	 and sm_id=#smId#
	@}
	@if(!isEmpty(smtCode)){
	 and smt_code=#smtCode#
	@}
	@if(!isEmpty(storeId)){
	 and store_id=#storeId#
	@}
	@if(!isEmpty(smContent)){
	 and sm_content=#smContent#
	@}
	@if(!isEmpty(smAddtime)){
	 and sm_addtime=#smAddtime#
	@}
	@if(!isEmpty(smReadids)){
	 and sm_readids=#smReadids#
	@}
	
	