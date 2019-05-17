package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_groupbuy")
public class RaGroupbuy   {
	
	// alias
	public static final String ALIAS_groupbuy_id = "groupbuy_id";
	public static final String ALIAS_buy_quantity = "buy_quantity";
	public static final String ALIAS_buyer_count = "buyer_count";
	public static final String ALIAS_class_id = "class_id";
	public static final String ALIAS_end_time = "end_time";
	public static final String ALIAS_goods_commonid = "goods_commonid";
	public static final String ALIAS_goods_id = "goods_id";
	public static final String ALIAS_is_vr = "is_vr";
	public static final String ALIAS_recommended = "recommended";
	public static final String ALIAS_s_class_id = "s_class_id";
	public static final String ALIAS_start_time = "start_time";
	public static final String ALIAS_state = "state";
	public static final String ALIAS_store_id = "store_id";
	public static final String ALIAS_upper_limit = "upper_limit";
	public static final String ALIAS_views = "views";
	public static final String ALIAS_virtual_quantity = "virtual_quantity";
	public static final String ALIAS_vr_area_id = "vr_area_id";
	public static final String ALIAS_vr_city_id = "vr_city_id";
	public static final String ALIAS_vr_class_id = "vr_class_id";
	public static final String ALIAS_vr_mall_id = "vr_mall_id";
	public static final String ALIAS_vr_s_class_id = "vr_s_class_id";
	public static final String ALIAS_goods_name = "goods_name";
	public static final String ALIAS_goods_price = "goods_price";
	public static final String ALIAS_groupbuy_image = "groupbuy_image";
	public static final String ALIAS_groupbuy_image1 = "groupbuy_image1";
	public static final String ALIAS_groupbuy_intro = "groupbuy_intro";
	public static final String ALIAS_groupbuy_name = "groupbuy_name";
	public static final String ALIAS_groupbuy_price = "groupbuy_price";
	public static final String ALIAS_groupbuy_rebate = "groupbuy_rebate";
	public static final String ALIAS_remark = "remark";
	public static final String ALIAS_store_name = "store_name";
	
	/*
	团购ID
	*/
	private Integer groupbuy_id ;
	/*
	购买数量
	*/
	private Integer buy_quantity ;
	/*
	已购买人数
	*/
	private Integer buyer_count ;
	/*
	团购类别编号
	*/
	private Integer class_id ;
	/*
	结束时间
	*/
	private Integer end_time ;
	/*
	商品公共表ID
	*/
	private Integer goods_commonid ;
	/*
	商品ID
	*/
	private Integer goods_id ;
	/*
	是否虚拟团购 1是0否
	*/
	private Integer is_vr ;
	/*
	是否推荐 0.未推荐 1.已推荐
	*/
	private Integer recommended ;
	/*
	团购2级分类id
	*/
	private Integer s_class_id ;
	/*
	开始时间
	*/
	private Integer start_time ;
	/*
	团购状态 10-审核中 20-正常 30-审核失败 31-管理员关闭 32-已结束
	*/
	private Integer state ;
	/*
	店铺ID
	*/
	private Integer store_id ;
	/*
	购买上限
	*/
	private Integer upper_limit ;
	/*
	查看次数
	*/
	private Integer views ;
	/*
	虚拟购买数量
	*/
	private Integer virtual_quantity ;
	/*
	虚拟团购区域id
	*/
	private Integer vr_area_id ;
	/*
	虚拟团购城市id
	*/
	private Integer vr_city_id ;
	/*
	虚拟团购大分类id
	*/
	private Integer vr_class_id ;
	/*
	虚拟团购商区id
	*/
	private Integer vr_mall_id ;
	/*
	虚拟团购小分类id
	*/
	private Integer vr_s_class_id ;
	/*
	商品名称
	*/
	private String goods_name ;
	/*
	商品原价
	*/
	private BigDecimal goods_price ;
	/*
	团购图片
	*/
	private String groupbuy_image ;
	/*
	团购图片1
	*/
	private String groupbuy_image1 ;
	/*
	本团介绍
	*/
	private String groupbuy_intro ;
	/*
	活动名称
	*/
	private String groupbuy_name ;
	/*
	团购价格
	*/
	private BigDecimal groupbuy_price ;
	/*
	折扣
	*/
	private BigDecimal groupbuy_rebate ;
	/*
	备注
	*/
	private String remark ;
	/*
	店铺名称
	*/
	private String store_name ;
	
