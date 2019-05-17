package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_cron")
public class RaCron   {
	
	private Integer id ;
	/*
	关联任务的ID[如商品ID,会员ID]
	*/
	private Integer exeid ;
	/*
	执行时间
	*/
	private Integer exetime ;
	/*
	任务类型 1商品上架 2根据商品id更新商品促销价格 3优惠套装过期 4推荐展位过期 5团购开始更新商品促销价格 6团购过期 7限时折扣过期
	*/
	private Integer type ;
	
	public RaCron() {
	}
	
	public Integer getId(){
		return  id;
	}
	public void setId(Integer id ){
		this.id = id;
	}
	
	/**
	* 关联任务的ID[如商品ID,会员ID]
	*@return 
	*/
	public Integer getExeid(){
		return  exeid;
	}
	/**
	* 关联任务的ID[如商品ID,会员ID]
	*@param  exeid
	*/
	public void setExeid(Integer exeid ){
		this.exeid = exeid;
	}
	
	/**
	* 执行时间
	*@return 
	*/
	public Integer getExetime(){
		return  exetime;
	}
	/**
	* 执行时间
	*@param  exetime
	*/
	public void setExetime(Integer exetime ){
		this.exetime = exetime;
	}
	
	/**
	* 任务类型 1商品上架 2根据商品id更新商品促销价格 3优惠套装过期 4推荐展位过期 5团购开始更新商品促销价格 6团购过期 7限时折扣过期
	*@return 
	*/
	public Integer getType(){
		return  type;
	}
	/**
	* 任务类型 1商品上架 2根据商品id更新商品促销价格 3优惠套装过期 4推荐展位过期 5团购开始更新商品促销价格 6团购过期 7限时折扣过期
	*@param  type
	*/
	public void setType(Integer type ){
		this.type = type;
	}
	

}
