sample
===
* 注释

	select #use("cols")# from ra_sns_goods  where  #use("condition")#

cols
===
	snsgoods_goodsid,snsgoods_goodsname,snsgoods_goodsimage,snsgoods_goodsprice,snsgoods_storeid,snsgoods_storename,snsgoods_addtime,snsgoods_likenum,snsgoods_likemember,snsgoods_sharenum

updateSample
===
	
	snsgoods_goodsid=#snsgoodsGoodsid#,snsgoods_goodsname=#snsgoodsGoodsname#,snsgoods_goodsimage=#snsgoodsGoodsimage#,snsgoods_goodsprice=#snsgoodsGoodsprice#,snsgoods_storeid=#snsgoodsStoreid#,snsgoods_storename=#snsgoodsStorename#,snsgoods_addtime=#snsgoodsAddtime#,snsgoods_likenum=#snsgoodsLikenum#,snsgoods_likemember=#snsgoodsLikemember#,snsgoods_sharenum=#snsgoodsSharenum#

condition
===

	1 = 1  
	@if(!isEmpty(snsgoodsGoodsid)){
	 and snsgoods_goodsid=#snsgoodsGoodsid#
	@}
	@if(!isEmpty(snsgoodsGoodsname)){
	 and snsgoods_goodsname=#snsgoodsGoodsname#
	@}
	@if(!isEmpty(snsgoodsGoodsimage)){
	 and snsgoods_goodsimage=#snsgoodsGoodsimage#
	@}
	@if(!isEmpty(snsgoodsGoodsprice)){
	 and snsgoods_goodsprice=#snsgoodsGoodsprice#
	@}
	@if(!isEmpty(snsgoodsStoreid)){
	 and snsgoods_storeid=#snsgoodsStoreid#
	@}
	@if(!isEmpty(snsgoodsStorename)){
	 and snsgoods_storename=#snsgoodsStorename#
	@}
	@if(!isEmpty(snsgoodsAddtime)){
	 and snsgoods_addtime=#snsgoodsAddtime#
	@}
	@if(!isEmpty(snsgoodsLikenum)){
	 and snsgoods_likenum=#snsgoodsLikenum#
	@}
	@if(!isEmpty(snsgoodsLikemember)){
	 and snsgoods_likemember=#snsgoodsLikemember#
	@}
	@if(!isEmpty(snsgoodsSharenum)){
	 and snsgoods_sharenum=#snsgoodsSharenum#
	@}
	
	