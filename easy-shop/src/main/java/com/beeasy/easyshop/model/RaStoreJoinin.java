package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_store_joinin")
public class RaStoreJoinin   {
	
	// alias
	public static final String ALIAS_member_id = "member_id";
	public static final String ALIAS_company_employee_count = "company_employee_count";
	public static final String ALIAS_company_province_id = "company_province_id";
	public static final String ALIAS_company_registered_capital = "company_registered_capital";
	public static final String ALIAS_is_settlement_account = "is_settlement_account";
	public static final String ALIAS_is_whole = "is_whole";
	public static final String ALIAS_joinin_year = "joinin_year";
	public static final String ALIAS_jp_alt_merchant_type = "jp_alt_merchant_type";
	public static final String ALIAS_jp_bank_account_type = "jp_bank_account_type";
	public static final String ALIAS_jp_risk_day = "jp_risk_day";
	public static final String ALIAS_jp_sett_date_type = "jp_sett_date_type";
	public static final String ALIAS_jp_sett_mode = "jp_sett_mode";
	public static final String ALIAS_sc_bail = "sc_bail";
	public static final String ALIAS_sc_id = "sc_id";
	public static final String ALIAS_sg_id = "sg_id";
	public static final String ALIAS_bank_account_name = "bank_account_name";
	public static final String ALIAS_bank_account_number = "bank_account_number";
	public static final String ALIAS_bank_address = "bank_address";
	public static final String ALIAS_bank_code = "bank_code";
	public static final String ALIAS_bank_licence_electronic = "bank_licence_electronic";
	public static final String ALIAS_bank_name = "bank_name";
	public static final String ALIAS_business_licence_address = "business_licence_address";
	public static final String ALIAS_business_licence_number = "business_licence_number";
	public static final String ALIAS_business_licence_number_electronic = "business_licence_number_electronic";
	public static final String ALIAS_business_sphere = "business_sphere";
	public static final String ALIAS_company_address = "company_address";
	public static final String ALIAS_company_address_detail = "company_address_detail";
	public static final String ALIAS_company_name = "company_name";
	public static final String ALIAS_company_phone = "company_phone";
	public static final String ALIAS_contacts_email = "contacts_email";
	public static final String ALIAS_contacts_name = "contacts_name";
	public static final String ALIAS_contacts_phone = "contacts_phone";
	public static final String ALIAS_ebcCode = "ebcCode";
	public static final String ALIAS_ebcName = "ebcName";
	public static final String ALIAS_general_taxpayer = "general_taxpayer";
	public static final String ALIAS_joinin_message = "joinin_message";
	public static final String ALIAS_joinin_state = "joinin_state";
	public static final String ALIAS_jp_alt_mch_name = "jp_alt_mch_name";
	public static final String ALIAS_jp_alt_mch_no = "jp_alt_mch_no";
	public static final String ALIAS_jp_bank_account_name = "jp_bank_account_name";
	public static final String ALIAS_jp_bank_account_no = "jp_bank_account_no";
	public static final String ALIAS_jp_busi_contact_mobile_no = "jp_busi_contact_mobile_no";
	public static final String ALIAS_jp_busi_contact_name = "jp_busi_contact_name";
	public static final String ALIAS_jp_id_card_no = "jp_id_card_no";
	public static final String ALIAS_jp_legal_person = "jp_legal_person";
	public static final String ALIAS_jp_login_name = "jp_login_name";
	public static final String ALIAS_jp_phone_no = "jp_phone_no";
	public static final String ALIAS_member_name = "member_name";
	public static final String ALIAS_organization_code = "organization_code";
	public static final String ALIAS_organization_code_electronic = "organization_code_electronic";
	public static final String ALIAS_paying_amount = "paying_amount";
	public static final String ALIAS_paying_money_certificate = "paying_money_certificate";
	public static final String ALIAS_paying_money_certificate_explain = "paying_money_certificate_explain";
	public static final String ALIAS_sc_name = "sc_name";
	public static final String ALIAS_seller_name = "seller_name";
	public static final String ALIAS_settlement_bank_account_name = "settlement_bank_account_name";
	public static final String ALIAS_settlement_bank_account_number = "settlement_bank_account_number";
	public static final String ALIAS_settlement_bank_address = "settlement_bank_address";
	public static final String ALIAS_settlement_bank_code = "settlement_bank_code";
	public static final String ALIAS_settlement_bank_name = "settlement_bank_name";
	public static final String ALIAS_sg_info = "sg_info";
	public static final String ALIAS_sg_name = "sg_name";
	public static final String ALIAS_store_class_commis_rates = "store_class_commis_rates";
	public static final String ALIAS_store_class_ids = "store_class_ids";
	public static final String ALIAS_store_class_names = "store_class_names";
	public static final String ALIAS_store_name = "store_name";
	public static final String ALIAS_tax_registration_certificate = "tax_registration_certificate";
	public static final String ALIAS_tax_registration_certificate_electronic = "tax_registration_certificate_electronic";
	public static final String ALIAS_taxpayer_id = "taxpayer_id";
	public static final String ALIAS_business_licence_end = "business_licence_end";
	public static final String ALIAS_business_licence_start = "business_licence_start";
	
