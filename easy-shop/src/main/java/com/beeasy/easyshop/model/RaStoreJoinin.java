package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_store_joinin")
public class RaStoreJoinin   {
	
	/*
	用户编号
	*/
	private Integer memberId ;
	/*
	员工总数
	*/
	private Integer companyEmployeeCount ;
	/*
	所在地省ID
	*/
	private Integer companyProvinceId ;
	/*
	注册资金
	*/
	private Integer companyRegisteredCapital ;
	/*
	开户行账号是否为结算账号 1-开户行就是结算账号 2-独立的计算账号
	*/
	private Integer isSettlementAccount ;
	private Integer isWhole ;
	/*
	开店时长(年)
	*/
	private Integer joininYear ;
	/*
	分账方商户类型10:个人，11：个体工商户，12：企业
	*/
	private Integer jpAltMerchantType ;
	/*
	账户类型值为：1 借记卡，4 对公账户
	*/
	private Integer jpBankAccountType ;
	/*
	结算周期
	*/
	private Integer jpRiskDay ;
	/*
	结算周期类型，值为：1 工作日，2 自然日，3 月结日
	*/
	private Integer jpSettDateType ;
	/*
	值为： 1 由汇聚自动结算;2 由商户平台手工结算（结算接口）
	*/
	private Integer jpSettMode ;
	/*
	店铺分类保证金
	*/
	private Integer scBail ;
	/*
	店铺分类编号
	*/
	private Integer scId ;
	/*
	店铺等级编号
	*/
	private Integer sgId ;
	/*
	银行开户名
	*/
	private String bankAccountName ;
	/*
	公司银行账号
	*/
	private String bankAccountNumber ;
	/*
	开户银行所在地
	*/
	private String bankAddress ;
	/*
	支行联行号
	*/
	private String bankCode ;
	/*
	开户银行许可证电子版
	*/
	private String bankLicenceElectronic ;
	/*
	开户银行支行名称
	*/
	private String bankName ;
	/*
	营业执所在地
	*/
	private String businessLicenceAddress ;
	/*
	营业执照号
	*/
	private String businessLicenceNumber ;
	/*
	营业执照电子版
	*/
	private String businessLicenceNumberElectronic ;
	/*
	法定经营范围
	*/
	private String businessSphere ;
	/*
	公司地址
	*/
	private String companyAddress ;
	/*
	公司详细地址
	*/
	private String companyAddressDetail ;
	/*
	公司名称
	*/
	private String companyName ;
	/*
	公司电话
	*/
	private String companyPhone ;
	/*
	联系人邮箱
	*/
	private String contactsEmail ;
	/*
	联系人姓名
	*/
	private String contactsName ;
	/*
	联系人电话
	*/
	private String contactsPhone ;
	/*
	海关备案号
	*/
	private String ebccode ;
	/*
	企业中文名称
	*/
	private String ebcname ;
	/*
	一般纳税人证明
	*/
	private String generalTaxpayer ;
	/*
	管理员审核信息
	*/
	private String joininMessage ;
	/*
	申请状态 10-已提交申请 11-缴费完成  20-审核成功 30-审核失败 31-缴费审核失败 40-审核通过开店
	*/
	private String joininState ;
	/*
	分账方名称
	*/
	private String jpAltMchName ;
	/*
	分账账号商家号
	*/
	private String jpAltMchNo ;
	/*
	银行账户名称 分账方结算银行账户名称
	*/
	private String jpBankAccountName ;
	/*
	银行账号 分账方结算银行账号
	*/
	private String jpBankAccountNo ;
	/*
	业务联系人手机
	*/
	private String jpBusiContactMobileNo ;
	/*
	业务联系人姓名
	*/
	private String jpBusiContactName ;
	/*
	身份证号
	*/
	private String jpIdCardNo ;
	/*
	法人姓名
	*/
	private String jpLegalPerson ;
	/*
	分账方登录名，即邮箱
	*/
	private String jpLoginName ;
	/*
	法人的手机号
	*/
	private String jpPhoneNo ;
	/*
	店主用户名
	*/
	private String memberName ;
	/*
	组织机构代码
	*/
	private String organizationCode ;
	/*
	组织机构代码电子版
	*/
	private String organizationCodeElectronic ;
	/*
	付款金额
	*/
	private BigDecimal payingAmount ;
	/*
	付款凭证
	*/
	private String payingMoneyCertificate ;
	/*
	付款凭证说明
	*/
	private String payingMoneyCertificateExplain ;
	/*
	店铺分类名称
	*/
	private String scName ;
	/*
	卖家帐号
	*/
	private String sellerName ;
	/*
	结算银行开户名
	*/
	private String settlementBankAccountName ;
	/*
	结算公司银行账号
	*/
	private String settlementBankAccountNumber ;
	/*
	结算开户银行所在地
	*/
	private String settlementBankAddress ;
	/*
	结算支行联行号
	*/
	private String settlementBankCode ;
	/*
	结算开户银行支行名称
	*/
	private String settlementBankName ;
	/*
	店铺等级下的收费等信息
	*/
	private String sgInfo ;
	/*
	店铺等级名称
	*/
	private String sgName ;
	/*
	分类佣金比例
	*/
	private String storeClassCommisRates ;
	/*
	店铺分类编号集合
	*/
	private String storeClassIds ;
	/*
	店铺分类名称集合
	*/
	private String storeClassNames ;
	/*
	店铺名称
	*/
	private String storeName ;
	/*
	税务登记证号
	*/
	private String taxRegistrationCertificate ;
	/*
	税务登记证号电子版
	*/
	private String taxRegistrationCertificateElectronic ;
	/*
	纳税人识别号
	*/
	private String taxpayerId ;
	/*
	营业执照有效期结束
	*/
	private Date businessLicenceEnd ;
	/*
	营业执照有效期开始
	*/
	private Date businessLicenceStart ;
	
