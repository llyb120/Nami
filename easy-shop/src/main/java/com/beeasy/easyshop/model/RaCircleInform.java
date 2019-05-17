package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_circle_inform")
public class RaCircleInform   {
	
	// alias
	public static final String ALIAS_inform_id = "inform_id";
	public static final String ALIAS_circle_id = "circle_id";
	public static final String ALIAS_inform_opexp = "inform_opexp";
	public static final String ALIAS_inform_opid = "inform_opid";
	public static final String ALIAS_inform_state = "inform_state";
	public static final String ALIAS_inform_type = "inform_type";
	public static final String ALIAS_member_id = "member_id";
	public static final String ALIAS_reply_id = "reply_id";
	public static final String ALIAS_theme_id = "theme_id";
	public static final String ALIAS_circle_name = "circle_name";
	public static final String ALIAS_inform_content = "inform_content";
	public static final String ALIAS_inform_opname = "inform_opname";
	public static final String ALIAS_inform_opresult = "inform_opresult";
	public static final String ALIAS_inform_time = "inform_time";
	public static final String ALIAS_member_name = "member_name";
	public static final String ALIAS_theme_name = "theme_name";
	
	/*
	举报id
	*/
	private Integer inform_id ;
	/*
	圈子id
	*/
	private Integer circle_id ;
	/*
	操作经验
	*/
	private Integer inform_opexp ;
	/*
	操作人id
	*/
	private Integer inform_opid ;
	/*
	状态 0未处理、1已处理
	*/
	private Integer inform_state ;
	/*
	类型 0话题、1回复
	*/
	private Integer inform_type ;
	/*
	会员id
	*/
	private Integer member_id ;
	/*
	回复id
	*/
	private Integer reply_id ;
	/*
	话题id
	*/
	private Integer theme_id ;
	/*
	圈子名称
	*/
	private String circle_name ;
	/*
	举报内容
	*/
	private String inform_content ;
	/*
	操作人名称
	*/
	private String inform_opname ;
	/*
	处理结果
	*/
	private String inform_opresult ;
	/*
	举报时间
	*/
	private String inform_time ;
	/*
	会员名称
	*/
	private String member_name ;
	/*
	主题名称
	*/
	private String theme_name ;
	
	public RaCircleInform() {
	}
	
	/**
	* 举报id
	*@return 
	*/
	public Integer getInform_id(){
		return  inform_id;
	}
	/**
	* 举报id
	*@param  inform_id
	*/
	public void setInform_id(Integer inform_id ){
		this.inform_id = inform_id;
	}
	
	/**
	* 圈子id
	*@return 
	*/
	public Integer getCircle_id(){
		return  circle_id;
	}
	/**
	* 圈子id
	*@param  circle_id
	*/
	public void setCircle_id(Integer circle_id ){
		this.circle_id = circle_id;
	}
	
	/**
	* 操作经验
	*@return 
	*/
	public Integer getInform_opexp(){
		return  inform_opexp;
	}
	/**
	* 操作经验
	*@param  inform_opexp
	*/
	public void setInform_opexp(Integer inform_opexp ){
		this.inform_opexp = inform_opexp;
	}
	
	/**
	* 操作人id
	*@return 
	*/
	public Integer getInform_opid(){
		return  inform_opid;
	}
	/**
	* 操作人id
	*@param  inform_opid
	*/
	public void setInform_opid(Integer inform_opid ){
		this.inform_opid = inform_opid;
	}
	
	/**
	* 状态 0未处理、1已处理
	*@return 
	*/
	public Integer getInform_state(){
		return  inform_state;
	}
	/**
	* 状态 0未处理、1已处理
	*@param  inform_state
	*/
	public void setInform_state(Integer inform_state ){
		this.inform_state = inform_state;
	}
	
	/**
	* 类型 0话题、1回复
	*@return 
	*/
	public Integer getInform_type(){
		return  inform_type;
	}
	/**
	* 类型 0话题、1回复
	*@param  inform_type
	*/
	public void setInform_type(Integer inform_type ){
		this.inform_type = inform_type;
	}
	
	/**
	* 会员id
	*@return 
	*/
	public Integer getMember_id(){
		return  member_id;
	}
	/**
	* 会员id
	*@param  member_id
	*/
	public void setMember_id(Integer member_id ){
		this.member_id = member_id;
	}
	
	/**
	* 回复id
	*@return 
	*/
	public Integer getReply_id(){
		return  reply_id;
	}
	/**
	* 回复id
	*@param  reply_id
	*/
	public void setReply_id(Integer reply_id ){
		this.reply_id = reply_id;
	}
	
	/**
	* 话题id
	*@return 
	*/
	public Integer getTheme_id(){
		return  theme_id;
	}
	/**
	* 话题id
	*@param  theme_id
	*/
	public void setTheme_id(Integer theme_id ){
		this.theme_id = theme_id;
	}
	
	/**
	* 圈子名称
	*@return 
	*/
	public String getCircle_name(){
		return  circle_name;
	}
	/**
	* 圈子名称
	*@param  circle_name
	*/
	public void setCircle_name(String circle_name ){
		this.circle_name = circle_name;
	}
	
	/**
	* 举报内容
	*@return 
	*/
	public String getInform_content(){
		return  inform_content;
	}
	/**
	* 举报内容
	*@param  inform_content
	*/
	public void setInform_content(String inform_content ){
		this.inform_content = inform_content;
	}
	
	/**
	* 操作人名称
	*@return 
	*/
	public String getInform_opname(){
		return  inform_opname;
	}
	/**
	* 操作人名称
	*@param  inform_opname
	*/
	public void setInform_opname(String inform_opname ){
		this.inform_opname = inform_opname;
	}
	
	/**
	* 处理结果
	*@return 
	*/
	public String getInform_opresult(){
		return  inform_opresult;
	}
	/**
	* 处理结果
	*@param  inform_opresult
	*/
	public void setInform_opresult(String inform_opresult ){
		this.inform_opresult = inform_opresult;
	}
	
	/**
	* 举报时间
	*@return 
	*/
	public String getInform_time(){
		return  inform_time;
	}
	/**
	* 举报时间
	*@param  inform_time
	*/
	public void setInform_time(String inform_time ){
		this.inform_time = inform_time;
	}
	
	/**
	* 会员名称
	*@return 
	*/
	public String getMember_name(){
		return  member_name;
	}
	/**
	* 会员名称
	*@param  member_name
	*/
	public void setMember_name(String member_name ){
		this.member_name = member_name;
	}
	
	/**
	* 主题名称
	*@return 
	*/
	public String getTheme_name(){
		return  theme_name;
	}
	/**
	* 主题名称
	*@param  theme_name
	*/
	public void setTheme_name(String theme_name ){
		this.theme_name = theme_name;
	}
	

}
