package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_goods")
public class RaGoods   {
	
	// alias
	public static final String ALIAS_goods_id = "goods_id";
	public static final String ALIAS_areaid_1 = "areaid_1";
	public static final String ALIAS_areaid_2 = "areaid_2";
	public static final String ALIAS_brand_id = "brand_id";
	public static final String ALIAS_color_id = "color_id";
	public static final String ALIAS_evaluation_count = "evaluation_count";
	public static final String ALIAS_evaluation_good_star = "evaluation_good_star";
	public static final String ALIAS_gc_id = "gc_id";
	public static final String ALIAS_gc_id_1 = "gc_id_1";
	public static final String ALIAS_gc_id_2 = "gc_id_2";
	public static final String ALIAS_gc_id_3 = "gc_id_3";
	public static final String ALIAS_goods_addtime = "goods_addtime";
	public static final String ALIAS_goods_click = "goods_click";
	public static final String ALIAS_goods_collect = "goods_collect";
	public static final String ALIAS_goods_commend = "goods_commend";
	public static final String ALIAS_goods_commonid = "goods_commonid";
	public static final String ALIAS_goods_edittime = "goods_edittime";
	public static final String ALIAS_goods_promotion_type = "goods_promotion_type";
	public static final String ALIAS_goods_salenum = "goods_salenum";
	public static final String ALIAS_goods_state = "goods_state";
	public static final String ALIAS_goods_storage = "goods_storage";
	public static final String ALIAS_goods_storage_alarm = "goods_storage_alarm";
	public static final String ALIAS_goods_vat = "goods_vat";
	public static final String ALIAS_goods_verify = "goods_verify";
	public static final String ALIAS_have_gift = "have_gift";
	public static final String ALIAS_is_appoint = "is_appoint";
	public static final String ALIAS_is_fcode = "is_fcode";
	public static final String ALIAS_is_own_shop = "is_own_shop";
	public static final String ALIAS_is_presell = "is_presell";
	public static final String ALIAS_is_virtual = "is_virtual";
	public static final String ALIAS_is_whole = "is_whole";
	public static final String ALIAS_open_tax = "open_tax";
	public static final String ALIAS_store_id = "store_id";
	public static final String ALIAS_transport_id = "transport_id";
	public static final String ALIAS_virtual_indate = "virtual_indate";
	public static final String ALIAS_virtual_invalid_refund = "virtual_invalid_refund";
	public static final String ALIAS_virtual_limit = "virtual_limit";
	public static final String ALIAS_whole_min = "whole_min";
	public static final String ALIAS_gextends = "gextends";
	public static final String ALIAS_goods_freight = "goods_freight";
	public static final String ALIAS_goods_image = "goods_image";
	public static final String ALIAS_goods_jingle = "goods_jingle";
	public static final String ALIAS_goods_marketprice = "goods_marketprice";
	public static final String ALIAS_goods_name = "goods_name";
	public static final String ALIAS_goods_price = "goods_price";
	public static final String ALIAS_goods_promotion_price = "goods_promotion_price";
	public static final String ALIAS_goods_serial = "goods_serial";
	public static final String ALIAS_goods_spec = "goods_spec";
	public static final String ALIAS_goods_stcids = "goods_stcids";
	public static final String ALIAS_link_goods = "link_goods";
	public static final String ALIAS_proxy_factor = "proxy_factor";
	public static final String ALIAS_proxy_gold_formula = "proxy_gold_formula";
	public static final String ALIAS_sharp = "sharp";
	public static final String ALIAS_spec_name = "spec_name";
	public static final String ALIAS_store_name = "store_name";
	public static final String ALIAS_tax = "tax";
	public static final String ALIAS_whole_price = "whole_price";
	
