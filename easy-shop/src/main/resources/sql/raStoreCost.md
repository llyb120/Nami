sample
===
* 注释

	select #use("cols")# from ra_store_cost  where  #use("condition")#

cols
===
	cost_id,cost_store_id,cost_seller_id,cost_price,cost_remark,cost_state,cost_time

updateSample
===
	
	cost_id=#costId#,cost_store_id=#costStoreId#,cost_seller_id=#costSellerId#,cost_price=#costPrice#,cost_remark=#costRemark#,cost_state=#costState#,cost_time=#costTime#

condition
===

	1 = 1  
	@if(!isEmpty(costId)){
	 and cost_id=#costId#
	@}
	@if(!isEmpty(costStoreId)){
	 and cost_store_id=#costStoreId#
	@}
	@if(!isEmpty(costSellerId)){
	 and cost_seller_id=#costSellerId#
	@}
	@if(!isEmpty(costPrice)){
	 and cost_price=#costPrice#
	@}
	@if(!isEmpty(costRemark)){
	 and cost_remark=#costRemark#
	@}
	@if(!isEmpty(costState)){
	 and cost_state=#costState#
	@}
	@if(!isEmpty(costTime)){
	 and cost_time=#costTime#
	@}
	
	