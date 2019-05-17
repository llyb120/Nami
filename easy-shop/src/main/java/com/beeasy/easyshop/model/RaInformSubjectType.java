package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_inform_subject_type")
public class RaInformSubjectType   {
	
	// alias
	public static final String ALIAS_inform_type_id = "inform_type_id";
	public static final String ALIAS_inform_type_state = "inform_type_state";
	public static final String ALIAS_inform_type_desc = "inform_type_desc";
	public static final String ALIAS_inform_type_name = "inform_type_name";
	
	/*
	举报类型id
	*/
	private Integer inform_type_id ;
	/*
	举报类型状态(1有效/2失效)
	*/
	private Integer inform_type_state ;
	/*
	举报类型描述
	*/
	private String inform_type_desc ;
	/*
	举报类型名称 
	*/
	private String inform_type_name ;
	
	public RaInformSubjectType() {
	}
	
	/**
	* 举报类型id
	*@return 
	*/
	public Integer getInform_type_id(){
		return  inform_type_id;
	}
	/**
	* 举报类型id
	*@param  inform_type_id
	*/
	public void setInform_type_id(Integer inform_type_id ){
		this.inform_type_id = inform_type_id;
	}
	
	/**
	* 举报类型状态(1有效/2失效)
	*@return 
	*/
	public Integer getInform_type_state(){
		return  inform_type_state;
	}
	/**
	* 举报类型状态(1有效/2失效)
	*@param  inform_type_state
	*/
	public void setInform_type_state(Integer inform_type_state ){
		this.inform_type_state = inform_type_state;
	}
	
	/**
	* 举报类型描述
	*@return 
	*/
	public String getInform_type_desc(){
		return  inform_type_desc;
	}
	/**
	* 举报类型描述
	*@param  inform_type_desc
	*/
	public void setInform_type_desc(String inform_type_desc ){
		this.inform_type_desc = inform_type_desc;
	}
	
	/**
	* 举报类型名称 
	*@return 
	*/
	public String getInform_type_name(){
		return  inform_type_name;
	}
	/**
	* 举报类型名称 
	*@param  inform_type_name
	*/
	public void setInform_type_name(String inform_type_name ){
		this.inform_type_name = inform_type_name;
	}
	

}
