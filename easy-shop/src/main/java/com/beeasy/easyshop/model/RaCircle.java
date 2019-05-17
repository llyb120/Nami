package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_circle")
public class RaCircle   {
	
	// alias
	public static final String ALIAS_circle_id = "circle_id";
	public static final String ALIAS_circle_gcount = "circle_gcount";
	public static final String ALIAS_circle_joinaudit = "circle_joinaudit";
	public static final String ALIAS_circle_masterid = "circle_masterid";
	public static final String ALIAS_circle_mcount = "circle_mcount";
	public static final String ALIAS_circle_status = "circle_status";
	public static final String ALIAS_circle_thcount = "circle_thcount";
	public static final String ALIAS_class_id = "class_id";
	public static final String ALIAS_is_hot = "is_hot";
	public static final String ALIAS_is_recommend = "is_recommend";
	public static final String ALIAS_mapply_ml = "mapply_ml";
	public static final String ALIAS_mapply_open = "mapply_open";
	public static final String ALIAS_new_informcount = "new_informcount";
	public static final String ALIAS_new_mapplycount = "new_mapplycount";
	public static final String ALIAS_new_verifycount = "new_verifycount";
	public static final String ALIAS_circle_addtime = "circle_addtime";
	public static final String ALIAS_circle_desc = "circle_desc";
	public static final String ALIAS_circle_img = "circle_img";
	public static final String ALIAS_circle_mastername = "circle_mastername";
	public static final String ALIAS_circle_name = "circle_name";
	public static final String ALIAS_circle_notice = "circle_notice";
	public static final String ALIAS_circle_noticetime = "circle_noticetime";
	public static final String ALIAS_circle_pursuereason = "circle_pursuereason";
	public static final String ALIAS_circle_statusinfo = "circle_statusinfo";
	public static final String ALIAS_circle_tag = "circle_tag";
	
	/*
	圈子id
	*/
	private Integer circle_id ;
	/*
	圈子商品数
	*/
	private Integer circle_gcount ;
	/*
	加入圈子时候需要审核，0不需要，1需要
	*/
	private Integer circle_joinaudit ;
	/*
	圈主id
	*/
	private Integer circle_masterid ;
	/*
	圈子成员数
	*/
	private Integer circle_mcount ;
	/*
	圈子状态，0关闭，1开启，2审核中，3审核失败
	*/
	private Integer circle_status ;
	/*
	圈子主题数
	*/
	private Integer circle_thcount ;
	/*
	圈子分类
	*/
	private Integer class_id ;
	/*
	是否为热门圈子 1是 0否
	*/
	private Integer is_hot ;
	/*
	是否推荐 0未推荐，1已推荐
	*/
	private Integer is_recommend ;
	/*
	成员级别
	*/
	private Integer mapply_ml ;
	/*
	申请管理是否开启 0关闭，1开启
	*/
	private Integer mapply_open ;
	/*
	等待处理举报数
	*/
	private Integer new_informcount ;
	/*
	管理申请数量
	*/
	private Integer new_mapplycount ;
	/*
	等待审核成员数
	*/
	private Integer new_verifycount ;
	/*
	圈子创建时间
	*/
	private String circle_addtime ;
	/*
	圈子描述
	*/
	private String circle_desc ;
	/*
	圈子图片
	*/
	private String circle_img ;
	/*
	圈主名称
	*/
	private String circle_mastername ;
	/*
	圈子名称
	*/
	private String circle_name ;
	/*
	圈子公告
	*/
	private String circle_notice ;
	/*
	圈子公告更新时间
	*/
	private String circle_noticetime ;
	/*
	圈子申请理由
	*/
	private String circle_pursuereason ;
	/*
	关闭或审核失败原因
	*/
	private String circle_statusinfo ;
	/*
	圈子标签
	*/
	private String circle_tag ;
	
	public RaCircle() {
	}
	
	/**
	* 圈子id
	*@return 
	*/
	public Integer getCircle_id(){
		return  circle_id;
	}
	/**
	* 圈子id
	*@param  circle_id
	*/
	public void setCircle_id(Integer circle_id ){
		this.circle_id = circle_id;
	}
	
