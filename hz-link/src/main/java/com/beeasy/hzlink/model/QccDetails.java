package com.beeasy.hzlink.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-06-05
*/
@Table(name="QCC_DETAILS")
public class QccDetails   {
	
	// alias
	public static final String ALIAS_INNER_ID = "INNER_ID";
	public static final String ALIAS_ADDRESS = "ADDRESS";
	public static final String ALIAS_BELONG_ORG = "BELONG_ORG";
	public static final String ALIAS_CREDIT_CODE = "CREDIT_CODE";
	public static final String ALIAS_ECON_KIND = "ECON_KIND";
	public static final String ALIAS_IMAGE_URL = "IMAGE_URL";
	public static final String ALIAS_INNER_COMPANY_CODE = "INNER_COMPANY_CODE";
	public static final String ALIAS_INNER_COMPANY_ID = "INNER_COMPANY_ID";
	public static final String ALIAS_INNER_COMPANY_NAME = "INNER_COMPANY_NAME";
	public static final String ALIAS_INNER_COMPANY_NO = "INNER_COMPANY_NO";
	public static final String ALIAS_IS_ON_STOCK = "IS_ON_STOCK";
	public static final String ALIAS_KEY_NO = "KEY_NO";
	public static final String ALIAS_NAME = "NAME";
	public static final String ALIAS_NO = "NO";
	public static final String ALIAS_OPER_NAME = "OPER_NAME";
	public static final String ALIAS_ORG_NO = "ORG_NO";
	public static final String ALIAS_PROVINCE = "PROVINCE";
	public static final String ALIAS_PROVINCE_CODE = "PROVINCE_CODE";
	public static final String ALIAS_REGIST_CAPI = "REGIST_CAPI";
	public static final String ALIAS_REGIST_CAPI_UNIT = "REGIST_CAPI_UNIT";
	public static final String ALIAS_SCOPE = "SCOPE";
	public static final String ALIAS_STATUS = "STATUS";
	public static final String ALIAS_STOCK_NUMBER = "STOCK_NUMBER";
	public static final String ALIAS_STOCK_TYPE = "STOCK_TYPE";
	public static final String ALIAS_CHECK_DATE = "CHECK_DATE";
	public static final String ALIAS_END_DATE = "END_DATE";
	public static final String ALIAS_INPUT_DATE = "INPUT_DATE";
	public static final String ALIAS_START_DATE = "START_DATE";
	public static final String ALIAS_TEAM_END = "TEAM_END";
	public static final String ALIAS_TERM_START = "TERM_START";
	public static final String ALIAS_UPDATED_DATE = "UPDATED_DATE";
	
	/*
	内部ID
	*/
	private String inner_id ;
	/*
	地址
	*/
	private String address ;
	/*
	登记机关
	*/
	private String belong_org ;
	/*
	统一社会信用代码
	*/
	private String credit_code ;
	/*
	类型
	*/
	private String econ_kind ;
	/*
	Logo地址
	*/
	private String image_url ;
	/*
	统一社会信用代码
	*/
	private String inner_company_code ;
	/*
	公司KeyNo
	*/
	private String inner_company_id ;
	/*
	公司名称
	*/
	private String inner_company_name ;
	/*
	注册号
	*/
	private String inner_company_no ;
	/*
	是否上市
	*/
	private String is_on_stock ;
	/*
	内部KeyNo
	*/
	private String key_no ;
	/*
	名称
	*/
	private String name ;
	/*
	注册号
	*/
	private String no ;
	/*
	法人
	*/
	private String oper_name ;
	/*
	组织机构代码
	*/
	private String org_no ;
	/*
	省份
	*/
	private String province ;
	/*
	省份代码
	*/
	private String province_code ;
	/*
	注册资本(金额)
	*/
	private String regist_capi ;
	/*
	注册资本(币种)
	*/
	private String regist_capi_unit ;
	/*
	营业范围
	*/
	private String scope ;
	/*
	状态
	*/
	private String status ;
	/*
	证券号
	*/
	private String stock_number ;
	/*
	证券类型
	*/
	private String stock_type ;
	/*
	发照日期
	*/
	private Date check_date ;
	/*
	吊销日期
	*/
	private Date end_date ;
	/*
	入库时间
	*/
	private Date input_date ;
	/*
	成立日期
	*/
	private Date start_date ;
	/*
	营业期限至
	*/
	private Date team_end ;
	/*
	营业期限始
	*/
	private Date term_start ;
	/*
	更新日期
	*/
	private Date updated_date ;
	