	/*
	用户编号
	*/
	private Integer member_id ;
	/*
	员工总数
	*/
	private Integer company_employee_count ;
	/*
	所在地省ID
	*/
	private Integer company_province_id ;
	/*
	注册资金
	*/
	private Integer company_registered_capital ;
	/*
	开户行账号是否为结算账号 1-开户行就是结算账号 2-独立的计算账号
	*/
	private Integer is_settlement_account ;
	private Integer is_whole ;
	/*
	开店时长(年)
	*/
	private Integer joinin_year ;
	/*
	分账方商户类型10:个人，11：个体工商户，12：企业
	*/
	private Integer jp_alt_merchant_type ;
	/*
	账户类型值为：1 借记卡，4 对公账户
	*/
	private Integer jp_bank_account_type ;
	/*
	结算周期
	*/
	private Integer jp_risk_day ;
	/*
	结算周期类型，值为：1 工作日，2 自然日，3 月结日
	*/
	private Integer jp_sett_date_type ;
	/*
	值为： 1 由汇聚自动结算;2 由商户平台手工结算（结算接口）
	*/
	private Integer jp_sett_mode ;
	/*
	店铺分类保证金
	*/
	private Integer sc_bail ;
	/*
	店铺分类编号
	*/
	private Integer sc_id ;
	/*
	店铺等级编号
	*/
	private Integer sg_id ;
	/*
	银行开户名
	*/
	private String bank_account_name ;
	/*
	公司银行账号
	*/
	private String bank_account_number ;
	/*
	开户银行所在地
	*/
	private String bank_address ;
	/*
	支行联行号
	*/
	private String bank_code ;
	/*
	开户银行许可证电子版
	*/
	private String bank_licence_electronic ;
	/*
	开户银行支行名称
	*/
	private String bank_name ;
	/*
	营业执所在地
	*/
	private String business_licence_address ;
	/*
	营业执照号
	*/
	private String business_licence_number ;
	/*
	营业执照电子版
	*/
	private String business_licence_number_electronic ;
	/*
	法定经营范围
	*/
	private String business_sphere ;
	/*
	公司地址
	*/
	private String company_address ;
	/*
	公司详细地址
	*/
	private String company_address_detail ;
	/*
	公司名称
	*/
	private String company_name ;
	/*
	公司电话
	*/
	private String company_phone ;
	/*
	联系人邮箱
	*/
	private String contacts_email ;
	/*
	联系人姓名
	*/
	private String contacts_name ;
	/*
	联系人电话
	*/
	private String contacts_phone ;
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
	private String general_taxpayer ;
	/*
	管理员审核信息
	*/
	private String joinin_message ;
	/*
	申请状态 10-已提交申请 11-缴费完成  20-审核成功 30-审核失败 31-缴费审核失败 40-审核通过开店
	*/
	private String joinin_state ;
	/*
	分账方名称
	*/
	private String jp_alt_mch_name ;
	/*
	分账账号商家号
	*/
	private String jp_alt_mch_no ;
	/*
	银行账户名称 分账方结算银行账户名称
	*/
	private String jp_bank_account_name ;
	/*
	银行账号 分账方结算银行账号
	*/
	private String jp_bank_account_no ;
	/*
	业务联系人手机
	*/
	private String jp_busi_contact_mobile_no ;
	/*
	业务联系人姓名
	*/
	private String jp_busi_contact_name ;
	/*
	身份证号
	*/
	private String jp_id_card_no ;
	/*
	法人姓名
	*/
	private String jp_legal_person ;
	/*
	分账方登录名，即邮箱
	*/
	private String jp_login_name ;
	/*
	法人的手机号
	*/
	private String jp_phone_no ;
	/*
	店主用户名
	*/
	private String member_name ;
	/*
	组织机构代码
	*/
	private String organization_code ;
	/*
	组织机构代码电子版
	*/
	private String organization_code_electronic ;
	/*
	付款金额
	*/
	private BigDecimal paying_amount ;
	/*
	付款凭证
	*/
	private String paying_money_certificate ;
	/*
	付款凭证说明
	*/
	private String paying_money_certificate_explain ;
	/*
	店铺分类名称
	*/
	private String sc_name ;
	/*
	卖家帐号
	*/
	private String seller_name ;
	/*
	结算银行开户名
	*/
	private String settlement_bank_account_name ;
	/*
	结算公司银行账号
	*/
	private String settlement_bank_account_number ;
	/*
	结算开户银行所在地
	*/
	private String settlement_bank_address ;
	/*
	结算支行联行号
	*/
	private String settlement_bank_code ;
	/*
	结算开户银行支行名称
	*/
	private String settlement_bank_name ;
	/*
	店铺等级下的收费等信息
	*/
	private String sg_info ;
	/*
	店铺等级名称
	*/
	private String sg_name ;
	/*
	分类佣金比例
	*/
	private String store_class_commis_rates ;
	/*
	店铺分类编号集合
	*/
	private String store_class_ids ;
	/*
	店铺分类名称集合
	*/
	private String store_class_names ;
	/*
	店铺名称
	*/
	private String store_name ;
	/*
	税务登记证号
	*/
	private String tax_registration_certificate ;
	/*
	税务登记证号电子版
	*/
	private String tax_registration_certificate_electronic ;
	/*
	纳税人识别号
	*/
	private String taxpayer_id ;
	/*
	营业执照有效期结束
	*/
	private Date business_licence_end ;
	/*
	营业执照有效期开始
	*/
	private Date business_licence_start ;
	
