sample
===
* 注释

	select #use("cols")# from ra_proxy  where  #use("condition")#

cols
===
	member_id,parent_id,infomation,price_formula,time,is_guest,is_buyer,mobile,is_special

updateSample
===
	
	member_id=#memberId#,parent_id=#parentId#,infomation=#infomation#,price_formula=#priceFormula#,time=#time#,is_guest=#isGuest#,is_buyer=#isBuyer#,mobile=#mobile#,is_special=#isSpecial#

condition
===

	1 = 1  
	@if(!isEmpty(memberId)){
	 and member_id=#memberId#
	@}
	@if(!isEmpty(parentId)){
	 and parent_id=#parentId#
	@}
	@if(!isEmpty(infomation)){
	 and infomation=#infomation#
	@}
	@if(!isEmpty(priceFormula)){
	 and price_formula=#priceFormula#
	@}
	@if(!isEmpty(time)){
	 and time=#time#
	@}
	@if(!isEmpty(isGuest)){
	 and is_guest=#isGuest#
	@}
	@if(!isEmpty(isBuyer)){
	 and is_buyer=#isBuyer#
	@}
	@if(!isEmpty(mobile)){
	 and mobile=#mobile#
	@}
	@if(!isEmpty(isSpecial)){
	 and is_special=#isSpecial#
	@}
	
	