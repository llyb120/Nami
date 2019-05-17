package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_store_watermark")
public class RaStoreWatermark   {
	
	/*
	水印id
	*/
	private Integer wmId ;
	/*
	jpeg图片质量
	*/
	private Integer jpegQuality ;
	/*
	店铺id
	*/
	private Integer storeId ;
	/*
	水印图片放置的位置
	*/
	private Integer wmImagePos ;
	/*
	水印图片与原图片的融合度 
	*/
	private Integer wmImageTransition ;
	/*
	水印是否开启 0关闭 1开启
	*/
	private Integer wmIsOpen ;
	/*
	水印文字角度
	*/
	private Integer wmTextAngle ;
	/*
	水印文字放置位置
	*/
	private Integer wmTextPos ;
	/*
	水印文字大小
	*/
	private Integer wmTextSize ;
	/*
	水印图片的路径以及文件名
	*/
	private String wmImageName ;
	/*
	水印文字
	*/
	private String wmText ;
	/*
	水印字体的颜色值
	*/
	private String wmTextColor ;
	/*
	水印文字的字体
	*/
	private String wmTextFont ;
	
	public RaStoreWatermark() {
	}
	
	/**
	* 水印id
	*@return 
	*/
	public Integer getWmId(){
		return  wmId;
	}
	/**
	* 水印id
	*@param  wmId
	*/
	public void setWmId(Integer wmId ){
		this.wmId = wmId;
	}
	
	/**
	* jpeg图片质量
	*@return 
	*/
	public Integer getJpegQuality(){
		return  jpegQuality;
	}
	/**
	* jpeg图片质量
	*@param  jpegQuality
	*/
	public void setJpegQuality(Integer jpegQuality ){
		this.jpegQuality = jpegQuality;
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
	* 水印图片放置的位置
	*@return 
	*/
	public Integer getWmImagePos(){
		return  wmImagePos;
	}
	/**
	* 水印图片放置的位置
	*@param  wmImagePos
	*/
	public void setWmImagePos(Integer wmImagePos ){
		this.wmImagePos = wmImagePos;
	}
	
	/**
	* 水印图片与原图片的融合度 
	*@return 
	*/
	public Integer getWmImageTransition(){
		return  wmImageTransition;
	}
	/**
	* 水印图片与原图片的融合度 
	*@param  wmImageTransition
	*/
	public void setWmImageTransition(Integer wmImageTransition ){
		this.wmImageTransition = wmImageTransition;
	}
	
	/**
	* 水印是否开启 0关闭 1开启
	*@return 
	*/
	public Integer getWmIsOpen(){
		return  wmIsOpen;
	}
	/**
	* 水印是否开启 0关闭 1开启
	*@param  wmIsOpen
	*/
	public void setWmIsOpen(Integer wmIsOpen ){
		this.wmIsOpen = wmIsOpen;
	}
	
	/**
	* 水印文字角度
	*@return 
	*/
	public Integer getWmTextAngle(){
		return  wmTextAngle;
	}
	/**
	* 水印文字角度
	*@param  wmTextAngle
	*/
	public void setWmTextAngle(Integer wmTextAngle ){
		this.wmTextAngle = wmTextAngle;
	}
	
	/**
	* 水印文字放置位置
	*@return 
	*/
	public Integer getWmTextPos(){
		return  wmTextPos;
	}
	/**
	* 水印文字放置位置
	*@param  wmTextPos
	*/
	public void setWmTextPos(Integer wmTextPos ){
		this.wmTextPos = wmTextPos;
	}
	
	/**
	* 水印文字大小
	*@return 
	*/
	public Integer getWmTextSize(){
		return  wmTextSize;
	}
	/**
	* 水印文字大小
	*@param  wmTextSize
	*/
	public void setWmTextSize(Integer wmTextSize ){
		this.wmTextSize = wmTextSize;
	}
	
	/**
	* 水印图片的路径以及文件名
	*@return 
	*/
	public String getWmImageName(){
		return  wmImageName;
	}
	/**
	* 水印图片的路径以及文件名
	*@param  wmImageName
	*/
	public void setWmImageName(String wmImageName ){
		this.wmImageName = wmImageName;
	}
	
	/**
	* 水印文字
	*@return 
	*/
	public String getWmText(){
		return  wmText;
	}
	/**
	* 水印文字
	*@param  wmText
	*/
	public void setWmText(String wmText ){
		this.wmText = wmText;
	}
	
	/**
	* 水印字体的颜色值
	*@return 
	*/
	public String getWmTextColor(){
		return  wmTextColor;
	}
	/**
	* 水印字体的颜色值
	*@param  wmTextColor
	*/
	public void setWmTextColor(String wmTextColor ){
		this.wmTextColor = wmTextColor;
	}
	
	/**
	* 水印文字的字体
	*@return 
	*/
	public String getWmTextFont(){
		return  wmTextFont;
	}
	/**
	* 水印文字的字体
	*@param  wmTextFont
	*/
	public void setWmTextFont(String wmTextFont ){
		this.wmTextFont = wmTextFont;
	}
	

}
