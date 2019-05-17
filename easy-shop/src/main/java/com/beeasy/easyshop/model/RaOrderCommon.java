package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_order_common")
public class RaOrderCommon   {
	
	// alias
	public static final String ALIAS_order_id = "order_id";
	public static final String ALIAS_daddress_id = "daddress_id";
	public static final String ALIAS_evalseller_time = "evalseller_time";
	public static final String ALIAS_evaluation_time = "evaluation_time";
	public static final String ALIAS_order_pointscount = "order_pointscount";
	public static final String ALIAS_reciver_area_id = "reciver_area_id";
	public static final String ALIAS_reciver_city_id = "reciver_city_id";
	public static final String ALIAS_reciver_province_id = "reciver_province_id";
	public static final String ALIAS_shipping_express_id = "shipping_express_id";
	public static final String ALIAS_shipping_time = "shipping_time";
	public static final String ALIAS_store_id = "store_id";
	public static final String ALIAS_voucher_price = "voucher_price";
	public static final String ALIAS_address = "address";
	public static final String ALIAS_deliver_explain = "deliver_explain";
	public static final String ALIAS_dlyo_pickup_code = "dlyo_pickup_code";
	public static final String ALIAS_evalseller_state = "evalseller_state";
	public static final String ALIAS_idcard = "idcard";
	public static final String ALIAS_invoice_info = "invoice_info";
	public static final String ALIAS_order_message = "order_message";
	public static final String ALIAS_phone = "phone";
	public static final String ALIAS_promotion_info = "promotion_info";
	public static final String ALIAS_reciver_info = "reciver_info";
	public static final String ALIAS_reciver_name = "reciver_name";
	public static final String ALIAS_voucher_code = "voucher_code";
	
	/*
	订单索引id
	*/
	private Integer order_id ;
	/*
	发货地址ID
	*/
	private Integer daddress_id ;
	/*
	卖家评价买家的时间
	*/
	private Integer evalseller_time ;
	/*
	评价时间
	*/
	private Integer evaluation_time ;
	/*
	订单赠送积分
	*/
	private Integer order_pointscount ;
	private Integer reciver_area_id ;
	/*
	收货人市级ID
	*/
	private Integer reciver_city_id ;
	/*
	收货人省级ID
	*/
	private Integer reciver_province_id ;
	/*
	配送公司ID
	*/
	private Integer shipping_express_id ;
	/*
	配送时间
	*/
	private Integer shipping_time ;
	/*
	店铺ID
	*/
	private Integer store_id ;
	/*
	代金券面额
	*/
	private Integer voucher_price ;
	private String address ;
	/*
	发货备注
	*/
	private String deliver_explain ;
	/*
	提货码
	*/
	private String dlyo_pickup_code ;
	/*
	卖家是否已评价买家
	*/
	private String evalseller_state ;
	private String idcard ;
	/*
	发票信息
	*/
	private String invoice_info ;
	/*
	订单留言
	*/
	private String order_message ;
	private String phone ;
	/*
	促销信息备注
	*/
	private String promotion_info ;
	/*
	收货人其它信息
	*/
	private String reciver_info ;
	/*
	收货人姓名
	*/
	private String reciver_name ;
	/*
	代金券编码
	*/
	private String voucher_code ;
	
	public RaOrderCommon() {
	}
	
	/**
	* 订单索引id
	*@return 
	*/
	public Integer getOrder_id(){
		return  order_id;
	}
	/**
	* 订单索引id
	*@param  order_id
	*/
	public void setOrder_id(Integer order_id ){
		this.order_id = order_id;
	}
	
	/**
	* 发货地址ID
	*@return 
	*/
	public Integer getDaddress_id(){
		return  daddress_id;
	}
	/**
	* 发货地址ID
	*@param  daddress_id
	*/
	public void setDaddress_id(Integer daddress_id ){
		this.daddress_id = daddress_id;
	}
	
	/**
	* 卖家评价买家的时间
	*@return 
	*/
	public Integer getEvalseller_time(){
		return  evalseller_time;
	}
	/**
	* 卖家评价买家的时间
	*@param  evalseller_time
	*/
	public void setEvalseller_time(Integer evalseller_time ){
		this.evalseller_time = evalseller_time;
	}
	
	/**
	* 评价时间
	*@return 
	*/
	public Integer getEvaluation_time(){
		return  evaluation_time;
	}
	/**
	* 评价时间
	*@param  evaluation_time
	*/
	public void setEvaluation_time(Integer evaluation_time ){
		this.evaluation_time = evaluation_time;
	}
	
