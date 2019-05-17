sample
===
* 注释

	select #use("cols")# from ra_store_joinin  where  #use("condition")#

cols
===
	member_id,member_name,company_name,company_province_id,company_address,company_address_detail,company_phone,company_employee_count,company_registered_capital,contacts_name,contacts_phone,contacts_email,business_licence_number,business_licence_address,business_licence_start,business_licence_end,business_sphere,business_licence_number_electronic,organization_code,organization_code_electronic,general_taxpayer,bank_account_name,bank_account_number,bank_name,bank_code,bank_address,bank_licence_electronic,is_settlement_account,settlement_bank_account_name,settlement_bank_account_number,settlement_bank_name,settlement_bank_code,settlement_bank_address,tax_registration_certificate,taxpayer_id,tax_registration_certificate_electronic,seller_name,store_name,store_class_ids,store_class_names,joinin_state,joinin_message,joinin_year,sg_name,sg_id,sg_info,sc_name,sc_id,sc_bail,store_class_commis_rates,paying_money_certificate,paying_money_certificate_explain,paying_amount,ebcCode,ebcName,is_whole,jp_login_name,jp_alt_mch_name,jp_alt_mch_no,jp_alt_merchant_type,jp_busi_contact_name,jp_busi_contact_mobile_no,jp_phone_no,jp_legal_person,jp_id_card_no,jp_sett_mode,jp_sett_date_type,jp_risk_day,jp_bank_account_type,jp_bank_account_name,jp_bank_account_no

updateSample
===
	
	member_id=#memberId#,member_name=#memberName#,company_name=#companyName#,company_province_id=#companyProvinceId#,company_address=#companyAddress#,company_address_detail=#companyAddressDetail#,company_phone=#companyPhone#,company_employee_count=#companyEmployeeCount#,company_registered_capital=#companyRegisteredCapital#,contacts_name=#contactsName#,contacts_phone=#contactsPhone#,contacts_email=#contactsEmail#,business_licence_number=#businessLicenceNumber#,business_licence_address=#businessLicenceAddress#,business_licence_start=#businessLicenceStart#,business_licence_end=#businessLicenceEnd#,business_sphere=#businessSphere#,business_licence_number_electronic=#businessLicenceNumberElectronic#,organization_code=#organizationCode#,organization_code_electronic=#organizationCodeElectronic#,general_taxpayer=#generalTaxpayer#,bank_account_name=#bankAccountName#,bank_account_number=#bankAccountNumber#,bank_name=#bankName#,bank_code=#bankCode#,bank_address=#bankAddress#,bank_licence_electronic=#bankLicenceElectronic#,is_settlement_account=#isSettlementAccount#,settlement_bank_account_name=#settlementBankAccountName#,settlement_bank_account_number=#settlementBankAccountNumber#,settlement_bank_name=#settlementBankName#,settlement_bank_code=#settlementBankCode#,settlement_bank_address=#settlementBankAddress#,tax_registration_certificate=#taxRegistrationCertificate#,taxpayer_id=#taxpayerId#,tax_registration_certificate_electronic=#taxRegistrationCertificateElectronic#,seller_name=#sellerName#,store_name=#storeName#,store_class_ids=#storeClassIds#,store_class_names=#storeClassNames#,joinin_state=#joininState#,joinin_message=#joininMessage#,joinin_year=#joininYear#,sg_name=#sgName#,sg_id=#sgId#,sg_info=#sgInfo#,sc_name=#scName#,sc_id=#scId#,sc_bail=#scBail#,store_class_commis_rates=#storeClassCommisRates#,paying_money_certificate=#payingMoneyCertificate#,paying_money_certificate_explain=#payingMoneyCertificateExplain#,paying_amount=#payingAmount#,ebcCode=#ebccode#,ebcName=#ebcname#,is_whole=#isWhole#,jp_login_name=#jpLoginName#,jp_alt_mch_name=#jpAltMchName#,jp_alt_mch_no=#jpAltMchNo#,jp_alt_merchant_type=#jpAltMerchantType#,jp_busi_contact_name=#jpBusiContactName#,jp_busi_contact_mobile_no=#jpBusiContactMobileNo#,jp_phone_no=#jpPhoneNo#,jp_legal_person=#jpLegalPerson#,jp_id_card_no=#jpIdCardNo#,jp_sett_mode=#jpSettMode#,jp_sett_date_type=#jpSettDateType#,jp_risk_day=#jpRiskDay#,jp_bank_account_type=#jpBankAccountType#,jp_bank_account_name=#jpBankAccountName#,jp_bank_account_no=#jpBankAccountNo#

