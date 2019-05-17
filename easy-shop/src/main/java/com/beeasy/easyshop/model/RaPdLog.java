package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_pd_log")
public class RaPdLog   {
	
	/*
	自增编号
	*/
	private Integer lgId ;
	/*
	添加时间
	*/
	private Integer lgAddTime ;
	/*
	会员编号
	*/
	private Integer lgMemberId ;
	/*
	管理员名称
	*/
	private String lgAdminName ;
	/*
	可用金额变更0表示未变更
	*/
	private BigDecimal lgAvAmount ;
	/*
	描述
	*/
	private String lgDesc ;
	/*
	冻结金额变更0表示未变更
	*/
	private BigDecimal lgFreezeAmount ;
	/*
	会员名称
	*/
	private String lgMemberName ;
	/*
	order_pay下单支付预存款,order_freeze下单冻结预存款,order_cancel取消订单解冻预存款,order_comb_pay下单支付被冻结的预存款,recharge充值,cash_apply申请提现冻结预存款,cash_pay提现成功,cash_del取消提现申请，解冻预存款,refund退款
	*/
	private String lgType ;
	
	public RaPdLog() {
	}
	
	/**
	* 自增编号
	*@return 
	*/
	public Integer getLgId(){
		return  lgId;
	}
	/**
	* 自增编号
	*@param  lgId
	*/
	public void setLgId(Integer lgId ){
		this.lgId = lgId;
	}
	
	/**
	* 添加时间
	*@return 
	*/
	public Integer getLgAddTime(){
		return  lgAddTime;
	}
	/**
	* 添加时间
	*@param  lgAddTime
	*/
	public void setLgAddTime(Integer lgAddTime ){
		this.lgAddTime = lgAddTime;
	}
	
	/**
	* 会员编号
	*@return 
	*/
	public Integer getLgMemberId(){
		return  lgMemberId;
	}
	/**
	* 会员编号
	*@param  lgMemberId
	*/
	public void setLgMemberId(Integer lgMemberId ){
		this.lgMemberId = lgMemberId;
	}
	
	/**
	* 管理员名称
	*@return 
	*/
	public String getLgAdminName(){
		return  lgAdminName;
	}
	/**
	* 管理员名称
	*@param  lgAdminName
	*/
	public void setLgAdminName(String lgAdminName ){
		this.lgAdminName = lgAdminName;
	}
	
	/**
	* 可用金额变更0表示未变更
	*@return 
	*/
	public BigDecimal getLgAvAmount(){
		return  lgAvAmount;
	}
	/**
	* 可用金额变更0表示未变更
	*@param  lgAvAmount
	*/
	public void setLgAvAmount(BigDecimal lgAvAmount ){
		this.lgAvAmount = lgAvAmount;
	}
	
	/**
	* 描述
	*@return 
	*/
	public String getLgDesc(){
		return  lgDesc;
	}
	/**
	* 描述
	*@param  lgDesc
	*/
	public void setLgDesc(String lgDesc ){
		this.lgDesc = lgDesc;
	}
	
	/**
	* 冻结金额变更0表示未变更
	*@return 
	*/
	public BigDecimal getLgFreezeAmount(){
		return  lgFreezeAmount;
	}
	/**
	* 冻结金额变更0表示未变更
	*@param  lgFreezeAmount
	*/
	public void setLgFreezeAmount(BigDecimal lgFreezeAmount ){
		this.lgFreezeAmount = lgFreezeAmount;
	}
	
	/**
	* 会员名称
	*@return 
	*/
	public String getLgMemberName(){
		return  lgMemberName;
	}
	/**
	* 会员名称
	*@param  lgMemberName
	*/
	public void setLgMemberName(String lgMemberName ){
		this.lgMemberName = lgMemberName;
	}
	
	/**
	* order_pay下单支付预存款,order_freeze下单冻结预存款,order_cancel取消订单解冻预存款,order_comb_pay下单支付被冻结的预存款,recharge充值,cash_apply申请提现冻结预存款,cash_pay提现成功,cash_del取消提现申请，解冻预存款,refund退款
	*@return 
	*/
	public String getLgType(){
		return  lgType;
	}
	/**
	* order_pay下单支付预存款,order_freeze下单冻结预存款,order_cancel取消订单解冻预存款,order_comb_pay下单支付被冻结的预存款,recharge充值,cash_apply申请提现冻结预存款,cash_pay提现成功,cash_del取消提现申请，解冻预存款,refund退款
	*@param  lgType
	*/
	public void setLgType(String lgType ){
		this.lgType = lgType;
	}
	

}
