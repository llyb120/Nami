sample
===
* 注释

	select #use("cols")# from ra_circle_mldefault  where  #use("condition")#

cols
===
	mld_id,mld_name,mld_exp

updateSample
===
	
	mld_id=#mldId#,mld_name=#mldName#,mld_exp=#mldExp#

condition
===

	1 = 1  
	@if(!isEmpty(mldId)){
	 and mld_id=#mldId#
	@}
	@if(!isEmpty(mldName)){
	 and mld_name=#mldName#
	@}
	@if(!isEmpty(mldExp)){
	 and mld_exp=#mldExp#
	@}
	
	