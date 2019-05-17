package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_store_msg")
public class RaStoreMsg   {
	
	// alias
	public static final String ALIAS_sm_id = "sm_id";
	public static final String ALIAS_sm_addtime = "sm_addtime";
	public static final String ALIAS_store_id = "store_id";
	public static final String ALIAS_sm_content = "sm_content";
	public static final String ALIAS_sm_readids = "sm_readids";
	public static final String ALIAS_smt_code = "smt_code";
	
	/*
	店铺消息id
	*/
	private Integer sm_id ;
	/*
	发送时间
	*/
	private Integer sm_addtime ;
	/*
	店铺id
	*/
	private Integer store_id ;
	/*
	消息内容
	*/
	private String sm_content ;
	/*
	已读卖家id
	*/
	private String sm_readids ;
	/*
	模板编码
	*/
	private String smt_code ;
	
	public RaStoreMsg() {
	}
	
	/**
	* 店铺消息id
	*@return 
	*/
	public Integer getSm_id(){
		return  sm_id;
	}
	/**
	* 店铺消息id
	*@param  sm_id
	*/
	public void setSm_id(Integer sm_id ){
		this.sm_id = sm_id;
	}
	
	/**
	* 发送时间
	*@return 
	*/
	public Integer getSm_addtime(){
		return  sm_addtime;
	}
	/**
	* 发送时间
	*@param  sm_addtime
	*/
	public void setSm_addtime(Integer sm_addtime ){
		this.sm_addtime = sm_addtime;
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
	* 消息内容
	*@return 
	*/
	public String getSm_content(){
		return  sm_content;
	}
	/**
	* 消息内容
	*@param  sm_content
	*/
	public void setSm_content(String sm_content ){
		this.sm_content = sm_content;
	}
	
	/**
	* 已读卖家id
	*@return 
	*/
	public String getSm_readids(){
		return  sm_readids;
	}
	/**
	* 已读卖家id
	*@param  sm_readids
	*/
	public void setSm_readids(String sm_readids ){
		this.sm_readids = sm_readids;
	}
	
	/**
	* 模板编码
	*@return 
	*/
	public String getSmt_code(){
		return  smt_code;
	}
	/**
	* 模板编码
	*@param  smt_code
	*/
	public void setSmt_code(String smt_code ){
		this.smt_code = smt_code;
	}
	

}
