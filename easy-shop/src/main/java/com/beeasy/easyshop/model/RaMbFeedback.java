package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_mb_feedback")
public class RaMbFeedback   {
	
	private Integer id ;
	/*
	反馈时间
	*/
	private Integer ftime ;
	/*
	用户编号
	*/
	private Integer memberId ;
	private String content ;
	/*
	用户名
	*/
	private String memberName ;
	/*
	1来自手机端2来自PC端
	*/
	private String type ;
	
	public RaMbFeedback() {
	}
	
	public Integer getId(){
		return  id;
	}
	public void setId(Integer id ){
		this.id = id;
	}
	
	/**
	* 反馈时间
	*@return 
	*/
	public Integer getFtime(){
		return  ftime;
	}
	/**
	* 反馈时间
	*@param  ftime
	*/
	public void setFtime(Integer ftime ){
		this.ftime = ftime;
	}
	
	/**
	* 用户编号
	*@return 
	*/
	public Integer getMemberId(){
		return  memberId;
	}
	/**
	* 用户编号
	*@param  memberId
	*/
	public void setMemberId(Integer memberId ){
		this.memberId = memberId;
	}
	
	public String getContent(){
		return  content;
	}
	public void setContent(String content ){
		this.content = content;
	}
	
	/**
	* 用户名
	*@return 
	*/
	public String getMemberName(){
		return  memberName;
	}
	/**
	* 用户名
	*@param  memberName
	*/
	public void setMemberName(String memberName ){
		this.memberName = memberName;
	}
	
	/**
	* 1来自手机端2来自PC端
	*@return 
	*/
	public String getType(){
		return  type;
	}
	/**
	* 1来自手机端2来自PC端
	*@param  type
	*/
	public void setType(String type ){
		this.type = type;
	}
	

}
