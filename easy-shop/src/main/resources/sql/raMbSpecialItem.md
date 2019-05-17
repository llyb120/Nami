sample
===
* 注释

	select #use("cols")# from ra_mb_special_item  where  #use("condition")#

cols
===
	item_id,special_id,item_type,item_data,item_usable,item_sort

updateSample
===
	
	item_id=#itemId#,special_id=#specialId#,item_type=#itemType#,item_data=#itemData#,item_usable=#itemUsable#,item_sort=#itemSort#

condition
===

	1 = 1  
	@if(!isEmpty(itemId)){
	 and item_id=#itemId#
	@}
	@if(!isEmpty(specialId)){
	 and special_id=#specialId#
	@}
	@if(!isEmpty(itemType)){
	 and item_type=#itemType#
	@}
	@if(!isEmpty(itemData)){
	 and item_data=#itemData#
	@}
	@if(!isEmpty(itemUsable)){
	 and item_usable=#itemUsable#
	@}
	@if(!isEmpty(itemSort)){
	 and item_sort=#itemSort#
	@}
	
	