sample
===
* 注释

	select #use("cols")# from ra_proxy_store_goods  where  #use("condition")#

cols
===
	id,member_id,goods_commonid

updateSample
===
	
	id=#id#,member_id=#memberId#,goods_commonid=#goodsCommonid#

condition
===

	1 = 1  
	@if(!isEmpty(id)){
	 and id=#id#
	@}
	@if(!isEmpty(memberId)){
	 and member_id=#memberId#
	@}
	@if(!isEmpty(goodsCommonid)){
	 and goods_commonid=#goodsCommonid#
	@}
	
	