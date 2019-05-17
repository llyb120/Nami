package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_refund_return")
public class RaRefundReturn   {
	
	// alias
	public static final String ALIAS_refund_id = "refund_id";
	public static final String ALIAS_add_time = "add_time";
	public static final String ALIAS_admin_time = "admin_time";
	public static final String ALIAS_buyer_id = "buyer_id";
	public static final String ALIAS_commis_rate = "commis_rate";
	public static final String ALIAS_daddress_id = "daddress_id";
	public static final String ALIAS_delay_time = "delay_time";
	public static final String ALIAS_express_id = "express_id";
	public static final String ALIAS_goods_id = "goods_id";
	public static final String ALIAS_goods_num = "goods_num";
	public static final String ALIAS_goods_state = "goods_state";
	public static final String ALIAS_order_goods_id = "order_goods_id";
	public static final String ALIAS_order_goods_type = "order_goods_type";
	public static final String ALIAS_order_id = "order_id";
	public static final String ALIAS_order_lock = "order_lock";
	public static final String ALIAS_reason_id = "reason_id";
	public static final String ALIAS_receive_time = "receive_time";
	public static final String ALIAS_refund_state = "refund_state";
	public static final String ALIAS_refund_type = "refund_type";
	public static final String ALIAS_return_type = "return_type";
	public static final String ALIAS_seller_state = "seller_state";
	public static final String ALIAS_seller_time = "seller_time";
	public static final String ALIAS_ship_time = "ship_time";
	public static final String ALIAS_store_id = "store_id";
	public static final String ALIAS_admin_message = "admin_message";
	public static final String ALIAS_buyer_message = "buyer_message";
	public static final String ALIAS_buyer_name = "buyer_name";
	public static final String ALIAS_goods_image = "goods_image";
	public static final String ALIAS_goods_name = "goods_name";
	public static final String ALIAS_invoice_no = "invoice_no";
	public static final String ALIAS_order_sn = "order_sn";
	public static final String ALIAS_pic_info = "pic_info";
	public static final String ALIAS_reason_info = "reason_info";
	public static final String ALIAS_receive_message = "receive_message";
	public static final String ALIAS_refund_address = "refund_address";
	public static final String ALIAS_refund_amount = "refund_amount";
	public static final String ALIAS_refund_sn = "refund_sn";
	public static final String ALIAS_seller_message = "seller_message";
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
	private Integer daddress_id ;
	/*
	收货延迟时间,默认为0
	*/
	private Integer delay_time ;
	/*
	物流公司编号
	*/
	private Integer express_id ;
	/*
	商品ID,全部退款是0
	*/
	private Integer goods_id ;
	/*
	商品数量
	*/
	private Integer goods_num ;
	/*
	物流状态:1为待发货,2为待收货,3为未收到,4为已收货,默认为1
	*/
	private Integer goods_state ;
	/*
	订单商品ID,全部退款是0
	*/
	private Integer order_goods_id ;
	/*
	订单商品类型:1默认2团购商品3限时折扣商品4组合套装
	*/
	private Integer order_goods_type ;
	/*
	订单ID
	*/
	private Integer order_id ;
	/*
	订单锁定类型:1为不用锁定,2为需要锁定,默认为1
	*/
	private Integer order_lock ;
	/*
	原因ID:0为其它
	*/
	private Integer reason_id ;
	/*
	收货时间,默认为0
	*/
	private Integer receive_time ;
	/*
	申请状态:1为处理中,2为待管理员处理,3为已完成,默认为1
	*/
	private Integer refund_state ;
	/*
	申请类型:1为退款,2为退货,默认为1
	*/
	private Integer refund_type ;
	/*
	退货类型:1为不用退货,2为需要退货,默认为1
	*/
	private Integer return_type ;
	/*
	卖家处理状态:1为待审核,2为同意,3为不同意,默认为1
	*/
	private Integer seller_state ;
	/*
	卖家处理时间
	*/
	private Integer seller_time ;
	/*
	发货时间,默认为0
	*/
	private Integer ship_time ;
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
	商品图片
	*/
	private String goods_image ;
	/*
	商品名称
	*/
	private String goods_name ;
	/*
	物流单号
	*/
	private String invoice_no ;
	/*
	订单编号
	*/
	private String order_sn ;
	/*
	图片
	*/
	private String pic_info ;
	/*
	原因内容
	*/
	private String reason_info ;
	/*
	收货备注
	*/
	private String receive_message ;
	private String refund_address ;
	/*
	退款金额
	*/
	private BigDecimal refund_amount ;
	/*
	申请编号
	*/
	private String refund_sn ;
	/*
	卖家备注
	*/
	private String seller_message ;
	/*
	店铺名称
	*/
	private String store_name ;
	
