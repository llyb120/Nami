sample
===
* 注释

	select #use("cols")# from ra_points_orderaddress  where  #use("condition")#

cols
===
	point_oaid,point_orderid,point_truename,point_areaid,point_areainfo,point_address,point_zipcode,point_telphone,point_mobphone

updateSample
===
	
	point_oaid=#pointOaid#,point_orderid=#pointOrderid#,point_truename=#pointTruename#,point_areaid=#pointAreaid#,point_areainfo=#pointAreainfo#,point_address=#pointAddress#,point_zipcode=#pointZipcode#,point_telphone=#pointTelphone#,point_mobphone=#pointMobphone#

condition
===

	1 = 1  
	@if(!isEmpty(pointOaid)){
	 and point_oaid=#pointOaid#
	@}
	@if(!isEmpty(pointOrderid)){
	 and point_orderid=#pointOrderid#
	@}
	@if(!isEmpty(pointTruename)){
	 and point_truename=#pointTruename#
	@}
	@if(!isEmpty(pointAreaid)){
	 and point_areaid=#pointAreaid#
	@}
	@if(!isEmpty(pointAreainfo)){
	 and point_areainfo=#pointAreainfo#
	@}
	@if(!isEmpty(pointAddress)){
	 and point_address=#pointAddress#
	@}
	@if(!isEmpty(pointZipcode)){
	 and point_zipcode=#pointZipcode#
	@}
	@if(!isEmpty(pointTelphone)){
	 and point_telphone=#pointTelphone#
	@}
	@if(!isEmpty(pointMobphone)){
	 and point_mobphone=#pointMobphone#
	@}
	
	