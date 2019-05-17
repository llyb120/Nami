package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_vr_order_statis")
public class RaVrOrderStatis   {
	
	/*
	统计编号(年月)
	*/
	private Integer osMonth ;
	/*
	创建记录日期
	*/
	private Integer osCreateDate ;
	/*
	结束日期
	*/
	private Integer osEndDate ;
	/*
	开始日期
	*/
	private Integer osStartDate ;
	/*
	年
	*/
	private Integer osYear ;
	/*
	佣金金额
	*/
	private BigDecimal osCommisTotals ;
	/*
	订单金额
	*/
	private BigDecimal osOrderTotals ;
	/*
	本期应结
	*/
	private BigDecimal osResultTotals ;
	
	public RaVrOrderStatis() {
	}
	
	/**
	* 统计编号(年月)
	*@return 
	*/
	public Integer getOsMonth(){
		return  osMonth;
	}
	/**
	* 统计编号(年月)
	*@param  osMonth
	*/
	public void setOsMonth(Integer osMonth ){
		this.osMonth = osMonth;
	}
	
	/**
	* 创建记录日期
	*@return 
	*/
	public Integer getOsCreateDate(){
		return  osCreateDate;
	}
	/**
	* 创建记录日期
	*@param  osCreateDate
	*/
	public void setOsCreateDate(Integer osCreateDate ){
		this.osCreateDate = osCreateDate;
	}
	
	/**
	* 结束日期
	*@return 
	*/
	public Integer getOsEndDate(){
		return  osEndDate;
	}
	/**
	* 结束日期
	*@param  osEndDate
	*/
	public void setOsEndDate(Integer osEndDate ){
		this.osEndDate = osEndDate;
	}
	
	/**
	* 开始日期
	*@return 
	*/
	public Integer getOsStartDate(){
		return  osStartDate;
	}
	/**
	* 开始日期
	*@param  osStartDate
	*/
	public void setOsStartDate(Integer osStartDate ){
		this.osStartDate = osStartDate;
	}
	
	/**
	* 年
	*@return 
	*/
	public Integer getOsYear(){
		return  osYear;
	}
	/**
	* 年
	*@param  osYear
	*/
	public void setOsYear(Integer osYear ){
		this.osYear = osYear;
	}
	
	/**
	* 佣金金额
	*@return 
	*/
	public BigDecimal getOsCommisTotals(){
		return  osCommisTotals;
	}
	/**
	* 佣金金额
	*@param  osCommisTotals
	*/
	public void setOsCommisTotals(BigDecimal osCommisTotals ){
		this.osCommisTotals = osCommisTotals;
	}
	
	/**
	* 订单金额
	*@return 
	*/
	public BigDecimal getOsOrderTotals(){
		return  osOrderTotals;
	}
	/**
	* 订单金额
	*@param  osOrderTotals
	*/
	public void setOsOrderTotals(BigDecimal osOrderTotals ){
		this.osOrderTotals = osOrderTotals;
	}
	
	/**
	* 本期应结
	*@return 
	*/
	public BigDecimal getOsResultTotals(){
		return  osResultTotals;
	}
	/**
	* 本期应结
	*@param  osResultTotals
	*/
	public void setOsResultTotals(BigDecimal osResultTotals ){
		this.osResultTotals = osResultTotals;
	}
	

}
