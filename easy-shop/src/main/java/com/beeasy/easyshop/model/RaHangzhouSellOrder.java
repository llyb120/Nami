package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_hangzhou_sell_order")
public class RaHangzhouSellOrder   {
	
	private Integer id ;
	private String ordercode ;
	private String orderSn ;
	private String status ;
	
	public RaHangzhouSellOrder() {
	}
	
	public Integer getId(){
		return  id;
	}
	public void setId(Integer id ){
		this.id = id;
	}
	
	public String getOrdercode(){
		return  ordercode;
	}
	public void setOrdercode(String ordercode ){
		this.ordercode = ordercode;
	}
	
	public String getOrderSn(){
		return  orderSn;
	}
	public void setOrderSn(String orderSn ){
		this.orderSn = orderSn;
	}
	
	public String getStatus(){
		return  status;
	}
	public void setStatus(String status ){
		this.status = status;
	}
	

}
