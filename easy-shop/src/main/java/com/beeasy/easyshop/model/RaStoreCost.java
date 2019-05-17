package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_store_cost")
public class RaStoreCost   {
	
	// alias
	public static final String ALIAS_cost_id = "cost_id";
	public static final String ALIAS_cost_price = "cost_price";
	public static final String ALIAS_cost_seller_id = "cost_seller_id";
	public static final String ALIAS_cost_state = "cost_state";
	public static final String ALIAS_cost_store_id = "cost_store_id";
	public static final String ALIAS_cost_time = "cost_time";
	public static final String ALIAS_cost_remark = "cost_remark";
	
	/*
	费用编号
	*/
	private Integer cost_id ;
	/*
	价格
	*/
	private Integer cost_price ;
	/*
	卖家编号
	*/
	private Integer cost_seller_id ;
	/*
	费用状态(0-未结算 1-已结算)
	*/
	private Integer cost_state ;
	/*
	店铺编号
	*/
	private Integer cost_store_id ;
	/*
	费用发生时间
	*/
	private Integer cost_time ;
	/*
	费用备注
	*/
	private String cost_remark ;
	
	public RaStoreCost() {
	}
	
	/**
	* 费用编号
	*@return 
	*/
	public Integer getCost_id(){
		return  cost_id;
	}
	/**
	* 费用编号
	*@param  cost_id
	*/
	public void setCost_id(Integer cost_id ){
		this.cost_id = cost_id;
	}
	
	/**
	* 价格
	*@return 
	*/
	public Integer getCost_price(){
		return  cost_price;
	}
	/**
	* 价格
	*@param  cost_price
	*/
	public void setCost_price(Integer cost_price ){
		this.cost_price = cost_price;
	}
	
	/**
	* 卖家编号
	*@return 
	*/
	public Integer getCost_seller_id(){
		return  cost_seller_id;
	}
	/**
	* 卖家编号
	*@param  cost_seller_id
	*/
	public void setCost_seller_id(Integer cost_seller_id ){
		this.cost_seller_id = cost_seller_id;
	}
	
	/**
	* 费用状态(0-未结算 1-已结算)
	*@return 
	*/
	public Integer getCost_state(){
		return  cost_state;
	}
	/**
	* 费用状态(0-未结算 1-已结算)
	*@param  cost_state
	*/
	public void setCost_state(Integer cost_state ){
		this.cost_state = cost_state;
	}
	
	/**
	* 店铺编号
	*@return 
	*/
	public Integer getCost_store_id(){
		return  cost_store_id;
	}
	/**
	* 店铺编号
	*@param  cost_store_id
	*/
	public void setCost_store_id(Integer cost_store_id ){
		this.cost_store_id = cost_store_id;
	}
	
	/**
	* 费用发生时间
	*@return 
	*/
	public Integer getCost_time(){
		return  cost_time;
	}
	/**
	* 费用发生时间
	*@param  cost_time
	*/
	public void setCost_time(Integer cost_time ){
		this.cost_time = cost_time;
	}
	
	/**
	* 费用备注
	*@return 
	*/
	public String getCost_remark(){
		return  cost_remark;
	}
	/**
	* 费用备注
	*@param  cost_remark
	*/
	public void setCost_remark(String cost_remark ){
		this.cost_remark = cost_remark;
	}
	

}
