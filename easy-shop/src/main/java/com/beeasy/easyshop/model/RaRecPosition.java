package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_rec_position")
public class RaRecPosition   {
	
	private Integer recId ;
	/*
	序列化推荐位内容
	*/
	private String content ;
	/*
	0文字1本地图片2远程
	*/
	private String picType ;
	/*
	标题
	*/
	private String title ;
	
	public RaRecPosition() {
	}
	
	public Integer getRecId(){
		return  recId;
	}
	public void setRecId(Integer recId ){
		this.recId = recId;
	}
	
	/**
	* 序列化推荐位内容
	*@return 
	*/
	public String getContent(){
		return  content;
	}
	/**
	* 序列化推荐位内容
	*@param  content
	*/
	public void setContent(String content ){
		this.content = content;
	}
	
	/**
	* 0文字1本地图片2远程
	*@return 
	*/
	public String getPicType(){
		return  picType;
	}
	/**
	* 0文字1本地图片2远程
	*@param  picType
	*/
	public void setPicType(String picType ){
		this.picType = picType;
	}
	
	/**
	* 标题
	*@return 
	*/
	public String getTitle(){
		return  title;
	}
	/**
	* 标题
	*@param  title
	*/
	public void setTitle(String title ){
		this.title = title;
	}
	

}
