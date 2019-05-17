package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_proxy_apply")
public class RaProxyApply   {
	
	// alias
	public static final String ALIAS_id = "id";
	public static final String ALIAS_member_id = "member_id";
	public static final String ALIAS_proxy_member_id = "proxy_member_id";
	public static final String ALIAS_contact = "contact";
	public static final String ALIAS_idcard = "idcard";
	public static final String ALIAS_msg = "msg";
	public static final String ALIAS_name = "name";
	public static final String ALIAS_phone = "phone";
	public static final String ALIAS_status = "status";
	public static final String ALIAS_time = "time";
	
	private Integer id ;
	private Integer member_id ;
	private Integer proxy_member_id ;
	private String contact ;
	private String idcard ;
	private String msg ;
	private String name ;
	private String phone ;
	private String status ;
	private String time ;
	
	public RaProxyApply() {
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
	
	public Integer getProxy_member_id(){
		return  proxy_member_id;
	}
	public void setProxy_member_id(Integer proxy_member_id ){
		this.proxy_member_id = proxy_member_id;
	}
	
	public String getContact(){
		return  contact;
	}
	public void setContact(String contact ){
		this.contact = contact;
	}
	
	public String getIdcard(){
		return  idcard;
	}
	public void setIdcard(String idcard ){
		this.idcard = idcard;
	}
	
	public String getMsg(){
		return  msg;
	}
	public void setMsg(String msg ){
		this.msg = msg;
	}
	
	public String getName(){
		return  name;
	}
	public void setName(String name ){
		this.name = name;
	}
	
	public String getPhone(){
		return  phone;
	}
	public void setPhone(String phone ){
		this.phone = phone;
	}
	
	public String getStatus(){
		return  status;
	}
	public void setStatus(String status ){
		this.status = status;
	}
	
	public String getTime(){
		return  time;
	}
	public void setTime(String time ){
		this.time = time;
	}
	

}
