sample
===
* 注释

	select #use("cols")# from ra_transport_extend  where  #use("condition")#

cols
===
	id,area_id,top_area_id,area_name,snum,sprice,xnum,xprice,is_default,transport_id,transport_title

updateSample
===
	
	id=#id#,area_id=#areaId#,top_area_id=#topAreaId#,area_name=#areaName#,snum=#snum#,sprice=#sprice#,xnum=#xnum#,xprice=#xprice#,is_default=#isDefault#,transport_id=#transportId#,transport_title=#transportTitle#

condition
===

	1 = 1  
	@if(!isEmpty(id)){
	 and id=#id#
	@}
	@if(!isEmpty(areaId)){
	 and area_id=#areaId#
	@}
	@if(!isEmpty(topAreaId)){
	 and top_area_id=#topAreaId#
	@}
	@if(!isEmpty(areaName)){
	 and area_name=#areaName#
	@}
	@if(!isEmpty(snum)){
	 and snum=#snum#
	@}
	@if(!isEmpty(sprice)){
	 and sprice=#sprice#
	@}
	@if(!isEmpty(xnum)){
	 and xnum=#xnum#
	@}
	@if(!isEmpty(xprice)){
	 and xprice=#xprice#
	@}
	@if(!isEmpty(isDefault)){
	 and is_default=#isDefault#
	@}
	@if(!isEmpty(transportId)){
	 and transport_id=#transportId#
	@}
	@if(!isEmpty(transportTitle)){
	 and transport_title=#transportTitle#
	@}
	
	