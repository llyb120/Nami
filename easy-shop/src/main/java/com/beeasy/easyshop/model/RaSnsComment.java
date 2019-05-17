package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_sns_comment")
public class RaSnsComment   {
	
	/*
	自增ID
	*/
	private Integer commentId ;
	/*
	添加时间
	*/
	private Integer commentAddtime ;
	/*
	会员ID
	*/
	private Integer commentMemberid ;
	/*
	原帖ID
	*/
	private Integer commentOriginalid ;
	/*
	原帖类型 0表示动态信息 1表示分享商品 默认为0
	*/
	private Integer commentOriginaltype ;
	/*
	状态 0正常 1屏蔽
	*/
	private Integer commentState ;
	/*
	评论内容
	*/
	private String commentContent ;
	/*
	来源IP
	*/
	private String commentIp ;
	/*
	会员头像
	*/
	private String commentMemberavatar ;
	/*
	会员名称
	*/
	private String commentMembername ;
	
	public RaSnsComment() {
	}
	
	/**
	* 自增ID
	*@return 
	*/
	public Integer getCommentId(){
		return  commentId;
	}
	/**
	* 自增ID
	*@param  commentId
	*/
	public void setCommentId(Integer commentId ){
		this.commentId = commentId;
	}
	
	/**
	* 添加时间
	*@return 
	*/
	public Integer getCommentAddtime(){
		return  commentAddtime;
	}
	/**
	* 添加时间
	*@param  commentAddtime
	*/
	public void setCommentAddtime(Integer commentAddtime ){
		this.commentAddtime = commentAddtime;
	}
	
	/**
	* 会员ID
	*@return 
	*/
	public Integer getCommentMemberid(){
		return  commentMemberid;
	}
	/**
	* 会员ID
	*@param  commentMemberid
	*/
	public void setCommentMemberid(Integer commentMemberid ){
		this.commentMemberid = commentMemberid;
	}
	
	/**
	* 原帖ID
	*@return 
	*/
	public Integer getCommentOriginalid(){
		return  commentOriginalid;
	}
	/**
	* 原帖ID
	*@param  commentOriginalid
	*/
	public void setCommentOriginalid(Integer commentOriginalid ){
		this.commentOriginalid = commentOriginalid;
	}
	
	/**
	* 原帖类型 0表示动态信息 1表示分享商品 默认为0
	*@return 
	*/
	public Integer getCommentOriginaltype(){
		return  commentOriginaltype;
	}
	/**
	* 原帖类型 0表示动态信息 1表示分享商品 默认为0
	*@param  commentOriginaltype
	*/
	public void setCommentOriginaltype(Integer commentOriginaltype ){
		this.commentOriginaltype = commentOriginaltype;
	}
	
	/**
	* 状态 0正常 1屏蔽
	*@return 
	*/
	public Integer getCommentState(){
		return  commentState;
	}
	/**
	* 状态 0正常 1屏蔽
	*@param  commentState
	*/
	public void setCommentState(Integer commentState ){
		this.commentState = commentState;
	}
	
	/**
	* 评论内容
	*@return 
	*/
	public String getCommentContent(){
		return  commentContent;
	}
	/**
	* 评论内容
	*@param  commentContent
	*/
	public void setCommentContent(String commentContent ){
		this.commentContent = commentContent;
	}
	
	/**
	* 来源IP
	*@return 
	*/
	public String getCommentIp(){
		return  commentIp;
	}
	/**
	* 来源IP
	*@param  commentIp
	*/
	public void setCommentIp(String commentIp ){
		this.commentIp = commentIp;
	}
	
	/**
	* 会员头像
	*@return 
	*/
	public String getCommentMemberavatar(){
		return  commentMemberavatar;
	}
	/**
	* 会员头像
	*@param  commentMemberavatar
	*/
	public void setCommentMemberavatar(String commentMemberavatar ){
		this.commentMemberavatar = commentMemberavatar;
	}
	
	/**
	* 会员名称
	*@return 
	*/
	public String getCommentMembername(){
		return  commentMembername;
	}
	/**
	* 会员名称
	*@param  commentMembername
	*/
	public void setCommentMembername(String commentMembername ){
		this.commentMembername = commentMembername;
	}
	

}
