package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_sns_sharestore")
public class RaSnsSharestore   {
	
	// alias
	public static final String ALIAS_share_id = "share_id";
	public static final String ALIAS_share_addtime = "share_addtime";
	public static final String ALIAS_share_memberid = "share_memberid";
	public static final String ALIAS_share_privacy = "share_privacy";
	public static final String ALIAS_share_storeid = "share_storeid";
	public static final String ALIAS_share_content = "share_content";
	public static final String ALIAS_share_membername = "share_membername";
	public static final String ALIAS_share_storename = "share_storename";
	
	/*
	自增ID
	*/
	private Integer share_id ;
	/*
	添加时间
	*/
	private Integer share_addtime ;
	/*
	所属会员ID
	*/
	private Integer share_memberid ;
	/*
	隐私可见度 0所有人可见 1好友可见 2仅自己可见
	*/
	private Integer share_privacy ;
	/*
	店铺编号
	*/
	private Integer share_storeid ;
	/*
	描述内容
	*/
	private String share_content ;
	/*
	所属会员名称
	*/
	private String share_membername ;
	/*
	店铺名称
	*/
	private String share_storename ;
	
	public RaSnsSharestore() {
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
	* 添加时间
	*@return 
	*/
	public Integer getShare_addtime(){
		return  share_addtime;
	}
	/**
	* 添加时间
	*@param  share_addtime
	*/
	public void setShare_addtime(Integer share_addtime ){
		this.share_addtime = share_addtime;
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
	* 店铺编号
	*@return 
	*/
	public Integer getShare_storeid(){
		return  share_storeid;
	}
	/**
	* 店铺编号
	*@param  share_storeid
	*/
	public void setShare_storeid(Integer share_storeid ){
		this.share_storeid = share_storeid;
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
	* 所属会员名称
	*@return 
	*/
	public String getShare_membername(){
		return  share_membername;
	}
	/**
	* 所属会员名称
	*@param  share_membername
	*/
	public void setShare_membername(String share_membername ){
		this.share_membername = share_membername;
	}
	
	/**
	* 店铺名称
	*@return 
	*/
	public String getShare_storename(){
		return  share_storename;
	}
	/**
	* 店铺名称
	*@param  share_storename
	*/
	public void setShare_storename(String share_storename ){
		this.share_storename = share_storename;
	}
	

}
