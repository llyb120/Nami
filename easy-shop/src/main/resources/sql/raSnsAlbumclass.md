sample
===
* 注释

	select #use("cols")# from ra_sns_albumclass  where  #use("condition")#

cols
===
	ac_id,ac_name,member_id,ac_des,ac_sort,ac_cover,upload_time,is_default

updateSample
===
	
	ac_id=#acId#,ac_name=#acName#,member_id=#memberId#,ac_des=#acDes#,ac_sort=#acSort#,ac_cover=#acCover#,upload_time=#uploadTime#,is_default=#isDefault#

condition
===

	1 = 1  
	@if(!isEmpty(acId)){
	 and ac_id=#acId#
	@}
	@if(!isEmpty(acName)){
	 and ac_name=#acName#
	@}
	@if(!isEmpty(memberId)){
	 and member_id=#memberId#
	@}
	@if(!isEmpty(acDes)){
	 and ac_des=#acDes#
	@}
	@if(!isEmpty(acSort)){
	 and ac_sort=#acSort#
	@}
	@if(!isEmpty(acCover)){
	 and ac_cover=#acCover#
	@}
	@if(!isEmpty(uploadTime)){
	 and upload_time=#uploadTime#
	@}
	@if(!isEmpty(isDefault)){
	 and is_default=#isDefault#
	@}
	
	