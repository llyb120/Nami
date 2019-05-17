sample
===
* 注释

	select #use("cols")# from ra_inform  where  #use("condition")#

cols
===
	inform_id,inform_member_id,inform_member_name,inform_goods_id,inform_goods_name,inform_subject_id,inform_subject_content,inform_content,inform_pic1,inform_pic2,inform_pic3,inform_datetime,inform_store_id,inform_state,inform_handle_type,inform_handle_message,inform_handle_datetime,inform_handle_member_id,inform_goods_image,inform_store_name

updateSample
===
	
	inform_id=#informId#,inform_member_id=#informMemberId#,inform_member_name=#informMemberName#,inform_goods_id=#informGoodsId#,inform_goods_name=#informGoodsName#,inform_subject_id=#informSubjectId#,inform_subject_content=#informSubjectContent#,inform_content=#informContent#,inform_pic1=#informPic1#,inform_pic2=#informPic2#,inform_pic3=#informPic3#,inform_datetime=#informDatetime#,inform_store_id=#informStoreId#,inform_state=#informState#,inform_handle_type=#informHandleType#,inform_handle_message=#informHandleMessage#,inform_handle_datetime=#informHandleDatetime#,inform_handle_member_id=#informHandleMemberId#,inform_goods_image=#informGoodsImage#,inform_store_name=#informStoreName#

condition
===

	1 = 1  
	@if(!isEmpty(informId)){
	 and inform_id=#informId#
	@}
	@if(!isEmpty(informMemberId)){
	 and inform_member_id=#informMemberId#
	@}
	@if(!isEmpty(informMemberName)){
	 and inform_member_name=#informMemberName#
	@}
	@if(!isEmpty(informGoodsId)){
	 and inform_goods_id=#informGoodsId#
	@}
	@if(!isEmpty(informGoodsName)){
	 and inform_goods_name=#informGoodsName#
	@}
	@if(!isEmpty(informSubjectId)){
	 and inform_subject_id=#informSubjectId#
	@}
	@if(!isEmpty(informSubjectContent)){
	 and inform_subject_content=#informSubjectContent#
	@}
	@if(!isEmpty(informContent)){
	 and inform_content=#informContent#
	@}
	@if(!isEmpty(informPic1)){
	 and inform_pic1=#informPic1#
	@}
	@if(!isEmpty(informPic2)){
	 and inform_pic2=#informPic2#
	@}
	@if(!isEmpty(informPic3)){
	 and inform_pic3=#informPic3#
	@}
	@if(!isEmpty(informDatetime)){
	 and inform_datetime=#informDatetime#
	@}
	@if(!isEmpty(informStoreId)){
	 and inform_store_id=#informStoreId#
	@}
	@if(!isEmpty(informState)){
	 and inform_state=#informState#
	@}
	@if(!isEmpty(informHandleType)){
	 and inform_handle_type=#informHandleType#
	@}
	@if(!isEmpty(informHandleMessage)){
	 and inform_handle_message=#informHandleMessage#
	@}
	@if(!isEmpty(informHandleDatetime)){
	 and inform_handle_datetime=#informHandleDatetime#
	@}
	@if(!isEmpty(informHandleMemberId)){
	 and inform_handle_member_id=#informHandleMemberId#
	@}
	@if(!isEmpty(informGoodsImage)){
	 and inform_goods_image=#informGoodsImage#
	@}
	@if(!isEmpty(informStoreName)){
	 and inform_store_name=#informStoreName#
	@}
	
	