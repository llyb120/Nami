sample
===
* 注释

	select #use("cols")# from ra_mb_category  where  #use("condition")#

cols
===
	gc_id,gc_thumb

updateSample
===
	
	gc_id=#gcId#,gc_thumb=#gcThumb#

condition
===

	1 = 1  
	@if(!isEmpty(gcId)){
	 and gc_id=#gcId#
	@}
	@if(!isEmpty(gcThumb)){
	 and gc_thumb=#gcThumb#
	@}
	
	