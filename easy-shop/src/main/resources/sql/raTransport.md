sample
===
* 注释

	select #use("cols")# from ra_transport  where  #use("condition")#

cols
===
	id,title,send_tpl_id,store_id,update_time

updateSample
===
	
	id=#id#,title=#title#,send_tpl_id=#sendTplId#,store_id=#storeId#,update_time=#updateTime#

condition
===

	1 = 1  
	@if(!isEmpty(id)){
	 and id=#id#
	@}
	@if(!isEmpty(title)){
	 and title=#title#
	@}
	@if(!isEmpty(sendTplId)){
	 and send_tpl_id=#sendTplId#
	@}
	@if(!isEmpty(storeId)){
	 and store_id=#storeId#
	@}
	@if(!isEmpty(updateTime)){
	 and update_time=#updateTime#
	@}
	
	