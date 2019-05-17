package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-15
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
	private Integer costId ;
	/*
	价格
	*/
	private Integer costPrice ;
	/*
	卖家编号
	*/
	private Integer costSellerId ;
	/*
	费用状态(0-未结算 1-已结算)
	*/
	private Integer costState ;
	/*
	店铺编号
	*/
	private Integer costStoreId ;
	/*
	费用发生时间
	*/
	private Integer costTime ;
	/*
	费用备注
	*/
	private String costRemark ;
	
	public RaStoreCost() {
	}
	
	/**
	* 费用编号
	*@return 
	*/
	public Integer getCostId(){
		return  costId;
	}
	/**
	* 费用编号
	*@param  costId
	*/
	public void setCostId(Integer costId ){
		this.costId = costId;
	}
	
	/**
	* 价格
	*@return 
	*/
	public Integer getCostPrice(){
		return  costPrice;
	}
	/**
	* 价格
	*@param  costPrice
	*/
	public void setCostPrice(Integer costPrice ){
		this.costPrice = costPrice;
	}
	
	/**
	* 卖家编号
	*@return 
	*/
	public Integer getCostSellerId(){
		return  costSellerId;
	}
	/**
	* 卖家编号
	*@param  costSellerId
	*/
	public void setCostSellerId(Integer costSellerId ){
		this.costSellerId = costSellerId;
	}
	
	/**
	* 费用状态(0-未结算 1-已结算)
	*@return 
	*/
	public Integer getCostState(){
		return  costState;
	}
	/**
	* 费用状态(0-未结算 1-已结算)
	*@param  costState
	*/
	public void setCostState(Integer costState ){
		this.costState = costState;
	}
	
	/**
	* 店铺编号
	*@return 
	*/
	public Integer getCostStoreId(){
		return  costStoreId;
	}
	/**
	* 店铺编号
	*@param  costStoreId
	*/
	public void setCostStoreId(Integer costStoreId ){
		this.costStoreId = costStoreId;
	}
	
	/**
	* 费用发生时间
	*@return 
	*/
	public Integer getCostTime(){
		return  costTime;
	}
	/**
	* 费用发生时间
	*@param  costTime
	*/
	public void setCostTime(Integer costTime ){
		this.costTime = costTime;
	}
	
	/**
	* 费用备注
	*@return 
	*/
	public String getCostRemark(){
		return  costRemark;
	}
	/**
	* 费用备注
	*@param  costRemark
	*/
	public void setCostRemark(String costRemark ){
		this.costRemark = costRemark;
	}
	

}
