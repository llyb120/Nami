package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_proxy_apply")
public class RaProxyApply   {
	
	private Integer id ;
	private Integer memberId ;
	private Integer proxyMemberId ;
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
	
	public Integer getMemberId(){
		return  memberId;
	}
	public void setMemberId(Integer memberId ){
		this.memberId = memberId;
	}
	
	public Integer getProxyMemberId(){
		return  proxyMemberId;
	}
	public void setProxyMemberId(Integer proxyMemberId ){
		this.proxyMemberId = proxyMemberId;
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
