package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_arrival_notice")
public class RaArrivalNotice   {
	
	/*
	通知id
	*/
	private Integer anId ;
	/*
	添加时间
	*/
	private Integer anAddtime ;
	/*
	状态 1到货通知，2预售
	*/
	private Integer anType ;
	/*
	商品id
	*/
	private Integer goodsId ;
	/*
	会员id
	*/
	private Integer memberId ;
	/*
	邮箱
	*/
	private String anEmail ;
	/*
	手机号
	*/
	private String anMobile ;
	/*
	商品名称
	*/
	private String goodsName ;
	
	public RaArrivalNotice() {
	}
	
	/**
	* 通知id
	*@return 
	*/
	public Integer getAnId(){
		return  anId;
	}
	/**
	* 通知id
	*@param  anId
	*/
	public void setAnId(Integer anId ){
		this.anId = anId;
	}
	
	/**
	* 添加时间
	*@return 
	*/
	public Integer getAnAddtime(){
		return  anAddtime;
	}
	/**
	* 添加时间
	*@param  anAddtime
	*/
	public void setAnAddtime(Integer anAddtime ){
		this.anAddtime = anAddtime;
	}
	
	/**
	* 状态 1到货通知，2预售
	*@return 
	*/
	public Integer getAnType(){
		return  anType;
	}
	/**
	* 状态 1到货通知，2预售
	*@param  anType
	*/
	public void setAnType(Integer anType ){
		this.anType = anType;
	}
	
	/**
	* 商品id
	*@return 
	*/
	public Integer getGoodsId(){
		return  goodsId;
	}
	/**
	* 商品id
	*@param  goodsId
	*/
	public void setGoodsId(Integer goodsId ){
		this.goodsId = goodsId;
	}
	
	/**
	* 会员id
	*@return 
	*/
	public Integer getMemberId(){
		return  memberId;
	}
	/**
	* 会员id
	*@param  memberId
	*/
	public void setMemberId(Integer memberId ){
		this.memberId = memberId;
	}
	
	/**
	* 邮箱
	*@return 
	*/
	public String getAnEmail(){
		return  anEmail;
	}
	/**
	* 邮箱
	*@param  anEmail
	*/
	public void setAnEmail(String anEmail ){
		this.anEmail = anEmail;
	}
	
	/**
	* 手机号
	*@return 
	*/
	public String getAnMobile(){
		return  anMobile;
	}
	/**
	* 手机号
	*@param  anMobile
	*/
	public void setAnMobile(String anMobile ){
		this.anMobile = anMobile;
	}
	
	/**
	* 商品名称
	*@return 
	*/
	public String getGoodsName(){
		return  goodsName;
	}
	/**
	* 商品名称
	*@param  goodsName
	*/
	public void setGoodsName(String goodsName ){
		this.goodsName = goodsName;
	}
	

}
