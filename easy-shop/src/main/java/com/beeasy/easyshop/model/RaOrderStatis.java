package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_order_statis")
public class RaOrderStatis   {
	
	// alias
	public static final String ALIAS_os_id = "os_id";
	public static final String ALIAS_os_create_date = "os_create_date";
	public static final String ALIAS_os_end_date = "os_end_date";
	public static final String ALIAS_os_month = "os_month";
	public static final String ALIAS_os_start_date = "os_start_date";
	public static final String ALIAS_os_year = "os_year";
	public static final String ALIAS_os_commis_return_totals = "os_commis_return_totals";
	public static final String ALIAS_os_commis_totals = "os_commis_totals";
	public static final String ALIAS_os_order_return_totals = "os_order_return_totals";
	public static final String ALIAS_os_order_totals = "os_order_totals";
	public static final String ALIAS_os_result_totals = "os_result_totals";
	public static final String ALIAS_os_shipping_totals = "os_shipping_totals";
	public static final String ALIAS_os_store_cost_totals = "os_store_cost_totals";
	
	private Integer os_id ;
	/*
	创建记录日期
	*/
	private Integer os_create_date ;
	/*
	结束日期
	*/
	private Integer os_end_date ;
	/*
	统计编号(年月)
	*/
	private Integer os_month ;
	/*
	开始日期
	*/
	private Integer os_start_date ;
	/*
	年
	*/
	private Integer os_year ;
	/*
	退还佣金
	*/
	private BigDecimal os_commis_return_totals ;
	/*
	佣金金额
	*/
	private BigDecimal os_commis_totals ;
	/*
	退单金额
	*/
	private BigDecimal os_order_return_totals ;
	/*
	订单金额
	*/
	private BigDecimal os_order_totals ;
	/*
	本期应结
	*/
	private BigDecimal os_result_totals ;
	/*
	运费
	*/
	private BigDecimal os_shipping_totals ;
	/*
	店铺促销活动费用
	*/
	private BigDecimal os_store_cost_totals ;
	
	public RaOrderStatis() {
	}
	
	public Integer getOs_id(){
		return  os_id;
	}
	public void setOs_id(Integer os_id ){
		this.os_id = os_id;
	}
	
	/**
	* 创建记录日期
	*@return 
	*/
	public Integer getOs_create_date(){
		return  os_create_date;
	}
	/**
	* 创建记录日期
	*@param  os_create_date
	*/
	public void setOs_create_date(Integer os_create_date ){
		this.os_create_date = os_create_date;
	}
	
	/**
	* 结束日期
	*@return 
	*/
	public Integer getOs_end_date(){
		return  os_end_date;
	}
	/**
	* 结束日期
	*@param  os_end_date
	*/
	public void setOs_end_date(Integer os_end_date ){
		this.os_end_date = os_end_date;
	}
	
	/**
	* 统计编号(年月)
	*@return 
	*/
	public Integer getOs_month(){
		return  os_month;
	}
	/**
	* 统计编号(年月)
	*@param  os_month
	*/
	public void setOs_month(Integer os_month ){
		this.os_month = os_month;
	}
	
	/**
	* 开始日期
	*@return 
	*/
	public Integer getOs_start_date(){
		return  os_start_date;
	}
	/**
	* 开始日期
	*@param  os_start_date
	*/
	public void setOs_start_date(Integer os_start_date ){
		this.os_start_date = os_start_date;
	}
	
	/**
	* 年
	*@return 
	*/
	public Integer getOs_year(){
		return  os_year;
	}
	/**
	* 年
	*@param  os_year
	*/
	public void setOs_year(Integer os_year ){
		this.os_year = os_year;
	}
	
	/**
	* 退还佣金
	*@return 
	*/
	public BigDecimal getOs_commis_return_totals(){
		return  os_commis_return_totals;
	}
	/**
	* 退还佣金
	*@param  os_commis_return_totals
	*/
	public void setOs_commis_return_totals(BigDecimal os_commis_return_totals ){
		this.os_commis_return_totals = os_commis_return_totals;
	}
	
	/**
	* 佣金金额
	*@return 
	*/
	public BigDecimal getOs_commis_totals(){
		return  os_commis_totals;
	}
	/**
	* 佣金金额
	*@param  os_commis_totals
	*/
	public void setOs_commis_totals(BigDecimal os_commis_totals ){
		this.os_commis_totals = os_commis_totals;
	}
	
	/**
	* 退单金额
	*@return 
	*/
	public BigDecimal getOs_order_return_totals(){
		return  os_order_return_totals;
	}
	/**
	* 退单金额
	*@param  os_order_return_totals
	*/
	public void setOs_order_return_totals(BigDecimal os_order_return_totals ){
		this.os_order_return_totals = os_order_return_totals;
	}
	
	/**
	* 订单金额
	*@return 
	*/
	public BigDecimal getOs_order_totals(){
		return  os_order_totals;
	}
	/**
	* 订单金额
	*@param  os_order_totals
	*/
	public void setOs_order_totals(BigDecimal os_order_totals ){
		this.os_order_totals = os_order_totals;
	}
	
	/**
	* 本期应结
	*@return 
	*/
	public BigDecimal getOs_result_totals(){
		return  os_result_totals;
	}
	/**
	* 本期应结
	*@param  os_result_totals
	*/
	public void setOs_result_totals(BigDecimal os_result_totals ){
		this.os_result_totals = os_result_totals;
	}
	
	/**
	* 运费
	*@return 
	*/
	public BigDecimal getOs_shipping_totals(){
		return  os_shipping_totals;
	}
	/**
	* 运费
	*@param  os_shipping_totals
	*/
	public void setOs_shipping_totals(BigDecimal os_shipping_totals ){
		this.os_shipping_totals = os_shipping_totals;
	}
	
	/**
	* 店铺促销活动费用
	*@return 
	*/
	public BigDecimal getOs_store_cost_totals(){
		return  os_store_cost_totals;
	}
	/**
	* 店铺促销活动费用
	*@param  os_store_cost_totals
	*/
	public void setOs_store_cost_totals(BigDecimal os_store_cost_totals ){
		this.os_store_cost_totals = os_store_cost_totals;
	}
	

}
