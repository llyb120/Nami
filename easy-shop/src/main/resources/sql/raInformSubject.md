sample
===
* 注释

	select #use("cols")# from ra_inform_subject  where  #use("condition")#

cols
===
	inform_subject_id,inform_subject_content,inform_subject_type_id,inform_subject_type_name,inform_subject_state

updateSample
===
	
	inform_subject_id=#informSubjectId#,inform_subject_content=#informSubjectContent#,inform_subject_type_id=#informSubjectTypeId#,inform_subject_type_name=#informSubjectTypeName#,inform_subject_state=#informSubjectState#

condition
===

	1 = 1  
	@if(!isEmpty(informSubjectId)){
	 and inform_subject_id=#informSubjectId#
	@}
	@if(!isEmpty(informSubjectContent)){
	 and inform_subject_content=#informSubjectContent#
	@}
	@if(!isEmpty(informSubjectTypeId)){
	 and inform_subject_type_id=#informSubjectTypeId#
	@}
	@if(!isEmpty(informSubjectTypeName)){
	 and inform_subject_type_name=#informSubjectTypeName#
	@}
	@if(!isEmpty(informSubjectState)){
	 and inform_subject_state=#informSubjectState#
	@}
	
	