	public RaStoreJoinin() {
	}
	
	/**
	* 用户编号
	*@return 
	*/
	public Integer getMemberId(){
		return  memberId;
	}
	/**
	* 用户编号
	*@param  memberId
	*/
	public void setMemberId(Integer memberId ){
		this.memberId = memberId;
	}
	
	/**
	* 员工总数
	*@return 
	*/
	public Integer getCompanyEmployeeCount(){
		return  companyEmployeeCount;
	}
	/**
	* 员工总数
	*@param  companyEmployeeCount
	*/
	public void setCompanyEmployeeCount(Integer companyEmployeeCount ){
		this.companyEmployeeCount = companyEmployeeCount;
	}
	
	/**
	* 所在地省ID
	*@return 
	*/
	public Integer getCompanyProvinceId(){
		return  companyProvinceId;
	}
	/**
	* 所在地省ID
	*@param  companyProvinceId
	*/
	public void setCompanyProvinceId(Integer companyProvinceId ){
		this.companyProvinceId = companyProvinceId;
	}
	
	/**
	* 注册资金
	*@return 
	*/
	public Integer getCompanyRegisteredCapital(){
		return  companyRegisteredCapital;
	}
	/**
	* 注册资金
	*@param  companyRegisteredCapital
	*/
	public void setCompanyRegisteredCapital(Integer companyRegisteredCapital ){
		this.companyRegisteredCapital = companyRegisteredCapital;
	}
	
	/**
	* 开户行账号是否为结算账号 1-开户行就是结算账号 2-独立的计算账号
	*@return 
	*/
	public Integer getIsSettlementAccount(){
		return  isSettlementAccount;
	}
	/**
	* 开户行账号是否为结算账号 1-开户行就是结算账号 2-独立的计算账号
	*@param  isSettlementAccount
	*/
	public void setIsSettlementAccount(Integer isSettlementAccount ){
		this.isSettlementAccount = isSettlementAccount;
	}
	
	public Integer getIsWhole(){
		return  isWhole;
	}
	public void setIsWhole(Integer isWhole ){
		this.isWhole = isWhole;
	}
	
	/**
	* 开店时长(年)
	*@return 
	*/
	public Integer getJoininYear(){
		return  joininYear;
	}
	/**
	* 开店时长(年)
	*@param  joininYear
	*/
	public void setJoininYear(Integer joininYear ){
		this.joininYear = joininYear;
	}
	
	/**
	* 分账方商户类型10:个人，11：个体工商户，12：企业
	*@return 
	*/
	public Integer getJpAltMerchantType(){
		return  jpAltMerchantType;
	}
	/**
	* 分账方商户类型10:个人，11：个体工商户，12：企业
	*@param  jpAltMerchantType
	*/
	public void setJpAltMerchantType(Integer jpAltMerchantType ){
		this.jpAltMerchantType = jpAltMerchantType;
	}
	
