package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_circle_thpoll")
public class RaCircleThpoll   {
	
	/*
	话题id
	*/
	private Integer themeId ;
	/*
	投票天数
	*/
	private Integer pollDays ;
	/*
	单/多选 0单选、1多选
	*/
	private Integer pollMultiple ;
	/*
	投票参与人数
	*/
	private Integer pollVoters ;
	/*
	结束时间
	*/
	private String pollEndtime ;
	/*
	开始时间
	*/
	private String pollStartime ;
	
	public RaCircleThpoll() {
	}
	
	/**
	* 话题id
	*@return 
	*/
	public Integer getThemeId(){
		return  themeId;
	}
	/**
	* 话题id
	*@param  themeId
	*/
	public void setThemeId(Integer themeId ){
		this.themeId = themeId;
	}
	
	/**
	* 投票天数
	*@return 
	*/
	public Integer getPollDays(){
		return  pollDays;
	}
	/**
	* 投票天数
	*@param  pollDays
	*/
	public void setPollDays(Integer pollDays ){
		this.pollDays = pollDays;
	}
	
	/**
	* 单/多选 0单选、1多选
	*@return 
	*/
	public Integer getPollMultiple(){
		return  pollMultiple;
	}
	/**
	* 单/多选 0单选、1多选
	*@param  pollMultiple
	*/
	public void setPollMultiple(Integer pollMultiple ){
		this.pollMultiple = pollMultiple;
	}
	
	/**
	* 投票参与人数
	*@return 
	*/
	public Integer getPollVoters(){
		return  pollVoters;
	}
	/**
	* 投票参与人数
	*@param  pollVoters
	*/
	public void setPollVoters(Integer pollVoters ){
		this.pollVoters = pollVoters;
	}
	
	/**
	* 结束时间
	*@return 
	*/
	public String getPollEndtime(){
		return  pollEndtime;
	}
	/**
	* 结束时间
	*@param  pollEndtime
	*/
	public void setPollEndtime(String pollEndtime ){
		this.pollEndtime = pollEndtime;
	}
	
	/**
	* 开始时间
	*@return 
	*/
	public String getPollStartime(){
		return  pollStartime;
	}
	/**
	* 开始时间
	*@param  pollStartime
	*/
	public void setPollStartime(String pollStartime ){
		this.pollStartime = pollStartime;
	}
	

}
