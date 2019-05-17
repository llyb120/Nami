package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_store_sns_setting")
public class RaStoreSnsSetting   {
	
	// alias
	public static final String ALIAS_sauto_storeid = "sauto_storeid";
	public static final String ALIAS_sauto_bundling = "sauto_bundling";
	public static final String ALIAS_sauto_coupon = "sauto_coupon";
	public static final String ALIAS_sauto_groupbuy = "sauto_groupbuy";
	public static final String ALIAS_sauto_mansong = "sauto_mansong";
	public static final String ALIAS_sauto_new = "sauto_new";
	public static final String ALIAS_sauto_xianshi = "sauto_xianshi";
	public static final String ALIAS_sauto_bundlingtitle = "sauto_bundlingtitle";
	public static final String ALIAS_sauto_coupontitle = "sauto_coupontitle";
	public static final String ALIAS_sauto_groupbuytitle = "sauto_groupbuytitle";
	public static final String ALIAS_sauto_mansongtitle = "sauto_mansongtitle";
	public static final String ALIAS_sauto_newtitle = "sauto_newtitle";
	public static final String ALIAS_sauto_xianshititle = "sauto_xianshititle";
	
	/*
	店铺id
	*/
	private Integer sauto_storeid ;
	/*
	组合销售,0为关闭/1为开启
	*/
	private Integer sauto_bundling ;
	/*
	优惠券,0为关闭/1为开启
	*/
	private Integer sauto_coupon ;
	/*
	团购,0为关闭/1为开启
	*/
	private Integer sauto_groupbuy ;
	/*
	满即送,0为关闭/1为开启
	*/
	private Integer sauto_mansong ;
	/*
	新品,0为关闭/1为开启
	*/
	private Integer sauto_new ;
	/*
	限时折扣,0为关闭/1为开启
	*/
	private Integer sauto_xianshi ;
	/*
	组合销售内容
	*/
	private String sauto_bundlingtitle ;
	/*
	优惠券内容
	*/
	private String sauto_coupontitle ;
	/*
	团购内容
	*/
	private String sauto_groupbuytitle ;
	/*
	满即送内容
	*/
	private String sauto_mansongtitle ;
	/*
	新品内容
	*/
	private String sauto_newtitle ;
	/*
	限时折扣内容
	*/
	private String sauto_xianshititle ;
	
	public RaStoreSnsSetting() {
	}
	
	/**
	* 店铺id
	*@return 
	*/
	public Integer getSauto_storeid(){
		return  sauto_storeid;
	}
	/**
	* 店铺id
	*@param  sauto_storeid
	*/
	public void setSauto_storeid(Integer sauto_storeid ){
		this.sauto_storeid = sauto_storeid;
	}
	
	/**
	* 组合销售,0为关闭/1为开启
	*@return 
	*/
	public Integer getSauto_bundling(){
		return  sauto_bundling;
	}
	/**
	* 组合销售,0为关闭/1为开启
	*@param  sauto_bundling
	*/
	public void setSauto_bundling(Integer sauto_bundling ){
		this.sauto_bundling = sauto_bundling;
	}
	
	/**
	* 优惠券,0为关闭/1为开启
	*@return 
	*/
	public Integer getSauto_coupon(){
		return  sauto_coupon;
	}
	/**
	* 优惠券,0为关闭/1为开启
	*@param  sauto_coupon
	*/
	public void setSauto_coupon(Integer sauto_coupon ){
		this.sauto_coupon = sauto_coupon;
	}
	
	/**
	* 团购,0为关闭/1为开启
	*@return 
	*/
	public Integer getSauto_groupbuy(){
		return  sauto_groupbuy;
	}
	/**
	* 团购,0为关闭/1为开启
	*@param  sauto_groupbuy
	*/
	public void setSauto_groupbuy(Integer sauto_groupbuy ){
		this.sauto_groupbuy = sauto_groupbuy;
	}
	
	/**
	* 满即送,0为关闭/1为开启
	*@return 
	*/
	public Integer getSauto_mansong(){
		return  sauto_mansong;
	}
	/**
	* 满即送,0为关闭/1为开启
	*@param  sauto_mansong
	*/
	public void setSauto_mansong(Integer sauto_mansong ){
		this.sauto_mansong = sauto_mansong;
	}
	
	/**
	* 新品,0为关闭/1为开启
	*@return 
	*/
	public Integer getSauto_new(){
		return  sauto_new;
	}
	/**
	* 新品,0为关闭/1为开启
	*@param  sauto_new
	*/
	public void setSauto_new(Integer sauto_new ){
		this.sauto_new = sauto_new;
	}
	
	/**
	* 限时折扣,0为关闭/1为开启
	*@return 
	*/
	public Integer getSauto_xianshi(){
		return  sauto_xianshi;
	}
	/**
	* 限时折扣,0为关闭/1为开启
	*@param  sauto_xianshi
	*/
	public void setSauto_xianshi(Integer sauto_xianshi ){
		this.sauto_xianshi = sauto_xianshi;
	}
	
	/**
	* 组合销售内容
	*@return 
	*/
	public String getSauto_bundlingtitle(){
		return  sauto_bundlingtitle;
	}
	/**
	* 组合销售内容
	*@param  sauto_bundlingtitle
	*/
	public void setSauto_bundlingtitle(String sauto_bundlingtitle ){
		this.sauto_bundlingtitle = sauto_bundlingtitle;
	}
	
	/**
	* 优惠券内容
	*@return 
	*/
	public String getSauto_coupontitle(){
		return  sauto_coupontitle;
	}
	/**
	* 优惠券内容
	*@param  sauto_coupontitle
	*/
	public void setSauto_coupontitle(String sauto_coupontitle ){
		this.sauto_coupontitle = sauto_coupontitle;
	}
	
	/**
	* 团购内容
	*@return 
	*/
	public String getSauto_groupbuytitle(){
		return  sauto_groupbuytitle;
	}
	/**
	* 团购内容
	*@param  sauto_groupbuytitle
	*/
	public void setSauto_groupbuytitle(String sauto_groupbuytitle ){
		this.sauto_groupbuytitle = sauto_groupbuytitle;
	}
	
	/**
	* 满即送内容
	*@return 
	*/
	public String getSauto_mansongtitle(){
		return  sauto_mansongtitle;
	}
	/**
	* 满即送内容
	*@param  sauto_mansongtitle
	*/
	public void setSauto_mansongtitle(String sauto_mansongtitle ){
		this.sauto_mansongtitle = sauto_mansongtitle;
	}
	
	/**
	* 新品内容
	*@return 
	*/
	public String getSauto_newtitle(){
		return  sauto_newtitle;
	}
	/**
	* 新品内容
	*@param  sauto_newtitle
	*/
	public void setSauto_newtitle(String sauto_newtitle ){
		this.sauto_newtitle = sauto_newtitle;
	}
	
	/**
	* 限时折扣内容
	*@return 
	*/
	public String getSauto_xianshititle(){
		return  sauto_xianshititle;
	}
	/**
	* 限时折扣内容
	*@param  sauto_xianshititle
	*/
	public void setSauto_xianshititle(String sauto_xianshititle ){
		this.sauto_xianshititle = sauto_xianshititle;
	}
	

}
