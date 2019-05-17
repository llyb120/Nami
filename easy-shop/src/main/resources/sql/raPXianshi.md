sample
===
* 注释

	select #use("cols")# from ra_p_xianshi  where  #use("condition")#

cols
===
	xianshi_id,xianshi_name,xianshi_title,xianshi_explain,quota_id,start_time,end_time,member_id,store_id,member_name,store_name,lower_limit,state

updateSample
===
	
	xianshi_id=#xianshiId#,xianshi_name=#xianshiName#,xianshi_title=#xianshiTitle#,xianshi_explain=#xianshiExplain#,quota_id=#quotaId#,start_time=#startTime#,end_time=#endTime#,member_id=#memberId#,store_id=#storeId#,member_name=#memberName#,store_name=#storeName#,lower_limit=#lowerLimit#,state=#state#

condition
===

	1 = 1  
	@if(!isEmpty(xianshiId)){
	 and xianshi_id=#xianshiId#
	@}
	@if(!isEmpty(xianshiName)){
	 and xianshi_name=#xianshiName#
	@}
	@if(!isEmpty(xianshiTitle)){
	 and xianshi_title=#xianshiTitle#
	@}
	@if(!isEmpty(xianshiExplain)){
	 and xianshi_explain=#xianshiExplain#
	@}
	@if(!isEmpty(quotaId)){
	 and quota_id=#quotaId#
	@}
	@if(!isEmpty(startTime)){
	 and start_time=#startTime#
	@}
	@if(!isEmpty(endTime)){
	 and end_time=#endTime#
	@}
	@if(!isEmpty(memberId)){
	 and member_id=#memberId#
	@}
	@if(!isEmpty(storeId)){
	 and store_id=#storeId#
	@}
	@if(!isEmpty(memberName)){
	 and member_name=#memberName#
	@}
	@if(!isEmpty(storeName)){
	 and store_name=#storeName#
	@}
	@if(!isEmpty(lowerLimit)){
	 and lower_limit=#lowerLimit#
	@}
	@if(!isEmpty(state)){
	 and state=#state#
	@}
	
	