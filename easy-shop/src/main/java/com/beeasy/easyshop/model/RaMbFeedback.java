package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_mb_feedback")
public class RaMbFeedback   {
	
	// alias
	public static final String ALIAS_id = "id";
	public static final String ALIAS_ftime = "ftime";
	public static final String ALIAS_member_id = "member_id";
	public static final String ALIAS_content = "content";
	public static final String ALIAS_member_name = "member_name";
	public static final String ALIAS_type = "type";
	
	private Integer id ;
	/*
	反馈时间
	*/
	private Integer ftime ;
	/*
	用户编号
	*/
	private Integer member_id ;
	private String content ;
	/*
	用户名
	*/
	private String member_name ;
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
	public Integer getMember_id(){
		return  member_id;
	}
	/**
	* 用户编号
	*@param  member_id
	*/
	public void setMember_id(Integer member_id ){
		this.member_id = member_id;
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
	public String getMember_name(){
		return  member_name;
	}
	/**
	* 用户名
	*@param  member_name
	*/
	public void setMember_name(String member_name ){
		this.member_name = member_name;
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
