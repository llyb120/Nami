package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_proxy_task")
public class RaProxyTask   {
	
	// alias
	public static final String ALIAS_id = "id";
	public static final String ALIAS_member_id = "member_id";
	public static final String ALIAS_end_time = "end_time";
	public static final String ALIAS_money = "money";
	public static final String ALIAS_start_time = "start_time";
	
	private Integer id ;
	private Integer member_id ;
	private String end_time ;
	private BigDecimal money ;
	private String start_time ;
	
	public RaProxyTask() {
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
	
	public String getEnd_time(){
		return  end_time;
	}
	public void setEnd_time(String end_time ){
		this.end_time = end_time;
	}
	
	public BigDecimal getMoney(){
		return  money;
	}
	public void setMoney(BigDecimal money ){
		this.money = money;
	}
	
	public String getStart_time(){
		return  start_time;
	}
	public void setStart_time(String start_time ){
		this.start_time = start_time;
	}
	

}
