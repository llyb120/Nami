package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_points_cart")
public class RaPointsCart   {
	
	// alias
	public static final String ALIAS_pcart_id = "pcart_id";
	public static final String ALIAS_pgoods_choosenum = "pgoods_choosenum";
	public static final String ALIAS_pgoods_id = "pgoods_id";
	public static final String ALIAS_pgoods_points = "pgoods_points";
	public static final String ALIAS_pmember_id = "pmember_id";
	public static final String ALIAS_pgoods_image = "pgoods_image";
	public static final String ALIAS_pgoods_name = "pgoods_name";
	
	/*
	自增ID
	*/
	private Integer pcart_id ;
	/*
	选择积分礼品数量
	*/
	private Integer pgoods_choosenum ;
	/*
	积分礼品序号
	*/
	private Integer pgoods_id ;
	/*
	积分礼品兑换积分
	*/
	private Integer pgoods_points ;
	/*
	会员编号
	*/
	private Integer pmember_id ;
	/*
	积分礼品图片
	*/
	private String pgoods_image ;
	/*
	积分礼品名称
	*/
	private String pgoods_name ;
	
	public RaPointsCart() {
	}
	
	/**
	* 自增ID
	*@return 
	*/
	public Integer getPcart_id(){
		return  pcart_id;
	}
	/**
	* 自增ID
	*@param  pcart_id
	*/
	public void setPcart_id(Integer pcart_id ){
		this.pcart_id = pcart_id;
	}
	
	/**
	* 选择积分礼品数量
	*@return 
	*/
	public Integer getPgoods_choosenum(){
		return  pgoods_choosenum;
	}
	/**
	* 选择积分礼品数量
	*@param  pgoods_choosenum
	*/
	public void setPgoods_choosenum(Integer pgoods_choosenum ){
		this.pgoods_choosenum = pgoods_choosenum;
	}
	
	/**
	* 积分礼品序号
	*@return 
	*/
	public Integer getPgoods_id(){
		return  pgoods_id;
	}
	/**
	* 积分礼品序号
	*@param  pgoods_id
	*/
	public void setPgoods_id(Integer pgoods_id ){
		this.pgoods_id = pgoods_id;
	}
	
	/**
	* 积分礼品兑换积分
	*@return 
	*/
	public Integer getPgoods_points(){
		return  pgoods_points;
	}
	/**
	* 积分礼品兑换积分
	*@param  pgoods_points
	*/
	public void setPgoods_points(Integer pgoods_points ){
		this.pgoods_points = pgoods_points;
	}
	
	/**
	* 会员编号
	*@return 
	*/
	public Integer getPmember_id(){
		return  pmember_id;
	}
	/**
	* 会员编号
	*@param  pmember_id
	*/
	public void setPmember_id(Integer pmember_id ){
		this.pmember_id = pmember_id;
	}
	
	/**
	* 积分礼品图片
	*@return 
	*/
	public String getPgoods_image(){
		return  pgoods_image;
	}
	/**
	* 积分礼品图片
	*@param  pgoods_image
	*/
	public void setPgoods_image(String pgoods_image ){
		this.pgoods_image = pgoods_image;
	}
	
	/**
	* 积分礼品名称
	*@return 
	*/
	public String getPgoods_name(){
		return  pgoods_name;
	}
	/**
	* 积分礼品名称
	*@param  pgoods_name
	*/
	public void setPgoods_name(String pgoods_name ){
		this.pgoods_name = pgoods_name;
	}
	

}
