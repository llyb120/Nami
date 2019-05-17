sample
===
* 注释

	select #use("cols")# from ra_circle_explog  where  #use("condition")#

cols
===
	el_id,circle_id,member_id,member_name,el_exp,el_time,el_type,el_itemid,el_desc

updateSample
===
	
	el_id=#elId#,circle_id=#circleId#,member_id=#memberId#,member_name=#memberName#,el_exp=#elExp#,el_time=#elTime#,el_type=#elType#,el_itemid=#elItemid#,el_desc=#elDesc#

condition
===

	1 = 1  
	@if(!isEmpty(elId)){
	 and el_id=#elId#
	@}
	@if(!isEmpty(circleId)){
	 and circle_id=#circleId#
	@}
	@if(!isEmpty(memberId)){
	 and member_id=#memberId#
	@}
	@if(!isEmpty(memberName)){
	 and member_name=#memberName#
	@}
	@if(!isEmpty(elExp)){
	 and el_exp=#elExp#
	@}
	@if(!isEmpty(elTime)){
	 and el_time=#elTime#
	@}
	@if(!isEmpty(elType)){
	 and el_type=#elType#
	@}
	@if(!isEmpty(elItemid)){
	 and el_itemid=#elItemid#
	@}
	@if(!isEmpty(elDesc)){
	 and el_desc=#elDesc#
	@}
	
	