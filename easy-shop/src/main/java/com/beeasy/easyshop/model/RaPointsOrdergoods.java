package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_points_ordergoods")
public class RaPointsOrdergoods   {
	
	// alias
	public static final String ALIAS_point_recid = "point_recid";
	public static final String ALIAS_point_goodsid = "point_goodsid";
	public static final String ALIAS_point_goodsnum = "point_goodsnum";
	public static final String ALIAS_point_goodspoints = "point_goodspoints";
	public static final String ALIAS_point_orderid = "point_orderid";
	public static final String ALIAS_point_goodsimage = "point_goodsimage";
	public static final String ALIAS_point_goodsname = "point_goodsname";
	
	/*
	订单礼品表索引
	*/
	private Integer point_recid ;
	/*
	礼品id
	*/
	private Integer point_goodsid ;
	/*
	礼品数量
	*/
	private Integer point_goodsnum ;
	/*
	礼品兑换积分
	*/
	private Integer point_goodspoints ;
	/*
	订单id
	*/
	private Integer point_orderid ;
	/*
	礼品图片
	*/
	private String point_goodsimage ;
	/*
	礼品名称
	*/
	private String point_goodsname ;
	
	public RaPointsOrdergoods() {
	}
	
	/**
	* 订单礼品表索引
	*@return 
	*/
	public Integer getPoint_recid(){
		return  point_recid;
	}
	/**
	* 订单礼品表索引
	*@param  point_recid
	*/
	public void setPoint_recid(Integer point_recid ){
		this.point_recid = point_recid;
	}
	
	/**
	* 礼品id
	*@return 
	*/
	public Integer getPoint_goodsid(){
		return  point_goodsid;
	}
	/**
	* 礼品id
	*@param  point_goodsid
	*/
	public void setPoint_goodsid(Integer point_goodsid ){
		this.point_goodsid = point_goodsid;
	}
	
	/**
	* 礼品数量
	*@return 
	*/
	public Integer getPoint_goodsnum(){
		return  point_goodsnum;
	}
	/**
	* 礼品数量
	*@param  point_goodsnum
	*/
	public void setPoint_goodsnum(Integer point_goodsnum ){
		this.point_goodsnum = point_goodsnum;
	}
	
	/**
	* 礼品兑换积分
	*@return 
	*/
	public Integer getPoint_goodspoints(){
		return  point_goodspoints;
	}
	/**
	* 礼品兑换积分
	*@param  point_goodspoints
	*/
	public void setPoint_goodspoints(Integer point_goodspoints ){
		this.point_goodspoints = point_goodspoints;
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
	* 礼品图片
	*@return 
	*/
	public String getPoint_goodsimage(){
		return  point_goodsimage;
	}
	/**
	* 礼品图片
	*@param  point_goodsimage
	*/
	public void setPoint_goodsimage(String point_goodsimage ){
		this.point_goodsimage = point_goodsimage;
	}
	
	/**
	* 礼品名称
	*@return 
	*/
	public String getPoint_goodsname(){
		return  point_goodsname;
	}
	/**
	* 礼品名称
	*@param  point_goodsname
	*/
	public void setPoint_goodsname(String point_goodsname ){
		this.point_goodsname = point_goodsname;
	}
	

}
