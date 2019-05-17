sample
===
* 注释

	select #use("cols")# from ra_pay_exchange_info  where  #use("condition")#

cols
===
	orderNo,sessionID,serviceTime,guid,initalRequest,initalResponse,ebpCode,payCode,payTransactionId,totalAmount,currency,verDept,payType,tradingTime,note,recpAccount,recpCode,recpName

updateSample
===
	
	orderNo=#orderno#,sessionID=#sessionid#,serviceTime=#servicetime#,guid=#guid#,initalRequest=#initalrequest#,initalResponse=#initalresponse#,ebpCode=#ebpcode#,payCode=#paycode#,payTransactionId=#paytransactionid#,totalAmount=#totalamount#,currency=#currency#,verDept=#verdept#,payType=#paytype#,tradingTime=#tradingtime#,note=#note#,recpAccount=#recpaccount#,recpCode=#recpcode#,recpName=#recpname#

condition
===

	1 = 1  
	@if(!isEmpty(orderno)){
	 and orderNo=#orderno#
	@}
	@if(!isEmpty(sessionid)){
	 and sessionID=#sessionid#
	@}
	@if(!isEmpty(servicetime)){
	 and serviceTime=#servicetime#
	@}
	@if(!isEmpty(guid)){
	 and guid=#guid#
	@}
	@if(!isEmpty(initalrequest)){
	 and initalRequest=#initalrequest#
	@}
	@if(!isEmpty(initalresponse)){
	 and initalResponse=#initalresponse#
	@}
	@if(!isEmpty(ebpcode)){
	 and ebpCode=#ebpcode#
	@}
	@if(!isEmpty(paycode)){
	 and payCode=#paycode#
	@}
	@if(!isEmpty(paytransactionid)){
	 and payTransactionId=#paytransactionid#
	@}
	@if(!isEmpty(totalamount)){
	 and totalAmount=#totalamount#
	@}
	@if(!isEmpty(currency)){
	 and currency=#currency#
	@}
	@if(!isEmpty(verdept)){
	 and verDept=#verdept#
	@}
	@if(!isEmpty(paytype)){
	 and payType=#paytype#
	@}
	@if(!isEmpty(tradingtime)){
	 and tradingTime=#tradingtime#
	@}
	@if(!isEmpty(note)){
	 and note=#note#
	@}
	@if(!isEmpty(recpaccount)){
	 and recpAccount=#recpaccount#
	@}
	@if(!isEmpty(recpcode)){
	 and recpCode=#recpcode#
	@}
	@if(!isEmpty(recpname)){
	 and recpName=#recpname#
	@}
	
	