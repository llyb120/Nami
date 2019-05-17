sample
===
* 注释

	select #use("cols")# from ra_circle  where  #use("condition")#

cols
===
	circle_id,circle_name,circle_desc,circle_masterid,circle_mastername,circle_img,class_id,circle_mcount,circle_thcount,circle_gcount,circle_pursuereason,circle_notice,circle_status,circle_statusinfo,circle_joinaudit,circle_addtime,circle_noticetime,is_recommend,is_hot,circle_tag,new_verifycount,new_informcount,mapply_open,mapply_ml,new_mapplycount

updateSample
===
	
	circle_id=#circleId#,circle_name=#circleName#,circle_desc=#circleDesc#,circle_masterid=#circleMasterid#,circle_mastername=#circleMastername#,circle_img=#circleImg#,class_id=#classId#,circle_mcount=#circleMcount#,circle_thcount=#circleThcount#,circle_gcount=#circleGcount#,circle_pursuereason=#circlePursuereason#,circle_notice=#circleNotice#,circle_status=#circleStatus#,circle_statusinfo=#circleStatusinfo#,circle_joinaudit=#circleJoinaudit#,circle_addtime=#circleAddtime#,circle_noticetime=#circleNoticetime#,is_recommend=#isRecommend#,is_hot=#isHot#,circle_tag=#circleTag#,new_verifycount=#newVerifycount#,new_informcount=#newInformcount#,mapply_open=#mapplyOpen#,mapply_ml=#mapplyMl#,new_mapplycount=#newMapplycount#

condition
===

	1 = 1  
	@if(!isEmpty(circleId)){
	 and circle_id=#circleId#
	@}
	@if(!isEmpty(circleName)){
	 and circle_name=#circleName#
	@}
	@if(!isEmpty(circleDesc)){
	 and circle_desc=#circleDesc#
	@}
	@if(!isEmpty(circleMasterid)){
	 and circle_masterid=#circleMasterid#
	@}
	@if(!isEmpty(circleMastername)){
	 and circle_mastername=#circleMastername#
	@}
	@if(!isEmpty(circleImg)){
	 and circle_img=#circleImg#
	@}
	@if(!isEmpty(classId)){
	 and class_id=#classId#
	@}
	@if(!isEmpty(circleMcount)){
	 and circle_mcount=#circleMcount#
	@}
	@if(!isEmpty(circleThcount)){
	 and circle_thcount=#circleThcount#
	@}
	@if(!isEmpty(circleGcount)){
	 and circle_gcount=#circleGcount#
	@}
	@if(!isEmpty(circlePursuereason)){
	 and circle_pursuereason=#circlePursuereason#
	@}
	@if(!isEmpty(circleNotice)){
	 and circle_notice=#circleNotice#
	@}
	@if(!isEmpty(circleStatus)){
	 and circle_status=#circleStatus#
	@}
	@if(!isEmpty(circleStatusinfo)){
	 and circle_statusinfo=#circleStatusinfo#
	@}
	@if(!isEmpty(circleJoinaudit)){
	 and circle_joinaudit=#circleJoinaudit#
	@}
	@if(!isEmpty(circleAddtime)){
	 and circle_addtime=#circleAddtime#
	@}
	@if(!isEmpty(circleNoticetime)){
	 and circle_noticetime=#circleNoticetime#
	@}
	@if(!isEmpty(isRecommend)){
	 and is_recommend=#isRecommend#
	@}
	@if(!isEmpty(isHot)){
	 and is_hot=#isHot#
	@}
	@if(!isEmpty(circleTag)){
	 and circle_tag=#circleTag#
	@}
	@if(!isEmpty(newVerifycount)){
	 and new_verifycount=#newVerifycount#
	@}
	@if(!isEmpty(newInformcount)){
	 and new_informcount=#newInformcount#
	@}
	@if(!isEmpty(mapplyOpen)){
	 and mapply_open=#mapplyOpen#
	@}
	@if(!isEmpty(mapplyMl)){
	 and mapply_ml=#mapplyMl#
	@}
	@if(!isEmpty(newMapplycount)){
	 and new_mapplycount=#newMapplycount#
	@}
	
	