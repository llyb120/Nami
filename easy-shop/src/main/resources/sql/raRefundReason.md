sample
===
* 注释

	select #use("cols")# from ra_refund_reason  where  #use("condition")#

cols
===
	reason_id,reason_info,sort,update_time

updateSample
===
	
	reason_id=#reasonId#,reason_info=#reasonInfo#,sort=#sort#,update_time=#updateTime#

condition
===

	1 = 1  
	@if(!isEmpty(reasonId)){
	 and reason_id=#reasonId#
	@}
	@if(!isEmpty(reasonInfo)){
	 and reason_info=#reasonInfo#
	@}
	@if(!isEmpty(sort)){
	 and sort=#sort#
	@}
	@if(!isEmpty(updateTime)){
	 and update_time=#updateTime#
	@}
	
	