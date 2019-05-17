sample
===
* 注释

	select #use("cols")# from ra_invoice  where  #use("condition")#

cols
===
	inv_id,member_id,inv_state,inv_title,inv_content,inv_company,inv_code,inv_reg_addr,inv_reg_phone,inv_reg_bname,inv_reg_baccount,inv_rec_name,inv_rec_mobphone,inv_rec_province,inv_goto_addr

updateSample
===
	
	inv_id=#invId#,member_id=#memberId#,inv_state=#invState#,inv_title=#invTitle#,inv_content=#invContent#,inv_company=#invCompany#,inv_code=#invCode#,inv_reg_addr=#invRegAddr#,inv_reg_phone=#invRegPhone#,inv_reg_bname=#invRegBname#,inv_reg_baccount=#invRegBaccount#,inv_rec_name=#invRecName#,inv_rec_mobphone=#invRecMobphone#,inv_rec_province=#invRecProvince#,inv_goto_addr=#invGotoAddr#

condition
===

	1 = 1  
	@if(!isEmpty(invId)){
	 and inv_id=#invId#
	@}
	@if(!isEmpty(memberId)){
	 and member_id=#memberId#
	@}
	@if(!isEmpty(invState)){
	 and inv_state=#invState#
	@}
	@if(!isEmpty(invTitle)){
	 and inv_title=#invTitle#
	@}
	@if(!isEmpty(invContent)){
	 and inv_content=#invContent#
	@}
	@if(!isEmpty(invCompany)){
	 and inv_company=#invCompany#
	@}
	@if(!isEmpty(invCode)){
	 and inv_code=#invCode#
	@}
	@if(!isEmpty(invRegAddr)){
	 and inv_reg_addr=#invRegAddr#
	@}
	@if(!isEmpty(invRegPhone)){
	 and inv_reg_phone=#invRegPhone#
	@}
	@if(!isEmpty(invRegBname)){
	 and inv_reg_bname=#invRegBname#
	@}
	@if(!isEmpty(invRegBaccount)){
	 and inv_reg_baccount=#invRegBaccount#
	@}
	@if(!isEmpty(invRecName)){
	 and inv_rec_name=#invRecName#
	@}
	@if(!isEmpty(invRecMobphone)){
	 and inv_rec_mobphone=#invRecMobphone#
	@}
	@if(!isEmpty(invRecProvince)){
	 and inv_rec_province=#invRecProvince#
	@}
	@if(!isEmpty(invGotoAddr)){
	 and inv_goto_addr=#invGotoAddr#
	@}
	
	