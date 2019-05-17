package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_points_ordergoods")
public class RaPointsOrdergoods   {
	
	/*
	订单礼品表索引
	*/
	private Integer pointRecid ;
	/*
	礼品id
	*/
	private Integer pointGoodsid ;
	/*
	礼品数量
	*/
	private Integer pointGoodsnum ;
	/*
	礼品兑换积分
	*/
	private Integer pointGoodspoints ;
	/*
	订单id
	*/
	private Integer pointOrderid ;
	/*
	礼品图片
	*/
	private String pointGoodsimage ;
	/*
	礼品名称
	*/
	private String pointGoodsname ;
	
	public RaPointsOrdergoods() {
	}
	
	/**
	* 订单礼品表索引
	*@return 
	*/
	public Integer getPointRecid(){
		return  pointRecid;
	}
	/**
	* 订单礼品表索引
	*@param  pointRecid
	*/
	public void setPointRecid(Integer pointRecid ){
		this.pointRecid = pointRecid;
	}
	
	/**
	* 礼品id
	*@return 
	*/
	public Integer getPointGoodsid(){
		return  pointGoodsid;
	}
	/**
	* 礼品id
	*@param  pointGoodsid
	*/
	public void setPointGoodsid(Integer pointGoodsid ){
		this.pointGoodsid = pointGoodsid;
	}
	
	/**
	* 礼品数量
	*@return 
	*/
	public Integer getPointGoodsnum(){
		return  pointGoodsnum;
	}
	/**
	* 礼品数量
	*@param  pointGoodsnum
	*/
	public void setPointGoodsnum(Integer pointGoodsnum ){
		this.pointGoodsnum = pointGoodsnum;
	}
	
	/**
	* 礼品兑换积分
	*@return 
	*/
	public Integer getPointGoodspoints(){
		return  pointGoodspoints;
	}
	/**
	* 礼品兑换积分
	*@param  pointGoodspoints
	*/
	public void setPointGoodspoints(Integer pointGoodspoints ){
		this.pointGoodspoints = pointGoodspoints;
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
	* 礼品图片
	*@return 
	*/
	public String getPointGoodsimage(){
		return  pointGoodsimage;
	}
	/**
	* 礼品图片
	*@param  pointGoodsimage
	*/
	public void setPointGoodsimage(String pointGoodsimage ){
		this.pointGoodsimage = pointGoodsimage;
	}
	
	/**
	* 礼品名称
	*@return 
	*/
	public String getPointGoodsname(){
		return  pointGoodsname;
	}
	/**
	* 礼品名称
	*@param  pointGoodsname
	*/
	public void setPointGoodsname(String pointGoodsname ){
		this.pointGoodsname = pointGoodsname;
	}
	

}
