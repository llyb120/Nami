package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_vr_refund")
public class RaVrRefund   {
	
	// alias
	public static final String ALIAS_refund_id = "refund_id";
	public static final String ALIAS_add_time = "add_time";
	public static final String ALIAS_admin_state = "admin_state";
	public static final String ALIAS_admin_time = "admin_time";
	public static final String ALIAS_buyer_id = "buyer_id";
	public static final String ALIAS_commis_rate = "commis_rate";
	public static final String ALIAS_goods_id = "goods_id";
	public static final String ALIAS_goods_num = "goods_num";
	public static final String ALIAS_order_id = "order_id";
	public static final String ALIAS_store_id = "store_id";
	public static final String ALIAS_admin_message = "admin_message";
	public static final String ALIAS_buyer_message = "buyer_message";
	public static final String ALIAS_buyer_name = "buyer_name";
	public static final String ALIAS_code_sn = "code_sn";
	public static final String ALIAS_goods_image = "goods_image";
	public static final String ALIAS_goods_name = "goods_name";
	public static final String ALIAS_order_sn = "order_sn";
	public static final String ALIAS_refund_amount = "refund_amount";
	public static final String ALIAS_refund_sn = "refund_sn";
	public static final String ALIAS_store_name = "store_name";
	
	/*
	记录ID
	*/
	private Integer refund_id ;
	/*
	添加时间
	*/
	private Integer add_time ;
	/*
	退款状态:1为待审核,2为同意,3为不同意,默认为1
	*/
	private Integer admin_state ;
	/*
	管理员处理时间,默认为0
	*/
	private Integer admin_time ;
	/*
	买家ID
	*/
	private Integer buyer_id ;
	/*
	佣金比例
	*/
	private Integer commis_rate ;
	/*
	商品ID
	*/
	private Integer goods_id ;
	/*
	退款商品数量
	*/
	private Integer goods_num ;
	/*
	虚拟订单ID
	*/
	private Integer order_id ;
	/*
	店铺ID
	*/
	private Integer store_id ;
	/*
	管理员备注
	*/
	private String admin_message ;
	/*
	申请原因
	*/
	private String buyer_message ;
	/*
	买家会员名
	*/
	private String buyer_name ;
	/*
	兑换码编号
	*/
	private String code_sn ;
	/*
	商品图片
	*/
	private String goods_image ;
	/*
	商品名称
	*/
	private String goods_name ;
	/*
	虚拟订单编号
	*/
	private String order_sn ;
	/*
	退款金额
	*/
	private BigDecimal refund_amount ;
	/*
	申请编号
	*/
	private String refund_sn ;
	/*
	店铺名称
	*/
	private String store_name ;
	
	public RaVrRefund() {
	}
	
	/**
	* 记录ID
	*@return 
	*/
	public Integer getRefund_id(){
		return  refund_id;
	}
	/**
	* 记录ID
	*@param  refund_id
	*/
	public void setRefund_id(Integer refund_id ){
		this.refund_id = refund_id;
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
	* 退款状态:1为待审核,2为同意,3为不同意,默认为1
	*@return 
	*/
	public Integer getAdmin_state(){
		return  admin_state;
	}
	/**
	* 退款状态:1为待审核,2为同意,3为不同意,默认为1
	*@param  admin_state
	*/
	public void setAdmin_state(Integer admin_state ){
		this.admin_state = admin_state;
	}
	
	/**
	* 管理员处理时间,默认为0
	*@return 
	*/
	public Integer getAdmin_time(){
		return  admin_time;
	}
	/**
	* 管理员处理时间,默认为0
	*@param  admin_time
	*/
	public void setAdmin_time(Integer admin_time ){
		this.admin_time = admin_time;
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
	* 佣金比例
	*@return 
	*/
	public Integer getCommis_rate(){
		return  commis_rate;
	}
	/**
	* 佣金比例
	*@param  commis_rate
	*/
	public void setCommis_rate(Integer commis_rate ){
		this.commis_rate = commis_rate;
	}
	
	/**
	* 商品ID
	*@return 
	*/
	public Integer getGoods_id(){
		return  goods_id;
	}
	/**
	* 商品ID
	*@param  goods_id
	*/
	public void setGoods_id(Integer goods_id ){
		this.goods_id = goods_id;
	}
	
	/**
	* 退款商品数量
	*@return 
	*/
	public Integer getGoods_num(){
		return  goods_num;
	}
	/**
	* 退款商品数量
	*@param  goods_num
	*/
	public void setGoods_num(Integer goods_num ){
		this.goods_num = goods_num;
	}
	
	/**
	* 虚拟订单ID
	*@return 
	*/
	public Integer getOrder_id(){
		return  order_id;
	}
	/**
	* 虚拟订单ID
	*@param  order_id
	*/
	public void setOrder_id(Integer order_id ){
		this.order_id = order_id;
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
	* 管理员备注
	*@return 
	*/
	public String getAdmin_message(){
		return  admin_message;
	}
	/**
	* 管理员备注
	*@param  admin_message
	*/
	public void setAdmin_message(String admin_message ){
		this.admin_message = admin_message;
	}
	
	/**
	* 申请原因
	*@return 
	*/
	public String getBuyer_message(){
		return  buyer_message;
	}
	/**
	* 申请原因
	*@param  buyer_message
	*/
	public void setBuyer_message(String buyer_message ){
		this.buyer_message = buyer_message;
	}
	
	/**
	* 买家会员名
	*@return 
	*/
	public String getBuyer_name(){
		return  buyer_name;
	}
	/**
	* 买家会员名
	*@param  buyer_name
	*/
	public void setBuyer_name(String buyer_name ){
		this.buyer_name = buyer_name;
	}
	
	/**
	* 兑换码编号
	*@return 
	*/
	public String getCode_sn(){
		return  code_sn;
	}
	/**
	* 兑换码编号
	*@param  code_sn
	*/
	public void setCode_sn(String code_sn ){
		this.code_sn = code_sn;
	}
	
	/**
	* 商品图片
	*@return 
	*/
	public String getGoods_image(){
		return  goods_image;
	}
	/**
	* 商品图片
	*@param  goods_image
	*/
	public void setGoods_image(String goods_image ){
		this.goods_image = goods_image;
	}
	
	/**
	* 商品名称
	*@return 
	*/
	public String getGoods_name(){
		return  goods_name;
	}
	/**
	* 商品名称
	*@param  goods_name
	*/
	public void setGoods_name(String goods_name ){
		this.goods_name = goods_name;
	}
	
	/**
	* 虚拟订单编号
	*@return 
	*/
	public String getOrder_sn(){
		return  order_sn;
	}
	/**
	* 虚拟订单编号
	*@param  order_sn
	*/
	public void setOrder_sn(String order_sn ){
		this.order_sn = order_sn;
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
	* 申请编号
	*@return 
	*/
	public String getRefund_sn(){
		return  refund_sn;
	}
	/**
	* 申请编号
	*@param  refund_sn
	*/
	public void setRefund_sn(String refund_sn ){
		this.refund_sn = refund_sn;
	}
	
	/**
	* 店铺名称
	*@return 
	*/
	public String getStore_name(){
		return  store_name;
	}
	/**
	* 店铺名称
	*@param  store_name
	*/
	public void setStore_name(String store_name ){
		this.store_name = store_name;
	}
	

}
