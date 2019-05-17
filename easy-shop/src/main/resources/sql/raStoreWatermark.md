sample
===
* 注释

	select #use("cols")# from ra_store_watermark  where  #use("condition")#

cols
===
	wm_id,jpeg_quality,wm_image_name,wm_image_pos,wm_image_transition,wm_text,wm_text_size,wm_text_angle,wm_text_pos,wm_text_font,wm_text_color,wm_is_open,store_id

updateSample
===
	
	wm_id=#wmId#,jpeg_quality=#jpegQuality#,wm_image_name=#wmImageName#,wm_image_pos=#wmImagePos#,wm_image_transition=#wmImageTransition#,wm_text=#wmText#,wm_text_size=#wmTextSize#,wm_text_angle=#wmTextAngle#,wm_text_pos=#wmTextPos#,wm_text_font=#wmTextFont#,wm_text_color=#wmTextColor#,wm_is_open=#wmIsOpen#,store_id=#storeId#

condition
===

	1 = 1  
	@if(!isEmpty(wmId)){
	 and wm_id=#wmId#
	@}
	@if(!isEmpty(jpegQuality)){
	 and jpeg_quality=#jpegQuality#
	@}
	@if(!isEmpty(wmImageName)){
	 and wm_image_name=#wmImageName#
	@}
	@if(!isEmpty(wmImagePos)){
	 and wm_image_pos=#wmImagePos#
	@}
	@if(!isEmpty(wmImageTransition)){
	 and wm_image_transition=#wmImageTransition#
	@}
	@if(!isEmpty(wmText)){
	 and wm_text=#wmText#
	@}
	@if(!isEmpty(wmTextSize)){
	 and wm_text_size=#wmTextSize#
	@}
	@if(!isEmpty(wmTextAngle)){
	 and wm_text_angle=#wmTextAngle#
	@}
	@if(!isEmpty(wmTextPos)){
	 and wm_text_pos=#wmTextPos#
	@}
	@if(!isEmpty(wmTextFont)){
	 and wm_text_font=#wmTextFont#
	@}
	@if(!isEmpty(wmTextColor)){
	 and wm_text_color=#wmTextColor#
	@}
	@if(!isEmpty(wmIsOpen)){
	 and wm_is_open=#wmIsOpen#
	@}
	@if(!isEmpty(storeId)){
	 and store_id=#storeId#
	@}
	
	