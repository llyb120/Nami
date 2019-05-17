sample
===
* 注释

	select #use("cols")# from ra_store_sns_tracelog  where  #use("condition")#

cols
===
	strace_id,strace_storeid,strace_storename,strace_storelogo,strace_title,strace_content,strace_time,strace_cool,strace_spread,strace_comment,strace_type,strace_goodsdata,strace_state

updateSample
===
	
	strace_id=#straceId#,strace_storeid=#straceStoreid#,strace_storename=#straceStorename#,strace_storelogo=#straceStorelogo#,strace_title=#straceTitle#,strace_content=#straceContent#,strace_time=#straceTime#,strace_cool=#straceCool#,strace_spread=#straceSpread#,strace_comment=#straceComment#,strace_type=#straceType#,strace_goodsdata=#straceGoodsdata#,strace_state=#straceState#

condition
===

	1 = 1  
	@if(!isEmpty(straceId)){
	 and strace_id=#straceId#
	@}
	@if(!isEmpty(straceStoreid)){
	 and strace_storeid=#straceStoreid#
	@}
	@if(!isEmpty(straceStorename)){
	 and strace_storename=#straceStorename#
	@}
	@if(!isEmpty(straceStorelogo)){
	 and strace_storelogo=#straceStorelogo#
	@}
	@if(!isEmpty(straceTitle)){
	 and strace_title=#straceTitle#
	@}
	@if(!isEmpty(straceContent)){
	 and strace_content=#straceContent#
	@}
	@if(!isEmpty(straceTime)){
	 and strace_time=#straceTime#
	@}
	@if(!isEmpty(straceCool)){
	 and strace_cool=#straceCool#
	@}
	@if(!isEmpty(straceSpread)){
	 and strace_spread=#straceSpread#
	@}
	@if(!isEmpty(straceComment)){
	 and strace_comment=#straceComment#
	@}
	@if(!isEmpty(straceType)){
	 and strace_type=#straceType#
	@}
	@if(!isEmpty(straceGoodsdata)){
	 and strace_goodsdata=#straceGoodsdata#
	@}
	@if(!isEmpty(straceState)){
	 and strace_state=#straceState#
	@}
	
	