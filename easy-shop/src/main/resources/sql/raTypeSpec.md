sample
===
* 注释

	select #use("cols")# from ra_type_spec  where  #use("condition")#

cols
===
	type_id,sp_id

updateSample
===
	
	type_id=#typeId#,sp_id=#spId#

condition
===

	1 = 1  
	@if(!isEmpty(typeId)){
	 and type_id=#typeId#
	@}
	@if(!isEmpty(spId)){
	 and sp_id=#spId#
	@}
	
	