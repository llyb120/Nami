sample
===
* 注释

	select #use("cols")# from ra_goods_class_tag  where  #use("condition")#

cols
===
	gc_tag_id,gc_id_1,gc_id_2,gc_id_3,gc_tag_name,gc_tag_value,gc_id,type_id

updateSample
===
	
	gc_tag_id=#gcTagId#,gc_id_1=#gcId1#,gc_id_2=#gcId2#,gc_id_3=#gcId3#,gc_tag_name=#gcTagName#,gc_tag_value=#gcTagValue#,gc_id=#gcId#,type_id=#typeId#

condition
===

	1 = 1  
	@if(!isEmpty(gcTagId)){
	 and gc_tag_id=#gcTagId#
	@}
	@if(!isEmpty(gcId1)){
	 and gc_id_1=#gcId1#
	@}
	@if(!isEmpty(gcId2)){
	 and gc_id_2=#gcId2#
	@}
	@if(!isEmpty(gcId3)){
	 and gc_id_3=#gcId3#
	@}
	@if(!isEmpty(gcTagName)){
	 and gc_tag_name=#gcTagName#
	@}
	@if(!isEmpty(gcTagValue)){
	 and gc_tag_value=#gcTagValue#
	@}
	@if(!isEmpty(gcId)){
	 and gc_id=#gcId#
	@}
	@if(!isEmpty(typeId)){
	 and type_id=#typeId#
	@}
	
	