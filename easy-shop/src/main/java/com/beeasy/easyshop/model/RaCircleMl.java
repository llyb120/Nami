package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_circle_ml")
public class RaCircleMl   {
	
	// alias
	public static final String ALIAS_circle_id = "circle_id";
	public static final String ALIAS_mlref_id = "mlref_id";
	public static final String ALIAS_ml_1 = "ml_1";
	public static final String ALIAS_ml_10 = "ml_10";
	public static final String ALIAS_ml_11 = "ml_11";
	public static final String ALIAS_ml_12 = "ml_12";
	public static final String ALIAS_ml_13 = "ml_13";
	public static final String ALIAS_ml_14 = "ml_14";
	public static final String ALIAS_ml_15 = "ml_15";
	public static final String ALIAS_ml_16 = "ml_16";
	public static final String ALIAS_ml_2 = "ml_2";
	public static final String ALIAS_ml_3 = "ml_3";
	public static final String ALIAS_ml_4 = "ml_4";
	public static final String ALIAS_ml_5 = "ml_5";
	public static final String ALIAS_ml_6 = "ml_6";
	public static final String ALIAS_ml_7 = "ml_7";
	public static final String ALIAS_ml_8 = "ml_8";
	public static final String ALIAS_ml_9 = "ml_9";
	
	/*
	圈子id
	*/
	private Integer circle_id ;
	/*
	参考头衔id 0为默认 null为自定义
	*/
	private Integer mlref_id ;
	/*
	1级头衔名称
	*/
	private String ml_1 ;
	/*
	10级头衔名称
	*/
	private String ml_10 ;
	/*
	11级头衔名称
	*/
	private String ml_11 ;
	/*
	12级头衔名称
	*/
	private String ml_12 ;
	/*
	13级头衔名称
	*/
	private String ml_13 ;
	/*
	14级头衔名称
	*/
	private String ml_14 ;
	/*
	15级头衔名称
	*/
	private String ml_15 ;
	/*
	16级头衔名称
	*/
	private String ml_16 ;
	/*
	2级头衔名称
	*/
	private String ml_2 ;
	/*
	3级头衔名称
	*/
	private String ml_3 ;
	/*
	4级头衔名称
	*/
	private String ml_4 ;
	/*
	5级头衔名称
	*/
	private String ml_5 ;
	/*
	6级头衔名称
	*/
	private String ml_6 ;
	/*
	7级头衔名称
	*/
	private String ml_7 ;
	/*
	8级头衔名称
	*/
	private String ml_8 ;
	/*
	9级头衔名称
	*/
	private String ml_9 ;
	
	public RaCircleMl() {
	}
	
	/**
	* 圈子id
	*@return 
	*/
	public Integer getCircle_id(){
		return  circle_id;
	}
	/**
	* 圈子id
	*@param  circle_id
	*/
	public void setCircle_id(Integer circle_id ){
		this.circle_id = circle_id;
	}
	
	/**
	* 参考头衔id 0为默认 null为自定义
	*@return 
	*/
	public Integer getMlref_id(){
		return  mlref_id;
	}
	/**
	* 参考头衔id 0为默认 null为自定义
	*@param  mlref_id
	*/
	public void setMlref_id(Integer mlref_id ){
		this.mlref_id = mlref_id;
	}
	
	/**
	* 1级头衔名称
	*@return 
	*/
	public String getMl_1(){
		return  ml_1;
	}
	/**
	* 1级头衔名称
	*@param  ml_1
	*/
	public void setMl_1(String ml_1 ){
		this.ml_1 = ml_1;
	}
	
	/**
	* 10级头衔名称
	*@return 
	*/
	public String getMl_10(){
		return  ml_10;
	}
	/**
	* 10级头衔名称
	*@param  ml_10
	*/
	public void setMl_10(String ml_10 ){
		this.ml_10 = ml_10;
	}
	
