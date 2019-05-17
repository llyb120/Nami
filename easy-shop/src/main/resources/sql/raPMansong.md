sample
===
* 注释

	select #use("cols")# from ra_p_mansong  where  #use("condition")#

cols
===
	mansong_id,mansong_name,quota_id,start_time,end_time,member_id,store_id,member_name,store_name,state,remark

updateSample
===
	
	mansong_id=#mansongId#,mansong_name=#mansongName#,quota_id=#quotaId#,start_time=#startTime#,end_time=#endTime#,member_id=#memberId#,store_id=#storeId#,member_name=#memberName#,store_name=#storeName#,state=#state#,remark=#remark#

condition
===

	1 = 1  
	@if(!isEmpty(mansongId)){
	 and mansong_id=#mansongId#
	@}
	@if(!isEmpty(mansongName)){
	 and mansong_name=#mansongName#
	@}
	@if(!isEmpty(quotaId)){
	 and quota_id=#quotaId#
	@}
	@if(!isEmpty(startTime)){
	 and start_time=#startTime#
	@}
	@if(!isEmpty(endTime)){
	 and end_time=#endTime#
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
	@if(!isEmpty(state)){
	 and state=#state#
	@}
	@if(!isEmpty(remark)){
	 and remark=#remark#
	@}
	
	