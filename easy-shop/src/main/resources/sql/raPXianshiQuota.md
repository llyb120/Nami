sample
===
* 注释

	select #use("cols")# from ra_p_xianshi_quota  where  #use("condition")#

cols
===
	quota_id,member_id,store_id,member_name,store_name,start_time,end_time

updateSample
===
	
	quota_id=#quotaId#,member_id=#memberId#,store_id=#storeId#,member_name=#memberName#,store_name=#storeName#,start_time=#startTime#,end_time=#endTime#

condition
===

	1 = 1  
	@if(!isEmpty(quotaId)){
	 and quota_id=#quotaId#
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
	
	