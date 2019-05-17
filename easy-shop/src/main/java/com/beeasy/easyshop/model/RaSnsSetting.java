package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_sns_setting")
public class RaSnsSetting   {
	
	/*
	会员id
	*/
	private Integer memberId ;
	/*
	皮肤
	*/
	private String settingSkin ;
	
	public RaSnsSetting() {
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
	* 皮肤
	*@return 
	*/
	public String getSettingSkin(){
		return  settingSkin;
	}
	/**
	* 皮肤
	*@param  settingSkin
	*/
	public void setSettingSkin(String settingSkin ){
		this.settingSkin = settingSkin;
	}
	

}
