sample
===
* 注释

	select #use("cols")# from ra_p_bundling  where  #use("condition")#

cols
===
	bl_id,bl_name,store_id,store_name,bl_discount_price,bl_freight_choose,bl_freight,bl_state

updateSample
===
	
	bl_id=#blId#,bl_name=#blName#,store_id=#storeId#,store_name=#storeName#,bl_discount_price=#blDiscountPrice#,bl_freight_choose=#blFreightChoose#,bl_freight=#blFreight#,bl_state=#blState#

condition
===

	1 = 1  
	@if(!isEmpty(blId)){
	 and bl_id=#blId#
	@}
	@if(!isEmpty(blName)){
	 and bl_name=#blName#
	@}
	@if(!isEmpty(storeId)){
	 and store_id=#storeId#
	@}
	@if(!isEmpty(storeName)){
	 and store_name=#storeName#
	@}
	@if(!isEmpty(blDiscountPrice)){
	 and bl_discount_price=#blDiscountPrice#
	@}
	@if(!isEmpty(blFreightChoose)){
	 and bl_freight_choose=#blFreightChoose#
	@}
	@if(!isEmpty(blFreight)){
	 and bl_freight=#blFreight#
	@}
	@if(!isEmpty(blState)){
	 and bl_state=#blState#
	@}
	
	