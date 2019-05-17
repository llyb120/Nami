package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_sns_sharestore")
public class RaSnsSharestore   {
	
	/*
	自增ID
	*/
	private Integer shareId ;
	/*
	添加时间
	*/
	private Integer shareAddtime ;
	/*
	所属会员ID
	*/
	private Integer shareMemberid ;
	/*
	隐私可见度 0所有人可见 1好友可见 2仅自己可见
	*/
	private Integer sharePrivacy ;
	/*
	店铺编号
	*/
	private Integer shareStoreid ;
	/*
	描述内容
	*/
	private String shareContent ;
	/*
	所属会员名称
	*/
	private String shareMembername ;
	/*
	店铺名称
	*/
	private String shareStorename ;
	
	public RaSnsSharestore() {
	}
	
	/**
	* 自增ID
	*@return 
	*/
	public Integer getShareId(){
		return  shareId;
	}
	/**
	* 自增ID
	*@param  shareId
	*/
	public void setShareId(Integer shareId ){
		this.shareId = shareId;
	}
	
	/**
	* 添加时间
	*@return 
	*/
	public Integer getShareAddtime(){
		return  shareAddtime;
	}
	/**
	* 添加时间
	*@param  shareAddtime
	*/
	public void setShareAddtime(Integer shareAddtime ){
		this.shareAddtime = shareAddtime;
	}
	
	/**
	* 所属会员ID
	*@return 
	*/
	public Integer getShareMemberid(){
		return  shareMemberid;
	}
	/**
	* 所属会员ID
	*@param  shareMemberid
	*/
	public void setShareMemberid(Integer shareMemberid ){
		this.shareMemberid = shareMemberid;
	}
	
	/**
	* 隐私可见度 0所有人可见 1好友可见 2仅自己可见
	*@return 
	*/
	public Integer getSharePrivacy(){
		return  sharePrivacy;
	}
	/**
	* 隐私可见度 0所有人可见 1好友可见 2仅自己可见
	*@param  sharePrivacy
	*/
	public void setSharePrivacy(Integer sharePrivacy ){
		this.sharePrivacy = sharePrivacy;
	}
	
	/**
	* 店铺编号
	*@return 
	*/
	public Integer getShareStoreid(){
		return  shareStoreid;
	}
	/**
	* 店铺编号
	*@param  shareStoreid
	*/
	public void setShareStoreid(Integer shareStoreid ){
		this.shareStoreid = shareStoreid;
	}
	
	/**
	* 描述内容
	*@return 
	*/
	public String getShareContent(){
		return  shareContent;
	}
	/**
	* 描述内容
	*@param  shareContent
	*/
	public void setShareContent(String shareContent ){
		this.shareContent = shareContent;
	}
	
	/**
	* 所属会员名称
	*@return 
	*/
	public String getShareMembername(){
		return  shareMembername;
	}
	/**
	* 所属会员名称
	*@param  shareMembername
	*/
	public void setShareMembername(String shareMembername ){
		this.shareMembername = shareMembername;
	}
	
	/**
	* 店铺名称
	*@return 
	*/
	public String getShareStorename(){
		return  shareStorename;
	}
	/**
	* 店铺名称
	*@param  shareStorename
	*/
	public void setShareStorename(String shareStorename ){
		this.shareStorename = shareStorename;
	}
	

}
