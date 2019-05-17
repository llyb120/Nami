sample
===
* 注释

	select #use("cols")# from ra_custom_shenzhen_goods  where  #use("condition")#

cols
===
	gno,postTaxCode,ciqGno,codeTs,gcode,element,unit,currency,originCountry,inspectionFlag,giftFlag,supplierName,enterprisesName,enterprisesCountry,standards,certification,supervisionFlag,ImageList,AttachmentList,goods_commonid,foodEnterpriseNumber,warningFlag,gmodel,ciqGmodel,brand,supplierCountry,tax_rate,flight_number,pick_number,trafMode,shipName,beianhao,hUnit,hCount,hUnit2,hCount2,tran_type_code

updateSample
===
	
	gno=#gno#,postTaxCode=#posttaxcode#,ciqGno=#ciqgno#,codeTs=#codets#,gcode=#gcode#,element=#element#,unit=#unit#,currency=#currency#,originCountry=#origincountry#,inspectionFlag=#inspectionflag#,giftFlag=#giftflag#,supplierName=#suppliername#,enterprisesName=#enterprisesname#,enterprisesCountry=#enterprisescountry#,standards=#standards#,certification=#certification#,supervisionFlag=#supervisionflag#,ImageList=#imagelist#,AttachmentList=#attachmentlist#,goods_commonid=#goodsCommonid#,foodEnterpriseNumber=#foodenterprisenumber#,warningFlag=#warningflag#,gmodel=#gmodel#,ciqGmodel=#ciqgmodel#,brand=#brand#,supplierCountry=#suppliercountry#,tax_rate=#taxRate#,flight_number=#flightNumber#,pick_number=#pickNumber#,trafMode=#trafmode#,shipName=#shipname#,beianhao=#beianhao#,hUnit=#hunit#,hCount=#hcount#,hUnit2=#hunit2#,hCount2=#hcount2#,tran_type_code=#tranTypeCode#

condition
===

	1 = 1  
	@if(!isEmpty(gno)){
	 and gno=#gno#
	@}
	@if(!isEmpty(posttaxcode)){
	 and postTaxCode=#posttaxcode#
	@}
	@if(!isEmpty(ciqgno)){
	 and ciqGno=#ciqgno#
	@}
	@if(!isEmpty(codets)){
	 and codeTs=#codets#
	@}
	@if(!isEmpty(gcode)){
	 and gcode=#gcode#
	@}
	@if(!isEmpty(element)){
	 and element=#element#
	@}
	@if(!isEmpty(unit)){
	 and unit=#unit#
	@}
	@if(!isEmpty(currency)){
	 and currency=#currency#
	@}
	@if(!isEmpty(origincountry)){
	 and originCountry=#origincountry#
	@}
	@if(!isEmpty(inspectionflag)){
	 and inspectionFlag=#inspectionflag#
	@}
	@if(!isEmpty(giftflag)){
	 and giftFlag=#giftflag#
	@}
	@if(!isEmpty(suppliername)){
	 and supplierName=#suppliername#
	@}
	@if(!isEmpty(enterprisesname)){
	 and enterprisesName=#enterprisesname#
	@}
	@if(!isEmpty(enterprisescountry)){
	 and enterprisesCountry=#enterprisescountry#
	@}
	@if(!isEmpty(standards)){
	 and standards=#standards#
	@}
	@if(!isEmpty(certification)){
	 and certification=#certification#
	@}
	@if(!isEmpty(supervisionflag)){
	 and supervisionFlag=#supervisionflag#
	@}
	@if(!isEmpty(imagelist)){
	 and ImageList=#imagelist#
	@}
	@if(!isEmpty(attachmentlist)){
	 and AttachmentList=#attachmentlist#
	@}
	@if(!isEmpty(goodsCommonid)){
	 and goods_commonid=#goodsCommonid#
	@}
	@if(!isEmpty(foodenterprisenumber)){
	 and foodEnterpriseNumber=#foodenterprisenumber#
	@}
	@if(!isEmpty(warningflag)){
	 and warningFlag=#warningflag#
	@}
	@if(!isEmpty(gmodel)){
	 and gmodel=#gmodel#
	@}
	@if(!isEmpty(ciqgmodel)){
	 and ciqGmodel=#ciqgmodel#
	@}
	@if(!isEmpty(brand)){
	 and brand=#brand#
	@}
	@if(!isEmpty(suppliercountry)){
	 and supplierCountry=#suppliercountry#
	@}
	@if(!isEmpty(taxRate)){
	 and tax_rate=#taxRate#
	@}
	@if(!isEmpty(flightNumber)){
	 and flight_number=#flightNumber#
	@}
	@if(!isEmpty(pickNumber)){
	 and pick_number=#pickNumber#
	@}
	@if(!isEmpty(trafmode)){
	 and trafMode=#trafmode#
	@}
	@if(!isEmpty(shipname)){
	 and shipName=#shipname#
	@}
	@if(!isEmpty(beianhao)){
	 and beianhao=#beianhao#
	@}
	@if(!isEmpty(hunit)){
	 and hUnit=#hunit#
	@}
	@if(!isEmpty(hcount)){
	 and hCount=#hcount#
	@}
	@if(!isEmpty(hunit2)){
	 and hUnit2=#hunit2#
	@}
	@if(!isEmpty(hcount2)){
	 and hCount2=#hcount2#
	@}
	@if(!isEmpty(tranTypeCode)){
	 and tran_type_code=#tranTypeCode#
	@}
	
	