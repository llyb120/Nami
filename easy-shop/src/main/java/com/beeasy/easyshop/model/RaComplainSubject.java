package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_complain_subject")
public class RaComplainSubject   {
	
	// alias
	public static final String ALIAS_complain_subject_id = "complain_subject_id";
	public static final String ALIAS_complain_subject_state = "complain_subject_state";
	public static final String ALIAS_complain_subject_content = "complain_subject_content";
	public static final String ALIAS_complain_subject_desc = "complain_subject_desc";
	
	/*
	投诉主题id
	*/
	private Integer complain_subject_id ;
	/*
	投诉主题状态(1-有效/2-失效)
	*/
	private Integer complain_subject_state ;
	/*
	投诉主题
	*/
	private String complain_subject_content ;
	/*
	投诉主题描述
	*/
	private String complain_subject_desc ;
	
	public RaComplainSubject() {
	}
	
	/**
	* 投诉主题id
	*@return 
	*/
	public Integer getComplain_subject_id(){
		return  complain_subject_id;
	}
	/**
	* 投诉主题id
	*@param  complain_subject_id
	*/
	public void setComplain_subject_id(Integer complain_subject_id ){
		this.complain_subject_id = complain_subject_id;
	}
	
	/**
	* 投诉主题状态(1-有效/2-失效)
	*@return 
	*/
	public Integer getComplain_subject_state(){
		return  complain_subject_state;
	}
	/**
	* 投诉主题状态(1-有效/2-失效)
	*@param  complain_subject_state
	*/
	public void setComplain_subject_state(Integer complain_subject_state ){
		this.complain_subject_state = complain_subject_state;
	}
	
	/**
	* 投诉主题
	*@return 
	*/
	public String getComplain_subject_content(){
		return  complain_subject_content;
	}
	/**
	* 投诉主题
	*@param  complain_subject_content
	*/
	public void setComplain_subject_content(String complain_subject_content ){
		this.complain_subject_content = complain_subject_content;
	}
	
	/**
	* 投诉主题描述
	*@return 
	*/
	public String getComplain_subject_desc(){
		return  complain_subject_desc;
	}
	/**
	* 投诉主题描述
	*@param  complain_subject_desc
	*/
	public void setComplain_subject_desc(String complain_subject_desc ){
		this.complain_subject_desc = complain_subject_desc;
	}
	

}
