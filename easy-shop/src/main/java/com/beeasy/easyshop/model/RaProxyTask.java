package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_proxy_task")
public class RaProxyTask   {
	
	private Integer id ;
	private Integer memberId ;
	private String endTime ;
	private BigDecimal money ;
	private String startTime ;
	
	public RaProxyTask() {
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
	
	public String getEndTime(){
		return  endTime;
	}
	public void setEndTime(String endTime ){
		this.endTime = endTime;
	}
	
	public BigDecimal getMoney(){
		return  money;
	}
	public void setMoney(BigDecimal money ){
		this.money = money;
	}
	
	public String getStartTime(){
		return  startTime;
	}
	public void setStartTime(String startTime ){
		this.startTime = startTime;
	}
	

}
