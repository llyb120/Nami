sample
===
* 注释

	select #use("cols")# from ra_hangzhou_order_goods  where  #use("condition")#

cols
===
	id,order_id,commodityName,commodityBarcode,shouldInQty,commodityPrice,RealInQty,damageNum,goods_commonid

updateSample
===
	
	id=#id#,order_id=#orderId#,commodityName=#commodityname#,commodityBarcode=#commoditybarcode#,shouldInQty=#shouldinqty#,commodityPrice=#commodityprice#,RealInQty=#realinqty#,damageNum=#damagenum#,goods_commonid=#goodsCommonid#

condition
===

	1 = 1  
	@if(!isEmpty(id)){
	 and id=#id#
	@}
	@if(!isEmpty(orderId)){
	 and order_id=#orderId#
	@}
	@if(!isEmpty(commodityname)){
	 and commodityName=#commodityname#
	@}
	@if(!isEmpty(commoditybarcode)){
	 and commodityBarcode=#commoditybarcode#
	@}
	@if(!isEmpty(shouldinqty)){
	 and shouldInQty=#shouldinqty#
	@}
	@if(!isEmpty(commodityprice)){
	 and commodityPrice=#commodityprice#
	@}
	@if(!isEmpty(realinqty)){
	 and RealInQty=#realinqty#
	@}
	@if(!isEmpty(damagenum)){
	 and damageNum=#damagenum#
	@}
	@if(!isEmpty(goodsCommonid)){
	 and goods_commonid=#goodsCommonid#
	@}
	
	