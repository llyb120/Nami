package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_hangzhou_order")
public class RaHangzhouOrder   {
	
	private Integer id ;
	private Integer code ;
	private String companycode ;
	private String status ;
	private String time ;
	private String totalamount ;
	
	public RaHangzhouOrder() {
	}
	
	public Integer getId(){
		return  id;
	}
	public void setId(Integer id ){
		this.id = id;
	}
	
	public Integer getCode(){
		return  code;
	}
	public void setCode(Integer code ){
		this.code = code;
	}
	
	public String getCompanycode(){
		return  companycode;
	}
	public void setCompanycode(String companycode ){
		this.companycode = companycode;
	}
	
	public String getStatus(){
		return  status;
	}
	public void setStatus(String status ){
		this.status = status;
	}
	
	public String getTime(){
		return  time;
	}
	public void setTime(String time ){
		this.time = time;
	}
	
	public String getTotalamount(){
		return  totalamount;
	}
	public void setTotalamount(String totalamount ){
		this.totalamount = totalamount;
	}
	

}
