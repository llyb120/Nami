sample
===
* 注释

	select #use("cols")# from ra_sns_visitor  where  #use("condition")#

cols
===
	v_id,v_mid,v_mname,v_mavatar,v_ownermid,v_ownermname,v_ownermavatar,v_addtime

updateSample
===
	
	v_id=#vId#,v_mid=#vMid#,v_mname=#vMname#,v_mavatar=#vMavatar#,v_ownermid=#vOwnermid#,v_ownermname=#vOwnermname#,v_ownermavatar=#vOwnermavatar#,v_addtime=#vAddtime#

condition
===

	1 = 1  
	@if(!isEmpty(vId)){
	 and v_id=#vId#
	@}
	@if(!isEmpty(vMid)){
	 and v_mid=#vMid#
	@}
	@if(!isEmpty(vMname)){
	 and v_mname=#vMname#
	@}
	@if(!isEmpty(vMavatar)){
	 and v_mavatar=#vMavatar#
	@}
	@if(!isEmpty(vOwnermid)){
	 and v_ownermid=#vOwnermid#
	@}
	@if(!isEmpty(vOwnermname)){
	 and v_ownermname=#vOwnermname#
	@}
	@if(!isEmpty(vOwnermavatar)){
	 and v_ownermavatar=#vOwnermavatar#
	@}
	@if(!isEmpty(vAddtime)){
	 and v_addtime=#vAddtime#
	@}
	
	