package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_pd_cash")
public class RaPdCash   {
	
	// alias
	public static final String ALIAS_pdc_id = "pdc_id";
	public static final String ALIAS_pdc_add_time = "pdc_add_time";
	public static final String ALIAS_pdc_member_id = "pdc_member_id";
	public static final String ALIAS_pdc_payment_time = "pdc_payment_time";
	public static final String ALIAS_pdc_amount = "pdc_amount";
	public static final String ALIAS_pdc_bank_name = "pdc_bank_name";
	public static final String ALIAS_pdc_bank_no = "pdc_bank_no";
	public static final String ALIAS_pdc_bank_user = "pdc_bank_user";
	public static final String ALIAS_pdc_member_name = "pdc_member_name";
	public static final String ALIAS_pdc_payment_admin = "pdc_payment_admin";
	public static final String ALIAS_pdc_payment_state = "pdc_payment_state";
	public static final String ALIAS_pdc_sn = "pdc_sn";
	
	/*
	自增编号
	*/
	private Integer pdc_id ;
	/*
	添加时间
	*/
	private Integer pdc_add_time ;
	/*
	会员编号
	*/
	private Integer pdc_member_id ;
	/*
	付款时间
	*/
	private Integer pdc_payment_time ;
	/*
	金额
	*/
	private BigDecimal pdc_amount ;
	/*
	收款银行
	*/
	private String pdc_bank_name ;
	/*
	收款账号
	*/
	private String pdc_bank_no ;
	/*
	开户人姓名
	*/
	private String pdc_bank_user ;
	/*
	会员名称
	*/
	private String pdc_member_name ;
	/*
	支付管理员
	*/
	private String pdc_payment_admin ;
	/*
	提现支付状态 0默认1支付完成
	*/
	private String pdc_payment_state ;
	/*
	记录唯一标示
	*/
	private Long pdc_sn ;
	
	public RaPdCash() {
	}
	
	/**
	* 自增编号
	*@return 
	*/
	public Integer getPdc_id(){
		return  pdc_id;
	}
	/**
	* 自增编号
	*@param  pdc_id
	*/
	public void setPdc_id(Integer pdc_id ){
		this.pdc_id = pdc_id;
	}
	
	/**
	* 添加时间
	*@return 
	*/
	public Integer getPdc_add_time(){
		return  pdc_add_time;
	}
	/**
	* 添加时间
	*@param  pdc_add_time
	*/
	public void setPdc_add_time(Integer pdc_add_time ){
		this.pdc_add_time = pdc_add_time;
	}
	
	/**
	* 会员编号
	*@return 
	*/
	public Integer getPdc_member_id(){
		return  pdc_member_id;
	}
	/**
	* 会员编号
	*@param  pdc_member_id
	*/
	public void setPdc_member_id(Integer pdc_member_id ){
		this.pdc_member_id = pdc_member_id;
	}
	
	/**
	* 付款时间
	*@return 
	*/
	public Integer getPdc_payment_time(){
		return  pdc_payment_time;
	}
	/**
	* 付款时间
	*@param  pdc_payment_time
	*/
	public void setPdc_payment_time(Integer pdc_payment_time ){
		this.pdc_payment_time = pdc_payment_time;
	}
	
	/**
	* 金额
	*@return 
	*/
	public BigDecimal getPdc_amount(){
		return  pdc_amount;
	}
	/**
	* 金额
	*@param  pdc_amount
	*/
	public void setPdc_amount(BigDecimal pdc_amount ){
		this.pdc_amount = pdc_amount;
	}
	
	/**
	* 收款银行
	*@return 
	*/
	public String getPdc_bank_name(){
		return  pdc_bank_name;
	}
	/**
	* 收款银行
	*@param  pdc_bank_name
	*/
	public void setPdc_bank_name(String pdc_bank_name ){
		this.pdc_bank_name = pdc_bank_name;
	}
	
	/**
	* 收款账号
	*@return 
	*/
	public String getPdc_bank_no(){
		return  pdc_bank_no;
	}
	/**
	* 收款账号
	*@param  pdc_bank_no
	*/
	public void setPdc_bank_no(String pdc_bank_no ){
		this.pdc_bank_no = pdc_bank_no;
	}
	
	/**
	* 开户人姓名
	*@return 
	*/
	public String getPdc_bank_user(){
		return  pdc_bank_user;
	}
	/**
	* 开户人姓名
	*@param  pdc_bank_user
	*/
	public void setPdc_bank_user(String pdc_bank_user ){
		this.pdc_bank_user = pdc_bank_user;
	}
	
	/**
	* 会员名称
	*@return 
	*/
	public String getPdc_member_name(){
		return  pdc_member_name;
	}
	/**
	* 会员名称
	*@param  pdc_member_name
	*/
	public void setPdc_member_name(String pdc_member_name ){
		this.pdc_member_name = pdc_member_name;
	}
	
	/**
	* 支付管理员
	*@return 
	*/
	public String getPdc_payment_admin(){
		return  pdc_payment_admin;
	}
	/**
	* 支付管理员
	*@param  pdc_payment_admin
	*/
	public void setPdc_payment_admin(String pdc_payment_admin ){
		this.pdc_payment_admin = pdc_payment_admin;
	}
	
	/**
	* 提现支付状态 0默认1支付完成
	*@return 
	*/
	public String getPdc_payment_state(){
		return  pdc_payment_state;
	}
	/**
	* 提现支付状态 0默认1支付完成
	*@param  pdc_payment_state
	*/
	public void setPdc_payment_state(String pdc_payment_state ){
		this.pdc_payment_state = pdc_payment_state;
	}
	
	/**
	* 记录唯一标示
	*@return 
	*/
	public Long getPdc_sn(){
		return  pdc_sn;
	}
	/**
	* 记录唯一标示
	*@param  pdc_sn
	*/
	public void setPdc_sn(Long pdc_sn ){
		this.pdc_sn = pdc_sn;
	}
	

}