	/*
	商品id(SKU)
	*/
	private Integer goods_id ;
	/*
	一级地区id
	*/
	private Integer areaid_1 ;
	/*
	二级地区id
	*/
	private Integer areaid_2 ;
	/*
	品牌id
	*/
	private Integer brand_id ;
	/*
	颜色规格id
	*/
	private Integer color_id ;
	/*
	评价数
	*/
	private Integer evaluation_count ;
	/*
	好评星级
	*/
	private Integer evaluation_good_star ;
	/*
	商品分类id
	*/
	private Integer gc_id ;
	/*
	一级分类id
	*/
	private Integer gc_id_1 ;
	/*
	二级分类id
	*/
	private Integer gc_id_2 ;
	/*
	三级分类id
	*/
	private Integer gc_id_3 ;
	/*
	商品添加时间
	*/
	private Integer goods_addtime ;
	/*
	商品点击数量
	*/
	private Integer goods_click ;
	/*
	收藏数量
	*/
	private Integer goods_collect ;
	/*
	商品推荐 1是，0否 默认0
	*/
	private Integer goods_commend ;
	/*
	商品公共表id
	*/
	private Integer goods_commonid ;
	/*
	商品编辑时间
	*/
	private Integer goods_edittime ;
	/*
	促销类型 0无促销，1团购，2限时折扣
	*/
	private Integer goods_promotion_type ;
	/*
	销售数量
	*/
	private Integer goods_salenum ;
	/*
	商品状态 0下架，1正常，10违规（禁售）
	*/
	private Integer goods_state ;
	/*
	商品库存
	*/
	private Integer goods_storage ;
	/*
	库存报警值
	*/
	private Integer goods_storage_alarm ;
	/*
	是否开具增值税发票 1是，0否
	*/
	private Integer goods_vat ;
	/*
	商品审核 1通过，0未通过，10审核中
	*/
	private Integer goods_verify ;
	/*
	是否拥有赠品
	*/
	private Integer have_gift ;
	/*
	是否是预约商品 1是，0否
	*/
	private Integer is_appoint ;
	/*
	是否为F码商品 1是，0否
	*/
	private Integer is_fcode ;
	/*
	是否为平台自营
	*/
	private Integer is_own_shop ;
	/*
	是否是预售商品 1是，0否
	*/
	private Integer is_presell ;
	/*
	是否为虚拟商品 1是，0否
	*/
	private Integer is_virtual ;
	private Integer is_whole ;
	private Integer open_tax ;
	/*
	店铺id
	*/
	private Integer store_id ;
	/*
	运费模板id
	*/
	private Integer transport_id ;
	/*
	虚拟商品有效期
	*/
	private Integer virtual_indate ;
	/*
	是否允许过期退款， 1是，0否
	*/
	private Integer virtual_invalid_refund ;
	/*
	虚拟商品购买上限
	*/
	private Integer virtual_limit ;
	/*
	起批量
	*/
	private Integer whole_min ;
	private String gextends ;
	/*
	运费 0为免运费
	*/
	private BigDecimal goods_freight ;
	/*
	商品主图
	*/
	private String goods_image ;
	/*
	商品广告词
	*/
	private String goods_jingle ;
	/*
	市场价
	*/
	private BigDecimal goods_marketprice ;
	/*
	商品名称（+规格名称）
	*/
	private String goods_name ;
	/*
	商品价格
	*/
	private BigDecimal goods_price ;
	/*
	商品促销价格
	*/
	private BigDecimal goods_promotion_price ;
	/*
	商家编号
	*/
	private String goods_serial ;
	/*
	商品规格序列化
	*/
	private String goods_spec ;
	/*
	店铺分类id 首尾用,隔开
	*/
	private String goods_stcids ;
	private String link_goods ;
	private String proxy_factor ;
	private String proxy_gold_formula ;
	private String sharp ;
	private String spec_name ;
	/*
	店铺名称
	*/
	private String store_name ;
	private BigDecimal tax ;
	private Long whole_price ;
	
	public RaGoods() {
	}
	
	/**
	* 商品id(SKU)
	*@return 
	*/
	public Integer getGoods_id(){
		return  goods_id;
	}
	/**
	* 商品id(SKU)
	*@param  goods_id
	*/
	public void setGoods_id(Integer goods_id ){
		this.goods_id = goods_id;
	}
	