	public RaGroupbuy() {
	}
	
	/**
	* 团购ID
	*@return 
	*/
	public Integer getGroupbuy_id(){
		return  groupbuy_id;
	}
	/**
	* 团购ID
	*@param  groupbuy_id
	*/
	public void setGroupbuy_id(Integer groupbuy_id ){
		this.groupbuy_id = groupbuy_id;
	}
	
	/**
	* 购买数量
	*@return 
	*/
	public Integer getBuy_quantity(){
		return  buy_quantity;
	}
	/**
	* 购买数量
	*@param  buy_quantity
	*/
	public void setBuy_quantity(Integer buy_quantity ){
		this.buy_quantity = buy_quantity;
	}
	
	/**
	* 已购买人数
	*@return 
	*/
	public Integer getBuyer_count(){
		return  buyer_count;
	}
	/**
	* 已购买人数
	*@param  buyer_count
	*/
	public void setBuyer_count(Integer buyer_count ){
		this.buyer_count = buyer_count;
	}
	
	/**
	* 团购类别编号
	*@return 
	*/
	public Integer getClass_id(){
		return  class_id;
	}
	/**
	* 团购类别编号
	*@param  class_id
	*/
	public void setClass_id(Integer class_id ){
		this.class_id = class_id;
	}
	
	/**
	* 结束时间
	*@return 
	*/
	public Integer getEnd_time(){
		return  end_time;
	}
	/**
	* 结束时间
	*@param  end_time
	*/
	public void setEnd_time(Integer end_time ){
		this.end_time = end_time;
	}
	