	public RaStoreJoinin() {
	}
	
	/**
	* 用户编号
	*@return 
	*/
	public Integer getMember_id(){
		return  member_id;
	}
	/**
	* 用户编号
	*@param  member_id
	*/
	public void setMember_id(Integer member_id ){
		this.member_id = member_id;
	}
	
	/**
	* 员工总数
	*@return 
	*/
	public Integer getCompany_employee_count(){
		return  company_employee_count;
	}
	/**
	* 员工总数
	*@param  company_employee_count
	*/
	public void setCompany_employee_count(Integer company_employee_count ){
		this.company_employee_count = company_employee_count;
	}
	
	/**
	* 所在地省ID
	*@return 
	*/
	public Integer getCompany_province_id(){
		return  company_province_id;
	}
	/**
	* 所在地省ID
	*@param  company_province_id
	*/
	public void setCompany_province_id(Integer company_province_id ){
		this.company_province_id = company_province_id;
	}
	
	/**
	* 注册资金
	*@return 
	*/
	public Integer getCompany_registered_capital(){
		return  company_registered_capital;
	}
	/**
	* 注册资金
	*@param  company_registered_capital
	*/
	public void setCompany_registered_capital(Integer company_registered_capital ){
		this.company_registered_capital = company_registered_capital;
	}
	
	/**
	* 开户行账号是否为结算账号 1-开户行就是结算账号 2-独立的计算账号
	*@return 
	*/
	public Integer getIs_settlement_account(){
		return  is_settlement_account;
	}
	/**
	* 开户行账号是否为结算账号 1-开户行就是结算账号 2-独立的计算账号
	*@param  is_settlement_account
	*/
	public void setIs_settlement_account(Integer is_settlement_account ){
		this.is_settlement_account = is_settlement_account;
	}
	
	public Integer getIs_whole(){
		return  is_whole;
	}
	public void setIs_whole(Integer is_whole ){
		this.is_whole = is_whole;
	}
	
	/**
	* 开店时长(年)
	*@return 
	*/
	public Integer getJoinin_year(){
		return  joinin_year;
	}
	/**
	* 开店时长(年)
	*@param  joinin_year
	*/
	public void setJoinin_year(Integer joinin_year ){
		this.joinin_year = joinin_year;
	}
	
