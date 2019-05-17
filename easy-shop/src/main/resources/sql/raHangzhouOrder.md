sample
===
* 注释

	select #use("cols")# from ra_hangzhou_order  where  #use("condition")#

cols
===
	id,code,time,companyCode,status,totalAmount

updateSample
===
	
	id=#id#,code=#code#,time=#time#,companyCode=#companycode#,status=#status#,totalAmount=#totalamount#

condition
===

	1 = 1  
	@if(!isEmpty(id)){
	 and id=#id#
	@}
	@if(!isEmpty(code)){
	 and code=#code#
	@}
	@if(!isEmpty(time)){
	 and time=#time#
	@}
	@if(!isEmpty(companycode)){
	 and companyCode=#companycode#
	@}
	@if(!isEmpty(status)){
	 and status=#status#
	@}
	@if(!isEmpty(totalamount)){
	 and totalAmount=#totalamount#
	@}
	
	