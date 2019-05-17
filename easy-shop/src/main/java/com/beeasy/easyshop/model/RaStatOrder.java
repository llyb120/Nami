package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_stat_order")
public class RaStatOrder   {
	
	// alias
	public static final String ALIAS_buyer_id = "buyer_id";
	public static final String ALIAS_grade_id = "grade_id";
	public static final String ALIAS_order_add_time = "order_add_time";
	public static final String ALIAS_order_id = "order_id";
	public static final String ALIAS_order_isvalid = "order_isvalid";
	public static final String ALIAS_reciver_province_id = "reciver_province_id";
	public static final String ALIAS_refund_state = "refund_state";
	public static final String ALIAS_sc_id = "sc_id";
	public static final String ALIAS_store_id = "store_id";
	public static final String ALIAS_buyer_name = "buyer_name";
	public static final String ALIAS_evaluation_state = "evaluation_state";
	public static final String ALIAS_order_amount = "order_amount";
	public static final String ALIAS_order_from = "order_from";
	public static final String ALIAS_order_sn = "order_sn";
	public static final String ALIAS_order_state = "order_state";
	public static final String ALIAS_payment_code = "payment_code";
	public static final String ALIAS_refund_amount = "refund_amount";
	public static final String ALIAS_shipping_fee = "shipping_fee";
	public static final String ALIAS_store_name = "store_name";
	
	/*
	买家ID
	*/
	private Integer buyer_id ;
	/*
	店铺等级
	*/
	private Integer grade_id ;
	/*
	订单生成时间
	*/
	private Integer order_add_time ;
	/*
	订单id
	*/
	private Integer order_id ;
	/*
	是否为计入统计的有效订单，0为无效 1为有效
	*/
	private Integer order_isvalid ;
	/*
	收货人省级ID
	*/
	private Integer reciver_province_id ;
	/*
	退款状态:0是无退款,1是部分退款,2是全部退款
	*/
	private Integer refund_state ;
	/*
	店铺分类
	*/
	private Integer sc_id ;
	/*
	店铺ID
	*/
	private Integer store_id ;
	/*
	买家姓名
	*/
	private String buyer_name ;
	/*
	评价状态 0未评价，1已评价
	*/
	private String evaluation_state ;
	/*
	订单总价格
	*/
	private BigDecimal order_amount ;
	/*
	1WEB2mobile
	*/
	private String order_from ;
	/*
	订单编号
	*/
	private Long order_sn ;
	/*
	订单状态：0(已取消)10(默认):未付款;20:已付款;30:已发货;40:已收货;
	*/
	private String order_state ;
	/*
	支付方式
	*/
	private String payment_code ;
	/*
	退款金额
	*/
	private BigDecimal refund_amount ;
	/*
	运费
	*/
	private BigDecimal shipping_fee ;
	/*
	卖家店铺名称
	*/
	private String store_name ;
	
	public RaStatOrder() {
	}
	
	/**
	* 买家ID
	*@return 
	*/
	public Integer getBuyer_id(){
		return  buyer_id;
	}
	/**
	* 买家ID
	*@param  buyer_id
	*/
	public void setBuyer_id(Integer buyer_id ){
		this.buyer_id = buyer_id;
	}
	
	/**
	* 店铺等级
	*@return 
	*/
	public Integer getGrade_id(){
		return  grade_id;
	}
	/**
	* 店铺等级
	*@param  grade_id
	*/
	public void setGrade_id(Integer grade_id ){
		this.grade_id = grade_id;
	}
	
	/**
	* 订单生成时间
	*@return 
	*/
	public Integer getOrder_add_time(){
		return  order_add_time;
	}
	/**
	* 订单生成时间
	*@param  order_add_time
	*/
	public void setOrder_add_time(Integer order_add_time ){
		this.order_add_time = order_add_time;
	}
	
	/**
	* 订单id
	*@return 
	*/
	public Integer getOrder_id(){
		return  order_id;
	}
	/**
	* 订单id
	*@param  order_id
	*/
	public void setOrder_id(Integer order_id ){
		this.order_id = order_id;
	}
	
	/**
	* 是否为计入统计的有效订单，0为无效 1为有效
	*@return 
	*/
	public Integer getOrder_isvalid(){
		return  order_isvalid;
	}
	/**
	* 是否为计入统计的有效订单，0为无效 1为有效
	*@param  order_isvalid
	*/
	public void setOrder_isvalid(Integer order_isvalid ){
		this.order_isvalid = order_isvalid;
	}
	
