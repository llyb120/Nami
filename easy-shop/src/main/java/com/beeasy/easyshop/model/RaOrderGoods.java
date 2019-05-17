package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_order_goods")
public class RaOrderGoods   {
	
	// alias
	public static final String ALIAS_rec_id = "rec_id";
	public static final String ALIAS_buyer_id = "buyer_id";
	public static final String ALIAS_commis_rate = "commis_rate";
	public static final String ALIAS_gc_id = "gc_id";
	public static final String ALIAS_goods_id = "goods_id";
	public static final String ALIAS_goods_num = "goods_num";
	public static final String ALIAS_order_id = "order_id";
	public static final String ALIAS_promotions_id = "promotions_id";
	public static final String ALIAS_real_count = "real_count";
	public static final String ALIAS_store_id = "store_id";
	public static final String ALIAS_goods_image = "goods_image";
	public static final String ALIAS_goods_name = "goods_name";
	public static final String ALIAS_goods_pay_price = "goods_pay_price";
	public static final String ALIAS_goods_price = "goods_price";
	public static final String ALIAS_goods_proxy = "goods_proxy";
	public static final String ALIAS_goods_type = "goods_type";
	public static final String ALIAS_hangzhou_details = "hangzhou_details";
	public static final String ALIAS_margin = "margin";
	public static final String ALIAS_mobile_margin = "mobile_margin";
	public static final String ALIAS_source_price = "source_price";
	public static final String ALIAS_tax = "tax";
	
	/*
	订单商品表索引id
	*/
	private Integer rec_id ;
	/*
	买家ID
	*/
	private Integer buyer_id ;
	/*
	佣金比例
	*/
	private Integer commis_rate ;
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
	订单id
	*/
	private Integer order_id ;
	/*
	促销活动ID（团购ID/限时折扣ID/优惠套装ID）与goods_type搭配使用
	*/
	private Integer promotions_id ;
	/*
	海关实际发货数量
	*/
	private Integer real_count ;
	/*
	店铺ID
	*/
	private Integer store_id ;
	/*
	商品图片
	*/
	private String goods_image ;
	/*
	商品名称
	*/
	private String goods_name ;
	/*
	商品实际成交价
	*/
	private BigDecimal goods_pay_price ;
	/*
	商品价格
	*/
	private BigDecimal goods_price ;
	private BigDecimal goods_proxy ;
	/*
	1默认2团购商品3限时折扣商品4组合套装5赠品
	*/
	private String goods_type ;
	/*
	杭州海关发货详情
	*/
	private String hangzhou_details ;
	private BigDecimal margin ;
	private BigDecimal mobile_margin ;
	private BigDecimal source_price ;
	private BigDecimal tax ;
	
	public RaOrderGoods() {
	}
	
	/**
	* 订单商品表索引id
	*@return 
	*/
	public Integer getRec_id(){
		return  rec_id;
	}
	/**
	* 订单商品表索引id
	*@param  rec_id
	*/
	public void setRec_id(Integer rec_id ){
		this.rec_id = rec_id;
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
	* 促销活动ID（团购ID/限时折扣ID/优惠套装ID）与goods_type搭配使用
	*@return 
	*/
	public Integer getPromotions_id(){
		return  promotions_id;
	}
	/**
	* 促销活动ID（团购ID/限时折扣ID/优惠套装ID）与goods_type搭配使用
	*@param  promotions_id
	*/
	public void setPromotions_id(Integer promotions_id ){
		this.promotions_id = promotions_id;
	}
	
	/**
	* 海关实际发货数量
	*@return 
	*/
	public Integer getReal_count(){
		return  real_count;
	}
	/**
	* 海关实际发货数量
	*@param  real_count
	*/
	public void setReal_count(Integer real_count ){
		this.real_count = real_count;
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
	* 商品实际成交价
	*@return 
	*/
	public BigDecimal getGoods_pay_price(){
		return  goods_pay_price;
	}
	/**
	* 商品实际成交价
	*@param  goods_pay_price
	*/
	public void setGoods_pay_price(BigDecimal goods_pay_price ){
		this.goods_pay_price = goods_pay_price;
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
	
	public BigDecimal getGoods_proxy(){
		return  goods_proxy;
	}
	public void setGoods_proxy(BigDecimal goods_proxy ){
		this.goods_proxy = goods_proxy;
	}
	
	/**
	* 1默认2团购商品3限时折扣商品4组合套装5赠品
	*@return 
	*/
	public String getGoods_type(){
		return  goods_type;
	}
	/**
	* 1默认2团购商品3限时折扣商品4组合套装5赠品
	*@param  goods_type
	*/
	public void setGoods_type(String goods_type ){
		this.goods_type = goods_type;
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
	
	public BigDecimal getMargin(){
		return  margin;
	}
	public void setMargin(BigDecimal margin ){
		this.margin = margin;
	}
	
	public BigDecimal getMobile_margin(){
		return  mobile_margin;
	}
	public void setMobile_margin(BigDecimal mobile_margin ){
		this.mobile_margin = mobile_margin;
	}
	
	public BigDecimal getSource_price(){
		return  source_price;
	}
	public void setSource_price(BigDecimal source_price ){
		this.source_price = source_price;
	}
	
	public BigDecimal getTax(){
		return  tax;
	}
	public void setTax(BigDecimal tax ){
		this.tax = tax;
	}
	

}
