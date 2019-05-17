package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_pd_recharge")
public class RaPdRecharge   {
	
	// alias
	public static final String ALIAS_pdr_id = "pdr_id";
	public static final String ALIAS_pdr_add_time = "pdr_add_time";
	public static final String ALIAS_pdr_member_id = "pdr_member_id";
	public static final String ALIAS_pdr_payment_time = "pdr_payment_time";
	public static final String ALIAS_pdr_admin = "pdr_admin";
	public static final String ALIAS_pdr_amount = "pdr_amount";
	public static final String ALIAS_pdr_member_name = "pdr_member_name";
	public static final String ALIAS_pdr_payment_code = "pdr_payment_code";
	public static final String ALIAS_pdr_payment_name = "pdr_payment_name";
	public static final String ALIAS_pdr_payment_state = "pdr_payment_state";
	public static final String ALIAS_pdr_sn = "pdr_sn";
	public static final String ALIAS_pdr_trade_sn = "pdr_trade_sn";
	
	/*
	自增编号
	*/
	private Integer pdr_id ;
	/*
	添加时间
	*/
	private Integer pdr_add_time ;
	/*
	会员编号
	*/
	private Integer pdr_member_id ;
	/*
	支付时间
	*/
	private Integer pdr_payment_time ;
	/*
	管理员名
	*/
	private String pdr_admin ;
	/*
	充值金额
	*/
	private BigDecimal pdr_amount ;
	/*
	会员名称
	*/
	private String pdr_member_name ;
	/*
	支付方式
	*/
	private String pdr_payment_code ;
	/*
	支付方式
	*/
	private String pdr_payment_name ;
	/*
	支付状态 0未支付1支付
	*/
	private String pdr_payment_state ;
	/*
	记录唯一标示
	*/
	private Long pdr_sn ;
	/*
	第三方支付接口交易号
	*/
	private String pdr_trade_sn ;
	
	public RaPdRecharge() {
	}
	
	/**
	* 自增编号
	*@return 
	*/
	public Integer getPdr_id(){
		return  pdr_id;
	}
	/**
	* 自增编号
	*@param  pdr_id
	*/
	public void setPdr_id(Integer pdr_id ){
		this.pdr_id = pdr_id;
	}
	
	/**
	* 添加时间
	*@return 
	*/
	public Integer getPdr_add_time(){
		return  pdr_add_time;
	}
	/**
	* 添加时间
	*@param  pdr_add_time
	*/
	public void setPdr_add_time(Integer pdr_add_time ){
		this.pdr_add_time = pdr_add_time;
	}
	
	/**
	* 会员编号
	*@return 
	*/
	public Integer getPdr_member_id(){
		return  pdr_member_id;
	}
	/**
	* 会员编号
	*@param  pdr_member_id
	*/
	public void setPdr_member_id(Integer pdr_member_id ){
		this.pdr_member_id = pdr_member_id;
	}
	
	/**
	* 支付时间
	*@return 
	*/
	public Integer getPdr_payment_time(){
		return  pdr_payment_time;
	}
	/**
	* 支付时间
	*@param  pdr_payment_time
	*/
	public void setPdr_payment_time(Integer pdr_payment_time ){
		this.pdr_payment_time = pdr_payment_time;
	}
	
	/**
	* 管理员名
	*@return 
	*/
	public String getPdr_admin(){
		return  pdr_admin;
	}
	/**
	* 管理员名
	*@param  pdr_admin
	*/
	public void setPdr_admin(String pdr_admin ){
		this.pdr_admin = pdr_admin;
	}
	
	/**
	* 充值金额
	*@return 
	*/
	public BigDecimal getPdr_amount(){
		return  pdr_amount;
	}
	/**
	* 充值金额
	*@param  pdr_amount
	*/
	public void setPdr_amount(BigDecimal pdr_amount ){
		this.pdr_amount = pdr_amount;
	}
	
	/**
	* 会员名称
	*@return 
	*/
	public String getPdr_member_name(){
		return  pdr_member_name;
	}
	/**
	* 会员名称
	*@param  pdr_member_name
	*/
	public void setPdr_member_name(String pdr_member_name ){
		this.pdr_member_name = pdr_member_name;
	}
	
	/**
	* 支付方式
	*@return 
	*/
	public String getPdr_payment_code(){
		return  pdr_payment_code;
	}
	/**
	* 支付方式
	*@param  pdr_payment_code
	*/
	public void setPdr_payment_code(String pdr_payment_code ){
		this.pdr_payment_code = pdr_payment_code;
	}
	
	/**
	* 支付方式
	*@return 
	*/
	public String getPdr_payment_name(){
		return  pdr_payment_name;
	}
	/**
	* 支付方式
	*@param  pdr_payment_name
	*/
	public void setPdr_payment_name(String pdr_payment_name ){
		this.pdr_payment_name = pdr_payment_name;
	}
	
	/**
	* 支付状态 0未支付1支付
	*@return 
	*/
	public String getPdr_payment_state(){
		return  pdr_payment_state;
	}
	/**
	* 支付状态 0未支付1支付
	*@param  pdr_payment_state
	*/
	public void setPdr_payment_state(String pdr_payment_state ){
		this.pdr_payment_state = pdr_payment_state;
	}
	
	/**
	* 记录唯一标示
	*@return 
	*/
	public Long getPdr_sn(){
		return  pdr_sn;
	}
	/**
	* 记录唯一标示
	*@param  pdr_sn
	*/
	public void setPdr_sn(Long pdr_sn ){
		this.pdr_sn = pdr_sn;
	}
	
	/**
	* 第三方支付接口交易号
	*@return 
	*/
	public String getPdr_trade_sn(){
		return  pdr_trade_sn;
	}
	/**
	* 第三方支付接口交易号
	*@param  pdr_trade_sn
	*/
	public void setPdr_trade_sn(String pdr_trade_sn ){
		this.pdr_trade_sn = pdr_trade_sn;
	}
	

}
