package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_inform")
public class RaInform   {
	
	/*
	举报id
	*/
	private Integer informId ;
	/*
	举报时间
	*/
	private Integer informDatetime ;
	/*
	被举报的商品id
	*/
	private Integer informGoodsId ;
	/*
	举报处理时间
	*/
	private Integer informHandleDatetime ;
	/*
	管理员id
	*/
	private Integer informHandleMemberId ;
	/*
	举报处理结果(1无效举报/2恶意举报/3有效举报)
	*/
	private Integer informHandleType ;
	/*
	举报人id
	*/
	private Integer informMemberId ;
	/*
	举报状态(1未处理/2已处理)
	*/
	private Integer informState ;
	/*
	被举报商品的店铺id
	*/
	private Integer informStoreId ;
	/*
	举报主题id
	*/
	private Integer informSubjectId ;
	/*
	举报信息
	*/
	private String informContent ;
	/*
	商品图
	*/
	private String informGoodsImage ;
	/*
	被举报的商品名称
	*/
	private String informGoodsName ;
	/*
	举报处理信息
	*/
	private String informHandleMessage ;
	/*
	举报人会员名
	*/
	private String informMemberName ;
	/*
	图片1
	*/
	private String informPic1 ;
	/*
	图片2
	*/
	private String informPic2 ;
	/*
	图片3
	*/
	private String informPic3 ;
	/*
	店铺名
	*/
	private String informStoreName ;
	/*
	举报主题
	*/
	private String informSubjectContent ;
	
	public RaInform() {
	}
	
	/**
	* 举报id
	*@return 
	*/
	public Integer getInformId(){
		return  informId;
	}
	/**
	* 举报id
	*@param  informId
	*/
	public void setInformId(Integer informId ){
		this.informId = informId;
	}
	
	/**
	* 举报时间
	*@return 
	*/
	public Integer getInformDatetime(){
		return  informDatetime;
	}
	/**
	* 举报时间
	*@param  informDatetime
	*/
	public void setInformDatetime(Integer informDatetime ){
		this.informDatetime = informDatetime;
	}
	
	/**
	* 被举报的商品id
	*@return 
	*/
	public Integer getInformGoodsId(){
		return  informGoodsId;
	}
	/**
	* 被举报的商品id
	*@param  informGoodsId
	*/
	public void setInformGoodsId(Integer informGoodsId ){
		this.informGoodsId = informGoodsId;
	}
	
	/**
	* 举报处理时间
	*@return 
	*/
	public Integer getInformHandleDatetime(){
		return  informHandleDatetime;
	}
	/**
	* 举报处理时间
	*@param  informHandleDatetime
	*/
	public void setInformHandleDatetime(Integer informHandleDatetime ){
		this.informHandleDatetime = informHandleDatetime;
	}
	
	/**
	* 管理员id
	*@return 
	*/
	public Integer getInformHandleMemberId(){
		return  informHandleMemberId;
	}
	/**
	* 管理员id
	*@param  informHandleMemberId
	*/
	public void setInformHandleMemberId(Integer informHandleMemberId ){
		this.informHandleMemberId = informHandleMemberId;
	}
	
	/**
	* 举报处理结果(1无效举报/2恶意举报/3有效举报)
	*@return 
	*/
	public Integer getInformHandleType(){
		return  informHandleType;
	}
	/**
	* 举报处理结果(1无效举报/2恶意举报/3有效举报)
	*@param  informHandleType
	*/
	public void setInformHandleType(Integer informHandleType ){
		this.informHandleType = informHandleType;
	}
	
	/**
	* 举报人id
	*@return 
	*/
	public Integer getInformMemberId(){
		return  informMemberId;
	}
	/**
	* 举报人id
	*@param  informMemberId
	*/
	public void setInformMemberId(Integer informMemberId ){
		this.informMemberId = informMemberId;
	}
	
