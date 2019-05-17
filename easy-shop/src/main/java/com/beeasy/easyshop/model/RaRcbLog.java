package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_rcb_log")
public class RaRcbLog   {
	
	// alias
	public static final String ALIAS_id = "id";
	public static final String ALIAS_add_time = "add_time";
	public static final String ALIAS_member_id = "member_id";
	public static final String ALIAS_available_amount = "available_amount";
	public static final String ALIAS_description = "description";
	public static final String ALIAS_freeze_amount = "freeze_amount";
	public static final String ALIAS_member_name = "member_name";
	public static final String ALIAS_type = "type";
	
	/*
	自增编号
	*/
	private Integer id ;
	/*
	添加时间
	*/
	private Integer add_time ;
	/*
	会员编号
	*/
	private Integer member_id ;
	/*
	可用充值卡余额变更 0表示未变更
	*/
	private BigDecimal available_amount ;
	/*
	描述
	*/
	private String description ;
	/*
	冻结充值卡余额变更 0表示未变更
	*/
	private BigDecimal freeze_amount ;
	/*
	会员名称
	*/
	private String member_name ;
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
	public Integer getAdd_time(){
		return  add_time;
	}
	/**
	* 添加时间
	*@param  add_time
	*/
	public void setAdd_time(Integer add_time ){
		this.add_time = add_time;
	}
	
	/**
	* 会员编号
	*@return 
	*/
	public Integer getMember_id(){
		return  member_id;
	}
	/**
	* 会员编号
	*@param  member_id
	*/
	public void setMember_id(Integer member_id ){
		this.member_id = member_id;
	}
	
	/**
	* 可用充值卡余额变更 0表示未变更
	*@return 
	*/
	public BigDecimal getAvailable_amount(){
		return  available_amount;
	}
	/**
	* 可用充值卡余额变更 0表示未变更
	*@param  available_amount
	*/
	public void setAvailable_amount(BigDecimal available_amount ){
		this.available_amount = available_amount;
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
	public BigDecimal getFreeze_amount(){
		return  freeze_amount;
	}
	/**
	* 冻结充值卡余额变更 0表示未变更
	*@param  freeze_amount
	*/
	public void setFreeze_amount(BigDecimal freeze_amount ){
		this.freeze_amount = freeze_amount;
	}
	
	/**
	* 会员名称
	*@return 
	*/
	public String getMember_name(){
		return  member_name;
	}
	/**
	* 会员名称
	*@param  member_name
	*/
	public void setMember_name(String member_name ){
		this.member_name = member_name;
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