	public QccDetails() {
	}
	
	/**
	* 内部ID
	*@return 
	*/
	public String getInner_id(){
		return  inner_id;
	}
	/**
	* 内部ID
	*@param  inner_id
	*/
	public void setInner_id(String inner_id ){
		this.inner_id = inner_id;
	}
	
	/**
	* 地址
	*@return 
	*/
	public String getAddress(){
		return  address;
	}
	/**
	* 地址
	*@param  address
	*/
	public void setAddress(String address ){
		this.address = address;
	}
	
	/**
	* 登记机关
	*@return 
	*/
	public String getBelong_org(){
		return  belong_org;
	}
	/**
	* 登记机关
	*@param  belong_org
	*/
	public void setBelong_org(String belong_org ){
		this.belong_org = belong_org;
	}
	
	/**
	* 统一社会信用代码
	*@return 
	*/
	public String getCredit_code(){
		return  credit_code;
	}
	/**
	* 统一社会信用代码
	*@param  credit_code
	*/
	public void setCredit_code(String credit_code ){
		this.credit_code = credit_code;
	}
	
	/**
	* 类型
	*@return 
	*/
	public String getEcon_kind(){
		return  econ_kind;
	}
	/**
	* 类型
	*@param  econ_kind
	*/
	public void setEcon_kind(String econ_kind ){
		this.econ_kind = econ_kind;
	}
	
	/**
	* Logo地址
	*@return 
	*/
	public String getImage_url(){
		return  image_url;
	}
	/**
	* Logo地址
	*@param  image_url
	*/
	public void setImage_url(String image_url ){
		this.image_url = image_url;
	}
	
	/**
	* 统一社会信用代码
	*@return 
	*/
	public String getInner_company_code(){
		return  inner_company_code;
	}
	/**
	* 统一社会信用代码
	*@param  inner_company_code
	*/
	public void setInner_company_code(String inner_company_code ){
		this.inner_company_code = inner_company_code;
	}
	
	/**
	* 公司KeyNo
	*@return 
	*/
	public String getInner_company_id(){
		return  inner_company_id;
	}
	/**
	* 公司KeyNo
	*@param  inner_company_id
	*/
	public void setInner_company_id(String inner_company_id ){
		this.inner_company_id = inner_company_id;
	}
	
	/**
	* 公司名称
	*@return 
	*/
	public String getInner_company_name(){
		return  inner_company_name;
	}
	/**
	* 公司名称
	*@param  inner_company_name
	*/
	public void setInner_company_name(String inner_company_name ){
		this.inner_company_name = inner_company_name;
	}
	
	/**
	* 注册号
	*@return 
	*/
	public String getInner_company_no(){
		return  inner_company_no;
	}
	/**
	* 注册号
	*@param  inner_company_no
	*/
	public void setInner_company_no(String inner_company_no ){
		this.inner_company_no = inner_company_no;
	}
	
	/**
	* 是否上市
	*@return 
	*/
	public String getIs_on_stock(){
		return  is_on_stock;
	}
	/**
	* 是否上市
	*@param  is_on_stock
	*/
	public void setIs_on_stock(String is_on_stock ){
		this.is_on_stock = is_on_stock;
	}
	
	/**
	* 内部KeyNo
	*@return 
	*/
	public String getKey_no(){
		return  key_no;
	}
	/**
	* 内部KeyNo
	*@param  key_no
	*/
	public void setKey_no(String key_no ){
		this.key_no = key_no;
	}
	
	/**
	* 名称
	*@return 
	*/
	public String getName(){
		return  name;
	}
	/**
	* 名称
	*@param  name
	*/
	public void setName(String name ){
		this.name = name;
	}
	
	/**
	* 注册号
	*@return 
	*/
	public String getNo(){
		return  no;
	}
	/**
	* 注册号
	*@param  no
	*/
	public void setNo(String no ){
		this.no = no;
	}
	
	/**
	* 法人
	*@return 
	*/
	public String getOper_name(){
		return  oper_name;
	}
	/**
	* 法人
	*@param  oper_name
	*/
	public void setOper_name(String oper_name ){
		this.oper_name = oper_name;
	}
	
