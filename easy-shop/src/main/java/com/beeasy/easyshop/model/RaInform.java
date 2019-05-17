package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_inform")
public class RaInform   {
	
	// alias
	public static final String ALIAS_inform_id = "inform_id";
	public static final String ALIAS_inform_datetime = "inform_datetime";
	public static final String ALIAS_inform_goods_id = "inform_goods_id";
	public static final String ALIAS_inform_handle_datetime = "inform_handle_datetime";
	public static final String ALIAS_inform_handle_member_id = "inform_handle_member_id";
	public static final String ALIAS_inform_handle_type = "inform_handle_type";
	public static final String ALIAS_inform_member_id = "inform_member_id";
	public static final String ALIAS_inform_state = "inform_state";
	public static final String ALIAS_inform_store_id = "inform_store_id";
	public static final String ALIAS_inform_subject_id = "inform_subject_id";
	public static final String ALIAS_inform_content = "inform_content";
	public static final String ALIAS_inform_goods_image = "inform_goods_image";
	public static final String ALIAS_inform_goods_name = "inform_goods_name";
	public static final String ALIAS_inform_handle_message = "inform_handle_message";
	public static final String ALIAS_inform_member_name = "inform_member_name";
	public static final String ALIAS_inform_pic1 = "inform_pic1";
	public static final String ALIAS_inform_pic2 = "inform_pic2";
	public static final String ALIAS_inform_pic3 = "inform_pic3";
	public static final String ALIAS_inform_store_name = "inform_store_name";
	public static final String ALIAS_inform_subject_content = "inform_subject_content";
	
	/*
	举报id
	*/
	private Integer inform_id ;
	/*
	举报时间
	*/
	private Integer inform_datetime ;
	/*
	被举报的商品id
	*/
	private Integer inform_goods_id ;
	/*
	举报处理时间
	*/
	private Integer inform_handle_datetime ;
	/*
	管理员id
	*/
	private Integer inform_handle_member_id ;
	/*
	举报处理结果(1无效举报/2恶意举报/3有效举报)
	*/
	private Integer inform_handle_type ;
	/*
	举报人id
	*/
	private Integer inform_member_id ;
	/*
	举报状态(1未处理/2已处理)
	*/
	private Integer inform_state ;
	/*
	被举报商品的店铺id
	*/
	private Integer inform_store_id ;
	/*
	举报主题id
	*/
	private Integer inform_subject_id ;
	/*
	举报信息
	*/
	private String inform_content ;
	/*
	商品图
	*/
	private String inform_goods_image ;
	/*
	被举报的商品名称
	*/
	private String inform_goods_name ;
	/*
	举报处理信息
	*/
	private String inform_handle_message ;
	/*
	举报人会员名
	*/
	private String inform_member_name ;
	/*
	图片1
	*/
	private String inform_pic1 ;
	/*
	图片2
	*/
	private String inform_pic2 ;
	/*
	图片3
	*/
	private String inform_pic3 ;
	/*
	店铺名
	*/
	private String inform_store_name ;
	/*
	举报主题
	*/
	private String inform_subject_content ;
	
	public RaInform() {
	}
	
	/**
	* 举报id
	*@return 
	*/
	public Integer getInform_id(){
		return  inform_id;
	}
	/**
	* 举报id
	*@param  inform_id
	*/
	public void setInform_id(Integer inform_id ){
		this.inform_id = inform_id;
	}
	
	/**
	* 举报时间
	*@return 
	*/
	public Integer getInform_datetime(){
		return  inform_datetime;
	}
	/**
	* 举报时间
	*@param  inform_datetime
	*/
	public void setInform_datetime(Integer inform_datetime ){
		this.inform_datetime = inform_datetime;
	}
	
	/**
	* 被举报的商品id
	*@return 
	*/
	public Integer getInform_goods_id(){
		return  inform_goods_id;
	}
	/**
	* 被举报的商品id
	*@param  inform_goods_id
	*/
	public void setInform_goods_id(Integer inform_goods_id ){
		this.inform_goods_id = inform_goods_id;
	}
	
	/**
	* 举报处理时间
	*@return 
	*/
	public Integer getInform_handle_datetime(){
		return  inform_handle_datetime;
	}
	/**
	* 举报处理时间
	*@param  inform_handle_datetime
	*/
	public void setInform_handle_datetime(Integer inform_handle_datetime ){
		this.inform_handle_datetime = inform_handle_datetime;
	}
	
	/**
	* 管理员id
	*@return 
	*/
	public Integer getInform_handle_member_id(){
		return  inform_handle_member_id;
	}
	/**
	* 管理员id
	*@param  inform_handle_member_id
	*/
	public void setInform_handle_member_id(Integer inform_handle_member_id ){
		this.inform_handle_member_id = inform_handle_member_id;
	}
	
