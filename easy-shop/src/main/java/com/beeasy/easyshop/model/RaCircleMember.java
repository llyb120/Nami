package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_circle_member")
public class RaCircleMember   {
	
	// alias
	public static final String ALIAS_circle_id = "circle_id";
	public static final String ALIAS_member_id = "member_id";
	public static final String ALIAS_cm_comcount = "cm_comcount";
	public static final String ALIAS_cm_exp = "cm_exp";
	public static final String ALIAS_cm_level = "cm_level";
	public static final String ALIAS_cm_nextexp = "cm_nextexp";
	public static final String ALIAS_cm_state = "cm_state";
	public static final String ALIAS_cm_thcount = "cm_thcount";
	public static final String ALIAS_is_allowspeak = "is_allowspeak";
	public static final String ALIAS_is_identity = "is_identity";
	public static final String ALIAS_is_recommend = "is_recommend";
	public static final String ALIAS_is_star = "is_star";
	public static final String ALIAS_circle_name = "circle_name";
	public static final String ALIAS_cm_applycontent = "cm_applycontent";
	public static final String ALIAS_cm_applytime = "cm_applytime";
	public static final String ALIAS_cm_intro = "cm_intro";
	public static final String ALIAS_cm_jointime = "cm_jointime";
	public static final String ALIAS_cm_lastspeaktime = "cm_lastspeaktime";
	public static final String ALIAS_cm_levelname = "cm_levelname";
	public static final String ALIAS_member_name = "member_name";
	
	/*
	圈子id
	*/
	private Integer circle_id ;
	/*
	会员id
	*/
	private Integer member_id ;
	/*
	回复数
	*/
	private Integer cm_comcount ;
	/*
	会员经验
	*/
	private Integer cm_exp ;
	/*
	成员级别
	*/
	private Integer cm_level ;
	/*
	下一级所需经验
	*/
	private Integer cm_nextexp ;
	/*
	状态 0申请中 1通过 2未通过
	*/
	private Integer cm_state ;
	/*
	主题数
	*/
	private Integer cm_thcount ;
	/*
	是否允许发言 1允许 0禁止
	*/
	private Integer is_allowspeak ;
	/*
	1圈主 2管理 3成员
	*/
	private Integer is_identity ;
	/*
	是否推荐 1是 0否
	*/
	private Integer is_recommend ;
	/*
	明星成员 1是 0否
	*/
	private Integer is_star ;
	/*
	圈子名称
	*/
	private String circle_name ;
	/*
	申请内容
	*/
	private String cm_applycontent ;
	/*
	申请时间
	*/
	private String cm_applytime ;
	/*
	自我介绍
	*/
	private String cm_intro ;
	/*
	加入时间
	*/
	private String cm_jointime ;
	/*
	最后发言时间
	*/
	private String cm_lastspeaktime ;
	/*
	成员头衔
	*/
	private String cm_levelname ;
	/*
	会员名称
	*/
	private String member_name ;
	
