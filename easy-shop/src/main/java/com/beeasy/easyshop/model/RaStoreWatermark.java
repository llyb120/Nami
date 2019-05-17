package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_store_watermark")
public class RaStoreWatermark   {
	
	// alias
	public static final String ALIAS_wm_id = "wm_id";
	public static final String ALIAS_jpeg_quality = "jpeg_quality";
	public static final String ALIAS_store_id = "store_id";
	public static final String ALIAS_wm_image_pos = "wm_image_pos";
	public static final String ALIAS_wm_image_transition = "wm_image_transition";
	public static final String ALIAS_wm_is_open = "wm_is_open";
	public static final String ALIAS_wm_text_angle = "wm_text_angle";
	public static final String ALIAS_wm_text_pos = "wm_text_pos";
	public static final String ALIAS_wm_text_size = "wm_text_size";
	public static final String ALIAS_wm_image_name = "wm_image_name";
	public static final String ALIAS_wm_text = "wm_text";
	public static final String ALIAS_wm_text_color = "wm_text_color";
	public static final String ALIAS_wm_text_font = "wm_text_font";
	
	/*
	水印id
	*/
	private Integer wm_id ;
	/*
	jpeg图片质量
	*/
	private Integer jpeg_quality ;
	/*
	店铺id
	*/
	private Integer store_id ;
	/*
	水印图片放置的位置
	*/
	private Integer wm_image_pos ;
	/*
	水印图片与原图片的融合度 
	*/
	private Integer wm_image_transition ;
	/*
	水印是否开启 0关闭 1开启
	*/
	private Integer wm_is_open ;
	/*
	水印文字角度
	*/
	private Integer wm_text_angle ;
	/*
	水印文字放置位置
	*/
	private Integer wm_text_pos ;
	/*
	水印文字大小
	*/
	private Integer wm_text_size ;
	/*
	水印图片的路径以及文件名
	*/
	private String wm_image_name ;
	/*
	水印文字
	*/
	private String wm_text ;
	/*
	水印字体的颜色值
	*/
	private String wm_text_color ;
	/*
	水印文字的字体
	*/
	private String wm_text_font ;
	
	public RaStoreWatermark() {
	}
	
	/**
	* 水印id
	*@return 
	*/
	public Integer getWm_id(){
		return  wm_id;
	}
	/**
	* 水印id
	*@param  wm_id
	*/
	public void setWm_id(Integer wm_id ){
		this.wm_id = wm_id;
	}
	
	/**
	* jpeg图片质量
	*@return 
	*/
	public Integer getJpeg_quality(){
		return  jpeg_quality;
	}
	/**
	* jpeg图片质量
	*@param  jpeg_quality
	*/
	public void setJpeg_quality(Integer jpeg_quality ){
		this.jpeg_quality = jpeg_quality;
	}
	
	/**
	* 店铺id
	*@return 
	*/
	public Integer getStore_id(){
		return  store_id;
	}
	/**
	* 店铺id
	*@param  store_id
	*/
	public void setStore_id(Integer store_id ){
		this.store_id = store_id;
	}
	
	/**
	* 水印图片放置的位置
	*@return 
	*/
	public Integer getWm_image_pos(){
		return  wm_image_pos;
	}
	/**
	* 水印图片放置的位置
	*@param  wm_image_pos
	*/
	public void setWm_image_pos(Integer wm_image_pos ){
		this.wm_image_pos = wm_image_pos;
	}
	
	/**
	* 水印图片与原图片的融合度 
	*@return 
	*/
	public Integer getWm_image_transition(){
		return  wm_image_transition;
	}
	/**
	* 水印图片与原图片的融合度 
	*@param  wm_image_transition
	*/
	public void setWm_image_transition(Integer wm_image_transition ){
		this.wm_image_transition = wm_image_transition;
	}
	
	/**
	* 水印是否开启 0关闭 1开启
	*@return 
	*/
	public Integer getWm_is_open(){
		return  wm_is_open;
	}
	/**
	* 水印是否开启 0关闭 1开启
	*@param  wm_is_open
	*/
	public void setWm_is_open(Integer wm_is_open ){
		this.wm_is_open = wm_is_open;
	}
	
	/**
	* 水印文字角度
	*@return 
	*/
	public Integer getWm_text_angle(){
		return  wm_text_angle;
	}
	/**
	* 水印文字角度
	*@param  wm_text_angle
	*/
	public void setWm_text_angle(Integer wm_text_angle ){
		this.wm_text_angle = wm_text_angle;
	}
	
	/**
	* 水印文字放置位置
	*@return 
	*/
	public Integer getWm_text_pos(){
		return  wm_text_pos;
	}
	/**
	* 水印文字放置位置
	*@param  wm_text_pos
	*/
	public void setWm_text_pos(Integer wm_text_pos ){
		this.wm_text_pos = wm_text_pos;
	}
	
	/**
	* 水印文字大小
	*@return 
	*/
	public Integer getWm_text_size(){
		return  wm_text_size;
	}
	/**
	* 水印文字大小
	*@param  wm_text_size
	*/
	public void setWm_text_size(Integer wm_text_size ){
		this.wm_text_size = wm_text_size;
	}
	
	/**
	* 水印图片的路径以及文件名
	*@return 
	*/
	public String getWm_image_name(){
		return  wm_image_name;
	}
	/**
	* 水印图片的路径以及文件名
	*@param  wm_image_name
	*/
	public void setWm_image_name(String wm_image_name ){
		this.wm_image_name = wm_image_name;
	}
	
	/**
	* 水印文字
	*@return 
	*/
	public String getWm_text(){
		return  wm_text;
	}
	/**
	* 水印文字
	*@param  wm_text
	*/
	public void setWm_text(String wm_text ){
		this.wm_text = wm_text;
	}
	
	/**
	* 水印字体的颜色值
	*@return 
	*/
	public String getWm_text_color(){
		return  wm_text_color;
	}
	/**
	* 水印字体的颜色值
	*@param  wm_text_color
	*/
	public void setWm_text_color(String wm_text_color ){
		this.wm_text_color = wm_text_color;
	}
	
	/**
	* 水印文字的字体
	*@return 
	*/
	public String getWm_text_font(){
		return  wm_text_font;
	}
	/**
	* 水印文字的字体
	*@param  wm_text_font
	*/
	public void setWm_text_font(String wm_text_font ){
		this.wm_text_font = wm_text_font;
	}
	

}
