package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_adv")
public class RaAdv   {
	
	// alias
	public static final String ALIAS_adv_id = "adv_id";
	public static final String ALIAS_adv_end_date = "adv_end_date";
	public static final String ALIAS_adv_start_date = "adv_start_date";
	public static final String ALIAS_ap_id = "ap_id";
	public static final String ALIAS_click_num = "click_num";
	public static final String ALIAS_goldpay = "goldpay";
	public static final String ALIAS_is_allow = "is_allow";
	public static final String ALIAS_member_id = "member_id";
	public static final String ALIAS_slide_sort = "slide_sort";
	public static final String ALIAS_adv_content = "adv_content";
	public static final String ALIAS_adv_title = "adv_title";
	public static final String ALIAS_buy_style = "buy_style";
	public static final String ALIAS_member_name = "member_name";
	
	/*
	广告自增标识编号
	*/
	private Integer adv_id ;
	/*
	广告结束时间
	*/
	private Integer adv_end_date ;
	/*
	广告开始时间
	*/
	private Integer adv_start_date ;
	/*
	广告位id
	*/
	private Integer ap_id ;
	/*
	广告点击率
	*/
	private Integer click_num ;
	/*
	购买所支付的金币
	*/
	private Integer goldpay ;
	/*
	会员购买的广告是否通过审核0未审核1审核已通过2审核未通过
	*/
	private Integer is_allow ;
	/*
	会员ID
	*/
	private Integer member_id ;
	/*
	幻灯片排序
	*/
	private Integer slide_sort ;
	/*
	广告内容
	*/
	private String adv_content ;
	/*
	广告内容描述
	*/
	private String adv_title ;
	/*
	购买方式
	*/
	private String buy_style ;
	/*
	会员用户名
	*/
	private String member_name ;
	
	public RaAdv() {
	}
	
	/**
	* 广告自增标识编号
	*@return 
	*/
	public Integer getAdv_id(){
		return  adv_id;
	}
	/**
	* 广告自增标识编号
	*@param  adv_id
	*/
	public void setAdv_id(Integer adv_id ){
		this.adv_id = adv_id;
	}
	
	/**
	* 广告结束时间
	*@return 
	*/
	public Integer getAdv_end_date(){
		return  adv_end_date;
	}
	/**
	* 广告结束时间
	*@param  adv_end_date
	*/
	public void setAdv_end_date(Integer adv_end_date ){
		this.adv_end_date = adv_end_date;
	}
	
	/**
	* 广告开始时间
	*@return 
	*/
	public Integer getAdv_start_date(){
		return  adv_start_date;
	}
	/**
	* 广告开始时间
	*@param  adv_start_date
	*/
	public void setAdv_start_date(Integer adv_start_date ){
		this.adv_start_date = adv_start_date;
	}
	
	/**
	* 广告位id
	*@return 
	*/
	public Integer getAp_id(){
		return  ap_id;
	}
	/**
	* 广告位id
	*@param  ap_id
	*/
	public void setAp_id(Integer ap_id ){
		this.ap_id = ap_id;
	}
	
	/**
	* 广告点击率
	*@return 
	*/
	public Integer getClick_num(){
		return  click_num;
	}
	/**
	* 广告点击率
	*@param  click_num
	*/
	public void setClick_num(Integer click_num ){
		this.click_num = click_num;
	}
	
	/**
	* 购买所支付的金币
	*@return 
	*/
	public Integer getGoldpay(){
		return  goldpay;
	}
	/**
	* 购买所支付的金币
	*@param  goldpay
	*/
	public void setGoldpay(Integer goldpay ){
		this.goldpay = goldpay;
	}
	
	/**
	* 会员购买的广告是否通过审核0未审核1审核已通过2审核未通过
	*@return 
	*/
	public Integer getIs_allow(){
		return  is_allow;
	}
	/**
	* 会员购买的广告是否通过审核0未审核1审核已通过2审核未通过
	*@param  is_allow
	*/
	public void setIs_allow(Integer is_allow ){
		this.is_allow = is_allow;
	}
	
	/**
	* 会员ID
	*@return 
	*/
	public Integer getMember_id(){
		return  member_id;
	}
	/**
	* 会员ID
	*@param  member_id
	*/
	public void setMember_id(Integer member_id ){
		this.member_id = member_id;
	}
	
	/**
	* 幻灯片排序
	*@return 
	*/
	public Integer getSlide_sort(){
		return  slide_sort;
	}
	/**
	* 幻灯片排序
	*@param  slide_sort
	*/
	public void setSlide_sort(Integer slide_sort ){
		this.slide_sort = slide_sort;
	}
	
	/**
	* 广告内容
	*@return 
	*/
	public String getAdv_content(){
		return  adv_content;
	}
	/**
	* 广告内容
	*@param  adv_content
	*/
	public void setAdv_content(String adv_content ){
		this.adv_content = adv_content;
	}
	
	/**
	* 广告内容描述
	*@return 
	*/
	public String getAdv_title(){
		return  adv_title;
	}
	/**
	* 广告内容描述
	*@param  adv_title
	*/
	public void setAdv_title(String adv_title ){
		this.adv_title = adv_title;
	}
	
	/**
	* 购买方式
	*@return 
	*/
	public String getBuy_style(){
		return  buy_style;
	}
	/**
	* 购买方式
	*@param  buy_style
	*/
	public void setBuy_style(String buy_style ){
		this.buy_style = buy_style;
	}
	
	/**
	* 会员用户名
	*@return 
	*/
	public String getMember_name(){
		return  member_name;
	}
	/**
	* 会员用户名
	*@param  member_name
	*/
	public void setMember_name(String member_name ){
		this.member_name = member_name;
	}
	

}
