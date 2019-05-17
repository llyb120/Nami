package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_order")
public class RaOrder   {
	
	// alias
	public static final String ALIAS_order_id = "order_id";
	public static final String ALIAS_add_time = "add_time";
	public static final String ALIAS_buyer_id = "buyer_id";
	public static final String ALIAS_delay_time = "delay_time";
	public static final String ALIAS_delete_state = "delete_state";
	public static final String ALIAS_evaluation_state = "evaluation_state";
	public static final String ALIAS_finnshed_time = "finnshed_time";
	public static final String ALIAS_is_joinpay_alloc = "is_joinpay_alloc";
	public static final String ALIAS_is_pull_kjy = "is_pull_kjy";
	public static final String ALIAS_is_tax_order = "is_tax_order";
	public static final String ALIAS_is_we_groupbuy = "is_we_groupbuy";
	public static final String ALIAS_is_whole = "is_whole";
	public static final String ALIAS_is_zhiyou = "is_zhiyou";
	public static final String ALIAS_lock_state = "lock_state";
	public static final String ALIAS_order_from = "order_from";
	public static final String ALIAS_order_state = "order_state";
	public static final String ALIAS_out_order = "out_order";
	public static final String ALIAS_payStatus = "payStatus";
	public static final String ALIAS_payment_time = "payment_time";
	public static final String ALIAS_refund_state = "refund_state";
	public static final String ALIAS_shenzhen_audit_status = "shenzhen_audit_status";
	public static final String ALIAS_shenzhen_audit_status_traffic = "shenzhen_audit_status_traffic";
	public static final String ALIAS_shenzhen_record_status = "shenzhen_record_status";
	public static final String ALIAS_shenzhen_record_status_traffic = "shenzhen_record_status_traffic";
	public static final String ALIAS_store_id = "store_id";
	public static final String ALIAS_vertify_state = "vertify_state";
	public static final String ALIAS_we_groupbuying_id = "we_groupbuying_id";
	public static final String ALIAS_address = "address";
	public static final String ALIAS_api_pay_sn = "api_pay_sn";
	public static final String ALIAS_buyer_email = "buyer_email";
	public static final String ALIAS_buyer_name = "buyer_name";
	public static final String ALIAS_express_status = "express_status";
	public static final String ALIAS_goods_amount = "goods_amount";
	public static final String ALIAS_hangzhou_details = "hangzhou_details";
	public static final String ALIAS_hangzhou_state = "hangzhou_state";
	public static final String ALIAS_idcard = "idcard";
	public static final String ALIAS_import_sn = "import_sn";
	public static final String ALIAS_margin = "margin";
	public static final String ALIAS_n_buyer_idcard = "n_buyer_idcard";
	public static final String ALIAS_n_buyer_phone = "n_buyer_phone";
	public static final String ALIAS_n_buyer_true_name = "n_buyer_true_name";
	public static final String ALIAS_order_amount = "order_amount";
	public static final String ALIAS_order_sn = "order_sn";
	public static final String ALIAS_order_tax = "order_tax";
	public static final String ALIAS_order_weight = "order_weight";
	public static final String ALIAS_out_order_sn = "out_order_sn";
	public static final String ALIAS_out_order_sn2 = "out_order_sn2";
	public static final String ALIAS_out_source_data = "out_source_data";
	public static final String ALIAS_pay_sn = "pay_sn";
	public static final String ALIAS_payment_code = "payment_code";
	public static final String ALIAS_pd_amount = "pd_amount";
	public static final String ALIAS_phone = "phone";
	public static final String ALIAS_print_pdf = "print_pdf";
	public static final String ALIAS_proAmount = "proAmount";
	public static final String ALIAS_rcb_amount = "rcb_amount";
	public static final String ALIAS_receiver_name = "receiver_name";
	public static final String ALIAS_refund_amount = "refund_amount";
	public static final String ALIAS_shipping_code = "shipping_code";
	public static final String ALIAS_shipping_fee = "shipping_fee";
	public static final String ALIAS_store_name = "store_name";
	public static final String ALIAS_wxpay = "wxpay";
	public static final String ALIAS_zip = "zip";
	
