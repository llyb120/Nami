sample
===
* 注释

	select #use("cols")# from ra_goods_class_staple  where  #use("condition")#

cols
===
	staple_id,staple_name,gc_id_1,gc_id_2,gc_id_3,type_id,member_id,counter

updateSample
===
	
	staple_id=#stapleId#,staple_name=#stapleName#,gc_id_1=#gcId1#,gc_id_2=#gcId2#,gc_id_3=#gcId3#,type_id=#typeId#,member_id=#memberId#,counter=#counter#

condition
===

	1 = 1  
	@if(!isEmpty(stapleId)){
	 and staple_id=#stapleId#
	@}
	@if(!isEmpty(stapleName)){
	 and staple_name=#stapleName#
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
	@if(!isEmpty(typeId)){
	 and type_id=#typeId#
	@}
	@if(!isEmpty(memberId)){
	 and member_id=#memberId#
	@}
	@if(!isEmpty(counter)){
	 and counter=#counter#
	@}
	
	