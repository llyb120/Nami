sample
===
* 注释

	select #use("cols")# from ra_article  where  #use("condition")#

cols
===
	article_id,ac_id,article_url,article_show,article_sort,article_title,article_content,article_time

updateSample
===
	
	article_id=#articleId#,ac_id=#acId#,article_url=#articleUrl#,article_show=#articleShow#,article_sort=#articleSort#,article_title=#articleTitle#,article_content=#articleContent#,article_time=#articleTime#

condition
===

	1 = 1  
	@if(!isEmpty(articleId)){
	 and article_id=#articleId#
	@}
	@if(!isEmpty(acId)){
	 and ac_id=#acId#
	@}
	@if(!isEmpty(articleUrl)){
	 and article_url=#articleUrl#
	@}
	@if(!isEmpty(articleShow)){
	 and article_show=#articleShow#
	@}
	@if(!isEmpty(articleSort)){
	 and article_sort=#articleSort#
	@}
	@if(!isEmpty(articleTitle)){
	 and article_title=#articleTitle#
	@}
	@if(!isEmpty(articleContent)){
	 and article_content=#articleContent#
	@}
	@if(!isEmpty(articleTime)){
	 and article_time=#articleTime#
	@}
	
	