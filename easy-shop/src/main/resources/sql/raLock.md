sample
===
* 注释

	select #use("cols")# from ra_lock  where  #use("condition")#

cols
===
	pid,pvalue,expiretime

updateSample
===
	
	pid=#pid#,pvalue=#pvalue#,expiretime=#expiretime#

condition
===

	1 = 1  
	@if(!isEmpty(pid)){
	 and pid=#pid#
	@}
	@if(!isEmpty(pvalue)){
	 and pvalue=#pvalue#
	@}
	@if(!isEmpty(expiretime)){
	 and expiretime=#expiretime#
	@}
	
	