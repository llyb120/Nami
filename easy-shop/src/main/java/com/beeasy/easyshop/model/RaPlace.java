package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_place")
public class RaPlace   {
	
	private Integer id ;
	private String adWord ;
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
	
	public String getAdWord(){
		return  adWord;
	}
	public void setAdWord(String adWord ){
		this.adWord = adWord;
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
