package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_voucher")
public class RaVoucher   {
	
	// alias
	public static final String ALIAS_voucher_id = "voucher_id";
	public static final String ALIAS_voucher_active_date = "voucher_active_date";
	public static final String ALIAS_voucher_end_date = "voucher_end_date";
	public static final String ALIAS_voucher_order_id = "voucher_order_id";
	public static final String ALIAS_voucher_owner_id = "voucher_owner_id";
	public static final String ALIAS_voucher_price = "voucher_price";
	public static final String ALIAS_voucher_start_date = "voucher_start_date";
	public static final String ALIAS_voucher_state = "voucher_state";
	public static final String ALIAS_voucher_store_id = "voucher_store_id";
	public static final String ALIAS_voucher_t_id = "voucher_t_id";
	public static final String ALIAS_voucher_type = "voucher_type";
	public static final String ALIAS_voucher_code = "voucher_code";
	public static final String ALIAS_voucher_desc = "voucher_desc";
	public static final String ALIAS_voucher_limit = "voucher_limit";
	public static final String ALIAS_voucher_owner_name = "voucher_owner_name";
	public static final String ALIAS_voucher_title = "voucher_title";
	
	/*
	代金券编号
	*/
	private Integer voucher_id ;
	/*
	代金券发放日期
	*/
	private Integer voucher_active_date ;
	/*
	代金券有效期结束时间
	*/
	private Integer voucher_end_date ;
	/*
	使用该代金券的订单编号
	*/
	private Integer voucher_order_id ;
	/*
	代金券所有者id
	*/
	private Integer voucher_owner_id ;
	/*
	代金券面额
	*/
	private Integer voucher_price ;
	/*
	代金券有效期开始时间
	*/
	private Integer voucher_start_date ;
	/*
	代金券状态(1-未用,2-已用,3-过期,4-收回)
	*/
	private Integer voucher_state ;
	/*
	代金券的店铺id
	*/
	private Integer voucher_store_id ;
	/*
	代金券模版编号
	*/
	private Integer voucher_t_id ;
	/*
	代金券类别
	*/
	private Integer voucher_type ;
	/*
	代金券编码
	*/
	private String voucher_code ;
	/*
	代金券描述
	*/
	private String voucher_desc ;
	/*
	代金券使用时的订单限额
	*/
	private BigDecimal voucher_limit ;
	/*
	代金券所有者名称
	*/
	private String voucher_owner_name ;
	/*
	代金券标题
	*/
	private String voucher_title ;
	
	public RaVoucher() {
	}
	
	/**
	* 代金券编号
	*@return 
	*/
	public Integer getVoucher_id(){
		return  voucher_id;
	}
	/**
	* 代金券编号
	*@param  voucher_id
	*/
	public void setVoucher_id(Integer voucher_id ){
		this.voucher_id = voucher_id;
	}
	
	/**
	* 代金券发放日期
	*@return 
	*/
	public Integer getVoucher_active_date(){
		return  voucher_active_date;
	}
	/**
	* 代金券发放日期
	*@param  voucher_active_date
	*/
	public void setVoucher_active_date(Integer voucher_active_date ){
		this.voucher_active_date = voucher_active_date;
	}
	
	/**
	* 代金券有效期结束时间
	*@return 
	*/
	public Integer getVoucher_end_date(){
		return  voucher_end_date;
	}
	/**
	* 代金券有效期结束时间
	*@param  voucher_end_date
	*/
	public void setVoucher_end_date(Integer voucher_end_date ){
		this.voucher_end_date = voucher_end_date;
	}
	
	/**
	* 使用该代金券的订单编号
	*@return 
	*/
	public Integer getVoucher_order_id(){
		return  voucher_order_id;
	}
	/**
	* 使用该代金券的订单编号
	*@param  voucher_order_id
	*/
	public void setVoucher_order_id(Integer voucher_order_id ){
		this.voucher_order_id = voucher_order_id;
	}
	
