package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_sns_membertag")
public class RaSnsMembertag   {
	
	// alias
	public static final String ALIAS_mtag_id = "mtag_id";
	public static final String ALIAS_mtag_recommend = "mtag_recommend";
	public static final String ALIAS_mtag_sort = "mtag_sort";
	public static final String ALIAS_mtag_desc = "mtag_desc";
	public static final String ALIAS_mtag_img = "mtag_img";
	public static final String ALIAS_mtag_name = "mtag_name";
	
	/*
	会员标签id
	*/
	private Integer mtag_id ;
	/*
	标签推荐 0未推荐（默认），1为已推荐
	*/
	private Integer mtag_recommend ;
	/*
	会员标签排序
	*/
	private Integer mtag_sort ;
	/*
	标签描述
	*/
	private String mtag_desc ;
	/*
	标签图片
	*/
	private String mtag_img ;
	/*
	会员标签名称
	*/
	private String mtag_name ;
	
	public RaSnsMembertag() {
	}
	
	/**
	* 会员标签id
	*@return 
	*/
	public Integer getMtag_id(){
		return  mtag_id;
	}
	/**
	* 会员标签id
	*@param  mtag_id
	*/
	public void setMtag_id(Integer mtag_id ){
		this.mtag_id = mtag_id;
	}
	
	/**
	* 标签推荐 0未推荐（默认），1为已推荐
	*@return 
	*/
	public Integer getMtag_recommend(){
		return  mtag_recommend;
	}
	/**
	* 标签推荐 0未推荐（默认），1为已推荐
	*@param  mtag_recommend
	*/
	public void setMtag_recommend(Integer mtag_recommend ){
		this.mtag_recommend = mtag_recommend;
	}
	
	/**
	* 会员标签排序
	*@return 
	*/
	public Integer getMtag_sort(){
		return  mtag_sort;
	}
	/**
	* 会员标签排序
	*@param  mtag_sort
	*/
	public void setMtag_sort(Integer mtag_sort ){
		this.mtag_sort = mtag_sort;
	}
	
	/**
	* 标签描述
	*@return 
	*/
	public String getMtag_desc(){
		return  mtag_desc;
	}
	/**
	* 标签描述
	*@param  mtag_desc
	*/
	public void setMtag_desc(String mtag_desc ){
		this.mtag_desc = mtag_desc;
	}
	
	/**
	* 标签图片
	*@return 
	*/
	public String getMtag_img(){
		return  mtag_img;
	}
	/**
	* 标签图片
	*@param  mtag_img
	*/
	public void setMtag_img(String mtag_img ){
		this.mtag_img = mtag_img;
	}
	
	/**
	* 会员标签名称
	*@return 
	*/
	public String getMtag_name(){
		return  mtag_name;
	}
	/**
	* 会员标签名称
	*@param  mtag_name
	*/
	public void setMtag_name(String mtag_name ){
		this.mtag_name = mtag_name;
	}
	

}
