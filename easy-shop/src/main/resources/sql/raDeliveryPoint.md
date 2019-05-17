sample
===
* 注释

	select #use("cols")# from ra_delivery_point  where  #use("condition")#

cols
===
	dlyp_id,dlyp_name,dlyp_passwd,dlyp_truename,dlyp_mobile,dlyp_telephony,dlyp_address_name,dlyp_area_2,dlyp_area_3,dlyp_area_info,dlyp_address,dlyp_idcard,dlyp_idcard_image,dlyp_addtime,dlyp_state,dlyp_fail_reason

updateSample
===
	
	dlyp_id=#dlypId#,dlyp_name=#dlypName#,dlyp_passwd=#dlypPasswd#,dlyp_truename=#dlypTruename#,dlyp_mobile=#dlypMobile#,dlyp_telephony=#dlypTelephony#,dlyp_address_name=#dlypAddressName#,dlyp_area_2=#dlypArea2#,dlyp_area_3=#dlypArea3#,dlyp_area_info=#dlypAreaInfo#,dlyp_address=#dlypAddress#,dlyp_idcard=#dlypIdcard#,dlyp_idcard_image=#dlypIdcardImage#,dlyp_addtime=#dlypAddtime#,dlyp_state=#dlypState#,dlyp_fail_reason=#dlypFailReason#

condition
===

	1 = 1  
	@if(!isEmpty(dlypId)){
	 and dlyp_id=#dlypId#
	@}
	@if(!isEmpty(dlypName)){
	 and dlyp_name=#dlypName#
	@}
	@if(!isEmpty(dlypPasswd)){
	 and dlyp_passwd=#dlypPasswd#
	@}
	@if(!isEmpty(dlypTruename)){
	 and dlyp_truename=#dlypTruename#
	@}
	@if(!isEmpty(dlypMobile)){
	 and dlyp_mobile=#dlypMobile#
	@}
	@if(!isEmpty(dlypTelephony)){
	 and dlyp_telephony=#dlypTelephony#
	@}
	@if(!isEmpty(dlypAddressName)){
	 and dlyp_address_name=#dlypAddressName#
	@}
	@if(!isEmpty(dlypArea2)){
	 and dlyp_area_2=#dlypArea2#
	@}
	@if(!isEmpty(dlypArea3)){
	 and dlyp_area_3=#dlypArea3#
	@}
	@if(!isEmpty(dlypAreaInfo)){
	 and dlyp_area_info=#dlypAreaInfo#
	@}
	@if(!isEmpty(dlypAddress)){
	 and dlyp_address=#dlypAddress#
	@}
	@if(!isEmpty(dlypIdcard)){
	 and dlyp_idcard=#dlypIdcard#
	@}
	@if(!isEmpty(dlypIdcardImage)){
	 and dlyp_idcard_image=#dlypIdcardImage#
	@}
	@if(!isEmpty(dlypAddtime)){
	 and dlyp_addtime=#dlypAddtime#
	@}
	@if(!isEmpty(dlypState)){
	 and dlyp_state=#dlypState#
	@}
	@if(!isEmpty(dlypFailReason)){
	 and dlyp_fail_reason=#dlypFailReason#
	@}
	
	