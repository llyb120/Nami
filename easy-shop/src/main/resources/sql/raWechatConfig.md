sample
===
* 注释

	select #use("cols")# from ra_wechat_config  where  #use("condition")#

cols
===
	member_id,config,custom_menu,source_id,reply

updateSample
===
	
	member_id=#memberId#,config=#config#,custom_menu=#customMenu#,source_id=#sourceId#,reply=#reply#

condition
===

	1 = 1  
	@if(!isEmpty(memberId)){
	 and member_id=#memberId#
	@}
	@if(!isEmpty(config)){
	 and config=#config#
	@}
	@if(!isEmpty(customMenu)){
	 and custom_menu=#customMenu#
	@}
	@if(!isEmpty(sourceId)){
	 and source_id=#sourceId#
	@}
	@if(!isEmpty(reply)){
	 and reply=#reply#
	@}
	
	