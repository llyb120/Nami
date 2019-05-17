package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_points_goods")
public class RaPointsGoods   {
	
	// alias
	public static final String ALIAS_pgoods_id = "pgoods_id";
	public static final String ALIAS_pgoods_add_time = "pgoods_add_time";
	public static final String ALIAS_pgoods_commend = "pgoods_commend";
	public static final String ALIAS_pgoods_endtime = "pgoods_endtime";
	public static final String ALIAS_pgoods_islimit = "pgoods_islimit";
	public static final String ALIAS_pgoods_islimittime = "pgoods_islimittime";
	public static final String ALIAS_pgoods_limitmgrade = "pgoods_limitmgrade";
	public static final String ALIAS_pgoods_limitnum = "pgoods_limitnum";
	public static final String ALIAS_pgoods_points = "pgoods_points";
	public static final String ALIAS_pgoods_salenum = "pgoods_salenum";
	public static final String ALIAS_pgoods_show = "pgoods_show";
	public static final String ALIAS_pgoods_sort = "pgoods_sort";
	public static final String ALIAS_pgoods_starttime = "pgoods_starttime";
	public static final String ALIAS_pgoods_state = "pgoods_state";
	public static final String ALIAS_pgoods_storage = "pgoods_storage";
	public static final String ALIAS_pgoods_view = "pgoods_view";
	public static final String ALIAS_pgoods_body = "pgoods_body";
	public static final String ALIAS_pgoods_close_reason = "pgoods_close_reason";
	public static final String ALIAS_pgoods_description = "pgoods_description";
	public static final String ALIAS_pgoods_image = "pgoods_image";
	public static final String ALIAS_pgoods_keywords = "pgoods_keywords";
	public static final String ALIAS_pgoods_name = "pgoods_name";
	public static final String ALIAS_pgoods_price = "pgoods_price";
	public static final String ALIAS_pgoods_serial = "pgoods_serial";
	public static final String ALIAS_pgoods_tag = "pgoods_tag";
	
	/*
	积分礼品索引id
	*/
	private Integer pgoods_id ;
	/*
	积分礼品添加时间
	*/
	private Integer pgoods_add_time ;
	/*
	积分礼品推荐
	*/
	private Integer pgoods_commend ;
	/*
	兑换结束时间
	*/
	private Integer pgoods_endtime ;
	/*
	是否限制每会员兑换数量
	*/
	private Integer pgoods_islimit ;
	/*
	是否限制兑换时间 0为不限制 1为限制
	*/
	private Integer pgoods_islimittime ;
	/*
	限制参与兑换的会员级别
	*/
	private Integer pgoods_limitmgrade ;
	/*
	每会员限制兑换数量
	*/
	private Integer pgoods_limitnum ;
	/*
	积分礼品兑换所需积分
	*/
	private Integer pgoods_points ;
	/*
	积分礼品售出数量
	*/
	private Integer pgoods_salenum ;
	/*
	积分礼品上架 0表示下架 1表示上架
	*/
	private Integer pgoods_show ;
	/*
	礼品排序
	*/
	private Integer pgoods_sort ;
	/*
	兑换开始时间
	*/
	private Integer pgoods_starttime ;
	/*
	积分礼品状态，0开启，1禁售
	*/
	private Integer pgoods_state ;
	/*
	积分礼品库存数
	*/
	private Integer pgoods_storage ;
	/*
	积分商品浏览次数
	*/
	private Integer pgoods_view ;
	/*
	积分礼品详细内容
	*/
	private String pgoods_body ;
	/*
	积分礼品禁售原因
	*/
	private String pgoods_close_reason ;
	/*
	积分礼品描述
	*/
	private String pgoods_description ;
	/*
	积分礼品默认封面图片
	*/
	private String pgoods_image ;
	/*
	积分礼品关键字
	*/
	private String pgoods_keywords ;
	/*
	积分礼品名称
	*/
	private String pgoods_name ;
	/*
	积分礼品原价
	*/
	private BigDecimal pgoods_price ;
	/*
	积分礼品货号
	*/
	private String pgoods_serial ;
	/*
	积分礼品标签
	*/
	private String pgoods_tag ;
	
	public RaPointsGoods() {
	}
	
	/**
	* 积分礼品索引id
	*@return 
	*/
	public Integer getPgoods_id(){
		return  pgoods_id;
	}
	/**
	* 积分礼品索引id
	*@param  pgoods_id
	*/
	public void setPgoods_id(Integer pgoods_id ){
		this.pgoods_id = pgoods_id;
	}
	
