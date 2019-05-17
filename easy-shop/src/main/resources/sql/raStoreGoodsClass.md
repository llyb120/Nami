sample
===
* 注释

	select #use("cols")# from ra_store_goods_class  where  #use("condition")#

cols
===
	stc_id,stc_name,stc_parent_id,stc_state,store_id,stc_sort

updateSample
===
	
	stc_id=#stcId#,stc_name=#stcName#,stc_parent_id=#stcParentId#,stc_state=#stcState#,store_id=#storeId#,stc_sort=#stcSort#

condition
===

	1 = 1  
	@if(!isEmpty(stcId)){
	 and stc_id=#stcId#
	@}
	@if(!isEmpty(stcName)){
	 and stc_name=#stcName#
	@}
	@if(!isEmpty(stcParentId)){
	 and stc_parent_id=#stcParentId#
	@}
	@if(!isEmpty(stcState)){
	 and stc_state=#stcState#
	@}
	@if(!isEmpty(storeId)){
	 and store_id=#storeId#
	@}
	@if(!isEmpty(stcSort)){
	 and stc_sort=#stcSort#
	@}
	
	