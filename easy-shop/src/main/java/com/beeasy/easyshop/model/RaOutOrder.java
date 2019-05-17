package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_out_order")
public class RaOutOrder   {
	
	private Integer id ;
	private Integer memberId ;
	private String orderInfo ;
	private String orderSn ;
	
	public RaOutOrder() {
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
	
	public String getOrderInfo(){
		return  orderInfo;
	}
	public void setOrderInfo(String orderInfo ){
		this.orderInfo = orderInfo;
	}
	
	public String getOrderSn(){
		return  orderSn;
	}
	public void setOrderSn(String orderSn ){
		this.orderSn = orderSn;
	}
	

}