	/**
	* 分账方商户类型10:个人，11：个体工商户，12：企业
	*@return 
	*/
	public Integer getJp_alt_merchant_type(){
		return  jp_alt_merchant_type;
	}
	/**
	* 分账方商户类型10:个人，11：个体工商户，12：企业
	*@param  jp_alt_merchant_type
	*/
	public void setJp_alt_merchant_type(Integer jp_alt_merchant_type ){
		this.jp_alt_merchant_type = jp_alt_merchant_type;
	}
	
	/**
	* 账户类型值为：1 借记卡，4 对公账户
	*@return 
	*/
	public Integer getJp_bank_account_type(){
		return  jp_bank_account_type;
	}
	/**
	* 账户类型值为：1 借记卡，4 对公账户
	*@param  jp_bank_account_type
	*/
	public void setJp_bank_account_type(Integer jp_bank_account_type ){
		this.jp_bank_account_type = jp_bank_account_type;
	}
	
	/**
	* 结算周期
	*@return 
	*/
	public Integer getJp_risk_day(){
		return  jp_risk_day;
	}
	/**
	* 结算周期
	*@param  jp_risk_day
	*/
	public void setJp_risk_day(Integer jp_risk_day ){
		this.jp_risk_day = jp_risk_day;
	}
	
	/**
	* 结算周期类型，值为：1 工作日，2 自然日，3 月结日
	*@return 
	*/
	public Integer getJp_sett_date_type(){
		return  jp_sett_date_type;
	}
	/**
	* 结算周期类型，值为：1 工作日，2 自然日，3 月结日
	*@param  jp_sett_date_type
	*/
	public void setJp_sett_date_type(Integer jp_sett_date_type ){
		this.jp_sett_date_type = jp_sett_date_type;
	}
	
	/**
	* 值为： 1 由汇聚自动结算;2 由商户平台手工结算（结算接口）
	*@return 
	*/
	public Integer getJp_sett_mode(){
		return  jp_sett_mode;
	}
	/**
	* 值为： 1 由汇聚自动结算;2 由商户平台手工结算（结算接口）
	*@param  jp_sett_mode
	*/
	public void setJp_sett_mode(Integer jp_sett_mode ){
		this.jp_sett_mode = jp_sett_mode;
	}
	
	/**
	* 店铺分类保证金
	*@return 
	*/
	public Integer getSc_bail(){
		return  sc_bail;
	}
	/**
	* 店铺分类保证金
	*@param  sc_bail
	*/
	public void setSc_bail(Integer sc_bail ){
		this.sc_bail = sc_bail;
	}
	
	/**
	* 店铺分类编号
	*@return 
	*/
	public Integer getSc_id(){
		return  sc_id;
	}
	/**
	* 店铺分类编号
	*@param  sc_id
	*/
	public void setSc_id(Integer sc_id ){
		this.sc_id = sc_id;
	}
	
	/**
	* 店铺等级编号
	*@return 
	*/
	public Integer getSg_id(){
		return  sg_id;
	}
	/**
	* 店铺等级编号
	*@param  sg_id
	*/
	public void setSg_id(Integer sg_id ){
		this.sg_id = sg_id;
	}
	
	/**
	* 银行开户名
	*@return 
	*/
	public String getBank_account_name(){
		return  bank_account_name;
	}
	/**
	* 银行开户名
	*@param  bank_account_name
	*/
	public void setBank_account_name(String bank_account_name ){
		this.bank_account_name = bank_account_name;
	}
	
	/**
	* 公司银行账号
	*@return 
	*/
	public String getBank_account_number(){
		return  bank_account_number;
	}
	/**
	* 公司银行账号
	*@param  bank_account_number
	*/
	public void setBank_account_number(String bank_account_number ){
		this.bank_account_number = bank_account_number;
	}
	
	/**
	* 开户银行所在地
	*@return 
	*/
	public String getBank_address(){
		return  bank_address;
	}
	/**
	* 开户银行所在地
	*@param  bank_address
	*/
	public void setBank_address(String bank_address ){
		this.bank_address = bank_address;
	}
	
	/**
	* 支行联行号
	*@return 
	*/
	public String getBank_code(){
		return  bank_code;
	}
	/**
	* 支行联行号
	*@param  bank_code
	*/
	public void setBank_code(String bank_code ){
		this.bank_code = bank_code;
	}
	
