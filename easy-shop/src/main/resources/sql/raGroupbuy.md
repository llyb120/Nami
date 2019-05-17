sample
===
* 注释

	select #use("cols")# from ra_groupbuy  where  #use("condition")#

cols
===
	groupbuy_id,groupbuy_name,start_time,end_time,goods_id,goods_commonid,goods_name,store_id,store_name,goods_price,groupbuy_price,groupbuy_rebate,virtual_quantity,upper_limit,buyer_count,buy_quantity,groupbuy_intro,state,recommended,views,class_id,s_class_id,groupbuy_image,groupbuy_image1,remark,is_vr,vr_city_id,vr_area_id,vr_mall_id,vr_class_id,vr_s_class_id

updateSample
===
	
	groupbuy_id=#groupbuyId#,groupbuy_name=#groupbuyName#,start_time=#startTime#,end_time=#endTime#,goods_id=#goodsId#,goods_commonid=#goodsCommonid#,goods_name=#goodsName#,store_id=#storeId#,store_name=#storeName#,goods_price=#goodsPrice#,groupbuy_price=#groupbuyPrice#,groupbuy_rebate=#groupbuyRebate#,virtual_quantity=#virtualQuantity#,upper_limit=#upperLimit#,buyer_count=#buyerCount#,buy_quantity=#buyQuantity#,groupbuy_intro=#groupbuyIntro#,state=#state#,recommended=#recommended#,views=#views#,class_id=#classId#,s_class_id=#sClassId#,groupbuy_image=#groupbuyImage#,groupbuy_image1=#groupbuyImage1#,remark=#remark#,is_vr=#isVr#,vr_city_id=#vrCityId#,vr_area_id=#vrAreaId#,vr_mall_id=#vrMallId#,vr_class_id=#vrClassId#,vr_s_class_id=#vrSClassId#

condition
===

	1 = 1  
	@if(!isEmpty(groupbuyId)){
	 and groupbuy_id=#groupbuyId#
	@}
	@if(!isEmpty(groupbuyName)){
	 and groupbuy_name=#groupbuyName#
	@}
	@if(!isEmpty(startTime)){
	 and start_time=#startTime#
	@}
	@if(!isEmpty(endTime)){
	 and end_time=#endTime#
	@}
	@if(!isEmpty(goodsId)){
	 and goods_id=#goodsId#
	@}
	@if(!isEmpty(goodsCommonid)){
	 and goods_commonid=#goodsCommonid#
	@}
	@if(!isEmpty(goodsName)){
	 and goods_name=#goodsName#
	@}
	@if(!isEmpty(storeId)){
	 and store_id=#storeId#
	@}
	@if(!isEmpty(storeName)){
	 and store_name=#storeName#
	@}
	@if(!isEmpty(goodsPrice)){
	 and goods_price=#goodsPrice#
	@}
	@if(!isEmpty(groupbuyPrice)){
	 and groupbuy_price=#groupbuyPrice#
	@}
	@if(!isEmpty(groupbuyRebate)){
	 and groupbuy_rebate=#groupbuyRebate#
	@}
	@if(!isEmpty(virtualQuantity)){
	 and virtual_quantity=#virtualQuantity#
	@}
	@if(!isEmpty(upperLimit)){
	 and upper_limit=#upperLimit#
	@}
	@if(!isEmpty(buyerCount)){
	 and buyer_count=#buyerCount#
	@}
	@if(!isEmpty(buyQuantity)){
	 and buy_quantity=#buyQuantity#
	@}
	@if(!isEmpty(groupbuyIntro)){
	 and groupbuy_intro=#groupbuyIntro#
	@}
	@if(!isEmpty(state)){
	 and state=#state#
	@}
	@if(!isEmpty(recommended)){
	 and recommended=#recommended#
	@}
	@if(!isEmpty(views)){
	 and views=#views#
	@}
	@if(!isEmpty(classId)){
	 and class_id=#classId#
	@}
	@if(!isEmpty(sClassId)){
	 and s_class_id=#sClassId#
	@}
	@if(!isEmpty(groupbuyImage)){
	 and groupbuy_image=#groupbuyImage#
	@}
	@if(!isEmpty(groupbuyImage1)){
	 and groupbuy_image1=#groupbuyImage1#
	@}
	@if(!isEmpty(remark)){
	 and remark=#remark#
	@}
	@if(!isEmpty(isVr)){
	 and is_vr=#isVr#
	@}
	@if(!isEmpty(vrCityId)){
	 and vr_city_id=#vrCityId#
	@}
	@if(!isEmpty(vrAreaId)){
	 and vr_area_id=#vrAreaId#
	@}
	@if(!isEmpty(vrMallId)){
	 and vr_mall_id=#vrMallId#
	@}
	@if(!isEmpty(vrClassId)){
	 and vr_class_id=#vrClassId#
	@}
	@if(!isEmpty(vrSClassId)){
	 and vr_s_class_id=#vrSClassId#
	@}
	
	