	/**
	* 组织机构代码
	*@return 
	*/
	public String getOrg_no(){
		return  org_no;
	}
	/**
	* 组织机构代码
	*@param  org_no
	*/
	public void setOrg_no(String org_no ){
		this.org_no = org_no;
	}
	
	/**
	* 省份
	*@return 
	*/
	public String getProvince(){
		return  province;
	}
	/**
	* 省份
	*@param  province
	*/
	public void setProvince(String province ){
		this.province = province;
	}
	
	/**
	* 省份代码
	*@return 
	*/
	public String getProvince_code(){
		return  province_code;
	}
	/**
	* 省份代码
	*@param  province_code
	*/
	public void setProvince_code(String province_code ){
		this.province_code = province_code;
	}
	
	/**
	* 注册资本(金额)
	*@return 
	*/
	public String getRegist_capi(){
		return  regist_capi;
	}
	/**
	* 注册资本(金额)
	*@param  regist_capi
	*/
	public void setRegist_capi(String regist_capi ){
		this.regist_capi = regist_capi;
	}
	
	/**
	* 注册资本(币种)
	*@return 
	*/
	public String getRegist_capi_unit(){
		return  regist_capi_unit;
	}
	/**
	* 注册资本(币种)
	*@param  regist_capi_unit
	*/
	public void setRegist_capi_unit(String regist_capi_unit ){
		this.regist_capi_unit = regist_capi_unit;
	}
	
	/**
	* 营业范围
	*@return 
	*/
	public String getScope(){
		return  scope;
	}
	/**
	* 营业范围
	*@param  scope
	*/
	public void setScope(String scope ){
		this.scope = scope;
	}
	
	/**
	* 状态
	*@return 
	*/
	public String getStatus(){
		return  status;
	}
	/**
	* 状态
	*@param  status
	*/
	public void setStatus(String status ){
		this.status = status;
	}
	
	/**
	* 证券号
	*@return 
	*/
	public String getStock_number(){
		return  stock_number;
	}
	/**
	* 证券号
	*@param  stock_number
	*/
	public void setStock_number(String stock_number ){
		this.stock_number = stock_number;
	}
	
	/**
	* 证券类型
	*@return 
	*/
	public String getStock_type(){
		return  stock_type;
	}
	/**
	* 证券类型
	*@param  stock_type
	*/
	public void setStock_type(String stock_type ){
		this.stock_type = stock_type;
	}
	
	/**
	* 发照日期
	*@return 
	*/
	public Date getCheck_date(){
		return  check_date;
	}
	/**
	* 发照日期
	*@param  check_date
	*/
	public void setCheck_date(Date check_date ){
		this.check_date = check_date;
	}
	
	/**
	* 吊销日期
	*@return 
	*/
	public Date getEnd_date(){
		return  end_date;
	}
	/**
	* 吊销日期
	*@param  end_date
	*/
	public void setEnd_date(Date end_date ){
		this.end_date = end_date;
	}
	
	/**
	* 入库时间
	*@return 
	*/
	public Date getInput_date(){
		return  input_date;
	}
	/**
	* 入库时间
	*@param  input_date
	*/
	public void setInput_date(Date input_date ){
		this.input_date = input_date;
	}
	
	/**
	* 成立日期
	*@return 
	*/
	public Date getStart_date(){
		return  start_date;
	}
	/**
	* 成立日期
	*@param  start_date
	*/
	public void setStart_date(Date start_date ){
		this.start_date = start_date;
	}
	
	/**
	* 营业期限至
	*@return 
	*/
	public Date getTeam_end(){
		return  team_end;
	}
	/**
	* 营业期限至
	*@param  team_end
	*/
	public void setTeam_end(Date team_end ){
		this.team_end = team_end;
	}
	
	/**
	* 营业期限始
	*@return 
	*/
	public Date getTerm_start(){
		return  term_start;
	}
	/**
	* 营业期限始
	*@param  term_start
	*/
	public void setTerm_start(Date term_start ){
		this.term_start = term_start;
	}
	
	/**
	* 更新日期
	*@return 
	*/
	public Date getUpdated_date(){
		return  updated_date;
	}
	/**
	* 更新日期
	*@param  updated_date
	*/
	public void setUpdated_date(Date updated_date ){
		this.updated_date = updated_date;
	}
	

}
