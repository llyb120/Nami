package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_circle_thpoll")
public class RaCircleThpoll   {
	
	// alias
	public static final String ALIAS_theme_id = "theme_id";
	public static final String ALIAS_poll_days = "poll_days";
	public static final String ALIAS_poll_multiple = "poll_multiple";
	public static final String ALIAS_poll_voters = "poll_voters";
	public static final String ALIAS_poll_endtime = "poll_endtime";
	public static final String ALIAS_poll_startime = "poll_startime";
	
	/*
	话题id
	*/
	private Integer theme_id ;
	/*
	投票天数
	*/
	private Integer poll_days ;
	/*
	单/多选 0单选、1多选
	*/
	private Integer poll_multiple ;
	/*
	投票参与人数
	*/
	private Integer poll_voters ;
	/*
	结束时间
	*/
	private String poll_endtime ;
	/*
	开始时间
	*/
	private String poll_startime ;
	
	public RaCircleThpoll() {
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
	* 投票天数
	*@return 
	*/
	public Integer getPoll_days(){
		return  poll_days;
	}
	/**
	* 投票天数
	*@param  poll_days
	*/
	public void setPoll_days(Integer poll_days ){
		this.poll_days = poll_days;
	}
	
	/**
	* 单/多选 0单选、1多选
	*@return 
	*/
	public Integer getPoll_multiple(){
		return  poll_multiple;
	}
	/**
	* 单/多选 0单选、1多选
	*@param  poll_multiple
	*/
	public void setPoll_multiple(Integer poll_multiple ){
		this.poll_multiple = poll_multiple;
	}
	
	/**
	* 投票参与人数
	*@return 
	*/
	public Integer getPoll_voters(){
		return  poll_voters;
	}
	/**
	* 投票参与人数
	*@param  poll_voters
	*/
	public void setPoll_voters(Integer poll_voters ){
		this.poll_voters = poll_voters;
	}
	
	/**
	* 结束时间
	*@return 
	*/
	public String getPoll_endtime(){
		return  poll_endtime;
	}
	/**
	* 结束时间
	*@param  poll_endtime
	*/
	public void setPoll_endtime(String poll_endtime ){
		this.poll_endtime = poll_endtime;
	}
	
	/**
	* 开始时间
	*@return 
	*/
	public String getPoll_startime(){
		return  poll_startime;
	}
	/**
	* 开始时间
	*@param  poll_startime
	*/
	public void setPoll_startime(String poll_startime ){
		this.poll_startime = poll_startime;
	}
	

}
