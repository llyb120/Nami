package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_complain")
public class RaComplain   {
	
	// alias
	public static final String ALIAS_complain_id = "complain_id";
	public static final String ALIAS_accused_id = "accused_id";
	public static final String ALIAS_accuser_id = "accuser_id";
	public static final String ALIAS_appeal_datetime = "appeal_datetime";
	public static final String ALIAS_complain_active = "complain_active";
	public static final String ALIAS_complain_datetime = "complain_datetime";
	public static final String ALIAS_complain_handle_datetime = "complain_handle_datetime";
	public static final String ALIAS_complain_handle_member_id = "complain_handle_member_id";
	public static final String ALIAS_complain_state = "complain_state";
	public static final String ALIAS_complain_subject_id = "complain_subject_id";
	public static final String ALIAS_final_handle_datetime = "final_handle_datetime";
	public static final String ALIAS_final_handle_member_id = "final_handle_member_id";
	public static final String ALIAS_order_goods_id = "order_goods_id";
	public static final String ALIAS_order_id = "order_id";
	public static final String ALIAS_accused_name = "accused_name";
	public static final String ALIAS_accuser_name = "accuser_name";
	public static final String ALIAS_appeal_message = "appeal_message";
	public static final String ALIAS_appeal_pic1 = "appeal_pic1";
	public static final String ALIAS_appeal_pic2 = "appeal_pic2";
	public static final String ALIAS_appeal_pic3 = "appeal_pic3";
	public static final String ALIAS_complain_content = "complain_content";
	public static final String ALIAS_complain_pic1 = "complain_pic1";
	public static final String ALIAS_complain_pic2 = "complain_pic2";
	public static final String ALIAS_complain_pic3 = "complain_pic3";
	public static final String ALIAS_complain_subject_content = "complain_subject_content";
	public static final String ALIAS_final_handle_message = "final_handle_message";
	
	/*
	投诉id
	*/
	private Integer complain_id ;
	/*
	被告id
	*/
	private Integer accused_id ;
	/*
	原告id
	*/
	private Integer accuser_id ;
	/*
	申诉时间
	*/
	private Integer appeal_datetime ;
	/*
	投诉是否通过平台审批(1未通过/2通过)
	*/
	private Integer complain_active ;
	/*
	投诉时间
	*/
	private Integer complain_datetime ;
	/*
	投诉处理时间
	*/
	private Integer complain_handle_datetime ;
	/*
	投诉处理人id
	*/
	private Integer complain_handle_member_id ;
	/*
	投诉状态(10-新投诉/20-投诉通过转给被投诉人/30-被投诉人已申诉/40-提交仲裁/99-已关闭)
	*/
	private Integer complain_state ;
	/*
	投诉主题id
	*/
	private Integer complain_subject_id ;
	/*
	最终处理时间
	*/
	private Integer final_handle_datetime ;
	/*
	最终处理人id
	*/
	private Integer final_handle_member_id ;
	/*
	订单商品ID
	*/
	private Integer order_goods_id ;
	/*
	订单id
	*/
	private Integer order_id ;
	/*
	被告名称
	*/
	private String accused_name ;
	/*
	原告名称
	*/
	private String accuser_name ;
	/*
	申诉内容
	*/
	private String appeal_message ;
	/*
	申诉图片1
	*/
	private String appeal_pic1 ;
	/*
	申诉图片2
	*/
	private String appeal_pic2 ;
	/*
	申诉图片3
	*/
	private String appeal_pic3 ;
	/*
	投诉内容
	*/
	private String complain_content ;
	/*
	投诉图片1
	*/
	private String complain_pic1 ;
	/*
	投诉图片2
	*/
	private String complain_pic2 ;
	/*
	投诉图片3
	*/
	private String complain_pic3 ;
	/*
	投诉主题
	*/
	private String complain_subject_content ;
	/*
	最终处理意见
	*/
	private String final_handle_message ;
	
	public RaComplain() {
	}
	
	/**
	* 投诉id
	*@return 
	*/
	public Integer getComplain_id(){
		return  complain_id;
	}
	/**
	* 投诉id
	*@param  complain_id
	*/
	public void setComplain_id(Integer complain_id ){
		this.complain_id = complain_id;
	}
	
