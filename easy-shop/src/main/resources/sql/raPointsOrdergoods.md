sample
===
* 注释

	select #use("cols")# from ra_points_ordergoods  where  #use("condition")#

cols
===
	point_recid,point_orderid,point_goodsid,point_goodsname,point_goodspoints,point_goodsnum,point_goodsimage

updateSample
===
	
	point_recid=#pointRecid#,point_orderid=#pointOrderid#,point_goodsid=#pointGoodsid#,point_goodsname=#pointGoodsname#,point_goodspoints=#pointGoodspoints#,point_goodsnum=#pointGoodsnum#,point_goodsimage=#pointGoodsimage#

condition
===

	1 = 1  
	@if(!isEmpty(pointRecid)){
	 and point_recid=#pointRecid#
	@}
	@if(!isEmpty(pointOrderid)){
	 and point_orderid=#pointOrderid#
	@}
	@if(!isEmpty(pointGoodsid)){
	 and point_goodsid=#pointGoodsid#
	@}
	@if(!isEmpty(pointGoodsname)){
	 and point_goodsname=#pointGoodsname#
	@}
	@if(!isEmpty(pointGoodspoints)){
	 and point_goodspoints=#pointGoodspoints#
	@}
	@if(!isEmpty(pointGoodsnum)){
	 and point_goodsnum=#pointGoodsnum#
	@}
	@if(!isEmpty(pointGoodsimage)){
	 and point_goodsimage=#pointGoodsimage#
	@}
	
	