package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_tgb_ads")
public class RaTgbAds   {
	
	private Integer id ;
	private Integer memberId ;
	private Integer recommand ;
	private Integer time ;
	private String content ;
	private String name ;
	
	public RaTgbAds() {
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
	
	public Integer getRecommand(){
		return  recommand;
	}
	public void setRecommand(Integer recommand ){
		this.recommand = recommand;
	}
	
	public Integer getTime(){
		return  time;
	}
	public void setTime(Integer time ){
		this.time = time;
	}
	
	public String getContent(){
		return  content;
	}
	public void setContent(String content ){
		this.content = content;
	}
	
	public String getName(){
		return  name;
	}
	public void setName(String name ){
		this.name = name;
	}
	

}
