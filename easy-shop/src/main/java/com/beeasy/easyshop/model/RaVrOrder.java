package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_vr_order")
public class RaVrOrder   {
	
	// alias
	public static final String ALIAS_order_id = "order_id";
	public static final String ALIAS_add_time = "add_time";
	public static final String ALIAS_buyer_id = "buyer_id";
	public static final String ALIAS_close_time = "close_time";
	public static final String ALIAS_commis_rate = "commis_rate";
	public static final String ALIAS_delete_state = "delete_state";
	public static final String ALIAS_evaluation_state = "evaluation_state";
	public static final String ALIAS_evaluation_time = "evaluation_time";
	public static final String ALIAS_finnshed_time = "finnshed_time";
	public static final String ALIAS_gc_id = "gc_id";
	public static final String ALIAS_goods_id = "goods_id";
	public static final String ALIAS_goods_num = "goods_num";
	public static final String ALIAS_order_from = "order_from";
	public static final String ALIAS_order_promotion_type = "order_promotion_type";
	public static final String ALIAS_order_state = "order_state";
	public static final String ALIAS_payment_time = "payment_time";
	public static final String ALIAS_promotions_id = "promotions_id";
	public static final String ALIAS_refund_state = "refund_state";
	public static final String ALIAS_store_id = "store_id";
	public static final String ALIAS_use_state = "use_state";
	public static final String ALIAS_vr_indate = "vr_indate";
	public static final String ALIAS_vr_invalid_refund = "vr_invalid_refund";
	public static final String ALIAS_vr_send_times = "vr_send_times";
	public static final String ALIAS_buyer_msg = "buyer_msg";
	public static final String ALIAS_buyer_name = "buyer_name";
	public static final String ALIAS_buyer_phone = "buyer_phone";
	public static final String ALIAS_close_reason = "close_reason";
	public static final String ALIAS_goods_image = "goods_image";
	public static final String ALIAS_goods_name = "goods_name";
	public static final String ALIAS_goods_price = "goods_price";
	public static final String ALIAS_order_amount = "order_amount";
	public static final String ALIAS_order_sn = "order_sn";
	public static final String ALIAS_payment_code = "payment_code";
	public static final String ALIAS_pd_amount = "pd_amount";
	public static final String ALIAS_rcb_amount = "rcb_amount";
	public static final String ALIAS_refund_amount = "refund_amount";
	public static final String ALIAS_store_name = "store_name";
	public static final String ALIAS_trade_no = "trade_no";
	
	/*
	虚拟订单索引id
	*/
	private Integer order_id ;
	/*
	订单生成时间
	*/
	private Integer add_time ;
	/*
	买家id
	*/
	private Integer buyer_id ;
	/*
	关闭时间
	*/
	private Integer close_time ;
	/*
	佣金比例
	*/
	private Integer commis_rate ;
	/*
	删除状态0未删除1放入回收站2彻底删除
	*/
	private Integer delete_state ;
	/*
	评价状态0默认1已评价2禁止评价
	*/
	private Integer evaluation_state ;
	/*
	评价时间
	*/
	private Integer evaluation_time ;
	/*
	完成时间
	*/
	private Integer finnshed_time ;
	/*
	商品最底级分类ID
	*/
	private Integer gc_id ;
	/*
	商品id
	*/
	private Integer goods_id ;
	/*
	商品数量
	*/
	private Integer goods_num ;
	/*
	1WEB2mobile
	*/
	private Integer order_from ;
	/*
	订单参加的促销类型 0无促销1团购
	*/
	private Integer order_promotion_type ;
	/*
	订单状态：0(已取消)10(默认):未付款;20:已付款;40:已完成;
	*/
	private Integer order_state ;
	/*
	支付(付款)时间
	*/
	private Integer payment_time ;
	/*
	促销ID，与order_promotion_type配合使用
	*/
	private Integer promotions_id ;
	/*
	退款状态:0是无退款,1是部分退款,2是全部退款
	*/
	private Integer refund_state ;
	/*
	卖家店铺id
	*/
	private Integer store_id ;
	/*
	使用状态0默认，未使用1已使用，有一个被使用即为1
	*/
	private Integer use_state ;
	/*
	有效期
	*/
	private Integer vr_indate ;
	/*
	允许过期退款1是0否
	*/
	private Integer vr_invalid_refund ;
	/*
	兑换码发送次数
	*/
	private Integer vr_send_times ;
	/*
	买家留言
	*/
	private String buyer_msg ;
	/*
	买家登录名
	*/
	private String buyer_name ;
	/*
	买家手机
	*/
	private String buyer_phone ;
	/*
	关闭原因
	*/
	private String close_reason ;
	/*
	商品图片
	*/
	private String goods_image ;
	/*
	商品名称
	*/
	private String goods_name ;
	/*
	商品价格
	*/
	private BigDecimal goods_price ;
	/*
	订单总价格(支付金额)
	*/
	private BigDecimal order_amount ;
	/*
	订单编号
	*/
	private Long order_sn ;
	/*
	支付方式名称代码
	*/
	private String payment_code ;
	/*
	预存款支付金额
	*/
	private BigDecimal pd_amount ;
	/*
	充值卡支付金额
	*/
	private BigDecimal rcb_amount ;
	/*
	退款金额
	*/
	private BigDecimal refund_amount ;
	/*
	卖家店铺名称
	*/
	private String store_name ;
	/*
	第三方平台交易号
	*/
	private String trade_no ;
	
