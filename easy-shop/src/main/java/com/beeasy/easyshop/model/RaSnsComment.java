package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_sns_comment")
public class RaSnsComment   {
	
	// alias
	public static final String ALIAS_comment_id = "comment_id";
	public static final String ALIAS_comment_addtime = "comment_addtime";
	public static final String ALIAS_comment_memberid = "comment_memberid";
	public static final String ALIAS_comment_originalid = "comment_originalid";
	public static final String ALIAS_comment_originaltype = "comment_originaltype";
	public static final String ALIAS_comment_state = "comment_state";
	public static final String ALIAS_comment_content = "comment_content";
	public static final String ALIAS_comment_ip = "comment_ip";
	public static final String ALIAS_comment_memberavatar = "comment_memberavatar";
	public static final String ALIAS_comment_membername = "comment_membername";
	
	/*
	自增ID
	*/
	private Integer comment_id ;
	/*
	添加时间
	*/
	private Integer comment_addtime ;
	/*
	会员ID
	*/
	private Integer comment_memberid ;
	/*
	原帖ID
	*/
	private Integer comment_originalid ;
	/*
	原帖类型 0表示动态信息 1表示分享商品 默认为0
	*/
	private Integer comment_originaltype ;
	/*
	状态 0正常 1屏蔽
	*/
	private Integer comment_state ;
	/*
	评论内容
	*/
	private String comment_content ;
	/*
	来源IP
	*/
	private String comment_ip ;
	/*
	会员头像
	*/
	private String comment_memberavatar ;
	/*
	会员名称
	*/
	private String comment_membername ;
	
	public RaSnsComment() {
	}
	
	/**
	* 自增ID
	*@return 
	*/
	public Integer getComment_id(){
		return  comment_id;
	}
	/**
	* 自增ID
	*@param  comment_id
	*/
	public void setComment_id(Integer comment_id ){
		this.comment_id = comment_id;
	}
	
	/**
	* 添加时间
	*@return 
	*/
	public Integer getComment_addtime(){
		return  comment_addtime;
	}
	/**
	* 添加时间
	*@param  comment_addtime
	*/
	public void setComment_addtime(Integer comment_addtime ){
		this.comment_addtime = comment_addtime;
	}
	
	/**
	* 会员ID
	*@return 
	*/
	public Integer getComment_memberid(){
		return  comment_memberid;
	}
	/**
	* 会员ID
	*@param  comment_memberid
	*/
	public void setComment_memberid(Integer comment_memberid ){
		this.comment_memberid = comment_memberid;
	}
	
	/**
	* 原帖ID
	*@return 
	*/
	public Integer getComment_originalid(){
		return  comment_originalid;
	}
	/**
	* 原帖ID
	*@param  comment_originalid
	*/
	public void setComment_originalid(Integer comment_originalid ){
		this.comment_originalid = comment_originalid;
	}
	
	/**
	* 原帖类型 0表示动态信息 1表示分享商品 默认为0
	*@return 
	*/
	public Integer getComment_originaltype(){
		return  comment_originaltype;
	}
	/**
	* 原帖类型 0表示动态信息 1表示分享商品 默认为0
	*@param  comment_originaltype
	*/
	public void setComment_originaltype(Integer comment_originaltype ){
		this.comment_originaltype = comment_originaltype;
	}
	
	/**
	* 状态 0正常 1屏蔽
	*@return 
	*/
	public Integer getComment_state(){
		return  comment_state;
	}
	/**
	* 状态 0正常 1屏蔽
	*@param  comment_state
	*/
	public void setComment_state(Integer comment_state ){
		this.comment_state = comment_state;
	}
	
	/**
	* 评论内容
	*@return 
	*/
	public String getComment_content(){
		return  comment_content;
	}
	/**
	* 评论内容
	*@param  comment_content
	*/
	public void setComment_content(String comment_content ){
		this.comment_content = comment_content;
	}
	
	/**
	* 来源IP
	*@return 
	*/
	public String getComment_ip(){
		return  comment_ip;
	}
	/**
	* 来源IP
	*@param  comment_ip
	*/
	public void setComment_ip(String comment_ip ){
		this.comment_ip = comment_ip;
	}
	
	/**
	* 会员头像
	*@return 
	*/
	public String getComment_memberavatar(){
		return  comment_memberavatar;
	}
	/**
	* 会员头像
	*@param  comment_memberavatar
	*/
	public void setComment_memberavatar(String comment_memberavatar ){
		this.comment_memberavatar = comment_memberavatar;
	}
	
	/**
	* 会员名称
	*@return 
	*/
	public String getComment_membername(){
		return  comment_membername;
	}
	/**
	* 会员名称
	*@param  comment_membername
	*/
	public void setComment_membername(String comment_membername ){
		this.comment_membername = comment_membername;
	}
	

}
