sample
===
* 注释

	select #use("cols")# from ra_p_bundling_quota  where  #use("condition")#

cols
===
	bl_quota_id,store_id,store_name,member_id,member_name,bl_quota_month,bl_quota_starttime,bl_quota_endtime,bl_state

updateSample
===
	
	bl_quota_id=#blQuotaId#,store_id=#storeId#,store_name=#storeName#,member_id=#memberId#,member_name=#memberName#,bl_quota_month=#blQuotaMonth#,bl_quota_starttime=#blQuotaStarttime#,bl_quota_endtime=#blQuotaEndtime#,bl_state=#blState#

condition
===

	1 = 1  
	@if(!isEmpty(blQuotaId)){
	 and bl_quota_id=#blQuotaId#
	@}
	@if(!isEmpty(storeId)){
	 and store_id=#storeId#
	@}
	@if(!isEmpty(storeName)){
	 and store_name=#storeName#
	@}
	@if(!isEmpty(memberId)){
	 and member_id=#memberId#
	@}
	@if(!isEmpty(memberName)){
	 and member_name=#memberName#
	@}
	@if(!isEmpty(blQuotaMonth)){
	 and bl_quota_month=#blQuotaMonth#
	@}
	@if(!isEmpty(blQuotaStarttime)){
	 and bl_quota_starttime=#blQuotaStarttime#
	@}
	@if(!isEmpty(blQuotaEndtime)){
	 and bl_quota_endtime=#blQuotaEndtime#
	@}
	@if(!isEmpty(blState)){
	 and bl_state=#blState#
	@}
	
	