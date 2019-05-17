package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_document")
public class RaDocument   {
	
	/*
	id
	*/
	private Integer docId ;
	/*
	添加时间/修改时间
	*/
	private Integer docTime ;
	/*
	调用标识码
	*/
	private String docCode ;
	/*
	内容
	*/
	private String docContent ;
	/*
	标题
	*/
	private String docTitle ;
	
	public RaDocument() {
	}
	
	/**
	* id
	*@return 
	*/
	public Integer getDocId(){
		return  docId;
	}
	/**
	* id
	*@param  docId
	*/
	public void setDocId(Integer docId ){
		this.docId = docId;
	}
	
	/**
	* 添加时间/修改时间
	*@return 
	*/
	public Integer getDocTime(){
		return  docTime;
	}
	/**
	* 添加时间/修改时间
	*@param  docTime
	*/
	public void setDocTime(Integer docTime ){
		this.docTime = docTime;
	}
	
	/**
	* 调用标识码
	*@return 
	*/
	public String getDocCode(){
		return  docCode;
	}
	/**
	* 调用标识码
	*@param  docCode
	*/
	public void setDocCode(String docCode ){
		this.docCode = docCode;
	}
	
	/**
	* 内容
	*@return 
	*/
	public String getDocContent(){
		return  docContent;
	}
	/**
	* 内容
	*@param  docContent
	*/
	public void setDocContent(String docContent ){
		this.docContent = docContent;
	}
	
	/**
	* 标题
	*@return 
	*/
	public String getDocTitle(){
		return  docTitle;
	}
	/**
	* 标题
	*@param  docTitle
	*/
	public void setDocTitle(String docTitle ){
		this.docTitle = docTitle;
	}
	

}