	/**
	* 积分礼品添加时间
	*@return 
	*/
	public Integer getPgoods_add_time(){
		return  pgoods_add_time;
	}
	/**
	* 积分礼品添加时间
	*@param  pgoods_add_time
	*/
	public void setPgoods_add_time(Integer pgoods_add_time ){
		this.pgoods_add_time = pgoods_add_time;
	}
	
	/**
	* 积分礼品推荐
	*@return 
	*/
	public Integer getPgoods_commend(){
		return  pgoods_commend;
	}
	/**
	* 积分礼品推荐
	*@param  pgoods_commend
	*/
	public void setPgoods_commend(Integer pgoods_commend ){
		this.pgoods_commend = pgoods_commend;
	}
	
	/**
	* 兑换结束时间
	*@return 
	*/
	public Integer getPgoods_endtime(){
		return  pgoods_endtime;
	}
	/**
	* 兑换结束时间
	*@param  pgoods_endtime
	*/
	public void setPgoods_endtime(Integer pgoods_endtime ){
		this.pgoods_endtime = pgoods_endtime;
	}
	
	/**
	* 是否限制每会员兑换数量
	*@return 
	*/
	public Integer getPgoods_islimit(){
		return  pgoods_islimit;
	}
	/**
	* 是否限制每会员兑换数量
	*@param  pgoods_islimit
	*/
	public void setPgoods_islimit(Integer pgoods_islimit ){
		this.pgoods_islimit = pgoods_islimit;
	}
	
	/**
	* 是否限制兑换时间 0为不限制 1为限制
	*@return 
	*/
	public Integer getPgoods_islimittime(){
		return  pgoods_islimittime;
	}
	/**
	* 是否限制兑换时间 0为不限制 1为限制
	*@param  pgoods_islimittime
	*/
	public void setPgoods_islimittime(Integer pgoods_islimittime ){
		this.pgoods_islimittime = pgoods_islimittime;
	}
	
	/**
	* 限制参与兑换的会员级别
	*@return 
	*/
	public Integer getPgoods_limitmgrade(){
		return  pgoods_limitmgrade;
	}
	/**
	* 限制参与兑换的会员级别
	*@param  pgoods_limitmgrade
	*/
	public void setPgoods_limitmgrade(Integer pgoods_limitmgrade ){
		this.pgoods_limitmgrade = pgoods_limitmgrade;
	}
	
	/**
	* 每会员限制兑换数量
	*@return 
	*/
	public Integer getPgoods_limitnum(){
		return  pgoods_limitnum;
	}
	/**
	* 每会员限制兑换数量
	*@param  pgoods_limitnum
	*/
	public void setPgoods_limitnum(Integer pgoods_limitnum ){
		this.pgoods_limitnum = pgoods_limitnum;
	}
	
	/**
	* 积分礼品兑换所需积分
	*@return 
	*/
	public Integer getPgoods_points(){
		return  pgoods_points;
	}
	/**
	* 积分礼品兑换所需积分
	*@param  pgoods_points
	*/
	public void setPgoods_points(Integer pgoods_points ){
		this.pgoods_points = pgoods_points;
	}
	
	/**
	* 积分礼品售出数量
	*@return 
	*/
	public Integer getPgoods_salenum(){
		return  pgoods_salenum;
	}
	/**
	* 积分礼品售出数量
	*@param  pgoods_salenum
	*/
	public void setPgoods_salenum(Integer pgoods_salenum ){
		this.pgoods_salenum = pgoods_salenum;
	}
	
	/**
	* 积分礼品上架 0表示下架 1表示上架
	*@return 
	*/
	public Integer getPgoods_show(){
		return  pgoods_show;
	}
	/**
	* 积分礼品上架 0表示下架 1表示上架
	*@param  pgoods_show
	*/
	public void setPgoods_show(Integer pgoods_show ){
		this.pgoods_show = pgoods_show;
	}
	
	/**
	* 礼品排序
	*@return 
	*/
	public Integer getPgoods_sort(){
		return  pgoods_sort;
	}
	/**
	* 礼品排序
	*@param  pgoods_sort
	*/
	public void setPgoods_sort(Integer pgoods_sort ){
		this.pgoods_sort = pgoods_sort;
	}
	
