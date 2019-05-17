sample
===
* 注释

	select #use("cols")# from ra_store  where  #use("condition")#

cols
===
	store_id,store_name,grade_id,member_id,member_name,seller_name,sc_id,store_company_name,province_id,area_info,store_address,store_zip,store_state,store_close_info,store_sort,store_time,store_end_time,store_label,store_banner,store_avatar,store_keywords,store_description,store_qq,store_ww,store_phone,store_zy,store_domain,store_domain_times,store_recommend,store_theme,store_credit,store_desccredit,store_servicecredit,store_deliverycredit,store_collect,store_slide,store_slide_url,store_stamp,store_printdesc,store_sales,store_presales,store_aftersales,store_workingtime,store_free_price,store_decoration_switch,store_decoration_only,store_decoration_image_count,live_store_name,live_store_address,live_store_tel,live_store_bus,is_own_shop,bind_all_gc,store_vrcode_prefix,ebcCode,ebcName,useIETAPI,is_whole,dressData,joinPayAlloc

updateSample
===
	
	store_id=#storeId#,store_name=#storeName#,grade_id=#gradeId#,member_id=#memberId#,member_name=#memberName#,seller_name=#sellerName#,sc_id=#scId#,store_company_name=#storeCompanyName#,province_id=#provinceId#,area_info=#areaInfo#,store_address=#storeAddress#,store_zip=#storeZip#,store_state=#storeState#,store_close_info=#storeCloseInfo#,store_sort=#storeSort#,store_time=#storeTime#,store_end_time=#storeEndTime#,store_label=#storeLabel#,store_banner=#storeBanner#,store_avatar=#storeAvatar#,store_keywords=#storeKeywords#,store_description=#storeDescription#,store_qq=#storeQq#,store_ww=#storeWw#,store_phone=#storePhone#,store_zy=#storeZy#,store_domain=#storeDomain#,store_domain_times=#storeDomainTimes#,store_recommend=#storeRecommend#,store_theme=#storeTheme#,store_credit=#storeCredit#,store_desccredit=#storeDesccredit#,store_servicecredit=#storeServicecredit#,store_deliverycredit=#storeDeliverycredit#,store_collect=#storeCollect#,store_slide=#storeSlide#,store_slide_url=#storeSlideUrl#,store_stamp=#storeStamp#,store_printdesc=#storePrintdesc#,store_sales=#storeSales#,store_presales=#storePresales#,store_aftersales=#storeAftersales#,store_workingtime=#storeWorkingtime#,store_free_price=#storeFreePrice#,store_decoration_switch=#storeDecorationSwitch#,store_decoration_only=#storeDecorationOnly#,store_decoration_image_count=#storeDecorationImageCount#,live_store_name=#liveStoreName#,live_store_address=#liveStoreAddress#,live_store_tel=#liveStoreTel#,live_store_bus=#liveStoreBus#,is_own_shop=#isOwnShop#,bind_all_gc=#bindAllGc#,store_vrcode_prefix=#storeVrcodePrefix#,ebcCode=#ebccode#,ebcName=#ebcname#,useIETAPI=#useietapi#,is_whole=#isWhole#,dressData=#dressdata#,joinPayAlloc=#joinpayalloc#

