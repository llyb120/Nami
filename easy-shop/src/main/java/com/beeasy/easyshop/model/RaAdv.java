package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_adv")
public class RaAdv   {
	
	/*
	广告自增标识编号
	*/
	private Integer advId ;
	/*
	广告结束时间
	*/
	private Integer advEndDate ;
	/*
	广告开始时间
	*/
	private Integer advStartDate ;
	/*
	广告位id
	*/
	private Integer apId ;
	/*
	广告点击率
	*/
	private Integer clickNum ;
	/*
	购买所支付的金币
	*/
	private Integer goldpay ;
	/*
	会员购买的广告是否通过审核0未审核1审核已通过2审核未通过
	*/
	private Integer isAllow ;
	/*
	会员ID
	*/
	private Integer memberId ;
	/*
	幻灯片排序
	*/
	private Integer slideSort ;
	/*
	广告内容
	*/
	private String advContent ;
	/*
	广告内容描述
	*/
	private String advTitle ;
	/*
	购买方式
	*/
	private String buyStyle ;
	/*
	会员用户名
	*/
	private String memberName ;
	
	public RaAdv() {
	}
	
	/**
	* 广告自增标识编号
	*@return 
	*/
	public Integer getAdvId(){
		return  advId;
	}
	/**
	* 广告自增标识编号
	*@param  advId
	*/
	public void setAdvId(Integer advId ){
		this.advId = advId;
	}
	
	/**
	* 广告结束时间
	*@return 
	*/
	public Integer getAdvEndDate(){
		return  advEndDate;
	}
	/**
	* 广告结束时间
	*@param  advEndDate
	*/
	public void setAdvEndDate(Integer advEndDate ){
		this.advEndDate = advEndDate;
	}
	
	/**
	* 广告开始时间
	*@return 
	*/
	public Integer getAdvStartDate(){
		return  advStartDate;
	}
	/**
	* 广告开始时间
	*@param  advStartDate
	*/
	public void setAdvStartDate(Integer advStartDate ){
		this.advStartDate = advStartDate;
	}
	
	/**
	* 广告位id
	*@return 
	*/
	public Integer getApId(){
		return  apId;
	}
	/**
	* 广告位id
	*@param  apId
	*/
	public void setApId(Integer apId ){
		this.apId = apId;
	}
	
	/**
	* 广告点击率
	*@return 
	*/
	public Integer getClickNum(){
		return  clickNum;
	}
	/**
	* 广告点击率
	*@param  clickNum
	*/
	public void setClickNum(Integer clickNum ){
		this.clickNum = clickNum;
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
	public Integer getIsAllow(){
		return  isAllow;
	}
	/**
	* 会员购买的广告是否通过审核0未审核1审核已通过2审核未通过
	*@param  isAllow
	*/
	public void setIsAllow(Integer isAllow ){
		this.isAllow = isAllow;
	}
	
	/**
	* 会员ID
	*@return 
	*/
	public Integer getMemberId(){
		return  memberId;
	}
	/**
	* 会员ID
	*@param  memberId
	*/
	public void setMemberId(Integer memberId ){
		this.memberId = memberId;
	}
	
	/**
	* 幻灯片排序
	*@return 
	*/
	public Integer getSlideSort(){
		return  slideSort;
	}
	/**
	* 幻灯片排序
	*@param  slideSort
	*/
	public void setSlideSort(Integer slideSort ){
		this.slideSort = slideSort;
	}
	
	/**
	* 广告内容
	*@return 
	*/
	public String getAdvContent(){
		return  advContent;
	}
	/**
	* 广告内容
	*@param  advContent
	*/
	public void setAdvContent(String advContent ){
		this.advContent = advContent;
	}
	
	/**
	* 广告内容描述
	*@return 
	*/
	public String getAdvTitle(){
		return  advTitle;
	}
	/**
	* 广告内容描述
	*@param  advTitle
	*/
	public void setAdvTitle(String advTitle ){
		this.advTitle = advTitle;
	}
	
	/**
	* 购买方式
	*@return 
	*/
	public String getBuyStyle(){
		return  buyStyle;
	}
	/**
	* 购买方式
	*@param  buyStyle
	*/
	public void setBuyStyle(String buyStyle ){
		this.buyStyle = buyStyle;
	}
	
	/**
	* 会员用户名
	*@return 
	*/
	public String getMemberName(){
		return  memberName;
	}
	/**
	* 会员用户名
	*@param  memberName
	*/
	public void setMemberName(String memberName ){
		this.memberName = memberName;
	}
	

}
