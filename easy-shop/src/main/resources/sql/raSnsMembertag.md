sample
===
* 注释

	select #use("cols")# from ra_sns_membertag  where  #use("condition")#

cols
===
	mtag_id,mtag_name,mtag_sort,mtag_recommend,mtag_desc,mtag_img

updateSample
===
	
	mtag_id=#mtagId#,mtag_name=#mtagName#,mtag_sort=#mtagSort#,mtag_recommend=#mtagRecommend#,mtag_desc=#mtagDesc#,mtag_img=#mtagImg#

condition
===

	1 = 1  
	@if(!isEmpty(mtagId)){
	 and mtag_id=#mtagId#
	@}
	@if(!isEmpty(mtagName)){
	 and mtag_name=#mtagName#
	@}
	@if(!isEmpty(mtagSort)){
	 and mtag_sort=#mtagSort#
	@}
	@if(!isEmpty(mtagRecommend)){
	 and mtag_recommend=#mtagRecommend#
	@}
	@if(!isEmpty(mtagDesc)){
	 and mtag_desc=#mtagDesc#
	@}
	@if(!isEmpty(mtagImg)){
	 and mtag_img=#mtagImg#
	@}
	
	