	/**
	* 账户类型值为：1 借记卡，4 对公账户
	*@return 
	*/
	public Integer getJpBankAccountType(){
		return  jpBankAccountType;
	}
	/**
	* 账户类型值为：1 借记卡，4 对公账户
	*@param  jpBankAccountType
	*/
	public void setJpBankAccountType(Integer jpBankAccountType ){
		this.jpBankAccountType = jpBankAccountType;
	}
	
	/**
	* 结算周期
	*@return 
	*/
	public Integer getJpRiskDay(){
		return  jpRiskDay;
	}
	/**
	* 结算周期
	*@param  jpRiskDay
	*/
	public void setJpRiskDay(Integer jpRiskDay ){
		this.jpRiskDay = jpRiskDay;
	}
	
	/**
	* 结算周期类型，值为：1 工作日，2 自然日，3 月结日
	*@return 
	*/
	public Integer getJpSettDateType(){
		return  jpSettDateType;
	}
	/**
	* 结算周期类型，值为：1 工作日，2 自然日，3 月结日
	*@param  jpSettDateType
	*/
	public void setJpSettDateType(Integer jpSettDateType ){
		this.jpSettDateType = jpSettDateType;
	}
	
	/**
	* 值为： 1 由汇聚自动结算;2 由商户平台手工结算（结算接口）
	*@return 
	*/
	public Integer getJpSettMode(){
		return  jpSettMode;
	}
	/**
	* 值为： 1 由汇聚自动结算;2 由商户平台手工结算（结算接口）
	*@param  jpSettMode
	*/
	public void setJpSettMode(Integer jpSettMode ){
		this.jpSettMode = jpSettMode;
	}
	
	/**
	* 店铺分类保证金
	*@return 
	*/
	public Integer getScBail(){
		return  scBail;
	}
	/**
	* 店铺分类保证金
	*@param  scBail
	*/
	public void setScBail(Integer scBail ){
		this.scBail = scBail;
	}
	
	/**
	* 店铺分类编号
	*@return 
	*/
	public Integer getScId(){
		return  scId;
	}
	/**
	* 店铺分类编号
	*@param  scId
	*/
	public void setScId(Integer scId ){
		this.scId = scId;
	}
	
	/**
	* 店铺等级编号
	*@return 
	*/
	public Integer getSgId(){
		return  sgId;
	}
	/**
	* 店铺等级编号
	*@param  sgId
	*/
	public void setSgId(Integer sgId ){
		this.sgId = sgId;
	}
	
	/**
	* 银行开户名
	*@return 
	*/
	public String getBankAccountName(){
		return  bankAccountName;
	}
	/**
	* 银行开户名
	*@param  bankAccountName
	*/
	public void setBankAccountName(String bankAccountName ){
		this.bankAccountName = bankAccountName;
	}
	
	/**
	* 公司银行账号
	*@return 
	*/
	public String getBankAccountNumber(){
		return  bankAccountNumber;
	}
	/**
	* 公司银行账号
	*@param  bankAccountNumber
	*/
	public void setBankAccountNumber(String bankAccountNumber ){
		this.bankAccountNumber = bankAccountNumber;
	}
	
	/**
	* 开户银行所在地
	*@return 
	*/
	public String getBankAddress(){
		return  bankAddress;
	}
	/**
	* 开户银行所在地
	*@param  bankAddress
	*/
	public void setBankAddress(String bankAddress ){
		this.bankAddress = bankAddress;
	}
	
	/**
	* 支行联行号
	*@return 
	*/
	public String getBankCode(){
		return  bankCode;
	}
	/**
	* 支行联行号
	*@param  bankCode
	*/
	public void setBankCode(String bankCode ){
		this.bankCode = bankCode;
	}
	
	/**
	* 开户银行许可证电子版
	*@return 
	*/
	public String getBankLicenceElectronic(){
		return  bankLicenceElectronic;
	}
	/**
	* 开户银行许可证电子版
	*@param  bankLicenceElectronic
	*/
	public void setBankLicenceElectronic(String bankLicenceElectronic ){
		this.bankLicenceElectronic = bankLicenceElectronic;
	}
	
	/**
	* 开户银行支行名称
	*@return 
	*/
	public String getBankName(){
		return  bankName;
	}
	/**
	* 开户银行支行名称
	*@param  bankName
	*/
	public void setBankName(String bankName ){
		this.bankName = bankName;
	}
	
