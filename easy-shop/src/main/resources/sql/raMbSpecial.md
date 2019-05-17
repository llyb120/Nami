sample
===
* 注释

	select #use("cols")# from ra_mb_special  where  #use("condition")#

cols
===
	special_id,special_desc

updateSample
===
	
	special_id=#specialId#,special_desc=#specialDesc#

condition
===

	1 = 1  
	@if(!isEmpty(specialId)){
	 and special_id=#specialId#
	@}
	@if(!isEmpty(specialDesc)){
	 and special_desc=#specialDesc#
	@}
	
	