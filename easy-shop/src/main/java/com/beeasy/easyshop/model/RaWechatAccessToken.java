package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_wechat_access_token")
public class RaWechatAccessToken   {
	
	// alias
	public static final String ALIAS_id = "id";
	public static final String ALIAS_member_id = "member_id";
	public static final String ALIAS_access_token = "access_token";
	public static final String ALIAS_expires_time = "expires_time";
	
	private Integer id ;
	private Integer member_id ;
	private String access_token ;
	private String expires_time ;
	
	public RaWechatAccessToken() {
	}
	
	public Integer getId(){
		return  id;
	}
	public void setId(Integer id ){
		this.id = id;
	}
	
	public Integer getMember_id(){
		return  member_id;
	}
	public void setMember_id(Integer member_id ){
		this.member_id = member_id;
	}
	
	public String getAccess_token(){
		return  access_token;
	}
	public void setAccess_token(String access_token ){
		this.access_token = access_token;
	}
	
	public String getExpires_time(){
		return  expires_time;
	}
	public void setExpires_time(String expires_time ){
		this.expires_time = expires_time;
	}
	

}
