package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_mail_msg_temlates")
public class RaMailMsgTemlates   {
	
	/*
	模板调用代码
	*/
	private String code ;
	/*
	模板内容
	*/
	private String content ;
	/*
	模板名称
	*/
	private String name ;
	/*
	模板标题
	*/
	private String title ;
	
	public RaMailMsgTemlates() {
	}
	
	/**
	* 模板调用代码
	*@return 
	*/
	public String getCode(){
		return  code;
	}
	/**
	* 模板调用代码
	*@param  code
	*/
	public void setCode(String code ){
		this.code = code;
	}
	
	/**
	* 模板内容
	*@return 
	*/
	public String getContent(){
		return  content;
	}
	/**
	* 模板内容
	*@param  content
	*/
	public void setContent(String content ){
		this.content = content;
	}
	
	/**
	* 模板名称
	*@return 
	*/
	public String getName(){
		return  name;
	}
	/**
	* 模板名称
	*@param  name
	*/
	public void setName(String name ){
		this.name = name;
	}
	
	/**
	* 模板标题
	*@return 
	*/
	public String getTitle(){
		return  title;
	}
	/**
	* 模板标题
	*@param  title
	*/
	public void setTitle(String title ){
		this.title = title;
	}
	

}
