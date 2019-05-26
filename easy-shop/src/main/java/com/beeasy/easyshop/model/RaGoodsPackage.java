//package com.beeasy.easyshop.model;
//import java.math.*;
//import java.util.Date;
//import java.sql.Timestamp;
//import org.beetl.sql.core.annotatoin.Table;
//
//
///*
//*
//* gen by beetlsql 2019-05-17
//*/
//@Table(name="yoehi.ra_goods_package")
//public class RaGoodsPackage   {
//
//	// alias
//	public static final String ALIAS_goods_id = "goods_id";
//	public static final String ALIAS_id = "id";
//	public static final String ALIAS_status = "status";
//	public static final String ALIAS_store_id = "store_id";
//	public static final String ALIAS_main_image = "main_image";
//	public static final String ALIAS_package = "package";
//	public static final String ALIAS_package_name = "package_name";
//	public static final String ALIAS_shipping_fee = "shipping_fee";
//
//	private Integer goods_id ;
//	private Integer id ;
//	/*
//	是否开启
//	*/
//	private Integer status ;
//	private Integer store_id ;
//	private String main_image ;
//	private String package ;
//	/*
//	打包名称
//	*/
//	private String package_name ;
//	private BigDecimal shipping_fee ;
//
//	public RaGoodsPackage() {
//	}
//
//	public Integer getGoods_id(){
//		return  goods_id;
//	}
//	public void setGoods_id(Integer goods_id ){
//		this.goods_id = goods_id;
//	}
//
//	public Integer getId(){
//		return  id;
//	}
//	public void setId(Integer id ){
//		this.id = id;
//	}
//
//	/**
//	* 是否开启
//	*@return
//	*/
//	public Integer getStatus(){
//		return  status;
//	}
//	/**
//	* 是否开启
//	*@param  status
//	*/
//	public void setStatus(Integer status ){
//		this.status = status;
//	}
//
//	public Integer getStore_id(){
//		return  store_id;
//	}
//	public void setStore_id(Integer store_id ){
//		this.store_id = store_id;
//	}
//
//	public String getMain_image(){
//		return  main_image;
//	}
//	public void setMain_image(String main_image ){
//		this.main_image = main_image;
//	}
//
//	public String getPackage(){
//		return  package;
//	}
//	public void setPackage(String package ){
//		this.package = package;
//	}
//
//	/**
//	* 打包名称
//	*@return
//	*/
//	public String getPackage_name(){
//		return  package_name;
//	}
//	/**
//	* 打包名称
//	*@param  package_name
//	*/
//	public void setPackage_name(String package_name ){
//		this.package_name = package_name;
//	}
//
//	public BigDecimal getShipping_fee(){
//		return  shipping_fee;
//	}
//	public void setShipping_fee(BigDecimal shipping_fee ){
//		this.shipping_fee = shipping_fee;
//	}
//
//
//}
