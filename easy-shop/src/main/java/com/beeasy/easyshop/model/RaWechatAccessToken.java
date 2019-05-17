package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_wechat_access_token")
public class RaWechatAccessToken   {
	
	private Integer id ;
	private Integer memberId ;
	private String accessToken ;
	private String expiresTime ;
	
	public RaWechatAccessToken() {
	}
	
	public Integer getId(){
		return  id;
	}
	public void setId(Integer id ){
		this.id = id;
	}
	
	public Integer getMemberId(){
		return  memberId;
	}
	public void setMemberId(Integer memberId ){
		this.memberId = memberId;
	}
	
	public String getAccessToken(){
		return  accessToken;
	}
	public void setAccessToken(String accessToken ){
		this.accessToken = accessToken;
	}
	
	public String getExpiresTime(){
		return  expiresTime;
	}
	public void setExpiresTime(String expiresTime ){
		this.expiresTime = expiresTime;
	}
	

}
