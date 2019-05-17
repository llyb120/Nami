package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_proxy_store")
public class RaProxyStore   {
	
	// alias
	public static final String ALIAS_member_id = "member_id";
	public static final String ALIAS_img1 = "img1";
	public static final String ALIAS_img2 = "img2";
	public static final String ALIAS_img3 = "img3";
	public static final String ALIAS_name = "name";
	
	private Integer member_id ;
	private String img1 ;
	private String img2 ;
	private String img3 ;
	private String name ;
	
	public RaProxyStore() {
	}
	
	public Integer getMember_id(){
		return  member_id;
	}
	public void setMember_id(Integer member_id ){
		this.member_id = member_id;
	}
	
	public String getImg1(){
		return  img1;
	}
	public void setImg1(String img1 ){
		this.img1 = img1;
	}
	
	public String getImg2(){
		return  img2;
	}
	public void setImg2(String img2 ){
		this.img2 = img2;
	}
	
	public String getImg3(){
		return  img3;
	}
	public void setImg3(String img3 ){
		this.img3 = img3;
	}
	
	public String getName(){
		return  name;
	}
	public void setName(String name ){
		this.name = name;
	}
	

}
