select
===
select g.*, 
    (select count(1) from ra_album_pic where aclass_id = g.aclass_id) as total
from ra_album_class g
where g.store_id = #storeId#
order by g.aclass_sort asc


sample
===
* 注释

	select #use("cols")# from ra_album_class  where  #use("condition")#

cols
===
	aclass_id,aclass_name,store_id,aclass_des,aclass_sort,aclass_cover,upload_time,is_default,n_conver

updateSample
===
	
	aclass_id=#aclass_id#,aclass_name=#aclass_name#,store_id=#store_id#,aclass_des=#aclass_des#,aclass_sort=#aclass_sort#,aclass_cover=#aclass_cover#,upload_time=#upload_time#,is_default=#is_default#,n_conver=#n_conver#

condition
===

	1 = 1  
	@if(!isEmpty(aclass_id)){
	 and aclass_id=#aclass_id#
	@}
	@if(!isEmpty(aclass_name)){
	 and aclass_name=#aclass_name#
	@}
	@if(!isEmpty(store_id)){
	 and store_id=#store_id#
	@}
	@if(!isEmpty(aclass_des)){
	 and aclass_des=#aclass_des#
	@}
	@if(!isEmpty(aclass_sort)){
	 and aclass_sort=#aclass_sort#
	@}
	@if(!isEmpty(aclass_cover)){
	 and aclass_cover=#aclass_cover#
	@}
	@if(!isEmpty(upload_time)){
	 and upload_time=#upload_time#
	@}
	@if(!isEmpty(is_default)){
	 and is_default=#is_default#
	@}
	@if(!isEmpty(n_conver)){
	 and n_conver=#n_conver#
	@}
	
	