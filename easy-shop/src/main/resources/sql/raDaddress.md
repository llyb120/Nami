sample
===
* 注释

	select #use("cols")# from ra_daddress  where  #use("condition")#

cols
===
	address_id,store_id,seller_name,area_id,city_id,area_info,address,telphone,company,is_default

updateSample
===
	
	address_id=#addressId#,store_id=#storeId#,seller_name=#sellerName#,area_id=#areaId#,city_id=#cityId#,area_info=#areaInfo#,address=#address#,telphone=#telphone#,company=#company#,is_default=#isDefault#

condition
===

	1 = 1  
	@if(!isEmpty(addressId)){
	 and address_id=#addressId#
	@}
	@if(!isEmpty(storeId)){
	 and store_id=#storeId#
	@}
	@if(!isEmpty(sellerName)){
	 and seller_name=#sellerName#
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
	@if(!isEmpty(telphone)){
	 and telphone=#telphone#
	@}
	@if(!isEmpty(company)){
	 and company=#company#
	@}
	@if(!isEmpty(isDefault)){
	 and is_default=#isDefault#
	@}
	
	