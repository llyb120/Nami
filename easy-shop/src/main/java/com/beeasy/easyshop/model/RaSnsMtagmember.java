package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_sns_mtagmember")
public class RaSnsMtagmember   {
	
	/*
	会员id
	*/
	private Integer memberId ;
	/*
	会员标签表id
	*/
	private Integer mtagId ;
	/*
	推荐，默认为0
	*/
	private Integer recommend ;
	
	public RaSnsMtagmember() {
	}
	
	/**
	* 会员id
	*@return 
	*/
	public Integer getMemberId(){
		return  memberId;
	}
	/**
	* 会员id
	*@param  memberId
	*/
	public void setMemberId(Integer memberId ){
		this.memberId = memberId;
	}
	
	/**
	* 会员标签表id
	*@return 
	*/
	public Integer getMtagId(){
		return  mtagId;
	}
	/**
	* 会员标签表id
	*@param  mtagId
	*/
	public void setMtagId(Integer mtagId ){
		this.mtagId = mtagId;
	}
	
	/**
	* 推荐，默认为0
	*@return 
	*/
	public Integer getRecommend(){
		return  recommend;
	}
	/**
	* 推荐，默认为0
	*@param  recommend
	*/
	public void setRecommend(Integer recommend ){
		this.recommend = recommend;
	}
	

}