	/*
	订单索引id
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
	延迟时间,默认为0
	*/
	private Integer delay_time ;
	/*
	删除状态0未删除1放入回收站2彻底删除
	*/
	private Integer delete_state ;
	/*
	评价状态 0未评价，1已评价，2已过期未评价
	*/
	private Integer evaluation_state ;
	/*
	订单完成时间
	*/
	private Integer finnshed_time ;
	/*
	是否已经汇聚分账
	*/
	private Integer is_joinpay_alloc ;
	/*
	是否推送跨境易
	*/
	private Integer is_pull_kjy ;
	private Integer is_tax_order ;
	/*
	是否为微团购订单
	*/
	private Integer is_we_groupbuy ;
	private Integer is_whole ;
	private Integer is_zhiyou ;
	/*
	锁定状态:0是正常,大于0是锁定,默认是0
	*/
	private Integer lock_state ;
	/*
	1WEB2mobile
	*/
	private Integer order_from ;
	/*
	订单状态：0(已取消)10(默认):未付款;20:已付款;30:已发货;40:已收货;
	*/
	private Integer order_state ;
	/*
	外部订单ID
	*/
	private Integer out_order ;
	private Integer paystatus ;
	/*
	支付(付款)时间
	*/
	private Integer payment_time ;
	/*
	退款状态:0是无退款,1是部分退款,2是全部退款
	*/
	private Integer refund_state ;
	private Integer shenzhen_audit_status ;
	private Integer shenzhen_audit_status_traffic ;
	private Integer shenzhen_record_status ;
	private Integer shenzhen_record_status_traffic ;
	/*
	卖家店铺id
	*/
	private Integer store_id ;
	private Integer vertify_state ;
	private Integer we_groupbuying_id ;
	private String address ;
	private String api_pay_sn ;
	/*
	买家电子邮箱
	*/
	private String buyer_email ;
	/*
	买家姓名
	*/
	private String buyer_name ;
	private String express_status ;
	/*
	商品总价格
	*/
	private BigDecimal goods_amount ;
	/*
	杭州海关发货详情
	*/
	private String hangzhou_details ;
	private String hangzhou_state ;
	private String idcard ;
	private String import_sn ;
	private BigDecimal margin ;
	private String n_buyer_idcard ;
	private String n_buyer_phone ;
	private String n_buyer_true_name ;
	/*
	订单总价格
	*/
	private BigDecimal order_amount ;
	/*
	订单编号
	*/
	private String order_sn ;
	private BigDecimal order_tax ;
	private BigDecimal order_weight ;
	private String out_order_sn ;
	private String out_order_sn2 ;
	private String out_source_data ;
	/*
	支付单号
	*/
	private String pay_sn ;
	/*
	支付方式名称代码
	*/
	private String payment_code ;
	/*
	预存款支付金额
	*/
	private BigDecimal pd_amount ;
	private String phone ;
	private String print_pdf ;
	private BigDecimal proamount ;
	/*
	充值卡支付金额
	*/
	private BigDecimal rcb_amount ;
	private String receiver_name ;
	/*
	退款金额
	*/
	private BigDecimal refund_amount ;
	/*
	物流单号
	*/
	private String shipping_code ;
	/*
	运费
	*/
	private BigDecimal shipping_fee ;
	/*
	卖家店铺名称
	*/
	private String store_name ;
	private String wxpay ;
	private String zip ;
	
