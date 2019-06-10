package com.beeasy.hzlink.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-06-05
*/
@Table(name="QCC_DETAILS_EMPLOYEES")
public class QccDetailsEmployees   {
	
	// alias
	public static final String ALIAS_INNER_ID = "INNER_ID";
	public static final String ALIAS_INNER_COMPANY_CODE = "INNER_COMPANY_CODE";
	public static final String ALIAS_INNER_COMPANY_ID = "INNER_COMPANY_ID";
	public static final String ALIAS_INNER_COMPANY_NAME = "INNER_COMPANY_NAME";
	public static final String ALIAS_INNER_COMPANY_NO = "INNER_COMPANY_NO";
	public static final String ALIAS_JOB = "JOB";
	public static final String ALIAS_NAME = "NAME";
	public static final String ALIAS_INPUT_DATE = "INPUT_DATE";
	
	/*
	内部ID
	*/
	private String inner_id ;
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
	职位
	*/
	private String job ;
	/*
	姓名
	*/
	private String name ;
	/*
	入库时间
	*/
	private Date input_date ;
	
	public QccDetailsEmployees() {
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
	* 职位
	*@return 
	*/
	public String getJob(){
		return  job;
	}
	/**
	* 职位
	*@param  job
	*/
	public void setJob(String job ){
		this.job = job;
	}
	
	/**
	* 姓名
	*@return 
	*/
	public String getName(){
		return  name;
	}
	/**
	* 姓名
	*@param  name
	*/
	public void setName(String name ){
		this.name = name;
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