	/**
	* 兑换开始时间
	*@return 
	*/
	public Integer getPgoods_starttime(){
		return  pgoods_starttime;
	}
	/**
	* 兑换开始时间
	*@param  pgoods_starttime
	*/
	public void setPgoods_starttime(Integer pgoods_starttime ){
		this.pgoods_starttime = pgoods_starttime;
	}
	
	/**
	* 积分礼品状态，0开启，1禁售
	*@return 
	*/
	public Integer getPgoods_state(){
		return  pgoods_state;
	}
	/**
	* 积分礼品状态，0开启，1禁售
	*@param  pgoods_state
	*/
	public void setPgoods_state(Integer pgoods_state ){
		this.pgoods_state = pgoods_state;
	}
	
	/**
	* 积分礼品库存数
	*@return 
	*/
	public Integer getPgoods_storage(){
		return  pgoods_storage;
	}
	/**
	* 积分礼品库存数
	*@param  pgoods_storage
	*/
	public void setPgoods_storage(Integer pgoods_storage ){
		this.pgoods_storage = pgoods_storage;
	}
	
	/**
	* 积分商品浏览次数
	*@return 
	*/
	public Integer getPgoods_view(){
		return  pgoods_view;
	}
	/**
	* 积分商品浏览次数
	*@param  pgoods_view
	*/
	public void setPgoods_view(Integer pgoods_view ){
		this.pgoods_view = pgoods_view;
	}
	
	/**
	* 积分礼品详细内容
	*@return 
	*/
	public String getPgoods_body(){
		return  pgoods_body;
	}
	/**
	* 积分礼品详细内容
	*@param  pgoods_body
	*/
	public void setPgoods_body(String pgoods_body ){
		this.pgoods_body = pgoods_body;
	}
	
	/**
	* 积分礼品禁售原因
	*@return 
	*/
	public String getPgoods_close_reason(){
		return  pgoods_close_reason;
	}
	/**
	* 积分礼品禁售原因
	*@param  pgoods_close_reason
	*/
	public void setPgoods_close_reason(String pgoods_close_reason ){
		this.pgoods_close_reason = pgoods_close_reason;
	}
	
	/**
	* 积分礼品描述
	*@return 
	*/
	public String getPgoods_description(){
		return  pgoods_description;
	}
	/**
	* 积分礼品描述
	*@param  pgoods_description
	*/
	public void setPgoods_description(String pgoods_description ){
		this.pgoods_description = pgoods_description;
	}
	
	/**
	* 积分礼品默认封面图片
	*@return 
	*/
	public String getPgoods_image(){
		return  pgoods_image;
	}
	/**
	* 积分礼品默认封面图片
	*@param  pgoods_image
	*/
	public void setPgoods_image(String pgoods_image ){
		this.pgoods_image = pgoods_image;
	}
	
	/**
	* 积分礼品关键字
	*@return 
	*/
	public String getPgoods_keywords(){
		return  pgoods_keywords;
	}
	/**
	* 积分礼品关键字
	*@param  pgoods_keywords
	*/
	public void setPgoods_keywords(String pgoods_keywords ){
		this.pgoods_keywords = pgoods_keywords;
	}
	
	/**
	* 积分礼品名称
	*@return 
	*/
	public String getPgoods_name(){
		return  pgoods_name;
	}
	/**
	* 积分礼品名称
	*@param  pgoods_name
	*/
	public void setPgoods_name(String pgoods_name ){
		this.pgoods_name = pgoods_name;
	}
	
	/**
	* 积分礼品原价
	*@return 
	*/
	public BigDecimal getPgoods_price(){
		return  pgoods_price;
	}
	/**
	* 积分礼品原价
	*@param  pgoods_price
	*/
	public void setPgoods_price(BigDecimal pgoods_price ){
		this.pgoods_price = pgoods_price;
	}
	
	/**
	* 积分礼品货号
	*@return 
	*/
	public String getPgoods_serial(){
		return  pgoods_serial;
	}
	/**
	* 积分礼品货号
	*@param  pgoods_serial
	*/
	public void setPgoods_serial(String pgoods_serial ){
		this.pgoods_serial = pgoods_serial;
	}
	
	/**
	* 积分礼品标签
	*@return 
	*/
	public String getPgoods_tag(){
		return  pgoods_tag;
	}
	/**
	* 积分礼品标签
	*@param  pgoods_tag
	*/
	public void setPgoods_tag(String pgoods_tag ){
		this.pgoods_tag = pgoods_tag;
	}
	

}
