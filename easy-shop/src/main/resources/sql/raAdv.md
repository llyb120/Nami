sample
===
* 注释

	select #use("cols")# from ra_adv  where  #use("condition")#

cols
===
	adv_id,ap_id,adv_title,adv_content,adv_start_date,adv_end_date,slide_sort,member_id,member_name,click_num,is_allow,buy_style,goldpay

updateSample
===
	
	adv_id=#advId#,ap_id=#apId#,adv_title=#advTitle#,adv_content=#advContent#,adv_start_date=#advStartDate#,adv_end_date=#advEndDate#,slide_sort=#slideSort#,member_id=#memberId#,member_name=#memberName#,click_num=#clickNum#,is_allow=#isAllow#,buy_style=#buyStyle#,goldpay=#goldpay#

condition
===

	1 = 1  
	@if(!isEmpty(advId)){
	 and adv_id=#advId#
	@}
	@if(!isEmpty(apId)){
	 and ap_id=#apId#
	@}
	@if(!isEmpty(advTitle)){
	 and adv_title=#advTitle#
	@}
	@if(!isEmpty(advContent)){
	 and adv_content=#advContent#
	@}
	@if(!isEmpty(advStartDate)){
	 and adv_start_date=#advStartDate#
	@}
	@if(!isEmpty(advEndDate)){
	 and adv_end_date=#advEndDate#
	@}
	@if(!isEmpty(slideSort)){
	 and slide_sort=#slideSort#
	@}
	@if(!isEmpty(memberId)){
	 and member_id=#memberId#
	@}
	@if(!isEmpty(memberName)){
	 and member_name=#memberName#
	@}
	@if(!isEmpty(clickNum)){
	 and click_num=#clickNum#
	@}
	@if(!isEmpty(isAllow)){
	 and is_allow=#isAllow#
	@}
	@if(!isEmpty(buyStyle)){
	 and buy_style=#buyStyle#
	@}
	@if(!isEmpty(goldpay)){
	 and goldpay=#goldpay#
	@}
	
	