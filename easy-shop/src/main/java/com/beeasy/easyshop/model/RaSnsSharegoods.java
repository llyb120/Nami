package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_sns_sharegoods")
public class RaSnsSharegoods   {
	
	// alias
	public static final String ALIAS_share_id = "share_id";
	public static final String ALIAS_share_addtime = "share_addtime";
	public static final String ALIAS_share_commentcount = "share_commentcount";
	public static final String ALIAS_share_goodsid = "share_goodsid";
	public static final String ALIAS_share_islike = "share_islike";
	public static final String ALIAS_share_isshare = "share_isshare";
	public static final String ALIAS_share_likeaddtime = "share_likeaddtime";
	public static final String ALIAS_share_memberid = "share_memberid";
	public static final String ALIAS_share_privacy = "share_privacy";
	public static final String ALIAS_share_content = "share_content";
	public static final String ALIAS_share_membername = "share_membername";
	
	/*
	自增ID
	*/
	private Integer share_id ;
	/*
	分享操作时间
	*/
	private Integer share_addtime ;
	/*
	评论数
	*/
	private Integer share_commentcount ;
	/*
	商品ID
	*/
	private Integer share_goodsid ;
	/*
	是否喜欢 0为未喜欢 1为喜欢
	*/
	private Integer share_islike ;
	/*
	是否分享 0为未分享 1为分享
	*/
	private Integer share_isshare ;
	/*
	喜欢操作时间
	*/
	private Integer share_likeaddtime ;
	/*
	所属会员ID
	*/
	private Integer share_memberid ;
	/*
	隐私可见度 0所有人可见 1好友可见 2仅自己可见
	*/
	private Integer share_privacy ;
	/*
	描述内容
	*/
	private String share_content ;
	/*
	会员名称
	*/
	private String share_membername ;
	
	public RaSnsSharegoods() {
	}
	
	/**
	* 自增ID
	*@return 
	*/
	public Integer getShare_id(){
		return  share_id;
	}
	/**
	* 自增ID
	*@param  share_id
	*/
	public void setShare_id(Integer share_id ){
		this.share_id = share_id;
	}
	
	/**
	* 分享操作时间
	*@return 
	*/
	public Integer getShare_addtime(){
		return  share_addtime;
	}
	/**
	* 分享操作时间
	*@param  share_addtime
	*/
	public void setShare_addtime(Integer share_addtime ){
		this.share_addtime = share_addtime;
	}
	
	/**
	* 评论数
	*@return 
	*/
	public Integer getShare_commentcount(){
		return  share_commentcount;
	}
	/**
	* 评论数
	*@param  share_commentcount
	*/
	public void setShare_commentcount(Integer share_commentcount ){
		this.share_commentcount = share_commentcount;
	}
	
	/**
	* 商品ID
	*@return 
	*/
	public Integer getShare_goodsid(){
		return  share_goodsid;
	}
	/**
	* 商品ID
	*@param  share_goodsid
	*/
	public void setShare_goodsid(Integer share_goodsid ){
		this.share_goodsid = share_goodsid;
	}
	
	/**
	* 是否喜欢 0为未喜欢 1为喜欢
	*@return 
	*/
	public Integer getShare_islike(){
		return  share_islike;
	}
	/**
	* 是否喜欢 0为未喜欢 1为喜欢
	*@param  share_islike
	*/
	public void setShare_islike(Integer share_islike ){
		this.share_islike = share_islike;
	}
	
	/**
	* 是否分享 0为未分享 1为分享
	*@return 
	*/
	public Integer getShare_isshare(){
		return  share_isshare;
	}
	/**
	* 是否分享 0为未分享 1为分享
	*@param  share_isshare
	*/
	public void setShare_isshare(Integer share_isshare ){
		this.share_isshare = share_isshare;
	}
	
	/**
	* 喜欢操作时间
	*@return 
	*/
	public Integer getShare_likeaddtime(){
		return  share_likeaddtime;
	}
	/**
	* 喜欢操作时间
	*@param  share_likeaddtime
	*/
	public void setShare_likeaddtime(Integer share_likeaddtime ){
		this.share_likeaddtime = share_likeaddtime;
	}
	
	/**
	* 所属会员ID
	*@return 
	*/
	public Integer getShare_memberid(){
		return  share_memberid;
	}
	/**
	* 所属会员ID
	*@param  share_memberid
	*/
	public void setShare_memberid(Integer share_memberid ){
		this.share_memberid = share_memberid;
	}
	
	/**
	* 隐私可见度 0所有人可见 1好友可见 2仅自己可见
	*@return 
	*/
	public Integer getShare_privacy(){
		return  share_privacy;
	}
	/**
	* 隐私可见度 0所有人可见 1好友可见 2仅自己可见
	*@param  share_privacy
	*/
	public void setShare_privacy(Integer share_privacy ){
		this.share_privacy = share_privacy;
	}
	
	/**
	* 描述内容
	*@return 
	*/
	public String getShare_content(){
		return  share_content;
	}
	/**
	* 描述内容
	*@param  share_content
	*/
	public void setShare_content(String share_content ){
		this.share_content = share_content;
	}
	
	/**
	* 会员名称
	*@return 
	*/
	public String getShare_membername(){
		return  share_membername;
	}
	/**
	* 会员名称
	*@param  share_membername
	*/
	public void setShare_membername(String share_membername ){
		this.share_membername = share_membername;
	}
	

}
