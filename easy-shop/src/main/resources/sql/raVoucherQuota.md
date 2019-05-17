sample
===
* 注释

	select #use("cols")# from ra_voucher_quota  where  #use("condition")#

cols
===
	quota_id,quota_applyid,quota_memberid,quota_membername,quota_storeid,quota_storename,quota_starttime,quota_endtime,quota_state

updateSample
===
	
	quota_id=#quotaId#,quota_applyid=#quotaApplyid#,quota_memberid=#quotaMemberid#,quota_membername=#quotaMembername#,quota_storeid=#quotaStoreid#,quota_storename=#quotaStorename#,quota_starttime=#quotaStarttime#,quota_endtime=#quotaEndtime#,quota_state=#quotaState#

condition
===

	1 = 1  
	@if(!isEmpty(quotaId)){
	 and quota_id=#quotaId#
	@}
	@if(!isEmpty(quotaApplyid)){
	 and quota_applyid=#quotaApplyid#
	@}
	@if(!isEmpty(quotaMemberid)){
	 and quota_memberid=#quotaMemberid#
	@}
	@if(!isEmpty(quotaMembername)){
	 and quota_membername=#quotaMembername#
	@}
	@if(!isEmpty(quotaStoreid)){
	 and quota_storeid=#quotaStoreid#
	@}
	@if(!isEmpty(quotaStorename)){
	 and quota_storename=#quotaStorename#
	@}
	@if(!isEmpty(quotaStarttime)){
	 and quota_starttime=#quotaStarttime#
	@}
	@if(!isEmpty(quotaEndtime)){
	 and quota_endtime=#quotaEndtime#
	@}
	@if(!isEmpty(quotaState)){
	 and quota_state=#quotaState#
	@}
	
	