	/**
	* 营业执所在地
	*@return 
	*/
	public String getBusinessLicenceAddress(){
		return  businessLicenceAddress;
	}
	/**
	* 营业执所在地
	*@param  businessLicenceAddress
	*/
	public void setBusinessLicenceAddress(String businessLicenceAddress ){
		this.businessLicenceAddress = businessLicenceAddress;
	}
	
	/**
	* 营业执照号
	*@return 
	*/
	public String getBusinessLicenceNumber(){
		return  businessLicenceNumber;
	}
	/**
	* 营业执照号
	*@param  businessLicenceNumber
	*/
	public void setBusinessLicenceNumber(String businessLicenceNumber ){
		this.businessLicenceNumber = businessLicenceNumber;
	}
	
	/**
	* 营业执照电子版
	*@return 
	*/
	public String getBusinessLicenceNumberElectronic(){
		return  businessLicenceNumberElectronic;
	}
	/**
	* 营业执照电子版
	*@param  businessLicenceNumberElectronic
	*/
	public void setBusinessLicenceNumberElectronic(String businessLicenceNumberElectronic ){
		this.businessLicenceNumberElectronic = businessLicenceNumberElectronic;
	}
	
	/**
	* 法定经营范围
	*@return 
	*/
	public String getBusinessSphere(){
		return  businessSphere;
	}
	/**
	* 法定经营范围
	*@param  businessSphere
	*/
	public void setBusinessSphere(String businessSphere ){
		this.businessSphere = businessSphere;
	}
	
	/**
	* 公司地址
	*@return 
	*/
	public String getCompanyAddress(){
		return  companyAddress;
	}
	/**
	* 公司地址
	*@param  companyAddress
	*/
	public void setCompanyAddress(String companyAddress ){
		this.companyAddress = companyAddress;
	}
	
	/**
	* 公司详细地址
	*@return 
	*/
	public String getCompanyAddressDetail(){
		return  companyAddressDetail;
	}
	/**
	* 公司详细地址
	*@param  companyAddressDetail
	*/
	public void setCompanyAddressDetail(String companyAddressDetail ){
		this.companyAddressDetail = companyAddressDetail;
	}
	
	/**
	* 公司名称
	*@return 
	*/
	public String getCompanyName(){
		return  companyName;
	}
	/**
	* 公司名称
	*@param  companyName
	*/
	public void setCompanyName(String companyName ){
		this.companyName = companyName;
	}
	
	/**
	* 公司电话
	*@return 
	*/
	public String getCompanyPhone(){
		return  companyPhone;
	}
	/**
	* 公司电话
	*@param  companyPhone
	*/
	public void setCompanyPhone(String companyPhone ){
		this.companyPhone = companyPhone;
	}
	
	/**
	* 联系人邮箱
	*@return 
	*/
	public String getContactsEmail(){
		return  contactsEmail;
	}
	/**
	* 联系人邮箱
	*@param  contactsEmail
	*/
	public void setContactsEmail(String contactsEmail ){
		this.contactsEmail = contactsEmail;
	}
	
	/**
	* 联系人姓名
	*@return 
	*/
	public String getContactsName(){
		return  contactsName;
	}
	/**
	* 联系人姓名
	*@param  contactsName
	*/
	public void setContactsName(String contactsName ){
		this.contactsName = contactsName;
	}
	
	/**
	* 联系人电话
	*@return 
	*/
	public String getContactsPhone(){
		return  contactsPhone;
	}
	/**
	* 联系人电话
	*@param  contactsPhone
	*/
	public void setContactsPhone(String contactsPhone ){
		this.contactsPhone = contactsPhone;
	}
	
	/**
	* 海关备案号
	*@return 
	*/
	public String getEbccode(){
		return  ebccode;
	}
	/**
	* 海关备案号
	*@param  ebccode
	*/
	public void setEbccode(String ebccode ){
		this.ebccode = ebccode;
	}
	
	/**
	* 企业中文名称
	*@return 
	*/
	public String getEbcname(){
		return  ebcname;
	}
	/**
	* 企业中文名称
	*@param  ebcname
	*/
	public void setEbcname(String ebcname ){
		this.ebcname = ebcname;
	}
	