	/**
	* 开户银行许可证电子版
	*@return 
	*/
	public String getBank_licence_electronic(){
		return  bank_licence_electronic;
	}
	/**
	* 开户银行许可证电子版
	*@param  bank_licence_electronic
	*/
	public void setBank_licence_electronic(String bank_licence_electronic ){
		this.bank_licence_electronic = bank_licence_electronic;
	}
	
	/**
	* 开户银行支行名称
	*@return 
	*/
	public String getBank_name(){
		return  bank_name;
	}
	/**
	* 开户银行支行名称
	*@param  bank_name
	*/
	public void setBank_name(String bank_name ){
		this.bank_name = bank_name;
	}
	
	/**
	* 营业执所在地
	*@return 
	*/
	public String getBusiness_licence_address(){
		return  business_licence_address;
	}
	/**
	* 营业执所在地
	*@param  business_licence_address
	*/
	public void setBusiness_licence_address(String business_licence_address ){
		this.business_licence_address = business_licence_address;
	}
	
	/**
	* 营业执照号
	*@return 
	*/
	public String getBusiness_licence_number(){
		return  business_licence_number;
	}
	/**
	* 营业执照号
	*@param  business_licence_number
	*/
	public void setBusiness_licence_number(String business_licence_number ){
		this.business_licence_number = business_licence_number;
	}
	
	/**
	* 营业执照电子版
	*@return 
	*/
	public String getBusiness_licence_number_electronic(){
		return  business_licence_number_electronic;
	}
	/**
	* 营业执照电子版
	*@param  business_licence_number_electronic
	*/
	public void setBusiness_licence_number_electronic(String business_licence_number_electronic ){
		this.business_licence_number_electronic = business_licence_number_electronic;
	}
	
	/**
	* 法定经营范围
	*@return 
	*/
	public String getBusiness_sphere(){
		return  business_sphere;
	}
	/**
	* 法定经营范围
	*@param  business_sphere
	*/
	public void setBusiness_sphere(String business_sphere ){
		this.business_sphere = business_sphere;
	}
	
	/**
	* 公司地址
	*@return 
	*/
	public String getCompany_address(){
		return  company_address;
	}
	/**
	* 公司地址
	*@param  company_address
	*/
	public void setCompany_address(String company_address ){
		this.company_address = company_address;
	}
	
	/**
	* 公司详细地址
	*@return 
	*/
	public String getCompany_address_detail(){
		return  company_address_detail;
	}
	/**
	* 公司详细地址
	*@param  company_address_detail
	*/
	public void setCompany_address_detail(String company_address_detail ){
		this.company_address_detail = company_address_detail;
	}
	
	/**
	* 公司名称
	*@return 
	*/
	public String getCompany_name(){
		return  company_name;
	}
	/**
	* 公司名称
	*@param  company_name
	*/
	public void setCompany_name(String company_name ){
		this.company_name = company_name;
	}
	
	/**
	* 公司电话
	*@return 
	*/
	public String getCompany_phone(){
		return  company_phone;
	}
	/**
	* 公司电话
	*@param  company_phone
	*/
	public void setCompany_phone(String company_phone ){
		this.company_phone = company_phone;
	}
	
	/**
	* 联系人邮箱
	*@return 
	*/
	public String getContacts_email(){
		return  contacts_email;
	}
	/**
	* 联系人邮箱
	*@param  contacts_email
	*/
	public void setContacts_email(String contacts_email ){
		this.contacts_email = contacts_email;
	}
	
	/**
	* 联系人姓名
	*@return 
	*/
	public String getContacts_name(){
		return  contacts_name;
	}
	/**
	* 联系人姓名
	*@param  contacts_name
	*/
	public void setContacts_name(String contacts_name ){
		this.contacts_name = contacts_name;
	}
	
