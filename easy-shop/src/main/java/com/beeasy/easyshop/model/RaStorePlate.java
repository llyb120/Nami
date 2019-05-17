package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_store_plate")
public class RaStorePlate   {
	
	/*
	关联板式id
	*/
	private Integer plateId ;
	/*
	关联板式位置 1顶部，0底部
	*/
	private Integer platePosition ;
	/*
	所属店铺id
	*/
	private Integer storeId ;
	/*
	关联板式内容
	*/
	private String plateContent ;
	/*
	关联板式名称
	*/
	private String plateName ;
	
	public RaStorePlate() {
	}
	
	/**
	* 关联板式id
	*@return 
	*/
	public Integer getPlateId(){
		return  plateId;
	}
	/**
	* 关联板式id
	*@param  plateId
	*/
	public void setPlateId(Integer plateId ){
		this.plateId = plateId;
	}
	
	/**
	* 关联板式位置 1顶部，0底部
	*@return 
	*/
	public Integer getPlatePosition(){
		return  platePosition;
	}
	/**
	* 关联板式位置 1顶部，0底部
	*@param  platePosition
	*/
	public void setPlatePosition(Integer platePosition ){
		this.platePosition = platePosition;
	}
	
	/**
	* 所属店铺id
	*@return 
	*/
	public Integer getStoreId(){
		return  storeId;
	}
	/**
	* 所属店铺id
	*@param  storeId
	*/
	public void setStoreId(Integer storeId ){
		this.storeId = storeId;
	}
	
	/**
	* 关联板式内容
	*@return 
	*/
	public String getPlateContent(){
		return  plateContent;
	}
	/**
	* 关联板式内容
	*@param  plateContent
	*/
	public void setPlateContent(String plateContent ){
		this.plateContent = plateContent;
	}
	
	/**
	* 关联板式名称
	*@return 
	*/
	public String getPlateName(){
		return  plateName;
	}
	/**
	* 关联板式名称
	*@param  plateName
	*/
	public void setPlateName(String plateName ){
		this.plateName = plateName;
	}
	

}