	/**
	* 举报状态(1未处理/2已处理)
	*@return 
	*/
	public Integer getInformState(){
		return  informState;
	}
	/**
	* 举报状态(1未处理/2已处理)
	*@param  informState
	*/
	public void setInformState(Integer informState ){
		this.informState = informState;
	}
	
	/**
	* 被举报商品的店铺id
	*@return 
	*/
	public Integer getInformStoreId(){
		return  informStoreId;
	}
	/**
	* 被举报商品的店铺id
	*@param  informStoreId
	*/
	public void setInformStoreId(Integer informStoreId ){
		this.informStoreId = informStoreId;
	}
	
	/**
	* 举报主题id
	*@return 
	*/
	public Integer getInformSubjectId(){
		return  informSubjectId;
	}
	/**
	* 举报主题id
	*@param  informSubjectId
	*/
	public void setInformSubjectId(Integer informSubjectId ){
		this.informSubjectId = informSubjectId;
	}
	
	/**
	* 举报信息
	*@return 
	*/
	public String getInformContent(){
		return  informContent;
	}
	/**
	* 举报信息
	*@param  informContent
	*/
	public void setInformContent(String informContent ){
		this.informContent = informContent;
	}
	
	/**
	* 商品图
	*@return 
	*/
	public String getInformGoodsImage(){
		return  informGoodsImage;
	}
	/**
	* 商品图
	*@param  informGoodsImage
	*/
	public void setInformGoodsImage(String informGoodsImage ){
		this.informGoodsImage = informGoodsImage;
	}
	
	/**
	* 被举报的商品名称
	*@return 
	*/
	public String getInformGoodsName(){
		return  informGoodsName;
	}
	/**
	* 被举报的商品名称
	*@param  informGoodsName
	*/
	public void setInformGoodsName(String informGoodsName ){
		this.informGoodsName = informGoodsName;
	}
	
	/**
	* 举报处理信息
	*@return 
	*/
	public String getInformHandleMessage(){
		return  informHandleMessage;
	}
	/**
	* 举报处理信息
	*@param  informHandleMessage
	*/
	public void setInformHandleMessage(String informHandleMessage ){
		this.informHandleMessage = informHandleMessage;
	}
	
	/**
	* 举报人会员名
	*@return 
	*/
	public String getInformMemberName(){
		return  informMemberName;
	}
	/**
	* 举报人会员名
	*@param  informMemberName
	*/
	public void setInformMemberName(String informMemberName ){
		this.informMemberName = informMemberName;
	}
	
	/**
	* 图片1
	*@return 
	*/
	public String getInformPic1(){
		return  informPic1;
	}
	/**
	* 图片1
	*@param  informPic1
	*/
	public void setInformPic1(String informPic1 ){
		this.informPic1 = informPic1;
	}
	
	/**
	* 图片2
	*@return 
	*/
	public String getInformPic2(){
		return  informPic2;
	}
	/**
	* 图片2
	*@param  informPic2
	*/
	public void setInformPic2(String informPic2 ){
		this.informPic2 = informPic2;
	}
	
	/**
	* 图片3
	*@return 
	*/
	public String getInformPic3(){
		return  informPic3;
	}
	/**
	* 图片3
	*@param  informPic3
	*/
	public void setInformPic3(String informPic3 ){
		this.informPic3 = informPic3;
	}
	
	/**
	* 店铺名
	*@return 
	*/
	public String getInformStoreName(){
		return  informStoreName;
	}
	/**
	* 店铺名
	*@param  informStoreName
	*/
	public void setInformStoreName(String informStoreName ){
		this.informStoreName = informStoreName;
	}
	
	/**
	* 举报主题
	*@return 
	*/
	public String getInformSubjectContent(){
		return  informSubjectContent;
	}
	/**
	* 举报主题
	*@param  informSubjectContent
	*/
	public void setInformSubjectContent(String informSubjectContent ){
		this.informSubjectContent = informSubjectContent;
	}
	

}