	/**
	* 一级地区id
	*@return 
	*/
	public Integer getAreaid_1(){
		return  areaid_1;
	}
	/**
	* 一级地区id
	*@param  areaid_1
	*/
	public void setAreaid_1(Integer areaid_1 ){
		this.areaid_1 = areaid_1;
	}
	
	/**
	* 二级地区id
	*@return 
	*/
	public Integer getAreaid_2(){
		return  areaid_2;
	}
	/**
	* 二级地区id
	*@param  areaid_2
	*/
	public void setAreaid_2(Integer areaid_2 ){
		this.areaid_2 = areaid_2;
	}
	
	/**
	* 品牌id
	*@return 
	*/
	public Integer getBrand_id(){
		return  brand_id;
	}
	/**
	* 品牌id
	*@param  brand_id
	*/
	public void setBrand_id(Integer brand_id ){
		this.brand_id = brand_id;
	}
	
	/**
	* 颜色规格id
	*@return 
	*/
	public Integer getColor_id(){
		return  color_id;
	}
	/**
	* 颜色规格id
	*@param  color_id
	*/
	public void setColor_id(Integer color_id ){
		this.color_id = color_id;
	}
	
	/**
	* 评价数
	*@return 
	*/
	public Integer getEvaluation_count(){
		return  evaluation_count;
	}
	/**
	* 评价数
	*@param  evaluation_count
	*/
	public void setEvaluation_count(Integer evaluation_count ){
		this.evaluation_count = evaluation_count;
	}
	
	/**
	* 好评星级
	*@return 
	*/
	public Integer getEvaluation_good_star(){
		return  evaluation_good_star;
	}
	/**
	* 好评星级
	*@param  evaluation_good_star
	*/
	public void setEvaluation_good_star(Integer evaluation_good_star ){
		this.evaluation_good_star = evaluation_good_star;
	}
	
	/**
	* 商品分类id
	*@return 
	*/
	public Integer getGc_id(){
		return  gc_id;
	}
	/**
	* 商品分类id
	*@param  gc_id
	*/
	public void setGc_id(Integer gc_id ){
		this.gc_id = gc_id;
	}
	
	/**
	* 一级分类id
	*@return 
	*/
	public Integer getGc_id_1(){
		return  gc_id_1;
	}
	/**
	* 一级分类id
	*@param  gc_id_1
	*/
	public void setGc_id_1(Integer gc_id_1 ){
		this.gc_id_1 = gc_id_1;
	}
	
	/**
	* 二级分类id
	*@return 
	*/
	public Integer getGc_id_2(){
		return  gc_id_2;
	}
	/**
	* 二级分类id
	*@param  gc_id_2
	*/
	public void setGc_id_2(Integer gc_id_2 ){
		this.gc_id_2 = gc_id_2;
	}
	
	/**
	* 三级分类id
	*@return 
	*/
	public Integer getGc_id_3(){
		return  gc_id_3;
	}
	/**
	* 三级分类id
	*@param  gc_id_3
	*/
	public void setGc_id_3(Integer gc_id_3 ){
		this.gc_id_3 = gc_id_3;
	}
	
	/**
	* 商品添加时间
	*@return 
	*/
	public Integer getGoods_addtime(){
		return  goods_addtime;
	}
	/**
	* 商品添加时间
	*@param  goods_addtime
	*/
	public void setGoods_addtime(Integer goods_addtime ){
		this.goods_addtime = goods_addtime;
	}
	
	/**
	* 商品点击数量
	*@return 
	*/
	public Integer getGoods_click(){
		return  goods_click;
	}
	/**
	* 商品点击数量
	*@param  goods_click
	*/
	public void setGoods_click(Integer goods_click ){
		this.goods_click = goods_click;
	}
	
	/**
	* 收藏数量
	*@return 
	*/
	public Integer getGoods_collect(){
		return  goods_collect;
	}
	/**
	* 收藏数量
	*@param  goods_collect
	*/
	public void setGoods_collect(Integer goods_collect ){
		this.goods_collect = goods_collect;
	}
	
