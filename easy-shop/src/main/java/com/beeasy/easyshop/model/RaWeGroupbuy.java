package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_we_groupbuy")
public class RaWeGroupbuy   {
	
	private Integer id ;
	private Integer goodsId ;
	private Integer maxPerson ;
	private Integer minCount ;
	private Integer status ;
	/*
	促销商品可供应的总数量
	*/
	private Integer stock ;
	private Integer storeId ;
	private String activityName ;
	/*
	佣金比例
	*/
	private BigDecimal brokerage ;
	private String content ;
	private String endTime ;
	private BigDecimal price ;
	private String startTime ;
	
	public RaWeGroupbuy() {
	}
	
	public Integer getId(){
		return  id;
	}
	public void setId(Integer id ){
		this.id = id;
	}
	
	public Integer getGoodsId(){
		return  goodsId;
	}
	public void setGoodsId(Integer goodsId ){
		this.goodsId = goodsId;
	}
	
	public Integer getMaxPerson(){
		return  maxPerson;
	}
	public void setMaxPerson(Integer maxPerson ){
		this.maxPerson = maxPerson;
	}
	
	public Integer getMinCount(){
		return  minCount;
	}
	public void setMinCount(Integer minCount ){
		this.minCount = minCount;
	}
	
	public Integer getStatus(){
		return  status;
	}
	public void setStatus(Integer status ){
		this.status = status;
	}
	
	/**
	* 促销商品可供应的总数量
	*@return 
	*/
	public Integer getStock(){
		return  stock;
	}
	/**
	* 促销商品可供应的总数量
	*@param  stock
	*/
	public void setStock(Integer stock ){
		this.stock = stock;
	}
	
	public Integer getStoreId(){
		return  storeId;
	}
	public void setStoreId(Integer storeId ){
		this.storeId = storeId;
	}
	
	public String getActivityName(){
		return  activityName;
	}
	public void setActivityName(String activityName ){
		this.activityName = activityName;
	}
	
	/**
	* 佣金比例
	*@return 
	*/
	public BigDecimal getBrokerage(){
		return  brokerage;
	}
	/**
	* 佣金比例
	*@param  brokerage
	*/
	public void setBrokerage(BigDecimal brokerage ){
		this.brokerage = brokerage;
	}
	
	public String getContent(){
		return  content;
	}
	public void setContent(String content ){
		this.content = content;
	}
	
	public String getEndTime(){
		return  endTime;
	}
	public void setEndTime(String endTime ){
		this.endTime = endTime;
	}
	
	public BigDecimal getPrice(){
		return  price;
	}
	public void setPrice(BigDecimal price ){
		this.price = price;
	}
	
	public String getStartTime(){
		return  startTime;
	}
	public void setStartTime(String startTime ){
		this.startTime = startTime;
	}
	

}
