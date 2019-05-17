package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_circle_mlref")
public class RaCircleMlref   {
	
	// alias
	public static final String ALIAS_mlref_id = "mlref_id";
	public static final String ALIAS_mlref_status = "mlref_status";
	public static final String ALIAS_mlref_1 = "mlref_1";
	public static final String ALIAS_mlref_10 = "mlref_10";
	public static final String ALIAS_mlref_11 = "mlref_11";
	public static final String ALIAS_mlref_12 = "mlref_12";
	public static final String ALIAS_mlref_13 = "mlref_13";
	public static final String ALIAS_mlref_14 = "mlref_14";
	public static final String ALIAS_mlref_15 = "mlref_15";
	public static final String ALIAS_mlref_16 = "mlref_16";
	public static final String ALIAS_mlref_2 = "mlref_2";
	public static final String ALIAS_mlref_3 = "mlref_3";
	public static final String ALIAS_mlref_4 = "mlref_4";
	public static final String ALIAS_mlref_5 = "mlref_5";
	public static final String ALIAS_mlref_6 = "mlref_6";
	public static final String ALIAS_mlref_7 = "mlref_7";
	public static final String ALIAS_mlref_8 = "mlref_8";
	public static final String ALIAS_mlref_9 = "mlref_9";
	public static final String ALIAS_mlref_addtime = "mlref_addtime";
	public static final String ALIAS_mlref_name = "mlref_name";
	
	/*
	参考头衔id
	*/
	private Integer mlref_id ;
	/*
	状态
	*/
	private Integer mlref_status ;
	/*
	1级头衔名称
	*/
	private String mlref_1 ;
	/*
	10级头衔名称
	*/
	private String mlref_10 ;
	/*
	11级头衔名称
	*/
	private String mlref_11 ;
	/*
	12级头衔名称
	*/
	private String mlref_12 ;
	/*
	13级头衔名称
	*/
	private String mlref_13 ;
	/*
	14级头衔名称
	*/
	private String mlref_14 ;
	/*
	15级头衔名称
	*/
	private String mlref_15 ;
	/*
	16级头衔名称
	*/
	private String mlref_16 ;
	/*
	2级头衔名称
	*/
	private String mlref_2 ;
	/*
	3级头衔名称
	*/
	private String mlref_3 ;
	/*
	4级头衔名称
	*/
	private String mlref_4 ;
	/*
	5级头衔名称
	*/
	private String mlref_5 ;
	/*
	6级头衔名称
	*/
	private String mlref_6 ;
	/*
	7级头衔名称
	*/
	private String mlref_7 ;
	/*
	8级头衔名称
	*/
	private String mlref_8 ;
	/*
	9级头衔名称
	*/
	private String mlref_9 ;
	/*
	创建时间
	*/
	private String mlref_addtime ;
	/*
	参考头衔名称
	*/
	private String mlref_name ;
	
	public RaCircleMlref() {
	}
	
	/**
	* 参考头衔id
	*@return 
	*/
	public Integer getMlref_id(){
		return  mlref_id;
	}
	/**
	* 参考头衔id
	*@param  mlref_id
	*/
	public void setMlref_id(Integer mlref_id ){
		this.mlref_id = mlref_id;
	}
	
	/**
	* 状态
	*@return 
	*/
	public Integer getMlref_status(){
		return  mlref_status;
	}
	/**
	* 状态
	*@param  mlref_status
	*/
	public void setMlref_status(Integer mlref_status ){
		this.mlref_status = mlref_status;
	}
	
	/**
	* 1级头衔名称
	*@return 
	*/
	public String getMlref_1(){
		return  mlref_1;
	}
	/**
	* 1级头衔名称
	*@param  mlref_1
	*/
	public void setMlref_1(String mlref_1 ){
		this.mlref_1 = mlref_1;
	}
	
	/**
	* 10级头衔名称
	*@return 
	*/
	public String getMlref_10(){
		return  mlref_10;
	}
	/**
	* 10级头衔名称
	*@param  mlref_10
	*/
	public void setMlref_10(String mlref_10 ){
		this.mlref_10 = mlref_10;
	}
	
	/**
	* 11级头衔名称
	*@return 
	*/
	public String getMlref_11(){
		return  mlref_11;
	}
	/**
	* 11级头衔名称
	*@param  mlref_11
	*/
	public void setMlref_11(String mlref_11 ){
		this.mlref_11 = mlref_11;
	}
	
