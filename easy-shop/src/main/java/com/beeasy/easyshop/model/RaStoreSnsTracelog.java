package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_store_sns_tracelog")
public class RaStoreSnsTracelog   {
	
	// alias
	public static final String ALIAS_strace_id = "strace_id";
	public static final String ALIAS_strace_comment = "strace_comment";
	public static final String ALIAS_strace_cool = "strace_cool";
	public static final String ALIAS_strace_spread = "strace_spread";
	public static final String ALIAS_strace_state = "strace_state";
	public static final String ALIAS_strace_storeid = "strace_storeid";
	public static final String ALIAS_strace_type = "strace_type";
	public static final String ALIAS_strace_content = "strace_content";
	public static final String ALIAS_strace_goodsdata = "strace_goodsdata";
	public static final String ALIAS_strace_storelogo = "strace_storelogo";
	public static final String ALIAS_strace_storename = "strace_storename";
	public static final String ALIAS_strace_time = "strace_time";
	public static final String ALIAS_strace_title = "strace_title";
	
	/*
	店铺动态id
	*/
	private Integer strace_id ;
	/*
	评论数量
	*/
	private Integer strace_comment ;
	/*
	赞数量
	*/
	private Integer strace_cool ;
	/*
	转播数量
	*/
	private Integer strace_spread ;
	/*
	动态状态 1正常，0屏蔽
	*/
	private Integer strace_state ;
	/*
	店铺id
	*/
	private Integer strace_storeid ;
	/*
	1=relay,2=normal,3=new,4=coupon,5=xianshi,6=mansong,7=bundling,8=groupbuy,9=recommend,10=hotsell
	*/
	private Integer strace_type ;
	/*
	发表内容
	*/
	private String strace_content ;
	/*
	商品信息
	*/
	private String strace_goodsdata ;
	/*
	店标
	*/
	private String strace_storelogo ;
	/*
	店铺名称
	*/
	private String strace_storename ;
	/*
	发表时间
	*/
	private String strace_time ;
	/*
	动态标题
	*/
	private String strace_title ;
	
	public RaStoreSnsTracelog() {
	}
	
	/**
	* 店铺动态id
	*@return 
	*/
	public Integer getStrace_id(){
		return  strace_id;
	}
	/**
	* 店铺动态id
	*@param  strace_id
	*/
	public void setStrace_id(Integer strace_id ){
		this.strace_id = strace_id;
	}
	
	/**
	* 评论数量
	*@return 
	*/
	public Integer getStrace_comment(){
		return  strace_comment;
	}
	/**
	* 评论数量
	*@param  strace_comment
	*/
	public void setStrace_comment(Integer strace_comment ){
		this.strace_comment = strace_comment;
	}
	
	/**
	* 赞数量
	*@return 
	*/
	public Integer getStrace_cool(){
		return  strace_cool;
	}
	/**
	* 赞数量
	*@param  strace_cool
	*/
	public void setStrace_cool(Integer strace_cool ){
		this.strace_cool = strace_cool;
	}
	
	/**
	* 转播数量
	*@return 
	*/
	public Integer getStrace_spread(){
		return  strace_spread;
	}
	/**
	* 转播数量
	*@param  strace_spread
	*/
	public void setStrace_spread(Integer strace_spread ){
		this.strace_spread = strace_spread;
	}
	
	/**
	* 动态状态 1正常，0屏蔽
	*@return 
	*/
	public Integer getStrace_state(){
		return  strace_state;
	}
	/**
	* 动态状态 1正常，0屏蔽
	*@param  strace_state
	*/
	public void setStrace_state(Integer strace_state ){
		this.strace_state = strace_state;
	}
	
	/**
	* 店铺id
	*@return 
	*/
	public Integer getStrace_storeid(){
		return  strace_storeid;
	}
	/**
	* 店铺id
	*@param  strace_storeid
	*/
	public void setStrace_storeid(Integer strace_storeid ){
		this.strace_storeid = strace_storeid;
	}
	
	/**
	* 1=relay,2=normal,3=new,4=coupon,5=xianshi,6=mansong,7=bundling,8=groupbuy,9=recommend,10=hotsell
	*@return 
	*/
	public Integer getStrace_type(){
		return  strace_type;
	}
	/**
	* 1=relay,2=normal,3=new,4=coupon,5=xianshi,6=mansong,7=bundling,8=groupbuy,9=recommend,10=hotsell
	*@param  strace_type
	*/
	public void setStrace_type(Integer strace_type ){
		this.strace_type = strace_type;
	}
	
	/**
	* 发表内容
	*@return 
	*/
	public String getStrace_content(){
		return  strace_content;
	}
	/**
	* 发表内容
	*@param  strace_content
	*/
	public void setStrace_content(String strace_content ){
		this.strace_content = strace_content;
	}
	
	/**
	* 商品信息
	*@return 
	*/
	public String getStrace_goodsdata(){
		return  strace_goodsdata;
	}
	/**
	* 商品信息
	*@param  strace_goodsdata
	*/
	public void setStrace_goodsdata(String strace_goodsdata ){
		this.strace_goodsdata = strace_goodsdata;
	}
	
	/**
	* 店标
	*@return 
	*/
	public String getStrace_storelogo(){
		return  strace_storelogo;
	}
	/**
	* 店标
	*@param  strace_storelogo
	*/
	public void setStrace_storelogo(String strace_storelogo ){
		this.strace_storelogo = strace_storelogo;
	}
	
	/**
	* 店铺名称
	*@return 
	*/
	public String getStrace_storename(){
		return  strace_storename;
	}
	/**
	* 店铺名称
	*@param  strace_storename
	*/
	public void setStrace_storename(String strace_storename ){
		this.strace_storename = strace_storename;
	}
	
	/**
	* 发表时间
	*@return 
	*/
	public String getStrace_time(){
		return  strace_time;
	}
	/**
	* 发表时间
	*@param  strace_time
	*/
	public void setStrace_time(String strace_time ){
		this.strace_time = strace_time;
	}
	
	/**
	* 动态标题
	*@return 
	*/
	public String getStrace_title(){
		return  strace_title;
	}
	/**
	* 动态标题
	*@param  strace_title
	*/
	public void setStrace_title(String strace_title ){
		this.strace_title = strace_title;
	}
	

}
