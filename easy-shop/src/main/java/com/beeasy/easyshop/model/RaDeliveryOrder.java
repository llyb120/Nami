package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_delivery_order")
public class RaDeliveryOrder   {
	
	// alias
	public static final String ALIAS_order_id = "order_id";
	public static final String ALIAS_addtime = "addtime";
	public static final String ALIAS_dlyo_state = "dlyo_state";
	public static final String ALIAS_dlyp_id = "dlyp_id";
	public static final String ALIAS_dlyo_pickup_code = "dlyo_pickup_code";
	public static final String ALIAS_express_code = "express_code";
	public static final String ALIAS_express_name = "express_name";
	public static final String ALIAS_order_sn = "order_sn";
	public static final String ALIAS_reciver_mobphone = "reciver_mobphone";
	public static final String ALIAS_reciver_name = "reciver_name";
	public static final String ALIAS_reciver_telphone = "reciver_telphone";
	public static final String ALIAS_shipping_code = "shipping_code";
	
	/*
	订单ID
	*/
	private Integer order_id ;
	/*
	订单生成时间
	*/
	private Integer addtime ;
	/*
	订单状态 10(默认)未到站，20已到站，30已提取
	*/
	private Integer dlyo_state ;
	/*
	自提点ID
	*/
	private Integer dlyp_id ;
	/*
	提货码
	*/
	private String dlyo_pickup_code ;
	/*
	快递公司编码
	*/
	private String express_code ;
	/*
	快递公司名称
	*/
	private String express_name ;
	/*
	订单号
	*/
	private Long order_sn ;
	/*
	手机
	*/
	private String reciver_mobphone ;
	/*
	收货人
	*/
	private String reciver_name ;
	/*
	电话
	*/
	private String reciver_telphone ;
	/*
	物流单号
	*/
	private String shipping_code ;
	
	public RaDeliveryOrder() {
	}
	
	/**
	* 订单ID
	*@return 
	*/
	public Integer getOrder_id(){
		return  order_id;
	}
	/**
	* 订单ID
	*@param  order_id
	*/
	public void setOrder_id(Integer order_id ){
		this.order_id = order_id;
	}
	
	/**
	* 订单生成时间
	*@return 
	*/
	public Integer getAddtime(){
		return  addtime;
	}
	/**
	* 订单生成时间
	*@param  addtime
	*/
	public void setAddtime(Integer addtime ){
		this.addtime = addtime;
	}
	
	/**
	* 订单状态 10(默认)未到站，20已到站，30已提取
	*@return 
	*/
	public Integer getDlyo_state(){
		return  dlyo_state;
	}
	/**
	* 订单状态 10(默认)未到站，20已到站，30已提取
	*@param  dlyo_state
	*/
	public void setDlyo_state(Integer dlyo_state ){
		this.dlyo_state = dlyo_state;
	}
	
	/**
	* 自提点ID
	*@return 
	*/
	public Integer getDlyp_id(){
		return  dlyp_id;
	}
	/**
	* 自提点ID
	*@param  dlyp_id
	*/
	public void setDlyp_id(Integer dlyp_id ){
		this.dlyp_id = dlyp_id;
	}
	
	/**
	* 提货码
	*@return 
	*/
	public String getDlyo_pickup_code(){
		return  dlyo_pickup_code;
	}
	/**
	* 提货码
	*@param  dlyo_pickup_code
	*/
	public void setDlyo_pickup_code(String dlyo_pickup_code ){
		this.dlyo_pickup_code = dlyo_pickup_code;
	}
	
	/**
	* 快递公司编码
	*@return 
	*/
	public String getExpress_code(){
		return  express_code;
	}
	/**
	* 快递公司编码
	*@param  express_code
	*/
	public void setExpress_code(String express_code ){
		this.express_code = express_code;
	}
	
	/**
	* 快递公司名称
	*@return 
	*/
	public String getExpress_name(){
		return  express_name;
	}
	/**
	* 快递公司名称
	*@param  express_name
	*/
	public void setExpress_name(String express_name ){
		this.express_name = express_name;
	}
	
	/**
	* 订单号
	*@return 
	*/
	public Long getOrder_sn(){
		return  order_sn;
	}
	/**
	* 订单号
	*@param  order_sn
	*/
	public void setOrder_sn(Long order_sn ){
		this.order_sn = order_sn;
	}
	
	/**
	* 手机
	*@return 
	*/
	public String getReciver_mobphone(){
		return  reciver_mobphone;
	}
	/**
	* 手机
	*@param  reciver_mobphone
	*/
	public void setReciver_mobphone(String reciver_mobphone ){
		this.reciver_mobphone = reciver_mobphone;
	}
	
	/**
	* 收货人
	*@return 
	*/
	public String getReciver_name(){
		return  reciver_name;
	}
	/**
	* 收货人
	*@param  reciver_name
	*/
	public void setReciver_name(String reciver_name ){
		this.reciver_name = reciver_name;
	}
	
	/**
	* 电话
	*@return 
	*/
	public String getReciver_telphone(){
		return  reciver_telphone;
	}
	/**
	* 电话
	*@param  reciver_telphone
	*/
	public void setReciver_telphone(String reciver_telphone ){
		this.reciver_telphone = reciver_telphone;
	}
	
	/**
	* 物流单号
	*@return 
	*/
	public String getShipping_code(){
		return  shipping_code;
	}
	/**
	* 物流单号
	*@param  shipping_code
	*/
	public void setShipping_code(String shipping_code ){
		this.shipping_code = shipping_code;
	}
	

}
