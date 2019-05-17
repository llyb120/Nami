package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_weproxy_order_margin")
public class RaWeproxyOrderMargin   {
	
	// alias
	public static final String ALIAS_id = "id";
	public static final String ALIAS_from_member = "from_member";
	public static final String ALIAS_level = "level";
	public static final String ALIAS_member_id = "member_id";
	public static final String ALIAS_order_id = "order_id";
	public static final String ALIAS_type = "type";
	public static final String ALIAS_margin = "margin";
	public static final String ALIAS_time = "time";
	
	private Integer id ;
	private Integer from_member ;
	private Integer level ;
	private Integer member_id ;
	private Integer order_id ;
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
	
	public Integer getFrom_member(){
		return  from_member;
	}
	public void setFrom_member(Integer from_member ){
		this.from_member = from_member;
	}
	
	public Integer getLevel(){
		return  level;
	}
	public void setLevel(Integer level ){
		this.level = level;
	}
	
	public Integer getMember_id(){
		return  member_id;
	}
	public void setMember_id(Integer member_id ){
		this.member_id = member_id;
	}
	
	public Integer getOrder_id(){
		return  order_id;
	}
	public void setOrder_id(Integer order_id ){
		this.order_id = order_id;
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
