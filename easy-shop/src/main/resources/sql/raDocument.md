sample
===
* 注释

	select #use("cols")# from ra_document  where  #use("condition")#

cols
===
	doc_id,doc_code,doc_title,doc_content,doc_time

updateSample
===
	
	doc_id=#docId#,doc_code=#docCode#,doc_title=#docTitle#,doc_content=#docContent#,doc_time=#docTime#

condition
===

	1 = 1  
	@if(!isEmpty(docId)){
	 and doc_id=#docId#
	@}
	@if(!isEmpty(docCode)){
	 and doc_code=#docCode#
	@}
	@if(!isEmpty(docTitle)){
	 and doc_title=#docTitle#
	@}
	@if(!isEmpty(docContent)){
	 and doc_content=#docContent#
	@}
	@if(!isEmpty(docTime)){
	 and doc_time=#docTime#
	@}
	
	