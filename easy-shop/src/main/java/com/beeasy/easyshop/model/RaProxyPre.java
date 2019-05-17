package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_proxy_pre")
public class RaProxyPre   {
	
	private String openid ;
	private Integer parentId ;
	
	public RaProxyPre() {
	}
	
	public String getOpenid(){
		return  openid;
	}
	public void setOpenid(String openid ){
		this.openid = openid;
	}
	
	public Integer getParentId(){
		return  parentId;
	}
	public void setParentId(Integer parentId ){
		this.parentId = parentId;
	}
	

}
