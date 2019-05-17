sample
===
* 注释

	select #use("cols")# from ra_p_mansong_rule  where  #use("condition")#

cols
===
	rule_id,mansong_id,price,discount,mansong_goods_name,goods_id,voucher_t_id

updateSample
===
	
	rule_id=#ruleId#,mansong_id=#mansongId#,price=#price#,discount=#discount#,mansong_goods_name=#mansongGoodsName#,goods_id=#goodsId#,voucher_t_id=#voucherTId#

condition
===

	1 = 1  
	@if(!isEmpty(ruleId)){
	 and rule_id=#ruleId#
	@}
	@if(!isEmpty(mansongId)){
	 and mansong_id=#mansongId#
	@}
	@if(!isEmpty(price)){
	 and price=#price#
	@}
	@if(!isEmpty(discount)){
	 and discount=#discount#
	@}
	@if(!isEmpty(mansongGoodsName)){
	 and mansong_goods_name=#mansongGoodsName#
	@}
	@if(!isEmpty(goodsId)){
	 and goods_id=#goodsId#
	@}
	@if(!isEmpty(voucherTId)){
	 and voucher_t_id=#voucherTId#
	@}
	
	