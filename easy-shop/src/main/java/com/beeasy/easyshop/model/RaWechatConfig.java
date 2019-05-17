package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_wechat_config")
public class RaWechatConfig   {
	
	private Integer memberId ;
	private String config ;
	private String customMenu ;
	private String reply ;
	private String sourceId ;
	
	public RaWechatConfig() {
	}
	
	public Integer getMemberId(){
		return  memberId;
	}
	public void setMemberId(Integer memberId ){
		this.memberId = memberId;
	}
	
	public String getConfig(){
		return  config;
	}
	public void setConfig(String config ){
		this.config = config;
	}
	
	public String getCustomMenu(){
		return  customMenu;
	}
	public void setCustomMenu(String customMenu ){
		this.customMenu = customMenu;
	}
	
	public String getReply(){
		return  reply;
	}
	public void setReply(String reply ){
		this.reply = reply;
	}
	
	public String getSourceId(){
		return  sourceId;
	}
	public void setSourceId(String sourceId ){
		this.sourceId = sourceId;
	}
	

}