	/**
	* 11级头衔名称
	*@return 
	*/
	public String getMl_11(){
		return  ml_11;
	}
	/**
	* 11级头衔名称
	*@param  ml_11
	*/
	public void setMl_11(String ml_11 ){
		this.ml_11 = ml_11;
	}
	
	/**
	* 12级头衔名称
	*@return 
	*/
	public String getMl_12(){
		return  ml_12;
	}
	/**
	* 12级头衔名称
	*@param  ml_12
	*/
	public void setMl_12(String ml_12 ){
		this.ml_12 = ml_12;
	}
	
	/**
	* 13级头衔名称
	*@return 
	*/
	public String getMl_13(){
		return  ml_13;
	}
	/**
	* 13级头衔名称
	*@param  ml_13
	*/
	public void setMl_13(String ml_13 ){
		this.ml_13 = ml_13;
	}
	
	/**
	* 14级头衔名称
	*@return 
	*/
	public String getMl_14(){
		return  ml_14;
	}
	/**
	* 14级头衔名称
	*@param  ml_14
	*/
	public void setMl_14(String ml_14 ){
		this.ml_14 = ml_14;
	}
	
	/**
	* 15级头衔名称
	*@return 
	*/
	public String getMl_15(){
		return  ml_15;
	}
	/**
	* 15级头衔名称
	*@param  ml_15
	*/
	public void setMl_15(String ml_15 ){
		this.ml_15 = ml_15;
	}
	
	/**
	* 16级头衔名称
	*@return 
	*/
	public String getMl_16(){
		return  ml_16;
	}
	/**
	* 16级头衔名称
	*@param  ml_16
	*/
	public void setMl_16(String ml_16 ){
		this.ml_16 = ml_16;
	}
	
	/**
	* 2级头衔名称
	*@return 
	*/
	public String getMl_2(){
		return  ml_2;
	}
	/**
	* 2级头衔名称
	*@param  ml_2
	*/
	public void setMl_2(String ml_2 ){
		this.ml_2 = ml_2;
	}
	
	/**
	* 3级头衔名称
	*@return 
	*/
	public String getMl_3(){
		return  ml_3;
	}
	/**
	* 3级头衔名称
	*@param  ml_3
	*/
	public void setMl_3(String ml_3 ){
		this.ml_3 = ml_3;
	}
	
	/**
	* 4级头衔名称
	*@return 
	*/
	public String getMl_4(){
		return  ml_4;
	}
	/**
	* 4级头衔名称
	*@param  ml_4
	*/
	public void setMl_4(String ml_4 ){
		this.ml_4 = ml_4;
	}
	
	/**
	* 5级头衔名称
	*@return 
	*/
	public String getMl_5(){
		return  ml_5;
	}
	/**
	* 5级头衔名称
	*@param  ml_5
	*/
	public void setMl_5(String ml_5 ){
		this.ml_5 = ml_5;
	}
	
	/**
	* 6级头衔名称
	*@return 
	*/
	public String getMl_6(){
		return  ml_6;
	}
	/**
	* 6级头衔名称
	*@param  ml_6
	*/
	public void setMl_6(String ml_6 ){
		this.ml_6 = ml_6;
	}
	
	/**
	* 7级头衔名称
	*@return 
	*/
	public String getMl_7(){
		return  ml_7;
	}
	/**
	* 7级头衔名称
	*@param  ml_7
	*/
	public void setMl_7(String ml_7 ){
		this.ml_7 = ml_7;
	}
	
	/**
	* 8级头衔名称
	*@return 
	*/
	public String getMl_8(){
		return  ml_8;
	}
	/**
	* 8级头衔名称
	*@param  ml_8
	*/
	public void setMl_8(String ml_8 ){
		this.ml_8 = ml_8;
	}
	
	/**
	* 9级头衔名称
	*@return 
	*/
	public String getMl_9(){
		return  ml_9;
	}
	/**
	* 9级头衔名称
	*@param  ml_9
	*/
	public void setMl_9(String ml_9 ){
		this.ml_9 = ml_9;
	}
	

}
