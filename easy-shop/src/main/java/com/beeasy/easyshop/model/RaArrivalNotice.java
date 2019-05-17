package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_arrival_notice")
public class RaArrivalNotice   {
	
	// alias
	public static final String ALIAS_an_id = "an_id";
	public static final String ALIAS_an_addtime = "an_addtime";
	public static final String ALIAS_an_type = "an_type";
	public static final String ALIAS_goods_id = "goods_id";
	public static final String ALIAS_member_id = "member_id";
	public static final String ALIAS_an_email = "an_email";
	public static final String ALIAS_an_mobile = "an_mobile";
	public static final String ALIAS_goods_name = "goods_name";
	
	/*
	通知id
	*/
	private Integer an_id ;
	/*
	添加时间
	*/
	private Integer an_addtime ;
	/*
	状态 1到货通知，2预售
	*/
	private Integer an_type ;
	/*
	商品id
	*/
	private Integer goods_id ;
	/*
	会员id
	*/
	private Integer member_id ;
	/*
	邮箱
	*/
	private String an_email ;
	/*
	手机号
	*/
	private String an_mobile ;
	/*
	商品名称
	*/
	private String goods_name ;
	
	public RaArrivalNotice() {
	}
	
	/**
	* 通知id
	*@return 
	*/
	public Integer getAn_id(){
		return  an_id;
	}
	/**
	* 通知id
	*@param  an_id
	*/
	public void setAn_id(Integer an_id ){
		this.an_id = an_id;
	}
	
	/**
	* 添加时间
	*@return 
	*/
	public Integer getAn_addtime(){
		return  an_addtime;
	}
	/**
	* 添加时间
	*@param  an_addtime
	*/
	public void setAn_addtime(Integer an_addtime ){
		this.an_addtime = an_addtime;
	}
	
	/**
	* 状态 1到货通知，2预售
	*@return 
	*/
	public Integer getAn_type(){
		return  an_type;
	}
	/**
	* 状态 1到货通知，2预售
	*@param  an_type
	*/
	public void setAn_type(Integer an_type ){
		this.an_type = an_type;
	}
	
	/**
	* 商品id
	*@return 
	*/
	public Integer getGoods_id(){
		return  goods_id;
	}
	/**
	* 商品id
	*@param  goods_id
	*/
	public void setGoods_id(Integer goods_id ){
		this.goods_id = goods_id;
	}
	
	/**
	* 会员id
	*@return 
	*/
	public Integer getMember_id(){
		return  member_id;
	}
	/**
	* 会员id
	*@param  member_id
	*/
	public void setMember_id(Integer member_id ){
		this.member_id = member_id;
	}
	
	/**
	* 邮箱
	*@return 
	*/
	public String getAn_email(){
		return  an_email;
	}
	/**
	* 邮箱
	*@param  an_email
	*/
	public void setAn_email(String an_email ){
		this.an_email = an_email;
	}
	
	/**
	* 手机号
	*@return 
	*/
	public String getAn_mobile(){
		return  an_mobile;
	}
	/**
	* 手机号
	*@param  an_mobile
	*/
	public void setAn_mobile(String an_mobile ){
		this.an_mobile = an_mobile;
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
	

}