	/**
	* 一般纳税人证明
	*@return 
	*/
	public String getGeneralTaxpayer(){
		return  generalTaxpayer;
	}
	/**
	* 一般纳税人证明
	*@param  generalTaxpayer
	*/
	public void setGeneralTaxpayer(String generalTaxpayer ){
		this.generalTaxpayer = generalTaxpayer;
	}
	
	/**
	* 管理员审核信息
	*@return 
	*/
	public String getJoininMessage(){
		return  joininMessage;
	}
	/**
	* 管理员审核信息
	*@param  joininMessage
	*/
	public void setJoininMessage(String joininMessage ){
		this.joininMessage = joininMessage;
	}
	
	/**
	* 申请状态 10-已提交申请 11-缴费完成  20-审核成功 30-审核失败 31-缴费审核失败 40-审核通过开店
	*@return 
	*/
	public String getJoininState(){
		return  joininState;
	}
	/**
	* 申请状态 10-已提交申请 11-缴费完成  20-审核成功 30-审核失败 31-缴费审核失败 40-审核通过开店
	*@param  joininState
	*/
	public void setJoininState(String joininState ){
		this.joininState = joininState;
	}
	
	/**
	* 分账方名称
	*@return 
	*/
	public String getJpAltMchName(){
		return  jpAltMchName;
	}
	/**
	* 分账方名称
	*@param  jpAltMchName
	*/
	public void setJpAltMchName(String jpAltMchName ){
		this.jpAltMchName = jpAltMchName;
	}
	
	/**
	* 分账账号商家号
	*@return 
	*/
	public String getJpAltMchNo(){
		return  jpAltMchNo;
	}
	/**
	* 分账账号商家号
	*@param  jpAltMchNo
	*/
	public void setJpAltMchNo(String jpAltMchNo ){
		this.jpAltMchNo = jpAltMchNo;
	}
	
	/**
	* 银行账户名称 分账方结算银行账户名称
	*@return 
	*/
	public String getJpBankAccountName(){
		return  jpBankAccountName;
	}
	/**
	* 银行账户名称 分账方结算银行账户名称
	*@param  jpBankAccountName
	*/
	public void setJpBankAccountName(String jpBankAccountName ){
		this.jpBankAccountName = jpBankAccountName;
	}
	
	/**
	* 银行账号 分账方结算银行账号
	*@return 
	*/
	public String getJpBankAccountNo(){
		return  jpBankAccountNo;
	}
	/**
	* 银行账号 分账方结算银行账号
	*@param  jpBankAccountNo
	*/
	public void setJpBankAccountNo(String jpBankAccountNo ){
		this.jpBankAccountNo = jpBankAccountNo;
	}
	
	/**
	* 业务联系人手机
	*@return 
	*/
	public String getJpBusiContactMobileNo(){
		return  jpBusiContactMobileNo;
	}
	/**
	* 业务联系人手机
	*@param  jpBusiContactMobileNo
	*/
	public void setJpBusiContactMobileNo(String jpBusiContactMobileNo ){
		this.jpBusiContactMobileNo = jpBusiContactMobileNo;
	}
	
	/**
	* 业务联系人姓名
	*@return 
	*/
	public String getJpBusiContactName(){
		return  jpBusiContactName;
	}
	/**
	* 业务联系人姓名
	*@param  jpBusiContactName
	*/
	public void setJpBusiContactName(String jpBusiContactName ){
		this.jpBusiContactName = jpBusiContactName;
	}
	
	/**
	* 身份证号
	*@return 
	*/
	public String getJpIdCardNo(){
		return  jpIdCardNo;
	}
	/**
	* 身份证号
	*@param  jpIdCardNo
	*/
	public void setJpIdCardNo(String jpIdCardNo ){
		this.jpIdCardNo = jpIdCardNo;
	}
	
	/**
	* 法人姓名
	*@return 
	*/
	public String getJpLegalPerson(){
		return  jpLegalPerson;
	}
	/**
	* 法人姓名
	*@param  jpLegalPerson
	*/
	public void setJpLegalPerson(String jpLegalPerson ){
		this.jpLegalPerson = jpLegalPerson;
	}
	
	/**
	* 分账方登录名，即邮箱
	*@return 
	*/
	public String getJpLoginName(){
		return  jpLoginName;
	}
	/**
	* 分账方登录名，即邮箱
	*@param  jpLoginName
	*/
	public void setJpLoginName(String jpLoginName ){
		this.jpLoginName = jpLoginName;
	}
	
