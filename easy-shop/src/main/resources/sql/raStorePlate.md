sample
===
* 注释

	select #use("cols")# from ra_store_plate  where  #use("condition")#

cols
===
	plate_id,plate_name,plate_position,plate_content,store_id

updateSample
===
	
	plate_id=#plateId#,plate_name=#plateName#,plate_position=#platePosition#,plate_content=#plateContent#,store_id=#storeId#

condition
===

	1 = 1  
	@if(!isEmpty(plateId)){
	 and plate_id=#plateId#
	@}
	@if(!isEmpty(plateName)){
	 and plate_name=#plateName#
	@}
	@if(!isEmpty(platePosition)){
	 and plate_position=#platePosition#
	@}
	@if(!isEmpty(plateContent)){
	 and plate_content=#plateContent#
	@}
	@if(!isEmpty(storeId)){
	 and store_id=#storeId#
	@}
	
	