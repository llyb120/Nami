package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_vr_order_bill")
public class RaVrOrderBill   {
	
	/*
	结算单编号(年月店铺ID)
	*/
	private Integer obNo ;
	/*
	生成结算单日期
	*/
	private Integer obCreateDate ;
	/*
	结束日期
	*/
	private Integer obEndDate ;
	/*
	付款日期
	*/
	private Integer obPayDate ;
	/*
	开始日期
	*/
	private Integer obStartDate ;
	/*
	店铺ID
	*/
	private Integer obStoreId ;
	/*
	结算单年月份
	*/
	private Integer osMonth ;
	/*
	佣金金额
	*/
	private BigDecimal obCommisTotals ;
	/*
	订单金额
	*/
	private BigDecimal obOrderTotals ;
	/*
	支付备注
	*/
	private String obPayContent ;
	/*
	应结金额
	*/
	private BigDecimal obResultTotals ;
	/*
	1默认2店家已确认3平台已审核4结算完成
	*/
	private String obState ;
	/*
	店铺名
	*/
	private String obStoreName ;
	
	public RaVrOrderBill() {
	}
	
	/**
	* 结算单编号(年月店铺ID)
	*@return 
	*/
	public Integer getObNo(){
		return  obNo;
	}
	/**
	* 结算单编号(年月店铺ID)
	*@param  obNo
	*/
	public void setObNo(Integer obNo ){
		this.obNo = obNo;
	}
	
	/**
	* 生成结算单日期
	*@return 
	*/
	public Integer getObCreateDate(){
		return  obCreateDate;
	}
	/**
	* 生成结算单日期
	*@param  obCreateDate
	*/
	public void setObCreateDate(Integer obCreateDate ){
		this.obCreateDate = obCreateDate;
	}
	
	/**
	* 结束日期
	*@return 
	*/
	public Integer getObEndDate(){
		return  obEndDate;
	}
	/**
	* 结束日期
	*@param  obEndDate
	*/
	public void setObEndDate(Integer obEndDate ){
		this.obEndDate = obEndDate;
	}
	
	/**
	* 付款日期
	*@return 
	*/
	public Integer getObPayDate(){
		return  obPayDate;
	}
	/**
	* 付款日期
	*@param  obPayDate
	*/
	public void setObPayDate(Integer obPayDate ){
		this.obPayDate = obPayDate;
	}
	
	/**
	* 开始日期
	*@return 
	*/
	public Integer getObStartDate(){
		return  obStartDate;
	}
	/**
	* 开始日期
	*@param  obStartDate
	*/
	public void setObStartDate(Integer obStartDate ){
		this.obStartDate = obStartDate;
	}
	
	/**
	* 店铺ID
	*@return 
	*/
	public Integer getObStoreId(){
		return  obStoreId;
	}
	/**
	* 店铺ID
	*@param  obStoreId
	*/
	public void setObStoreId(Integer obStoreId ){
		this.obStoreId = obStoreId;
	}
	
	/**
	* 结算单年月份
	*@return 
	*/
	public Integer getOsMonth(){
		return  osMonth;
	}
	/**
	* 结算单年月份
	*@param  osMonth
	*/
	public void setOsMonth(Integer osMonth ){
		this.osMonth = osMonth;
	}
	
	/**
	* 佣金金额
	*@return 
	*/
	public BigDecimal getObCommisTotals(){
		return  obCommisTotals;
	}
	/**
	* 佣金金额
	*@param  obCommisTotals
	*/
	public void setObCommisTotals(BigDecimal obCommisTotals ){
		this.obCommisTotals = obCommisTotals;
	}
	
	/**
	* 订单金额
	*@return 
	*/
	public BigDecimal getObOrderTotals(){
		return  obOrderTotals;
	}
	/**
	* 订单金额
	*@param  obOrderTotals
	*/
	public void setObOrderTotals(BigDecimal obOrderTotals ){
		this.obOrderTotals = obOrderTotals;
	}
	
	/**
	* 支付备注
	*@return 
	*/
	public String getObPayContent(){
		return  obPayContent;
	}
	/**
	* 支付备注
	*@param  obPayContent
	*/
	public void setObPayContent(String obPayContent ){
		this.obPayContent = obPayContent;
	}
	
	/**
	* 应结金额
	*@return 
	*/
	public BigDecimal getObResultTotals(){
		return  obResultTotals;
	}
	/**
	* 应结金额
	*@param  obResultTotals
	*/
	public void setObResultTotals(BigDecimal obResultTotals ){
		this.obResultTotals = obResultTotals;
	}
	
	/**
	* 1默认2店家已确认3平台已审核4结算完成
	*@return 
	*/
	public String getObState(){
		return  obState;
	}
	/**
	* 1默认2店家已确认3平台已审核4结算完成
	*@param  obState
	*/
	public void setObState(String obState ){
		this.obState = obState;
	}
	
	/**
	* 店铺名
	*@return 
	*/
	public String getObStoreName(){
		return  obStoreName;
	}
	/**
	* 店铺名
	*@param  obStoreName
	*/
	public void setObStoreName(String obStoreName ){
		this.obStoreName = obStoreName;
	}
	

}