	/**
	* 法人的手机号
	*@return 
	*/
	public String getJpPhoneNo(){
		return  jpPhoneNo;
	}
	/**
	* 法人的手机号
	*@param  jpPhoneNo
	*/
	public void setJpPhoneNo(String jpPhoneNo ){
		this.jpPhoneNo = jpPhoneNo;
	}
	
	/**
	* 店主用户名
	*@return 
	*/
	public String getMemberName(){
		return  memberName;
	}
	/**
	* 店主用户名
	*@param  memberName
	*/
	public void setMemberName(String memberName ){
		this.memberName = memberName;
	}
	
	/**
	* 组织机构代码
	*@return 
	*/
	public String getOrganizationCode(){
		return  organizationCode;
	}
	/**
	* 组织机构代码
	*@param  organizationCode
	*/
	public void setOrganizationCode(String organizationCode ){
		this.organizationCode = organizationCode;
	}
	
	/**
	* 组织机构代码电子版
	*@return 
	*/
	public String getOrganizationCodeElectronic(){
		return  organizationCodeElectronic;
	}
	/**
	* 组织机构代码电子版
	*@param  organizationCodeElectronic
	*/
	public void setOrganizationCodeElectronic(String organizationCodeElectronic ){
		this.organizationCodeElectronic = organizationCodeElectronic;
	}
	
	/**
	* 付款金额
	*@return 
	*/
	public BigDecimal getPayingAmount(){
		return  payingAmount;
	}
	/**
	* 付款金额
	*@param  payingAmount
	*/
	public void setPayingAmount(BigDecimal payingAmount ){
		this.payingAmount = payingAmount;
	}
	
	/**
	* 付款凭证
	*@return 
	*/
	public String getPayingMoneyCertificate(){
		return  payingMoneyCertificate;
	}
	/**
	* 付款凭证
	*@param  payingMoneyCertificate
	*/
	public void setPayingMoneyCertificate(String payingMoneyCertificate ){
		this.payingMoneyCertificate = payingMoneyCertificate;
	}
	
	/**
	* 付款凭证说明
	*@return 
	*/
	public String getPayingMoneyCertificateExplain(){
		return  payingMoneyCertificateExplain;
	}
	/**
	* 付款凭证说明
	*@param  payingMoneyCertificateExplain
	*/
	public void setPayingMoneyCertificateExplain(String payingMoneyCertificateExplain ){
		this.payingMoneyCertificateExplain = payingMoneyCertificateExplain;
	}
	
	/**
	* 店铺分类名称
	*@return 
	*/
	public String getScName(){
		return  scName;
	}
	/**
	* 店铺分类名称
	*@param  scName
	*/
	public void setScName(String scName ){
		this.scName = scName;
	}
	
	/**
	* 卖家帐号
	*@return 
	*/
	public String getSellerName(){
		return  sellerName;
	}
	/**
	* 卖家帐号
	*@param  sellerName
	*/
	public void setSellerName(String sellerName ){
		this.sellerName = sellerName;
	}
	
	/**
	* 结算银行开户名
	*@return 
	*/
	public String getSettlementBankAccountName(){
		return  settlementBankAccountName;
	}
	/**
	* 结算银行开户名
	*@param  settlementBankAccountName
	*/
	public void setSettlementBankAccountName(String settlementBankAccountName ){
		this.settlementBankAccountName = settlementBankAccountName;
	}
	
	/**
	* 结算公司银行账号
	*@return 
	*/
	public String getSettlementBankAccountNumber(){
		return  settlementBankAccountNumber;
	}
	/**
	* 结算公司银行账号
	*@param  settlementBankAccountNumber
	*/
	public void setSettlementBankAccountNumber(String settlementBankAccountNumber ){
		this.settlementBankAccountNumber = settlementBankAccountNumber;
	}
	
	/**
	* 结算开户银行所在地
	*@return 
	*/
	public String getSettlementBankAddress(){
		return  settlementBankAddress;
	}
	/**
	* 结算开户银行所在地
	*@param  settlementBankAddress
	*/
	public void setSettlementBankAddress(String settlementBankAddress ){
		this.settlementBankAddress = settlementBankAddress;
	}
	
	/**
	* 结算支行联行号
	*@return 
	*/
	public String getSettlementBankCode(){
		return  settlementBankCode;
	}
	/**
	* 结算支行联行号
	*@param  settlementBankCode
	*/
	public void setSettlementBankCode(String settlementBankCode ){
		this.settlementBankCode = settlementBankCode;
	}
	
