package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_simport_list")
public class RaSimportList   {
	
	// alias
	public static final String ALIAS_uuid = "uuid";
	public static final String ALIAS_file = "file";
	public static final String ALIAS_time = "time";
	
	private String uuid ;
	private String file ;
	private String time ;
	
	public RaSimportList() {
	}
	
	public String getUuid(){
		return  uuid;
	}
	public void setUuid(String uuid ){
		this.uuid = uuid;
	}
	
	public String getFile(){
		return  file;
	}
	public void setFile(String file ){
		this.file = file;
	}
	
	public String getTime(){
		return  time;
	}
	public void setTime(String time ){
		this.time = time;
	}
	

}
