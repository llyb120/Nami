package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_waybill")
public class RaWaybill   {
	
	/*
	编号
	*/
	private Integer waybillId ;
	/*
	快递公司编号
	*/
	private Integer expressId ;
	/*
	店铺编号(0-代表系统模板)
	*/
	private Integer storeId ;
	/*
	高度
	*/
	private Integer waybillHeight ;
	/*
	左偏移量
	*/
	private Integer waybillLeft ;
	/*
	上偏移量
	*/
	private Integer waybillTop ;
	/*
	是否可用
	*/
	private Integer waybillUsable ;
	/*
	宽度
	*/
	private Integer waybillWidth ;
	/*
	快递公司名称
	*/
	private String expressName ;
	/*
	打印位置数据
	*/
	private String waybillData ;
	private String waybillImage ;
	private String waybillName ;
	
	public RaWaybill() {
	}
	
	/**
	* 编号
	*@return 
	*/
	public Integer getWaybillId(){
		return  waybillId;
	}
	/**
	* 编号
	*@param  waybillId
	*/
	public void setWaybillId(Integer waybillId ){
		this.waybillId = waybillId;
	}
	
	/**
	* 快递公司编号
	*@return 
	*/
	public Integer getExpressId(){
		return  expressId;
	}
	/**
	* 快递公司编号
	*@param  expressId
	*/
	public void setExpressId(Integer expressId ){
		this.expressId = expressId;
	}
	
	/**
	* 店铺编号(0-代表系统模板)
	*@return 
	*/
	public Integer getStoreId(){
		return  storeId;
	}
	/**
	* 店铺编号(0-代表系统模板)
	*@param  storeId
	*/
	public void setStoreId(Integer storeId ){
		this.storeId = storeId;
	}
	
	/**
	* 高度
	*@return 
	*/
	public Integer getWaybillHeight(){
		return  waybillHeight;
	}
	/**
	* 高度
	*@param  waybillHeight
	*/
	public void setWaybillHeight(Integer waybillHeight ){
		this.waybillHeight = waybillHeight;
	}
	
	/**
	* 左偏移量
	*@return 
	*/
	public Integer getWaybillLeft(){
		return  waybillLeft;
	}
	/**
	* 左偏移量
	*@param  waybillLeft
	*/
	public void setWaybillLeft(Integer waybillLeft ){
		this.waybillLeft = waybillLeft;
	}
	
	/**
	* 上偏移量
	*@return 
	*/
	public Integer getWaybillTop(){
		return  waybillTop;
	}
	/**
	* 上偏移量
	*@param  waybillTop
	*/
	public void setWaybillTop(Integer waybillTop ){
		this.waybillTop = waybillTop;
	}
	
	/**
	* 是否可用
	*@return 
	*/
	public Integer getWaybillUsable(){
		return  waybillUsable;
	}
	/**
	* 是否可用
	*@param  waybillUsable
	*/
	public void setWaybillUsable(Integer waybillUsable ){
		this.waybillUsable = waybillUsable;
	}
	
	/**
	* 宽度
	*@return 
	*/
	public Integer getWaybillWidth(){
		return  waybillWidth;
	}
	/**
	* 宽度
	*@param  waybillWidth
	*/
	public void setWaybillWidth(Integer waybillWidth ){
		this.waybillWidth = waybillWidth;
	}
	
	/**
	* 快递公司名称
	*@return 
	*/
	public String getExpressName(){
		return  expressName;
	}
	/**
	* 快递公司名称
	*@param  expressName
	*/
	public void setExpressName(String expressName ){
		this.expressName = expressName;
	}
	
	/**
	* 打印位置数据
	*@return 
	*/
	public String getWaybillData(){
		return  waybillData;
	}
	/**
	* 打印位置数据
	*@param  waybillData
	*/
	public void setWaybillData(String waybillData ){
		this.waybillData = waybillData;
	}
	
	public String getWaybillImage(){
		return  waybillImage;
	}
	public void setWaybillImage(String waybillImage ){
		this.waybillImage = waybillImage;
	}
	
	public String getWaybillName(){
		return  waybillName;
	}
	public void setWaybillName(String waybillName ){
		this.waybillName = waybillName;
	}
	

}
