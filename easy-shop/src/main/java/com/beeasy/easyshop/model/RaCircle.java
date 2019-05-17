package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_circle")
public class RaCircle   {
	
	/*
	圈子id
	*/
	private Integer circleId ;
	/*
	圈子商品数
	*/
	private Integer circleGcount ;
	/*
	加入圈子时候需要审核，0不需要，1需要
	*/
	private Integer circleJoinaudit ;
	/*
	圈主id
	*/
	private Integer circleMasterid ;
	/*
	圈子成员数
	*/
	private Integer circleMcount ;
	/*
	圈子状态，0关闭，1开启，2审核中，3审核失败
	*/
	private Integer circleStatus ;
	/*
	圈子主题数
	*/
	private Integer circleThcount ;
	/*
	圈子分类
	*/
	private Integer classId ;
	/*
	是否为热门圈子 1是 0否
	*/
	private Integer isHot ;
	/*
	是否推荐 0未推荐，1已推荐
	*/
	private Integer isRecommend ;
	/*
	成员级别
	*/
	private Integer mapplyMl ;
	/*
	申请管理是否开启 0关闭，1开启
	*/
	private Integer mapplyOpen ;
	/*
	等待处理举报数
	*/
	private Integer newInformcount ;
	/*
	管理申请数量
	*/
	private Integer newMapplycount ;
	/*
	等待审核成员数
	*/
	private Integer newVerifycount ;
	/*
	圈子创建时间
	*/
	private String circleAddtime ;
	/*
	圈子描述
	*/
	private String circleDesc ;
	/*
	圈子图片
	*/
	private String circleImg ;
	/*
	圈主名称
	*/
	private String circleMastername ;
	/*
	圈子名称
	*/
	private String circleName ;
	/*
	圈子公告
	*/
	private String circleNotice ;
	/*
	圈子公告更新时间
	*/
	private String circleNoticetime ;
	/*
	圈子申请理由
	*/
	private String circlePursuereason ;
	/*
	关闭或审核失败原因
	*/
	private String circleStatusinfo ;
	/*
	圈子标签
	*/
	private String circleTag ;
	
	public RaCircle() {
	}
	
	/**
	* 圈子id
	*@return 
	*/
	public Integer getCircleId(){
		return  circleId;
	}
	/**
	* 圈子id
	*@param  circleId
	*/
	public void setCircleId(Integer circleId ){
		this.circleId = circleId;
	}
	
	/**
	* 圈子商品数
	*@return 
	*/
	public Integer getCircleGcount(){
		return  circleGcount;
	}
	/**
	* 圈子商品数
	*@param  circleGcount
	*/
	public void setCircleGcount(Integer circleGcount ){
		this.circleGcount = circleGcount;
	}
	
	/**
	* 加入圈子时候需要审核，0不需要，1需要
	*@return 
	*/
	public Integer getCircleJoinaudit(){
		return  circleJoinaudit;
	}
	/**
	* 加入圈子时候需要审核，0不需要，1需要
	*@param  circleJoinaudit
	*/
	public void setCircleJoinaudit(Integer circleJoinaudit ){
		this.circleJoinaudit = circleJoinaudit;
	}
	
	/**
	* 圈主id
	*@return 
	*/
	public Integer getCircleMasterid(){
		return  circleMasterid;
	}
	/**
	* 圈主id
	*@param  circleMasterid
	*/
	public void setCircleMasterid(Integer circleMasterid ){
		this.circleMasterid = circleMasterid;
	}
	
	/**
	* 圈子成员数
	*@return 
	*/
	public Integer getCircleMcount(){
		return  circleMcount;
	}
	/**
	* 圈子成员数
	*@param  circleMcount
	*/
	public void setCircleMcount(Integer circleMcount ){
		this.circleMcount = circleMcount;
	}
	
	/**
	* 圈子状态，0关闭，1开启，2审核中，3审核失败
	*@return 
	*/
	public Integer getCircleStatus(){
		return  circleStatus;
	}
	/**
	* 圈子状态，0关闭，1开启，2审核中，3审核失败
	*@param  circleStatus
	*/
	public void setCircleStatus(Integer circleStatus ){
		this.circleStatus = circleStatus;
	}
	
	/**
	* 圈子主题数
	*@return 
	*/
	public Integer getCircleThcount(){
		return  circleThcount;
	}
	/**
	* 圈子主题数
	*@param  circleThcount
	*/
	public void setCircleThcount(Integer circleThcount ){
		this.circleThcount = circleThcount;
	}
	
	/**
	* 圈子分类
	*@return 
	*/
	public Integer getClassId(){
		return  classId;
	}
	/**
	* 圈子分类
	*@param  classId
	*/
	public void setClassId(Integer classId ){
		this.classId = classId;
	}
	
	/**
	* 是否为热门圈子 1是 0否
	*@return 
	*/
	public Integer getIsHot(){
		return  isHot;
	}
	/**
	* 是否为热门圈子 1是 0否
	*@param  isHot
	*/
	public void setIsHot(Integer isHot ){
		this.isHot = isHot;
	}
	
