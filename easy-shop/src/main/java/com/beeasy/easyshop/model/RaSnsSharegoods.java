package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_sns_sharegoods")
public class RaSnsSharegoods   {
	
	/*
	自增ID
	*/
	private Integer shareId ;
	/*
	分享操作时间
	*/
	private Integer shareAddtime ;
	/*
	评论数
	*/
	private Integer shareCommentcount ;
	/*
	商品ID
	*/
	private Integer shareGoodsid ;
	/*
	是否喜欢 0为未喜欢 1为喜欢
	*/
	private Integer shareIslike ;
	/*
	是否分享 0为未分享 1为分享
	*/
	private Integer shareIsshare ;
	/*
	喜欢操作时间
	*/
	private Integer shareLikeaddtime ;
	/*
	所属会员ID
	*/
	private Integer shareMemberid ;
	/*
	隐私可见度 0所有人可见 1好友可见 2仅自己可见
	*/
	private Integer sharePrivacy ;
	/*
	描述内容
	*/
	private String shareContent ;
	/*
	会员名称
	*/
	private String shareMembername ;
	
	public RaSnsSharegoods() {
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
	* 分享操作时间
	*@return 
	*/
	public Integer getShareAddtime(){
		return  shareAddtime;
	}
	/**
	* 分享操作时间
	*@param  shareAddtime
	*/
	public void setShareAddtime(Integer shareAddtime ){
		this.shareAddtime = shareAddtime;
	}
	
	/**
	* 评论数
	*@return 
	*/
	public Integer getShareCommentcount(){
		return  shareCommentcount;
	}
	/**
	* 评论数
	*@param  shareCommentcount
	*/
	public void setShareCommentcount(Integer shareCommentcount ){
		this.shareCommentcount = shareCommentcount;
	}
	
	/**
	* 商品ID
	*@return 
	*/
	public Integer getShareGoodsid(){
		return  shareGoodsid;
	}
	/**
	* 商品ID
	*@param  shareGoodsid
	*/
	public void setShareGoodsid(Integer shareGoodsid ){
		this.shareGoodsid = shareGoodsid;
	}
	
	/**
	* 是否喜欢 0为未喜欢 1为喜欢
	*@return 
	*/
	public Integer getShareIslike(){
		return  shareIslike;
	}
	/**
	* 是否喜欢 0为未喜欢 1为喜欢
	*@param  shareIslike
	*/
	public void setShareIslike(Integer shareIslike ){
		this.shareIslike = shareIslike;
	}
	
	/**
	* 是否分享 0为未分享 1为分享
	*@return 
	*/
	public Integer getShareIsshare(){
		return  shareIsshare;
	}
	/**
	* 是否分享 0为未分享 1为分享
	*@param  shareIsshare
	*/
	public void setShareIsshare(Integer shareIsshare ){
		this.shareIsshare = shareIsshare;
	}
	
	/**
	* 喜欢操作时间
	*@return 
	*/
	public Integer getShareLikeaddtime(){
		return  shareLikeaddtime;
	}
	/**
	* 喜欢操作时间
	*@param  shareLikeaddtime
	*/
	public void setShareLikeaddtime(Integer shareLikeaddtime ){
		this.shareLikeaddtime = shareLikeaddtime;
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
	* 会员名称
	*@return 
	*/
	public String getShareMembername(){
		return  shareMembername;
	}
	/**
	* 会员名称
	*@param  shareMembername
	*/
	public void setShareMembername(String shareMembername ){
		this.shareMembername = shareMembername;
	}
	

}