	/**
	* 代金券所有者id
	*@return 
	*/
	public Integer getVoucher_owner_id(){
		return  voucher_owner_id;
	}
	/**
	* 代金券所有者id
	*@param  voucher_owner_id
	*/
	public void setVoucher_owner_id(Integer voucher_owner_id ){
		this.voucher_owner_id = voucher_owner_id;
	}
	
	/**
	* 代金券面额
	*@return 
	*/
	public Integer getVoucher_price(){
		return  voucher_price;
	}
	/**
	* 代金券面额
	*@param  voucher_price
	*/
	public void setVoucher_price(Integer voucher_price ){
		this.voucher_price = voucher_price;
	}
	
	/**
	* 代金券有效期开始时间
	*@return 
	*/
	public Integer getVoucher_start_date(){
		return  voucher_start_date;
	}
	/**
	* 代金券有效期开始时间
	*@param  voucher_start_date
	*/
	public void setVoucher_start_date(Integer voucher_start_date ){
		this.voucher_start_date = voucher_start_date;
	}
	
	/**
	* 代金券状态(1-未用,2-已用,3-过期,4-收回)
	*@return 
	*/
	public Integer getVoucher_state(){
		return  voucher_state;
	}
	/**
	* 代金券状态(1-未用,2-已用,3-过期,4-收回)
	*@param  voucher_state
	*/
	public void setVoucher_state(Integer voucher_state ){
		this.voucher_state = voucher_state;
	}
	
	/**
	* 代金券的店铺id
	*@return 
	*/
	public Integer getVoucher_store_id(){
		return  voucher_store_id;
	}
	/**
	* 代金券的店铺id
	*@param  voucher_store_id
	*/
	public void setVoucher_store_id(Integer voucher_store_id ){
		this.voucher_store_id = voucher_store_id;
	}
	
	/**
	* 代金券模版编号
	*@return 
	*/
	public Integer getVoucher_t_id(){
		return  voucher_t_id;
	}
	/**
	* 代金券模版编号
	*@param  voucher_t_id
	*/
	public void setVoucher_t_id(Integer voucher_t_id ){
		this.voucher_t_id = voucher_t_id;
	}
	
	/**
	* 代金券类别
	*@return 
	*/
	public Integer getVoucher_type(){
		return  voucher_type;
	}
	/**
	* 代金券类别
	*@param  voucher_type
	*/
	public void setVoucher_type(Integer voucher_type ){
		this.voucher_type = voucher_type;
	}
	
	/**
	* 代金券编码
	*@return 
	*/
	public String getVoucher_code(){
		return  voucher_code;
	}
	/**
	* 代金券编码
	*@param  voucher_code
	*/
	public void setVoucher_code(String voucher_code ){
		this.voucher_code = voucher_code;
	}
	
	/**
	* 代金券描述
	*@return 
	*/
	public String getVoucher_desc(){
		return  voucher_desc;
	}
	/**
	* 代金券描述
	*@param  voucher_desc
	*/
	public void setVoucher_desc(String voucher_desc ){
		this.voucher_desc = voucher_desc;
	}
	
	/**
	* 代金券使用时的订单限额
	*@return 
	*/
	public BigDecimal getVoucher_limit(){
		return  voucher_limit;
	}
	/**
	* 代金券使用时的订单限额
	*@param  voucher_limit
	*/
	public void setVoucher_limit(BigDecimal voucher_limit ){
		this.voucher_limit = voucher_limit;
	}
	
	/**
	* 代金券所有者名称
	*@return 
	*/
	public String getVoucher_owner_name(){
		return  voucher_owner_name;
	}
	/**
	* 代金券所有者名称
	*@param  voucher_owner_name
	*/
	public void setVoucher_owner_name(String voucher_owner_name ){
		this.voucher_owner_name = voucher_owner_name;
	}
	
	/**
	* 代金券标题
	*@return 
	*/
	public String getVoucher_title(){
		return  voucher_title;
	}
	/**
	* 代金券标题
	*@param  voucher_title
	*/
	public void setVoucher_title(String voucher_title ){
		this.voucher_title = voucher_title;
	}
	

}
