package com.beeasy.hzlink.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;

import org.beetl.sql.core.annotatoin.AssignID;

/*
* 
* gen by beetlsql 2019-06-05
*/
@Table(name="QCC_HOLDING_COMPANY_NAMES")
public class QccHoldingCompanyNames   {

	/*
	内部ID
	*/
    @AssignID()
	private String inner_id ;
	/*
	企业类型
	*/
	private String econ_kind ;
	/*
	Logo
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
	公司KeyNo
	*/
	private String key_no ;
	/*
	层级数
	*/
	private String level ;
	private String name ;
	/*
	法人信息
	*/
	private String oper ;
	/*
	PATHS信息
	*/
	private String paths ;
	/*
	投资比例
	*/
	private String percent_total ;
	/*
	注册资金
	*/
	private String regist_capi ;
	/*
	状态
	*/
	private String short_status ;
	/*
	入库时间
	*/
	private Date input_date ;
	/*
	成立时间
	*/
	private Date start_date ;

	public QccHoldingCompanyNames() {
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
	* 企业类型
	*@return
	*/
	public String getEcon_kind(){
		return  econ_kind;
	}
	/**
	* 企业类型
	*@param  econ_kind
	*/
	public void setEcon_kind(String econ_kind ){
		this.econ_kind = econ_kind;
	}

	/**
	* Logo
	*@return
	*/
	public String getImage_url(){
		return  image_url;
	}
	/**
	* Logo
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
	* 公司KeyNo
	*@return
	*/
	public String getKey_no(){
		return  key_no;
	}
	/**
	* 公司KeyNo
	*@param  key_no
	*/
	public void setKey_no(String key_no ){
		this.key_no = key_no;
	}

	/**
	* 层级数
	*@return
	*/
	public String getLevel(){
		return  level;
	}
	/**
	* 层级数
	*@param  level
	*/
	public void setLevel(String level ){
		this.level = level;
	}

	public String getName(){
		return  name;
	}
	public void setName(String name ){
		this.name = name;
	}

	/**
	* 法人信息
	*@return
	*/
	public String getOper(){
		return  oper;
	}
	/**
	* 法人信息
	*@param  oper
	*/
	public void setOper(String oper ){
		this.oper = oper;
	}

	/**
	* PATHS信息
	*@return
	*/
	public String getPaths(){
		return  paths;
	}
	/**
	* PATHS信息
	*@param  paths
	*/
	public void setPaths(String paths ){
		this.paths = paths;
	}

	/**
	* 投资比例
	*@return
	*/
	public String getPercent_total(){
		return  percent_total;
	}
	/**
	* 投资比例
	*@param  percent_total
	*/
	public void setPercent_total(String percent_total ){
		this.percent_total = percent_total;
	}

	/**
	* 注册资金
	*@return
	*/
	public String getRegist_capi(){
		return  regist_capi;
	}
	/**
	* 注册资金
	*@param  regist_capi
	*/
	public void setRegist_capi(String regist_capi ){
		this.regist_capi = regist_capi;
	}

	/**
	* 状态
	*@return
	*/
	public String getShort_status(){
		return  short_status;
	}
	/**
	* 状态
	*@param  short_status
	*/
	public void setShort_status(String short_status ){
		this.short_status = short_status;
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
	* 成立时间
	*@return
	*/
	public Date getStart_date(){
		return  start_date;
	}
	/**
	* 成立时间
	*@param  start_date
	*/
	public void setStart_date(Date start_date ){
		this.start_date = start_date;
	}


}
