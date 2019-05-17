package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_consult")
public class RaConsult   {
	
	// alias
	public static final String ALIAS_consult_id = "consult_id";
	public static final String ALIAS_consult_addtime = "consult_addtime";
	public static final String ALIAS_consult_reply_time = "consult_reply_time";
	public static final String ALIAS_ct_id = "ct_id";
	public static final String ALIAS_goods_id = "goods_id";
	public static final String ALIAS_isanonymous = "isanonymous";
	public static final String ALIAS_member_id = "member_id";
	public static final String ALIAS_store_id = "store_id";
	public static final String ALIAS_consult_content = "consult_content";
	public static final String ALIAS_consult_reply = "consult_reply";
	public static final String ALIAS_goods_name = "goods_name";
	public static final String ALIAS_member_name = "member_name";
	public static final String ALIAS_store_name = "store_name";
	
	/*
	咨询编号
	*/
	private Integer consult_id ;
	/*
	咨询发布时间
	*/
	private Integer consult_addtime ;
	/*
	咨询回复时间
	*/
	private Integer consult_reply_time ;
	/*
	咨询类型
	*/
	private Integer ct_id ;
	/*
	商品编号
	*/
	private Integer goods_id ;
	/*
	0表示不匿名 1表示匿名
	*/
	private Integer isanonymous ;
	/*
	咨询发布者会员编号(0：游客)
	*/
	private Integer member_id ;
	/*
	店铺编号
	*/
	private Integer store_id ;
	/*
	咨询内容
	*/
	private String consult_content ;
	/*
	咨询回复内容
	*/
	private String consult_reply ;
	/*
	商品名称
	*/
	private String goods_name ;
	/*
	会员名称
	*/
	private String member_name ;
	/*
	店铺名称
	*/
	private String store_name ;
	
	public RaConsult() {
	}
	
	/**
	* 咨询编号
	*@return 
	*/
	public Integer getConsult_id(){
		return  consult_id;
	}
	/**
	* 咨询编号
	*@param  consult_id
	*/
	public void setConsult_id(Integer consult_id ){
		this.consult_id = consult_id;
	}
	
	/**
	* 咨询发布时间
	*@return 
	*/
	public Integer getConsult_addtime(){
		return  consult_addtime;
	}
	/**
	* 咨询发布时间
	*@param  consult_addtime
	*/
	public void setConsult_addtime(Integer consult_addtime ){
		this.consult_addtime = consult_addtime;
	}
	
	/**
	* 咨询回复时间
	*@return 
	*/
	public Integer getConsult_reply_time(){
		return  consult_reply_time;
	}
	/**
	* 咨询回复时间
	*@param  consult_reply_time
	*/
	public void setConsult_reply_time(Integer consult_reply_time ){
		this.consult_reply_time = consult_reply_time;
	}
	
	/**
	* 咨询类型
	*@return 
	*/
	public Integer getCt_id(){
		return  ct_id;
	}
	/**
	* 咨询类型
	*@param  ct_id
	*/
	public void setCt_id(Integer ct_id ){
		this.ct_id = ct_id;
	}
	
	/**
	* 商品编号
	*@return 
	*/
	public Integer getGoods_id(){
		return  goods_id;
	}
	/**
	* 商品编号
	*@param  goods_id
	*/
	public void setGoods_id(Integer goods_id ){
		this.goods_id = goods_id;
	}
	
	/**
	* 0表示不匿名 1表示匿名
	*@return 
	*/
	public Integer getIsanonymous(){
		return  isanonymous;
	}
	/**
	* 0表示不匿名 1表示匿名
	*@param  isanonymous
	*/
	public void setIsanonymous(Integer isanonymous ){
		this.isanonymous = isanonymous;
	}
	
	/**
	* 咨询发布者会员编号(0：游客)
	*@return 
	*/
	public Integer getMember_id(){
		return  member_id;
	}
	/**
	* 咨询发布者会员编号(0：游客)
	*@param  member_id
	*/
	public void setMember_id(Integer member_id ){
		this.member_id = member_id;
	}
	
	/**
	* 店铺编号
	*@return 
	*/
	public Integer getStore_id(){
		return  store_id;
	}
	/**
	* 店铺编号
	*@param  store_id
	*/
	public void setStore_id(Integer store_id ){
		this.store_id = store_id;
	}
	
	/**
	* 咨询内容
	*@return 
	*/
	public String getConsult_content(){
		return  consult_content;
	}
	/**
	* 咨询内容
	*@param  consult_content
	*/
	public void setConsult_content(String consult_content ){
		this.consult_content = consult_content;
	}
	
	/**
	* 咨询回复内容
	*@return 
	*/
	public String getConsult_reply(){
		return  consult_reply;
	}
	/**
	* 咨询回复内容
	*@param  consult_reply
	*/
	public void setConsult_reply(String consult_reply ){
		this.consult_reply = consult_reply;
	}
	
	/**
	* 商品名称
	*@return 
	*/
	public String getGoods_name(){
		return  goods_name;
	}
	/**
	* 商品名称
	*@param  goods_name
	*/
	public void setGoods_name(String goods_name ){
		this.goods_name = goods_name;
	}
	
	/**
	* 会员名称
	*@return 
	*/
	public String getMember_name(){
		return  member_name;
	}
	/**
	* 会员名称
	*@param  member_name
	*/
	public void setMember_name(String member_name ){
		this.member_name = member_name;
	}
	
	/**
	* 店铺名称
	*@return 
	*/
	public String getStore_name(){
		return  store_name;
	}
	/**
	* 店铺名称
	*@param  store_name
	*/
	public void setStore_name(String store_name ){
		this.store_name = store_name;
	}
	

}
