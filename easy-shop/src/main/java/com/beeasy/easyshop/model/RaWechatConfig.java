package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_wechat_config")
public class RaWechatConfig   {
	
	// alias
	public static final String ALIAS_member_id = "member_id";
	public static final String ALIAS_config = "config";
	public static final String ALIAS_custom_menu = "custom_menu";
	public static final String ALIAS_reply = "reply";
	public static final String ALIAS_source_id = "source_id";
	
	private Integer member_id ;
	private String config ;
	private String custom_menu ;
	private String reply ;
	private String source_id ;
	
	public RaWechatConfig() {
	}
	
	public Integer getMember_id(){
		return  member_id;
	}
	public void setMember_id(Integer member_id ){
		this.member_id = member_id;
	}
	
	public String getConfig(){
		return  config;
	}
	public void setConfig(String config ){
		this.config = config;
	}
	
	public String getCustom_menu(){
		return  custom_menu;
	}
	public void setCustom_menu(String custom_menu ){
		this.custom_menu = custom_menu;
	}
	
	public String getReply(){
		return  reply;
	}
	public void setReply(String reply ){
		this.reply = reply;
	}
	
	public String getSource_id(){
		return  source_id;
	}
	public void setSource_id(String source_id ){
		this.source_id = source_id;
	}
	

}
