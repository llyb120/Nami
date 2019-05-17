package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_sns_setting")
public class RaSnsSetting   {
	
	// alias
	public static final String ALIAS_member_id = "member_id";
	public static final String ALIAS_setting_skin = "setting_skin";
	
	/*
	会员id
	*/
	private Integer member_id ;
	/*
	皮肤
	*/
	private String setting_skin ;
	
	public RaSnsSetting() {
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
	* 皮肤
	*@return 
	*/
	public String getSetting_skin(){
		return  setting_skin;
	}
	/**
	* 皮肤
	*@param  setting_skin
	*/
	public void setSetting_skin(String setting_skin ){
		this.setting_skin = setting_skin;
	}
	

}
