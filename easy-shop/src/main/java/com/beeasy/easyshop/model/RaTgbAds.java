package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_tgb_ads")
public class RaTgbAds   {
	
	// alias
	public static final String ALIAS_id = "id";
	public static final String ALIAS_member_id = "member_id";
	public static final String ALIAS_recommand = "recommand";
	public static final String ALIAS_time = "time";
	public static final String ALIAS_content = "content";
	public static final String ALIAS_name = "name";
	
	private Integer id ;
	private Integer member_id ;
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
	
	public Integer getMember_id(){
		return  member_id;
	}
	public void setMember_id(Integer member_id ){
		this.member_id = member_id;
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
