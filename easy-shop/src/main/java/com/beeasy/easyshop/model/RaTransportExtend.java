package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_transport_extend")
public class RaTransportExtend   {
	
	// alias
	public static final String ALIAS_id = "id";
	public static final String ALIAS_snum = "snum";
	public static final String ALIAS_transport_id = "transport_id";
	public static final String ALIAS_xnum = "xnum";
	public static final String ALIAS_area_id = "area_id";
	public static final String ALIAS_area_name = "area_name";
	public static final String ALIAS_is_default = "is_default";
	public static final String ALIAS_sprice = "sprice";
	public static final String ALIAS_top_area_id = "top_area_id";
	public static final String ALIAS_transport_title = "transport_title";
	public static final String ALIAS_xprice = "xprice";
	
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
	private Integer transport_id ;
	/*
	续件数量
	*/
	private Integer xnum ;
	/*
	市级地区ID组成的串，以，隔开，两端也有，
	*/
	private String area_id ;
	/*
	地区name组成的串，以，隔开
	*/
	private String area_name ;
	/*
	是否默认运费1是2否
	*/
	private String is_default ;
	/*
	首件运费
	*/
	private BigDecimal sprice ;
	/*
	省级地区ID组成的串，以，隔开，两端也有，
	*/
	private String top_area_id ;
	/*
	运费模板
	*/
	private String transport_title ;
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
	public Integer getTransport_id(){
		return  transport_id;
	}
	/**
	* 运费模板ID
	*@param  transport_id
	*/
	public void setTransport_id(Integer transport_id ){
		this.transport_id = transport_id;
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
	public String getArea_id(){
		return  area_id;
	}
	/**
	* 市级地区ID组成的串，以，隔开，两端也有，
	*@param  area_id
	*/
	public void setArea_id(String area_id ){
		this.area_id = area_id;
	}
	
	/**
	* 地区name组成的串，以，隔开
	*@return 
	*/
	public String getArea_name(){
		return  area_name;
	}
	/**
	* 地区name组成的串，以，隔开
	*@param  area_name
	*/
	public void setArea_name(String area_name ){
		this.area_name = area_name;
	}
	
	/**
	* 是否默认运费1是2否
	*@return 
	*/
	public String getIs_default(){
		return  is_default;
	}
	/**
	* 是否默认运费1是2否
	*@param  is_default
	*/
	public void setIs_default(String is_default ){
		this.is_default = is_default;
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
	public String getTop_area_id(){
		return  top_area_id;
	}
	/**
	* 省级地区ID组成的串，以，隔开，两端也有，
	*@param  top_area_id
	*/
	public void setTop_area_id(String top_area_id ){
		this.top_area_id = top_area_id;
	}
	
	/**
	* 运费模板
	*@return 
	*/
	public String getTransport_title(){
		return  transport_title;
	}
	/**
	* 运费模板
	*@param  transport_title
	*/
	public void setTransport_title(String transport_title ){
		this.transport_title = transport_title;
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
