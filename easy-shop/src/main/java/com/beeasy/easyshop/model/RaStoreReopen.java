package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_store_reopen")
public class RaStoreReopen   {
	
	// alias
	public static final String ALIAS_re_id = "re_id";
	public static final String ALIAS_re_create_time = "re_create_time";
	public static final String ALIAS_re_end_time = "re_end_time";
	public static final String ALIAS_re_grade_id = "re_grade_id";
	public static final String ALIAS_re_start_time = "re_start_time";
	public static final String ALIAS_re_state = "re_state";
	public static final String ALIAS_re_store_id = "re_store_id";
	public static final String ALIAS_re_year = "re_year";
	public static final String ALIAS_re_grade_name = "re_grade_name";
	public static final String ALIAS_re_grade_price = "re_grade_price";
	public static final String ALIAS_re_pay_amount = "re_pay_amount";
	public static final String ALIAS_re_pay_cert = "re_pay_cert";
	public static final String ALIAS_re_pay_cert_explain = "re_pay_cert_explain";
	public static final String ALIAS_re_store_name = "re_store_name";
	
	private Integer re_id ;
	/*
	记录创建时间
	*/
	private Integer re_create_time ;
	/*
	有效期结束时间
	*/
	private Integer re_end_time ;
	/*
	店铺等级ID
	*/
	private Integer re_grade_id ;
	/*
	有效期开始时间
	*/
	private Integer re_start_time ;
	/*
	状态0默认，未上传凭证1审核中2审核通过
	*/
	private Integer re_state ;
	/*
	店铺ID
	*/
	private Integer re_store_id ;
	/*
	续签时长(年)
	*/
	private Integer re_year ;
	/*
	等级名称
	*/
	private String re_grade_name ;
	/*
	等级收费(元/年)
	*/
	private BigDecimal re_grade_price ;
	/*
	应付总金额
	*/
	private BigDecimal re_pay_amount ;
	/*
	付款凭证
	*/
	private String re_pay_cert ;
	/*
	付款凭证说明
	*/
	private String re_pay_cert_explain ;
	/*
	店铺名字
	*/
	private String re_store_name ;
	
	public RaStoreReopen() {
	}
	
	public Integer getRe_id(){
		return  re_id;
	}
	public void setRe_id(Integer re_id ){
		this.re_id = re_id;
	}
	
	/**
	* 记录创建时间
	*@return 
	*/
	public Integer getRe_create_time(){
		return  re_create_time;
	}
	/**
	* 记录创建时间
	*@param  re_create_time
	*/
	public void setRe_create_time(Integer re_create_time ){
		this.re_create_time = re_create_time;
	}
	
	/**
	* 有效期结束时间
	*@return 
	*/
	public Integer getRe_end_time(){
		return  re_end_time;
	}
	/**
	* 有效期结束时间
	*@param  re_end_time
	*/
	public void setRe_end_time(Integer re_end_time ){
		this.re_end_time = re_end_time;
	}
	
	/**
	* 店铺等级ID
	*@return 
	*/
	public Integer getRe_grade_id(){
		return  re_grade_id;
	}
	/**
	* 店铺等级ID
	*@param  re_grade_id
	*/
	public void setRe_grade_id(Integer re_grade_id ){
		this.re_grade_id = re_grade_id;
	}
	
	/**
	* 有效期开始时间
	*@return 
	*/
	public Integer getRe_start_time(){
		return  re_start_time;
	}
	/**
	* 有效期开始时间
	*@param  re_start_time
	*/
	public void setRe_start_time(Integer re_start_time ){
		this.re_start_time = re_start_time;
	}
	
	/**
	* 状态0默认，未上传凭证1审核中2审核通过
	*@return 
	*/
	public Integer getRe_state(){
		return  re_state;
	}
	/**
	* 状态0默认，未上传凭证1审核中2审核通过
	*@param  re_state
	*/
	public void setRe_state(Integer re_state ){
		this.re_state = re_state;
	}
	
	/**
	* 店铺ID
	*@return 
	*/
	public Integer getRe_store_id(){
		return  re_store_id;
	}
	/**
	* 店铺ID
	*@param  re_store_id
	*/
	public void setRe_store_id(Integer re_store_id ){
		this.re_store_id = re_store_id;
	}
	
	/**
	* 续签时长(年)
	*@return 
	*/
	public Integer getRe_year(){
		return  re_year;
	}
	/**
	* 续签时长(年)
	*@param  re_year
	*/
	public void setRe_year(Integer re_year ){
		this.re_year = re_year;
	}
	
	/**
	* 等级名称
	*@return 
	*/
	public String getRe_grade_name(){
		return  re_grade_name;
	}
	/**
	* 等级名称
	*@param  re_grade_name
	*/
	public void setRe_grade_name(String re_grade_name ){
		this.re_grade_name = re_grade_name;
	}
	
	/**
	* 等级收费(元/年)
	*@return 
	*/
	public BigDecimal getRe_grade_price(){
		return  re_grade_price;
	}
	/**
	* 等级收费(元/年)
	*@param  re_grade_price
	*/
	public void setRe_grade_price(BigDecimal re_grade_price ){
		this.re_grade_price = re_grade_price;
	}
	
	/**
	* 应付总金额
	*@return 
	*/
	public BigDecimal getRe_pay_amount(){
		return  re_pay_amount;
	}
	/**
	* 应付总金额
	*@param  re_pay_amount
	*/
	public void setRe_pay_amount(BigDecimal re_pay_amount ){
		this.re_pay_amount = re_pay_amount;
	}
	
	/**
	* 付款凭证
	*@return 
	*/
	public String getRe_pay_cert(){
		return  re_pay_cert;
	}
	/**
	* 付款凭证
	*@param  re_pay_cert
	*/
	public void setRe_pay_cert(String re_pay_cert ){
		this.re_pay_cert = re_pay_cert;
	}
	
	/**
	* 付款凭证说明
	*@return 
	*/
	public String getRe_pay_cert_explain(){
		return  re_pay_cert_explain;
	}
	/**
	* 付款凭证说明
	*@param  re_pay_cert_explain
	*/
	public void setRe_pay_cert_explain(String re_pay_cert_explain ){
		this.re_pay_cert_explain = re_pay_cert_explain;
	}
	
	/**
	* 店铺名字
	*@return 
	*/
	public String getRe_store_name(){
		return  re_store_name;
	}
	/**
	* 店铺名字
	*@param  re_store_name
	*/
	public void setRe_store_name(String re_store_name ){
		this.re_store_name = re_store_name;
	}
	

}
