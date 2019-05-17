package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_inform_subject")
public class RaInformSubject   {
	
	// alias
	public static final String ALIAS_inform_subject_id = "inform_subject_id";
	public static final String ALIAS_inform_subject_state = "inform_subject_state";
	public static final String ALIAS_inform_subject_type_id = "inform_subject_type_id";
	public static final String ALIAS_inform_subject_content = "inform_subject_content";
	public static final String ALIAS_inform_subject_type_name = "inform_subject_type_name";
	
	/*
	举报主题id
	*/
	private Integer inform_subject_id ;
	/*
	举报主题状态(1可用/2失效)
	*/
	private Integer inform_subject_state ;
	/*
	举报类型id
	*/
	private Integer inform_subject_type_id ;
	/*
	举报主题内容
	*/
	private String inform_subject_content ;
	/*
	举报类型名称 
	*/
	private String inform_subject_type_name ;
	
	public RaInformSubject() {
	}
	
	/**
	* 举报主题id
	*@return 
	*/
	public Integer getInform_subject_id(){
		return  inform_subject_id;
	}
	/**
	* 举报主题id
	*@param  inform_subject_id
	*/
	public void setInform_subject_id(Integer inform_subject_id ){
		this.inform_subject_id = inform_subject_id;
	}
	
	/**
	* 举报主题状态(1可用/2失效)
	*@return 
	*/
	public Integer getInform_subject_state(){
		return  inform_subject_state;
	}
	/**
	* 举报主题状态(1可用/2失效)
	*@param  inform_subject_state
	*/
	public void setInform_subject_state(Integer inform_subject_state ){
		this.inform_subject_state = inform_subject_state;
	}
	
	/**
	* 举报类型id
	*@return 
	*/
	public Integer getInform_subject_type_id(){
		return  inform_subject_type_id;
	}
	/**
	* 举报类型id
	*@param  inform_subject_type_id
	*/
	public void setInform_subject_type_id(Integer inform_subject_type_id ){
		this.inform_subject_type_id = inform_subject_type_id;
	}
	
	/**
	* 举报主题内容
	*@return 
	*/
	public String getInform_subject_content(){
		return  inform_subject_content;
	}
	/**
	* 举报主题内容
	*@param  inform_subject_content
	*/
	public void setInform_subject_content(String inform_subject_content ){
		this.inform_subject_content = inform_subject_content;
	}
	
	/**
	* 举报类型名称 
	*@return 
	*/
	public String getInform_subject_type_name(){
		return  inform_subject_type_name;
	}
	/**
	* 举报类型名称 
	*@param  inform_subject_type_name
	*/
	public void setInform_subject_type_name(String inform_subject_type_name ){
		this.inform_subject_type_name = inform_subject_type_name;
	}
	

}
