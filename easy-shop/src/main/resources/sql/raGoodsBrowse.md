sample
===
* 注释

	select #use("cols")# from ra_goods_browse  where  #use("condition")#

cols
===
	browse_id,goods_id,member_id,browsetime,gc_id,gc_id_1,gc_id_2,gc_id_3

updateSample
===
	
	browse_id=#browseId#,goods_id=#goodsId#,member_id=#memberId#,browsetime=#browsetime#,gc_id=#gcId#,gc_id_1=#gcId1#,gc_id_2=#gcId2#,gc_id_3=#gcId3#

condition
===

	1 = 1  
	@if(!isEmpty(browseId)){
	 and browse_id=#browseId#
	@}
	@if(!isEmpty(goodsId)){
	 and goods_id=#goodsId#
	@}
	@if(!isEmpty(memberId)){
	 and member_id=#memberId#
	@}
	@if(!isEmpty(browsetime)){
	 and browsetime=#browsetime#
	@}
	@if(!isEmpty(gcId)){
	 and gc_id=#gcId#
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
	
	