	/**
	* 联系人电话
	*@return 
	*/
	public String getContacts_phone(){
		return  contacts_phone;
	}
	/**
	* 联系人电话
	*@param  contacts_phone
	*/
	public void setContacts_phone(String contacts_phone ){
		this.contacts_phone = contacts_phone;
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
	public String getGeneral_taxpayer(){
		return  general_taxpayer;
	}
	/**
	* 一般纳税人证明
	*@param  general_taxpayer
	*/
	public void setGeneral_taxpayer(String general_taxpayer ){
		this.general_taxpayer = general_taxpayer;
	}
	
	/**
	* 管理员审核信息
	*@return 
	*/
	public String getJoinin_message(){
		return  joinin_message;
	}
	/**
	* 管理员审核信息
	*@param  joinin_message
	*/
	public void setJoinin_message(String joinin_message ){
		this.joinin_message = joinin_message;
	}
	
	/**
	* 申请状态 10-已提交申请 11-缴费完成  20-审核成功 30-审核失败 31-缴费审核失败 40-审核通过开店
	*@return 
	*/
	public String getJoinin_state(){
		return  joinin_state;
	}
	/**
	* 申请状态 10-已提交申请 11-缴费完成  20-审核成功 30-审核失败 31-缴费审核失败 40-审核通过开店
	*@param  joinin_state
	*/
	public void setJoinin_state(String joinin_state ){
		this.joinin_state = joinin_state;
	}
	
	/**
	* 分账方名称
	*@return 
	*/
	public String getJp_alt_mch_name(){
		return  jp_alt_mch_name;
	}
	/**
	* 分账方名称
	*@param  jp_alt_mch_name
	*/
	public void setJp_alt_mch_name(String jp_alt_mch_name ){
		this.jp_alt_mch_name = jp_alt_mch_name;
	}
	
	/**
	* 分账账号商家号
	*@return 
	*/
	public String getJp_alt_mch_no(){
		return  jp_alt_mch_no;
	}
	/**
	* 分账账号商家号
	*@param  jp_alt_mch_no
	*/
	public void setJp_alt_mch_no(String jp_alt_mch_no ){
		this.jp_alt_mch_no = jp_alt_mch_no;
	}
	
	/**
	* 银行账户名称 分账方结算银行账户名称
	*@return 
	*/
	public String getJp_bank_account_name(){
		return  jp_bank_account_name;
	}
	/**
	* 银行账户名称 分账方结算银行账户名称
	*@param  jp_bank_account_name
	*/
	public void setJp_bank_account_name(String jp_bank_account_name ){
		this.jp_bank_account_name = jp_bank_account_name;
	}
	
	/**
	* 银行账号 分账方结算银行账号
	*@return 
	*/
	public String getJp_bank_account_no(){
		return  jp_bank_account_no;
	}
	/**
	* 银行账号 分账方结算银行账号
	*@param  jp_bank_account_no
	*/
	public void setJp_bank_account_no(String jp_bank_account_no ){
		this.jp_bank_account_no = jp_bank_account_no;
	}
	
	/**
	* 业务联系人手机
	*@return 
	*/
	public String getJp_busi_contact_mobile_no(){
		return  jp_busi_contact_mobile_no;
	}
	/**
	* 业务联系人手机
	*@param  jp_busi_contact_mobile_no
	*/
	public void setJp_busi_contact_mobile_no(String jp_busi_contact_mobile_no ){
		this.jp_busi_contact_mobile_no = jp_busi_contact_mobile_no;
	}
	
	/**
	* 业务联系人姓名
	*@return 
	*/
	public String getJp_busi_contact_name(){
		return  jp_busi_contact_name;
	}
	/**
	* 业务联系人姓名
	*@param  jp_busi_contact_name
	*/
	public void setJp_busi_contact_name(String jp_busi_contact_name ){
		this.jp_busi_contact_name = jp_busi_contact_name;
	}
	
	/**
	* 身份证号
	*@return 
	*/
	public String getJp_id_card_no(){
		return  jp_id_card_no;
	}
	/**
	* 身份证号
	*@param  jp_id_card_no
	*/
	public void setJp_id_card_no(String jp_id_card_no ){
		this.jp_id_card_no = jp_id_card_no;
	}
	
	/**
	* 法人姓名
	*@return 
	*/
	public String getJp_legal_person(){
		return  jp_legal_person;
	}
	/**
	* 法人姓名
	*@param  jp_legal_person
	*/
	public void setJp_legal_person(String jp_legal_person ){
		this.jp_legal_person = jp_legal_person;
	}
	
	/**
	* 分账方登录名，即邮箱
	*@return 
	*/
	public String getJp_login_name(){
		return  jp_login_name;
	}
	/**
	* 分账方登录名，即邮箱
	*@param  jp_login_name
	*/
	public void setJp_login_name(String jp_login_name ){
		this.jp_login_name = jp_login_name;
	}
	
	/**
	* 法人的手机号
	*@return 
	*/
	public String getJp_phone_no(){
		return  jp_phone_no;
	}
	/**
	* 法人的手机号
	*@param  jp_phone_no
	*/
	public void setJp_phone_no(String jp_phone_no ){
		this.jp_phone_no = jp_phone_no;
	}
	
	/**
	* 店主用户名
	*@return 
	*/
	public String getMember_name(){
		return  member_name;
	}
	/**
	* 店主用户名
	*@param  member_name
	*/
	public void setMember_name(String member_name ){
		this.member_name = member_name;
	}
	
	/**
	* 组织机构代码
	*@return 
	*/
	public String getOrganization_code(){
		return  organization_code;
	}
	/**
	* 组织机构代码
	*@param  organization_code
	*/
	public void setOrganization_code(String organization_code ){
		this.organization_code = organization_code;
	}
	
	/**
	* 组织机构代码电子版
	*@return 
	*/
	public String getOrganization_code_electronic(){
		return  organization_code_electronic;
	}
	/**
	* 组织机构代码电子版
	*@param  organization_code_electronic
	*/
	public void setOrganization_code_electronic(String organization_code_electronic ){
		this.organization_code_electronic = organization_code_electronic;
	}
	
	/**
	* 付款金额
	*@return 
	*/
	public BigDecimal getPaying_amount(){
		return  paying_amount;
	}
	/**
	* 付款金额
	*@param  paying_amount
	*/
	public void setPaying_amount(BigDecimal paying_amount ){
		this.paying_amount = paying_amount;
	}
	
	/**
	* 付款凭证
	*@return 
	*/
	public String getPaying_money_certificate(){
		return  paying_money_certificate;
	}
	/**
	* 付款凭证
	*@param  paying_money_certificate
	*/
	public void setPaying_money_certificate(String paying_money_certificate ){
		this.paying_money_certificate = paying_money_certificate;
	}
	
	/**
	* 付款凭证说明
	*@return 
	*/
	public String getPaying_money_certificate_explain(){
		return  paying_money_certificate_explain;
	}
	/**
	* 付款凭证说明
	*@param  paying_money_certificate_explain
	*/
	public void setPaying_money_certificate_explain(String paying_money_certificate_explain ){
		this.paying_money_certificate_explain = paying_money_certificate_explain;
	}
	
	/**
	* 店铺分类名称
	*@return 
	*/
	public String getSc_name(){
		return  sc_name;
	}
	/**
	* 店铺分类名称
	*@param  sc_name
	*/
	public void setSc_name(String sc_name ){
		this.sc_name = sc_name;
	}
	
	/**
	* 卖家帐号
	*@return 
	*/
	public String getSeller_name(){
		return  seller_name;
	}
	/**
	* 卖家帐号
	*@param  seller_name
	*/
	public void setSeller_name(String seller_name ){
		this.seller_name = seller_name;
	}
	
	/**
	* 结算银行开户名
	*@return 
	*/
	public String getSettlement_bank_account_name(){
		return  settlement_bank_account_name;
	}
	/**
	* 结算银行开户名
	*@param  settlement_bank_account_name
	*/
	public void setSettlement_bank_account_name(String settlement_bank_account_name ){
		this.settlement_bank_account_name = settlement_bank_account_name;
	}
	
	/**
	* 结算公司银行账号
	*@return 
	*/
	public String getSettlement_bank_account_number(){
		return  settlement_bank_account_number;
	}
	/**
	* 结算公司银行账号
	*@param  settlement_bank_account_number
	*/
	public void setSettlement_bank_account_number(String settlement_bank_account_number ){
		this.settlement_bank_account_number = settlement_bank_account_number;
	}
	
	/**
	* 结算开户银行所在地
	*@return 
	*/
	public String getSettlement_bank_address(){
		return  settlement_bank_address;
	}
	/**
	* 结算开户银行所在地
	*@param  settlement_bank_address
	*/
	public void setSettlement_bank_address(String settlement_bank_address ){
		this.settlement_bank_address = settlement_bank_address;
	}
	
	/**
	* 结算支行联行号
	*@return 
	*/
	public String getSettlement_bank_code(){
		return  settlement_bank_code;
	}
	/**
	* 结算支行联行号
	*@param  settlement_bank_code
	*/
	public void setSettlement_bank_code(String settlement_bank_code ){
		this.settlement_bank_code = settlement_bank_code;
	}
	
	/**
	* 结算开户银行支行名称
	*@return 
	*/
	public String getSettlement_bank_name(){
		return  settlement_bank_name;
	}
	/**
	* 结算开户银行支行名称
	*@param  settlement_bank_name
	*/
	public void setSettlement_bank_name(String settlement_bank_name ){
		this.settlement_bank_name = settlement_bank_name;
	}
	
	/**
	* 店铺等级下的收费等信息
	*@return 
	*/
	public String getSg_info(){
		return  sg_info;
	}
	/**
	* 店铺等级下的收费等信息
	*@param  sg_info
	*/
	public void setSg_info(String sg_info ){
		this.sg_info = sg_info;
	}
	
	/**
	* 店铺等级名称
	*@return 
	*/
	public String getSg_name(){
		return  sg_name;
	}
	/**
	* 店铺等级名称
	*@param  sg_name
	*/
	public void setSg_name(String sg_name ){
		this.sg_name = sg_name;
	}
	
	/**
	* 分类佣金比例
	*@return 
	*/
	public String getStore_class_commis_rates(){
		return  store_class_commis_rates;
	}
	/**
	* 分类佣金比例
	*@param  store_class_commis_rates
	*/
	public void setStore_class_commis_rates(String store_class_commis_rates ){
		this.store_class_commis_rates = store_class_commis_rates;
	}
	
	/**
	* 店铺分类编号集合
	*@return 
	*/
	public String getStore_class_ids(){
		return  store_class_ids;
	}
	/**
	* 店铺分类编号集合
	*@param  store_class_ids
	*/
	public void setStore_class_ids(String store_class_ids ){
		this.store_class_ids = store_class_ids;
	}
	
	/**
	* 店铺分类名称集合
	*@return 
	*/
	public String getStore_class_names(){
		return  store_class_names;
	}
	/**
	* 店铺分类名称集合
	*@param  store_class_names
	*/
	public void setStore_class_names(String store_class_names ){
		this.store_class_names = store_class_names;
	}
	
	/**
	* 店铺名称
	*@return 
	*/
	public String getStore_name(){
		return  store_name;
	}
	/**
	* 店铺名称
	*@param  store_name
	*/
	public void setStore_name(String store_name ){
		this.store_name = store_name;
	}
	
	/**
	* 税务登记证号
	*@return 
	*/
	public String getTax_registration_certificate(){
		return  tax_registration_certificate;
	}
	/**
	* 税务登记证号
	*@param  tax_registration_certificate
	*/
	public void setTax_registration_certificate(String tax_registration_certificate ){
		this.tax_registration_certificate = tax_registration_certificate;
	}
	
	/**
	* 税务登记证号电子版
	*@return 
	*/
	public String getTax_registration_certificate_electronic(){
		return  tax_registration_certificate_electronic;
	}
	/**
	* 税务登记证号电子版
	*@param  tax_registration_certificate_electronic
	*/
	public void setTax_registration_certificate_electronic(String tax_registration_certificate_electronic ){
		this.tax_registration_certificate_electronic = tax_registration_certificate_electronic;
	}
	
	/**
	* 纳税人识别号
	*@return 
	*/
	public String getTaxpayer_id(){
		return  taxpayer_id;
	}
	/**
	* 纳税人识别号
	*@param  taxpayer_id
	*/
	public void setTaxpayer_id(String taxpayer_id ){
		this.taxpayer_id = taxpayer_id;
	}
	
	/**
	* 营业执照有效期结束
	*@return 
	*/
	public Date getBusiness_licence_end(){
		return  business_licence_end;
	}
	/**
	* 营业执照有效期结束
	*@param  business_licence_end
	*/
	public void setBusiness_licence_end(Date business_licence_end ){
		this.business_licence_end = business_licence_end;
	}
	
	/**
	* 营业执照有效期开始
	*@return 
	*/
	public Date getBusiness_licence_start(){
		return  business_licence_start;
	}
	/**
	* 营业执照有效期开始
	*@param  business_licence_start
	*/
	public void setBusiness_licence_start(Date business_licence_start ){
		this.business_licence_start = business_licence_start;
	}
	

}
