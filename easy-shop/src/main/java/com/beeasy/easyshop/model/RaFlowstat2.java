package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_flowstat_2")
public class RaFlowstat2   {
	
	// alias
	public static final String ALIAS_clicknum = "clicknum";
	public static final String ALIAS_goods_id = "goods_id";
	public static final String ALIAS_stattime = "stattime";
	public static final String ALIAS_store_id = "store_id";
	public static final String ALIAS_type = "type";
	
	/*
	访问量
	*/
	private Integer clicknum ;
	/*
	商品ID
	*/
	private Integer goods_id ;
	/*
	访问日期
	*/
	private Integer stattime ;
	/*
	店铺ID
	*/
	private Integer store_id ;
	/*
	类型
	*/
	private String type ;
	
	public RaFlowstat2() {
	}
	
	/**
	* 访问量
	*@return 
	*/
	public Integer getClicknum(){
		return  clicknum;
	}
	/**
	* 访问量
	*@param  clicknum
	*/
	public void setClicknum(Integer clicknum ){
		this.clicknum = clicknum;
	}
	
	/**
	* 商品ID
	*@return 
	*/
	public Integer getGoods_id(){
		return  goods_id;
	}
	/**
	* 商品ID
	*@param  goods_id
	*/
	public void setGoods_id(Integer goods_id ){
		this.goods_id = goods_id;
	}
	
	/**
	* 访问日期
	*@return 
	*/
	public Integer getStattime(){
		return  stattime;
	}
	/**
	* 访问日期
	*@param  stattime
	*/
	public void setStattime(Integer stattime ){
		this.stattime = stattime;
	}
	
	/**
	* 店铺ID
	*@return 
	*/
	public Integer getStore_id(){
		return  store_id;
	}
	/**
	* 店铺ID
	*@param  store_id
	*/
	public void setStore_id(Integer store_id ){
		this.store_id = store_id;
	}
	
	/**
	* 类型
	*@return 
	*/
	public String getType(){
		return  type;
	}
	/**
	* 类型
	*@param  type
	*/
	public void setType(String type ){
		this.type = type;
	}
	

}