	/**
	* 举报处理结果(1无效举报/2恶意举报/3有效举报)
	*@return 
	*/
	public Integer getInform_handle_type(){
		return  inform_handle_type;
	}
	/**
	* 举报处理结果(1无效举报/2恶意举报/3有效举报)
	*@param  inform_handle_type
	*/
	public void setInform_handle_type(Integer inform_handle_type ){
		this.inform_handle_type = inform_handle_type;
	}
	
	/**
	* 举报人id
	*@return 
	*/
	public Integer getInform_member_id(){
		return  inform_member_id;
	}
	/**
	* 举报人id
	*@param  inform_member_id
	*/
	public void setInform_member_id(Integer inform_member_id ){
		this.inform_member_id = inform_member_id;
	}
	
	/**
	* 举报状态(1未处理/2已处理)
	*@return 
	*/
	public Integer getInform_state(){
		return  inform_state;
	}
	/**
	* 举报状态(1未处理/2已处理)
	*@param  inform_state
	*/
	public void setInform_state(Integer inform_state ){
		this.inform_state = inform_state;
	}
	
	/**
	* 被举报商品的店铺id
	*@return 
	*/
	public Integer getInform_store_id(){
		return  inform_store_id;
	}
	/**
	* 被举报商品的店铺id
	*@param  inform_store_id
	*/
	public void setInform_store_id(Integer inform_store_id ){
		this.inform_store_id = inform_store_id;
	}
	
	/**
	* 举报主题id
	*@return 
	*/
	public Integer getInform_subject_id(){
		return  inform_subject_id;
	}
	/**
	* 举报主题id
	*@param  inform_subject_id
	*/
	public void setInform_subject_id(Integer inform_subject_id ){
		this.inform_subject_id = inform_subject_id;
	}
	
	/**
	* 举报信息
	*@return 
	*/
	public String getInform_content(){
		return  inform_content;
	}
	/**
	* 举报信息
	*@param  inform_content
	*/
	public void setInform_content(String inform_content ){
		this.inform_content = inform_content;
	}
	
	/**
	* 商品图
	*@return 
	*/
	public String getInform_goods_image(){
		return  inform_goods_image;
	}
	/**
	* 商品图
	*@param  inform_goods_image
	*/
	public void setInform_goods_image(String inform_goods_image ){
		this.inform_goods_image = inform_goods_image;
	}
	
	/**
	* 被举报的商品名称
	*@return 
	*/
	public String getInform_goods_name(){
		return  inform_goods_name;
	}
	/**
	* 被举报的商品名称
	*@param  inform_goods_name
	*/
	public void setInform_goods_name(String inform_goods_name ){
		this.inform_goods_name = inform_goods_name;
	}
	
	/**
	* 举报处理信息
	*@return 
	*/
	public String getInform_handle_message(){
		return  inform_handle_message;
	}
	/**
	* 举报处理信息
	*@param  inform_handle_message
	*/
	public void setInform_handle_message(String inform_handle_message ){
		this.inform_handle_message = inform_handle_message;
	}
	
	/**
	* 举报人会员名
	*@return 
	*/
	public String getInform_member_name(){
		return  inform_member_name;
	}
	/**
	* 举报人会员名
	*@param  inform_member_name
	*/
	public void setInform_member_name(String inform_member_name ){
		this.inform_member_name = inform_member_name;
	}
	
	/**
	* 图片1
	*@return 
	*/
	public String getInform_pic1(){
		return  inform_pic1;
	}
	/**
	* 图片1
	*@param  inform_pic1
	*/
	public void setInform_pic1(String inform_pic1 ){
		this.inform_pic1 = inform_pic1;
	}
	
	/**
	* 图片2
	*@return 
	*/
	public String getInform_pic2(){
		return  inform_pic2;
	}
	/**
	* 图片2
	*@param  inform_pic2
	*/
	public void setInform_pic2(String inform_pic2 ){
		this.inform_pic2 = inform_pic2;
	}
	
	/**
	* 图片3
	*@return 
	*/
	public String getInform_pic3(){
		return  inform_pic3;
	}
	/**
	* 图片3
	*@param  inform_pic3
	*/
	public void setInform_pic3(String inform_pic3 ){
		this.inform_pic3 = inform_pic3;
	}
	
	/**
	* 店铺名
	*@return 
	*/
	public String getInform_store_name(){
		return  inform_store_name;
	}
	/**
	* 店铺名
	*@param  inform_store_name
	*/
	public void setInform_store_name(String inform_store_name ){
		this.inform_store_name = inform_store_name;
	}
	
	/**
	* 举报主题
	*@return 
	*/
	public String getInform_subject_content(){
		return  inform_subject_content;
	}
	/**
	* 举报主题
	*@param  inform_subject_content
	*/
	public void setInform_subject_content(String inform_subject_content ){
		this.inform_subject_content = inform_subject_content;
	}
	

}
