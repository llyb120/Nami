package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_points_orderaddress")
public class RaPointsOrderaddress   {
	
	// alias
	public static final String ALIAS_point_oaid = "point_oaid";
	public static final String ALIAS_point_areaid = "point_areaid";
	public static final String ALIAS_point_orderid = "point_orderid";
	public static final String ALIAS_point_address = "point_address";
	public static final String ALIAS_point_areainfo = "point_areainfo";
	public static final String ALIAS_point_mobphone = "point_mobphone";
	public static final String ALIAS_point_telphone = "point_telphone";
	public static final String ALIAS_point_truename = "point_truename";
	public static final String ALIAS_point_zipcode = "point_zipcode";
	
	/*
	自增id
	*/
	private Integer point_oaid ;
	/*
	地区id
	*/
	private Integer point_areaid ;
	/*
	订单id
	*/
	private Integer point_orderid ;
	/*
	详细地址
	*/
	private String point_address ;
	/*
	地区内容
	*/
	private String point_areainfo ;
	/*
	手机号码
	*/
	private String point_mobphone ;
	/*
	电话号码
	*/
	private String point_telphone ;
	/*
	收货人姓名
	*/
	private String point_truename ;
	/*
	邮政编码
	*/
	private String point_zipcode ;
	
	public RaPointsOrderaddress() {
	}
	
	/**
	* 自增id
	*@return 
	*/
	public Integer getPoint_oaid(){
		return  point_oaid;
	}
	/**
	* 自增id
	*@param  point_oaid
	*/
	public void setPoint_oaid(Integer point_oaid ){
		this.point_oaid = point_oaid;
	}
	
	/**
	* 地区id
	*@return 
	*/
	public Integer getPoint_areaid(){
		return  point_areaid;
	}
	/**
	* 地区id
	*@param  point_areaid
	*/
	public void setPoint_areaid(Integer point_areaid ){
		this.point_areaid = point_areaid;
	}
	
	/**
	* 订单id
	*@return 
	*/
	public Integer getPoint_orderid(){
		return  point_orderid;
	}
	/**
	* 订单id
	*@param  point_orderid
	*/
	public void setPoint_orderid(Integer point_orderid ){
		this.point_orderid = point_orderid;
	}
	
	/**
	* 详细地址
	*@return 
	*/
	public String getPoint_address(){
		return  point_address;
	}
	/**
	* 详细地址
	*@param  point_address
	*/
	public void setPoint_address(String point_address ){
		this.point_address = point_address;
	}
	
	/**
	* 地区内容
	*@return 
	*/
	public String getPoint_areainfo(){
		return  point_areainfo;
	}
	/**
	* 地区内容
	*@param  point_areainfo
	*/
	public void setPoint_areainfo(String point_areainfo ){
		this.point_areainfo = point_areainfo;
	}
	
	/**
	* 手机号码
	*@return 
	*/
	public String getPoint_mobphone(){
		return  point_mobphone;
	}
	/**
	* 手机号码
	*@param  point_mobphone
	*/
	public void setPoint_mobphone(String point_mobphone ){
		this.point_mobphone = point_mobphone;
	}
	
	/**
	* 电话号码
	*@return 
	*/
	public String getPoint_telphone(){
		return  point_telphone;
	}
	/**
	* 电话号码
	*@param  point_telphone
	*/
	public void setPoint_telphone(String point_telphone ){
		this.point_telphone = point_telphone;
	}
	
	/**
	* 收货人姓名
	*@return 
	*/
	public String getPoint_truename(){
		return  point_truename;
	}
	/**
	* 收货人姓名
	*@param  point_truename
	*/
	public void setPoint_truename(String point_truename ){
		this.point_truename = point_truename;
	}
	
	/**
	* 邮政编码
	*@return 
	*/
	public String getPoint_zipcode(){
		return  point_zipcode;
	}
	/**
	* 邮政编码
	*@param  point_zipcode
	*/
	public void setPoint_zipcode(String point_zipcode ){
		this.point_zipcode = point_zipcode;
	}
	

}