	public RaVrOrder() {
	}
	
	/**
	* 虚拟订单索引id
	*@return 
	*/
	public Integer getOrder_id(){
		return  order_id;
	}
	/**
	* 虚拟订单索引id
	*@param  order_id
	*/
	public void setOrder_id(Integer order_id ){
		this.order_id = order_id;
	}
	
	/**
	* 订单生成时间
	*@return 
	*/
	public Integer getAdd_time(){
		return  add_time;
	}
	/**
	* 订单生成时间
	*@param  add_time
	*/
	public void setAdd_time(Integer add_time ){
		this.add_time = add_time;
	}
	
	/**
	* 买家id
	*@return 
	*/
	public Integer getBuyer_id(){
		return  buyer_id;
	}
	/**
	* 买家id
	*@param  buyer_id
	*/
	public void setBuyer_id(Integer buyer_id ){
		this.buyer_id = buyer_id;
	}
	
	/**
	* 关闭时间
	*@return 
	*/
	public Integer getClose_time(){
		return  close_time;
	}
	/**
	* 关闭时间
	*@param  close_time
	*/
	public void setClose_time(Integer close_time ){
		this.close_time = close_time;
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
	* 删除状态0未删除1放入回收站2彻底删除
	*@return 
	*/
	public Integer getDelete_state(){
		return  delete_state;
	}
	/**
	* 删除状态0未删除1放入回收站2彻底删除
	*@param  delete_state
	*/
	public void setDelete_state(Integer delete_state ){
		this.delete_state = delete_state;
	}
	
	/**
	* 评价状态0默认1已评价2禁止评价
	*@return 
	*/
	public Integer getEvaluation_state(){
		return  evaluation_state;
	}
	/**
	* 评价状态0默认1已评价2禁止评价
	*@param  evaluation_state
	*/
	public void setEvaluation_state(Integer evaluation_state ){
		this.evaluation_state = evaluation_state;
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
	* 完成时间
	*@return 
	*/
	public Integer getFinnshed_time(){
		return  finnshed_time;
	}
	/**
	* 完成时间
	*@param  finnshed_time
	*/
	public void setFinnshed_time(Integer finnshed_time ){
		this.finnshed_time = finnshed_time;
	}
	
	/**
	* 商品最底级分类ID
	*@return 
	*/
	public Integer getGc_id(){
		return  gc_id;
	}
	/**
	* 商品最底级分类ID
	*@param  gc_id
	*/
	public void setGc_id(Integer gc_id ){
		this.gc_id = gc_id;
	}
	
	/**
	* 商品id
	*@return 
	*/
	public Integer getGoods_id(){
		return  goods_id;
	}
	/**
	* 商品id
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
	* 1WEB2mobile
	*@return 
	*/
	public Integer getOrder_from(){
		return  order_from;
	}
	/**
	* 1WEB2mobile
	*@param  order_from
	*/
	public void setOrder_from(Integer order_from ){
		this.order_from = order_from;
	}
	
	/**
	* 订单参加的促销类型 0无促销1团购
	*@return 
	*/
	public Integer getOrder_promotion_type(){
		return  order_promotion_type;
	}
	/**
	* 订单参加的促销类型 0无促销1团购
	*@param  order_promotion_type
	*/
	public void setOrder_promotion_type(Integer order_promotion_type ){
		this.order_promotion_type = order_promotion_type;
	}
	
	/**
	* 订单状态：0(已取消)10(默认):未付款;20:已付款;40:已完成;
	*@return 
	*/
	public Integer getOrder_state(){
		return  order_state;
	}
	/**
	* 订单状态：0(已取消)10(默认):未付款;20:已付款;40:已完成;
	*@param  order_state
	*/
	public void setOrder_state(Integer order_state ){
		this.order_state = order_state;
	}
	
	/**
	* 支付(付款)时间
	*@return 
	*/
	public Integer getPayment_time(){
		return  payment_time;
	}
	/**
	* 支付(付款)时间
	*@param  payment_time
	*/
	public void setPayment_time(Integer payment_time ){
		this.payment_time = payment_time;
	}
	
	/**
	* 促销ID，与order_promotion_type配合使用
	*@return 
	*/
	public Integer getPromotions_id(){
		return  promotions_id;
	}
	/**
	* 促销ID，与order_promotion_type配合使用
	*@param  promotions_id
	*/
	public void setPromotions_id(Integer promotions_id ){
		this.promotions_id = promotions_id;
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
	* 卖家店铺id
	*@return 
	*/
	public Integer getStore_id(){
		return  store_id;
	}
	/**
	* 卖家店铺id
	*@param  store_id
	*/
	public void setStore_id(Integer store_id ){
		this.store_id = store_id;
	}
	
	/**
	* 使用状态0默认，未使用1已使用，有一个被使用即为1
	*@return 
	*/
	public Integer getUse_state(){
		return  use_state;
	}
	/**
	* 使用状态0默认，未使用1已使用，有一个被使用即为1
	*@param  use_state
	*/
	public void setUse_state(Integer use_state ){
		this.use_state = use_state;
	}
	
	/**
	* 有效期
	*@return 
	*/
	public Integer getVr_indate(){
		return  vr_indate;
	}
	/**
	* 有效期
	*@param  vr_indate
	*/
	public void setVr_indate(Integer vr_indate ){
		this.vr_indate = vr_indate;
	}
	
	/**
	* 允许过期退款1是0否
	*@return 
	*/
	public Integer getVr_invalid_refund(){
		return  vr_invalid_refund;
	}
	/**
	* 允许过期退款1是0否
	*@param  vr_invalid_refund
	*/
	public void setVr_invalid_refund(Integer vr_invalid_refund ){
		this.vr_invalid_refund = vr_invalid_refund;
	}
	
	/**
	* 兑换码发送次数
	*@return 
	*/
	public Integer getVr_send_times(){
		return  vr_send_times;
	}
	/**
	* 兑换码发送次数
	*@param  vr_send_times
	*/
	public void setVr_send_times(Integer vr_send_times ){
		this.vr_send_times = vr_send_times;
	}
	
	/**
	* 买家留言
	*@return 
	*/
	public String getBuyer_msg(){
		return  buyer_msg;
	}
	/**
	* 买家留言
	*@param  buyer_msg
	*/
	public void setBuyer_msg(String buyer_msg ){
		this.buyer_msg = buyer_msg;
	}
	
	/**
	* 买家登录名
	*@return 
	*/
	public String getBuyer_name(){
		return  buyer_name;
	}
	/**
	* 买家登录名
	*@param  buyer_name
	*/
	public void setBuyer_name(String buyer_name ){
		this.buyer_name = buyer_name;
	}
	
	/**
	* 买家手机
	*@return 
	*/
	public String getBuyer_phone(){
		return  buyer_phone;
	}
	/**
	* 买家手机
	*@param  buyer_phone
	*/
	public void setBuyer_phone(String buyer_phone ){
		this.buyer_phone = buyer_phone;
	}
	
	/**
	* 关闭原因
	*@return 
	*/
	public String getClose_reason(){
		return  close_reason;
	}
	/**
	* 关闭原因
	*@param  close_reason
	*/
	public void setClose_reason(String close_reason ){
		this.close_reason = close_reason;
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
	* 商品价格
	*@return 
	*/
	public BigDecimal getGoods_price(){
		return  goods_price;
	}
	/**
	* 商品价格
	*@param  goods_price
	*/
	public void setGoods_price(BigDecimal goods_price ){
		this.goods_price = goods_price;
	}
	
	/**
	* 订单总价格(支付金额)
	*@return 
	*/
	public BigDecimal getOrder_amount(){
		return  order_amount;
	}
	/**
	* 订单总价格(支付金额)
	*@param  order_amount
	*/
	public void setOrder_amount(BigDecimal order_amount ){
		this.order_amount = order_amount;
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
	* 支付方式名称代码
	*@return 
	*/
	public String getPayment_code(){
		return  payment_code;
	}
	/**
	* 支付方式名称代码
	*@param  payment_code
	*/
	public void setPayment_code(String payment_code ){
		this.payment_code = payment_code;
	}
	
	/**
	* 预存款支付金额
	*@return 
	*/
	public BigDecimal getPd_amount(){
		return  pd_amount;
	}
	/**
	* 预存款支付金额
	*@param  pd_amount
	*/
	public void setPd_amount(BigDecimal pd_amount ){
		this.pd_amount = pd_amount;
	}
	
	/**
	* 充值卡支付金额
	*@return 
	*/
	public BigDecimal getRcb_amount(){
		return  rcb_amount;
	}
	/**
	* 充值卡支付金额
	*@param  rcb_amount
	*/
	public void setRcb_amount(BigDecimal rcb_amount ){
		this.rcb_amount = rcb_amount;
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
	
	/**
	* 第三方平台交易号
	*@return 
	*/
	public String getTrade_no(){
		return  trade_no;
	}
	/**
	* 第三方平台交易号
	*@param  trade_no
	*/
	public void setTrade_no(String trade_no ){
		this.trade_no = trade_no;
	}
	

}