	/**
	* 订单赠送积分
	*@return 
	*/
	public Integer getOrder_pointscount(){
		return  order_pointscount;
	}
	/**
	* 订单赠送积分
	*@param  order_pointscount
	*/
	public void setOrder_pointscount(Integer order_pointscount ){
		this.order_pointscount = order_pointscount;
	}
	
	public Integer getReciver_area_id(){
		return  reciver_area_id;
	}
	public void setReciver_area_id(Integer reciver_area_id ){
		this.reciver_area_id = reciver_area_id;
	}
	
	/**
	* 收货人市级ID
	*@return 
	*/
	public Integer getReciver_city_id(){
		return  reciver_city_id;
	}
	/**
	* 收货人市级ID
	*@param  reciver_city_id
	*/
	public void setReciver_city_id(Integer reciver_city_id ){
		this.reciver_city_id = reciver_city_id;
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
	* 配送公司ID
	*@return 
	*/
	public Integer getShipping_express_id(){
		return  shipping_express_id;
	}
	/**
	* 配送公司ID
	*@param  shipping_express_id
	*/
	public void setShipping_express_id(Integer shipping_express_id ){
		this.shipping_express_id = shipping_express_id;
	}
	
	/**
	* 配送时间
	*@return 
	*/
	public Integer getShipping_time(){
		return  shipping_time;
	}
	/**
	* 配送时间
	*@param  shipping_time
	*/
	public void setShipping_time(Integer shipping_time ){
		this.shipping_time = shipping_time;
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
	* 代金券面额
	*@return 
	*/
	public Integer getVoucher_price(){
		return  voucher_price;
	}
	/**
	* 代金券面额
	*@param  voucher_price
	*/
	public void setVoucher_price(Integer voucher_price ){
		this.voucher_price = voucher_price;
	}
	
	public String getAddress(){
		return  address;
	}
	public void setAddress(String address ){
		this.address = address;
	}
	
	/**
	* 发货备注
	*@return 
	*/
	public String getDeliver_explain(){
		return  deliver_explain;
	}
	/**
	* 发货备注
	*@param  deliver_explain
	*/
	public void setDeliver_explain(String deliver_explain ){
		this.deliver_explain = deliver_explain;
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
	* 卖家是否已评价买家
	*@return 
	*/
	public String getEvalseller_state(){
		return  evalseller_state;
	}
	/**
	* 卖家是否已评价买家
	*@param  evalseller_state
	*/
	public void setEvalseller_state(String evalseller_state ){
		this.evalseller_state = evalseller_state;
	}
	
	public String getIdcard(){
		return  idcard;
	}
	public void setIdcard(String idcard ){
		this.idcard = idcard;
	}
	
	/**
	* 发票信息
	*@return 
	*/
	public String getInvoice_info(){
		return  invoice_info;
	}
	/**
	* 发票信息
	*@param  invoice_info
	*/
	public void setInvoice_info(String invoice_info ){
		this.invoice_info = invoice_info;
	}
	
	/**
	* 订单留言
	*@return 
	*/
	public String getOrder_message(){
		return  order_message;
	}
	/**
	* 订单留言
	*@param  order_message
	*/
	public void setOrder_message(String order_message ){
		this.order_message = order_message;
	}
	
	public String getPhone(){
		return  phone;
	}
	public void setPhone(String phone ){
		this.phone = phone;
	}
	
	/**
	* 促销信息备注
	*@return 
	*/
	public String getPromotion_info(){
		return  promotion_info;
	}
	/**
	* 促销信息备注
	*@param  promotion_info
	*/
	public void setPromotion_info(String promotion_info ){
		this.promotion_info = promotion_info;
	}
	
	/**
	* 收货人其它信息
	*@return 
	*/
	public String getReciver_info(){
		return  reciver_info;
	}
	/**
	* 收货人其它信息
	*@param  reciver_info
	*/
	public void setReciver_info(String reciver_info ){
		this.reciver_info = reciver_info;
	}
	
	/**
	* 收货人姓名
	*@return 
	*/
	public String getReciver_name(){
		return  reciver_name;
	}
	/**
	* 收货人姓名
	*@param  reciver_name
	*/
	public void setReciver_name(String reciver_name ){
		this.reciver_name = reciver_name;
	}
	
	/**
	* 代金券编码
	*@return 
	*/
	public String getVoucher_code(){
		return  voucher_code;
	}
	/**
	* 代金券编码
	*@param  voucher_code
	*/
	public void setVoucher_code(String voucher_code ){
		this.voucher_code = voucher_code;
	}
	

}
