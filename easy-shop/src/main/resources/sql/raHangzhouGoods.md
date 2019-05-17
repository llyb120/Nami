sample
===
* 注释

	select #use("cols")# from ra_hangzhou_goods  where  #use("condition")#

cols
===
	id,commodityCode,goods_commonid,status

updateSample
===
	
	id=#id#,commodityCode=#commoditycode#,goods_commonid=#goodsCommonid#,status=#status#

condition
===

	1 = 1  
	@if(!isEmpty(id)){
	 and id=#id#
	@}
	@if(!isEmpty(commoditycode)){
	 and commodityCode=#commoditycode#
	@}
	@if(!isEmpty(goodsCommonid)){
	 and goods_commonid=#goodsCommonid#
	@}
	@if(!isEmpty(status)){
	 and status=#status#
	@}
	
	