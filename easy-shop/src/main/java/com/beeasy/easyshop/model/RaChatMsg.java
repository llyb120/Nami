package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_chat_msg")
public class RaChatMsg   {
	
	/*
	记录ID
	*/
	private Integer mId ;
	/*
	添加时间
	*/
	private Integer addTime ;
	/*
	会员ID
	*/
	private Integer fId ;
	/*
	状态:1为已读,2为未读,默认为2
	*/
	private Integer rState ;
	/*
	接收会员ID
	*/
	private Integer tId ;
	/*
	发自IP
	*/
	private String fIp ;
	/*
	会员名
	*/
	private String fName ;
	/*
	消息内容
	*/
	private String tMsg ;
	/*
	接收会员名
	*/
	private String tName ;
	
	public RaChatMsg() {
	}
	
	/**
	* 记录ID
	*@return 
	*/
	public Integer getmId(){
		return  mId;
	}
	/**
	* 记录ID
	*@param  mId
	*/
	public void setmId(Integer mId ){
		this.mId = mId;
	}
	
	/**
	* 添加时间
	*@return 
	*/
	public Integer getAddTime(){
		return  addTime;
	}
	/**
	* 添加时间
	*@param  addTime
	*/
	public void setAddTime(Integer addTime ){
		this.addTime = addTime;
	}
	
	/**
	* 会员ID
	*@return 
	*/
	public Integer getfId(){
		return  fId;
	}
	/**
	* 会员ID
	*@param  fId
	*/
	public void setfId(Integer fId ){
		this.fId = fId;
	}
	
	/**
	* 状态:1为已读,2为未读,默认为2
	*@return 
	*/
	public Integer getrState(){
		return  rState;
	}
	/**
	* 状态:1为已读,2为未读,默认为2
	*@param  rState
	*/
	public void setrState(Integer rState ){
		this.rState = rState;
	}
	
	/**
	* 接收会员ID
	*@return 
	*/
	public Integer gettId(){
		return  tId;
	}
	/**
	* 接收会员ID
	*@param  tId
	*/
	public void settId(Integer tId ){
		this.tId = tId;
	}
	
	/**
	* 发自IP
	*@return 
	*/
	public String getfIp(){
		return  fIp;
	}
	/**
	* 发自IP
	*@param  fIp
	*/
	public void setfIp(String fIp ){
		this.fIp = fIp;
	}
	
	/**
	* 会员名
	*@return 
	*/
	public String getfName(){
		return  fName;
	}
	/**
	* 会员名
	*@param  fName
	*/
	public void setfName(String fName ){
		this.fName = fName;
	}
	
	/**
	* 消息内容
	*@return 
	*/
	public String gettMsg(){
		return  tMsg;
	}
	/**
	* 消息内容
	*@param  tMsg
	*/
	public void settMsg(String tMsg ){
		this.tMsg = tMsg;
	}
	
	/**
	* 接收会员名
	*@return 
	*/
	public String gettName(){
		return  tName;
	}
	/**
	* 接收会员名
	*@param  tName
	*/
	public void settName(String tName ){
		this.tName = tName;
	}
	

}
