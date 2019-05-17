package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_complain")
public class RaComplain   {
	
	/*
	投诉id
	*/
	private Integer complainId ;
	/*
	被告id
	*/
	private Integer accusedId ;
	/*
	原告id
	*/
	private Integer accuserId ;
	/*
	申诉时间
	*/
	private Integer appealDatetime ;
	/*
	投诉是否通过平台审批(1未通过/2通过)
	*/
	private Integer complainActive ;
	/*
	投诉时间
	*/
	private Integer complainDatetime ;
	/*
	投诉处理时间
	*/
	private Integer complainHandleDatetime ;
	/*
	投诉处理人id
	*/
	private Integer complainHandleMemberId ;
	/*
	投诉状态(10-新投诉/20-投诉通过转给被投诉人/30-被投诉人已申诉/40-提交仲裁/99-已关闭)
	*/
	private Integer complainState ;
	/*
	投诉主题id
	*/
	private Integer complainSubjectId ;
	/*
	最终处理时间
	*/
	private Integer finalHandleDatetime ;
	/*
	最终处理人id
	*/
	private Integer finalHandleMemberId ;
	/*
	订单商品ID
	*/
	private Integer orderGoodsId ;
	/*
	订单id
	*/
	private Integer orderId ;
	/*
	被告名称
	*/
	private String accusedName ;
	/*
	原告名称
	*/
	private String accuserName ;
	/*
	申诉内容
	*/
	private String appealMessage ;
	/*
	申诉图片1
	*/
	private String appealPic1 ;
	/*
	申诉图片2
	*/
	private String appealPic2 ;
	/*
	申诉图片3
	*/
	private String appealPic3 ;
	/*
	投诉内容
	*/
	private String complainContent ;
	/*
	投诉图片1
	*/
	private String complainPic1 ;
	/*
	投诉图片2
	*/
	private String complainPic2 ;
	/*
	投诉图片3
	*/
	private String complainPic3 ;
	/*
	投诉主题
	*/
	private String complainSubjectContent ;
	/*
	最终处理意见
	*/
	private String finalHandleMessage ;
	
	public RaComplain() {
	}
	
	/**
	* 投诉id
	*@return 
	*/
	public Integer getComplainId(){
		return  complainId;
	}
	/**
	* 投诉id
	*@param  complainId
	*/
	public void setComplainId(Integer complainId ){
		this.complainId = complainId;
	}
	
	/**
	* 被告id
	*@return 
	*/
	public Integer getAccusedId(){
		return  accusedId;
	}
	/**
	* 被告id
	*@param  accusedId
	*/
	public void setAccusedId(Integer accusedId ){
		this.accusedId = accusedId;
	}
	
	/**
	* 原告id
	*@return 
	*/
	public Integer getAccuserId(){
		return  accuserId;
	}
	/**
	* 原告id
	*@param  accuserId
	*/
	public void setAccuserId(Integer accuserId ){
		this.accuserId = accuserId;
	}
	
	/**
	* 申诉时间
	*@return 
	*/
	public Integer getAppealDatetime(){
		return  appealDatetime;
	}
	/**
	* 申诉时间
	*@param  appealDatetime
	*/
	public void setAppealDatetime(Integer appealDatetime ){
		this.appealDatetime = appealDatetime;
	}
	
	/**
	* 投诉是否通过平台审批(1未通过/2通过)
	*@return 
	*/
	public Integer getComplainActive(){
		return  complainActive;
	}
	/**
	* 投诉是否通过平台审批(1未通过/2通过)
	*@param  complainActive
	*/
	public void setComplainActive(Integer complainActive ){
		this.complainActive = complainActive;
	}
	
	/**
	* 投诉时间
	*@return 
	*/
	public Integer getComplainDatetime(){
		return  complainDatetime;
	}
	/**
	* 投诉时间
	*@param  complainDatetime
	*/
	public void setComplainDatetime(Integer complainDatetime ){
		this.complainDatetime = complainDatetime;
	}
	
	/**
	* 投诉处理时间
	*@return 
	*/
	public Integer getComplainHandleDatetime(){
		return  complainHandleDatetime;
	}
	/**
	* 投诉处理时间
	*@param  complainHandleDatetime
	*/
	public void setComplainHandleDatetime(Integer complainHandleDatetime ){
		this.complainHandleDatetime = complainHandleDatetime;
	}
	
	/**
	* 投诉处理人id
	*@return 
	*/
	public Integer getComplainHandleMemberId(){
		return  complainHandleMemberId;
	}
	/**
	* 投诉处理人id
	*@param  complainHandleMemberId
	*/
	public void setComplainHandleMemberId(Integer complainHandleMemberId ){
		this.complainHandleMemberId = complainHandleMemberId;
	}
	
	/**
	* 投诉状态(10-新投诉/20-投诉通过转给被投诉人/30-被投诉人已申诉/40-提交仲裁/99-已关闭)
	*@return 
	*/
	public Integer getComplainState(){
		return  complainState;
	}
	/**
	* 投诉状态(10-新投诉/20-投诉通过转给被投诉人/30-被投诉人已申诉/40-提交仲裁/99-已关闭)
	*@param  complainState
	*/
	public void setComplainState(Integer complainState ){
		this.complainState = complainState;
	}
	
