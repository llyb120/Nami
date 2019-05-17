sample
===
* 注释

	select #use("cols")# from ra_store_decoration  where  #use("condition")#

cols
===
	decoration_id,decoration_name,store_id,decoration_setting,decoration_nav,decoration_banner

updateSample
===
	
	decoration_id=#decorationId#,decoration_name=#decorationName#,store_id=#storeId#,decoration_setting=#decorationSetting#,decoration_nav=#decorationNav#,decoration_banner=#decorationBanner#

condition
===

	1 = 1  
	@if(!isEmpty(decorationId)){
	 and decoration_id=#decorationId#
	@}
	@if(!isEmpty(decorationName)){
	 and decoration_name=#decorationName#
	@}
	@if(!isEmpty(storeId)){
	 and store_id=#storeId#
	@}
	@if(!isEmpty(decorationSetting)){
	 and decoration_setting=#decorationSetting#
	@}
	@if(!isEmpty(decorationNav)){
	 and decoration_nav=#decorationNav#
	@}
	@if(!isEmpty(decorationBanner)){
	 and decoration_banner=#decorationBanner#
	@}
	
	