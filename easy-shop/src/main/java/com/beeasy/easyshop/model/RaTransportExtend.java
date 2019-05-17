package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_transport_extend")
public class RaTransportExtend   {
	
	/*
	运费模板扩展ID
	*/
	private Integer id ;
	/*
	首件数量
	*/
	private Integer snum ;
	/*
	运费模板ID
	*/
	private Integer transportId ;
	/*
	续件数量
	*/
	private Integer xnum ;
	/*
	市级地区ID组成的串，以，隔开，两端也有，
	*/
	private String areaId ;
	/*
	地区name组成的串，以，隔开
	*/
	private String areaName ;
	/*
	是否默认运费1是2否
	*/
	private String isDefault ;
	/*
	首件运费
	*/
	private BigDecimal sprice ;
	/*
	省级地区ID组成的串，以，隔开，两端也有，
	*/
	private String topAreaId ;
	/*
	运费模板
	*/
	private String transportTitle ;
	/*
	续件运费
	*/
	private BigDecimal xprice ;
	
	public RaTransportExtend() {
	}
	
	/**
	* 运费模板扩展ID
	*@return 
	*/
	public Integer getId(){
		return  id;
	}
	/**
	* 运费模板扩展ID
	*@param  id
	*/
	public void setId(Integer id ){
		this.id = id;
	}
	
	/**
	* 首件数量
	*@return 
	*/
	public Integer getSnum(){
		return  snum;
	}
	/**
	* 首件数量
	*@param  snum
	*/
	public void setSnum(Integer snum ){
		this.snum = snum;
	}
	
	/**
	* 运费模板ID
	*@return 
	*/
	public Integer getTransportId(){
		return  transportId;
	}
	/**
	* 运费模板ID
	*@param  transportId
	*/
	public void setTransportId(Integer transportId ){
		this.transportId = transportId;
	}
	
	/**
	* 续件数量
	*@return 
	*/
	public Integer getXnum(){
		return  xnum;
	}
	/**
	* 续件数量
	*@param  xnum
	*/
	public void setXnum(Integer xnum ){
		this.xnum = xnum;
	}
	
	/**
	* 市级地区ID组成的串，以，隔开，两端也有，
	*@return 
	*/
	public String getAreaId(){
		return  areaId;
	}
	/**
	* 市级地区ID组成的串，以，隔开，两端也有，
	*@param  areaId
	*/
	public void setAreaId(String areaId ){
		this.areaId = areaId;
	}
	
	/**
	* 地区name组成的串，以，隔开
	*@return 
	*/
	public String getAreaName(){
		return  areaName;
	}
	/**
	* 地区name组成的串，以，隔开
	*@param  areaName
	*/
	public void setAreaName(String areaName ){
		this.areaName = areaName;
	}
	
	/**
	* 是否默认运费1是2否
	*@return 
	*/
	public String getIsDefault(){
		return  isDefault;
	}
	/**
	* 是否默认运费1是2否
	*@param  isDefault
	*/
	public void setIsDefault(String isDefault ){
		this.isDefault = isDefault;
	}
	
	/**
	* 首件运费
	*@return 
	*/
	public BigDecimal getSprice(){
		return  sprice;
	}
	/**
	* 首件运费
	*@param  sprice
	*/
	public void setSprice(BigDecimal sprice ){
		this.sprice = sprice;
	}
	
	/**
	* 省级地区ID组成的串，以，隔开，两端也有，
	*@return 
	*/
	public String getTopAreaId(){
		return  topAreaId;
	}
	/**
	* 省级地区ID组成的串，以，隔开，两端也有，
	*@param  topAreaId
	*/
	public void setTopAreaId(String topAreaId ){
		this.topAreaId = topAreaId;
	}
	
	/**
	* 运费模板
	*@return 
	*/
	public String getTransportTitle(){
		return  transportTitle;
	}
	/**
	* 运费模板
	*@param  transportTitle
	*/
	public void setTransportTitle(String transportTitle ){
		this.transportTitle = transportTitle;
	}
	
	/**
	* 续件运费
	*@return 
	*/
	public BigDecimal getXprice(){
		return  xprice;
	}
	/**
	* 续件运费
	*@param  xprice
	*/
	public void setXprice(BigDecimal xprice ){
		this.xprice = xprice;
	}
	

}