	/**
	* 投诉主题id
	*@return 
	*/
	public Integer getComplainSubjectId(){
		return  complainSubjectId;
	}
	/**
	* 投诉主题id
	*@param  complainSubjectId
	*/
	public void setComplainSubjectId(Integer complainSubjectId ){
		this.complainSubjectId = complainSubjectId;
	}
	
	/**
	* 最终处理时间
	*@return 
	*/
	public Integer getFinalHandleDatetime(){
		return  finalHandleDatetime;
	}
	/**
	* 最终处理时间
	*@param  finalHandleDatetime
	*/
	public void setFinalHandleDatetime(Integer finalHandleDatetime ){
		this.finalHandleDatetime = finalHandleDatetime;
	}
	
	/**
	* 最终处理人id
	*@return 
	*/
	public Integer getFinalHandleMemberId(){
		return  finalHandleMemberId;
	}
	/**
	* 最终处理人id
	*@param  finalHandleMemberId
	*/
	public void setFinalHandleMemberId(Integer finalHandleMemberId ){
		this.finalHandleMemberId = finalHandleMemberId;
	}
	
	/**
	* 订单商品ID
	*@return 
	*/
	public Integer getOrderGoodsId(){
		return  orderGoodsId;
	}
	/**
	* 订单商品ID
	*@param  orderGoodsId
	*/
	public void setOrderGoodsId(Integer orderGoodsId ){
		this.orderGoodsId = orderGoodsId;
	}
	
	/**
	* 订单id
	*@return 
	*/
	public Integer getOrderId(){
		return  orderId;
	}
	/**
	* 订单id
	*@param  orderId
	*/
	public void setOrderId(Integer orderId ){
		this.orderId = orderId;
	}
	
	/**
	* 被告名称
	*@return 
	*/
	public String getAccusedName(){
		return  accusedName;
	}
	/**
	* 被告名称
	*@param  accusedName
	*/
	public void setAccusedName(String accusedName ){
		this.accusedName = accusedName;
	}
	
	/**
	* 原告名称
	*@return 
	*/
	public String getAccuserName(){
		return  accuserName;
	}
	/**
	* 原告名称
	*@param  accuserName
	*/
	public void setAccuserName(String accuserName ){
		this.accuserName = accuserName;
	}
	
	/**
	* 申诉内容
	*@return 
	*/
	public String getAppealMessage(){
		return  appealMessage;
	}
	/**
	* 申诉内容
	*@param  appealMessage
	*/
	public void setAppealMessage(String appealMessage ){
		this.appealMessage = appealMessage;
	}
	
	/**
	* 申诉图片1
	*@return 
	*/
	public String getAppealPic1(){
		return  appealPic1;
	}
	/**
	* 申诉图片1
	*@param  appealPic1
	*/
	public void setAppealPic1(String appealPic1 ){
		this.appealPic1 = appealPic1;
	}
	
	/**
	* 申诉图片2
	*@return 
	*/
	public String getAppealPic2(){
		return  appealPic2;
	}
	/**
	* 申诉图片2
	*@param  appealPic2
	*/
	public void setAppealPic2(String appealPic2 ){
		this.appealPic2 = appealPic2;
	}
	
	/**
	* 申诉图片3
	*@return 
	*/
	public String getAppealPic3(){
		return  appealPic3;
	}
	/**
	* 申诉图片3
	*@param  appealPic3
	*/
	public void setAppealPic3(String appealPic3 ){
		this.appealPic3 = appealPic3;
	}
	
	/**
	* 投诉内容
	*@return 
	*/
	public String getComplainContent(){
		return  complainContent;
	}
	/**
	* 投诉内容
	*@param  complainContent
	*/
	public void setComplainContent(String complainContent ){
		this.complainContent = complainContent;
	}
	
	/**
	* 投诉图片1
	*@return 
	*/
	public String getComplainPic1(){
		return  complainPic1;
	}
	/**
	* 投诉图片1
	*@param  complainPic1
	*/
	public void setComplainPic1(String complainPic1 ){
		this.complainPic1 = complainPic1;
	}
	
	/**
	* 投诉图片2
	*@return 
	*/
	public String getComplainPic2(){
		return  complainPic2;
	}
	/**
	* 投诉图片2
	*@param  complainPic2
	*/
	public void setComplainPic2(String complainPic2 ){
		this.complainPic2 = complainPic2;
	}
	
	/**
	* 投诉图片3
	*@return 
	*/
	public String getComplainPic3(){
		return  complainPic3;
	}
	/**
	* 投诉图片3
	*@param  complainPic3
	*/
	public void setComplainPic3(String complainPic3 ){
		this.complainPic3 = complainPic3;
	}
	
	/**
	* 投诉主题
	*@return 
	*/
	public String getComplainSubjectContent(){
		return  complainSubjectContent;
	}
	/**
	* 投诉主题
	*@param  complainSubjectContent
	*/
	public void setComplainSubjectContent(String complainSubjectContent ){
		this.complainSubjectContent = complainSubjectContent;
	}
	
	/**
	* 最终处理意见
	*@return 
	*/
	public String getFinalHandleMessage(){
		return  finalHandleMessage;
	}
	/**
	* 最终处理意见
	*@param  finalHandleMessage
	*/
	public void setFinalHandleMessage(String finalHandleMessage ){
		this.finalHandleMessage = finalHandleMessage;
	}
	

}