	public RaCircleMember() {
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
	* 回复数
	*@return 
	*/
	public Integer getCm_comcount(){
		return  cm_comcount;
	}
	/**
	* 回复数
	*@param  cm_comcount
	*/
	public void setCm_comcount(Integer cm_comcount ){
		this.cm_comcount = cm_comcount;
	}
	
	/**
	* 会员经验
	*@return 
	*/
	public Integer getCm_exp(){
		return  cm_exp;
	}
	/**
	* 会员经验
	*@param  cm_exp
	*/
	public void setCm_exp(Integer cm_exp ){
		this.cm_exp = cm_exp;
	}
	
	/**
	* 成员级别
	*@return 
	*/
	public Integer getCm_level(){
		return  cm_level;
	}
	/**
	* 成员级别
	*@param  cm_level
	*/
	public void setCm_level(Integer cm_level ){
		this.cm_level = cm_level;
	}
	
	/**
	* 下一级所需经验
	*@return 
	*/
	public Integer getCm_nextexp(){
		return  cm_nextexp;
	}
	/**
	* 下一级所需经验
	*@param  cm_nextexp
	*/
	public void setCm_nextexp(Integer cm_nextexp ){
		this.cm_nextexp = cm_nextexp;
	}
	
	/**
	* 状态 0申请中 1通过 2未通过
	*@return 
	*/
	public Integer getCm_state(){
		return  cm_state;
	}
	/**
	* 状态 0申请中 1通过 2未通过
	*@param  cm_state
	*/
	public void setCm_state(Integer cm_state ){
		this.cm_state = cm_state;
	}
	
	/**
	* 主题数
	*@return 
	*/
	public Integer getCm_thcount(){
		return  cm_thcount;
	}
	/**
	* 主题数
	*@param  cm_thcount
	*/
	public void setCm_thcount(Integer cm_thcount ){
		this.cm_thcount = cm_thcount;
	}
	
	/**
	* 是否允许发言 1允许 0禁止
	*@return 
	*/
	public Integer getIs_allowspeak(){
		return  is_allowspeak;
	}
	/**
	* 是否允许发言 1允许 0禁止
	*@param  is_allowspeak
	*/
	public void setIs_allowspeak(Integer is_allowspeak ){
		this.is_allowspeak = is_allowspeak;
	}
	
	/**
	* 1圈主 2管理 3成员
	*@return 
	*/
	public Integer getIs_identity(){
		return  is_identity;
	}
	/**
	* 1圈主 2管理 3成员
	*@param  is_identity
	*/
	public void setIs_identity(Integer is_identity ){
		this.is_identity = is_identity;
	}
	
	/**
	* 是否推荐 1是 0否
	*@return 
	*/
	public Integer getIs_recommend(){
		return  is_recommend;
	}
	/**
	* 是否推荐 1是 0否
	*@param  is_recommend
	*/
	public void setIs_recommend(Integer is_recommend ){
		this.is_recommend = is_recommend;
	}
	
	/**
	* 明星成员 1是 0否
	*@return 
	*/
	public Integer getIs_star(){
		return  is_star;
	}
	/**
	* 明星成员 1是 0否
	*@param  is_star
	*/
	public void setIs_star(Integer is_star ){
		this.is_star = is_star;
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
	* 申请内容
	*@return 
	*/
	public String getCm_applycontent(){
		return  cm_applycontent;
	}
	/**
	* 申请内容
	*@param  cm_applycontent
	*/
	public void setCm_applycontent(String cm_applycontent ){
		this.cm_applycontent = cm_applycontent;
	}
	
	/**
	* 申请时间
	*@return 
	*/
	public String getCm_applytime(){
		return  cm_applytime;
	}
	/**
	* 申请时间
	*@param  cm_applytime
	*/
	public void setCm_applytime(String cm_applytime ){
		this.cm_applytime = cm_applytime;
	}
	
	/**
	* 自我介绍
	*@return 
	*/
	public String getCm_intro(){
		return  cm_intro;
	}
	/**
	* 自我介绍
	*@param  cm_intro
	*/
	public void setCm_intro(String cm_intro ){
		this.cm_intro = cm_intro;
	}
	
	/**
	* 加入时间
	*@return 
	*/
	public String getCm_jointime(){
		return  cm_jointime;
	}
	/**
	* 加入时间
	*@param  cm_jointime
	*/
	public void setCm_jointime(String cm_jointime ){
		this.cm_jointime = cm_jointime;
	}
	
	/**
	* 最后发言时间
	*@return 
	*/
	public String getCm_lastspeaktime(){
		return  cm_lastspeaktime;
	}
	/**
	* 最后发言时间
	*@param  cm_lastspeaktime
	*/
	public void setCm_lastspeaktime(String cm_lastspeaktime ){
		this.cm_lastspeaktime = cm_lastspeaktime;
	}
	
	/**
	* 成员头衔
	*@return 
	*/
	public String getCm_levelname(){
		return  cm_levelname;
	}
	/**
	* 成员头衔
	*@param  cm_levelname
	*/
	public void setCm_levelname(String cm_levelname ){
		this.cm_levelname = cm_levelname;
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
	

}