	/**
	* 是否推荐 0未推荐，1已推荐
	*@return 
	*/
	public Integer getIsRecommend(){
		return  isRecommend;
	}
	/**
	* 是否推荐 0未推荐，1已推荐
	*@param  isRecommend
	*/
	public void setIsRecommend(Integer isRecommend ){
		this.isRecommend = isRecommend;
	}
	
	/**
	* 成员级别
	*@return 
	*/
	public Integer getMapplyMl(){
		return  mapplyMl;
	}
	/**
	* 成员级别
	*@param  mapplyMl
	*/
	public void setMapplyMl(Integer mapplyMl ){
		this.mapplyMl = mapplyMl;
	}
	
	/**
	* 申请管理是否开启 0关闭，1开启
	*@return 
	*/
	public Integer getMapplyOpen(){
		return  mapplyOpen;
	}
	/**
	* 申请管理是否开启 0关闭，1开启
	*@param  mapplyOpen
	*/
	public void setMapplyOpen(Integer mapplyOpen ){
		this.mapplyOpen = mapplyOpen;
	}
	
	/**
	* 等待处理举报数
	*@return 
	*/
	public Integer getNewInformcount(){
		return  newInformcount;
	}
	/**
	* 等待处理举报数
	*@param  newInformcount
	*/
	public void setNewInformcount(Integer newInformcount ){
		this.newInformcount = newInformcount;
	}
	
	/**
	* 管理申请数量
	*@return 
	*/
	public Integer getNewMapplycount(){
		return  newMapplycount;
	}
	/**
	* 管理申请数量
	*@param  newMapplycount
	*/
	public void setNewMapplycount(Integer newMapplycount ){
		this.newMapplycount = newMapplycount;
	}
	
	/**
	* 等待审核成员数
	*@return 
	*/
	public Integer getNewVerifycount(){
		return  newVerifycount;
	}
	/**
	* 等待审核成员数
	*@param  newVerifycount
	*/
	public void setNewVerifycount(Integer newVerifycount ){
		this.newVerifycount = newVerifycount;
	}
	
	/**
	* 圈子创建时间
	*@return 
	*/
	public String getCircleAddtime(){
		return  circleAddtime;
	}
	/**
	* 圈子创建时间
	*@param  circleAddtime
	*/
	public void setCircleAddtime(String circleAddtime ){
		this.circleAddtime = circleAddtime;
	}
	
	/**
	* 圈子描述
	*@return 
	*/
	public String getCircleDesc(){
		return  circleDesc;
	}
	/**
	* 圈子描述
	*@param  circleDesc
	*/
	public void setCircleDesc(String circleDesc ){
		this.circleDesc = circleDesc;
	}
	
	/**
	* 圈子图片
	*@return 
	*/
	public String getCircleImg(){
		return  circleImg;
	}
	/**
	* 圈子图片
	*@param  circleImg
	*/
	public void setCircleImg(String circleImg ){
		this.circleImg = circleImg;
	}
	
	/**
	* 圈主名称
	*@return 
	*/
	public String getCircleMastername(){
		return  circleMastername;
	}
	/**
	* 圈主名称
	*@param  circleMastername
	*/
	public void setCircleMastername(String circleMastername ){
		this.circleMastername = circleMastername;
	}
	
	/**
	* 圈子名称
	*@return 
	*/
	public String getCircleName(){
		return  circleName;
	}
	/**
	* 圈子名称
	*@param  circleName
	*/
	public void setCircleName(String circleName ){
		this.circleName = circleName;
	}
	
	/**
	* 圈子公告
	*@return 
	*/
	public String getCircleNotice(){
		return  circleNotice;
	}
	/**
	* 圈子公告
	*@param  circleNotice
	*/
	public void setCircleNotice(String circleNotice ){
		this.circleNotice = circleNotice;
	}
	
	/**
	* 圈子公告更新时间
	*@return 
	*/
	public String getCircleNoticetime(){
		return  circleNoticetime;
	}
	/**
	* 圈子公告更新时间
	*@param  circleNoticetime
	*/
	public void setCircleNoticetime(String circleNoticetime ){
		this.circleNoticetime = circleNoticetime;
	}
	
	/**
	* 圈子申请理由
	*@return 
	*/
	public String getCirclePursuereason(){
		return  circlePursuereason;
	}
	/**
	* 圈子申请理由
	*@param  circlePursuereason
	*/
	public void setCirclePursuereason(String circlePursuereason ){
		this.circlePursuereason = circlePursuereason;
	}
	
	/**
	* 关闭或审核失败原因
	*@return 
	*/
	public String getCircleStatusinfo(){
		return  circleStatusinfo;
	}
	/**
	* 关闭或审核失败原因
	*@param  circleStatusinfo
	*/
	public void setCircleStatusinfo(String circleStatusinfo ){
		this.circleStatusinfo = circleStatusinfo;
	}
	
	/**
	* 圈子标签
	*@return 
	*/
	public String getCircleTag(){
		return  circleTag;
	}
	/**
	* 圈子标签
	*@param  circleTag
	*/
	public void setCircleTag(String circleTag ){
		this.circleTag = circleTag;
	}
	

}
