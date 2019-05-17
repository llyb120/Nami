package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_vr_order_bill")
public class RaVrOrderBill   {
	
	// alias
	public static final String ALIAS_ob_no = "ob_no";
	public static final String ALIAS_ob_create_date = "ob_create_date";
	public static final String ALIAS_ob_end_date = "ob_end_date";
	public static final String ALIAS_ob_pay_date = "ob_pay_date";
	public static final String ALIAS_ob_start_date = "ob_start_date";
	public static final String ALIAS_ob_store_id = "ob_store_id";
	public static final String ALIAS_os_month = "os_month";
	public static final String ALIAS_ob_commis_totals = "ob_commis_totals";
	public static final String ALIAS_ob_order_totals = "ob_order_totals";
	public static final String ALIAS_ob_pay_content = "ob_pay_content";
	public static final String ALIAS_ob_result_totals = "ob_result_totals";
	public static final String ALIAS_ob_state = "ob_state";
	public static final String ALIAS_ob_store_name = "ob_store_name";
	
	/*
	结算单编号(年月店铺ID)
	*/
	private Integer ob_no ;
	/*
	生成结算单日期
	*/
	private Integer ob_create_date ;
	/*
	结束日期
	*/
	private Integer ob_end_date ;
	/*
	付款日期
	*/
	private Integer ob_pay_date ;
	/*
	开始日期
	*/
	private Integer ob_start_date ;
	/*
	店铺ID
	*/
	private Integer ob_store_id ;
	/*
	结算单年月份
	*/
	private Integer os_month ;
	/*
	佣金金额
	*/
	private BigDecimal ob_commis_totals ;
	/*
	订单金额
	*/
	private BigDecimal ob_order_totals ;
	/*
	支付备注
	*/
	private String ob_pay_content ;
	/*
	应结金额
	*/
	private BigDecimal ob_result_totals ;
	/*
	1默认2店家已确认3平台已审核4结算完成
	*/
	private String ob_state ;
	/*
	店铺名
	*/
	private String ob_store_name ;
	
	public RaVrOrderBill() {
	}
	
	/**
	* 结算单编号(年月店铺ID)
	*@return 
	*/
	public Integer getOb_no(){
		return  ob_no;
	}
	/**
	* 结算单编号(年月店铺ID)
	*@param  ob_no
	*/
	public void setOb_no(Integer ob_no ){
		this.ob_no = ob_no;
	}
	
	/**
	* 生成结算单日期
	*@return 
	*/
	public Integer getOb_create_date(){
		return  ob_create_date;
	}
	/**
	* 生成结算单日期
	*@param  ob_create_date
	*/
	public void setOb_create_date(Integer ob_create_date ){
		this.ob_create_date = ob_create_date;
	}
	
	/**
	* 结束日期
	*@return 
	*/
	public Integer getOb_end_date(){
		return  ob_end_date;
	}
	/**
	* 结束日期
	*@param  ob_end_date
	*/
	public void setOb_end_date(Integer ob_end_date ){
		this.ob_end_date = ob_end_date;
	}
	
	/**
	* 付款日期
	*@return 
	*/
	public Integer getOb_pay_date(){
		return  ob_pay_date;
	}
	/**
	* 付款日期
	*@param  ob_pay_date
	*/
	public void setOb_pay_date(Integer ob_pay_date ){
		this.ob_pay_date = ob_pay_date;
	}
	
	/**
	* 开始日期
	*@return 
	*/
	public Integer getOb_start_date(){
		return  ob_start_date;
	}
	/**
	* 开始日期
	*@param  ob_start_date
	*/
	public void setOb_start_date(Integer ob_start_date ){
		this.ob_start_date = ob_start_date;
	}
	
	/**
	* 店铺ID
	*@return 
	*/
	public Integer getOb_store_id(){
		return  ob_store_id;
	}
	/**
	* 店铺ID
	*@param  ob_store_id
	*/
	public void setOb_store_id(Integer ob_store_id ){
		this.ob_store_id = ob_store_id;
	}
	
	/**
	* 结算单年月份
	*@return 
	*/
	public Integer getOs_month(){
		return  os_month;
	}
	/**
	* 结算单年月份
	*@param  os_month
	*/
	public void setOs_month(Integer os_month ){
		this.os_month = os_month;
	}
	
	/**
	* 佣金金额
	*@return 
	*/
	public BigDecimal getOb_commis_totals(){
		return  ob_commis_totals;
	}
	/**
	* 佣金金额
	*@param  ob_commis_totals
	*/
	public void setOb_commis_totals(BigDecimal ob_commis_totals ){
		this.ob_commis_totals = ob_commis_totals;
	}
	
	/**
	* 订单金额
	*@return 
	*/
	public BigDecimal getOb_order_totals(){
		return  ob_order_totals;
	}
	/**
	* 订单金额
	*@param  ob_order_totals
	*/
	public void setOb_order_totals(BigDecimal ob_order_totals ){
		this.ob_order_totals = ob_order_totals;
	}
	
	/**
	* 支付备注
	*@return 
	*/
	public String getOb_pay_content(){
		return  ob_pay_content;
	}
	/**
	* 支付备注
	*@param  ob_pay_content
	*/
	public void setOb_pay_content(String ob_pay_content ){
		this.ob_pay_content = ob_pay_content;
	}
	
	/**
	* 应结金额
	*@return 
	*/
	public BigDecimal getOb_result_totals(){
		return  ob_result_totals;
	}
	/**
	* 应结金额
	*@param  ob_result_totals
	*/
	public void setOb_result_totals(BigDecimal ob_result_totals ){
		this.ob_result_totals = ob_result_totals;
	}
	
	/**
	* 1默认2店家已确认3平台已审核4结算完成
	*@return 
	*/
	public String getOb_state(){
		return  ob_state;
	}
	/**
	* 1默认2店家已确认3平台已审核4结算完成
	*@param  ob_state
	*/
	public void setOb_state(String ob_state ){
		this.ob_state = ob_state;
	}
	
	/**
	* 店铺名
	*@return 
	*/
	public String getOb_store_name(){
		return  ob_store_name;
	}
	/**
	* 店铺名
	*@param  ob_store_name
	*/
	public void setOb_store_name(String ob_store_name ){
		this.ob_store_name = ob_store_name;
	}
	

}
