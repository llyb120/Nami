package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_circle_member")
public class RaCircleMember   {
	
	/*
	圈子id
	*/
	private Integer circleId ;
	/*
	会员id
	*/
	private Integer memberId ;
	/*
	回复数
	*/
	private Integer cmComcount ;
	/*
	会员经验
	*/
	private Integer cmExp ;
	/*
	成员级别
	*/
	private Integer cmLevel ;
	/*
	下一级所需经验
	*/
	private Integer cmNextexp ;
	/*
	状态 0申请中 1通过 2未通过
	*/
	private Integer cmState ;
	/*
	主题数
	*/
	private Integer cmThcount ;
	/*
	是否允许发言 1允许 0禁止
	*/
	private Integer isAllowspeak ;
	/*
	1圈主 2管理 3成员
	*/
	private Integer isIdentity ;
	/*
	是否推荐 1是 0否
	*/
	private Integer isRecommend ;
	/*
	明星成员 1是 0否
	*/
	private Integer isStar ;
	/*
	圈子名称
	*/
	private String circleName ;
	/*
	申请内容
	*/
	private String cmApplycontent ;
	/*
	申请时间
	*/
	private String cmApplytime ;
	/*
	自我介绍
	*/
	private String cmIntro ;
	/*
	加入时间
	*/
	private String cmJointime ;
	/*
	最后发言时间
	*/
	private String cmLastspeaktime ;
	/*
	成员头衔
	*/
	private String cmLevelname ;
	/*
	会员名称
	*/
	private String memberName ;
	
	public RaCircleMember() {
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
	* 会员id
	*@return 
	*/
	public Integer getMemberId(){
		return  memberId;
	}
	/**
	* 会员id
	*@param  memberId
	*/
	public void setMemberId(Integer memberId ){
		this.memberId = memberId;
	}
	
	/**
	* 回复数
	*@return 
	*/
	public Integer getCmComcount(){
		return  cmComcount;
	}
	/**
	* 回复数
	*@param  cmComcount
	*/
	public void setCmComcount(Integer cmComcount ){
		this.cmComcount = cmComcount;
	}
	
	/**
	* 会员经验
	*@return 
	*/
	public Integer getCmExp(){
		return  cmExp;
	}
	/**
	* 会员经验
	*@param  cmExp
	*/
	public void setCmExp(Integer cmExp ){
		this.cmExp = cmExp;
	}
	
	/**
	* 成员级别
	*@return 
	*/
	public Integer getCmLevel(){
		return  cmLevel;
	}
	/**
	* 成员级别
	*@param  cmLevel
	*/
	public void setCmLevel(Integer cmLevel ){
		this.cmLevel = cmLevel;
	}
	
	/**
	* 下一级所需经验
	*@return 
	*/
	public Integer getCmNextexp(){
		return  cmNextexp;
	}
	/**
	* 下一级所需经验
	*@param  cmNextexp
	*/
	public void setCmNextexp(Integer cmNextexp ){
		this.cmNextexp = cmNextexp;
	}
	
	/**
	* 状态 0申请中 1通过 2未通过
	*@return 
	*/
	public Integer getCmState(){
		return  cmState;
	}
	/**
	* 状态 0申请中 1通过 2未通过
	*@param  cmState
	*/
	public void setCmState(Integer cmState ){
		this.cmState = cmState;
	}
	
	/**
	* 主题数
	*@return 
	*/
	public Integer getCmThcount(){
		return  cmThcount;
	}
	/**
	* 主题数
	*@param  cmThcount
	*/
	public void setCmThcount(Integer cmThcount ){
		this.cmThcount = cmThcount;
	}
	
	/**
	* 是否允许发言 1允许 0禁止
	*@return 
	*/
	public Integer getIsAllowspeak(){
		return  isAllowspeak;
	}
	/**
	* 是否允许发言 1允许 0禁止
	*@param  isAllowspeak
	*/
	public void setIsAllowspeak(Integer isAllowspeak ){
		this.isAllowspeak = isAllowspeak;
	}
	
	/**
	* 1圈主 2管理 3成员
	*@return 
	*/
	public Integer getIsIdentity(){
		return  isIdentity;
	}
	/**
	* 1圈主 2管理 3成员
	*@param  isIdentity
	*/
	public void setIsIdentity(Integer isIdentity ){
		this.isIdentity = isIdentity;
	}
	
	/**
	* 是否推荐 1是 0否
	*@return 
	*/
	public Integer getIsRecommend(){
		return  isRecommend;
	}
	/**
	* 是否推荐 1是 0否
	*@param  isRecommend
	*/
	public void setIsRecommend(Integer isRecommend ){
		this.isRecommend = isRecommend;
	}
	
	/**
	* 明星成员 1是 0否
	*@return 
	*/
	public Integer getIsStar(){
		return  isStar;
	}
	/**
	* 明星成员 1是 0否
	*@param  isStar
	*/
	public void setIsStar(Integer isStar ){
		this.isStar = isStar;
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
	* 申请内容
	*@return 
	*/
	public String getCmApplycontent(){
		return  cmApplycontent;
	}
	/**
	* 申请内容
	*@param  cmApplycontent
	*/
	public void setCmApplycontent(String cmApplycontent ){
		this.cmApplycontent = cmApplycontent;
	}
	
	/**
	* 申请时间
	*@return 
	*/
	public String getCmApplytime(){
		return  cmApplytime;
	}
	/**
	* 申请时间
	*@param  cmApplytime
	*/
	public void setCmApplytime(String cmApplytime ){
		this.cmApplytime = cmApplytime;
	}
	
	/**
	* 自我介绍
	*@return 
	*/
	public String getCmIntro(){
		return  cmIntro;
	}
	/**
	* 自我介绍
	*@param  cmIntro
	*/
	public void setCmIntro(String cmIntro ){
		this.cmIntro = cmIntro;
	}
	
	/**
	* 加入时间
	*@return 
	*/
	public String getCmJointime(){
		return  cmJointime;
	}
	/**
	* 加入时间
	*@param  cmJointime
	*/
	public void setCmJointime(String cmJointime ){
		this.cmJointime = cmJointime;
	}
	
	/**
	* 最后发言时间
	*@return 
	*/
	public String getCmLastspeaktime(){
		return  cmLastspeaktime;
	}
	/**
	* 最后发言时间
	*@param  cmLastspeaktime
	*/
	public void setCmLastspeaktime(String cmLastspeaktime ){
		this.cmLastspeaktime = cmLastspeaktime;
	}
	
	/**
	* 成员头衔
	*@return 
	*/
	public String getCmLevelname(){
		return  cmLevelname;
	}
	/**
	* 成员头衔
	*@param  cmLevelname
	*/
	public void setCmLevelname(String cmLevelname ){
		this.cmLevelname = cmLevelname;
	}
	
	/**
	* 会员名称
	*@return 
	*/
	public String getMemberName(){
		return  memberName;
	}
	/**
	* 会员名称
	*@param  memberName
	*/
	public void setMemberName(String memberName ){
		this.memberName = memberName;
	}
	

}
