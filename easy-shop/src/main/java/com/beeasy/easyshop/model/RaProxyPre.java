package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_proxy_pre")
public class RaProxyPre   {
	
	// alias
	public static final String ALIAS_openid = "openid";
	public static final String ALIAS_parent_id = "parent_id";
	
	private String openid ;
	private Integer parent_id ;
	
	public RaProxyPre() {
	}
	
	public String getOpenid(){
		return  openid;
	}
	public void setOpenid(String openid ){
		this.openid = openid;
	}
	
	public Integer getParent_id(){
		return  parent_id;
	}
	public void setParent_id(Integer parent_id ){
		this.parent_id = parent_id;
	}
	

}
