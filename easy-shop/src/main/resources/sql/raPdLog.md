sample
===
* 注释

	select #use("cols")# from ra_pd_log  where  #use("condition")#

cols
===
	lg_id,lg_member_id,lg_member_name,lg_admin_name,lg_type,lg_av_amount,lg_freeze_amount,lg_add_time,lg_desc

updateSample
===
	
	lg_id=#lgId#,lg_member_id=#lgMemberId#,lg_member_name=#lgMemberName#,lg_admin_name=#lgAdminName#,lg_type=#lgType#,lg_av_amount=#lgAvAmount#,lg_freeze_amount=#lgFreezeAmount#,lg_add_time=#lgAddTime#,lg_desc=#lgDesc#

condition
===

	1 = 1  
	@if(!isEmpty(lgId)){
	 and lg_id=#lgId#
	@}
	@if(!isEmpty(lgMemberId)){
	 and lg_member_id=#lgMemberId#
	@}
	@if(!isEmpty(lgMemberName)){
	 and lg_member_name=#lgMemberName#
	@}
	@if(!isEmpty(lgAdminName)){
	 and lg_admin_name=#lgAdminName#
	@}
	@if(!isEmpty(lgType)){
	 and lg_type=#lgType#
	@}
	@if(!isEmpty(lgAvAmount)){
	 and lg_av_amount=#lgAvAmount#
	@}
	@if(!isEmpty(lgFreezeAmount)){
	 and lg_freeze_amount=#lgFreezeAmount#
	@}
	@if(!isEmpty(lgAddTime)){
	 and lg_add_time=#lgAddTime#
	@}
	@if(!isEmpty(lgDesc)){
	 and lg_desc=#lgDesc#
	@}
	
	