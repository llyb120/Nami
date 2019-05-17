package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_adv_position_copy")
public class RaAdvPositionCopy   {
	
	// alias
	public static final String ALIAS_ap_id = "ap_id";
	public static final String ALIAS_adv_num = "adv_num";
	public static final String ALIAS_ap_class = "ap_class";
	public static final String ALIAS_ap_display = "ap_display";
	public static final String ALIAS_ap_height = "ap_height";
	public static final String ALIAS_ap_price = "ap_price";
	public static final String ALIAS_ap_width = "ap_width";
	public static final String ALIAS_click_num = "click_num";
	public static final String ALIAS_is_use = "is_use";
	public static final String ALIAS_ap_intro = "ap_intro";
	public static final String ALIAS_ap_name = "ap_name";
	public static final String ALIAS_default_content = "default_content";
	
	/*
	广告位置id
	*/
	private Integer ap_id ;
	/*
	拥有的广告数
	*/
	private Integer adv_num ;
	/*
	广告类别：0图片1文字2幻灯3Flash
	*/
	private Integer ap_class ;
	/*
	广告展示方式：0幻灯片1多广告展示2单广告展示
	*/
	private Integer ap_display ;
	/*
	广告位高度
	*/
	private Integer ap_height ;
	/*
	广告位单价
	*/
	private Integer ap_price ;
	/*
	广告位宽度
	*/
	private Integer ap_width ;
	/*
	广告位点击率
	*/
	private Integer click_num ;
	/*
	广告位是否启用：0不启用1启用
	*/
	private Integer is_use ;
	/*
	广告位简介
	*/
	private String ap_intro ;
	/*
	广告位置名
	*/
	private String ap_name ;
	/*
	广告位默认内容
	*/
	private String default_content ;
	
	public RaAdvPositionCopy() {
	}
	
	/**
	* 广告位置id
	*@return 
	*/
	public Integer getAp_id(){
		return  ap_id;
	}
	/**
	* 广告位置id
	*@param  ap_id
	*/
	public void setAp_id(Integer ap_id ){
		this.ap_id = ap_id;
	}
	
	/**
	* 拥有的广告数
	*@return 
	*/
	public Integer getAdv_num(){
		return  adv_num;
	}
	/**
	* 拥有的广告数
	*@param  adv_num
	*/
	public void setAdv_num(Integer adv_num ){
		this.adv_num = adv_num;
	}
	
	/**
	* 广告类别：0图片1文字2幻灯3Flash
	*@return 
	*/
	public Integer getAp_class(){
		return  ap_class;
	}
	/**
	* 广告类别：0图片1文字2幻灯3Flash
	*@param  ap_class
	*/
	public void setAp_class(Integer ap_class ){
		this.ap_class = ap_class;
	}
	
	/**
	* 广告展示方式：0幻灯片1多广告展示2单广告展示
	*@return 
	*/
	public Integer getAp_display(){
		return  ap_display;
	}
	/**
	* 广告展示方式：0幻灯片1多广告展示2单广告展示
	*@param  ap_display
	*/
	public void setAp_display(Integer ap_display ){
		this.ap_display = ap_display;
	}
	
	/**
	* 广告位高度
	*@return 
	*/
	public Integer getAp_height(){
		return  ap_height;
	}
	/**
	* 广告位高度
	*@param  ap_height
	*/
	public void setAp_height(Integer ap_height ){
		this.ap_height = ap_height;
	}
	
	/**
	* 广告位单价
	*@return 
	*/
	public Integer getAp_price(){
		return  ap_price;
	}
	/**
	* 广告位单价
	*@param  ap_price
	*/
	public void setAp_price(Integer ap_price ){
		this.ap_price = ap_price;
	}
	
	/**
	* 广告位宽度
	*@return 
	*/
	public Integer getAp_width(){
		return  ap_width;
	}
	/**
	* 广告位宽度
	*@param  ap_width
	*/
	public void setAp_width(Integer ap_width ){
		this.ap_width = ap_width;
	}
	
	/**
	* 广告位点击率
	*@return 
	*/
	public Integer getClick_num(){
		return  click_num;
	}
	/**
	* 广告位点击率
	*@param  click_num
	*/
	public void setClick_num(Integer click_num ){
		this.click_num = click_num;
	}
	
	/**
	* 广告位是否启用：0不启用1启用
	*@return 
	*/
	public Integer getIs_use(){
		return  is_use;
	}
	/**
	* 广告位是否启用：0不启用1启用
	*@param  is_use
	*/
	public void setIs_use(Integer is_use ){
		this.is_use = is_use;
	}
	
	/**
	* 广告位简介
	*@return 
	*/
	public String getAp_intro(){
		return  ap_intro;
	}
	/**
	* 广告位简介
	*@param  ap_intro
	*/
	public void setAp_intro(String ap_intro ){
		this.ap_intro = ap_intro;
	}
	
	/**
	* 广告位置名
	*@return 
	*/
	public String getAp_name(){
		return  ap_name;
	}
	/**
	* 广告位置名
	*@param  ap_name
	*/
	public void setAp_name(String ap_name ){
		this.ap_name = ap_name;
	}
	
	/**
	* 广告位默认内容
	*@return 
	*/
	public String getDefault_content(){
		return  default_content;
	}
	/**
	* 广告位默认内容
	*@param  default_content
	*/
	public void setDefault_content(String default_content ){
		this.default_content = default_content;
	}
	

}