	/**
	* 12级头衔名称
	*@return 
	*/
	public String getMlref_12(){
		return  mlref_12;
	}
	/**
	* 12级头衔名称
	*@param  mlref_12
	*/
	public void setMlref_12(String mlref_12 ){
		this.mlref_12 = mlref_12;
	}
	
	/**
	* 13级头衔名称
	*@return 
	*/
	public String getMlref_13(){
		return  mlref_13;
	}
	/**
	* 13级头衔名称
	*@param  mlref_13
	*/
	public void setMlref_13(String mlref_13 ){
		this.mlref_13 = mlref_13;
	}
	
	/**
	* 14级头衔名称
	*@return 
	*/
	public String getMlref_14(){
		return  mlref_14;
	}
	/**
	* 14级头衔名称
	*@param  mlref_14
	*/
	public void setMlref_14(String mlref_14 ){
		this.mlref_14 = mlref_14;
	}
	
	/**
	* 15级头衔名称
	*@return 
	*/
	public String getMlref_15(){
		return  mlref_15;
	}
	/**
	* 15级头衔名称
	*@param  mlref_15
	*/
	public void setMlref_15(String mlref_15 ){
		this.mlref_15 = mlref_15;
	}
	
	/**
	* 16级头衔名称
	*@return 
	*/
	public String getMlref_16(){
		return  mlref_16;
	}
	/**
	* 16级头衔名称
	*@param  mlref_16
	*/
	public void setMlref_16(String mlref_16 ){
		this.mlref_16 = mlref_16;
	}
	
	/**
	* 2级头衔名称
	*@return 
	*/
	public String getMlref_2(){
		return  mlref_2;
	}
	/**
	* 2级头衔名称
	*@param  mlref_2
	*/
	public void setMlref_2(String mlref_2 ){
		this.mlref_2 = mlref_2;
	}
	
	/**
	* 3级头衔名称
	*@return 
	*/
	public String getMlref_3(){
		return  mlref_3;
	}
	/**
	* 3级头衔名称
	*@param  mlref_3
	*/
	public void setMlref_3(String mlref_3 ){
		this.mlref_3 = mlref_3;
	}
	
	/**
	* 4级头衔名称
	*@return 
	*/
	public String getMlref_4(){
		return  mlref_4;
	}
	/**
	* 4级头衔名称
	*@param  mlref_4
	*/
	public void setMlref_4(String mlref_4 ){
		this.mlref_4 = mlref_4;
	}
	
	/**
	* 5级头衔名称
	*@return 
	*/
	public String getMlref_5(){
		return  mlref_5;
	}
	/**
	* 5级头衔名称
	*@param  mlref_5
	*/
	public void setMlref_5(String mlref_5 ){
		this.mlref_5 = mlref_5;
	}
	
	/**
	* 6级头衔名称
	*@return 
	*/
	public String getMlref_6(){
		return  mlref_6;
	}
	/**
	* 6级头衔名称
	*@param  mlref_6
	*/
	public void setMlref_6(String mlref_6 ){
		this.mlref_6 = mlref_6;
	}
	
	/**
	* 7级头衔名称
	*@return 
	*/
	public String getMlref_7(){
		return  mlref_7;
	}
	/**
	* 7级头衔名称
	*@param  mlref_7
	*/
	public void setMlref_7(String mlref_7 ){
		this.mlref_7 = mlref_7;
	}
	
	/**
	* 8级头衔名称
	*@return 
	*/
	public String getMlref_8(){
		return  mlref_8;
	}
	/**
	* 8级头衔名称
	*@param  mlref_8
	*/
	public void setMlref_8(String mlref_8 ){
		this.mlref_8 = mlref_8;
	}
	
	/**
	* 9级头衔名称
	*@return 
	*/
	public String getMlref_9(){
		return  mlref_9;
	}
	/**
	* 9级头衔名称
	*@param  mlref_9
	*/
	public void setMlref_9(String mlref_9 ){
		this.mlref_9 = mlref_9;
	}
	
	/**
	* 创建时间
	*@return 
	*/
	public String getMlref_addtime(){
		return  mlref_addtime;
	}
	/**
	* 创建时间
	*@param  mlref_addtime
	*/
	public void setMlref_addtime(String mlref_addtime ){
		this.mlref_addtime = mlref_addtime;
	}
	
	/**
	* 参考头衔名称
	*@return 
	*/
	public String getMlref_name(){
		return  mlref_name;
	}
	/**
	* 参考头衔名称
	*@param  mlref_name
	*/
	public void setMlref_name(String mlref_name ){
		this.mlref_name = mlref_name;
	}
	

}