	/**
	* 商品推荐 1是，0否 默认0
	*@return 
	*/
	public Integer getGoods_commend(){
		return  goods_commend;
	}
	/**
	* 商品推荐 1是，0否 默认0
	*@param  goods_commend
	*/
	public void setGoods_commend(Integer goods_commend ){
		this.goods_commend = goods_commend;
	}
	
	/**
	* 商品公共表id
	*@return 
	*/
	public Integer getGoods_commonid(){
		return  goods_commonid;
	}
	/**
	* 商品公共表id
	*@param  goods_commonid
	*/
	public void setGoods_commonid(Integer goods_commonid ){
		this.goods_commonid = goods_commonid;
	}
	
	/**
	* 商品编辑时间
	*@return 
	*/
	public Integer getGoods_edittime(){
		return  goods_edittime;
	}
	/**
	* 商品编辑时间
	*@param  goods_edittime
	*/
	public void setGoods_edittime(Integer goods_edittime ){
		this.goods_edittime = goods_edittime;
	}
	
	/**
	* 促销类型 0无促销，1团购，2限时折扣
	*@return 
	*/
	public Integer getGoods_promotion_type(){
		return  goods_promotion_type;
	}
	/**
	* 促销类型 0无促销，1团购，2限时折扣
	*@param  goods_promotion_type
	*/
	public void setGoods_promotion_type(Integer goods_promotion_type ){
		this.goods_promotion_type = goods_promotion_type;
	}
	
	/**
	* 销售数量
	*@return 
	*/
	public Integer getGoods_salenum(){
		return  goods_salenum;
	}
	/**
	* 销售数量
	*@param  goods_salenum
	*/
	public void setGoods_salenum(Integer goods_salenum ){
		this.goods_salenum = goods_salenum;
	}
	
	/**
	* 商品状态 0下架，1正常，10违规（禁售）
	*@return 
	*/
	public Integer getGoods_state(){
		return  goods_state;
	}
	/**
	* 商品状态 0下架，1正常，10违规（禁售）
	*@param  goods_state
	*/
	public void setGoods_state(Integer goods_state ){
		this.goods_state = goods_state;
	}
	
	/**
	* 商品库存
	*@return 
	*/
	public Integer getGoods_storage(){
		return  goods_storage;
	}
	/**
	* 商品库存
	*@param  goods_storage
	*/
	public void setGoods_storage(Integer goods_storage ){
		this.goods_storage = goods_storage;
	}
	
	/**
	* 库存报警值
	*@return 
	*/
	public Integer getGoods_storage_alarm(){
		return  goods_storage_alarm;
	}
	/**
	* 库存报警值
	*@param  goods_storage_alarm
	*/
	public void setGoods_storage_alarm(Integer goods_storage_alarm ){
		this.goods_storage_alarm = goods_storage_alarm;
	}
	
	/**
	* 是否开具增值税发票 1是，0否
	*@return 
	*/
	public Integer getGoods_vat(){
		return  goods_vat;
	}
	/**
	* 是否开具增值税发票 1是，0否
	*@param  goods_vat
	*/
	public void setGoods_vat(Integer goods_vat ){
		this.goods_vat = goods_vat;
	}
	
	/**
	* 商品审核 1通过，0未通过，10审核中
	*@return 
	*/
	public Integer getGoods_verify(){
		return  goods_verify;
	}
	/**
	* 商品审核 1通过，0未通过，10审核中
	*@param  goods_verify
	*/
	public void setGoods_verify(Integer goods_verify ){
		this.goods_verify = goods_verify;
	}
	
	/**
	* 是否拥有赠品
	*@return 
	*/
	public Integer getHave_gift(){
		return  have_gift;
	}
	/**
	* 是否拥有赠品
	*@param  have_gift
	*/
	public void setHave_gift(Integer have_gift ){
		this.have_gift = have_gift;
	}
	
