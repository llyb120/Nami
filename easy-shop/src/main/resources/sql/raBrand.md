sample
===
* 注释

	select #use("cols")# from ra_brand  where  #use("condition")#

cols
===
	brand_id,brand_name,brand_initial,brand_class,brand_pic,brand_sort,brand_recommend,store_id,brand_apply,class_id,show_type,from_place,big_pic

updateSample
===
	
	brand_id=#brandId#,brand_name=#brandName#,brand_initial=#brandInitial#,brand_class=#brandClass#,brand_pic=#brandPic#,brand_sort=#brandSort#,brand_recommend=#brandRecommend#,store_id=#storeId#,brand_apply=#brandApply#,class_id=#classId#,show_type=#showType#,from_place=#fromPlace#,big_pic=#bigPic#

condition
===

	1 = 1  
	@if(!isEmpty(brandId)){
	 and brand_id=#brandId#
	@}
	@if(!isEmpty(brandName)){
	 and brand_name=#brandName#
	@}
	@if(!isEmpty(brandInitial)){
	 and brand_initial=#brandInitial#
	@}
	@if(!isEmpty(brandClass)){
	 and brand_class=#brandClass#
	@}
	@if(!isEmpty(brandPic)){
	 and brand_pic=#brandPic#
	@}
	@if(!isEmpty(brandSort)){
	 and brand_sort=#brandSort#
	@}
	@if(!isEmpty(brandRecommend)){
	 and brand_recommend=#brandRecommend#
	@}
	@if(!isEmpty(storeId)){
	 and store_id=#storeId#
	@}
	@if(!isEmpty(brandApply)){
	 and brand_apply=#brandApply#
	@}
	@if(!isEmpty(classId)){
	 and class_id=#classId#
	@}
	@if(!isEmpty(showType)){
	 and show_type=#showType#
	@}
	@if(!isEmpty(fromPlace)){
	 and from_place=#fromPlace#
	@}
	@if(!isEmpty(bigPic)){
	 and big_pic=#bigPic#
	@}
	
	