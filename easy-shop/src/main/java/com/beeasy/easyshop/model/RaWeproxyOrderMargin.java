package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_weproxy_order_margin")
public class RaWeproxyOrderMargin   {
	
	private Integer id ;
	private Integer fromMember ;
	private Integer level ;
	private Integer memberId ;
	private Integer orderId ;
	private Integer type ;
	private BigDecimal margin ;
	private String time ;
	
	public RaWeproxyOrderMargin() {
	}
	
	public Integer getId(){
		return  id;
	}
	public void setId(Integer id ){
		this.id = id;
	}
	
	public Integer getFromMember(){
		return  fromMember;
	}
	public void setFromMember(Integer fromMember ){
		this.fromMember = fromMember;
	}
	
	public Integer getLevel(){
		return  level;
	}
	public void setLevel(Integer level ){
		this.level = level;
	}
	
	public Integer getMemberId(){
		return  memberId;
	}
	public void setMemberId(Integer memberId ){
		this.memberId = memberId;
	}
	
	public Integer getOrderId(){
		return  orderId;
	}
	public void setOrderId(Integer orderId ){
		this.orderId = orderId;
	}
	
	public Integer getType(){
		return  type;
	}
	public void setType(Integer type ){
		this.type = type;
	}
	
	public BigDecimal getMargin(){
		return  margin;
	}
	public void setMargin(BigDecimal margin ){
		this.margin = margin;
	}
	
	public String getTime(){
		return  time;
	}
	public void setTime(String time ){
		this.time = time;
	}
	

}
