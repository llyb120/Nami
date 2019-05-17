package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_sns_friend")
public class RaSnsFriend   {
	
	/*
	id值
	*/
	private Integer friendId ;
	/*
	添加时间
	*/
	private Integer friendAddtime ;
	/*
	关注状态 1为单方关注 2为双方关注
	*/
	private Integer friendFollowstate ;
	/*
	会员id
	*/
	private Integer friendFrommid ;
	/*
	朋友id
	*/
	private Integer friendTomid ;
	/*
	会员头像
	*/
	private String friendFrommavatar ;
	/*
	会员名称
	*/
	private String friendFrommname ;
	/*
	朋友头像
	*/
	private String friendTomavatar ;
	/*
	好友会员名称
	*/
	private String friendTomname ;
	
	public RaSnsFriend() {
	}
	
	/**
	* id值
	*@return 
	*/
	public Integer getFriendId(){
		return  friendId;
	}
	/**
	* id值
	*@param  friendId
	*/
	public void setFriendId(Integer friendId ){
		this.friendId = friendId;
	}
	
	/**
	* 添加时间
	*@return 
	*/
	public Integer getFriendAddtime(){
		return  friendAddtime;
	}
	/**
	* 添加时间
	*@param  friendAddtime
	*/
	public void setFriendAddtime(Integer friendAddtime ){
		this.friendAddtime = friendAddtime;
	}
	
	/**
	* 关注状态 1为单方关注 2为双方关注
	*@return 
	*/
	public Integer getFriendFollowstate(){
		return  friendFollowstate;
	}
	/**
	* 关注状态 1为单方关注 2为双方关注
	*@param  friendFollowstate
	*/
	public void setFriendFollowstate(Integer friendFollowstate ){
		this.friendFollowstate = friendFollowstate;
	}
	
	/**
	* 会员id
	*@return 
	*/
	public Integer getFriendFrommid(){
		return  friendFrommid;
	}
	/**
	* 会员id
	*@param  friendFrommid
	*/
	public void setFriendFrommid(Integer friendFrommid ){
		this.friendFrommid = friendFrommid;
	}
	
	/**
	* 朋友id
	*@return 
	*/
	public Integer getFriendTomid(){
		return  friendTomid;
	}
	/**
	* 朋友id
	*@param  friendTomid
	*/
	public void setFriendTomid(Integer friendTomid ){
		this.friendTomid = friendTomid;
	}
	
	/**
	* 会员头像
	*@return 
	*/
	public String getFriendFrommavatar(){
		return  friendFrommavatar;
	}
	/**
	* 会员头像
	*@param  friendFrommavatar
	*/
	public void setFriendFrommavatar(String friendFrommavatar ){
		this.friendFrommavatar = friendFrommavatar;
	}
	
	/**
	* 会员名称
	*@return 
	*/
	public String getFriendFrommname(){
		return  friendFrommname;
	}
	/**
	* 会员名称
	*@param  friendFrommname
	*/
	public void setFriendFrommname(String friendFrommname ){
		this.friendFrommname = friendFrommname;
	}
	
	/**
	* 朋友头像
	*@return 
	*/
	public String getFriendTomavatar(){
		return  friendTomavatar;
	}
	/**
	* 朋友头像
	*@param  friendTomavatar
	*/
	public void setFriendTomavatar(String friendTomavatar ){
		this.friendTomavatar = friendTomavatar;
	}
	
	/**
	* 好友会员名称
	*@return 
	*/
	public String getFriendTomname(){
		return  friendTomname;
	}
	/**
	* 好友会员名称
	*@param  friendTomname
	*/
	public void setFriendTomname(String friendTomname ){
		this.friendTomname = friendTomname;
	}
	

}
