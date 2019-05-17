sample
===
* 注释

	select #use("cols")# from ra_custom_hangzhou_goods  where  #use("condition")#

cols
===
	commoditySpec,commodityArtNo,commodityMadeTime,brandId,brandName,unit,weight,remark,tradeCountryName,tradeCountryCode,HScode,goods_commonid,codeTs,commodityBarcode

updateSample
===
	
	commoditySpec=#commodityspec#,commodityArtNo=#commodityartno#,commodityMadeTime=#commoditymadetime#,brandId=#brandid#,brandName=#brandname#,unit=#unit#,weight=#weight#,remark=#remark#,tradeCountryName=#tradecountryname#,tradeCountryCode=#tradecountrycode#,HScode=#hscode#,goods_commonid=#goodsCommonid#,codeTs=#codets#,commodityBarcode=#commoditybarcode#

condition
===

	1 = 1  
	@if(!isEmpty(commodityspec)){
	 and commoditySpec=#commodityspec#
	@}
	@if(!isEmpty(commodityartno)){
	 and commodityArtNo=#commodityartno#
	@}
	@if(!isEmpty(commoditymadetime)){
	 and commodityMadeTime=#commoditymadetime#
	@}
	@if(!isEmpty(brandid)){
	 and brandId=#brandid#
	@}
	@if(!isEmpty(brandname)){
	 and brandName=#brandname#
	@}
	@if(!isEmpty(unit)){
	 and unit=#unit#
	@}
	@if(!isEmpty(weight)){
	 and weight=#weight#
	@}
	@if(!isEmpty(remark)){
	 and remark=#remark#
	@}
	@if(!isEmpty(tradecountryname)){
	 and tradeCountryName=#tradecountryname#
	@}
	@if(!isEmpty(tradecountrycode)){
	 and tradeCountryCode=#tradecountrycode#
	@}
	@if(!isEmpty(hscode)){
	 and HScode=#hscode#
	@}
	@if(!isEmpty(goodsCommonid)){
	 and goods_commonid=#goodsCommonid#
	@}
	@if(!isEmpty(codets)){
	 and codeTs=#codets#
	@}
	@if(!isEmpty(commoditybarcode)){
	 and commodityBarcode=#commoditybarcode#
	@}
	
	