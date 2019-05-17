sample
===
* 注释

	select #use("cols")# from ra_evaluate_goods  where  #use("condition")#

cols
===
	geval_id,geval_orderid,geval_orderno,geval_ordergoodsid,geval_goodsid,geval_goodsname,geval_goodsprice,geval_goodsimage,geval_scores,geval_content,geval_isanonymous,geval_addtime,geval_storeid,geval_storename,geval_frommemberid,geval_frommembername,geval_state,geval_remark,geval_explain,geval_image

updateSample
===
	
	geval_id=#gevalId#,geval_orderid=#gevalOrderid#,geval_orderno=#gevalOrderno#,geval_ordergoodsid=#gevalOrdergoodsid#,geval_goodsid=#gevalGoodsid#,geval_goodsname=#gevalGoodsname#,geval_goodsprice=#gevalGoodsprice#,geval_goodsimage=#gevalGoodsimage#,geval_scores=#gevalScores#,geval_content=#gevalContent#,geval_isanonymous=#gevalIsanonymous#,geval_addtime=#gevalAddtime#,geval_storeid=#gevalStoreid#,geval_storename=#gevalStorename#,geval_frommemberid=#gevalFrommemberid#,geval_frommembername=#gevalFrommembername#,geval_state=#gevalState#,geval_remark=#gevalRemark#,geval_explain=#gevalExplain#,geval_image=#gevalImage#

condition
===

	1 = 1  
	@if(!isEmpty(gevalId)){
	 and geval_id=#gevalId#
	@}
	@if(!isEmpty(gevalOrderid)){
	 and geval_orderid=#gevalOrderid#
	@}
	@if(!isEmpty(gevalOrderno)){
	 and geval_orderno=#gevalOrderno#
	@}
	@if(!isEmpty(gevalOrdergoodsid)){
	 and geval_ordergoodsid=#gevalOrdergoodsid#
	@}
	@if(!isEmpty(gevalGoodsid)){
	 and geval_goodsid=#gevalGoodsid#
	@}
	@if(!isEmpty(gevalGoodsname)){
	 and geval_goodsname=#gevalGoodsname#
	@}
	@if(!isEmpty(gevalGoodsprice)){
	 and geval_goodsprice=#gevalGoodsprice#
	@}
	@if(!isEmpty(gevalGoodsimage)){
	 and geval_goodsimage=#gevalGoodsimage#
	@}
	@if(!isEmpty(gevalScores)){
	 and geval_scores=#gevalScores#
	@}
	@if(!isEmpty(gevalContent)){
	 and geval_content=#gevalContent#
	@}
	@if(!isEmpty(gevalIsanonymous)){
	 and geval_isanonymous=#gevalIsanonymous#
	@}
	@if(!isEmpty(gevalAddtime)){
	 and geval_addtime=#gevalAddtime#
	@}
	@if(!isEmpty(gevalStoreid)){
	 and geval_storeid=#gevalStoreid#
	@}
	@if(!isEmpty(gevalStorename)){
	 and geval_storename=#gevalStorename#
	@}
	@if(!isEmpty(gevalFrommemberid)){
	 and geval_frommemberid=#gevalFrommemberid#
	@}
	@if(!isEmpty(gevalFrommembername)){
	 and geval_frommembername=#gevalFrommembername#
	@}
	@if(!isEmpty(gevalState)){
	 and geval_state=#gevalState#
	@}
	@if(!isEmpty(gevalRemark)){
	 and geval_remark=#gevalRemark#
	@}
	@if(!isEmpty(gevalExplain)){
	 and geval_explain=#gevalExplain#
	@}
	@if(!isEmpty(gevalImage)){
	 and geval_image=#gevalImage#
	@}
	
	