sample
===
* 注释

	select #use("cols")# from ra_upload  where  #use("condition")#

cols
===
	upload_id,file_name,file_thumb,file_size,upload_type,upload_time,item_id

updateSample
===
	
	upload_id=#uploadId#,file_name=#fileName#,file_thumb=#fileThumb#,file_size=#fileSize#,upload_type=#uploadType#,upload_time=#uploadTime#,item_id=#itemId#

condition
===

	1 = 1  
	@if(!isEmpty(uploadId)){
	 and upload_id=#uploadId#
	@}
	@if(!isEmpty(fileName)){
	 and file_name=#fileName#
	@}
	@if(!isEmpty(fileThumb)){
	 and file_thumb=#fileThumb#
	@}
	@if(!isEmpty(fileSize)){
	 and file_size=#fileSize#
	@}
	@if(!isEmpty(uploadType)){
	 and upload_type=#uploadType#
	@}
	@if(!isEmpty(uploadTime)){
	 and upload_time=#uploadTime#
	@}
	@if(!isEmpty(itemId)){
	 and item_id=#itemId#
	@}
	
	