	/**
	* 收货人省级ID
	*@return 
	*/
	public Integer getReciver_province_id(){
		return  reciver_province_id;
	}
	/**
	* 收货人省级ID
	*@param  reciver_province_id
	*/
	public void setReciver_province_id(Integer reciver_province_id ){
		this.reciver_province_id = reciver_province_id;
	}
	
	/**
	* 退款状态:0是无退款,1是部分退款,2是全部退款
	*@return 
	*/
	public Integer getRefund_state(){
		return  refund_state;
	}
	/**
	* 退款状态:0是无退款,1是部分退款,2是全部退款
	*@param  refund_state
	*/
	public void setRefund_state(Integer refund_state ){
		this.refund_state = refund_state;
	}
	
	/**
	* 店铺分类
	*@return 
	*/
	public Integer getSc_id(){
		return  sc_id;
	}
	/**
	* 店铺分类
	*@param  sc_id
	*/
	public void setSc_id(Integer sc_id ){
		this.sc_id = sc_id;
	}
	
	/**
	* 店铺ID
	*@return 
	*/
	public Integer getStore_id(){
		return  store_id;
	}
	/**
	* 店铺ID
	*@param  store_id
	*/
	public void setStore_id(Integer store_id ){
		this.store_id = store_id;
	}
	
	/**
	* 买家姓名
	*@return 
	*/
	public String getBuyer_name(){
		return  buyer_name;
	}
	/**
	* 买家姓名
	*@param  buyer_name
	*/
	public void setBuyer_name(String buyer_name ){
		this.buyer_name = buyer_name;
	}
	
	/**
	* 评价状态 0未评价，1已评价
	*@return 
	*/
	public String getEvaluation_state(){
		return  evaluation_state;
	}
	/**
	* 评价状态 0未评价，1已评价
	*@param  evaluation_state
	*/
	public void setEvaluation_state(String evaluation_state ){
		this.evaluation_state = evaluation_state;
	}
	
	/**
	* 订单总价格
	*@return 
	*/
	public BigDecimal getOrder_amount(){
		return  order_amount;
	}
	/**
	* 订单总价格
	*@param  order_amount
	*/
	public void setOrder_amount(BigDecimal order_amount ){
		this.order_amount = order_amount;
	}
	
	/**
	* 1WEB2mobile
	*@return 
	*/
	public String getOrder_from(){
		return  order_from;
	}
	/**
	* 1WEB2mobile
	*@param  order_from
	*/
	public void setOrder_from(String order_from ){
		this.order_from = order_from;
	}
	
	/**
	* 订单编号
	*@return 
	*/
	public Long getOrder_sn(){
		return  order_sn;
	}
	/**
	* 订单编号
	*@param  order_sn
	*/
	public void setOrder_sn(Long order_sn ){
		this.order_sn = order_sn;
	}
	
	/**
	* 订单状态：0(已取消)10(默认):未付款;20:已付款;30:已发货;40:已收货;
	*@return 
	*/
	public String getOrder_state(){
		return  order_state;
	}
	/**
	* 订单状态：0(已取消)10(默认):未付款;20:已付款;30:已发货;40:已收货;
	*@param  order_state
	*/
	public void setOrder_state(String order_state ){
		this.order_state = order_state;
	}
	
	/**
	* 支付方式
	*@return 
	*/
	public String getPayment_code(){
		return  payment_code;
	}
	/**
	* 支付方式
	*@param  payment_code
	*/
	public void setPayment_code(String payment_code ){
		this.payment_code = payment_code;
	}
	
	/**
	* 退款金额
	*@return 
	*/
	public BigDecimal getRefund_amount(){
		return  refund_amount;
	}
	/**
	* 退款金额
	*@param  refund_amount
	*/
	public void setRefund_amount(BigDecimal refund_amount ){
		this.refund_amount = refund_amount;
	}
	
	/**
	* 运费
	*@return 
	*/
	public BigDecimal getShipping_fee(){
		return  shipping_fee;
	}
	/**
	* 运费
	*@param  shipping_fee
	*/
	public void setShipping_fee(BigDecimal shipping_fee ){
		this.shipping_fee = shipping_fee;
	}
	
	/**
	* 卖家店铺名称
	*@return 
	*/
	public String getStore_name(){
		return  store_name;
	}
	/**
	* 卖家店铺名称
	*@param  store_name
	*/
	public void setStore_name(String store_name ){
		this.store_name = store_name;
	}
	

}