	/**
	* 结算开户银行支行名称
	*@return 
	*/
	public String getSettlementBankName(){
		return  settlementBankName;
	}
	/**
	* 结算开户银行支行名称
	*@param  settlementBankName
	*/
	public void setSettlementBankName(String settlementBankName ){
		this.settlementBankName = settlementBankName;
	}
	
	/**
	* 店铺等级下的收费等信息
	*@return 
	*/
	public String getSgInfo(){
		return  sgInfo;
	}
	/**
	* 店铺等级下的收费等信息
	*@param  sgInfo
	*/
	public void setSgInfo(String sgInfo ){
		this.sgInfo = sgInfo;
	}
	
	/**
	* 店铺等级名称
	*@return 
	*/
	public String getSgName(){
		return  sgName;
	}
	/**
	* 店铺等级名称
	*@param  sgName
	*/
	public void setSgName(String sgName ){
		this.sgName = sgName;
	}
	
	/**
	* 分类佣金比例
	*@return 
	*/
	public String getStoreClassCommisRates(){
		return  storeClassCommisRates;
	}
	/**
	* 分类佣金比例
	*@param  storeClassCommisRates
	*/
	public void setStoreClassCommisRates(String storeClassCommisRates ){
		this.storeClassCommisRates = storeClassCommisRates;
	}
	
	/**
	* 店铺分类编号集合
	*@return 
	*/
	public String getStoreClassIds(){
		return  storeClassIds;
	}
	/**
	* 店铺分类编号集合
	*@param  storeClassIds
	*/
	public void setStoreClassIds(String storeClassIds ){
		this.storeClassIds = storeClassIds;
	}
	
	/**
	* 店铺分类名称集合
	*@return 
	*/
	public String getStoreClassNames(){
		return  storeClassNames;
	}
	/**
	* 店铺分类名称集合
	*@param  storeClassNames
	*/
	public void setStoreClassNames(String storeClassNames ){
		this.storeClassNames = storeClassNames;
	}
	
	/**
	* 店铺名称
	*@return 
	*/
	public String getStoreName(){
		return  storeName;
	}
	/**
	* 店铺名称
	*@param  storeName
	*/
	public void setStoreName(String storeName ){
		this.storeName = storeName;
	}
	
	/**
	* 税务登记证号
	*@return 
	*/
	public String getTaxRegistrationCertificate(){
		return  taxRegistrationCertificate;
	}
	/**
	* 税务登记证号
	*@param  taxRegistrationCertificate
	*/
	public void setTaxRegistrationCertificate(String taxRegistrationCertificate ){
		this.taxRegistrationCertificate = taxRegistrationCertificate;
	}
	
	/**
	* 税务登记证号电子版
	*@return 
	*/
	public String getTaxRegistrationCertificateElectronic(){
		return  taxRegistrationCertificateElectronic;
	}
	/**
	* 税务登记证号电子版
	*@param  taxRegistrationCertificateElectronic
	*/
	public void setTaxRegistrationCertificateElectronic(String taxRegistrationCertificateElectronic ){
		this.taxRegistrationCertificateElectronic = taxRegistrationCertificateElectronic;
	}
	
	/**
	* 纳税人识别号
	*@return 
	*/
	public String getTaxpayerId(){
		return  taxpayerId;
	}
	/**
	* 纳税人识别号
	*@param  taxpayerId
	*/
	public void setTaxpayerId(String taxpayerId ){
		this.taxpayerId = taxpayerId;
	}
	
	/**
	* 营业执照有效期结束
	*@return 
	*/
	public Date getBusinessLicenceEnd(){
		return  businessLicenceEnd;
	}
	/**
	* 营业执照有效期结束
	*@param  businessLicenceEnd
	*/
	public void setBusinessLicenceEnd(Date businessLicenceEnd ){
		this.businessLicenceEnd = businessLicenceEnd;
	}
	
	/**
	* 营业执照有效期开始
	*@return 
	*/
	public Date getBusinessLicenceStart(){
		return  businessLicenceStart;
	}
	/**
	* 营业执照有效期开始
	*@param  businessLicenceStart
	*/
	public void setBusinessLicenceStart(Date businessLicenceStart ){
		this.businessLicenceStart = businessLicenceStart;
	}
	

}
