package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_store_sns_setting")
public class RaStoreSnsSetting   {
	
	/*
	店铺id
	*/
	private Integer sautoStoreid ;
	/*
	组合销售,0为关闭/1为开启
	*/
	private Integer sautoBundling ;
	/*
	优惠券,0为关闭/1为开启
	*/
	private Integer sautoCoupon ;
	/*
	团购,0为关闭/1为开启
	*/
	private Integer sautoGroupbuy ;
	/*
	满即送,0为关闭/1为开启
	*/
	private Integer sautoMansong ;
	/*
	新品,0为关闭/1为开启
	*/
	private Integer sautoNew ;
	/*
	限时折扣,0为关闭/1为开启
	*/
	private Integer sautoXianshi ;
	/*
	组合销售内容
	*/
	private String sautoBundlingtitle ;
	/*
	优惠券内容
	*/
	private String sautoCoupontitle ;
	/*
	团购内容
	*/
	private String sautoGroupbuytitle ;
	/*
	满即送内容
	*/
	private String sautoMansongtitle ;
	/*
	新品内容
	*/
	private String sautoNewtitle ;
	/*
	限时折扣内容
	*/
	private String sautoXianshititle ;
	
	public RaStoreSnsSetting() {
	}
	
	/**
	* 店铺id
	*@return 
	*/
	public Integer getSautoStoreid(){
		return  sautoStoreid;
	}
	/**
	* 店铺id
	*@param  sautoStoreid
	*/
	public void setSautoStoreid(Integer sautoStoreid ){
		this.sautoStoreid = sautoStoreid;
	}
	
	/**
	* 组合销售,0为关闭/1为开启
	*@return 
	*/
	public Integer getSautoBundling(){
		return  sautoBundling;
	}
	/**
	* 组合销售,0为关闭/1为开启
	*@param  sautoBundling
	*/
	public void setSautoBundling(Integer sautoBundling ){
		this.sautoBundling = sautoBundling;
	}
	
	/**
	* 优惠券,0为关闭/1为开启
	*@return 
	*/
	public Integer getSautoCoupon(){
		return  sautoCoupon;
	}
	/**
	* 优惠券,0为关闭/1为开启
	*@param  sautoCoupon
	*/
	public void setSautoCoupon(Integer sautoCoupon ){
		this.sautoCoupon = sautoCoupon;
	}
	
	/**
	* 团购,0为关闭/1为开启
	*@return 
	*/
	public Integer getSautoGroupbuy(){
		return  sautoGroupbuy;
	}
	/**
	* 团购,0为关闭/1为开启
	*@param  sautoGroupbuy
	*/
	public void setSautoGroupbuy(Integer sautoGroupbuy ){
		this.sautoGroupbuy = sautoGroupbuy;
	}
	
	/**
	* 满即送,0为关闭/1为开启
	*@return 
	*/
	public Integer getSautoMansong(){
		return  sautoMansong;
	}
	/**
	* 满即送,0为关闭/1为开启
	*@param  sautoMansong
	*/
	public void setSautoMansong(Integer sautoMansong ){
		this.sautoMansong = sautoMansong;
	}
	
	/**
	* 新品,0为关闭/1为开启
	*@return 
	*/
	public Integer getSautoNew(){
		return  sautoNew;
	}
	/**
	* 新品,0为关闭/1为开启
	*@param  sautoNew
	*/
	public void setSautoNew(Integer sautoNew ){
		this.sautoNew = sautoNew;
	}
	
	/**
	* 限时折扣,0为关闭/1为开启
	*@return 
	*/
	public Integer getSautoXianshi(){
		return  sautoXianshi;
	}
	/**
	* 限时折扣,0为关闭/1为开启
	*@param  sautoXianshi
	*/
	public void setSautoXianshi(Integer sautoXianshi ){
		this.sautoXianshi = sautoXianshi;
	}
	
	/**
	* 组合销售内容
	*@return 
	*/
	public String getSautoBundlingtitle(){
		return  sautoBundlingtitle;
	}
	/**
	* 组合销售内容
	*@param  sautoBundlingtitle
	*/
	public void setSautoBundlingtitle(String sautoBundlingtitle ){
		this.sautoBundlingtitle = sautoBundlingtitle;
	}
	
	/**
	* 优惠券内容
	*@return 
	*/
	public String getSautoCoupontitle(){
		return  sautoCoupontitle;
	}
	/**
	* 优惠券内容
	*@param  sautoCoupontitle
	*/
	public void setSautoCoupontitle(String sautoCoupontitle ){
		this.sautoCoupontitle = sautoCoupontitle;
	}
	
	/**
	* 团购内容
	*@return 
	*/
	public String getSautoGroupbuytitle(){
		return  sautoGroupbuytitle;
	}
	/**
	* 团购内容
	*@param  sautoGroupbuytitle
	*/
	public void setSautoGroupbuytitle(String sautoGroupbuytitle ){
		this.sautoGroupbuytitle = sautoGroupbuytitle;
	}
	
	/**
	* 满即送内容
	*@return 
	*/
	public String getSautoMansongtitle(){
		return  sautoMansongtitle;
	}
	/**
	* 满即送内容
	*@param  sautoMansongtitle
	*/
	public void setSautoMansongtitle(String sautoMansongtitle ){
		this.sautoMansongtitle = sautoMansongtitle;
	}
	
	/**
	* 新品内容
	*@return 
	*/
	public String getSautoNewtitle(){
		return  sautoNewtitle;
	}
	/**
	* 新品内容
	*@param  sautoNewtitle
	*/
	public void setSautoNewtitle(String sautoNewtitle ){
		this.sautoNewtitle = sautoNewtitle;
	}
	
	/**
	* 限时折扣内容
	*@return 
	*/
	public String getSautoXianshititle(){
		return  sautoXianshititle;
	}
	/**
	* 限时折扣内容
	*@param  sautoXianshititle
	*/
	public void setSautoXianshititle(String sautoXianshititle ){
		this.sautoXianshititle = sautoXianshititle;
	}
	

}