	/**
	* 被告id
	*@return 
	*/
	public Integer getAccused_id(){
		return  accused_id;
	}
	/**
	* 被告id
	*@param  accused_id
	*/
	public void setAccused_id(Integer accused_id ){
		this.accused_id = accused_id;
	}
	
	/**
	* 原告id
	*@return 
	*/
	public Integer getAccuser_id(){
		return  accuser_id;
	}
	/**
	* 原告id
	*@param  accuser_id
	*/
	public void setAccuser_id(Integer accuser_id ){
		this.accuser_id = accuser_id;
	}
	
	/**
	* 申诉时间
	*@return 
	*/
	public Integer getAppeal_datetime(){
		return  appeal_datetime;
	}
	/**
	* 申诉时间
	*@param  appeal_datetime
	*/
	public void setAppeal_datetime(Integer appeal_datetime ){
		this.appeal_datetime = appeal_datetime;
	}
	
	/**
	* 投诉是否通过平台审批(1未通过/2通过)
	*@return 
	*/
	public Integer getComplain_active(){
		return  complain_active;
	}
	/**
	* 投诉是否通过平台审批(1未通过/2通过)
	*@param  complain_active
	*/
	public void setComplain_active(Integer complain_active ){
		this.complain_active = complain_active;
	}
	
	/**
	* 投诉时间
	*@return 
	*/
	public Integer getComplain_datetime(){
		return  complain_datetime;
	}
	/**
	* 投诉时间
	*@param  complain_datetime
	*/
	public void setComplain_datetime(Integer complain_datetime ){
		this.complain_datetime = complain_datetime;
	}
	
	/**
	* 投诉处理时间
	*@return 
	*/
	public Integer getComplain_handle_datetime(){
		return  complain_handle_datetime;
	}
	/**
	* 投诉处理时间
	*@param  complain_handle_datetime
	*/
	public void setComplain_handle_datetime(Integer complain_handle_datetime ){
		this.complain_handle_datetime = complain_handle_datetime;
	}
	
	/**
	* 投诉处理人id
	*@return 
	*/
	public Integer getComplain_handle_member_id(){
		return  complain_handle_member_id;
	}
	/**
	* 投诉处理人id
	*@param  complain_handle_member_id
	*/
	public void setComplain_handle_member_id(Integer complain_handle_member_id ){
		this.complain_handle_member_id = complain_handle_member_id;
	}
	
	/**
	* 投诉状态(10-新投诉/20-投诉通过转给被投诉人/30-被投诉人已申诉/40-提交仲裁/99-已关闭)
	*@return 
	*/
	public Integer getComplain_state(){
		return  complain_state;
	}
	/**
	* 投诉状态(10-新投诉/20-投诉通过转给被投诉人/30-被投诉人已申诉/40-提交仲裁/99-已关闭)
	*@param  complain_state
	*/
	public void setComplain_state(Integer complain_state ){
		this.complain_state = complain_state;
	}
	
	/**
	* 投诉主题id
	*@return 
	*/
	public Integer getComplain_subject_id(){
		return  complain_subject_id;
	}
	/**
	* 投诉主题id
	*@param  complain_subject_id
	*/
	public void setComplain_subject_id(Integer complain_subject_id ){
		this.complain_subject_id = complain_subject_id;
	}
	
	/**
	* 最终处理时间
	*@return 
	*/
	public Integer getFinal_handle_datetime(){
		return  final_handle_datetime;
	}
	/**
	* 最终处理时间
	*@param  final_handle_datetime
	*/
	public void setFinal_handle_datetime(Integer final_handle_datetime ){
		this.final_handle_datetime = final_handle_datetime;
	}
	
	/**
	* 最终处理人id
	*@return 
	*/
	public Integer getFinal_handle_member_id(){
		return  final_handle_member_id;
	}
	/**
	* 最终处理人id
	*@param  final_handle_member_id
	*/
	public void setFinal_handle_member_id(Integer final_handle_member_id ){
		this.final_handle_member_id = final_handle_member_id;
	}
	
	/**
	* 订单商品ID
	*@return 
	*/
	public Integer getOrder_goods_id(){
		return  order_goods_id;
	}
	/**
	* 订单商品ID
	*@param  order_goods_id
	*/
	public void setOrder_goods_id(Integer order_goods_id ){
		this.order_goods_id = order_goods_id;
	}
	
