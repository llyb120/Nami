package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_circle_exptheme")
public class RaCircleExptheme   {
	
	/*
	主题id
	*/
	private Integer themeId ;
	/*
	获得经验
	*/
	private Integer etExp ;
	/*
	获得时间
	*/
	private String etTime ;
	
	public RaCircleExptheme() {
	}
	
	/**
	* 主题id
	*@return 
	*/
	public Integer getThemeId(){
		return  themeId;
	}
	/**
	* 主题id
	*@param  themeId
	*/
	public void setThemeId(Integer themeId ){
		this.themeId = themeId;
	}
	
	/**
	* 获得经验
	*@return 
	*/
	public Integer getEtExp(){
		return  etExp;
	}
	/**
	* 获得经验
	*@param  etExp
	*/
	public void setEtExp(Integer etExp ){
		this.etExp = etExp;
	}
	
	/**
	* 获得时间
	*@return 
	*/
	public String getEtTime(){
		return  etTime;
	}
	/**
	* 获得时间
	*@param  etTime
	*/
	public void setEtTime(String etTime ){
		this.etTime = etTime;
	}
	

}
