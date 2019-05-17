package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_groupbuy_price_range")
public class RaGroupbuyPriceRange   {
	
	// alias
	public static final String ALIAS_range_id = "range_id";
	public static final String ALIAS_range_end = "range_end";
	public static final String ALIAS_range_start = "range_start";
	public static final String ALIAS_range_name = "range_name";
	
	/*
	价格区间编号
	*/
	private Integer range_id ;
	/*
	区间上限
	*/
	private Integer range_end ;
	/*
	区间下限
	*/
	private Integer range_start ;
	/*
	区间名称
	*/
	private String range_name ;
	
	public RaGroupbuyPriceRange() {
	}
	
	/**
	* 价格区间编号
	*@return 
	*/
	public Integer getRange_id(){
		return  range_id;
	}
	/**
	* 价格区间编号
	*@param  range_id
	*/
	public void setRange_id(Integer range_id ){
		this.range_id = range_id;
	}
	
	/**
	* 区间上限
	*@return 
	*/
	public Integer getRange_end(){
		return  range_end;
	}
	/**
	* 区间上限
	*@param  range_end
	*/
	public void setRange_end(Integer range_end ){
		this.range_end = range_end;
	}
	
	/**
	* 区间下限
	*@return 
	*/
	public Integer getRange_start(){
		return  range_start;
	}
	/**
	* 区间下限
	*@param  range_start
	*/
	public void setRange_start(Integer range_start ){
		this.range_start = range_start;
	}
	
	/**
	* 区间名称
	*@return 
	*/
	public String getRange_name(){
		return  range_name;
	}
	/**
	* 区间名称
	*@param  range_name
	*/
	public void setRange_name(String range_name ){
		this.range_name = range_name;
	}
	

}
