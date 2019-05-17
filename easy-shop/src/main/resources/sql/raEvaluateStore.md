sample
===
* 注释

	select #use("cols")# from ra_evaluate_store  where  #use("condition")#

cols
===
	seval_id,seval_orderid,seval_orderno,seval_addtime,seval_storeid,seval_storename,seval_memberid,seval_membername,seval_desccredit,seval_servicecredit,seval_deliverycredit

updateSample
===
	
	seval_id=#sevalId#,seval_orderid=#sevalOrderid#,seval_orderno=#sevalOrderno#,seval_addtime=#sevalAddtime#,seval_storeid=#sevalStoreid#,seval_storename=#sevalStorename#,seval_memberid=#sevalMemberid#,seval_membername=#sevalMembername#,seval_desccredit=#sevalDesccredit#,seval_servicecredit=#sevalServicecredit#,seval_deliverycredit=#sevalDeliverycredit#

condition
===

	1 = 1  
	@if(!isEmpty(sevalId)){
	 and seval_id=#sevalId#
	@}
	@if(!isEmpty(sevalOrderid)){
	 and seval_orderid=#sevalOrderid#
	@}
	@if(!isEmpty(sevalOrderno)){
	 and seval_orderno=#sevalOrderno#
	@}
	@if(!isEmpty(sevalAddtime)){
	 and seval_addtime=#sevalAddtime#
	@}
	@if(!isEmpty(sevalStoreid)){
	 and seval_storeid=#sevalStoreid#
	@}
	@if(!isEmpty(sevalStorename)){
	 and seval_storename=#sevalStorename#
	@}
	@if(!isEmpty(sevalMemberid)){
	 and seval_memberid=#sevalMemberid#
	@}
	@if(!isEmpty(sevalMembername)){
	 and seval_membername=#sevalMembername#
	@}
	@if(!isEmpty(sevalDesccredit)){
	 and seval_desccredit=#sevalDesccredit#
	@}
	@if(!isEmpty(sevalServicecredit)){
	 and seval_servicecredit=#sevalServicecredit#
	@}
	@if(!isEmpty(sevalDeliverycredit)){
	 and seval_deliverycredit=#sevalDeliverycredit#
	@}
	
	