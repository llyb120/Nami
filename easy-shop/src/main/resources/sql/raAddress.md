sample
===
* 注释

	select #use("cols")# from ra_address  where  #use("condition")#

cols
===
	address_id,member_id,true_name,area_id,city_id,area_info,address,tel_phone,mob_phone,is_default,dlyp_id,idcard,idtype,zip

updateSample
===
	
	address_id=#addressId#,member_id=#memberId#,true_name=#trueName#,area_id=#areaId#,city_id=#cityId#,area_info=#areaInfo#,address=#address#,tel_phone=#telPhone#,mob_phone=#mobPhone#,is_default=#isDefault#,dlyp_id=#dlypId#,idcard=#idcard#,idtype=#idtype#,zip=#zip#

condition
===

	1 = 1  
	@if(!isEmpty(addressId)){
	 and address_id=#addressId#
	@}
	@if(!isEmpty(memberId)){
	 and member_id=#memberId#
	@}
	@if(!isEmpty(trueName)){
	 and true_name=#trueName#
	@}
	@if(!isEmpty(areaId)){
	 and area_id=#areaId#
	@}
	@if(!isEmpty(cityId)){
	 and city_id=#cityId#
	@}
	@if(!isEmpty(areaInfo)){
	 and area_info=#areaInfo#
	@}
	@if(!isEmpty(address)){
	 and address=#address#
	@}
	@if(!isEmpty(telPhone)){
	 and tel_phone=#telPhone#
	@}
	@if(!isEmpty(mobPhone)){
	 and mob_phone=#mobPhone#
	@}
	@if(!isEmpty(isDefault)){
	 and is_default=#isDefault#
	@}
	@if(!isEmpty(dlypId)){
	 and dlyp_id=#dlypId#
	@}
	@if(!isEmpty(idcard)){
	 and idcard=#idcard#
	@}
	@if(!isEmpty(idtype)){
	 and idtype=#idtype#
	@}
	@if(!isEmpty(zip)){
	 and zip=#zip#
	@}
	
	