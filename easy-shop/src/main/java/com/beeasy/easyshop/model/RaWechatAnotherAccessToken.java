package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_wechat_another_access_token")
public class RaWechatAnotherAccessToken   {
	
	// alias
	public static final String ALIAS_id = "id";
	public static final String ALIAS_access_token = "access_token";
	public static final String ALIAS_expr_time = "expr_time";
	
	private Integer id ;
	private String access_token ;
	private String expr_time ;
	
	public RaWechatAnotherAccessToken() {
	}
	
	public Integer getId(){
		return  id;
	}
	public void setId(Integer id ){
		this.id = id;
	}
	
	public String getAccess_token(){
		return  access_token;
	}
	public void setAccess_token(String access_token ){
		this.access_token = access_token;
	}
	
	public String getExpr_time(){
		return  expr_time;
	}
	public void setExpr_time(String expr_time ){
		this.expr_time = expr_time;
	}
	

}