	/**
	* 订单id
	*@return 
	*/
	public Integer getOrder_id(){
		return  order_id;
	}
	/**
	* 订单id
	*@param  order_id
	*/
	public void setOrder_id(Integer order_id ){
		this.order_id = order_id;
	}
	
	/**
	* 被告名称
	*@return 
	*/
	public String getAccused_name(){
		return  accused_name;
	}
	/**
	* 被告名称
	*@param  accused_name
	*/
	public void setAccused_name(String accused_name ){
		this.accused_name = accused_name;
	}
	
	/**
	* 原告名称
	*@return 
	*/
	public String getAccuser_name(){
		return  accuser_name;
	}
	/**
	* 原告名称
	*@param  accuser_name
	*/
	public void setAccuser_name(String accuser_name ){
		this.accuser_name = accuser_name;
	}
	
	/**
	* 申诉内容
	*@return 
	*/
	public String getAppeal_message(){
		return  appeal_message;
	}
	/**
	* 申诉内容
	*@param  appeal_message
	*/
	public void setAppeal_message(String appeal_message ){
		this.appeal_message = appeal_message;
	}
	
	/**
	* 申诉图片1
	*@return 
	*/
	public String getAppeal_pic1(){
		return  appeal_pic1;
	}
	/**
	* 申诉图片1
	*@param  appeal_pic1
	*/
	public void setAppeal_pic1(String appeal_pic1 ){
		this.appeal_pic1 = appeal_pic1;
	}
	
	/**
	* 申诉图片2
	*@return 
	*/
	public String getAppeal_pic2(){
		return  appeal_pic2;
	}
	/**
	* 申诉图片2
	*@param  appeal_pic2
	*/
	public void setAppeal_pic2(String appeal_pic2 ){
		this.appeal_pic2 = appeal_pic2;
	}
	
	/**
	* 申诉图片3
	*@return 
	*/
	public String getAppeal_pic3(){
		return  appeal_pic3;
	}
	/**
	* 申诉图片3
	*@param  appeal_pic3
	*/
	public void setAppeal_pic3(String appeal_pic3 ){
		this.appeal_pic3 = appeal_pic3;
	}
	
	/**
	* 投诉内容
	*@return 
	*/
	public String getComplain_content(){
		return  complain_content;
	}
	/**
	* 投诉内容
	*@param  complain_content
	*/
	public void setComplain_content(String complain_content ){
		this.complain_content = complain_content;
	}
	
	/**
	* 投诉图片1
	*@return 
	*/
	public String getComplain_pic1(){
		return  complain_pic1;
	}
	/**
	* 投诉图片1
	*@param  complain_pic1
	*/
	public void setComplain_pic1(String complain_pic1 ){
		this.complain_pic1 = complain_pic1;
	}
	
	/**
	* 投诉图片2
	*@return 
	*/
	public String getComplain_pic2(){
		return  complain_pic2;
	}
	/**
	* 投诉图片2
	*@param  complain_pic2
	*/
	public void setComplain_pic2(String complain_pic2 ){
		this.complain_pic2 = complain_pic2;
	}
	
	/**
	* 投诉图片3
	*@return 
	*/
	public String getComplain_pic3(){
		return  complain_pic3;
	}
	/**
	* 投诉图片3
	*@param  complain_pic3
	*/
	public void setComplain_pic3(String complain_pic3 ){
		this.complain_pic3 = complain_pic3;
	}
	
	/**
	* 投诉主题
	*@return 
	*/
	public String getComplain_subject_content(){
		return  complain_subject_content;
	}
	/**
	* 投诉主题
	*@param  complain_subject_content
	*/
	public void setComplain_subject_content(String complain_subject_content ){
		this.complain_subject_content = complain_subject_content;
	}
	
	/**
	* 最终处理意见
	*@return 
	*/
	public String getFinal_handle_message(){
		return  final_handle_message;
	}
	/**
	* 最终处理意见
	*@param  final_handle_message
	*/
	public void setFinal_handle_message(String final_handle_message ){
		this.final_handle_message = final_handle_message;
	}
	

}