	public RaRefundReturn() {
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
	
	public Integer getDaddress_id(){
		return  daddress_id;
	}
	public void setDaddress_id(Integer daddress_id ){
		this.daddress_id = daddress_id;
	}
	
	/**
	* 收货延迟时间,默认为0
	*@return 
	*/
	public Integer getDelay_time(){
		return  delay_time;
	}
	/**
	* 收货延迟时间,默认为0
	*@param  delay_time
	*/
	public void setDelay_time(Integer delay_time ){
		this.delay_time = delay_time;
	}
	
	/**
	* 物流公司编号
	*@return 
	*/
	public Integer getExpress_id(){
		return  express_id;
	}
	/**
	* 物流公司编号
	*@param  express_id
	*/
	public void setExpress_id(Integer express_id ){
		this.express_id = express_id;
	}
	
	/**
	* 商品ID,全部退款是0
	*@return 
	*/
	public Integer getGoods_id(){
		return  goods_id;
	}
	/**
	* 商品ID,全部退款是0
	*@param  goods_id
	*/
	public void setGoods_id(Integer goods_id ){
		this.goods_id = goods_id;
	}
	
	/**
	* 商品数量
	*@return 
	*/
	public Integer getGoods_num(){
		return  goods_num;
	}
	/**
	* 商品数量
	*@param  goods_num
	*/
	public void setGoods_num(Integer goods_num ){
		this.goods_num = goods_num;
	}
	
	/**
	* 物流状态:1为待发货,2为待收货,3为未收到,4为已收货,默认为1
	*@return 
	*/
	public Integer getGoods_state(){
		return  goods_state;
	}
	/**
	* 物流状态:1为待发货,2为待收货,3为未收到,4为已收货,默认为1
	*@param  goods_state
	*/
	public void setGoods_state(Integer goods_state ){
		this.goods_state = goods_state;
	}
	
	/**
	* 订单商品ID,全部退款是0
	*@return 
	*/
	public Integer getOrder_goods_id(){
		return  order_goods_id;
	}
	/**
	* 订单商品ID,全部退款是0
	*@param  order_goods_id
	*/
	public void setOrder_goods_id(Integer order_goods_id ){
		this.order_goods_id = order_goods_id;
	}
	
	/**
	* 订单商品类型:1默认2团购商品3限时折扣商品4组合套装
	*@return 
	*/
	public Integer getOrder_goods_type(){
		return  order_goods_type;
	}
	/**
	* 订单商品类型:1默认2团购商品3限时折扣商品4组合套装
	*@param  order_goods_type
	*/
	public void setOrder_goods_type(Integer order_goods_type ){
		this.order_goods_type = order_goods_type;
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
	* 订单锁定类型:1为不用锁定,2为需要锁定,默认为1
	*@return 
	*/
	public Integer getOrder_lock(){
		return  order_lock;
	}
	/**
	* 订单锁定类型:1为不用锁定,2为需要锁定,默认为1
	*@param  order_lock
	*/
	public void setOrder_lock(Integer order_lock ){
		this.order_lock = order_lock;
	}
	
	/**
	* 原因ID:0为其它
	*@return 
	*/
	public Integer getReason_id(){
		return  reason_id;
	}
	/**
	* 原因ID:0为其它
	*@param  reason_id
	*/
	public void setReason_id(Integer reason_id ){
		this.reason_id = reason_id;
	}
	
	/**
	* 收货时间,默认为0
	*@return 
	*/
	public Integer getReceive_time(){
		return  receive_time;
	}
	/**
	* 收货时间,默认为0
	*@param  receive_time
	*/
	public void setReceive_time(Integer receive_time ){
		this.receive_time = receive_time;
	}
	
	/**
	* 申请状态:1为处理中,2为待管理员处理,3为已完成,默认为1
	*@return 
	*/
	public Integer getRefund_state(){
		return  refund_state;
	}
	/**
	* 申请状态:1为处理中,2为待管理员处理,3为已完成,默认为1
	*@param  refund_state
	*/
	public void setRefund_state(Integer refund_state ){
		this.refund_state = refund_state;
	}
	
	/**
	* 申请类型:1为退款,2为退货,默认为1
	*@return 
	*/
	public Integer getRefund_type(){
		return  refund_type;
	}
	/**
	* 申请类型:1为退款,2为退货,默认为1
	*@param  refund_type
	*/
	public void setRefund_type(Integer refund_type ){
		this.refund_type = refund_type;
	}
	
	/**
	* 退货类型:1为不用退货,2为需要退货,默认为1
	*@return 
	*/
	public Integer getReturn_type(){
		return  return_type;
	}
	/**
	* 退货类型:1为不用退货,2为需要退货,默认为1
	*@param  return_type
	*/
	public void setReturn_type(Integer return_type ){
		this.return_type = return_type;
	}
	
	/**
	* 卖家处理状态:1为待审核,2为同意,3为不同意,默认为1
	*@return 
	*/
	public Integer getSeller_state(){
		return  seller_state;
	}
	/**
	* 卖家处理状态:1为待审核,2为同意,3为不同意,默认为1
	*@param  seller_state
	*/
	public void setSeller_state(Integer seller_state ){
		this.seller_state = seller_state;
	}
	
	/**
	* 卖家处理时间
	*@return 
	*/
	public Integer getSeller_time(){
		return  seller_time;
	}
	/**
	* 卖家处理时间
	*@param  seller_time
	*/
	public void setSeller_time(Integer seller_time ){
		this.seller_time = seller_time;
	}
	
	/**
	* 发货时间,默认为0
	*@return 
	*/
	public Integer getShip_time(){
		return  ship_time;
	}
	/**
	* 发货时间,默认为0
	*@param  ship_time
	*/
	public void setShip_time(Integer ship_time ){
		this.ship_time = ship_time;
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
	* 物流单号
	*@return 
	*/
	public String getInvoice_no(){
		return  invoice_no;
	}
	/**
	* 物流单号
	*@param  invoice_no
	*/
	public void setInvoice_no(String invoice_no ){
		this.invoice_no = invoice_no;
	}
	
	/**
	* 订单编号
	*@return 
	*/
	public String getOrder_sn(){
		return  order_sn;
	}
	/**
	* 订单编号
	*@param  order_sn
	*/
	public void setOrder_sn(String order_sn ){
		this.order_sn = order_sn;
	}
	
	/**
	* 图片
	*@return 
	*/
	public String getPic_info(){
		return  pic_info;
	}
	/**
	* 图片
	*@param  pic_info
	*/
	public void setPic_info(String pic_info ){
		this.pic_info = pic_info;
	}
	
	/**
	* 原因内容
	*@return 
	*/
	public String getReason_info(){
		return  reason_info;
	}
	/**
	* 原因内容
	*@param  reason_info
	*/
	public void setReason_info(String reason_info ){
		this.reason_info = reason_info;
	}
	
	/**
	* 收货备注
	*@return 
	*/
	public String getReceive_message(){
		return  receive_message;
	}
	/**
	* 收货备注
	*@param  receive_message
	*/
	public void setReceive_message(String receive_message ){
		this.receive_message = receive_message;
	}
	
	public String getRefund_address(){
		return  refund_address;
	}
	public void setRefund_address(String refund_address ){
		this.refund_address = refund_address;
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
	* 卖家备注
	*@return 
	*/
	public String getSeller_message(){
		return  seller_message;
	}
	/**
	* 卖家备注
	*@param  seller_message
	*/
	public void setSeller_message(String seller_message ){
		this.seller_message = seller_message;
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
