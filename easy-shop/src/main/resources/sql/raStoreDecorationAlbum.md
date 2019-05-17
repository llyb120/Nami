sample
===
* 注释

	select #use("cols")# from ra_store_decoration_album  where  #use("condition")#

cols
===
	image_id,image_name,image_origin_name,image_width,image_height,image_size,store_id,upload_time

updateSample
===
	
	image_id=#imageId#,image_name=#imageName#,image_origin_name=#imageOriginName#,image_width=#imageWidth#,image_height=#imageHeight#,image_size=#imageSize#,store_id=#storeId#,upload_time=#uploadTime#

condition
===

	1 = 1  
	@if(!isEmpty(imageId)){
	 and image_id=#imageId#
	@}
	@if(!isEmpty(imageName)){
	 and image_name=#imageName#
	@}
	@if(!isEmpty(imageOriginName)){
	 and image_origin_name=#imageOriginName#
	@}
	@if(!isEmpty(imageWidth)){
	 and image_width=#imageWidth#
	@}
	@if(!isEmpty(imageHeight)){
	 and image_height=#imageHeight#
	@}
	@if(!isEmpty(imageSize)){
	 and image_size=#imageSize#
	@}
	@if(!isEmpty(storeId)){
	 and store_id=#storeId#
	@}
	@if(!isEmpty(uploadTime)){
	 and upload_time=#uploadTime#
	@}
	
	