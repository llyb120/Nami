sample
===
* 注释

	select #use("cols")# from ra_simport_list  where  #use("condition")#

cols
===
	uuid,file,time

updateSample
===
	
	uuid=#uuid#,file=#file#,time=#time#

condition
===

	1 = 1  
	@if(!isEmpty(uuid)){
	 and uuid=#uuid#
	@}
	@if(!isEmpty(file)){
	 and file=#file#
	@}
	@if(!isEmpty(time)){
	 and time=#time#
	@}
	
	