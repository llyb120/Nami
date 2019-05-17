package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_goods_fcode")
public class RaGoodsFcode   {
	
	// alias
	public static final String ALIAS_fc_id = "fc_id";
	public static final String ALIAS_fc_state = "fc_state";
	public static final String ALIAS_goods_commonid = "goods_commonid";
	public static final String ALIAS_fc_code = "fc_code";
	
	/*
	F码id
	*/
	private Integer fc_id ;
	/*
	状态 0未使用，1已使用
	*/
	private Integer fc_state ;
	/*
	商品公共id
	*/
	private Integer goods_commonid ;
	/*
	F码
	*/
	private String fc_code ;
	
	public RaGoodsFcode() {
	}
	
	/**
	* F码id
	*@return 
	*/
	public Integer getFc_id(){
		return  fc_id;
	}
	/**
	* F码id
	*@param  fc_id
	*/
	public void setFc_id(Integer fc_id ){
		this.fc_id = fc_id;
	}
	
	/**
	* 状态 0未使用，1已使用
	*@return 
	*/
	public Integer getFc_state(){
		return  fc_state;
	}
	/**
	* 状态 0未使用，1已使用
	*@param  fc_state
	*/
	public void setFc_state(Integer fc_state ){
		this.fc_state = fc_state;
	}
	
	/**
	* 商品公共id
	*@return 
	*/
	public Integer getGoods_commonid(){
		return  goods_commonid;
	}
	/**
	* 商品公共id
	*@param  goods_commonid
	*/
	public void setGoods_commonid(Integer goods_commonid ){
		this.goods_commonid = goods_commonid;
	}
	
	/**
	* F码
	*@return 
	*/
	public String getFc_code(){
		return  fc_code;
	}
	/**
	* F码
	*@param  fc_code
	*/
	public void setFc_code(String fc_code ){
		this.fc_code = fc_code;
	}
	

}