	/**
	* 圈子商品数
	*@return 
	*/
	public Integer getCircle_gcount(){
		return  circle_gcount;
	}
	/**
	* 圈子商品数
	*@param  circle_gcount
	*/
	public void setCircle_gcount(Integer circle_gcount ){
		this.circle_gcount = circle_gcount;
	}
	
	/**
	* 加入圈子时候需要审核，0不需要，1需要
	*@return 
	*/
	public Integer getCircle_joinaudit(){
		return  circle_joinaudit;
	}
	/**
	* 加入圈子时候需要审核，0不需要，1需要
	*@param  circle_joinaudit
	*/
	public void setCircle_joinaudit(Integer circle_joinaudit ){
		this.circle_joinaudit = circle_joinaudit;
	}
	
	/**
	* 圈主id
	*@return 
	*/
	public Integer getCircle_masterid(){
		return  circle_masterid;
	}
	/**
	* 圈主id
	*@param  circle_masterid
	*/
	public void setCircle_masterid(Integer circle_masterid ){
		this.circle_masterid = circle_masterid;
	}
	
	/**
	* 圈子成员数
	*@return 
	*/
	public Integer getCircle_mcount(){
		return  circle_mcount;
	}
	/**
	* 圈子成员数
	*@param  circle_mcount
	*/
	public void setCircle_mcount(Integer circle_mcount ){
		this.circle_mcount = circle_mcount;
	}
	
	/**
	* 圈子状态，0关闭，1开启，2审核中，3审核失败
	*@return 
	*/
	public Integer getCircle_status(){
		return  circle_status;
	}
	/**
	* 圈子状态，0关闭，1开启，2审核中，3审核失败
	*@param  circle_status
	*/
	public void setCircle_status(Integer circle_status ){
		this.circle_status = circle_status;
	}
	
	/**
	* 圈子主题数
	*@return 
	*/
	public Integer getCircle_thcount(){
		return  circle_thcount;
	}
	/**
	* 圈子主题数
	*@param  circle_thcount
	*/
	public void setCircle_thcount(Integer circle_thcount ){
		this.circle_thcount = circle_thcount;
	}
	
	/**
	* 圈子分类
	*@return 
	*/
	public Integer getClass_id(){
		return  class_id;
	}
	/**
	* 圈子分类
	*@param  class_id
	*/
	public void setClass_id(Integer class_id ){
		this.class_id = class_id;
	}
	
	/**
	* 是否为热门圈子 1是 0否
	*@return 
	*/
	public Integer getIs_hot(){
		return  is_hot;
	}
	/**
	* 是否为热门圈子 1是 0否
	*@param  is_hot
	*/
	public void setIs_hot(Integer is_hot ){
		this.is_hot = is_hot;
	}
	
	/**
	* 是否推荐 0未推荐，1已推荐
	*@return 
	*/
	public Integer getIs_recommend(){
		return  is_recommend;
	}
	/**
	* 是否推荐 0未推荐，1已推荐
	*@param  is_recommend
	*/
	public void setIs_recommend(Integer is_recommend ){
		this.is_recommend = is_recommend;
	}
	
	/**
	* 成员级别
	*@return 
	*/
	public Integer getMapply_ml(){
		return  mapply_ml;
	}
	/**
	* 成员级别
	*@param  mapply_ml
	*/
	public void setMapply_ml(Integer mapply_ml ){
		this.mapply_ml = mapply_ml;
	}
	
	/**
	* 申请管理是否开启 0关闭，1开启
	*@return 
	*/
	public Integer getMapply_open(){
		return  mapply_open;
	}
	/**
	* 申请管理是否开启 0关闭，1开启
	*@param  mapply_open
	*/
	public void setMapply_open(Integer mapply_open ){
		this.mapply_open = mapply_open;
	}
	
