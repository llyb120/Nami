package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_message")
public class RaMessage   {
	
	// alias
	public static final String ALIAS_message_id = "message_id";
	public static final String ALIAS_from_member_id = "from_member_id";
	public static final String ALIAS_message_ismore = "message_ismore";
	public static final String ALIAS_message_open = "message_open";
	public static final String ALIAS_message_parent_id = "message_parent_id";
	public static final String ALIAS_message_state = "message_state";
	public static final String ALIAS_message_type = "message_type";
	public static final String ALIAS_del_member_id = "del_member_id";
	public static final String ALIAS_from_member_name = "from_member_name";
	public static final String ALIAS_message_body = "message_body";
	public static final String ALIAS_message_time = "message_time";
	public static final String ALIAS_message_title = "message_title";
	public static final String ALIAS_message_update_time = "message_update_time";
	public static final String ALIAS_read_member_id = "read_member_id";
	public static final String ALIAS_to_member_id = "to_member_id";
	public static final String ALIAS_to_member_name = "to_member_name";
	
	/*
	短消息索引id
	*/
	private Integer message_id ;
	/*
	短消息发送人
	*/
	private Integer from_member_id ;
	/*
	站内信是否为一条发给多个用户 0为否 1为多条 
	*/
	private Integer message_ismore ;
	/*
	短消息打开状态
	*/
	private Integer message_open ;
	/*
	回复短消息message_id
	*/
	private Integer message_parent_id ;
	/*
	短消息状态，0为正常状态，1为发送人删除状态，2为接收人删除状态
	*/
	private Integer message_state ;
	/*
	0为私信、1为系统消息、2为留言
	*/
	private Integer message_type ;
	/*
	已经删除该消息的会员id
	*/
	private String del_member_id ;
	/*
	发信息人用户名
	*/
	private String from_member_name ;
	/*
	短消息内容
	*/
	private String message_body ;
	/*
	短消息发送时间
	*/
	private String message_time ;
	/*
	短消息标题
	*/
	private String message_title ;
	/*
	短消息回复更新时间
	*/
	private String message_update_time ;
	/*
	已经读过该消息的会员id
	*/
	private String read_member_id ;
	/*
	短消息接收人
	*/
	private String to_member_id ;
	/*
	接收人用户名
	*/
	private String to_member_name ;
	
	public RaMessage() {
	}
	
	/**
	* 短消息索引id
	*@return 
	*/
	public Integer getMessage_id(){
		return  message_id;
	}
	/**
	* 短消息索引id
	*@param  message_id
	*/
	public void setMessage_id(Integer message_id ){
		this.message_id = message_id;
	}
	
	/**
	* 短消息发送人
	*@return 
	*/
	public Integer getFrom_member_id(){
		return  from_member_id;
	}
	/**
	* 短消息发送人
	*@param  from_member_id
	*/
	public void setFrom_member_id(Integer from_member_id ){
		this.from_member_id = from_member_id;
	}
	
	/**
	* 站内信是否为一条发给多个用户 0为否 1为多条 
	*@return 
	*/
	public Integer getMessage_ismore(){
		return  message_ismore;
	}
	/**
	* 站内信是否为一条发给多个用户 0为否 1为多条 
	*@param  message_ismore
	*/
	public void setMessage_ismore(Integer message_ismore ){
		this.message_ismore = message_ismore;
	}
	
	/**
	* 短消息打开状态
	*@return 
	*/
	public Integer getMessage_open(){
		return  message_open;
	}
	/**
	* 短消息打开状态
	*@param  message_open
	*/
	public void setMessage_open(Integer message_open ){
		this.message_open = message_open;
	}
	
	/**
	* 回复短消息message_id
	*@return 
	*/
	public Integer getMessage_parent_id(){
		return  message_parent_id;
	}
	/**
	* 回复短消息message_id
	*@param  message_parent_id
	*/
	public void setMessage_parent_id(Integer message_parent_id ){
		this.message_parent_id = message_parent_id;
	}
	
	/**
	* 短消息状态，0为正常状态，1为发送人删除状态，2为接收人删除状态
	*@return 
	*/
	public Integer getMessage_state(){
		return  message_state;
	}
	/**
	* 短消息状态，0为正常状态，1为发送人删除状态，2为接收人删除状态
	*@param  message_state
	*/
	public void setMessage_state(Integer message_state ){
		this.message_state = message_state;
	}
	
	/**
	* 0为私信、1为系统消息、2为留言
	*@return 
	*/
	public Integer getMessage_type(){
		return  message_type;
	}
	/**
	* 0为私信、1为系统消息、2为留言
	*@param  message_type
	*/
	public void setMessage_type(Integer message_type ){
		this.message_type = message_type;
	}
	
	/**
	* 已经删除该消息的会员id
	*@return 
	*/
	public String getDel_member_id(){
		return  del_member_id;
	}
	/**
	* 已经删除该消息的会员id
	*@param  del_member_id
	*/
	public void setDel_member_id(String del_member_id ){
		this.del_member_id = del_member_id;
	}
	
	/**
	* 发信息人用户名
	*@return 
	*/
	public String getFrom_member_name(){
		return  from_member_name;
	}
	/**
	* 发信息人用户名
	*@param  from_member_name
	*/
	public void setFrom_member_name(String from_member_name ){
		this.from_member_name = from_member_name;
	}
	
	/**
	* 短消息内容
	*@return 
	*/
	public String getMessage_body(){
		return  message_body;
	}
	/**
	* 短消息内容
	*@param  message_body
	*/
	public void setMessage_body(String message_body ){
		this.message_body = message_body;
	}
	
	/**
	* 短消息发送时间
	*@return 
	*/
	public String getMessage_time(){
		return  message_time;
	}
	/**
	* 短消息发送时间
	*@param  message_time
	*/
	public void setMessage_time(String message_time ){
		this.message_time = message_time;
	}
	
	/**
	* 短消息标题
	*@return 
	*/
	public String getMessage_title(){
		return  message_title;
	}
	/**
	* 短消息标题
	*@param  message_title
	*/
	public void setMessage_title(String message_title ){
		this.message_title = message_title;
	}
	
	/**
	* 短消息回复更新时间
	*@return 
	*/
	public String getMessage_update_time(){
		return  message_update_time;
	}
	/**
	* 短消息回复更新时间
	*@param  message_update_time
	*/
	public void setMessage_update_time(String message_update_time ){
		this.message_update_time = message_update_time;
	}
	
	/**
	* 已经读过该消息的会员id
	*@return 
	*/
	public String getRead_member_id(){
		return  read_member_id;
	}
	/**
	* 已经读过该消息的会员id
	*@param  read_member_id
	*/
	public void setRead_member_id(String read_member_id ){
		this.read_member_id = read_member_id;
	}
	
	/**
	* 短消息接收人
	*@return 
	*/
	public String getTo_member_id(){
		return  to_member_id;
	}
	/**
	* 短消息接收人
	*@param  to_member_id
	*/
	public void setTo_member_id(String to_member_id ){
		this.to_member_id = to_member_id;
	}
	
	/**
	* 接收人用户名
	*@return 
	*/
	public String getTo_member_name(){
		return  to_member_name;
	}
	/**
	* 接收人用户名
	*@param  to_member_name
	*/
	public void setTo_member_name(String to_member_name ){
		this.to_member_name = to_member_name;
	}
	

}
