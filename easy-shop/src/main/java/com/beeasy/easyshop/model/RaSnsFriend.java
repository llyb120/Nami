package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_sns_friend")
public class RaSnsFriend   {
	
	// alias
	public static final String ALIAS_friend_id = "friend_id";
	public static final String ALIAS_friend_addtime = "friend_addtime";
	public static final String ALIAS_friend_followstate = "friend_followstate";
	public static final String ALIAS_friend_frommid = "friend_frommid";
	public static final String ALIAS_friend_tomid = "friend_tomid";
	public static final String ALIAS_friend_frommavatar = "friend_frommavatar";
	public static final String ALIAS_friend_frommname = "friend_frommname";
	public static final String ALIAS_friend_tomavatar = "friend_tomavatar";
	public static final String ALIAS_friend_tomname = "friend_tomname";
	
	/*
	id值
	*/
	private Integer friend_id ;
	/*
	添加时间
	*/
	private Integer friend_addtime ;
	/*
	关注状态 1为单方关注 2为双方关注
	*/
	private Integer friend_followstate ;
	/*
	会员id
	*/
	private Integer friend_frommid ;
	/*
	朋友id
	*/
	private Integer friend_tomid ;
	/*
	会员头像
	*/
	private String friend_frommavatar ;
	/*
	会员名称
	*/
	private String friend_frommname ;
	/*
	朋友头像
	*/
	private String friend_tomavatar ;
	/*
	好友会员名称
	*/
	private String friend_tomname ;
	
	public RaSnsFriend() {
	}
	
	/**
	* id值
	*@return 
	*/
	public Integer getFriend_id(){
		return  friend_id;
	}
	/**
	* id值
	*@param  friend_id
	*/
	public void setFriend_id(Integer friend_id ){
		this.friend_id = friend_id;
	}
	
	/**
	* 添加时间
	*@return 
	*/
	public Integer getFriend_addtime(){
		return  friend_addtime;
	}
	/**
	* 添加时间
	*@param  friend_addtime
	*/
	public void setFriend_addtime(Integer friend_addtime ){
		this.friend_addtime = friend_addtime;
	}
	
	/**
	* 关注状态 1为单方关注 2为双方关注
	*@return 
	*/
	public Integer getFriend_followstate(){
		return  friend_followstate;
	}
	/**
	* 关注状态 1为单方关注 2为双方关注
	*@param  friend_followstate
	*/
	public void setFriend_followstate(Integer friend_followstate ){
		this.friend_followstate = friend_followstate;
	}
	
	/**
	* 会员id
	*@return 
	*/
	public Integer getFriend_frommid(){
		return  friend_frommid;
	}
	/**
	* 会员id
	*@param  friend_frommid
	*/
	public void setFriend_frommid(Integer friend_frommid ){
		this.friend_frommid = friend_frommid;
	}
	
	/**
	* 朋友id
	*@return 
	*/
	public Integer getFriend_tomid(){
		return  friend_tomid;
	}
	/**
	* 朋友id
	*@param  friend_tomid
	*/
	public void setFriend_tomid(Integer friend_tomid ){
		this.friend_tomid = friend_tomid;
	}
	
	/**
	* 会员头像
	*@return 
	*/
	public String getFriend_frommavatar(){
		return  friend_frommavatar;
	}
	/**
	* 会员头像
	*@param  friend_frommavatar
	*/
	public void setFriend_frommavatar(String friend_frommavatar ){
		this.friend_frommavatar = friend_frommavatar;
	}
	
	/**
	* 会员名称
	*@return 
	*/
	public String getFriend_frommname(){
		return  friend_frommname;
	}
	/**
	* 会员名称
	*@param  friend_frommname
	*/
	public void setFriend_frommname(String friend_frommname ){
		this.friend_frommname = friend_frommname;
	}
	
	/**
	* 朋友头像
	*@return 
	*/
	public String getFriend_tomavatar(){
		return  friend_tomavatar;
	}
	/**
	* 朋友头像
	*@param  friend_tomavatar
	*/
	public void setFriend_tomavatar(String friend_tomavatar ){
		this.friend_tomavatar = friend_tomavatar;
	}
	
	/**
	* 好友会员名称
	*@return 
	*/
	public String getFriend_tomname(){
		return  friend_tomname;
	}
	/**
	* 好友会员名称
	*@param  friend_tomname
	*/
	public void setFriend_tomname(String friend_tomname ){
		this.friend_tomname = friend_tomname;
	}
	

}
