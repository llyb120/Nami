sample
===
* 注释

	select #use("cols")# from ra_complain  where  #use("condition")#

cols
===
	complain_id,order_id,order_goods_id,accuser_id,accuser_name,accused_id,accused_name,complain_subject_content,complain_subject_id,complain_content,complain_pic1,complain_pic2,complain_pic3,complain_datetime,complain_handle_datetime,complain_handle_member_id,appeal_message,appeal_datetime,appeal_pic1,appeal_pic2,appeal_pic3,final_handle_message,final_handle_datetime,final_handle_member_id,complain_state,complain_active

updateSample
===
	
	complain_id=#complainId#,order_id=#orderId#,order_goods_id=#orderGoodsId#,accuser_id=#accuserId#,accuser_name=#accuserName#,accused_id=#accusedId#,accused_name=#accusedName#,complain_subject_content=#complainSubjectContent#,complain_subject_id=#complainSubjectId#,complain_content=#complainContent#,complain_pic1=#complainPic1#,complain_pic2=#complainPic2#,complain_pic3=#complainPic3#,complain_datetime=#complainDatetime#,complain_handle_datetime=#complainHandleDatetime#,complain_handle_member_id=#complainHandleMemberId#,appeal_message=#appealMessage#,appeal_datetime=#appealDatetime#,appeal_pic1=#appealPic1#,appeal_pic2=#appealPic2#,appeal_pic3=#appealPic3#,final_handle_message=#finalHandleMessage#,final_handle_datetime=#finalHandleDatetime#,final_handle_member_id=#finalHandleMemberId#,complain_state=#complainState#,complain_active=#complainActive#

condition
===

	1 = 1  
	@if(!isEmpty(complainId)){
	 and complain_id=#complainId#
	@}
	@if(!isEmpty(orderId)){
	 and order_id=#orderId#
	@}
	@if(!isEmpty(orderGoodsId)){
	 and order_goods_id=#orderGoodsId#
	@}
	@if(!isEmpty(accuserId)){
	 and accuser_id=#accuserId#
	@}
	@if(!isEmpty(accuserName)){
	 and accuser_name=#accuserName#
	@}
	@if(!isEmpty(accusedId)){
	 and accused_id=#accusedId#
	@}
	@if(!isEmpty(accusedName)){
	 and accused_name=#accusedName#
	@}
	@if(!isEmpty(complainSubjectContent)){
	 and complain_subject_content=#complainSubjectContent#
	@}
	@if(!isEmpty(complainSubjectId)){
	 and complain_subject_id=#complainSubjectId#
	@}
	@if(!isEmpty(complainContent)){
	 and complain_content=#complainContent#
	@}
	@if(!isEmpty(complainPic1)){
	 and complain_pic1=#complainPic1#
	@}
	@if(!isEmpty(complainPic2)){
	 and complain_pic2=#complainPic2#
	@}
	@if(!isEmpty(complainPic3)){
	 and complain_pic3=#complainPic3#
	@}
	@if(!isEmpty(complainDatetime)){
	 and complain_datetime=#complainDatetime#
	@}
	@if(!isEmpty(complainHandleDatetime)){
	 and complain_handle_datetime=#complainHandleDatetime#
	@}
	@if(!isEmpty(complainHandleMemberId)){
	 and complain_handle_member_id=#complainHandleMemberId#
	@}
	@if(!isEmpty(appealMessage)){
	 and appeal_message=#appealMessage#
	@}
	@if(!isEmpty(appealDatetime)){
	 and appeal_datetime=#appealDatetime#
	@}
	@if(!isEmpty(appealPic1)){
	 and appeal_pic1=#appealPic1#
	@}
	@if(!isEmpty(appealPic2)){
	 and appeal_pic2=#appealPic2#
	@}
	@if(!isEmpty(appealPic3)){
	 and appeal_pic3=#appealPic3#
	@}
	@if(!isEmpty(finalHandleMessage)){
	 and final_handle_message=#finalHandleMessage#
	@}
	@if(!isEmpty(finalHandleDatetime)){
	 and final_handle_datetime=#finalHandleDatetime#
	@}
	@if(!isEmpty(finalHandleMemberId)){
	 and final_handle_member_id=#finalHandleMemberId#
	@}
	@if(!isEmpty(complainState)){
	 and complain_state=#complainState#
	@}
	@if(!isEmpty(complainActive)){
	 and complain_active=#complainActive#
	@}
	
	