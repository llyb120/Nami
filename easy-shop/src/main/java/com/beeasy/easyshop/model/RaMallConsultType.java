package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_mall_consult_type")
public class RaMallConsultType   {
	
	// alias
	public static final String ALIAS_mct_id = "mct_id";
	public static final String ALIAS_mct_sort = "mct_sort";
	public static final String ALIAS_mct_introduce = "mct_introduce";
	public static final String ALIAS_mct_name = "mct_name";
	
	/*
	平台客服咨询类型id
	*/
	private Integer mct_id ;
	/*
	咨询类型排序
	*/
	private Integer mct_sort ;
	/*
	平台客服咨询类型备注
	*/
	private String mct_introduce ;
	/*
	咨询类型名称
	*/
	private String mct_name ;
	
	public RaMallConsultType() {
	}
	
	/**
	* 平台客服咨询类型id
	*@return 
	*/
	public Integer getMct_id(){
		return  mct_id;
	}
	/**
	* 平台客服咨询类型id
	*@param  mct_id
	*/
	public void setMct_id(Integer mct_id ){
		this.mct_id = mct_id;
	}
	
	/**
	* 咨询类型排序
	*@return 
	*/
	public Integer getMct_sort(){
		return  mct_sort;
	}
	/**
	* 咨询类型排序
	*@param  mct_sort
	*/
	public void setMct_sort(Integer mct_sort ){
		this.mct_sort = mct_sort;
	}
	
	/**
	* 平台客服咨询类型备注
	*@return 
	*/
	public String getMct_introduce(){
		return  mct_introduce;
	}
	/**
	* 平台客服咨询类型备注
	*@param  mct_introduce
	*/
	public void setMct_introduce(String mct_introduce ){
		this.mct_introduce = mct_introduce;
	}
	
	/**
	* 咨询类型名称
	*@return 
	*/
	public String getMct_name(){
		return  mct_name;
	}
	/**
	* 咨询类型名称
	*@param  mct_name
	*/
	public void setMct_name(String mct_name ){
		this.mct_name = mct_name;
	}
	

}
