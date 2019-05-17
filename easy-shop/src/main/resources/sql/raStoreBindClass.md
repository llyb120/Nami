sample
===
* 注释

	select #use("cols")# from ra_store_bind_class  where  #use("condition")#

cols
===
	bid,store_id,commis_rate,class_1,class_2,class_3,state

updateSample
===
	
	bid=#bid#,store_id=#storeId#,commis_rate=#commisRate#,class_1=#class1#,class_2=#class2#,class_3=#class3#,state=#state#

condition
===

	1 = 1  
	@if(!isEmpty(bid)){
	 and bid=#bid#
	@}
	@if(!isEmpty(storeId)){
	 and store_id=#storeId#
	@}
	@if(!isEmpty(commisRate)){
	 and commis_rate=#commisRate#
	@}
	@if(!isEmpty(class1)){
	 and class_1=#class1#
	@}
	@if(!isEmpty(class2)){
	 and class_2=#class2#
	@}
	@if(!isEmpty(class3)){
	 and class_3=#class3#
	@}
	@if(!isEmpty(state)){
	 and state=#state#
	@}
	
	