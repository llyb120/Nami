package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_p_xianshi_goods")
public class RaPXianshiGoods   {
	
	// alias
	public static final String ALIAS_xianshi_goods_id = "xianshi_goods_id";
	public static final String ALIAS_end_time = "end_time";
	public static final String ALIAS_goods_id = "goods_id";
	public static final String ALIAS_lower_limit = "lower_limit";
	public static final String ALIAS_start_time = "start_time";
	public static final String ALIAS_state = "state";
	public static final String ALIAS_store_id = "store_id";
	public static final String ALIAS_xianshi_id = "xianshi_id";
	public static final String ALIAS_xianshi_recommend = "xianshi_recommend";
	public static final String ALIAS_goods_image = "goods_image";
	public static final String ALIAS_goods_name = "goods_name";
	public static final String ALIAS_goods_price = "goods_price";
	public static final String ALIAS_xianshi_explain = "xianshi_explain";
	public static final String ALIAS_xianshi_name = "xianshi_name";
	public static final String ALIAS_xianshi_price = "xianshi_price";
	public static final String ALIAS_xianshi_title = "xianshi_title";
	
	/*
	限时折扣商品表
	*/
	private Integer xianshi_goods_id ;
	/*
	结束时间
	*/
	private Integer end_time ;
	/*
	商品编号
	*/
	private Integer goods_id ;
	/*
	购买下限，0为不限制
	*/
	private Integer lower_limit ;
	/*
	开始时间
	*/
	private Integer start_time ;
	/*
	状态，0-取消 1-正常
	*/
	private Integer state ;
	/*
	店铺编号
	*/
	private Integer store_id ;
	/*
	限时活动编号
	*/
	private Integer xianshi_id ;
	/*
	推荐标志 0-未推荐 1-已推荐
	*/
	private Integer xianshi_recommend ;
	/*
	商品图片
	*/
	private String goods_image ;
	/*
	商品名称
	*/
	private String goods_name ;
	/*
	店铺价格
	*/
	private BigDecimal goods_price ;
	/*
	活动说明
	*/
	private String xianshi_explain ;
	/*
	活动名称
	*/
	private String xianshi_name ;
	/*
	限时折扣价格
	*/
	private BigDecimal xianshi_price ;
	/*
	活动标题
	*/
	private String xianshi_title ;
	
	public RaPXianshiGoods() {
	}
	
	/**
	* 限时折扣商品表
	*@return 
	*/
	public Integer getXianshi_goods_id(){
		return  xianshi_goods_id;
	}
	/**
	* 限时折扣商品表
	*@param  xianshi_goods_id
	*/
	public void setXianshi_goods_id(Integer xianshi_goods_id ){
		this.xianshi_goods_id = xianshi_goods_id;
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
	* 商品编号
	*@return 
	*/
	public Integer getGoods_id(){
		return  goods_id;
	}
	/**
	* 商品编号
	*@param  goods_id
	*/
	public void setGoods_id(Integer goods_id ){
		this.goods_id = goods_id;
	}
	
	/**
	* 购买下限，0为不限制
	*@return 
	*/
	public Integer getLower_limit(){
		return  lower_limit;
	}
	/**
	* 购买下限，0为不限制
	*@param  lower_limit
	*/
	public void setLower_limit(Integer lower_limit ){
		this.lower_limit = lower_limit;
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
	* 状态，0-取消 1-正常
	*@return 
	*/
	public Integer getState(){
		return  state;
	}
	/**
	* 状态，0-取消 1-正常
	*@param  state
	*/
	public void setState(Integer state ){
		this.state = state;
	}
	
	/**
	* 店铺编号
	*@return 
	*/
	public Integer getStore_id(){
		return  store_id;
	}
	/**
	* 店铺编号
	*@param  store_id
	*/
	public void setStore_id(Integer store_id ){
		this.store_id = store_id;
	}
	
	/**
	* 限时活动编号
	*@return 
	*/
	public Integer getXianshi_id(){
		return  xianshi_id;
	}
	/**
	* 限时活动编号
	*@param  xianshi_id
	*/
	public void setXianshi_id(Integer xianshi_id ){
		this.xianshi_id = xianshi_id;
	}
	
	/**
	* 推荐标志 0-未推荐 1-已推荐
	*@return 
	*/
	public Integer getXianshi_recommend(){
		return  xianshi_recommend;
	}
	/**
	* 推荐标志 0-未推荐 1-已推荐
	*@param  xianshi_recommend
	*/
	public void setXianshi_recommend(Integer xianshi_recommend ){
		this.xianshi_recommend = xianshi_recommend;
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
	* 店铺价格
	*@return 
	*/
	public BigDecimal getGoods_price(){
		return  goods_price;
	}
	/**
	* 店铺价格
	*@param  goods_price
	*/
	public void setGoods_price(BigDecimal goods_price ){
		this.goods_price = goods_price;
	}
	
	/**
	* 活动说明
	*@return 
	*/
	public String getXianshi_explain(){
		return  xianshi_explain;
	}
	/**
	* 活动说明
	*@param  xianshi_explain
	*/
	public void setXianshi_explain(String xianshi_explain ){
		this.xianshi_explain = xianshi_explain;
	}
	
	/**
	* 活动名称
	*@return 
	*/
	public String getXianshi_name(){
		return  xianshi_name;
	}
	/**
	* 活动名称
	*@param  xianshi_name
	*/
	public void setXianshi_name(String xianshi_name ){
		this.xianshi_name = xianshi_name;
	}
	
	/**
	* 限时折扣价格
	*@return 
	*/
	public BigDecimal getXianshi_price(){
		return  xianshi_price;
	}
	/**
	* 限时折扣价格
	*@param  xianshi_price
	*/
	public void setXianshi_price(BigDecimal xianshi_price ){
		this.xianshi_price = xianshi_price;
	}
	
	/**
	* 活动标题
	*@return 
	*/
	public String getXianshi_title(){
		return  xianshi_title;
	}
	/**
	* 活动标题
	*@param  xianshi_title
	*/
	public void setXianshi_title(String xianshi_title ){
		this.xianshi_title = xianshi_title;
	}
	

}
