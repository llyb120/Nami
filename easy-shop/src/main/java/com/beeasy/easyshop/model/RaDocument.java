package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_document")
public class RaDocument   {
	
	// alias
	public static final String ALIAS_doc_id = "doc_id";
	public static final String ALIAS_doc_time = "doc_time";
	public static final String ALIAS_doc_code = "doc_code";
	public static final String ALIAS_doc_content = "doc_content";
	public static final String ALIAS_doc_title = "doc_title";
	
	/*
	id
	*/
	private Integer doc_id ;
	/*
	添加时间/修改时间
	*/
	private Integer doc_time ;
	/*
	调用标识码
	*/
	private String doc_code ;
	/*
	内容
	*/
	private String doc_content ;
	/*
	标题
	*/
	private String doc_title ;
	
	public RaDocument() {
	}
	
	/**
	* id
	*@return 
	*/
	public Integer getDoc_id(){
		return  doc_id;
	}
	/**
	* id
	*@param  doc_id
	*/
	public void setDoc_id(Integer doc_id ){
		this.doc_id = doc_id;
	}
	
	/**
	* 添加时间/修改时间
	*@return 
	*/
	public Integer getDoc_time(){
		return  doc_time;
	}
	/**
	* 添加时间/修改时间
	*@param  doc_time
	*/
	public void setDoc_time(Integer doc_time ){
		this.doc_time = doc_time;
	}
	
	/**
	* 调用标识码
	*@return 
	*/
	public String getDoc_code(){
		return  doc_code;
	}
	/**
	* 调用标识码
	*@param  doc_code
	*/
	public void setDoc_code(String doc_code ){
		this.doc_code = doc_code;
	}
	
	/**
	* 内容
	*@return 
	*/
	public String getDoc_content(){
		return  doc_content;
	}
	/**
	* 内容
	*@param  doc_content
	*/
	public void setDoc_content(String doc_content ){
		this.doc_content = doc_content;
	}
	
	/**
	* 标题
	*@return 
	*/
	public String getDoc_title(){
		return  doc_title;
	}
	/**
	* 标题
	*@param  doc_title
	*/
	public void setDoc_title(String doc_title ){
		this.doc_title = doc_title;
	}
	

}