	/**
	* 商品公共表ID
	*@return 
	*/
	public Integer getGoods_commonid(){
		return  goods_commonid;
	}
	/**
	* 商品公共表ID
	*@param  goods_commonid
	*/
	public void setGoods_commonid(Integer goods_commonid ){
		this.goods_commonid = goods_commonid;
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
	* 是否虚拟团购 1是0否
	*@return 
	*/
	public Integer getIs_vr(){
		return  is_vr;
	}
	/**
	* 是否虚拟团购 1是0否
	*@param  is_vr
	*/
	public void setIs_vr(Integer is_vr ){
		this.is_vr = is_vr;
	}
	
	/**
	* 是否推荐 0.未推荐 1.已推荐
	*@return 
	*/
	public Integer getRecommended(){
		return  recommended;
	}
	/**
	* 是否推荐 0.未推荐 1.已推荐
	*@param  recommended
	*/
	public void setRecommended(Integer recommended ){
		this.recommended = recommended;
	}
	
	/**
	* 团购2级分类id
	*@return 
	*/
	public Integer getS_class_id(){
		return  s_class_id;
	}
	/**
	* 团购2级分类id
	*@param  s_class_id
	*/
	public void setS_class_id(Integer s_class_id ){
		this.s_class_id = s_class_id;
	}
	
	/**
	* 开始时间
	*@return 
	*/
	public Integer getStart_time(){
		return  start_time;
	}
	/**
	* 开始时间
	*@param  start_time
	*/
	public void setStart_time(Integer start_time ){
		this.start_time = start_time;
	}
	
	/**
	* 团购状态 10-审核中 20-正常 30-审核失败 31-管理员关闭 32-已结束
	*@return 
	*/
	public Integer getState(){
		return  state;
	}
	/**
	* 团购状态 10-审核中 20-正常 30-审核失败 31-管理员关闭 32-已结束
	*@param  state
	*/
	public void setState(Integer state ){
		this.state = state;
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
	* 购买上限
	*@return 
	*/
	public Integer getUpper_limit(){
		return  upper_limit;
	}
	/**
	* 购买上限
	*@param  upper_limit
	*/
	public void setUpper_limit(Integer upper_limit ){
		this.upper_limit = upper_limit;
	}
	
	/**
	* 查看次数
	*@return 
	*/
	public Integer getViews(){
		return  views;
	}
	/**
	* 查看次数
	*@param  views
	*/
	public void setViews(Integer views ){
		this.views = views;
	}
	
	/**
	* 虚拟购买数量
	*@return 
	*/
	public Integer getVirtual_quantity(){
		return  virtual_quantity;
	}
	/**
	* 虚拟购买数量
	*@param  virtual_quantity
	*/
	public void setVirtual_quantity(Integer virtual_quantity ){
		this.virtual_quantity = virtual_quantity;
	}
	
	/**
	* 虚拟团购区域id
	*@return 
	*/
	public Integer getVr_area_id(){
		return  vr_area_id;
	}
	/**
	* 虚拟团购区域id
	*@param  vr_area_id
	*/
	public void setVr_area_id(Integer vr_area_id ){
		this.vr_area_id = vr_area_id;
	}
	
	/**
	* 虚拟团购城市id
	*@return 
	*/
	public Integer getVr_city_id(){
		return  vr_city_id;
	}
	/**
	* 虚拟团购城市id
	*@param  vr_city_id
	*/
	public void setVr_city_id(Integer vr_city_id ){
		this.vr_city_id = vr_city_id;
	}
	
	/**
	* 虚拟团购大分类id
	*@return 
	*/
	public Integer getVr_class_id(){
		return  vr_class_id;
	}
	/**
	* 虚拟团购大分类id
	*@param  vr_class_id
	*/
	public void setVr_class_id(Integer vr_class_id ){
		this.vr_class_id = vr_class_id;
	}
	
	/**
	* 虚拟团购商区id
	*@return 
	*/
	public Integer getVr_mall_id(){
		return  vr_mall_id;
	}
	/**
	* 虚拟团购商区id
	*@param  vr_mall_id
	*/
	public void setVr_mall_id(Integer vr_mall_id ){
		this.vr_mall_id = vr_mall_id;
	}
	
	/**
	* 虚拟团购小分类id
	*@return 
	*/
	public Integer getVr_s_class_id(){
		return  vr_s_class_id;
	}
	/**
	* 虚拟团购小分类id
	*@param  vr_s_class_id
	*/
	public void setVr_s_class_id(Integer vr_s_class_id ){
		this.vr_s_class_id = vr_s_class_id;
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
	* 商品原价
	*@return 
	*/
	public BigDecimal getGoods_price(){
		return  goods_price;
	}
	/**
	* 商品原价
	*@param  goods_price
	*/
	public void setGoods_price(BigDecimal goods_price ){
		this.goods_price = goods_price;
	}
	
	/**
	* 团购图片
	*@return 
	*/
	public String getGroupbuy_image(){
		return  groupbuy_image;
	}
	/**
	* 团购图片
	*@param  groupbuy_image
	*/
	public void setGroupbuy_image(String groupbuy_image ){
		this.groupbuy_image = groupbuy_image;
	}
	
	/**
	* 团购图片1
	*@return 
	*/
	public String getGroupbuy_image1(){
		return  groupbuy_image1;
	}
	/**
	* 团购图片1
	*@param  groupbuy_image1
	*/
	public void setGroupbuy_image1(String groupbuy_image1 ){
		this.groupbuy_image1 = groupbuy_image1;
	}
	
	/**
	* 本团介绍
	*@return 
	*/
	public String getGroupbuy_intro(){
		return  groupbuy_intro;
	}
	/**
	* 本团介绍
	*@param  groupbuy_intro
	*/
	public void setGroupbuy_intro(String groupbuy_intro ){
		this.groupbuy_intro = groupbuy_intro;
	}
	
	/**
	* 活动名称
	*@return 
	*/
	public String getGroupbuy_name(){
		return  groupbuy_name;
	}
	/**
	* 活动名称
	*@param  groupbuy_name
	*/
	public void setGroupbuy_name(String groupbuy_name ){
		this.groupbuy_name = groupbuy_name;
	}
	
	/**
	* 团购价格
	*@return 
	*/
	public BigDecimal getGroupbuy_price(){
		return  groupbuy_price;
	}
	/**
	* 团购价格
	*@param  groupbuy_price
	*/
	public void setGroupbuy_price(BigDecimal groupbuy_price ){
		this.groupbuy_price = groupbuy_price;
	}
	
	/**
	* 折扣
	*@return 
	*/
	public BigDecimal getGroupbuy_rebate(){
		return  groupbuy_rebate;
	}
	/**
	* 折扣
	*@param  groupbuy_rebate
	*/
	public void setGroupbuy_rebate(BigDecimal groupbuy_rebate ){
		this.groupbuy_rebate = groupbuy_rebate;
	}
	
	/**
	* 备注
	*@return 
	*/
	public String getRemark(){
		return  remark;
	}
	/**
	* 备注
	*@param  remark
	*/
	public void setRemark(String remark ){
		this.remark = remark;
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