	/**
	* 是否是预约商品 1是，0否
	*@return 
	*/
	public Integer getIs_appoint(){
		return  is_appoint;
	}
	/**
	* 是否是预约商品 1是，0否
	*@param  is_appoint
	*/
	public void setIs_appoint(Integer is_appoint ){
		this.is_appoint = is_appoint;
	}
	
	/**
	* 是否为F码商品 1是，0否
	*@return 
	*/
	public Integer getIs_fcode(){
		return  is_fcode;
	}
	/**
	* 是否为F码商品 1是，0否
	*@param  is_fcode
	*/
	public void setIs_fcode(Integer is_fcode ){
		this.is_fcode = is_fcode;
	}
	
	/**
	* 是否为平台自营
	*@return 
	*/
	public Integer getIs_own_shop(){
		return  is_own_shop;
	}
	/**
	* 是否为平台自营
	*@param  is_own_shop
	*/
	public void setIs_own_shop(Integer is_own_shop ){
		this.is_own_shop = is_own_shop;
	}
	
	/**
	* 是否是预售商品 1是，0否
	*@return 
	*/
	public Integer getIs_presell(){
		return  is_presell;
	}
	/**
	* 是否是预售商品 1是，0否
	*@param  is_presell
	*/
	public void setIs_presell(Integer is_presell ){
		this.is_presell = is_presell;
	}
	
	/**
	* 是否为虚拟商品 1是，0否
	*@return 
	*/
	public Integer getIs_virtual(){
		return  is_virtual;
	}
	/**
	* 是否为虚拟商品 1是，0否
	*@param  is_virtual
	*/
	public void setIs_virtual(Integer is_virtual ){
		this.is_virtual = is_virtual;
	}
	
	public Integer getIs_whole(){
		return  is_whole;
	}
	public void setIs_whole(Integer is_whole ){
		this.is_whole = is_whole;
	}
	
	public Integer getOpen_tax(){
		return  open_tax;
	}
	public void setOpen_tax(Integer open_tax ){
		this.open_tax = open_tax;
	}
	
	/**
	* 店铺id
	*@return 
	*/
	public Integer getStore_id(){
		return  store_id;
	}
	/**
	* 店铺id
	*@param  store_id
	*/
	public void setStore_id(Integer store_id ){
		this.store_id = store_id;
	}
	
	/**
	* 运费模板id
	*@return 
	*/
	public Integer getTransport_id(){
		return  transport_id;
	}
	/**
	* 运费模板id
	*@param  transport_id
	*/
	public void setTransport_id(Integer transport_id ){
		this.transport_id = transport_id;
	}
	
	/**
	* 虚拟商品有效期
	*@return 
	*/
	public Integer getVirtual_indate(){
		return  virtual_indate;
	}
	/**
	* 虚拟商品有效期
	*@param  virtual_indate
	*/
	public void setVirtual_indate(Integer virtual_indate ){
		this.virtual_indate = virtual_indate;
	}
	
	/**
	* 是否允许过期退款， 1是，0否
	*@return 
	*/
	public Integer getVirtual_invalid_refund(){
		return  virtual_invalid_refund;
	}
	/**
	* 是否允许过期退款， 1是，0否
	*@param  virtual_invalid_refund
	*/
	public void setVirtual_invalid_refund(Integer virtual_invalid_refund ){
		this.virtual_invalid_refund = virtual_invalid_refund;
	}
	
	/**
	* 虚拟商品购买上限
	*@return 
	*/
	public Integer getVirtual_limit(){
		return  virtual_limit;
	}
	/**
	* 虚拟商品购买上限
	*@param  virtual_limit
	*/
	public void setVirtual_limit(Integer virtual_limit ){
		this.virtual_limit = virtual_limit;
	}
	
	/**
	* 起批量
	*@return 
	*/
	public Integer getWhole_min(){
		return  whole_min;
	}
	/**
	* 起批量
	*@param  whole_min
	*/
	public void setWhole_min(Integer whole_min ){
		this.whole_min = whole_min;
	}
	
