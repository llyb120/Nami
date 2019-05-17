package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_points_orderaddress")
public class RaPointsOrderaddress   {
	
	/*
	自增id
	*/
	private Integer pointOaid ;
	/*
	地区id
	*/
	private Integer pointAreaid ;
	/*
	订单id
	*/
	private Integer pointOrderid ;
	/*
	详细地址
	*/
	private String pointAddress ;
	/*
	地区内容
	*/
	private String pointAreainfo ;
	/*
	手机号码
	*/
	private String pointMobphone ;
	/*
	电话号码
	*/
	private String pointTelphone ;
	/*
	收货人姓名
	*/
	private String pointTruename ;
	/*
	邮政编码
	*/
	private String pointZipcode ;
	
	public RaPointsOrderaddress() {
	}
	
	/**
	* 自增id
	*@return 
	*/
	public Integer getPointOaid(){
		return  pointOaid;
	}
	/**
	* 自增id
	*@param  pointOaid
	*/
	public void setPointOaid(Integer pointOaid ){
		this.pointOaid = pointOaid;
	}
	
	/**
	* 地区id
	*@return 
	*/
	public Integer getPointAreaid(){
		return  pointAreaid;
	}
	/**
	* 地区id
	*@param  pointAreaid
	*/
	public void setPointAreaid(Integer pointAreaid ){
		this.pointAreaid = pointAreaid;
	}
	
	/**
	* 订单id
	*@return 
	*/
	public Integer getPointOrderid(){
		return  pointOrderid;
	}
	/**
	* 订单id
	*@param  pointOrderid
	*/
	public void setPointOrderid(Integer pointOrderid ){
		this.pointOrderid = pointOrderid;
	}
	
	/**
	* 详细地址
	*@return 
	*/
	public String getPointAddress(){
		return  pointAddress;
	}
	/**
	* 详细地址
	*@param  pointAddress
	*/
	public void setPointAddress(String pointAddress ){
		this.pointAddress = pointAddress;
	}
	
	/**
	* 地区内容
	*@return 
	*/
	public String getPointAreainfo(){
		return  pointAreainfo;
	}
	/**
	* 地区内容
	*@param  pointAreainfo
	*/
	public void setPointAreainfo(String pointAreainfo ){
		this.pointAreainfo = pointAreainfo;
	}
	
	/**
	* 手机号码
	*@return 
	*/
	public String getPointMobphone(){
		return  pointMobphone;
	}
	/**
	* 手机号码
	*@param  pointMobphone
	*/
	public void setPointMobphone(String pointMobphone ){
		this.pointMobphone = pointMobphone;
	}
	
	/**
	* 电话号码
	*@return 
	*/
	public String getPointTelphone(){
		return  pointTelphone;
	}
	/**
	* 电话号码
	*@param  pointTelphone
	*/
	public void setPointTelphone(String pointTelphone ){
		this.pointTelphone = pointTelphone;
	}
	
	/**
	* 收货人姓名
	*@return 
	*/
	public String getPointTruename(){
		return  pointTruename;
	}
	/**
	* 收货人姓名
	*@param  pointTruename
	*/
	public void setPointTruename(String pointTruename ){
		this.pointTruename = pointTruename;
	}
	
	/**
	* 邮政编码
	*@return 
	*/
	public String getPointZipcode(){
		return  pointZipcode;
	}
	/**
	* 邮政编码
	*@param  pointZipcode
	*/
	public void setPointZipcode(String pointZipcode ){
		this.pointZipcode = pointZipcode;
	}
	

}
