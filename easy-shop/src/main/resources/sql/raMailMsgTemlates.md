sample
===
* 注释

	select #use("cols")# from ra_mail_msg_temlates  where  #use("condition")#

cols
===
	name,title,code,content

updateSample
===
	
	name=#name#,title=#title#,code=#code#,content=#content#

condition
===

	1 = 1  
	@if(!isEmpty(name)){
	 and name=#name#
	@}
	@if(!isEmpty(title)){
	 and title=#title#
	@}
	@if(!isEmpty(code)){
	 and code=#code#
	@}
	@if(!isEmpty(content)){
	 and content=#content#
	@}
	
	