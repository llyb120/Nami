package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_store_grade")
public class RaStoreGrade   {
	
	/*
	索引ID
	*/
	private Integer sgId ;
	/*
	允许上传图片数量
	*/
	private Integer sgAlbumLimit ;
	/*
	允许发布的商品数量
	*/
	private Integer sgGoodsLimit ;
	/*
	级别，数目越大级别越高
	*/
	private Integer sgSort ;
	/*
	上传空间大小，单位MB
	*/
	private Integer sgSpaceLimit ;
	/*
	选择店铺模板套数
	*/
	private Integer sgTemplateNumber ;
	/*
	申请说明
	*/
	private String sgDescription ;
	/*
	附加功能
	*/
	private String sgFunction ;
	/*
	等级名称
	*/
	private String sgName ;
	/*
	开店费用(元/年)
	*/
	private BigDecimal sgPrice ;
	/*
	模板内容
	*/
	private String sgTemplate ;
	
	public RaStoreGrade() {
	}
	
	/**
	* 索引ID
	*@return 
	*/
	public Integer getSgId(){
		return  sgId;
	}
	/**
	* 索引ID
	*@param  sgId
	*/
	public void setSgId(Integer sgId ){
		this.sgId = sgId;
	}
	
	/**
	* 允许上传图片数量
	*@return 
	*/
	public Integer getSgAlbumLimit(){
		return  sgAlbumLimit;
	}
	/**
	* 允许上传图片数量
	*@param  sgAlbumLimit
	*/
	public void setSgAlbumLimit(Integer sgAlbumLimit ){
		this.sgAlbumLimit = sgAlbumLimit;
	}
	
	/**
	* 允许发布的商品数量
	*@return 
	*/
	public Integer getSgGoodsLimit(){
		return  sgGoodsLimit;
	}
	/**
	* 允许发布的商品数量
	*@param  sgGoodsLimit
	*/
	public void setSgGoodsLimit(Integer sgGoodsLimit ){
		this.sgGoodsLimit = sgGoodsLimit;
	}
	
	/**
	* 级别，数目越大级别越高
	*@return 
	*/
	public Integer getSgSort(){
		return  sgSort;
	}
	/**
	* 级别，数目越大级别越高
	*@param  sgSort
	*/
	public void setSgSort(Integer sgSort ){
		this.sgSort = sgSort;
	}
	
	/**
	* 上传空间大小，单位MB
	*@return 
	*/
	public Integer getSgSpaceLimit(){
		return  sgSpaceLimit;
	}
	/**
	* 上传空间大小，单位MB
	*@param  sgSpaceLimit
	*/
	public void setSgSpaceLimit(Integer sgSpaceLimit ){
		this.sgSpaceLimit = sgSpaceLimit;
	}
	
	/**
	* 选择店铺模板套数
	*@return 
	*/
	public Integer getSgTemplateNumber(){
		return  sgTemplateNumber;
	}
	/**
	* 选择店铺模板套数
	*@param  sgTemplateNumber
	*/
	public void setSgTemplateNumber(Integer sgTemplateNumber ){
		this.sgTemplateNumber = sgTemplateNumber;
	}
	
	/**
	* 申请说明
	*@return 
	*/
	public String getSgDescription(){
		return  sgDescription;
	}
	/**
	* 申请说明
	*@param  sgDescription
	*/
	public void setSgDescription(String sgDescription ){
		this.sgDescription = sgDescription;
	}
	
	/**
	* 附加功能
	*@return 
	*/
	public String getSgFunction(){
		return  sgFunction;
	}
	/**
	* 附加功能
	*@param  sgFunction
	*/
	public void setSgFunction(String sgFunction ){
		this.sgFunction = sgFunction;
	}
	
	/**
	* 等级名称
	*@return 
	*/
	public String getSgName(){
		return  sgName;
	}
	/**
	* 等级名称
	*@param  sgName
	*/
	public void setSgName(String sgName ){
		this.sgName = sgName;
	}
	
	/**
	* 开店费用(元/年)
	*@return 
	*/
	public BigDecimal getSgPrice(){
		return  sgPrice;
	}
	/**
	* 开店费用(元/年)
	*@param  sgPrice
	*/
	public void setSgPrice(BigDecimal sgPrice ){
		this.sgPrice = sgPrice;
	}
	
	/**
	* 模板内容
	*@return 
	*/
	public String getSgTemplate(){
		return  sgTemplate;
	}
	/**
	* 模板内容
	*@param  sgTemplate
	*/
	public void setSgTemplate(String sgTemplate ){
		this.sgTemplate = sgTemplate;
	}
	

}