condition
===

	1 = 1  
	@if(!isEmpty(memberId)){
	 and member_id=#memberId#
	@}
	@if(!isEmpty(memberName)){
	 and member_name=#memberName#
	@}
	@if(!isEmpty(companyName)){
	 and company_name=#companyName#
	@}
	@if(!isEmpty(companyProvinceId)){
	 and company_province_id=#companyProvinceId#
	@}
	@if(!isEmpty(companyAddress)){
	 and company_address=#companyAddress#
	@}
	@if(!isEmpty(companyAddressDetail)){
	 and company_address_detail=#companyAddressDetail#
	@}
	@if(!isEmpty(companyPhone)){
	 and company_phone=#companyPhone#
	@}
	@if(!isEmpty(companyEmployeeCount)){
	 and company_employee_count=#companyEmployeeCount#
	@}
	@if(!isEmpty(companyRegisteredCapital)){
	 and company_registered_capital=#companyRegisteredCapital#
	@}
	@if(!isEmpty(contactsName)){
	 and contacts_name=#contactsName#
	@}
	@if(!isEmpty(contactsPhone)){
	 and contacts_phone=#contactsPhone#
	@}
	@if(!isEmpty(contactsEmail)){
	 and contacts_email=#contactsEmail#
	@}
	@if(!isEmpty(businessLicenceNumber)){
	 and business_licence_number=#businessLicenceNumber#
	@}
	@if(!isEmpty(businessLicenceAddress)){
	 and business_licence_address=#businessLicenceAddress#
	@}
	@if(!isEmpty(businessLicenceStart)){
	 and business_licence_start=#businessLicenceStart#
	@}
	@if(!isEmpty(businessLicenceEnd)){
	 and business_licence_end=#businessLicenceEnd#
	@}
	@if(!isEmpty(businessSphere)){
	 and business_sphere=#businessSphere#
	@}
	@if(!isEmpty(businessLicenceNumberElectronic)){
	 and business_licence_number_electronic=#businessLicenceNumberElectronic#
	@}
	@if(!isEmpty(organizationCode)){
	 and organization_code=#organizationCode#
	@}
	@if(!isEmpty(organizationCodeElectronic)){
	 and organization_code_electronic=#organizationCodeElectronic#
	@}
	@if(!isEmpty(generalTaxpayer)){
	 and general_taxpayer=#generalTaxpayer#
	@}
	@if(!isEmpty(bankAccountName)){
	 and bank_account_name=#bankAccountName#
	@}
	@if(!isEmpty(bankAccountNumber)){
	 and bank_account_number=#bankAccountNumber#
	@}
	@if(!isEmpty(bankName)){
	 and bank_name=#bankName#
	@}
	@if(!isEmpty(bankCode)){
	 and bank_code=#bankCode#
	@}
	@if(!isEmpty(bankAddress)){
	 and bank_address=#bankAddress#
	@}
	@if(!isEmpty(bankLicenceElectronic)){
	 and bank_licence_electronic=#bankLicenceElectronic#
	@}
	@if(!isEmpty(isSettlementAccount)){
	 and is_settlement_account=#isSettlementAccount#
	@}
	@if(!isEmpty(settlementBankAccountName)){
	 and settlement_bank_account_name=#settlementBankAccountName#
	@}
	@if(!isEmpty(settlementBankAccountNumber)){
	 and settlement_bank_account_number=#settlementBankAccountNumber#
	@}
	@if(!isEmpty(settlementBankName)){
	 and settlement_bank_name=#settlementBankName#
	@}
	@if(!isEmpty(settlementBankCode)){
	 and settlement_bank_code=#settlementBankCode#
	@}
	@if(!isEmpty(settlementBankAddress)){
	 and settlement_bank_address=#settlementBankAddress#
	@}
	@if(!isEmpty(taxRegistrationCertificate)){
	 and tax_registration_certificate=#taxRegistrationCertificate#
	@}
	@if(!isEmpty(taxpayerId)){
	 and taxpayer_id=#taxpayerId#
	@}
	@if(!isEmpty(taxRegistrationCertificateElectronic)){
	 and tax_registration_certificate_electronic=#taxRegistrationCertificateElectronic#
	@}
	@if(!isEmpty(sellerName)){
	 and seller_name=#sellerName#
	@}
	@if(!isEmpty(storeName)){
	 and store_name=#storeName#
	@}
	@if(!isEmpty(storeClassIds)){
	 and store_class_ids=#storeClassIds#
	@}
	@if(!isEmpty(storeClassNames)){
	 and store_class_names=#storeClassNames#
	@}
	@if(!isEmpty(joininState)){
	 and joinin_state=#joininState#
	@}
	@if(!isEmpty(joininMessage)){
	 and joinin_message=#joininMessage#
	@}
	@if(!isEmpty(joininYear)){
	 and joinin_year=#joininYear#
	@}
	@if(!isEmpty(sgName)){
	 and sg_name=#sgName#
	@}
	@if(!isEmpty(sgId)){
	 and sg_id=#sgId#
	@}
	@if(!isEmpty(sgInfo)){
	 and sg_info=#sgInfo#
	@}
	@if(!isEmpty(scName)){
	 and sc_name=#scName#
	@}
	@if(!isEmpty(scId)){
	 and sc_id=#scId#
	@}
	@if(!isEmpty(scBail)){
	 and sc_bail=#scBail#
	@}
	@if(!isEmpty(storeClassCommisRates)){
	 and store_class_commis_rates=#storeClassCommisRates#
	@}
	@if(!isEmpty(payingMoneyCertificate)){
	 and paying_money_certificate=#payingMoneyCertificate#
	@}
	@if(!isEmpty(payingMoneyCertificateExplain)){
	 and paying_money_certificate_explain=#payingMoneyCertificateExplain#
	@}
	@if(!isEmpty(payingAmount)){
	 and paying_amount=#payingAmount#
	@}
	@if(!isEmpty(ebccode)){
	 and ebcCode=#ebccode#
	@}
	@if(!isEmpty(ebcname)){
	 and ebcName=#ebcname#
	@}
	@if(!isEmpty(isWhole)){
	 and is_whole=#isWhole#
	@}
	@if(!isEmpty(jpLoginName)){
	 and jp_login_name=#jpLoginName#
	@}
	@if(!isEmpty(jpAltMchName)){
	 and jp_alt_mch_name=#jpAltMchName#
	@}
	@if(!isEmpty(jpAltMchNo)){
	 and jp_alt_mch_no=#jpAltMchNo#
	@}
	@if(!isEmpty(jpAltMerchantType)){
	 and jp_alt_merchant_type=#jpAltMerchantType#
	@}
	@if(!isEmpty(jpBusiContactName)){
	 and jp_busi_contact_name=#jpBusiContactName#
	@}
	@if(!isEmpty(jpBusiContactMobileNo)){
	 and jp_busi_contact_mobile_no=#jpBusiContactMobileNo#
	@}
	@if(!isEmpty(jpPhoneNo)){
	 and jp_phone_no=#jpPhoneNo#
	@}
	@if(!isEmpty(jpLegalPerson)){
	 and jp_legal_person=#jpLegalPerson#
	@}
	@if(!isEmpty(jpIdCardNo)){
	 and jp_id_card_no=#jpIdCardNo#
	@}
	@if(!isEmpty(jpSettMode)){
	 and jp_sett_mode=#jpSettMode#
	@}
	@if(!isEmpty(jpSettDateType)){
	 and jp_sett_date_type=#jpSettDateType#
	@}
	@if(!isEmpty(jpRiskDay)){
	 and jp_risk_day=#jpRiskDay#
	@}
	@if(!isEmpty(jpBankAccountType)){
	 and jp_bank_account_type=#jpBankAccountType#
	@}
	@if(!isEmpty(jpBankAccountName)){
	 and jp_bank_account_name=#jpBankAccountName#
	@}
	@if(!isEmpty(jpBankAccountNo)){
	 and jp_bank_account_no=#jpBankAccountNo#
	@}
	
	