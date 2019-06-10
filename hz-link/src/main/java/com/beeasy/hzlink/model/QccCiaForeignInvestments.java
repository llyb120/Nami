package com.beeasy.hzlink.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-06-05
*/
@Table(name="QCC_CIA_FOREIGN_INVESTMENTS")
public class QccCiaForeignInvestments   {
	
	// alias
	public static final String ALIAS_INNER_ID = "INNER_ID";
	public static final String ALIAS_CREDIT_CODE = "CREDIT_CODE";
	public static final String ALIAS_ECO_KIND = "ECO_KIND";
	public static final String ALIAS_INNER_COMPANY_CODE = "INNER_COMPANY_CODE";
	public static final String ALIAS_INNER_COMPANY_ID = "INNER_COMPANY_ID";
	public static final String ALIAS_INNER_COMPANY_NAME = "INNER_COMPANY_NAME";
	public static final String ALIAS_INNER_COMPANY_NO = "INNER_COMPANY_NO";
	public static final String ALIAS_NAME = "NAME";
	public static final String ALIAS_PER_NAME = "PER_NAME";
	public static final String ALIAS_REG_CAP = "REG_CAP";
	public static final String ALIAS_REG_CAP_CUR = "REG_CAP_CUR";
	public static final String ALIAS_REG_NO = "REG_NO";
	public static final String ALIAS_STATUS = "STATUS";
	public static final String ALIAS_SUB_CON_AMT = "SUB_CON_AMT";
	public static final String ALIAS_SUB_CURRENCY = "SUB_CURRENCY";
	public static final String ALIAS_INPUT_DATE = "INPUT_DATE";
	
	/*
	内部ID
	*/
	private String inner_id ;
	private String credit_code ;
	/*
	企业类型
	*/
	private String eco_kind ;
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
	企业名称
	*/
	private String name ;
	/*
	人员姓名
	*/
	private String per_name ;
	/*
	注册资本
	*/
	private String reg_cap ;
	/*
	注册资本币种
	*/
	private String reg_cap_cur ;
	/*
	注册号
	*/
	private String reg_no ;
	/*
	企业状态
	*/
	private String status ;
	/*
	认缴出资额
	*/
	private String sub_con_amt ;
	/*
	认缴出资币种
	*/
	private String sub_currency ;
	/*
	入库时间
	*/
	private Date input_date ;
	
	public QccCiaForeignInvestments() {
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
	
	public String getCredit_code(){
		return  credit_code;
	}
	public void setCredit_code(String credit_code ){
		this.credit_code = credit_code;
	}
	
	/**
	* 企业类型
	*@return 
	*/
	public String getEco_kind(){
		return  eco_kind;
	}
	/**
	* 企业类型
	*@param  eco_kind
	*/
	public void setEco_kind(String eco_kind ){
		this.eco_kind = eco_kind;
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
	* 企业名称
	*@return 
	*/
	public String getName(){
		return  name;
	}
	/**
	* 企业名称
	*@param  name
	*/
	public void setName(String name ){
		this.name = name;
	}
	
	/**
	* 人员姓名
	*@return 
	*/
	public String getPer_name(){
		return  per_name;
	}
	/**
	* 人员姓名
	*@param  per_name
	*/
	public void setPer_name(String per_name ){
		this.per_name = per_name;
	}
	
	/**
	* 注册资本
	*@return 
	*/
	public String getReg_cap(){
		return  reg_cap;
	}
	/**
	* 注册资本
	*@param  reg_cap
	*/
	public void setReg_cap(String reg_cap ){
		this.reg_cap = reg_cap;
	}
	
	/**
	* 注册资本币种
	*@return 
	*/
	public String getReg_cap_cur(){
		return  reg_cap_cur;
	}
	/**
	* 注册资本币种
	*@param  reg_cap_cur
	*/
	public void setReg_cap_cur(String reg_cap_cur ){
		this.reg_cap_cur = reg_cap_cur;
	}
	
	/**
	* 注册号
	*@return 
	*/
	public String getReg_no(){
		return  reg_no;
	}
	/**
	* 注册号
	*@param  reg_no
	*/
	public void setReg_no(String reg_no ){
		this.reg_no = reg_no;
	}
	
	/**
	* 企业状态
	*@return 
	*/
	public String getStatus(){
		return  status;
	}
	/**
	* 企业状态
	*@param  status
	*/
	public void setStatus(String status ){
		this.status = status;
	}
	
	/**
	* 认缴出资额
	*@return 
	*/
	public String getSub_con_amt(){
		return  sub_con_amt;
	}
	/**
	* 认缴出资额
	*@param  sub_con_amt
	*/
	public void setSub_con_amt(String sub_con_amt ){
		this.sub_con_amt = sub_con_amt;
	}
	
	/**
	* 认缴出资币种
	*@return 
	*/
	public String getSub_currency(){
		return  sub_currency;
	}
	/**
	* 认缴出资币种
	*@param  sub_currency
	*/
	public void setSub_currency(String sub_currency ){
		this.sub_currency = sub_currency;
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
