sample
===
* 注释

	select #use("cols")# from ra_setting  where  #use("condition")#

cols
===
	name,value

updateSample
===
	
	name=#name#,value=#value#

condition
===

	1 = 1  
	@if(!isEmpty(name)){
	 and name=#name#
	@}
	@if(!isEmpty(value)){
	 and value=#value#
	@}
	
	