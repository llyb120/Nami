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
@Table(name="T_SYSTEM_NOTICE")
public class TSystemNotice   {

    @AssignID()
	private Long id ;
	private String bind_data ;
	private String content ;
	private Long from_uid ;
	private String state ;
	private String type ;
	private Long user_id ;
	private Date add_time ;

	public TSystemNotice() {
	}

	public Long getId(){
		return  id;
	}
	public void setId(Long id ){
		this.id = id;
	}

	public String getBind_data(){
		return  bind_data;
	}
	public void setBind_data(String bind_data ){
		this.bind_data = bind_data;
	}

	public String getContent(){
		return  content;
	}
	public void setContent(String content ){
		this.content = content;
	}

	public Long getFrom_uid(){
		return  from_uid;
	}
	public void setFrom_uid(Long from_uid ){
		this.from_uid = from_uid;
	}

	public String getState(){
		return  state;
	}
	public void setState(String state ){
		this.state = state;
	}

	public String getType(){
		return  type;
	}
	public void setType(String type ){
		this.type = type;
	}

	public Long getUser_id(){
		return  user_id;
	}
	public void setUser_id(Long user_id ){
		this.user_id = user_id;
	}

	public Date getAdd_time(){
		return  add_time;
	}
	public void setAdd_time(Date add_time ){
		this.add_time = add_time;
	}


}
