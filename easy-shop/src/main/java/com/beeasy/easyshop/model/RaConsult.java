package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_consult")
public class RaConsult   {
	
	/*
	咨询编号
	*/
	private Integer consultId ;
	/*
	咨询发布时间
	*/
	private Integer consultAddtime ;
	/*
	咨询回复时间
	*/
	private Integer consultReplyTime ;
	/*
	咨询类型
	*/
	private Integer ctId ;
	/*
	商品编号
	*/
	private Integer goodsId ;
	/*
	0表示不匿名 1表示匿名
	*/
	private Integer isanonymous ;
	/*
	咨询发布者会员编号(0：游客)
	*/
	private Integer memberId ;
	/*
	店铺编号
	*/
	private Integer storeId ;
	/*
	咨询内容
	*/
	private String consultContent ;
	/*
	咨询回复内容
	*/
	private String consultReply ;
	/*
	商品名称
	*/
	private String goodsName ;
	/*
	会员名称
	*/
	private String memberName ;
	/*
	店铺名称
	*/
	private String storeName ;
	
	public RaConsult() {
	}
	
	/**
	* 咨询编号
	*@return 
	*/
	public Integer getConsultId(){
		return  consultId;
	}
	/**
	* 咨询编号
	*@param  consultId
	*/
	public void setConsultId(Integer consultId ){
		this.consultId = consultId;
	}
	
	/**
	* 咨询发布时间
	*@return 
	*/
	public Integer getConsultAddtime(){
		return  consultAddtime;
	}
	/**
	* 咨询发布时间
	*@param  consultAddtime
	*/
	public void setConsultAddtime(Integer consultAddtime ){
		this.consultAddtime = consultAddtime;
	}
	
	/**
	* 咨询回复时间
	*@return 
	*/
	public Integer getConsultReplyTime(){
		return  consultReplyTime;
	}
	/**
	* 咨询回复时间
	*@param  consultReplyTime
	*/
	public void setConsultReplyTime(Integer consultReplyTime ){
		this.consultReplyTime = consultReplyTime;
	}
	
	/**
	* 咨询类型
	*@return 
	*/
	public Integer getCtId(){
		return  ctId;
	}
	/**
	* 咨询类型
	*@param  ctId
	*/
	public void setCtId(Integer ctId ){
		this.ctId = ctId;
	}
	
	/**
	* 商品编号
	*@return 
	*/
	public Integer getGoodsId(){
		return  goodsId;
	}
	/**
	* 商品编号
	*@param  goodsId
	*/
	public void setGoodsId(Integer goodsId ){
		this.goodsId = goodsId;
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
	public Integer getMemberId(){
		return  memberId;
	}
	/**
	* 咨询发布者会员编号(0：游客)
	*@param  memberId
	*/
	public void setMemberId(Integer memberId ){
		this.memberId = memberId;
	}
	
	/**
	* 店铺编号
	*@return 
	*/
	public Integer getStoreId(){
		return  storeId;
	}
	/**
	* 店铺编号
	*@param  storeId
	*/
	public void setStoreId(Integer storeId ){
		this.storeId = storeId;
	}
	
	/**
	* 咨询内容
	*@return 
	*/
	public String getConsultContent(){
		return  consultContent;
	}
	/**
	* 咨询内容
	*@param  consultContent
	*/
	public void setConsultContent(String consultContent ){
		this.consultContent = consultContent;
	}
	
	/**
	* 咨询回复内容
	*@return 
	*/
	public String getConsultReply(){
		return  consultReply;
	}
	/**
	* 咨询回复内容
	*@param  consultReply
	*/
	public void setConsultReply(String consultReply ){
		this.consultReply = consultReply;
	}
	
	/**
	* 商品名称
	*@return 
	*/
	public String getGoodsName(){
		return  goodsName;
	}
	/**
	* 商品名称
	*@param  goodsName
	*/
	public void setGoodsName(String goodsName ){
		this.goodsName = goodsName;
	}
	
	/**
	* 会员名称
	*@return 
	*/
	public String getMemberName(){
		return  memberName;
	}
	/**
	* 会员名称
	*@param  memberName
	*/
	public void setMemberName(String memberName ){
		this.memberName = memberName;
	}
	
	/**
	* 店铺名称
	*@return 
	*/
	public String getStoreName(){
		return  storeName;
	}
	/**
	* 店铺名称
	*@param  storeName
	*/
	public void setStoreName(String storeName ){
		this.storeName = storeName;
	}
	

}
