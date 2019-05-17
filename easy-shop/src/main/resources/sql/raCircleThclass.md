sample
===
* 注释

	select #use("cols")# from ra_circle_thclass  where  #use("condition")#

cols
===
	thclass_id,thclass_name,thclass_status,is_moderator,thclass_sort,circle_id

updateSample
===
	
	thclass_id=#thclassId#,thclass_name=#thclassName#,thclass_status=#thclassStatus#,is_moderator=#isModerator#,thclass_sort=#thclassSort#,circle_id=#circleId#

condition
===

	1 = 1  
	@if(!isEmpty(thclassId)){
	 and thclass_id=#thclassId#
	@}
	@if(!isEmpty(thclassName)){
	 and thclass_name=#thclassName#
	@}
	@if(!isEmpty(thclassStatus)){
	 and thclass_status=#thclassStatus#
	@}
	@if(!isEmpty(isModerator)){
	 and is_moderator=#isModerator#
	@}
	@if(!isEmpty(thclassSort)){
	 and thclass_sort=#thclassSort#
	@}
	@if(!isEmpty(circleId)){
	 and circle_id=#circleId#
	@}
	
	