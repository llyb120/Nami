sample
===
* 注释

	select #use("cols")# from ra_goods_attr_index  where  #use("condition")#

cols
===
	goods_id,goods_commonid,gc_id,type_id,attr_id,attr_value_id

updateSample
===
	
	goods_id=#goodsId#,goods_commonid=#goodsCommonid#,gc_id=#gcId#,type_id=#typeId#,attr_id=#attrId#,attr_value_id=#attrValueId#

condition
===

	1 = 1  
	@if(!isEmpty(goodsId)){
	 and goods_id=#goodsId#
	@}
	@if(!isEmpty(goodsCommonid)){
	 and goods_commonid=#goodsCommonid#
	@}
	@if(!isEmpty(gcId)){
	 and gc_id=#gcId#
	@}
	@if(!isEmpty(typeId)){
	 and type_id=#typeId#
	@}
	@if(!isEmpty(attrId)){
	 and attr_id=#attrId#
	@}
	@if(!isEmpty(attrValueId)){
	 and attr_value_id=#attrValueId#
	@}
	
	