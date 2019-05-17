sample
===
* 注释

	select #use("cols")# from ra_express  where  #use("condition")#

cols
===
	id,e_name,e_state,e_code,e_letter,e_order,e_url,e_zt_state

updateSample
===
	
	id=#id#,e_name=#eName#,e_state=#eState#,e_code=#eCode#,e_letter=#eLetter#,e_order=#eOrder#,e_url=#eUrl#,e_zt_state=#eZtState#

condition
===

	1 = 1  
	@if(!isEmpty(id)){
	 and id=#id#
	@}
	@if(!isEmpty(eName)){
	 and e_name=#eName#
	@}
	@if(!isEmpty(eState)){
	 and e_state=#eState#
	@}
	@if(!isEmpty(eCode)){
	 and e_code=#eCode#
	@}
	@if(!isEmpty(eLetter)){
	 and e_letter=#eLetter#
	@}
	@if(!isEmpty(eOrder)){
	 and e_order=#eOrder#
	@}
	@if(!isEmpty(eUrl)){
	 and e_url=#eUrl#
	@}
	@if(!isEmpty(eZtState)){
	 and e_zt_state=#eZtState#
	@}
	
	