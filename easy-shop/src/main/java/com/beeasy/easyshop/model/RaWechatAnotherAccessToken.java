package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_wechat_another_access_token")
public class RaWechatAnotherAccessToken   {
	
	private Integer id ;
	private String accessToken ;
	private String exprTime ;
	
	public RaWechatAnotherAccessToken() {
	}
	
	public Integer getId(){
		return  id;
	}
	public void setId(Integer id ){
		this.id = id;
	}
	
	public String getAccessToken(){
		return  accessToken;
	}
	public void setAccessToken(String accessToken ){
		this.accessToken = accessToken;
	}
	
	public String getExprTime(){
		return  exprTime;
	}
	public void setExprTime(String exprTime ){
		this.exprTime = exprTime;
	}
	

}
