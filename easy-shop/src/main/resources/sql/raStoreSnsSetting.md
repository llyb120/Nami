sample
===
* 注释

	select #use("cols")# from ra_store_sns_setting  where  #use("condition")#

cols
===
	sauto_storeid,sauto_new,sauto_newtitle,sauto_coupon,sauto_coupontitle,sauto_xianshi,sauto_xianshititle,sauto_mansong,sauto_mansongtitle,sauto_bundling,sauto_bundlingtitle,sauto_groupbuy,sauto_groupbuytitle

updateSample
===
	
	sauto_storeid=#sautoStoreid#,sauto_new=#sautoNew#,sauto_newtitle=#sautoNewtitle#,sauto_coupon=#sautoCoupon#,sauto_coupontitle=#sautoCoupontitle#,sauto_xianshi=#sautoXianshi#,sauto_xianshititle=#sautoXianshititle#,sauto_mansong=#sautoMansong#,sauto_mansongtitle=#sautoMansongtitle#,sauto_bundling=#sautoBundling#,sauto_bundlingtitle=#sautoBundlingtitle#,sauto_groupbuy=#sautoGroupbuy#,sauto_groupbuytitle=#sautoGroupbuytitle#

condition
===

	1 = 1  
	@if(!isEmpty(sautoStoreid)){
	 and sauto_storeid=#sautoStoreid#
	@}
	@if(!isEmpty(sautoNew)){
	 and sauto_new=#sautoNew#
	@}
	@if(!isEmpty(sautoNewtitle)){
	 and sauto_newtitle=#sautoNewtitle#
	@}
	@if(!isEmpty(sautoCoupon)){
	 and sauto_coupon=#sautoCoupon#
	@}
	@if(!isEmpty(sautoCoupontitle)){
	 and sauto_coupontitle=#sautoCoupontitle#
	@}
	@if(!isEmpty(sautoXianshi)){
	 and sauto_xianshi=#sautoXianshi#
	@}
	@if(!isEmpty(sautoXianshititle)){
	 and sauto_xianshititle=#sautoXianshititle#
	@}
	@if(!isEmpty(sautoMansong)){
	 and sauto_mansong=#sautoMansong#
	@}
	@if(!isEmpty(sautoMansongtitle)){
	 and sauto_mansongtitle=#sautoMansongtitle#
	@}
	@if(!isEmpty(sautoBundling)){
	 and sauto_bundling=#sautoBundling#
	@}
	@if(!isEmpty(sautoBundlingtitle)){
	 and sauto_bundlingtitle=#sautoBundlingtitle#
	@}
	@if(!isEmpty(sautoGroupbuy)){
	 and sauto_groupbuy=#sautoGroupbuy#
	@}
	@if(!isEmpty(sautoGroupbuytitle)){
	 and sauto_groupbuytitle=#sautoGroupbuytitle#
	@}
	
	