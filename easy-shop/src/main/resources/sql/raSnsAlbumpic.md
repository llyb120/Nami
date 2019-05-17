sample
===
* 注释

	select #use("cols")# from ra_sns_albumpic  where  #use("condition")#

cols
===
	ap_id,ap_name,ac_id,ap_cover,ap_size,ap_spec,member_id,upload_time,ap_type,item_id

updateSample
===
	
	ap_id=#apId#,ap_name=#apName#,ac_id=#acId#,ap_cover=#apCover#,ap_size=#apSize#,ap_spec=#apSpec#,member_id=#memberId#,upload_time=#uploadTime#,ap_type=#apType#,item_id=#itemId#

condition
===

	1 = 1  
	@if(!isEmpty(apId)){
	 and ap_id=#apId#
	@}
	@if(!isEmpty(apName)){
	 and ap_name=#apName#
	@}
	@if(!isEmpty(acId)){
	 and ac_id=#acId#
	@}
	@if(!isEmpty(apCover)){
	 and ap_cover=#apCover#
	@}
	@if(!isEmpty(apSize)){
	 and ap_size=#apSize#
	@}
	@if(!isEmpty(apSpec)){
	 and ap_spec=#apSpec#
	@}
	@if(!isEmpty(memberId)){
	 and member_id=#memberId#
	@}
	@if(!isEmpty(uploadTime)){
	 and upload_time=#uploadTime#
	@}
	@if(!isEmpty(apType)){
	 and ap_type=#apType#
	@}
	@if(!isEmpty(itemId)){
	 and item_id=#itemId#
	@}
	
	