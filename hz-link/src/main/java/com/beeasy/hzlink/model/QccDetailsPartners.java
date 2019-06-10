package com.beeasy.hzlink.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-06-05
*/
@Table(name="QCC_DETAILS_PARTNERS")
public class QccDetailsPartners   {
	
	// alias
	public static final String ALIAS_INNER_ID = "INNER_ID";
	public static final String ALIAS_CAPI_DATE = "CAPI_DATE";
	public static final String ALIAS_INNER_COMPANY_CODE = "INNER_COMPANY_CODE";
	public static final String ALIAS_INNER_COMPANY_ID = "INNER_COMPANY_ID";
	public static final String ALIAS_INNER_COMPANY_NAME = "INNER_COMPANY_NAME";
	public static final String ALIAS_INNER_COMPANY_NO = "INNER_COMPANY_NO";
	public static final String ALIAS_INVEST_NAME = "INVEST_NAME";
	public static final String ALIAS_INVEST_TYPE = "INVEST_TYPE";
	public static final String ALIAS_REAL_CAPI = "REAL_CAPI";
	public static final String ALIAS_SHOUD_DATE = "SHOUD_DATE";
	public static final String ALIAS_SHOULD_CAPI = "SHOULD_CAPI";
	public static final String ALIAS_STOCK_NAME = "STOCK_NAME";
	public static final String ALIAS_STOCK_PERCENT = "STOCK_PERCENT";
	public static final String ALIAS_STOCK_TYPE = "STOCK_TYPE";
	public static final String ALIAS_INPUT_DATE = "INPUT_DATE";
	
	/*
	内部ID
	*/
	private String inner_id ;
	/*
	实缴时间
	*/
	private String capi_date ;
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
	实际出资方式
	*/
	private String invest_name ;
	/*
	认缴出资方式
	*/
	private String invest_type ;
	/*
	实缴出资额
	*/
	private String real_capi ;
	/*
	认缴出资时间
	*/
	private String shoud_date ;
	/*
	认缴出资额
	*/
	private String should_capi ;
	/*
	股东
	*/
	private String stock_name ;
	/*
	出资比例
	*/
	private String stock_percent ;
	/*
	股东类型
	*/
	private String stock_type ;
	/*
	入库时间
	*/
	private Date input_date ;
	
	public QccDetailsPartners() {
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
	* 实缴时间
	*@return 
	*/
	public String getCapi_date(){
		return  capi_date;
	}
	/**
	* 实缴时间
	*@param  capi_date
	*/
	public void setCapi_date(String capi_date ){
		this.capi_date = capi_date;
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
	* 实际出资方式
	*@return 
	*/
	public String getInvest_name(){
		return  invest_name;
	}
	/**
	* 实际出资方式
	*@param  invest_name
	*/
	public void setInvest_name(String invest_name ){
		this.invest_name = invest_name;
	}
	
	/**
	* 认缴出资方式
	*@return 
	*/
	public String getInvest_type(){
		return  invest_type;
	}
	/**
	* 认缴出资方式
	*@param  invest_type
	*/
	public void setInvest_type(String invest_type ){
		this.invest_type = invest_type;
	}
	
	/**
	* 实缴出资额
	*@return 
	*/
	public String getReal_capi(){
		return  real_capi;
	}
	/**
	* 实缴出资额
	*@param  real_capi
	*/
	public void setReal_capi(String real_capi ){
		this.real_capi = real_capi;
	}
	
	/**
	* 认缴出资时间
	*@return 
	*/
	public String getShoud_date(){
		return  shoud_date;
	}
	/**
	* 认缴出资时间
	*@param  shoud_date
	*/
	public void setShoud_date(String shoud_date ){
		this.shoud_date = shoud_date;
	}
	
	/**
	* 认缴出资额
	*@return 
	*/
	public String getShould_capi(){
		return  should_capi;
	}
	/**
	* 认缴出资额
	*@param  should_capi
	*/
	public void setShould_capi(String should_capi ){
		this.should_capi = should_capi;
	}
	
	/**
	* 股东
	*@return 
	*/
	public String getStock_name(){
		return  stock_name;
	}
	/**
	* 股东
	*@param  stock_name
	*/
	public void setStock_name(String stock_name ){
		this.stock_name = stock_name;
	}
	
	/**
	* 出资比例
	*@return 
	*/
	public String getStock_percent(){
		return  stock_percent;
	}
	/**
	* 出资比例
	*@param  stock_percent
	*/
	public void setStock_percent(String stock_percent ){
		this.stock_percent = stock_percent;
	}
	
	/**
	* 股东类型
	*@return 
	*/
	public String getStock_type(){
		return  stock_type;
	}
	/**
	* 股东类型
	*@param  stock_type
	*/
	public void setStock_type(String stock_type ){
		this.stock_type = stock_type;
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
	

}
