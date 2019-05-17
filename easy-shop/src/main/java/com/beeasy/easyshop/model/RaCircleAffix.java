package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_circle_affix")
public class RaCircleAffix   {
	
	/*
	附件id
	*/
	private Integer affixId ;
	/*
	文件大小，单位字节
	*/
	private Integer affixFilesize ;
	/*
	文件类型 0无 1主题 2评论
	*/
	private Integer affixType ;
	/*
	圈子id
	*/
	private Integer circleId ;
	/*
	会员id
	*/
	private Integer memberId ;
	/*
	评论id
	*/
	private Integer replyId ;
	/*
	主题id
	*/
	private Integer themeId ;
	/*
	上传时间
	*/
	private String affixAddtime ;
	/*
	文件名称
	*/
	private String affixFilename ;
	/*
	缩略图名称
	*/
	private String affixFilethumb ;
	
	public RaCircleAffix() {
	}
	
	/**
	* 附件id
	*@return 
	*/
	public Integer getAffixId(){
		return  affixId;
	}
	/**
	* 附件id
	*@param  affixId
	*/
	public void setAffixId(Integer affixId ){
		this.affixId = affixId;
	}
	
	/**
	* 文件大小，单位字节
	*@return 
	*/
	public Integer getAffixFilesize(){
		return  affixFilesize;
	}
	/**
	* 文件大小，单位字节
	*@param  affixFilesize
	*/
	public void setAffixFilesize(Integer affixFilesize ){
		this.affixFilesize = affixFilesize;
	}
	
	/**
	* 文件类型 0无 1主题 2评论
	*@return 
	*/
	public Integer getAffixType(){
		return  affixType;
	}
	/**
	* 文件类型 0无 1主题 2评论
	*@param  affixType
	*/
	public void setAffixType(Integer affixType ){
		this.affixType = affixType;
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
	* 评论id
	*@return 
	*/
	public Integer getReplyId(){
		return  replyId;
	}
	/**
	* 评论id
	*@param  replyId
	*/
	public void setReplyId(Integer replyId ){
		this.replyId = replyId;
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
	* 上传时间
	*@return 
	*/
	public String getAffixAddtime(){
		return  affixAddtime;
	}
	/**
	* 上传时间
	*@param  affixAddtime
	*/
	public void setAffixAddtime(String affixAddtime ){
		this.affixAddtime = affixAddtime;
	}
	
	/**
	* 文件名称
	*@return 
	*/
	public String getAffixFilename(){
		return  affixFilename;
	}
	/**
	* 文件名称
	*@param  affixFilename
	*/
	public void setAffixFilename(String affixFilename ){
		this.affixFilename = affixFilename;
	}
	
	/**
	* 缩略图名称
	*@return 
	*/
	public String getAffixFilethumb(){
		return  affixFilethumb;
	}
	/**
	* 缩略图名称
	*@param  affixFilethumb
	*/
	public void setAffixFilethumb(String affixFilethumb ){
		this.affixFilethumb = affixFilethumb;
	}
	

}
