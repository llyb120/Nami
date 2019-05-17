package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_store_reopen")
public class RaStoreReopen   {
	
	private Integer reId ;
	/*
	记录创建时间
	*/
	private Integer reCreateTime ;
	/*
	有效期结束时间
	*/
	private Integer reEndTime ;
	/*
	店铺等级ID
	*/
	private Integer reGradeId ;
	/*
	有效期开始时间
	*/
	private Integer reStartTime ;
	/*
	状态0默认，未上传凭证1审核中2审核通过
	*/
	private Integer reState ;
	/*
	店铺ID
	*/
	private Integer reStoreId ;
	/*
	续签时长(年)
	*/
	private Integer reYear ;
	/*
	等级名称
	*/
	private String reGradeName ;
	/*
	等级收费(元/年)
	*/
	private BigDecimal reGradePrice ;
	/*
	应付总金额
	*/
	private BigDecimal rePayAmount ;
	/*
	付款凭证
	*/
	private String rePayCert ;
	/*
	付款凭证说明
	*/
	private String rePayCertExplain ;
	/*
	店铺名字
	*/
	private String reStoreName ;
	
	public RaStoreReopen() {
	}
	
	public Integer getReId(){
		return  reId;
	}
	public void setReId(Integer reId ){
		this.reId = reId;
	}
	
	/**
	* 记录创建时间
	*@return 
	*/
	public Integer getReCreateTime(){
		return  reCreateTime;
	}
	/**
	* 记录创建时间
	*@param  reCreateTime
	*/
	public void setReCreateTime(Integer reCreateTime ){
		this.reCreateTime = reCreateTime;
	}
	
	/**
	* 有效期结束时间
	*@return 
	*/
	public Integer getReEndTime(){
		return  reEndTime;
	}
	/**
	* 有效期结束时间
	*@param  reEndTime
	*/
	public void setReEndTime(Integer reEndTime ){
		this.reEndTime = reEndTime;
	}
	
	/**
	* 店铺等级ID
	*@return 
	*/
	public Integer getReGradeId(){
		return  reGradeId;
	}
	/**
	* 店铺等级ID
	*@param  reGradeId
	*/
	public void setReGradeId(Integer reGradeId ){
		this.reGradeId = reGradeId;
	}
	
	/**
	* 有效期开始时间
	*@return 
	*/
	public Integer getReStartTime(){
		return  reStartTime;
	}
	/**
	* 有效期开始时间
	*@param  reStartTime
	*/
	public void setReStartTime(Integer reStartTime ){
		this.reStartTime = reStartTime;
	}
	
	/**
	* 状态0默认，未上传凭证1审核中2审核通过
	*@return 
	*/
	public Integer getReState(){
		return  reState;
	}
	/**
	* 状态0默认，未上传凭证1审核中2审核通过
	*@param  reState
	*/
	public void setReState(Integer reState ){
		this.reState = reState;
	}
	
	/**
	* 店铺ID
	*@return 
	*/
	public Integer getReStoreId(){
		return  reStoreId;
	}
	/**
	* 店铺ID
	*@param  reStoreId
	*/
	public void setReStoreId(Integer reStoreId ){
		this.reStoreId = reStoreId;
	}
	
	/**
	* 续签时长(年)
	*@return 
	*/
	public Integer getReYear(){
		return  reYear;
	}
	/**
	* 续签时长(年)
	*@param  reYear
	*/
	public void setReYear(Integer reYear ){
		this.reYear = reYear;
	}
	
	/**
	* 等级名称
	*@return 
	*/
	public String getReGradeName(){
		return  reGradeName;
	}
	/**
	* 等级名称
	*@param  reGradeName
	*/
	public void setReGradeName(String reGradeName ){
		this.reGradeName = reGradeName;
	}
	
	/**
	* 等级收费(元/年)
	*@return 
	*/
	public BigDecimal getReGradePrice(){
		return  reGradePrice;
	}
	/**
	* 等级收费(元/年)
	*@param  reGradePrice
	*/
	public void setReGradePrice(BigDecimal reGradePrice ){
		this.reGradePrice = reGradePrice;
	}
	
	/**
	* 应付总金额
	*@return 
	*/
	public BigDecimal getRePayAmount(){
		return  rePayAmount;
	}
	/**
	* 应付总金额
	*@param  rePayAmount
	*/
	public void setRePayAmount(BigDecimal rePayAmount ){
		this.rePayAmount = rePayAmount;
	}
	
	/**
	* 付款凭证
	*@return 
	*/
	public String getRePayCert(){
		return  rePayCert;
	}
	/**
	* 付款凭证
	*@param  rePayCert
	*/
	public void setRePayCert(String rePayCert ){
		this.rePayCert = rePayCert;
	}
	
	/**
	* 付款凭证说明
	*@return 
	*/
	public String getRePayCertExplain(){
		return  rePayCertExplain;
	}
	/**
	* 付款凭证说明
	*@param  rePayCertExplain
	*/
	public void setRePayCertExplain(String rePayCertExplain ){
		this.rePayCertExplain = rePayCertExplain;
	}
	
	/**
	* 店铺名字
	*@return 
	*/
	public String getReStoreName(){
		return  reStoreName;
	}
	/**
	* 店铺名字
	*@param  reStoreName
	*/
	public void setReStoreName(String reStoreName ){
		this.reStoreName = reStoreName;
	}
	

}
