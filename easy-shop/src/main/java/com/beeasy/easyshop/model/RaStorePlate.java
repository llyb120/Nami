package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_store_plate")
public class RaStorePlate   {
	
	// alias
	public static final String ALIAS_plate_id = "plate_id";
	public static final String ALIAS_plate_position = "plate_position";
	public static final String ALIAS_store_id = "store_id";
	public static final String ALIAS_plate_content = "plate_content";
	public static final String ALIAS_plate_name = "plate_name";
	
	/*
	关联板式id
	*/
	private Integer plate_id ;
	/*
	关联板式位置 1顶部，0底部
	*/
	private Integer plate_position ;
	/*
	所属店铺id
	*/
	private Integer store_id ;
	/*
	关联板式内容
	*/
	private String plate_content ;
	/*
	关联板式名称
	*/
	private String plate_name ;
	
	public RaStorePlate() {
	}
	
	/**
	* 关联板式id
	*@return 
	*/
	public Integer getPlate_id(){
		return  plate_id;
	}
	/**
	* 关联板式id
	*@param  plate_id
	*/
	public void setPlate_id(Integer plate_id ){
		this.plate_id = plate_id;
	}
	
	/**
	* 关联板式位置 1顶部，0底部
	*@return 
	*/
	public Integer getPlate_position(){
		return  plate_position;
	}
	/**
	* 关联板式位置 1顶部，0底部
	*@param  plate_position
	*/
	public void setPlate_position(Integer plate_position ){
		this.plate_position = plate_position;
	}
	
	/**
	* 所属店铺id
	*@return 
	*/
	public Integer getStore_id(){
		return  store_id;
	}
	/**
	* 所属店铺id
	*@param  store_id
	*/
	public void setStore_id(Integer store_id ){
		this.store_id = store_id;
	}
	
	/**
	* 关联板式内容
	*@return 
	*/
	public String getPlate_content(){
		return  plate_content;
	}
	/**
	* 关联板式内容
	*@param  plate_content
	*/
	public void setPlate_content(String plate_content ){
		this.plate_content = plate_content;
	}
	
	/**
	* 关联板式名称
	*@return 
	*/
	public String getPlate_name(){
		return  plate_name;
	}
	/**
	* 关联板式名称
	*@param  plate_name
	*/
	public void setPlate_name(String plate_name ){
		this.plate_name = plate_name;
	}
	

}
