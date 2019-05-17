sample
===
* 注释

	select #use("cols")# from ra_vr_groupbuy_area  where  #use("condition")#

cols
===
	area_id,area_name,parent_area_id,add_time,first_letter,area_number,post,hot_city,number

updateSample
===
	
	area_id=#areaId#,area_name=#areaName#,parent_area_id=#parentAreaId#,add_time=#addTime#,first_letter=#firstLetter#,area_number=#areaNumber#,post=#post#,hot_city=#hotCity#,number=#number#

condition
===

	1 = 1  
	@if(!isEmpty(areaId)){
	 and area_id=#areaId#
	@}
	@if(!isEmpty(areaName)){
	 and area_name=#areaName#
	@}
	@if(!isEmpty(parentAreaId)){
	 and parent_area_id=#parentAreaId#
	@}
	@if(!isEmpty(addTime)){
	 and add_time=#addTime#
	@}
	@if(!isEmpty(firstLetter)){
	 and first_letter=#firstLetter#
	@}
	@if(!isEmpty(areaNumber)){
	 and area_number=#areaNumber#
	@}
	@if(!isEmpty(post)){
	 and post=#post#
	@}
	@if(!isEmpty(hotCity)){
	 and hot_city=#hotCity#
	@}
	@if(!isEmpty(number)){
	 and number=#number#
	@}
	
	