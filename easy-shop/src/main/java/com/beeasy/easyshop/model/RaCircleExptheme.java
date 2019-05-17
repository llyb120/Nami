package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_circle_exptheme")
public class RaCircleExptheme   {
	
	// alias
	public static final String ALIAS_theme_id = "theme_id";
	public static final String ALIAS_et_exp = "et_exp";
	public static final String ALIAS_et_time = "et_time";
	
	/*
	主题id
	*/
	private Integer theme_id ;
	/*
	获得经验
	*/
	private Integer et_exp ;
	/*
	获得时间
	*/
	private String et_time ;
	
	public RaCircleExptheme() {
	}
	
	/**
	* 主题id
	*@return 
	*/
	public Integer getTheme_id(){
		return  theme_id;
	}
	/**
	* 主题id
	*@param  theme_id
	*/
	public void setTheme_id(Integer theme_id ){
		this.theme_id = theme_id;
	}
	
	/**
	* 获得经验
	*@return 
	*/
	public Integer getEt_exp(){
		return  et_exp;
	}
	/**
	* 获得经验
	*@param  et_exp
	*/
	public void setEt_exp(Integer et_exp ){
		this.et_exp = et_exp;
	}
	
	/**
	* 获得时间
	*@return 
	*/
	public String getEt_time(){
		return  et_time;
	}
	/**
	* 获得时间
	*@param  et_time
	*/
	public void setEt_time(String et_time ){
		this.et_time = et_time;
	}
	

}
