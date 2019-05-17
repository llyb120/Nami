sample
===
* 注释

	select #use("cols")# from ra_points_order  where  #use("condition")#

cols
===
	point_orderid,point_ordersn,point_buyerid,point_buyername,point_buyeremail,point_addtime,point_shippingtime,point_shippingcode,point_shipping_ecode,point_finnshedtime,point_allpoint,point_ordermessage,point_orderstate

updateSample
===
	
	point_orderid=#pointOrderid#,point_ordersn=#pointOrdersn#,point_buyerid=#pointBuyerid#,point_buyername=#pointBuyername#,point_buyeremail=#pointBuyeremail#,point_addtime=#pointAddtime#,point_shippingtime=#pointShippingtime#,point_shippingcode=#pointShippingcode#,point_shipping_ecode=#pointShippingEcode#,point_finnshedtime=#pointFinnshedtime#,point_allpoint=#pointAllpoint#,point_ordermessage=#pointOrdermessage#,point_orderstate=#pointOrderstate#

condition
===

	1 = 1  
	@if(!isEmpty(pointOrderid)){
	 and point_orderid=#pointOrderid#
	@}
	@if(!isEmpty(pointOrdersn)){
	 and point_ordersn=#pointOrdersn#
	@}
	@if(!isEmpty(pointBuyerid)){
	 and point_buyerid=#pointBuyerid#
	@}
	@if(!isEmpty(pointBuyername)){
	 and point_buyername=#pointBuyername#
	@}
	@if(!isEmpty(pointBuyeremail)){
	 and point_buyeremail=#pointBuyeremail#
	@}
	@if(!isEmpty(pointAddtime)){
	 and point_addtime=#pointAddtime#
	@}
	@if(!isEmpty(pointShippingtime)){
	 and point_shippingtime=#pointShippingtime#
	@}
	@if(!isEmpty(pointShippingcode)){
	 and point_shippingcode=#pointShippingcode#
	@}
	@if(!isEmpty(pointShippingEcode)){
	 and point_shipping_ecode=#pointShippingEcode#
	@}
	@if(!isEmpty(pointFinnshedtime)){
	 and point_finnshedtime=#pointFinnshedtime#
	@}
	@if(!isEmpty(pointAllpoint)){
	 and point_allpoint=#pointAllpoint#
	@}
	@if(!isEmpty(pointOrdermessage)){
	 and point_ordermessage=#pointOrdermessage#
	@}
	@if(!isEmpty(pointOrderstate)){
	 and point_orderstate=#pointOrderstate#
	@}
	
	