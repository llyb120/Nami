sample
===
* 注释

	select #use("cols")# from ra_complain_subject  where  #use("condition")#

cols
===
	complain_subject_id,complain_subject_content,complain_subject_desc,complain_subject_state

updateSample
===
	
	complain_subject_id=#complainSubjectId#,complain_subject_content=#complainSubjectContent#,complain_subject_desc=#complainSubjectDesc#,complain_subject_state=#complainSubjectState#

condition
===

	1 = 1  
	@if(!isEmpty(complainSubjectId)){
	 and complain_subject_id=#complainSubjectId#
	@}
	@if(!isEmpty(complainSubjectContent)){
	 and complain_subject_content=#complainSubjectContent#
	@}
	@if(!isEmpty(complainSubjectDesc)){
	 and complain_subject_desc=#complainSubjectDesc#
	@}
	@if(!isEmpty(complainSubjectState)){
	 and complain_subject_state=#complainSubjectState#
	@}
	
	