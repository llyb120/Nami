sample
===
* 注释

	select #use("cols")# from ra_web  where  #use("condition")#

cols
===
	web_id,web_name,style_name,web_page,update_time,web_sort,web_show,web_html

updateSample
===
	
	web_id=#webId#,web_name=#webName#,style_name=#styleName#,web_page=#webPage#,update_time=#updateTime#,web_sort=#webSort#,web_show=#webShow#,web_html=#webHtml#

condition
===

	1 = 1  
	@if(!isEmpty(webId)){
	 and web_id=#webId#
	@}
	@if(!isEmpty(webName)){
	 and web_name=#webName#
	@}
	@if(!isEmpty(styleName)){
	 and style_name=#styleName#
	@}
	@if(!isEmpty(webPage)){
	 and web_page=#webPage#
	@}
	@if(!isEmpty(updateTime)){
	 and update_time=#updateTime#
	@}
	@if(!isEmpty(webSort)){
	 and web_sort=#webSort#
	@}
	@if(!isEmpty(webShow)){
	 and web_show=#webShow#
	@}
	@if(!isEmpty(webHtml)){
	 and web_html=#webHtml#
	@}
	
	