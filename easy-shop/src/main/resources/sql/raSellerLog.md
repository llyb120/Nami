sample
===
* 注释

	select #use("cols")# from ra_seller_log  where  #use("condition")#

cols
===
	log_id,log_content,log_time,log_seller_id,log_seller_name,log_store_id,log_seller_ip,log_url,log_state

updateSample
===
	
	log_id=#logId#,log_content=#logContent#,log_time=#logTime#,log_seller_id=#logSellerId#,log_seller_name=#logSellerName#,log_store_id=#logStoreId#,log_seller_ip=#logSellerIp#,log_url=#logUrl#,log_state=#logState#

condition
===

	1 = 1  
	@if(!isEmpty(logId)){
	 and log_id=#logId#
	@}
	@if(!isEmpty(logContent)){
	 and log_content=#logContent#
	@}
	@if(!isEmpty(logTime)){
	 and log_time=#logTime#
	@}
	@if(!isEmpty(logSellerId)){
	 and log_seller_id=#logSellerId#
	@}
	@if(!isEmpty(logSellerName)){
	 and log_seller_name=#logSellerName#
	@}
	@if(!isEmpty(logStoreId)){
	 and log_store_id=#logStoreId#
	@}
	@if(!isEmpty(logSellerIp)){
	 and log_seller_ip=#logSellerIp#
	@}
	@if(!isEmpty(logUrl)){
	 and log_url=#logUrl#
	@}
	@if(!isEmpty(logState)){
	 and log_state=#logState#
	@}
	
	