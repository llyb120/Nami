package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_hangzhou_sell_order")
public class RaHangzhouSellOrder   {
	
	// alias
	public static final String ALIAS_id = "id";
	public static final String ALIAS_orderCode = "orderCode";
	public static final String ALIAS_order_sn = "order_sn";
	public static final String ALIAS_status = "status";
	
	private Integer id ;
	private String ordercode ;
	private String order_sn ;
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
	
	public String getOrder_sn(){
		return  order_sn;
	}
	public void setOrder_sn(String order_sn ){
		this.order_sn = order_sn;
	}
	
	public String getStatus(){
		return  status;
	}
	public void setStatus(String status ){
		this.status = status;
	}
	

}