	public RaOrder() {
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
	* 延迟时间,默认为0
	*@return 
	*/
	public Integer getDelay_time(){
		return  delay_time;
	}
	/**
	* 延迟时间,默认为0
	*@param  delay_time
	*/
	public void setDelay_time(Integer delay_time ){
		this.delay_time = delay_time;
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
	* 评价状态 0未评价，1已评价，2已过期未评价
	*@return 
	*/
	public Integer getEvaluation_state(){
		return  evaluation_state;
	}
	/**
	* 评价状态 0未评价，1已评价，2已过期未评价
	*@param  evaluation_state
	*/
	public void setEvaluation_state(Integer evaluation_state ){
		this.evaluation_state = evaluation_state;
	}
	
	/**
	* 订单完成时间
	*@return 
	*/
	public Integer getFinnshed_time(){
		return  finnshed_time;
	}
	/**
	* 订单完成时间
	*@param  finnshed_time
	*/
	public void setFinnshed_time(Integer finnshed_time ){
		this.finnshed_time = finnshed_time;
	}
	
	/**
	* 是否已经汇聚分账
	*@return 
	*/
	public Integer getIs_joinpay_alloc(){
		return  is_joinpay_alloc;
	}
	/**
	* 是否已经汇聚分账
	*@param  is_joinpay_alloc
	*/
	public void setIs_joinpay_alloc(Integer is_joinpay_alloc ){
		this.is_joinpay_alloc = is_joinpay_alloc;
	}
	
	/**
	* 是否推送跨境易
	*@return 
	*/
	public Integer getIs_pull_kjy(){
		return  is_pull_kjy;
	}
	/**
	* 是否推送跨境易
	*@param  is_pull_kjy
	*/
	public void setIs_pull_kjy(Integer is_pull_kjy ){
		this.is_pull_kjy = is_pull_kjy;
	}
	
	public Integer getIs_tax_order(){
		return  is_tax_order;
	}
	public void setIs_tax_order(Integer is_tax_order ){
		this.is_tax_order = is_tax_order;
	}
	
	/**
	* 是否为微团购订单
	*@return 
	*/
	public Integer getIs_we_groupbuy(){
		return  is_we_groupbuy;
	}
	/**
	* 是否为微团购订单
	*@param  is_we_groupbuy
	*/
	public void setIs_we_groupbuy(Integer is_we_groupbuy ){
		this.is_we_groupbuy = is_we_groupbuy;
	}
	
	public Integer getIs_whole(){
		return  is_whole;
	}
	public void setIs_whole(Integer is_whole ){
		this.is_whole = is_whole;
	}
	
	public Integer getIs_zhiyou(){
		return  is_zhiyou;
	}
	public void setIs_zhiyou(Integer is_zhiyou ){
		this.is_zhiyou = is_zhiyou;
	}
	
	/**
	* 锁定状态:0是正常,大于0是锁定,默认是0
	*@return 
	*/
	public Integer getLock_state(){
		return  lock_state;
	}
	/**
	* 锁定状态:0是正常,大于0是锁定,默认是0
	*@param  lock_state
	*/
	public void setLock_state(Integer lock_state ){
		this.lock_state = lock_state;
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
	* 订单状态：0(已取消)10(默认):未付款;20:已付款;30:已发货;40:已收货;
	*@return 
	*/
	public Integer getOrder_state(){
		return  order_state;
	}
	/**
	* 订单状态：0(已取消)10(默认):未付款;20:已付款;30:已发货;40:已收货;
	*@param  order_state
	*/
	public void setOrder_state(Integer order_state ){
		this.order_state = order_state;
	}
	
	/**
	* 外部订单ID
	*@return 
	*/
	public Integer getOut_order(){
		return  out_order;
	}
	/**
	* 外部订单ID
	*@param  out_order
	*/
	public void setOut_order(Integer out_order ){
		this.out_order = out_order;
	}
	
	public Integer getPaystatus(){
		return  paystatus;
	}
	public void setPaystatus(Integer paystatus ){
		this.paystatus = paystatus;
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
	
	public Integer getShenzhen_audit_status(){
		return  shenzhen_audit_status;
	}
	public void setShenzhen_audit_status(Integer shenzhen_audit_status ){
		this.shenzhen_audit_status = shenzhen_audit_status;
	}
	
	public Integer getShenzhen_audit_status_traffic(){
		return  shenzhen_audit_status_traffic;
	}
	public void setShenzhen_audit_status_traffic(Integer shenzhen_audit_status_traffic ){
		this.shenzhen_audit_status_traffic = shenzhen_audit_status_traffic;
	}
	
	public Integer getShenzhen_record_status(){
		return  shenzhen_record_status;
	}
	public void setShenzhen_record_status(Integer shenzhen_record_status ){
		this.shenzhen_record_status = shenzhen_record_status;
	}
	
	public Integer getShenzhen_record_status_traffic(){
		return  shenzhen_record_status_traffic;
	}
	public void setShenzhen_record_status_traffic(Integer shenzhen_record_status_traffic ){
		this.shenzhen_record_status_traffic = shenzhen_record_status_traffic;
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
	
	public Integer getVertify_state(){
		return  vertify_state;
	}
	public void setVertify_state(Integer vertify_state ){
		this.vertify_state = vertify_state;
	}
	
	public Integer getWe_groupbuying_id(){
		return  we_groupbuying_id;
	}
	public void setWe_groupbuying_id(Integer we_groupbuying_id ){
		this.we_groupbuying_id = we_groupbuying_id;
	}
	
	public String getAddress(){
		return  address;
	}
	public void setAddress(String address ){
		this.address = address;
	}
	
	public String getApi_pay_sn(){
		return  api_pay_sn;
	}
	public void setApi_pay_sn(String api_pay_sn ){
		this.api_pay_sn = api_pay_sn;
	}
	
	/**
	* 买家电子邮箱
	*@return 
	*/
	public String getBuyer_email(){
		return  buyer_email;
	}
	/**
	* 买家电子邮箱
	*@param  buyer_email
	*/
	public void setBuyer_email(String buyer_email ){
		this.buyer_email = buyer_email;
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
	
	public String getExpress_status(){
		return  express_status;
	}
	public void setExpress_status(String express_status ){
		this.express_status = express_status;
	}
	
	/**
	* 商品总价格
	*@return 
	*/
	public BigDecimal getGoods_amount(){
		return  goods_amount;
	}
	/**
	* 商品总价格
	*@param  goods_amount
	*/
	public void setGoods_amount(BigDecimal goods_amount ){
		this.goods_amount = goods_amount;
	}
	
	/**
	* 杭州海关发货详情
	*@return 
	*/
	public String getHangzhou_details(){
		return  hangzhou_details;
	}
	/**
	* 杭州海关发货详情
	*@param  hangzhou_details
	*/
	public void setHangzhou_details(String hangzhou_details ){
		this.hangzhou_details = hangzhou_details;
	}
	
	public String getHangzhou_state(){
		return  hangzhou_state;
	}
	public void setHangzhou_state(String hangzhou_state ){
		this.hangzhou_state = hangzhou_state;
	}
	
	public String getIdcard(){
		return  idcard;
	}
	public void setIdcard(String idcard ){
		this.idcard = idcard;
	}
	
	public String getImport_sn(){
		return  import_sn;
	}
	public void setImport_sn(String import_sn ){
		this.import_sn = import_sn;
	}
	
	public BigDecimal getMargin(){
		return  margin;
	}
	public void setMargin(BigDecimal margin ){
		this.margin = margin;
	}
	
	public String getN_buyer_idcard(){
		return  n_buyer_idcard;
	}
	public void setN_buyer_idcard(String n_buyer_idcard ){
		this.n_buyer_idcard = n_buyer_idcard;
	}
	
	public String getN_buyer_phone(){
		return  n_buyer_phone;
	}
	public void setN_buyer_phone(String n_buyer_phone ){
		this.n_buyer_phone = n_buyer_phone;
	}
	
	public String getN_buyer_true_name(){
		return  n_buyer_true_name;
	}
	public void setN_buyer_true_name(String n_buyer_true_name ){
		this.n_buyer_true_name = n_buyer_true_name;
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
	
	public BigDecimal getOrder_tax(){
		return  order_tax;
	}
	public void setOrder_tax(BigDecimal order_tax ){
		this.order_tax = order_tax;
	}
	
	public BigDecimal getOrder_weight(){
		return  order_weight;
	}
	public void setOrder_weight(BigDecimal order_weight ){
		this.order_weight = order_weight;
	}
	
	public String getOut_order_sn(){
		return  out_order_sn;
	}
	public void setOut_order_sn(String out_order_sn ){
		this.out_order_sn = out_order_sn;
	}
	
	public String getOut_order_sn2(){
		return  out_order_sn2;
	}
	public void setOut_order_sn2(String out_order_sn2 ){
		this.out_order_sn2 = out_order_sn2;
	}
	
	public String getOut_source_data(){
		return  out_source_data;
	}
	public void setOut_source_data(String out_source_data ){
		this.out_source_data = out_source_data;
	}
	
	/**
	* 支付单号
	*@return 
	*/
	public String getPay_sn(){
		return  pay_sn;
	}
	/**
	* 支付单号
	*@param  pay_sn
	*/
	public void setPay_sn(String pay_sn ){
		this.pay_sn = pay_sn;
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
	
	public String getPhone(){
		return  phone;
	}
	public void setPhone(String phone ){
		this.phone = phone;
	}
	
	public String getPrint_pdf(){
		return  print_pdf;
	}
	public void setPrint_pdf(String print_pdf ){
		this.print_pdf = print_pdf;
	}
	
	public BigDecimal getProamount(){
		return  proamount;
	}
	public void setProamount(BigDecimal proamount ){
		this.proamount = proamount;
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
	
	public String getReceiver_name(){
		return  receiver_name;
	}
	public void setReceiver_name(String receiver_name ){
		this.receiver_name = receiver_name;
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
	
	public String getWxpay(){
		return  wxpay;
	}
	public void setWxpay(String wxpay ){
		this.wxpay = wxpay;
	}
	
	public String getZip(){
		return  zip;
	}
	public void setZip(String zip ){
		this.zip = zip;
	}
	

}
