package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_points_order")
public class RaPointsOrder   {
	
	// alias
	public static final String ALIAS_point_orderid = "point_orderid";
	public static final String ALIAS_point_addtime = "point_addtime";
	public static final String ALIAS_point_allpoint = "point_allpoint";
	public static final String ALIAS_point_buyerid = "point_buyerid";
	public static final String ALIAS_point_finnshedtime = "point_finnshedtime";
	public static final String ALIAS_point_orderstate = "point_orderstate";
	public static final String ALIAS_point_shippingtime = "point_shippingtime";
	public static final String ALIAS_point_buyeremail = "point_buyeremail";
	public static final String ALIAS_point_buyername = "point_buyername";
	public static final String ALIAS_point_ordermessage = "point_ordermessage";
	public static final String ALIAS_point_ordersn = "point_ordersn";
	public static final String ALIAS_point_shipping_ecode = "point_shipping_ecode";
	public static final String ALIAS_point_shippingcode = "point_shippingcode";
	
	/*
	兑换订单编号
	*/
	private Integer point_orderid ;
	/*
	兑换订单生成时间
	*/
	private Integer point_addtime ;
	/*
	兑换总积分
	*/
	private Integer point_allpoint ;
	/*
	兑换会员id
	*/
	private Integer point_buyerid ;
	/*
	订单完成时间
	*/
	private Integer point_finnshedtime ;
	/*
	订单状态：20(默认):已兑换并扣除积分;30:已发货;40:已收货;50已完成;2已取消
	*/
	private Integer point_orderstate ;
	/*
	配送时间
	*/
	private Integer point_shippingtime ;
	/*
	兑换会员email
	*/
	private String point_buyeremail ;
	/*
	兑换会员姓名
	*/
	private String point_buyername ;
	/*
	订单留言
	*/
	private String point_ordermessage ;
	/*
	兑换订单编号
	*/
	private String point_ordersn ;
	/*
	物流公司编码
	*/
	private String point_shipping_ecode ;
	/*
	物流单号
	*/
	private String point_shippingcode ;
	
	public RaPointsOrder() {
	}
	
	/**
	* 兑换订单编号
	*@return 
	*/
	public Integer getPoint_orderid(){
		return  point_orderid;
	}
	/**
	* 兑换订单编号
	*@param  point_orderid
	*/
	public void setPoint_orderid(Integer point_orderid ){
		this.point_orderid = point_orderid;
	}
	
	/**
	* 兑换订单生成时间
	*@return 
	*/
	public Integer getPoint_addtime(){
		return  point_addtime;
	}
	/**
	* 兑换订单生成时间
	*@param  point_addtime
	*/
	public void setPoint_addtime(Integer point_addtime ){
		this.point_addtime = point_addtime;
	}
	
	/**
	* 兑换总积分
	*@return 
	*/
	public Integer getPoint_allpoint(){
		return  point_allpoint;
	}
	/**
	* 兑换总积分
	*@param  point_allpoint
	*/
	public void setPoint_allpoint(Integer point_allpoint ){
		this.point_allpoint = point_allpoint;
	}
	
	/**
	* 兑换会员id
	*@return 
	*/
	public Integer getPoint_buyerid(){
		return  point_buyerid;
	}
	/**
	* 兑换会员id
	*@param  point_buyerid
	*/
	public void setPoint_buyerid(Integer point_buyerid ){
		this.point_buyerid = point_buyerid;
	}
	
	/**
	* 订单完成时间
	*@return 
	*/
	public Integer getPoint_finnshedtime(){
		return  point_finnshedtime;
	}
	/**
	* 订单完成时间
	*@param  point_finnshedtime
	*/
	public void setPoint_finnshedtime(Integer point_finnshedtime ){
		this.point_finnshedtime = point_finnshedtime;
	}
	
	/**
	* 订单状态：20(默认):已兑换并扣除积分;30:已发货;40:已收货;50已完成;2已取消
	*@return 
	*/
	public Integer getPoint_orderstate(){
		return  point_orderstate;
	}
	/**
	* 订单状态：20(默认):已兑换并扣除积分;30:已发货;40:已收货;50已完成;2已取消
	*@param  point_orderstate
	*/
	public void setPoint_orderstate(Integer point_orderstate ){
		this.point_orderstate = point_orderstate;
	}
	
	/**
	* 配送时间
	*@return 
	*/
	public Integer getPoint_shippingtime(){
		return  point_shippingtime;
	}
	/**
	* 配送时间
	*@param  point_shippingtime
	*/
	public void setPoint_shippingtime(Integer point_shippingtime ){
		this.point_shippingtime = point_shippingtime;
	}
	
	/**
	* 兑换会员email
	*@return 
	*/
	public String getPoint_buyeremail(){
		return  point_buyeremail;
	}
	/**
	* 兑换会员email
	*@param  point_buyeremail
	*/
	public void setPoint_buyeremail(String point_buyeremail ){
		this.point_buyeremail = point_buyeremail;
	}
	
	/**
	* 兑换会员姓名
	*@return 
	*/
	public String getPoint_buyername(){
		return  point_buyername;
	}
	/**
	* 兑换会员姓名
	*@param  point_buyername
	*/
	public void setPoint_buyername(String point_buyername ){
		this.point_buyername = point_buyername;
	}
	
	/**
	* 订单留言
	*@return 
	*/
	public String getPoint_ordermessage(){
		return  point_ordermessage;
	}
	/**
	* 订单留言
	*@param  point_ordermessage
	*/
	public void setPoint_ordermessage(String point_ordermessage ){
		this.point_ordermessage = point_ordermessage;
	}
	
	/**
	* 兑换订单编号
	*@return 
	*/
	public String getPoint_ordersn(){
		return  point_ordersn;
	}
	/**
	* 兑换订单编号
	*@param  point_ordersn
	*/
	public void setPoint_ordersn(String point_ordersn ){
		this.point_ordersn = point_ordersn;
	}
	
	/**
	* 物流公司编码
	*@return 
	*/
	public String getPoint_shipping_ecode(){
		return  point_shipping_ecode;
	}
	/**
	* 物流公司编码
	*@param  point_shipping_ecode
	*/
	public void setPoint_shipping_ecode(String point_shipping_ecode ){
		this.point_shipping_ecode = point_shipping_ecode;
	}
	
	/**
	* 物流单号
	*@return 
	*/
	public String getPoint_shippingcode(){
		return  point_shippingcode;
	}
	/**
	* 物流单号
	*@param  point_shippingcode
	*/
	public void setPoint_shippingcode(String point_shippingcode ){
		this.point_shippingcode = point_shippingcode;
	}
	

}
