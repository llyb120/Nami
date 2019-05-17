package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_goods_browse")
public class RaGoodsBrowse   {
	
	// alias
	public static final String ALIAS_browse_id = "browse_id";
	public static final String ALIAS_browsetime = "browsetime";
	public static final String ALIAS_gc_id = "gc_id";
	public static final String ALIAS_gc_id_1 = "gc_id_1";
	public static final String ALIAS_gc_id_2 = "gc_id_2";
	public static final String ALIAS_gc_id_3 = "gc_id_3";
	public static final String ALIAS_goods_id = "goods_id";
	public static final String ALIAS_member_id = "member_id";
	
	private Integer browse_id ;
	/*
	浏览时间
	*/
	private Integer browsetime ;
	/*
	商品分类
	*/
	private Integer gc_id ;
	/*
	商品一级分类
	*/
	private Integer gc_id_1 ;
	/*
	商品二级分类
	*/
	private Integer gc_id_2 ;
	/*
	商品三级分类
	*/
	private Integer gc_id_3 ;
	/*
	商品ID
	*/
	private Integer goods_id ;
	/*
	会员ID
	*/
	private Integer member_id ;
	
	public RaGoodsBrowse() {
	}
	
	public Integer getBrowse_id(){
		return  browse_id;
	}
	public void setBrowse_id(Integer browse_id ){
		this.browse_id = browse_id;
	}
	
	/**
	* 浏览时间
	*@return 
	*/
	public Integer getBrowsetime(){
		return  browsetime;
	}
	/**
	* 浏览时间
	*@param  browsetime
	*/
	public void setBrowsetime(Integer browsetime ){
		this.browsetime = browsetime;
	}
	
	/**
	* 商品分类
	*@return 
	*/
	public Integer getGc_id(){
		return  gc_id;
	}
	/**
	* 商品分类
	*@param  gc_id
	*/
	public void setGc_id(Integer gc_id ){
		this.gc_id = gc_id;
	}
	
	/**
	* 商品一级分类
	*@return 
	*/
	public Integer getGc_id_1(){
		return  gc_id_1;
	}
	/**
	* 商品一级分类
	*@param  gc_id_1
	*/
	public void setGc_id_1(Integer gc_id_1 ){
		this.gc_id_1 = gc_id_1;
	}
	
	/**
	* 商品二级分类
	*@return 
	*/
	public Integer getGc_id_2(){
		return  gc_id_2;
	}
	/**
	* 商品二级分类
	*@param  gc_id_2
	*/
	public void setGc_id_2(Integer gc_id_2 ){
		this.gc_id_2 = gc_id_2;
	}
	
	/**
	* 商品三级分类
	*@return 
	*/
	public Integer getGc_id_3(){
		return  gc_id_3;
	}
	/**
	* 商品三级分类
	*@param  gc_id_3
	*/
	public void setGc_id_3(Integer gc_id_3 ){
		this.gc_id_3 = gc_id_3;
	}
	
	/**
	* 商品ID
	*@return 
	*/
	public Integer getGoods_id(){
		return  goods_id;
	}
	/**
	* 商品ID
	*@param  goods_id
	*/
	public void setGoods_id(Integer goods_id ){
		this.goods_id = goods_id;
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
	

}
