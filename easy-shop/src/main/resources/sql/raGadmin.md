sample
===
* 注释

	select #use("cols")# from ra_gadmin  where  #use("condition")#

cols
===
	gid,gname,limits

updateSample
===
	
	gid=#gid#,gname=#gname#,limits=#limits#

condition
===

	1 = 1  
	@if(!isEmpty(gid)){
	 and gid=#gid#
	@}
	@if(!isEmpty(gname)){
	 and gname=#gname#
	@}
	@if(!isEmpty(limits)){
	 and limits=#limits#
	@}
	
	