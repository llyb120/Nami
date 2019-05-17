package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_store_sns_comment")
public class RaStoreSnsComment   {
	
	/*
	店铺动态评论id
	*/
	private Integer scommId ;
	/*
	会员id
	*/
	private Integer scommMemberid ;
	/*
	评论状态 1正常，0屏蔽
	*/
	private Integer scommState ;
	/*
	店铺动态id
	*/
	private Integer straceId ;
	/*
	评论内容
	*/
	private String scommContent ;
	/*
	会员头像
	*/
	private String scommMemberavatar ;
	/*
	会员名称
	*/
	private String scommMembername ;
	/*
	评论时间
	*/
	private String scommTime ;
	
	public RaStoreSnsComment() {
	}
	
	/**
	* 店铺动态评论id
	*@return 
	*/
	public Integer getScommId(){
		return  scommId;
	}
	/**
	* 店铺动态评论id
	*@param  scommId
	*/
	public void setScommId(Integer scommId ){
		this.scommId = scommId;
	}
	
	/**
	* 会员id
	*@return 
	*/
	public Integer getScommMemberid(){
		return  scommMemberid;
	}
	/**
	* 会员id
	*@param  scommMemberid
	*/
	public void setScommMemberid(Integer scommMemberid ){
		this.scommMemberid = scommMemberid;
	}
	
	/**
	* 评论状态 1正常，0屏蔽
	*@return 
	*/
	public Integer getScommState(){
		return  scommState;
	}
	/**
	* 评论状态 1正常，0屏蔽
	*@param  scommState
	*/
	public void setScommState(Integer scommState ){
		this.scommState = scommState;
	}
	
	/**
	* 店铺动态id
	*@return 
	*/
	public Integer getStraceId(){
		return  straceId;
	}
	/**
	* 店铺动态id
	*@param  straceId
	*/
	public void setStraceId(Integer straceId ){
		this.straceId = straceId;
	}
	
	/**
	* 评论内容
	*@return 
	*/
	public String getScommContent(){
		return  scommContent;
	}
	/**
	* 评论内容
	*@param  scommContent
	*/
	public void setScommContent(String scommContent ){
		this.scommContent = scommContent;
	}
	
	/**
	* 会员头像
	*@return 
	*/
	public String getScommMemberavatar(){
		return  scommMemberavatar;
	}
	/**
	* 会员头像
	*@param  scommMemberavatar
	*/
	public void setScommMemberavatar(String scommMemberavatar ){
		this.scommMemberavatar = scommMemberavatar;
	}
	
	/**
	* 会员名称
	*@return 
	*/
	public String getScommMembername(){
		return  scommMembername;
	}
	/**
	* 会员名称
	*@param  scommMembername
	*/
	public void setScommMembername(String scommMembername ){
		this.scommMembername = scommMembername;
	}
	
	/**
	* 评论时间
	*@return 
	*/
	public String getScommTime(){
		return  scommTime;
	}
	/**
	* 评论时间
	*@param  scommTime
	*/
	public void setScommTime(String scommTime ){
		this.scommTime = scommTime;
	}
	

}
