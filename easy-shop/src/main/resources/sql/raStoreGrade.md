sample
===
* 注释

	select #use("cols")# from ra_store_grade  where  #use("condition")#

cols
===
	sg_id,sg_name,sg_goods_limit,sg_album_limit,sg_space_limit,sg_template_number,sg_template,sg_price,sg_description,sg_function,sg_sort

updateSample
===
	
	sg_id=#sgId#,sg_name=#sgName#,sg_goods_limit=#sgGoodsLimit#,sg_album_limit=#sgAlbumLimit#,sg_space_limit=#sgSpaceLimit#,sg_template_number=#sgTemplateNumber#,sg_template=#sgTemplate#,sg_price=#sgPrice#,sg_description=#sgDescription#,sg_function=#sgFunction#,sg_sort=#sgSort#

condition
===

	1 = 1  
	@if(!isEmpty(sgId)){
	 and sg_id=#sgId#
	@}
	@if(!isEmpty(sgName)){
	 and sg_name=#sgName#
	@}
	@if(!isEmpty(sgGoodsLimit)){
	 and sg_goods_limit=#sgGoodsLimit#
	@}
	@if(!isEmpty(sgAlbumLimit)){
	 and sg_album_limit=#sgAlbumLimit#
	@}
	@if(!isEmpty(sgSpaceLimit)){
	 and sg_space_limit=#sgSpaceLimit#
	@}
	@if(!isEmpty(sgTemplateNumber)){
	 and sg_template_number=#sgTemplateNumber#
	@}
	@if(!isEmpty(sgTemplate)){
	 and sg_template=#sgTemplate#
	@}
	@if(!isEmpty(sgPrice)){
	 and sg_price=#sgPrice#
	@}
	@if(!isEmpty(sgDescription)){
	 and sg_description=#sgDescription#
	@}
	@if(!isEmpty(sgFunction)){
	 and sg_function=#sgFunction#
	@}
	@if(!isEmpty(sgSort)){
	 and sg_sort=#sgSort#
	@}
	
	