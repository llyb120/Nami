package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_sns_tracelog")
public class RaSnsTracelog   {
	
	// alias
	public static final String ALIAS_trace_id = "trace_id";
	public static final String ALIAS_trace_addtime = "trace_addtime";
	public static final String ALIAS_trace_commentcount = "trace_commentcount";
	public static final String ALIAS_trace_copycount = "trace_copycount";
	public static final String ALIAS_trace_from = "trace_from";
	public static final String ALIAS_trace_memberid = "trace_memberid";
	public static final String ALIAS_trace_orgcommentcount = "trace_orgcommentcount";
	public static final String ALIAS_trace_orgcopycount = "trace_orgcopycount";
	public static final String ALIAS_trace_originalid = "trace_originalid";
	public static final String ALIAS_trace_originalmemberid = "trace_originalmemberid";
	public static final String ALIAS_trace_originalstate = "trace_originalstate";
	public static final String ALIAS_trace_privacy = "trace_privacy";
	public static final String ALIAS_trace_state = "trace_state";
	public static final String ALIAS_trace_content = "trace_content";
	public static final String ALIAS_trace_memberavatar = "trace_memberavatar";
	public static final String ALIAS_trace_membername = "trace_membername";
	public static final String ALIAS_trace_title = "trace_title";
	
	/*
	自增ID
	*/
	private Integer trace_id ;
	/*
	添加时间
	*/
	private Integer trace_addtime ;
	/*
	评论数
	*/
	private Integer trace_commentcount ;
	/*
	转发数
	*/
	private Integer trace_copycount ;
	/*
	来源 1=shop 2=storetracelog 3=microshop 4=cms 5=circle
	*/
	private Integer trace_from ;
	/*
	会员ID
	*/
	private Integer trace_memberid ;
	/*
	原帖评论次数
	*/
	private Integer trace_orgcommentcount ;
	/*
	原帖转帖次数
	*/
	private Integer trace_orgcopycount ;
	/*
	原动态ID 默认为0
	*/
	private Integer trace_originalid ;
	/*
	原帖会员编号
	*/
	private Integer trace_originalmemberid ;
	/*
	原帖的删除状态 0为正常 1为删除
	*/
	private Integer trace_originalstate ;
	/*
	隐私可见度 0所有人可见 1好友可见 2仅自己可见
	*/
	private Integer trace_privacy ;
	/*
	状态  0正常 1为禁止显示 默认为0
	*/
	private Integer trace_state ;
	/*
	动态内容
	*/
	private String trace_content ;
	/*
	会员头像
	*/
	private String trace_memberavatar ;
	/*
	会员名称
	*/
	private String trace_membername ;
	/*
	动态标题
	*/
	private String trace_title ;
	
	public RaSnsTracelog() {
	}
	
	/**
	* 自增ID
	*@return 
	*/
	public Integer getTrace_id(){
		return  trace_id;
	}
	/**
	* 自增ID
	*@param  trace_id
	*/
	public void setTrace_id(Integer trace_id ){
		this.trace_id = trace_id;
	}
	
	/**
	* 添加时间
	*@return 
	*/
	public Integer getTrace_addtime(){
		return  trace_addtime;
	}
	/**
	* 添加时间
	*@param  trace_addtime
	*/
	public void setTrace_addtime(Integer trace_addtime ){
		this.trace_addtime = trace_addtime;
	}
	
	/**
	* 评论数
	*@return 
	*/
	public Integer getTrace_commentcount(){
		return  trace_commentcount;
	}
	/**
	* 评论数
	*@param  trace_commentcount
	*/
	public void setTrace_commentcount(Integer trace_commentcount ){
		this.trace_commentcount = trace_commentcount;
	}
	
	/**
	* 转发数
	*@return 
	*/
	public Integer getTrace_copycount(){
		return  trace_copycount;
	}
	/**
	* 转发数
	*@param  trace_copycount
	*/
	public void setTrace_copycount(Integer trace_copycount ){
		this.trace_copycount = trace_copycount;
	}
	
	/**
	* 来源 1=shop 2=storetracelog 3=microshop 4=cms 5=circle
	*@return 
	*/
	public Integer getTrace_from(){
		return  trace_from;
	}
	/**
	* 来源 1=shop 2=storetracelog 3=microshop 4=cms 5=circle
	*@param  trace_from
	*/
	public void setTrace_from(Integer trace_from ){
		this.trace_from = trace_from;
	}
	
