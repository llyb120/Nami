package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_circle_threply")
public class RaCircleThreply   {
	
	// alias
	public static final String ALIAS_reply_id = "reply_id";
	public static final String ALIAS_theme_id = "theme_id";
	public static final String ALIAS_circle_id = "circle_id";
	public static final String ALIAS_is_closed = "is_closed";
	public static final String ALIAS_member_id = "member_id";
	public static final String ALIAS_reply_exp = "reply_exp";
	public static final String ALIAS_reply_replyid = "reply_replyid";
	public static final String ALIAS_member_name = "member_name";
	public static final String ALIAS_reply_addtime = "reply_addtime";
	public static final String ALIAS_reply_content = "reply_content";
	public static final String ALIAS_reply_replyname = "reply_replyname";
	
	/*
	评论id
	*/
	private Integer reply_id ;
	/*
	主题id
	*/
	private Integer theme_id ;
	/*
	圈子id
	*/
	private Integer circle_id ;
	/*
	屏蔽 1是 0否
	*/
	private Integer is_closed ;
	/*
	会员id
	*/
	private Integer member_id ;
	/*
	获得经验
	*/
	private Integer reply_exp ;
	/*
	回复楼层id
	*/
	private Integer reply_replyid ;
	/*
	会员名称
	*/
	private String member_name ;
	/*
	发表时间
	*/
	private String reply_addtime ;
	/*
	评论内容
	*/
	private String reply_content ;
	/*
	回复楼层会员名称
	*/
	private String reply_replyname ;
	
	public RaCircleThreply() {
	}
	
	/**
	* 评论id
	*@return 
	*/
	public Integer getReply_id(){
		return  reply_id;
	}
	/**
	* 评论id
	*@param  reply_id
	*/
	public void setReply_id(Integer reply_id ){
		this.reply_id = reply_id;
	}
	
	/**
	* 主题id
	*@return 
	*/
	public Integer getTheme_id(){
		return  theme_id;
	}
	/**
	* 主题id
	*@param  theme_id
	*/
	public void setTheme_id(Integer theme_id ){
		this.theme_id = theme_id;
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
	* 屏蔽 1是 0否
	*@return 
	*/
	public Integer getIs_closed(){
		return  is_closed;
	}
	/**
	* 屏蔽 1是 0否
	*@param  is_closed
	*/
	public void setIs_closed(Integer is_closed ){
		this.is_closed = is_closed;
	}
	
	/**
	* 会员id
	*@return 
	*/
	public Integer getMember_id(){
		return  member_id;
	}
	/**
	* 会员id
	*@param  member_id
	*/
	public void setMember_id(Integer member_id ){
		this.member_id = member_id;
	}
	
	/**
	* 获得经验
	*@return 
	*/
	public Integer getReply_exp(){
		return  reply_exp;
	}
	/**
	* 获得经验
	*@param  reply_exp
	*/
	public void setReply_exp(Integer reply_exp ){
		this.reply_exp = reply_exp;
	}
	
	/**
	* 回复楼层id
	*@return 
	*/
	public Integer getReply_replyid(){
		return  reply_replyid;
	}
	/**
	* 回复楼层id
	*@param  reply_replyid
	*/
	public void setReply_replyid(Integer reply_replyid ){
		this.reply_replyid = reply_replyid;
	}
	
	/**
	* 会员名称
	*@return 
	*/
	public String getMember_name(){
		return  member_name;
	}
	/**
	* 会员名称
	*@param  member_name
	*/
	public void setMember_name(String member_name ){
		this.member_name = member_name;
	}
	
	/**
	* 发表时间
	*@return 
	*/
	public String getReply_addtime(){
		return  reply_addtime;
	}
	/**
	* 发表时间
	*@param  reply_addtime
	*/
	public void setReply_addtime(String reply_addtime ){
		this.reply_addtime = reply_addtime;
	}
	
	/**
	* 评论内容
	*@return 
	*/
	public String getReply_content(){
		return  reply_content;
	}
	/**
	* 评论内容
	*@param  reply_content
	*/
	public void setReply_content(String reply_content ){
		this.reply_content = reply_content;
	}
	
	/**
	* 回复楼层会员名称
	*@return 
	*/
	public String getReply_replyname(){
		return  reply_replyname;
	}
	/**
	* 回复楼层会员名称
	*@param  reply_replyname
	*/
	public void setReply_replyname(String reply_replyname ){
		this.reply_replyname = reply_replyname;
	}
	

}
