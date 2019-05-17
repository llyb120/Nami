package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_p_booth_quota")
public class RaPBoothQuota   {
	
	// alias
	public static final String ALIAS_booth_quota_id = "booth_quota_id";
	public static final String ALIAS_booth_quota_endtime = "booth_quota_endtime";
	public static final String ALIAS_booth_quota_starttime = "booth_quota_starttime";
	public static final String ALIAS_booth_state = "booth_state";
	public static final String ALIAS_store_id = "store_id";
	public static final String ALIAS_store_name = "store_name";
	
	/*
	套餐id
	*/
	private Integer booth_quota_id ;
	/*
	结束时间
	*/
	private Integer booth_quota_endtime ;
	/*
	开始时间
	*/
	private Integer booth_quota_starttime ;
	/*
	套餐状态 1开启 0关闭 默认1
	*/
	private Integer booth_state ;
	/*
	店铺id
	*/
	private Integer store_id ;
	/*
	店铺名称
	*/
	private String store_name ;
	
	public RaPBoothQuota() {
	}
	
	/**
	* 套餐id
	*@return 
	*/
	public Integer getBooth_quota_id(){
		return  booth_quota_id;
	}
	/**
	* 套餐id
	*@param  booth_quota_id
	*/
	public void setBooth_quota_id(Integer booth_quota_id ){
		this.booth_quota_id = booth_quota_id;
	}
	
	/**
	* 结束时间
	*@return 
	*/
	public Integer getBooth_quota_endtime(){
		return  booth_quota_endtime;
	}
	/**
	* 结束时间
	*@param  booth_quota_endtime
	*/
	public void setBooth_quota_endtime(Integer booth_quota_endtime ){
		this.booth_quota_endtime = booth_quota_endtime;
	}
	
	/**
	* 开始时间
	*@return 
	*/
	public Integer getBooth_quota_starttime(){
		return  booth_quota_starttime;
	}
	/**
	* 开始时间
	*@param  booth_quota_starttime
	*/
	public void setBooth_quota_starttime(Integer booth_quota_starttime ){
		this.booth_quota_starttime = booth_quota_starttime;
	}
	
	/**
	* 套餐状态 1开启 0关闭 默认1
	*@return 
	*/
	public Integer getBooth_state(){
		return  booth_state;
	}
	/**
	* 套餐状态 1开启 0关闭 默认1
	*@param  booth_state
	*/
	public void setBooth_state(Integer booth_state ){
		this.booth_state = booth_state;
	}
	
	/**
	* 店铺id
	*@return 
	*/
	public Integer getStore_id(){
		return  store_id;
	}
	/**
	* 店铺id
	*@param  store_id
	*/
	public void setStore_id(Integer store_id ){
		this.store_id = store_id;
	}
	
	/**
	* 店铺名称
	*@return 
	*/
	public String getStore_name(){
		return  store_name;
	}
	/**
	* 店铺名称
	*@param  store_name
	*/
	public void setStore_name(String store_name ){
		this.store_name = store_name;
	}
	

}
