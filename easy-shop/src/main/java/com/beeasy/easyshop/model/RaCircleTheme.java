package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_circle_theme")
public class RaCircleTheme   {
	
	/*
	主题id
	*/
	private Integer themeId ;
	/*
	圈子id
	*/
	private Integer circleId ;
	/*
	附件标记 1是 0 否
	*/
	private Integer hasAffix ;
	/*
	商品标记 1是 0否
	*/
	private Integer hasGoods ;
	/*
	屏蔽 1是 0否
	*/
	private Integer isClosed ;
	/*
	是否加精 1是 0否
	*/
	private Integer isDigest ;
	/*
	1圈主 2管理 3成员
	*/
	private Integer isIdentity ;
	/*
	是否推荐 1是 0否
	*/
	private Integer isRecommend ;
	/*
	主题是否关闭 1是 0否
	*/
	private Integer isShut ;
	/*
	是否置顶 1是  0否
	*/
	private Integer isStick ;
	/*
	最后发言人id
	*/
	private Integer lastspeakId ;
	/*
	会员id
	*/
	private Integer memberId ;
	/*
	主题分类id
	*/
	private Integer thclassId ;
	/*
	浏览数量
	*/
	private Integer themeBrowsecount ;
	/*
	评论数量
	*/
	private Integer themeCommentcount ;
	/*
	获得经验
	*/
	private Integer themeExp ;
	/*
	喜欢数量
	*/
	private Integer themeLikecount ;
	/*
	阅读权限
	*/
	private Integer themeReadperm ;
	/*
	分享数量
	*/
	private Integer themeSharecount ;
	/*
	特殊话题 0普通 1投票
	*/
	private Integer themeSpecial ;
	/*
	圈子名称
	*/
	private String circleName ;
	/*
	最后发言人名称
	*/
	private String lastspeakName ;
	/*
	最后发言时间
	*/
	private String lastspeakTime ;
	/*
	会员名称
	*/
	private String memberName ;
	/*
	主题分类名称
	*/
	private String thclassName ;
	/*
	主题发表时间
	*/
	private String themeAddtime ;
	/*
	主题内容
	*/
	private String themeContent ;
	/*
	编辑人名称
	*/
	private String themeEditname ;
	/*
	主题编辑时间
	*/
	private String themeEdittime ;
	/*
	主题名称
	*/
	private String themeName ;
	
	public RaCircleTheme() {
	}
	
