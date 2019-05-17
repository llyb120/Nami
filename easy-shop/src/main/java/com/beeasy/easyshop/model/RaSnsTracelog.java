package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_sns_tracelog")
public class RaSnsTracelog   {
	
	/*
	自增ID
	*/
	private Integer traceId ;
	/*
	添加时间
	*/
	private Integer traceAddtime ;
	/*
	评论数
	*/
	private Integer traceCommentcount ;
	/*
	转发数
	*/
	private Integer traceCopycount ;
	/*
	来源 1=shop 2=storetracelog 3=microshop 4=cms 5=circle
	*/
	private Integer traceFrom ;
	/*
	会员ID
	*/
	private Integer traceMemberid ;
	/*
	原帖评论次数
	*/
	private Integer traceOrgcommentcount ;
	/*
	原帖转帖次数
	*/
	private Integer traceOrgcopycount ;
	/*
	原动态ID 默认为0
	*/
	private Integer traceOriginalid ;
	/*
	原帖会员编号
	*/
	private Integer traceOriginalmemberid ;
	/*
	原帖的删除状态 0为正常 1为删除
	*/
	private Integer traceOriginalstate ;
	/*
	隐私可见度 0所有人可见 1好友可见 2仅自己可见
	*/
	private Integer tracePrivacy ;
	/*
	状态  0正常 1为禁止显示 默认为0
	*/
	private Integer traceState ;
	/*
	动态内容
	*/
	private String traceContent ;
	/*
	会员头像
	*/
	private String traceMemberavatar ;
	/*
	会员名称
	*/
	private String traceMembername ;
	/*
	动态标题
	*/
	private String traceTitle ;
	
	public RaSnsTracelog() {
	}
	
	/**
	* 自增ID
	*@return 
	*/
	public Integer getTraceId(){
		return  traceId;
	}
	/**
	* 自增ID
	*@param  traceId
	*/
	public void setTraceId(Integer traceId ){
		this.traceId = traceId;
	}
	
	/**
	* 添加时间
	*@return 
	*/
	public Integer getTraceAddtime(){
		return  traceAddtime;
	}
	/**
	* 添加时间
	*@param  traceAddtime
	*/
	public void setTraceAddtime(Integer traceAddtime ){
		this.traceAddtime = traceAddtime;
	}
	
	/**
	* 评论数
	*@return 
	*/
	public Integer getTraceCommentcount(){
		return  traceCommentcount;
	}
	/**
	* 评论数
	*@param  traceCommentcount
	*/
	public void setTraceCommentcount(Integer traceCommentcount ){
		this.traceCommentcount = traceCommentcount;
	}
	
	/**
	* 转发数
	*@return 
	*/
	public Integer getTraceCopycount(){
		return  traceCopycount;
	}
	/**
	* 转发数
	*@param  traceCopycount
	*/
	public void setTraceCopycount(Integer traceCopycount ){
		this.traceCopycount = traceCopycount;
	}
	
	/**
	* 来源 1=shop 2=storetracelog 3=microshop 4=cms 5=circle
	*@return 
	*/
	public Integer getTraceFrom(){
		return  traceFrom;
	}
	/**
	* 来源 1=shop 2=storetracelog 3=microshop 4=cms 5=circle
	*@param  traceFrom
	*/
	public void setTraceFrom(Integer traceFrom ){
		this.traceFrom = traceFrom;
	}
	
	/**
	* 会员ID
	*@return 
	*/
	public Integer getTraceMemberid(){
		return  traceMemberid;
	}
	/**
	* 会员ID
	*@param  traceMemberid
	*/
	public void setTraceMemberid(Integer traceMemberid ){
		this.traceMemberid = traceMemberid;
	}
	
	/**
	* 原帖评论次数
	*@return 
	*/
	public Integer getTraceOrgcommentcount(){
		return  traceOrgcommentcount;
	}
	/**
	* 原帖评论次数
	*@param  traceOrgcommentcount
	*/
	public void setTraceOrgcommentcount(Integer traceOrgcommentcount ){
		this.traceOrgcommentcount = traceOrgcommentcount;
	}
	
	/**
	* 原帖转帖次数
	*@return 
	*/
	public Integer getTraceOrgcopycount(){
		return  traceOrgcopycount;
	}
	/**
	* 原帖转帖次数
	*@param  traceOrgcopycount
	*/
	public void setTraceOrgcopycount(Integer traceOrgcopycount ){
		this.traceOrgcopycount = traceOrgcopycount;
	}
	
	/**
	* 原动态ID 默认为0
	*@return 
	*/
	public Integer getTraceOriginalid(){
		return  traceOriginalid;
	}
	/**
	* 原动态ID 默认为0
	*@param  traceOriginalid
	*/
	public void setTraceOriginalid(Integer traceOriginalid ){
		this.traceOriginalid = traceOriginalid;
	}
	
	/**
	* 原帖会员编号
	*@return 
	*/
	public Integer getTraceOriginalmemberid(){
		return  traceOriginalmemberid;
	}
	/**
	* 原帖会员编号
	*@param  traceOriginalmemberid
	*/
	public void setTraceOriginalmemberid(Integer traceOriginalmemberid ){
		this.traceOriginalmemberid = traceOriginalmemberid;
	}
	
	/**
	* 原帖的删除状态 0为正常 1为删除
	*@return 
	*/
	public Integer getTraceOriginalstate(){
		return  traceOriginalstate;
	}
	/**
	* 原帖的删除状态 0为正常 1为删除
	*@param  traceOriginalstate
	*/
	public void setTraceOriginalstate(Integer traceOriginalstate ){
		this.traceOriginalstate = traceOriginalstate;
	}
	
	/**
	* 隐私可见度 0所有人可见 1好友可见 2仅自己可见
	*@return 
	*/
	public Integer getTracePrivacy(){
		return  tracePrivacy;
	}
	/**
	* 隐私可见度 0所有人可见 1好友可见 2仅自己可见
	*@param  tracePrivacy
	*/
	public void setTracePrivacy(Integer tracePrivacy ){
		this.tracePrivacy = tracePrivacy;
	}
	
	/**
	* 状态  0正常 1为禁止显示 默认为0
	*@return 
	*/
	public Integer getTraceState(){
		return  traceState;
	}
	/**
	* 状态  0正常 1为禁止显示 默认为0
	*@param  traceState
	*/
	public void setTraceState(Integer traceState ){
		this.traceState = traceState;
	}
	
	/**
	* 动态内容
	*@return 
	*/
	public String getTraceContent(){
		return  traceContent;
	}
	/**
	* 动态内容
	*@param  traceContent
	*/
	public void setTraceContent(String traceContent ){
		this.traceContent = traceContent;
	}
	
	/**
	* 会员头像
	*@return 
	*/
	public String getTraceMemberavatar(){
		return  traceMemberavatar;
	}
	/**
	* 会员头像
	*@param  traceMemberavatar
	*/
	public void setTraceMemberavatar(String traceMemberavatar ){
		this.traceMemberavatar = traceMemberavatar;
	}
	
	/**
	* 会员名称
	*@return 
	*/
	public String getTraceMembername(){
		return  traceMembername;
	}
	/**
	* 会员名称
	*@param  traceMembername
	*/
	public void setTraceMembername(String traceMembername ){
		this.traceMembername = traceMembername;
	}
	
	/**
	* 动态标题
	*@return 
	*/
	public String getTraceTitle(){
		return  traceTitle;
	}
	/**
	* 动态标题
	*@param  traceTitle
	*/
	public void setTraceTitle(String traceTitle ){
		this.traceTitle = traceTitle;
	}
	

}
