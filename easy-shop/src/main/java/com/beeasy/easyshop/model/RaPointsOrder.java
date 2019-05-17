package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_points_order")
public class RaPointsOrder   {
	
	/*
	兑换订单编号
	*/
	private Integer pointOrderid ;
	/*
	兑换订单生成时间
	*/
	private Integer pointAddtime ;
	/*
	兑换总积分
	*/
	private Integer pointAllpoint ;
	/*
	兑换会员id
	*/
	private Integer pointBuyerid ;
	/*
	订单完成时间
	*/
	private Integer pointFinnshedtime ;
	/*
	订单状态：20(默认):已兑换并扣除积分;30:已发货;40:已收货;50已完成;2已取消
	*/
	private Integer pointOrderstate ;
	/*
	配送时间
	*/
	private Integer pointShippingtime ;
	/*
	兑换会员email
	*/
	private String pointBuyeremail ;
	/*
	兑换会员姓名
	*/
	private String pointBuyername ;
	/*
	订单留言
	*/
	private String pointOrdermessage ;
	/*
	兑换订单编号
	*/
	private String pointOrdersn ;
	/*
	物流公司编码
	*/
	private String pointShippingEcode ;
	/*
	物流单号
	*/
	private String pointShippingcode ;
	
	public RaPointsOrder() {
	}
	
	/**
	* 兑换订单编号
	*@return 
	*/
	public Integer getPointOrderid(){
		return  pointOrderid;
	}
	/**
	* 兑换订单编号
	*@param  pointOrderid
	*/
	public void setPointOrderid(Integer pointOrderid ){
		this.pointOrderid = pointOrderid;
	}
	
	/**
	* 兑换订单生成时间
	*@return 
	*/
	public Integer getPointAddtime(){
		return  pointAddtime;
	}
	/**
	* 兑换订单生成时间
	*@param  pointAddtime
	*/
	public void setPointAddtime(Integer pointAddtime ){
		this.pointAddtime = pointAddtime;
	}
	
	/**
	* 兑换总积分
	*@return 
	*/
	public Integer getPointAllpoint(){
		return  pointAllpoint;
	}
	/**
	* 兑换总积分
	*@param  pointAllpoint
	*/
	public void setPointAllpoint(Integer pointAllpoint ){
		this.pointAllpoint = pointAllpoint;
	}
	
	/**
	* 兑换会员id
	*@return 
	*/
	public Integer getPointBuyerid(){
		return  pointBuyerid;
	}
	/**
	* 兑换会员id
	*@param  pointBuyerid
	*/
	public void setPointBuyerid(Integer pointBuyerid ){
		this.pointBuyerid = pointBuyerid;
	}
	
	/**
	* 订单完成时间
	*@return 
	*/
	public Integer getPointFinnshedtime(){
		return  pointFinnshedtime;
	}
	/**
	* 订单完成时间
	*@param  pointFinnshedtime
	*/
	public void setPointFinnshedtime(Integer pointFinnshedtime ){
		this.pointFinnshedtime = pointFinnshedtime;
	}
	
	/**
	* 订单状态：20(默认):已兑换并扣除积分;30:已发货;40:已收货;50已完成;2已取消
	*@return 
	*/
	public Integer getPointOrderstate(){
		return  pointOrderstate;
	}
	/**
	* 订单状态：20(默认):已兑换并扣除积分;30:已发货;40:已收货;50已完成;2已取消
	*@param  pointOrderstate
	*/
	public void setPointOrderstate(Integer pointOrderstate ){
		this.pointOrderstate = pointOrderstate;
	}
	
	/**
	* 配送时间
	*@return 
	*/
	public Integer getPointShippingtime(){
		return  pointShippingtime;
	}
	/**
	* 配送时间
	*@param  pointShippingtime
	*/
	public void setPointShippingtime(Integer pointShippingtime ){
		this.pointShippingtime = pointShippingtime;
	}
	
	/**
	* 兑换会员email
	*@return 
	*/
	public String getPointBuyeremail(){
		return  pointBuyeremail;
	}
	/**
	* 兑换会员email
	*@param  pointBuyeremail
	*/
	public void setPointBuyeremail(String pointBuyeremail ){
		this.pointBuyeremail = pointBuyeremail;
	}
	
	/**
	* 兑换会员姓名
	*@return 
	*/
	public String getPointBuyername(){
		return  pointBuyername;
	}
	/**
	* 兑换会员姓名
	*@param  pointBuyername
	*/
	public void setPointBuyername(String pointBuyername ){
		this.pointBuyername = pointBuyername;
	}
	
	/**
	* 订单留言
	*@return 
	*/
	public String getPointOrdermessage(){
		return  pointOrdermessage;
	}
	/**
	* 订单留言
	*@param  pointOrdermessage
	*/
	public void setPointOrdermessage(String pointOrdermessage ){
		this.pointOrdermessage = pointOrdermessage;
	}
	
	/**
	* 兑换订单编号
	*@return 
	*/
	public String getPointOrdersn(){
		return  pointOrdersn;
	}
	/**
	* 兑换订单编号
	*@param  pointOrdersn
	*/
	public void setPointOrdersn(String pointOrdersn ){
		this.pointOrdersn = pointOrdersn;
	}
	
	/**
	* 物流公司编码
	*@return 
	*/
	public String getPointShippingEcode(){
		return  pointShippingEcode;
	}
	/**
	* 物流公司编码
	*@param  pointShippingEcode
	*/
	public void setPointShippingEcode(String pointShippingEcode ){
		this.pointShippingEcode = pointShippingEcode;
	}
	
	/**
	* 物流单号
	*@return 
	*/
	public String getPointShippingcode(){
		return  pointShippingcode;
	}
	/**
	* 物流单号
	*@param  pointShippingcode
	*/
	public void setPointShippingcode(String pointShippingcode ){
		this.pointShippingcode = pointShippingcode;
	}
	

}
