package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_we_groupbuy")
public class RaWeGroupbuy   {
	
	// alias
	public static final String ALIAS_id = "id";
	public static final String ALIAS_goods_id = "goods_id";
	public static final String ALIAS_max_person = "max_person";
	public static final String ALIAS_min_count = "min_count";
	public static final String ALIAS_status = "status";
	public static final String ALIAS_stock = "stock";
	public static final String ALIAS_store_id = "store_id";
	public static final String ALIAS_activity_name = "activity_name";
	public static final String ALIAS_brokerage = "brokerage";
	public static final String ALIAS_content = "content";
	public static final String ALIAS_end_time = "end_time";
	public static final String ALIAS_price = "price";
	public static final String ALIAS_start_time = "start_time";
	
	private Integer id ;
	private Integer goods_id ;
	private Integer max_person ;
	private Integer min_count ;
	private Integer status ;
	/*
	促销商品可供应的总数量
	*/
	private Integer stock ;
	private Integer store_id ;
	private String activity_name ;
	/*
	佣金比例
	*/
	private BigDecimal brokerage ;
	private String content ;
	private String end_time ;
	private BigDecimal price ;
	private String start_time ;
	
	public RaWeGroupbuy() {
	}
	
	public Integer getId(){
		return  id;
	}
	public void setId(Integer id ){
		this.id = id;
	}
	
	public Integer getGoods_id(){
		return  goods_id;
	}
	public void setGoods_id(Integer goods_id ){
		this.goods_id = goods_id;
	}
	
	public Integer getMax_person(){
		return  max_person;
	}
	public void setMax_person(Integer max_person ){
		this.max_person = max_person;
	}
	
	public Integer getMin_count(){
		return  min_count;
	}
	public void setMin_count(Integer min_count ){
		this.min_count = min_count;
	}
	
	public Integer getStatus(){
		return  status;
	}
	public void setStatus(Integer status ){
		this.status = status;
	}
	
	/**
	* 促销商品可供应的总数量
	*@return 
	*/
	public Integer getStock(){
		return  stock;
	}
	/**
	* 促销商品可供应的总数量
	*@param  stock
	*/
	public void setStock(Integer stock ){
		this.stock = stock;
	}
	
	public Integer getStore_id(){
		return  store_id;
	}
	public void setStore_id(Integer store_id ){
		this.store_id = store_id;
	}
	
	public String getActivity_name(){
		return  activity_name;
	}
	public void setActivity_name(String activity_name ){
		this.activity_name = activity_name;
	}
	
	/**
	* 佣金比例
	*@return 
	*/
	public BigDecimal getBrokerage(){
		return  brokerage;
	}
	/**
	* 佣金比例
	*@param  brokerage
	*/
	public void setBrokerage(BigDecimal brokerage ){
		this.brokerage = brokerage;
	}
	
	public String getContent(){
		return  content;
	}
	public void setContent(String content ){
		this.content = content;
	}
	
	public String getEnd_time(){
		return  end_time;
	}
	public void setEnd_time(String end_time ){
		this.end_time = end_time;
	}
	
	public BigDecimal getPrice(){
		return  price;
	}
	public void setPrice(BigDecimal price ){
		this.price = price;
	}
	
	public String getStart_time(){
		return  start_time;
	}
	public void setStart_time(String start_time ){
		this.start_time = start_time;
	}
	

}
