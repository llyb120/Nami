package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_adv_position")
public class RaAdvPosition   {
	
	/*
	广告位置id
	*/
	private Integer apId ;
	/*
	拥有的广告数
	*/
	private Integer advNum ;
	/*
	广告类别：0图片1文字2幻灯3Flash
	*/
	private Integer apClass ;
	/*
	广告展示方式：0幻灯片1多广告展示2单广告展示
	*/
	private Integer apDisplay ;
	/*
	广告位高度
	*/
	private Integer apHeight ;
	/*
	广告位单价
	*/
	private Integer apPrice ;
	/*
	广告位宽度
	*/
	private Integer apWidth ;
	/*
	广告位点击率
	*/
	private Integer clickNum ;
	/*
	广告位是否启用：0不启用1启用
	*/
	private Integer isUse ;
	/*
	广告位简介
	*/
	private String apIntro ;
	/*
	广告位置名
	*/
	private String apName ;
	/*
	广告位默认内容
	*/
	private String defaultContent ;
	
	public RaAdvPosition() {
	}
	
	/**
	* 广告位置id
	*@return 
	*/
	public Integer getApId(){
		return  apId;
	}
	/**
	* 广告位置id
	*@param  apId
	*/
	public void setApId(Integer apId ){
		this.apId = apId;
	}
	
	/**
	* 拥有的广告数
	*@return 
	*/
	public Integer getAdvNum(){
		return  advNum;
	}
	/**
	* 拥有的广告数
	*@param  advNum
	*/
	public void setAdvNum(Integer advNum ){
		this.advNum = advNum;
	}
	
	/**
	* 广告类别：0图片1文字2幻灯3Flash
	*@return 
	*/
	public Integer getApClass(){
		return  apClass;
	}
	/**
	* 广告类别：0图片1文字2幻灯3Flash
	*@param  apClass
	*/
	public void setApClass(Integer apClass ){
		this.apClass = apClass;
	}
	
	/**
	* 广告展示方式：0幻灯片1多广告展示2单广告展示
	*@return 
	*/
	public Integer getApDisplay(){
		return  apDisplay;
	}
	/**
	* 广告展示方式：0幻灯片1多广告展示2单广告展示
	*@param  apDisplay
	*/
	public void setApDisplay(Integer apDisplay ){
		this.apDisplay = apDisplay;
	}
	
	/**
	* 广告位高度
	*@return 
	*/
	public Integer getApHeight(){
		return  apHeight;
	}
	/**
	* 广告位高度
	*@param  apHeight
	*/
	public void setApHeight(Integer apHeight ){
		this.apHeight = apHeight;
	}
	
	/**
	* 广告位单价
	*@return 
	*/
	public Integer getApPrice(){
		return  apPrice;
	}
	/**
	* 广告位单价
	*@param  apPrice
	*/
	public void setApPrice(Integer apPrice ){
		this.apPrice = apPrice;
	}
	
	/**
	* 广告位宽度
	*@return 
	*/
	public Integer getApWidth(){
		return  apWidth;
	}
	/**
	* 广告位宽度
	*@param  apWidth
	*/
	public void setApWidth(Integer apWidth ){
		this.apWidth = apWidth;
	}
	
	/**
	* 广告位点击率
	*@return 
	*/
	public Integer getClickNum(){
		return  clickNum;
	}
	/**
	* 广告位点击率
	*@param  clickNum
	*/
	public void setClickNum(Integer clickNum ){
		this.clickNum = clickNum;
	}
	
	/**
	* 广告位是否启用：0不启用1启用
	*@return 
	*/
	public Integer getIsUse(){
		return  isUse;
	}
	/**
	* 广告位是否启用：0不启用1启用
	*@param  isUse
	*/
	public void setIsUse(Integer isUse ){
		this.isUse = isUse;
	}
	
	/**
	* 广告位简介
	*@return 
	*/
	public String getApIntro(){
		return  apIntro;
	}
	/**
	* 广告位简介
	*@param  apIntro
	*/
	public void setApIntro(String apIntro ){
		this.apIntro = apIntro;
	}
	
	/**
	* 广告位置名
	*@return 
	*/
	public String getApName(){
		return  apName;
	}
	/**
	* 广告位置名
	*@param  apName
	*/
	public void setApName(String apName ){
		this.apName = apName;
	}
	
	/**
	* 广告位默认内容
	*@return 
	*/
	public String getDefaultContent(){
		return  defaultContent;
	}
	/**
	* 广告位默认内容
	*@param  defaultContent
	*/
	public void setDefaultContent(String defaultContent ){
		this.defaultContent = defaultContent;
	}
	

}
