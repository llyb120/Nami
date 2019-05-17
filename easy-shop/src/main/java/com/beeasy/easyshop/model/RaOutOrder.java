package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_out_order")
public class RaOutOrder   {
	
	// alias
	public static final String ALIAS_id = "id";
	public static final String ALIAS_member_id = "member_id";
	public static final String ALIAS_order_info = "order_info";
	public static final String ALIAS_order_sn = "order_sn";
	
	private Integer id ;
	private Integer member_id ;
	private String order_info ;
	private String order_sn ;
	
	public RaOutOrder() {
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
	
	public String getOrder_info(){
		return  order_info;
	}
	public void setOrder_info(String order_info ){
		this.order_info = order_info;
	}
	
	public String getOrder_sn(){
		return  order_sn;
	}
	public void setOrder_sn(String order_sn ){
		this.order_sn = order_sn;
	}
	

}
