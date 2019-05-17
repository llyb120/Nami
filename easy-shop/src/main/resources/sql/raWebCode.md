sample
===
* 注释

	select #use("cols")# from ra_web_code  where  #use("condition")#

cols
===
	code_id,web_id,code_type,var_name,code_info,show_name

updateSample
===
	
	code_id=#codeId#,web_id=#webId#,code_type=#codeType#,var_name=#varName#,code_info=#codeInfo#,show_name=#showName#

condition
===

	1 = 1  
	@if(!isEmpty(codeId)){
	 and code_id=#codeId#
	@}
	@if(!isEmpty(webId)){
	 and web_id=#webId#
	@}
	@if(!isEmpty(codeType)){
	 and code_type=#codeType#
	@}
	@if(!isEmpty(varName)){
	 and var_name=#varName#
	@}
	@if(!isEmpty(codeInfo)){
	 and code_info=#codeInfo#
	@}
	@if(!isEmpty(showName)){
	 and show_name=#showName#
	@}
	
	