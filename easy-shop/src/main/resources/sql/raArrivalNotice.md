sample
===
* 注释

	select #use("cols")# from ra_arrival_notice  where  #use("condition")#

cols
===
	an_id,goods_id,goods_name,member_id,an_addtime,an_email,an_mobile,an_type

updateSample
===
	
	an_id=#anId#,goods_id=#goodsId#,goods_name=#goodsName#,member_id=#memberId#,an_addtime=#anAddtime#,an_email=#anEmail#,an_mobile=#anMobile#,an_type=#anType#

condition
===

	1 = 1  
	@if(!isEmpty(anId)){
	 and an_id=#anId#
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
	@if(!isEmpty(anAddtime)){
	 and an_addtime=#anAddtime#
	@}
	@if(!isEmpty(anEmail)){
	 and an_email=#anEmail#
	@}
	@if(!isEmpty(anMobile)){
	 and an_mobile=#anMobile#
	@}
	@if(!isEmpty(anType)){
	 and an_type=#anType#
	@}
	
	