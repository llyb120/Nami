package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_pd_log")
public class RaPdLog   {
	
	// alias
	public static final String ALIAS_lg_id = "lg_id";
	public static final String ALIAS_lg_add_time = "lg_add_time";
	public static final String ALIAS_lg_member_id = "lg_member_id";
	public static final String ALIAS_lg_admin_name = "lg_admin_name";
	public static final String ALIAS_lg_av_amount = "lg_av_amount";
	public static final String ALIAS_lg_desc = "lg_desc";
	public static final String ALIAS_lg_freeze_amount = "lg_freeze_amount";
	public static final String ALIAS_lg_member_name = "lg_member_name";
	public static final String ALIAS_lg_type = "lg_type";
	
	/*
	自增编号
	*/
	private Integer lg_id ;
	/*
	添加时间
	*/
	private Integer lg_add_time ;
	/*
	会员编号
	*/
	private Integer lg_member_id ;
	/*
	管理员名称
	*/
	private String lg_admin_name ;
	/*
	可用金额变更0表示未变更
	*/
	private BigDecimal lg_av_amount ;
	/*
	描述
	*/
	private String lg_desc ;
	/*
	冻结金额变更0表示未变更
	*/
	private BigDecimal lg_freeze_amount ;
	/*
	会员名称
	*/
	private String lg_member_name ;
	/*
	order_pay下单支付预存款,order_freeze下单冻结预存款,order_cancel取消订单解冻预存款,order_comb_pay下单支付被冻结的预存款,recharge充值,cash_apply申请提现冻结预存款,cash_pay提现成功,cash_del取消提现申请，解冻预存款,refund退款
	*/
	private String lg_type ;
	
	public RaPdLog() {
	}
	
	/**
	* 自增编号
	*@return 
	*/
	public Integer getLg_id(){
		return  lg_id;
	}
	/**
	* 自增编号
	*@param  lg_id
	*/
	public void setLg_id(Integer lg_id ){
		this.lg_id = lg_id;
	}
	
	/**
	* 添加时间
	*@return 
	*/
	public Integer getLg_add_time(){
		return  lg_add_time;
	}
	/**
	* 添加时间
	*@param  lg_add_time
	*/
	public void setLg_add_time(Integer lg_add_time ){
		this.lg_add_time = lg_add_time;
	}
	
	/**
	* 会员编号
	*@return 
	*/
	public Integer getLg_member_id(){
		return  lg_member_id;
	}
	/**
	* 会员编号
	*@param  lg_member_id
	*/
	public void setLg_member_id(Integer lg_member_id ){
		this.lg_member_id = lg_member_id;
	}
	
	/**
	* 管理员名称
	*@return 
	*/
	public String getLg_admin_name(){
		return  lg_admin_name;
	}
	/**
	* 管理员名称
	*@param  lg_admin_name
	*/
	public void setLg_admin_name(String lg_admin_name ){
		this.lg_admin_name = lg_admin_name;
	}
	
	/**
	* 可用金额变更0表示未变更
	*@return 
	*/
	public BigDecimal getLg_av_amount(){
		return  lg_av_amount;
	}
	/**
	* 可用金额变更0表示未变更
	*@param  lg_av_amount
	*/
	public void setLg_av_amount(BigDecimal lg_av_amount ){
		this.lg_av_amount = lg_av_amount;
	}
	
	/**
	* 描述
	*@return 
	*/
	public String getLg_desc(){
		return  lg_desc;
	}
	/**
	* 描述
	*@param  lg_desc
	*/
	public void setLg_desc(String lg_desc ){
		this.lg_desc = lg_desc;
	}
	
	/**
	* 冻结金额变更0表示未变更
	*@return 
	*/
	public BigDecimal getLg_freeze_amount(){
		return  lg_freeze_amount;
	}
	/**
	* 冻结金额变更0表示未变更
	*@param  lg_freeze_amount
	*/
	public void setLg_freeze_amount(BigDecimal lg_freeze_amount ){
		this.lg_freeze_amount = lg_freeze_amount;
	}
	
	/**
	* 会员名称
	*@return 
	*/
	public String getLg_member_name(){
		return  lg_member_name;
	}
	/**
	* 会员名称
	*@param  lg_member_name
	*/
	public void setLg_member_name(String lg_member_name ){
		this.lg_member_name = lg_member_name;
	}
	
	/**
	* order_pay下单支付预存款,order_freeze下单冻结预存款,order_cancel取消订单解冻预存款,order_comb_pay下单支付被冻结的预存款,recharge充值,cash_apply申请提现冻结预存款,cash_pay提现成功,cash_del取消提现申请，解冻预存款,refund退款
	*@return 
	*/
	public String getLg_type(){
		return  lg_type;
	}
	/**
	* order_pay下单支付预存款,order_freeze下单冻结预存款,order_cancel取消订单解冻预存款,order_comb_pay下单支付被冻结的预存款,recharge充值,cash_apply申请提现冻结预存款,cash_pay提现成功,cash_del取消提现申请，解冻预存款,refund退款
	*@param  lg_type
	*/
	public void setLg_type(String lg_type ){
		this.lg_type = lg_type;
	}
	

}
