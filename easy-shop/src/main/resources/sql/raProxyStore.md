sample
===
* 注释

	select #use("cols")# from ra_proxy_store  where  #use("condition")#

cols
===
	member_id,name,img1,img2,img3

updateSample
===
	
	member_id=#memberId#,name=#name#,img1=#img1#,img2=#img2#,img3=#img3#

condition
===

	1 = 1  
	@if(!isEmpty(memberId)){
	 and member_id=#memberId#
	@}
	@if(!isEmpty(name)){
	 and name=#name#
	@}
	@if(!isEmpty(img1)){
	 and img1=#img1#
	@}
	@if(!isEmpty(img2)){
	 and img2=#img2#
	@}
	@if(!isEmpty(img3)){
	 and img3=#img3#
	@}
	
	