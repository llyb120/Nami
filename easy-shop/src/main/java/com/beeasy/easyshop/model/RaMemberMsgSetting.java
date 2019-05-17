package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_member_msg_setting")
public class RaMemberMsgSetting   {
	
	// alias
	public static final String ALIAS_member_id = "member_id";
	public static final String ALIAS_mmt_code = "mmt_code";
	public static final String ALIAS_is_receive = "is_receive";
	
	/*
	会员id
	*/
	private Integer member_id ;
	/*
	用户消息模板编号
	*/
	private String mmt_code ;
	/*
	是否接收 1是，0否
	*/
	private Integer is_receive ;
	
	public RaMemberMsgSetting() {
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
	* 用户消息模板编号
	*@return 
	*/
	public String getMmt_code(){
		return  mmt_code;
	}
	/**
	* 用户消息模板编号
	*@param  mmt_code
	*/
	public void setMmt_code(String mmt_code ){
		this.mmt_code = mmt_code;
	}
	
	/**
	* 是否接收 1是，0否
	*@return 
	*/
	public Integer getIs_receive(){
		return  is_receive;
	}
	/**
	* 是否接收 1是，0否
	*@param  is_receive
	*/
	public void setIs_receive(Integer is_receive ){
		this.is_receive = is_receive;
	}
	

}
