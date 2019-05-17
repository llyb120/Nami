package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_store_grade")
public class RaStoreGrade   {
	
	// alias
	public static final String ALIAS_sg_id = "sg_id";
	public static final String ALIAS_sg_album_limit = "sg_album_limit";
	public static final String ALIAS_sg_goods_limit = "sg_goods_limit";
	public static final String ALIAS_sg_sort = "sg_sort";
	public static final String ALIAS_sg_space_limit = "sg_space_limit";
	public static final String ALIAS_sg_template_number = "sg_template_number";
	public static final String ALIAS_sg_description = "sg_description";
	public static final String ALIAS_sg_function = "sg_function";
	public static final String ALIAS_sg_name = "sg_name";
	public static final String ALIAS_sg_price = "sg_price";
	public static final String ALIAS_sg_template = "sg_template";
	
	/*
	索引ID
	*/
	private Integer sg_id ;
	/*
	允许上传图片数量
	*/
	private Integer sg_album_limit ;
	/*
	允许发布的商品数量
	*/
	private Integer sg_goods_limit ;
	/*
	级别，数目越大级别越高
	*/
	private Integer sg_sort ;
	/*
	上传空间大小，单位MB
	*/
	private Integer sg_space_limit ;
	/*
	选择店铺模板套数
	*/
	private Integer sg_template_number ;
	/*
	申请说明
	*/
	private String sg_description ;
	/*
	附加功能
	*/
	private String sg_function ;
	/*
	等级名称
	*/
	private String sg_name ;
	/*
	开店费用(元/年)
	*/
	private BigDecimal sg_price ;
	/*
	模板内容
	*/
	private String sg_template ;
	
	public RaStoreGrade() {
	}
	
	/**
	* 索引ID
	*@return 
	*/
	public Integer getSg_id(){
		return  sg_id;
	}
	/**
	* 索引ID
	*@param  sg_id
	*/
	public void setSg_id(Integer sg_id ){
		this.sg_id = sg_id;
	}
	
	/**
	* 允许上传图片数量
	*@return 
	*/
	public Integer getSg_album_limit(){
		return  sg_album_limit;
	}
	/**
	* 允许上传图片数量
	*@param  sg_album_limit
	*/
	public void setSg_album_limit(Integer sg_album_limit ){
		this.sg_album_limit = sg_album_limit;
	}
	
	/**
	* 允许发布的商品数量
	*@return 
	*/
	public Integer getSg_goods_limit(){
		return  sg_goods_limit;
	}
	/**
	* 允许发布的商品数量
	*@param  sg_goods_limit
	*/
	public void setSg_goods_limit(Integer sg_goods_limit ){
		this.sg_goods_limit = sg_goods_limit;
	}
	
	/**
	* 级别，数目越大级别越高
	*@return 
	*/
	public Integer getSg_sort(){
		return  sg_sort;
	}
	/**
	* 级别，数目越大级别越高
	*@param  sg_sort
	*/
	public void setSg_sort(Integer sg_sort ){
		this.sg_sort = sg_sort;
	}
	
	/**
	* 上传空间大小，单位MB
	*@return 
	*/
	public Integer getSg_space_limit(){
		return  sg_space_limit;
	}
	/**
	* 上传空间大小，单位MB
	*@param  sg_space_limit
	*/
	public void setSg_space_limit(Integer sg_space_limit ){
		this.sg_space_limit = sg_space_limit;
	}
	
	/**
	* 选择店铺模板套数
	*@return 
	*/
	public Integer getSg_template_number(){
		return  sg_template_number;
	}
	/**
	* 选择店铺模板套数
	*@param  sg_template_number
	*/
	public void setSg_template_number(Integer sg_template_number ){
		this.sg_template_number = sg_template_number;
	}
	
	/**
	* 申请说明
	*@return 
	*/
	public String getSg_description(){
		return  sg_description;
	}
	/**
	* 申请说明
	*@param  sg_description
	*/
	public void setSg_description(String sg_description ){
		this.sg_description = sg_description;
	}
	
	/**
	* 附加功能
	*@return 
	*/
	public String getSg_function(){
		return  sg_function;
	}
	/**
	* 附加功能
	*@param  sg_function
	*/
	public void setSg_function(String sg_function ){
		this.sg_function = sg_function;
	}
	
	/**
	* 等级名称
	*@return 
	*/
	public String getSg_name(){
		return  sg_name;
	}
	/**
	* 等级名称
	*@param  sg_name
	*/
	public void setSg_name(String sg_name ){
		this.sg_name = sg_name;
	}
	
	/**
	* 开店费用(元/年)
	*@return 
	*/
	public BigDecimal getSg_price(){
		return  sg_price;
	}
	/**
	* 开店费用(元/年)
	*@param  sg_price
	*/
	public void setSg_price(BigDecimal sg_price ){
		this.sg_price = sg_price;
	}
	
	/**
	* 模板内容
	*@return 
	*/
	public String getSg_template(){
		return  sg_template;
	}
	/**
	* 模板内容
	*@param  sg_template
	*/
	public void setSg_template(String sg_template ){
		this.sg_template = sg_template;
	}
	

}
