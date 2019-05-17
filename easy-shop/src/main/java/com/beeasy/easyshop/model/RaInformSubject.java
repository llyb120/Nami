package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_inform_subject")
public class RaInformSubject   {
	
	/*
	举报主题id
	*/
	private Integer informSubjectId ;
	/*
	举报主题状态(1可用/2失效)
	*/
	private Integer informSubjectState ;
	/*
	举报类型id
	*/
	private Integer informSubjectTypeId ;
	/*
	举报主题内容
	*/
	private String informSubjectContent ;
	/*
	举报类型名称 
	*/
	private String informSubjectTypeName ;
	
	public RaInformSubject() {
	}
	
	/**
	* 举报主题id
	*@return 
	*/
	public Integer getInformSubjectId(){
		return  informSubjectId;
	}
	/**
	* 举报主题id
	*@param  informSubjectId
	*/
	public void setInformSubjectId(Integer informSubjectId ){
		this.informSubjectId = informSubjectId;
	}
	
	/**
	* 举报主题状态(1可用/2失效)
	*@return 
	*/
	public Integer getInformSubjectState(){
		return  informSubjectState;
	}
	/**
	* 举报主题状态(1可用/2失效)
	*@param  informSubjectState
	*/
	public void setInformSubjectState(Integer informSubjectState ){
		this.informSubjectState = informSubjectState;
	}
	
	/**
	* 举报类型id
	*@return 
	*/
	public Integer getInformSubjectTypeId(){
		return  informSubjectTypeId;
	}
	/**
	* 举报类型id
	*@param  informSubjectTypeId
	*/
	public void setInformSubjectTypeId(Integer informSubjectTypeId ){
		this.informSubjectTypeId = informSubjectTypeId;
	}
	
	/**
	* 举报主题内容
	*@return 
	*/
	public String getInformSubjectContent(){
		return  informSubjectContent;
	}
	/**
	* 举报主题内容
	*@param  informSubjectContent
	*/
	public void setInformSubjectContent(String informSubjectContent ){
		this.informSubjectContent = informSubjectContent;
	}
	
	/**
	* 举报类型名称 
	*@return 
	*/
	public String getInformSubjectTypeName(){
		return  informSubjectTypeName;
	}
	/**
	* 举报类型名称 
	*@param  informSubjectTypeName
	*/
	public void setInformSubjectTypeName(String informSubjectTypeName ){
		this.informSubjectTypeName = informSubjectTypeName;
	}
	

}
