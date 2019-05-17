sample
===
* 注释

	select #use("cols")# from ra_area_copy  where  #use("condition")#

cols
===
	area_id,area_name,area_parent_id,area_sort,area_deep,area_region,area_code

updateSample
===
	
	area_id=#areaId#,area_name=#areaName#,area_parent_id=#areaParentId#,area_sort=#areaSort#,area_deep=#areaDeep#,area_region=#areaRegion#,area_code=#areaCode#

condition
===

	1 = 1  
	@if(!isEmpty(areaId)){
	 and area_id=#areaId#
	@}
	@if(!isEmpty(areaName)){
	 and area_name=#areaName#
	@}
	@if(!isEmpty(areaParentId)){
	 and area_parent_id=#areaParentId#
	@}
	@if(!isEmpty(areaSort)){
	 and area_sort=#areaSort#
	@}
	@if(!isEmpty(areaDeep)){
	 and area_deep=#areaDeep#
	@}
	@if(!isEmpty(areaRegion)){
	 and area_region=#areaRegion#
	@}
	@if(!isEmpty(areaCode)){
	 and area_code=#areaCode#
	@}
	
	