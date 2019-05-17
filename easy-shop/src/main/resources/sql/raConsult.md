sample
===
* 注释

	select #use("cols")# from ra_consult  where  #use("condition")#

cols
===
	consult_id,goods_id,goods_name,member_id,member_name,store_id,store_name,ct_id,consult_content,consult_addtime,consult_reply,consult_reply_time,isanonymous

updateSample
===
	
	consult_id=#consultId#,goods_id=#goodsId#,goods_name=#goodsName#,member_id=#memberId#,member_name=#memberName#,store_id=#storeId#,store_name=#storeName#,ct_id=#ctId#,consult_content=#consultContent#,consult_addtime=#consultAddtime#,consult_reply=#consultReply#,consult_reply_time=#consultReplyTime#,isanonymous=#isanonymous#

condition
===

	1 = 1  
	@if(!isEmpty(consultId)){
	 and consult_id=#consultId#
	@}
	@if(!isEmpty(goodsId)){
	 and goods_id=#goodsId#
	@}
	@if(!isEmpty(goodsName)){
	 and goods_name=#goodsName#
	@}
	@if(!isEmpty(memberId)){
	 and member_id=#memberId#
	@}
	@if(!isEmpty(memberName)){
	 and member_name=#memberName#
	@}
	@if(!isEmpty(storeId)){
	 and store_id=#storeId#
	@}
	@if(!isEmpty(storeName)){
	 and store_name=#storeName#
	@}
	@if(!isEmpty(ctId)){
	 and ct_id=#ctId#
	@}
	@if(!isEmpty(consultContent)){
	 and consult_content=#consultContent#
	@}
	@if(!isEmpty(consultAddtime)){
	 and consult_addtime=#consultAddtime#
	@}
	@if(!isEmpty(consultReply)){
	 and consult_reply=#consultReply#
	@}
	@if(!isEmpty(consultReplyTime)){
	 and consult_reply_time=#consultReplyTime#
	@}
	@if(!isEmpty(isanonymous)){
	 and isanonymous=#isanonymous#
	@}
	
	