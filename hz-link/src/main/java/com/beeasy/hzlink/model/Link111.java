package com.beeasy.hzlink.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;

import org.beetl.sql.core.annotatoin.AssignID;

/*
* 
* gen by beetlsql 2019-06-10
*/
@Table(name="LINK_11_1")
public class Link111   {

    @AssignID()
	private String id ;
	private Integer is_company ;
	private String link_left ;
	private String link_right ;
	private String link_rule ;
	private String link_type ;
	private String origin_name ;

	public Link111() {
	}

	public String getId(){
		return  id;
	}
	public void setId(String id ){
		this.id = id;
	}

	public Integer getIs_company(){
		return  is_company;
	}
	public void setIs_company(Integer is_company ){
		this.is_company = is_company;
	}

	public String getLink_left(){
		return  link_left;
	}
	public void setLink_left(String link_left ){
		this.link_left = link_left;
	}

	public String getLink_right(){
		return  link_right;
	}
	public void setLink_right(String link_right ){
		this.link_right = link_right;
	}

	public String getLink_rule(){
		return  link_rule;
	}
	public void setLink_rule(String link_rule ){
		this.link_rule = link_rule;
	}

	public String getLink_type(){
		return  link_type;
	}
	public void setLink_type(String link_type ){
		this.link_type = link_type;
	}

	public String getOrigin_name(){
		return  origin_name;
	}
	public void setOrigin_name(String origin_name ){
		this.origin_name = origin_name;
	}


}