	public String getGextends(){
		return  gextends;
	}
	public void setGextends(String gextends ){
		this.gextends = gextends;
	}
	
	/**
	* 运费 0为免运费
	*@return 
	*/
	public BigDecimal getGoods_freight(){
		return  goods_freight;
	}
	/**
	* 运费 0为免运费
	*@param  goods_freight
	*/
	public void setGoods_freight(BigDecimal goods_freight ){
		this.goods_freight = goods_freight;
	}
	
	/**
	* 商品主图
	*@return 
	*/
	public String getGoods_image(){
		return  goods_image;
	}
	/**
	* 商品主图
	*@param  goods_image
	*/
	public void setGoods_image(String goods_image ){
		this.goods_image = goods_image;
	}
	
	/**
	* 商品广告词
	*@return 
	*/
	public String getGoods_jingle(){
		return  goods_jingle;
	}
	/**
	* 商品广告词
	*@param  goods_jingle
	*/
	public void setGoods_jingle(String goods_jingle ){
		this.goods_jingle = goods_jingle;
	}
	
	/**
	* 市场价
	*@return 
	*/
	public BigDecimal getGoods_marketprice(){
		return  goods_marketprice;
	}
	/**
	* 市场价
	*@param  goods_marketprice
	*/
	public void setGoods_marketprice(BigDecimal goods_marketprice ){
		this.goods_marketprice = goods_marketprice;
	}
	
	/**
	* 商品名称（+规格名称）
	*@return 
	*/
	public String getGoods_name(){
		return  goods_name;
	}
	/**
	* 商品名称（+规格名称）
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
	* 商品促销价格
	*@return 
	*/
	public BigDecimal getGoods_promotion_price(){
		return  goods_promotion_price;
	}
	/**
	* 商品促销价格
	*@param  goods_promotion_price
	*/
	public void setGoods_promotion_price(BigDecimal goods_promotion_price ){
		this.goods_promotion_price = goods_promotion_price;
	}
	
	/**
	* 商家编号
	*@return 
	*/
	public String getGoods_serial(){
		return  goods_serial;
	}
	/**
	* 商家编号
	*@param  goods_serial
	*/
	public void setGoods_serial(String goods_serial ){
		this.goods_serial = goods_serial;
	}
	
	/**
	* 商品规格序列化
	*@return 
	*/
	public String getGoods_spec(){
		return  goods_spec;
	}
	/**
	* 商品规格序列化
	*@param  goods_spec
	*/
	public void setGoods_spec(String goods_spec ){
		this.goods_spec = goods_spec;
	}
	
	/**
	* 店铺分类id 首尾用,隔开
	*@return 
	*/
	public String getGoods_stcids(){
		return  goods_stcids;
	}
	/**
	* 店铺分类id 首尾用,隔开
	*@param  goods_stcids
	*/
	public void setGoods_stcids(String goods_stcids ){
		this.goods_stcids = goods_stcids;
	}
	
	public String getLink_goods(){
		return  link_goods;
	}
	public void setLink_goods(String link_goods ){
		this.link_goods = link_goods;
	}
	
	public String getProxy_factor(){
		return  proxy_factor;
	}
	public void setProxy_factor(String proxy_factor ){
		this.proxy_factor = proxy_factor;
	}
	
	public String getProxy_gold_formula(){
		return  proxy_gold_formula;
	}
	public void setProxy_gold_formula(String proxy_gold_formula ){
		this.proxy_gold_formula = proxy_gold_formula;
	}
	
	public String getSharp(){
		return  sharp;
	}
	public void setSharp(String sharp ){
		this.sharp = sharp;
	}
	
	public String getSpec_name(){
		return  spec_name;
	}
	public void setSpec_name(String spec_name ){
		this.spec_name = spec_name;
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
	
	public BigDecimal getTax(){
		return  tax;
	}
	public void setTax(BigDecimal tax ){
		this.tax = tax;
	}
	
	public Long getWhole_price(){
		return  whole_price;
	}
	public void setWhole_price(Long whole_price ){
		this.whole_price = whole_price;
	}
	

}