	/**
	* 会员ID
	*@return 
	*/
	public Integer getTrace_memberid(){
		return  trace_memberid;
	}
	/**
	* 会员ID
	*@param  trace_memberid
	*/
	public void setTrace_memberid(Integer trace_memberid ){
		this.trace_memberid = trace_memberid;
	}
	
	/**
	* 原帖评论次数
	*@return 
	*/
	public Integer getTrace_orgcommentcount(){
		return  trace_orgcommentcount;
	}
	/**
	* 原帖评论次数
	*@param  trace_orgcommentcount
	*/
	public void setTrace_orgcommentcount(Integer trace_orgcommentcount ){
		this.trace_orgcommentcount = trace_orgcommentcount;
	}
	
	/**
	* 原帖转帖次数
	*@return 
	*/
	public Integer getTrace_orgcopycount(){
		return  trace_orgcopycount;
	}
	/**
	* 原帖转帖次数
	*@param  trace_orgcopycount
	*/
	public void setTrace_orgcopycount(Integer trace_orgcopycount ){
		this.trace_orgcopycount = trace_orgcopycount;
	}
	
	/**
	* 原动态ID 默认为0
	*@return 
	*/
	public Integer getTrace_originalid(){
		return  trace_originalid;
	}
	/**
	* 原动态ID 默认为0
	*@param  trace_originalid
	*/
	public void setTrace_originalid(Integer trace_originalid ){
		this.trace_originalid = trace_originalid;
	}
	
	/**
	* 原帖会员编号
	*@return 
	*/
	public Integer getTrace_originalmemberid(){
		return  trace_originalmemberid;
	}
	/**
	* 原帖会员编号
	*@param  trace_originalmemberid
	*/
	public void setTrace_originalmemberid(Integer trace_originalmemberid ){
		this.trace_originalmemberid = trace_originalmemberid;
	}
	
	/**
	* 原帖的删除状态 0为正常 1为删除
	*@return 
	*/
	public Integer getTrace_originalstate(){
		return  trace_originalstate;
	}
	/**
	* 原帖的删除状态 0为正常 1为删除
	*@param  trace_originalstate
	*/
	public void setTrace_originalstate(Integer trace_originalstate ){
		this.trace_originalstate = trace_originalstate;
	}
	
	/**
	* 隐私可见度 0所有人可见 1好友可见 2仅自己可见
	*@return 
	*/
	public Integer getTrace_privacy(){
		return  trace_privacy;
	}
	/**
	* 隐私可见度 0所有人可见 1好友可见 2仅自己可见
	*@param  trace_privacy
	*/
	public void setTrace_privacy(Integer trace_privacy ){
		this.trace_privacy = trace_privacy;
	}
	
	/**
	* 状态  0正常 1为禁止显示 默认为0
	*@return 
	*/
	public Integer getTrace_state(){
		return  trace_state;
	}
	/**
	* 状态  0正常 1为禁止显示 默认为0
	*@param  trace_state
	*/
	public void setTrace_state(Integer trace_state ){
		this.trace_state = trace_state;
	}
	
	/**
	* 动态内容
	*@return 
	*/
	public String getTrace_content(){
		return  trace_content;
	}
	/**
	* 动态内容
	*@param  trace_content
	*/
	public void setTrace_content(String trace_content ){
		this.trace_content = trace_content;
	}
	
	/**
	* 会员头像
	*@return 
	*/
	public String getTrace_memberavatar(){
		return  trace_memberavatar;
	}
	/**
	* 会员头像
	*@param  trace_memberavatar
	*/
	public void setTrace_memberavatar(String trace_memberavatar ){
		this.trace_memberavatar = trace_memberavatar;
	}
	
	/**
	* 会员名称
	*@return 
	*/
	public String getTrace_membername(){
		return  trace_membername;
	}
	/**
	* 会员名称
	*@param  trace_membername
	*/
	public void setTrace_membername(String trace_membername ){
		this.trace_membername = trace_membername;
	}
	
	/**
	* 动态标题
	*@return 
	*/
	public String getTrace_title(){
		return  trace_title;
	}
	/**
	* 动态标题
	*@param  trace_title
	*/
	public void setTrace_title(String trace_title ){
		this.trace_title = trace_title;
	}
	

}
