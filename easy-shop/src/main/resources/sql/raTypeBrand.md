sample
===
* 注释

	select #use("cols")# from ra_type_brand  where  #use("condition")#

cols
===
	type_id,brand_id

updateSample
===
	
	type_id=#typeId#,brand_id=#brandId#

condition
===

	1 = 1  
	@if(!isEmpty(typeId)){
	 and type_id=#typeId#
	@}
	@if(!isEmpty(brandId)){
	 and brand_id=#brandId#
	@}
	
	