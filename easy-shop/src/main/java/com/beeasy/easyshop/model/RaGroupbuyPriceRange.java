package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_groupbuy_price_range")
public class RaGroupbuyPriceRange   {
	
	/*
	价格区间编号
	*/
	private Integer rangeId ;
	/*
	区间上限
	*/
	private Integer rangeEnd ;
	/*
	区间下限
	*/
	private Integer rangeStart ;
	/*
	区间名称
	*/
	private String rangeName ;
	
	public RaGroupbuyPriceRange() {
	}
	
	/**
	* 价格区间编号
	*@return 
	*/
	public Integer getRangeId(){
		return  rangeId;
	}
	/**
	* 价格区间编号
	*@param  rangeId
	*/
	public void setRangeId(Integer rangeId ){
		this.rangeId = rangeId;
	}
	
	/**
	* 区间上限
	*@return 
	*/
	public Integer getRangeEnd(){
		return  rangeEnd;
	}
	/**
	* 区间上限
	*@param  rangeEnd
	*/
	public void setRangeEnd(Integer rangeEnd ){
		this.rangeEnd = rangeEnd;
	}
	
	/**
	* 区间下限
	*@return 
	*/
	public Integer getRangeStart(){
		return  rangeStart;
	}
	/**
	* 区间下限
	*@param  rangeStart
	*/
	public void setRangeStart(Integer rangeStart ){
		this.rangeStart = rangeStart;
	}
	
	/**
	* 区间名称
	*@return 
	*/
	public String getRangeName(){
		return  rangeName;
	}
	/**
	* 区间名称
	*@param  rangeName
	*/
	public void setRangeName(String rangeName ){
		this.rangeName = rangeName;
	}
	

}