	/**
	* 主题id
	*@return 
	*/
	public Integer getThemeId(){
		return  themeId;
	}
	/**
	* 主题id
	*@param  themeId
	*/
	public void setThemeId(Integer themeId ){
		this.themeId = themeId;
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
	* 附件标记 1是 0 否
	*@return 
	*/
	public Integer getHasAffix(){
		return  hasAffix;
	}
	/**
	* 附件标记 1是 0 否
	*@param  hasAffix
	*/
	public void setHasAffix(Integer hasAffix ){
		this.hasAffix = hasAffix;
	}
	
	/**
	* 商品标记 1是 0否
	*@return 
	*/
	public Integer getHasGoods(){
		return  hasGoods;
	}
	/**
	* 商品标记 1是 0否
	*@param  hasGoods
	*/
	public void setHasGoods(Integer hasGoods ){
		this.hasGoods = hasGoods;
	}
	
	/**
	* 屏蔽 1是 0否
	*@return 
	*/
	public Integer getIsClosed(){
		return  isClosed;
	}
	/**
	* 屏蔽 1是 0否
	*@param  isClosed
	*/
	public void setIsClosed(Integer isClosed ){
		this.isClosed = isClosed;
	}
	
	/**
	* 是否加精 1是 0否
	*@return 
	*/
	public Integer getIsDigest(){
		return  isDigest;
	}
	/**
	* 是否加精 1是 0否
	*@param  isDigest
	*/
	public void setIsDigest(Integer isDigest ){
		this.isDigest = isDigest;
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
	* 主题是否关闭 1是 0否
	*@return 
	*/
	public Integer getIsShut(){
		return  isShut;
	}
	/**
	* 主题是否关闭 1是 0否
	*@param  isShut
	*/
	public void setIsShut(Integer isShut ){
		this.isShut = isShut;
	}
	
	/**
	* 是否置顶 1是  0否
	*@return 
	*/
	public Integer getIsStick(){
		return  isStick;
	}
	/**
	* 是否置顶 1是  0否
	*@param  isStick
	*/
	public void setIsStick(Integer isStick ){
		this.isStick = isStick;
	}
	
	/**
	* 最后发言人id
	*@return 
	*/
	public Integer getLastspeakId(){
		return  lastspeakId;
	}
	/**
	* 最后发言人id
	*@param  lastspeakId
	*/
	public void setLastspeakId(Integer lastspeakId ){
		this.lastspeakId = lastspeakId;
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
	* 主题分类id
	*@return 
	*/
	public Integer getThclassId(){
		return  thclassId;
	}
	/**
	* 主题分类id
	*@param  thclassId
	*/
	public void setThclassId(Integer thclassId ){
		this.thclassId = thclassId;
	}
	
	/**
	* 浏览数量
	*@return 
	*/
	public Integer getThemeBrowsecount(){
		return  themeBrowsecount;
	}
	/**
	* 浏览数量
	*@param  themeBrowsecount
	*/
	public void setThemeBrowsecount(Integer themeBrowsecount ){
		this.themeBrowsecount = themeBrowsecount;
	}
	
	/**
	* 评论数量
	*@return 
	*/
	public Integer getThemeCommentcount(){
		return  themeCommentcount;
	}
	/**
	* 评论数量
	*@param  themeCommentcount
	*/
	public void setThemeCommentcount(Integer themeCommentcount ){
		this.themeCommentcount = themeCommentcount;
	}
	
	/**
	* 获得经验
	*@return 
	*/
	public Integer getThemeExp(){
		return  themeExp;
	}
	/**
	* 获得经验
	*@param  themeExp
	*/
	public void setThemeExp(Integer themeExp ){
		this.themeExp = themeExp;
	}
	
	/**
	* 喜欢数量
	*@return 
	*/
	public Integer getThemeLikecount(){
		return  themeLikecount;
	}
	/**
	* 喜欢数量
	*@param  themeLikecount
	*/
	public void setThemeLikecount(Integer themeLikecount ){
		this.themeLikecount = themeLikecount;
	}
	
	/**
	* 阅读权限
	*@return 
	*/
	public Integer getThemeReadperm(){
		return  themeReadperm;
	}
	/**
	* 阅读权限
	*@param  themeReadperm
	*/
	public void setThemeReadperm(Integer themeReadperm ){
		this.themeReadperm = themeReadperm;
	}
	
	/**
	* 分享数量
	*@return 
	*/
	public Integer getThemeSharecount(){
		return  themeSharecount;
	}
	/**
	* 分享数量
	*@param  themeSharecount
	*/
	public void setThemeSharecount(Integer themeSharecount ){
		this.themeSharecount = themeSharecount;
	}
	
	/**
	* 特殊话题 0普通 1投票
	*@return 
	*/
	public Integer getThemeSpecial(){
		return  themeSpecial;
	}
	/**
	* 特殊话题 0普通 1投票
	*@param  themeSpecial
	*/
	public void setThemeSpecial(Integer themeSpecial ){
		this.themeSpecial = themeSpecial;
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
	* 最后发言人名称
	*@return 
	*/
	public String getLastspeakName(){
		return  lastspeakName;
	}
	/**
	* 最后发言人名称
	*@param  lastspeakName
	*/
	public void setLastspeakName(String lastspeakName ){
		this.lastspeakName = lastspeakName;
	}
	
	/**
	* 最后发言时间
	*@return 
	*/
	public String getLastspeakTime(){
		return  lastspeakTime;
	}
	/**
	* 最后发言时间
	*@param  lastspeakTime
	*/
	public void setLastspeakTime(String lastspeakTime ){
		this.lastspeakTime = lastspeakTime;
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
	
	/**
	* 主题分类名称
	*@return 
	*/
	public String getThclassName(){
		return  thclassName;
	}
	/**
	* 主题分类名称
	*@param  thclassName
	*/
	public void setThclassName(String thclassName ){
		this.thclassName = thclassName;
	}
	
	/**
	* 主题发表时间
	*@return 
	*/
	public String getThemeAddtime(){
		return  themeAddtime;
	}
	/**
	* 主题发表时间
	*@param  themeAddtime
	*/
	public void setThemeAddtime(String themeAddtime ){
		this.themeAddtime = themeAddtime;
	}
	
	/**
	* 主题内容
	*@return 
	*/
	public String getThemeContent(){
		return  themeContent;
	}
	/**
	* 主题内容
	*@param  themeContent
	*/
	public void setThemeContent(String themeContent ){
		this.themeContent = themeContent;
	}
	
	/**
	* 编辑人名称
	*@return 
	*/
	public String getThemeEditname(){
		return  themeEditname;
	}
	/**
	* 编辑人名称
	*@param  themeEditname
	*/
	public void setThemeEditname(String themeEditname ){
		this.themeEditname = themeEditname;
	}
	
	/**
	* 主题编辑时间
	*@return 
	*/
	public String getThemeEdittime(){
		return  themeEdittime;
	}
	/**
	* 主题编辑时间
	*@param  themeEdittime
	*/
	public void setThemeEdittime(String themeEdittime ){
		this.themeEdittime = themeEdittime;
	}
	
	/**
	* 主题名称
	*@return 
	*/
	public String getThemeName(){
		return  themeName;
	}
	/**
	* 主题名称
	*@param  themeName
	*/
	public void setThemeName(String themeName ){
		this.themeName = themeName;
	}
	

}