condition
===

	1 = 1  
	@if(!isEmpty(storeId)){
	 and store_id=#storeId#
	@}
	@if(!isEmpty(storeName)){
	 and store_name=#storeName#
	@}
	@if(!isEmpty(gradeId)){
	 and grade_id=#gradeId#
	@}
	@if(!isEmpty(memberId)){
	 and member_id=#memberId#
	@}
	@if(!isEmpty(memberName)){
	 and member_name=#memberName#
	@}
	@if(!isEmpty(sellerName)){
	 and seller_name=#sellerName#
	@}
	@if(!isEmpty(scId)){
	 and sc_id=#scId#
	@}
	@if(!isEmpty(storeCompanyName)){
	 and store_company_name=#storeCompanyName#
	@}
	@if(!isEmpty(provinceId)){
	 and province_id=#provinceId#
	@}
	@if(!isEmpty(areaInfo)){
	 and area_info=#areaInfo#
	@}
	@if(!isEmpty(storeAddress)){
	 and store_address=#storeAddress#
	@}
	@if(!isEmpty(storeZip)){
	 and store_zip=#storeZip#
	@}
	@if(!isEmpty(storeState)){
	 and store_state=#storeState#
	@}
	@if(!isEmpty(storeCloseInfo)){
	 and store_close_info=#storeCloseInfo#
	@}
	@if(!isEmpty(storeSort)){
	 and store_sort=#storeSort#
	@}
	@if(!isEmpty(storeTime)){
	 and store_time=#storeTime#
	@}
	@if(!isEmpty(storeEndTime)){
	 and store_end_time=#storeEndTime#
	@}
	@if(!isEmpty(storeLabel)){
	 and store_label=#storeLabel#
	@}
	@if(!isEmpty(storeBanner)){
	 and store_banner=#storeBanner#
	@}
	@if(!isEmpty(storeAvatar)){
	 and store_avatar=#storeAvatar#
	@}
	@if(!isEmpty(storeKeywords)){
	 and store_keywords=#storeKeywords#
	@}
	@if(!isEmpty(storeDescription)){
	 and store_description=#storeDescription#
	@}
	@if(!isEmpty(storeQq)){
	 and store_qq=#storeQq#
	@}
	@if(!isEmpty(storeWw)){
	 and store_ww=#storeWw#
	@}
	@if(!isEmpty(storePhone)){
	 and store_phone=#storePhone#
	@}
	@if(!isEmpty(storeZy)){
	 and store_zy=#storeZy#
	@}
	@if(!isEmpty(storeDomain)){
	 and store_domain=#storeDomain#
	@}
	@if(!isEmpty(storeDomainTimes)){
	 and store_domain_times=#storeDomainTimes#
	@}
	@if(!isEmpty(storeRecommend)){
	 and store_recommend=#storeRecommend#
	@}
	@if(!isEmpty(storeTheme)){
	 and store_theme=#storeTheme#
	@}
	@if(!isEmpty(storeCredit)){
	 and store_credit=#storeCredit#
	@}
	@if(!isEmpty(storeDesccredit)){
	 and store_desccredit=#storeDesccredit#
	@}
	@if(!isEmpty(storeServicecredit)){
	 and store_servicecredit=#storeServicecredit#
	@}
	@if(!isEmpty(storeDeliverycredit)){
	 and store_deliverycredit=#storeDeliverycredit#
	@}
	@if(!isEmpty(storeCollect)){
	 and store_collect=#storeCollect#
	@}
	@if(!isEmpty(storeSlide)){
	 and store_slide=#storeSlide#
	@}
	@if(!isEmpty(storeSlideUrl)){
	 and store_slide_url=#storeSlideUrl#
	@}
	@if(!isEmpty(storeStamp)){
	 and store_stamp=#storeStamp#
	@}
	@if(!isEmpty(storePrintdesc)){
	 and store_printdesc=#storePrintdesc#
	@}
	@if(!isEmpty(storeSales)){
	 and store_sales=#storeSales#
	@}
	@if(!isEmpty(storePresales)){
	 and store_presales=#storePresales#
	@}
	@if(!isEmpty(storeAftersales)){
	 and store_aftersales=#storeAftersales#
	@}
	@if(!isEmpty(storeWorkingtime)){
	 and store_workingtime=#storeWorkingtime#
	@}
	@if(!isEmpty(storeFreePrice)){
	 and store_free_price=#storeFreePrice#
	@}
	@if(!isEmpty(storeDecorationSwitch)){
	 and store_decoration_switch=#storeDecorationSwitch#
	@}
	@if(!isEmpty(storeDecorationOnly)){
	 and store_decoration_only=#storeDecorationOnly#
	@}
	@if(!isEmpty(storeDecorationImageCount)){
	 and store_decoration_image_count=#storeDecorationImageCount#
	@}
	@if(!isEmpty(liveStoreName)){
	 and live_store_name=#liveStoreName#
	@}
	@if(!isEmpty(liveStoreAddress)){
	 and live_store_address=#liveStoreAddress#
	@}
	@if(!isEmpty(liveStoreTel)){
	 and live_store_tel=#liveStoreTel#
	@}
	@if(!isEmpty(liveStoreBus)){
	 and live_store_bus=#liveStoreBus#
	@}
	@if(!isEmpty(isOwnShop)){
	 and is_own_shop=#isOwnShop#
	@}
	@if(!isEmpty(bindAllGc)){
	 and bind_all_gc=#bindAllGc#
	@}
	@if(!isEmpty(storeVrcodePrefix)){
	 and store_vrcode_prefix=#storeVrcodePrefix#
	@}
	@if(!isEmpty(ebccode)){
	 and ebcCode=#ebccode#
	@}
	@if(!isEmpty(ebcname)){
	 and ebcName=#ebcname#
	@}
	@if(!isEmpty(useietapi)){
	 and useIETAPI=#useietapi#
	@}
	@if(!isEmpty(isWhole)){
	 and is_whole=#isWhole#
	@}
	@if(!isEmpty(dressdata)){
	 and dressData=#dressdata#
	@}
	@if(!isEmpty(joinpayalloc)){
	 and joinPayAlloc=#joinpayalloc#
	@}
	
	