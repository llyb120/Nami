package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_rcb_log")
public class RaRcbLog   {
	
	/*
	自增编号
	*/
	private Integer id ;
	/*
	添加时间
	*/
	private Integer addTime ;
	/*
	会员编号
	*/
	private Integer memberId ;
	/*
	可用充值卡余额变更 0表示未变更
	*/
	private BigDecimal availableAmount ;
	/*
	描述
	*/
	private String description ;
	/*
	冻结充值卡余额变更 0表示未变更
	*/
	private BigDecimal freezeAmount ;
	/*
	会员名称
	*/
	private String memberName ;
	/*
	order_pay下单使用 order_freeze下单冻结 order_cancel取消订单解冻 order_comb_pay下单扣除被冻结 recharge平台充值卡充值 refund确认退款 vr_refund虚拟兑码退款
	*/
	private String type ;
	
	public RaRcbLog() {
	}
	
	/**
	* 自增编号
	*@return 
	*/
	public Integer getId(){
		return  id;
	}
	/**
	* 自增编号
	*@param  id
	*/
	public void setId(Integer id ){
		this.id = id;
	}
	
	/**
	* 添加时间
	*@return 
	*/
	public Integer getAddTime(){
		return  addTime;
	}
	/**
	* 添加时间
	*@param  addTime
	*/
	public void setAddTime(Integer addTime ){
		this.addTime = addTime;
	}
	
	/**
	* 会员编号
	*@return 
	*/
	public Integer getMemberId(){
		return  memberId;
	}
	/**
	* 会员编号
	*@param  memberId
	*/
	public void setMemberId(Integer memberId ){
		this.memberId = memberId;
	}
	
	/**
	* 可用充值卡余额变更 0表示未变更
	*@return 
	*/
	public BigDecimal getAvailableAmount(){
		return  availableAmount;
	}
	/**
	* 可用充值卡余额变更 0表示未变更
	*@param  availableAmount
	*/
	public void setAvailableAmount(BigDecimal availableAmount ){
		this.availableAmount = availableAmount;
	}
	
	/**
	* 描述
	*@return 
	*/
	public String getDescription(){
		return  description;
	}
	/**
	* 描述
	*@param  description
	*/
	public void setDescription(String description ){
		this.description = description;
	}
	
	/**
	* 冻结充值卡余额变更 0表示未变更
	*@return 
	*/
	public BigDecimal getFreezeAmount(){
		return  freezeAmount;
	}
	/**
	* 冻结充值卡余额变更 0表示未变更
	*@param  freezeAmount
	*/
	public void setFreezeAmount(BigDecimal freezeAmount ){
		this.freezeAmount = freezeAmount;
	}
	
	/**
	* 会员名称
	*@return 
	*/
	public String getMemberName(){
		return  memberName;
	}
	/**
	* 会员名称
	*@param  memberName
	*/
	public void setMemberName(String memberName ){
		this.memberName = memberName;
	}
	
	/**
	* order_pay下单使用 order_freeze下单冻结 order_cancel取消订单解冻 order_comb_pay下单扣除被冻结 recharge平台充值卡充值 refund确认退款 vr_refund虚拟兑码退款
	*@return 
	*/
	public String getType(){
		return  type;
	}
	/**
	* order_pay下单使用 order_freeze下单冻结 order_cancel取消订单解冻 order_comb_pay下单扣除被冻结 recharge平台充值卡充值 refund确认退款 vr_refund虚拟兑码退款
	*@param  type
	*/
	public void setType(String type ){
		this.type = type;
	}
	

}
