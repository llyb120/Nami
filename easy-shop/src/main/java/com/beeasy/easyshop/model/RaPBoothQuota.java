package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_p_booth_quota")
public class RaPBoothQuota   {
	
	/*
	套餐id
	*/
	private Integer boothQuotaId ;
	/*
	结束时间
	*/
	private Integer boothQuotaEndtime ;
	/*
	开始时间
	*/
	private Integer boothQuotaStarttime ;
	/*
	套餐状态 1开启 0关闭 默认1
	*/
	private Integer boothState ;
	/*
	店铺id
	*/
	private Integer storeId ;
	/*
	店铺名称
	*/
	private String storeName ;
	
	public RaPBoothQuota() {
	}
	
	/**
	* 套餐id
	*@return 
	*/
	public Integer getBoothQuotaId(){
		return  boothQuotaId;
	}
	/**
	* 套餐id
	*@param  boothQuotaId
	*/
	public void setBoothQuotaId(Integer boothQuotaId ){
		this.boothQuotaId = boothQuotaId;
	}
	
	/**
	* 结束时间
	*@return 
	*/
	public Integer getBoothQuotaEndtime(){
		return  boothQuotaEndtime;
	}
	/**
	* 结束时间
	*@param  boothQuotaEndtime
	*/
	public void setBoothQuotaEndtime(Integer boothQuotaEndtime ){
		this.boothQuotaEndtime = boothQuotaEndtime;
	}
	
	/**
	* 开始时间
	*@return 
	*/
	public Integer getBoothQuotaStarttime(){
		return  boothQuotaStarttime;
	}
	/**
	* 开始时间
	*@param  boothQuotaStarttime
	*/
	public void setBoothQuotaStarttime(Integer boothQuotaStarttime ){
		this.boothQuotaStarttime = boothQuotaStarttime;
	}
	
	/**
	* 套餐状态 1开启 0关闭 默认1
	*@return 
	*/
	public Integer getBoothState(){
		return  boothState;
	}
	/**
	* 套餐状态 1开启 0关闭 默认1
	*@param  boothState
	*/
	public void setBoothState(Integer boothState ){
		this.boothState = boothState;
	}
	
	/**
	* 店铺id
	*@return 
	*/
	public Integer getStoreId(){
		return  storeId;
	}
	/**
	* 店铺id
	*@param  storeId
	*/
	public void setStoreId(Integer storeId ){
		this.storeId = storeId;
	}
	
	/**
	* 店铺名称
	*@return 
	*/
	public String getStoreName(){
		return  storeName;
	}
	/**
	* 店铺名称
	*@param  storeName
	*/
	public void setStoreName(String storeName ){
		this.storeName = storeName;
	}
	

}
