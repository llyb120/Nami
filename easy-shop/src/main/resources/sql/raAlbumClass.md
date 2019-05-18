查询相册
===
select g.*, 
    (select count(1) from ra_album_pic where aclass_id = g.aclass_id) as total
from ra_album_class g
where g.store_id = #storeId#
order by g.aclass_sort asc


pic_to_default
===
update ra_album_pic
set aclass_id = (
select aclass_id from ra_album_class where is_default = 1 limit 1
) where aclass_id = #id#

sample
===
* 注释

	select #use("cols")# from ra_album_class  where  #use("condition")#

cols
===
	aclass_id,aclass_name,store_id,aclass_des,aclass_sort,aclass_cover,upload_time,is_default

updateSample
===
	
	aclass_id=#aclassId#,aclass_name=#aclassName#,store_id=#storeId#,aclass_des=#aclassDes#,aclass_sort=#aclassSort#,aclass_cover=#aclassCover#,upload_time=#uploadTime#,is_default=#isDefault#

condition
===

	1 = 1  
	@if(!isEmpty(aclassId)){
	 and aclass_id=#aclassId#
	@}
	@if(!isEmpty(aclassName)){
	 and aclass_name=#aclassName#
	@}
	@if(!isEmpty(storeId)){
	 and store_id=#storeId#
	@}
	@if(!isEmpty(aclassDes)){
	 and aclass_des=#aclassDes#
	@}
	@if(!isEmpty(aclassSort)){
	 and aclass_sort=#aclassSort#
	@}
	@if(!isEmpty(aclassCover)){
	 and aclass_cover=#aclassCover#
	@}
	@if(!isEmpty(uploadTime)){
	 and upload_time=#uploadTime#
	@}
	@if(!isEmpty(isDefault)){
	 and is_default=#isDefault#
	@}
	
	