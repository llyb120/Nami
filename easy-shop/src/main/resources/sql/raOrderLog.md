sample
===
* 注释

	select #use("cols")# from ra_order_log  where  #use("condition")#

cols
===
	log_id,order_id,log_msg,log_time,log_role,log_user,log_orderstate

updateSample
===
	
	log_id=#logId#,order_id=#orderId#,log_msg=#logMsg#,log_time=#logTime#,log_role=#logRole#,log_user=#logUser#,log_orderstate=#logOrderstate#

condition
===

	1 = 1  
	@if(!isEmpty(logId)){
	 and log_id=#logId#
	@}
	@if(!isEmpty(orderId)){
	 and order_id=#orderId#
	@}
	@if(!isEmpty(logMsg)){
	 and log_msg=#logMsg#
	@}
	@if(!isEmpty(logTime)){
	 and log_time=#logTime#
	@}
	@if(!isEmpty(logRole)){
	 and log_role=#logRole#
	@}
	@if(!isEmpty(logUser)){
	 and log_user=#logUser#
	@}
	@if(!isEmpty(logOrderstate)){
	 and log_orderstate=#logOrderstate#
	@}
	
	