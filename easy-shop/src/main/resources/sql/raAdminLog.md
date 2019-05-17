sample
===
* 注释

	select #use("cols")# from ra_admin_log  where  #use("condition")#

cols
===
	id,content,createtime,admin_name,admin_id,ip,url

updateSample
===
	
	id=#id#,content=#content#,createtime=#createtime#,admin_name=#adminName#,admin_id=#adminId#,ip=#ip#,url=#url#

condition
===

	1 = 1  
	@if(!isEmpty(id)){
	 and id=#id#
	@}
	@if(!isEmpty(content)){
	 and content=#content#
	@}
	@if(!isEmpty(createtime)){
	 and createtime=#createtime#
	@}
	@if(!isEmpty(adminName)){
	 and admin_name=#adminName#
	@}
	@if(!isEmpty(adminId)){
	 and admin_id=#adminId#
	@}
	@if(!isEmpty(ip)){
	 and ip=#ip#
	@}
	@if(!isEmpty(url)){
	 and url=#url#
	@}
	
	