sample
===
* 注释

	select #use("cols")# from ra_goods_combo  where  #use("condition")#

cols
===
	combo_id,goods_id,goods_commonid,combo_goodsid

updateSample
===
	
	combo_id=#comboId#,goods_id=#goodsId#,goods_commonid=#goodsCommonid#,combo_goodsid=#comboGoodsid#

condition
===

	1 = 1  
	@if(!isEmpty(comboId)){
	 and combo_id=#comboId#
	@}
	@if(!isEmpty(goodsId)){
	 and goods_id=#goodsId#
	@}
	@if(!isEmpty(goodsCommonid)){
	 and goods_commonid=#goodsCommonid#
	@}
	@if(!isEmpty(comboGoodsid)){
	 and combo_goodsid=#comboGoodsid#
	@}
	
	