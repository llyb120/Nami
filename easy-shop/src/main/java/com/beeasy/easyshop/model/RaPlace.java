package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_place")
public class RaPlace   {
	
	// alias
	public static final String ALIAS_id = "id";
	public static final String ALIAS_ad_word = "ad_word";
	public static final String ALIAS_adv = "adv";
	public static final String ALIAS_name = "name";
	public static final String ALIAS_time = "time";
	
	private Integer id ;
	private String ad_word ;
	private String adv ;
	private String name ;
	private String time ;
	
	public RaPlace() {
	}
	
	public Integer getId(){
		return  id;
	}
	public void setId(Integer id ){
		this.id = id;
	}
	
	public String getAd_word(){
		return  ad_word;
	}
	public void setAd_word(String ad_word ){
		this.ad_word = ad_word;
	}
	
	public String getAdv(){
		return  adv;
	}
	public void setAdv(String adv ){
		this.adv = adv;
	}
	
	public String getName(){
		return  name;
	}
	public void setName(String name ){
		this.name = name;
	}
	
	public String getTime(){
		return  time;
	}
	public void setTime(String time ){
		this.time = time;
	}
	

}
