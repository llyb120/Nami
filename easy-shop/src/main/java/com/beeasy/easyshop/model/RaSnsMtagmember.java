package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_sns_mtagmember")
public class RaSnsMtagmember   {
	
	// alias
	public static final String ALIAS_member_id = "member_id";
	public static final String ALIAS_mtag_id = "mtag_id";
	public static final String ALIAS_recommend = "recommend";
	
	/*
	会员id
	*/
	private Integer member_id ;
	/*
	会员标签表id
	*/
	private Integer mtag_id ;
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
	* 会员标签表id
	*@return 
	*/
	public Integer getMtag_id(){
		return  mtag_id;
	}
	/**
	* 会员标签表id
	*@param  mtag_id
	*/
	public void setMtag_id(Integer mtag_id ){
		this.mtag_id = mtag_id;
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
