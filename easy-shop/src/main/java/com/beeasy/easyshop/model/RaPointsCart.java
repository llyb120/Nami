package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_points_cart")
public class RaPointsCart   {
	
	/*
	自增ID
	*/
	private Integer pcartId ;
	/*
	选择积分礼品数量
	*/
	private Integer pgoodsChoosenum ;
	/*
	积分礼品序号
	*/
	private Integer pgoodsId ;
	/*
	积分礼品兑换积分
	*/
	private Integer pgoodsPoints ;
	/*
	会员编号
	*/
	private Integer pmemberId ;
	/*
	积分礼品图片
	*/
	private String pgoodsImage ;
	/*
	积分礼品名称
	*/
	private String pgoodsName ;
	
	public RaPointsCart() {
	}
	
	/**
	* 自增ID
	*@return 
	*/
	public Integer getPcartId(){
		return  pcartId;
	}
	/**
	* 自增ID
	*@param  pcartId
	*/
	public void setPcartId(Integer pcartId ){
		this.pcartId = pcartId;
	}
	
	/**
	* 选择积分礼品数量
	*@return 
	*/
	public Integer getPgoodsChoosenum(){
		return  pgoodsChoosenum;
	}
	/**
	* 选择积分礼品数量
	*@param  pgoodsChoosenum
	*/
	public void setPgoodsChoosenum(Integer pgoodsChoosenum ){
		this.pgoodsChoosenum = pgoodsChoosenum;
	}
	
	/**
	* 积分礼品序号
	*@return 
	*/
	public Integer getPgoodsId(){
		return  pgoodsId;
	}
	/**
	* 积分礼品序号
	*@param  pgoodsId
	*/
	public void setPgoodsId(Integer pgoodsId ){
		this.pgoodsId = pgoodsId;
	}
	
	/**
	* 积分礼品兑换积分
	*@return 
	*/
	public Integer getPgoodsPoints(){
		return  pgoodsPoints;
	}
	/**
	* 积分礼品兑换积分
	*@param  pgoodsPoints
	*/
	public void setPgoodsPoints(Integer pgoodsPoints ){
		this.pgoodsPoints = pgoodsPoints;
	}
	
	/**
	* 会员编号
	*@return 
	*/
	public Integer getPmemberId(){
		return  pmemberId;
	}
	/**
	* 会员编号
	*@param  pmemberId
	*/
	public void setPmemberId(Integer pmemberId ){
		this.pmemberId = pmemberId;
	}
	
	/**
	* 积分礼品图片
	*@return 
	*/
	public String getPgoodsImage(){
		return  pgoodsImage;
	}
	/**
	* 积分礼品图片
	*@param  pgoodsImage
	*/
	public void setPgoodsImage(String pgoodsImage ){
		this.pgoodsImage = pgoodsImage;
	}
	
	/**
	* 积分礼品名称
	*@return 
	*/
	public String getPgoodsName(){
		return  pgoodsName;
	}
	/**
	* 积分礼品名称
	*@param  pgoodsName
	*/
	public void setPgoodsName(String pgoodsName ){
		this.pgoodsName = pgoodsName;
	}
	

}
