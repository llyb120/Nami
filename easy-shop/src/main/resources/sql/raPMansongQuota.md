sample
===
* 注释

	select #use("cols")# from ra_p_mansong_quota  where  #use("condition")#

cols
===
	quota_id,apply_id,member_id,store_id,member_name,store_name,start_time,end_time,state

updateSample
===
	
	quota_id=#quotaId#,apply_id=#applyId#,member_id=#memberId#,store_id=#storeId#,member_name=#memberName#,store_name=#storeName#,start_time=#startTime#,end_time=#endTime#,state=#state#

condition
===

	1 = 1  
	@if(!isEmpty(quotaId)){
	 and quota_id=#quotaId#
	@}
	@if(!isEmpty(applyId)){
	 and apply_id=#applyId#
	@}
	@if(!isEmpty(memberId)){
	 and member_id=#memberId#
	@}
	@if(!isEmpty(storeId)){
	 and store_id=#storeId#
	@}
	@if(!isEmpty(memberName)){
	 and member_name=#memberName#
	@}
	@if(!isEmpty(storeName)){
	 and store_name=#storeName#
	@}
	@if(!isEmpty(startTime)){
	 and start_time=#startTime#
	@}
	@if(!isEmpty(endTime)){
	 and end_time=#endTime#
	@}
	@if(!isEmpty(state)){
	 and state=#state#
	@}
	
	