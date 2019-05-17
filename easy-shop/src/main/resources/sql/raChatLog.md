sample
===
* 注释

	select #use("cols")# from ra_chat_log  where  #use("condition")#

cols
===
	m_id,f_id,f_name,f_ip,t_id,t_name,t_msg,add_time

updateSample
===
	
	m_id=#mId#,f_id=#fId#,f_name=#fName#,f_ip=#fIp#,t_id=#tId#,t_name=#tName#,t_msg=#tMsg#,add_time=#addTime#

condition
===

	1 = 1  
	@if(!isEmpty(mId)){
	 and m_id=#mId#
	@}
	@if(!isEmpty(fId)){
	 and f_id=#fId#
	@}
	@if(!isEmpty(fName)){
	 and f_name=#fName#
	@}
	@if(!isEmpty(fIp)){
	 and f_ip=#fIp#
	@}
	@if(!isEmpty(tId)){
	 and t_id=#tId#
	@}
	@if(!isEmpty(tName)){
	 and t_name=#tName#
	@}
	@if(!isEmpty(tMsg)){
	 and t_msg=#tMsg#
	@}
	@if(!isEmpty(addTime)){
	 and add_time=#addTime#
	@}
	
	