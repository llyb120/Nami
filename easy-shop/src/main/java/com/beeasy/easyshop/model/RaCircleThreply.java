package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_circle_threply")
public class RaCircleThreply   {
	
	/*
	评论id
	*/
	private Integer replyId ;
	/*
	主题id
	*/
	private Integer themeId ;
	/*
	圈子id
	*/
	private Integer circleId ;
	/*
	屏蔽 1是 0否
	*/
	private Integer isClosed ;
	/*
	会员id
	*/
	private Integer memberId ;
	/*
	获得经验
	*/
	private Integer replyExp ;
	/*
	回复楼层id
	*/
	private Integer replyReplyid ;
	/*
	会员名称
	*/
	private String memberName ;
	/*
	发表时间
	*/
	private String replyAddtime ;
	/*
	评论内容
	*/
	private String replyContent ;
	/*
	回复楼层会员名称
	*/
	private String replyReplyname ;
	
	public RaCircleThreply() {
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
	* 获得经验
	*@return 
	*/
	public Integer getReplyExp(){
		return  replyExp;
	}
	/**
	* 获得经验
	*@param  replyExp
	*/
	public void setReplyExp(Integer replyExp ){
		this.replyExp = replyExp;
	}
	
	/**
	* 回复楼层id
	*@return 
	*/
	public Integer getReplyReplyid(){
		return  replyReplyid;
	}
	/**
	* 回复楼层id
	*@param  replyReplyid
	*/
	public void setReplyReplyid(Integer replyReplyid ){
		this.replyReplyid = replyReplyid;
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
	* 发表时间
	*@return 
	*/
	public String getReplyAddtime(){
		return  replyAddtime;
	}
	/**
	* 发表时间
	*@param  replyAddtime
	*/
	public void setReplyAddtime(String replyAddtime ){
		this.replyAddtime = replyAddtime;
	}
	
	/**
	* 评论内容
	*@return 
	*/
	public String getReplyContent(){
		return  replyContent;
	}
	/**
	* 评论内容
	*@param  replyContent
	*/
	public void setReplyContent(String replyContent ){
		this.replyContent = replyContent;
	}
	
	/**
	* 回复楼层会员名称
	*@return 
	*/
	public String getReplyReplyname(){
		return  replyReplyname;
	}
	/**
	* 回复楼层会员名称
	*@param  replyReplyname
	*/
	public void setReplyReplyname(String replyReplyname ){
		this.replyReplyname = replyReplyname;
	}
	

}
