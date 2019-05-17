package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_inform_subject_type")
public class RaInformSubjectType   {
	
	/*
	举报类型id
	*/
	private Integer informTypeId ;
	/*
	举报类型状态(1有效/2失效)
	*/
	private Integer informTypeState ;
	/*
	举报类型描述
	*/
	private String informTypeDesc ;
	/*
	举报类型名称 
	*/
	private String informTypeName ;
	
	public RaInformSubjectType() {
	}
	
	/**
	* 举报类型id
	*@return 
	*/
	public Integer getInformTypeId(){
		return  informTypeId;
	}
	/**
	* 举报类型id
	*@param  informTypeId
	*/
	public void setInformTypeId(Integer informTypeId ){
		this.informTypeId = informTypeId;
	}
	
	/**
	* 举报类型状态(1有效/2失效)
	*@return 
	*/
	public Integer getInformTypeState(){
		return  informTypeState;
	}
	/**
	* 举报类型状态(1有效/2失效)
	*@param  informTypeState
	*/
	public void setInformTypeState(Integer informTypeState ){
		this.informTypeState = informTypeState;
	}
	
	/**
	* 举报类型描述
	*@return 
	*/
	public String getInformTypeDesc(){
		return  informTypeDesc;
	}
	/**
	* 举报类型描述
	*@param  informTypeDesc
	*/
	public void setInformTypeDesc(String informTypeDesc ){
		this.informTypeDesc = informTypeDesc;
	}
	
	/**
	* 举报类型名称 
	*@return 
	*/
	public String getInformTypeName(){
		return  informTypeName;
	}
	/**
	* 举报类型名称 
	*@param  informTypeName
	*/
	public void setInformTypeName(String informTypeName ){
		this.informTypeName = informTypeName;
	}
	

}