	/**
	* 等待处理举报数
	*@return 
	*/
	public Integer getNew_informcount(){
		return  new_informcount;
	}
	/**
	* 等待处理举报数
	*@param  new_informcount
	*/
	public void setNew_informcount(Integer new_informcount ){
		this.new_informcount = new_informcount;
	}
	
	/**
	* 管理申请数量
	*@return 
	*/
	public Integer getNew_mapplycount(){
		return  new_mapplycount;
	}
	/**
	* 管理申请数量
	*@param  new_mapplycount
	*/
	public void setNew_mapplycount(Integer new_mapplycount ){
		this.new_mapplycount = new_mapplycount;
	}
	
	/**
	* 等待审核成员数
	*@return 
	*/
	public Integer getNew_verifycount(){
		return  new_verifycount;
	}
	/**
	* 等待审核成员数
	*@param  new_verifycount
	*/
	public void setNew_verifycount(Integer new_verifycount ){
		this.new_verifycount = new_verifycount;
	}
	
	/**
	* 圈子创建时间
	*@return 
	*/
	public String getCircle_addtime(){
		return  circle_addtime;
	}
	/**
	* 圈子创建时间
	*@param  circle_addtime
	*/
	public void setCircle_addtime(String circle_addtime ){
		this.circle_addtime = circle_addtime;
	}
	
	/**
	* 圈子描述
	*@return 
	*/
	public String getCircle_desc(){
		return  circle_desc;
	}
	/**
	* 圈子描述
	*@param  circle_desc
	*/
	public void setCircle_desc(String circle_desc ){
		this.circle_desc = circle_desc;
	}
	
	/**
	* 圈子图片
	*@return 
	*/
	public String getCircle_img(){
		return  circle_img;
	}
	/**
	* 圈子图片
	*@param  circle_img
	*/
	public void setCircle_img(String circle_img ){
		this.circle_img = circle_img;
	}
	
	/**
	* 圈主名称
	*@return 
	*/
	public String getCircle_mastername(){
		return  circle_mastername;
	}
	/**
	* 圈主名称
	*@param  circle_mastername
	*/
	public void setCircle_mastername(String circle_mastername ){
		this.circle_mastername = circle_mastername;
	}
	
	/**
	* 圈子名称
	*@return 
	*/
	public String getCircle_name(){
		return  circle_name;
	}
	/**
	* 圈子名称
	*@param  circle_name
	*/
	public void setCircle_name(String circle_name ){
		this.circle_name = circle_name;
	}
	
	/**
	* 圈子公告
	*@return 
	*/
	public String getCircle_notice(){
		return  circle_notice;
	}
	/**
	* 圈子公告
	*@param  circle_notice
	*/
	public void setCircle_notice(String circle_notice ){
		this.circle_notice = circle_notice;
	}
	
	/**
	* 圈子公告更新时间
	*@return 
	*/
	public String getCircle_noticetime(){
		return  circle_noticetime;
	}
	/**
	* 圈子公告更新时间
	*@param  circle_noticetime
	*/
	public void setCircle_noticetime(String circle_noticetime ){
		this.circle_noticetime = circle_noticetime;
	}
	
	/**
	* 圈子申请理由
	*@return 
	*/
	public String getCircle_pursuereason(){
		return  circle_pursuereason;
	}
	/**
	* 圈子申请理由
	*@param  circle_pursuereason
	*/
	public void setCircle_pursuereason(String circle_pursuereason ){
		this.circle_pursuereason = circle_pursuereason;
	}
	
	/**
	* 关闭或审核失败原因
	*@return 
	*/
	public String getCircle_statusinfo(){
		return  circle_statusinfo;
	}
	/**
	* 关闭或审核失败原因
	*@param  circle_statusinfo
	*/
	public void setCircle_statusinfo(String circle_statusinfo ){
		this.circle_statusinfo = circle_statusinfo;
	}
	
	/**
	* 圈子标签
	*@return 
	*/
	public String getCircle_tag(){
		return  circle_tag;
	}
	/**
	* 圈子标签
	*@param  circle_tag
	*/
	public void setCircle_tag(String circle_tag ){
		this.circle_tag = circle_tag;
	}
	

}
