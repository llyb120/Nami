sample
===
* 注释

	select #use("cols")# from ra_adv_position_copy  where  #use("condition")#

cols
===
	ap_id,ap_name,ap_intro,ap_class,ap_display,is_use,ap_width,ap_height,ap_price,adv_num,click_num,default_content

updateSample
===
	
	ap_id=#apId#,ap_name=#apName#,ap_intro=#apIntro#,ap_class=#apClass#,ap_display=#apDisplay#,is_use=#isUse#,ap_width=#apWidth#,ap_height=#apHeight#,ap_price=#apPrice#,adv_num=#advNum#,click_num=#clickNum#,default_content=#defaultContent#

condition
===

	1 = 1  
	@if(!isEmpty(apId)){
	 and ap_id=#apId#
	@}
	@if(!isEmpty(apName)){
	 and ap_name=#apName#
	@}
	@if(!isEmpty(apIntro)){
	 and ap_intro=#apIntro#
	@}
	@if(!isEmpty(apClass)){
	 and ap_class=#apClass#
	@}
	@if(!isEmpty(apDisplay)){
	 and ap_display=#apDisplay#
	@}
	@if(!isEmpty(isUse)){
	 and is_use=#isUse#
	@}
	@if(!isEmpty(apWidth)){
	 and ap_width=#apWidth#
	@}
	@if(!isEmpty(apHeight)){
	 and ap_height=#apHeight#
	@}
	@if(!isEmpty(apPrice)){
	 and ap_price=#apPrice#
	@}
	@if(!isEmpty(advNum)){
	 and adv_num=#advNum#
	@}
	@if(!isEmpty(clickNum)){
	 and click_num=#clickNum#
	@}
	@if(!isEmpty(defaultContent)){
	 and default_content=#defaultContent#
	@}
	
	