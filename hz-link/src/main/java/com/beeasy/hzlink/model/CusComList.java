package com.beeasy.hzlink.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-06-05
*/
@Table(name="cus_com_list")
public class CusComList   {
	
	// alias
	public static final String ALIAS_CUS_ID = "CUS_ID";
	public static final String ALIAS_CUS_NAME = "CUS_NAME";
	
	private String cus_id ;
	private String cus_name ;
	
	public CusComList() {
	}
	
	public String getCus_id(){
		return  cus_id;
	}
	public void setCus_id(String cus_id ){
		this.cus_id = cus_id;
	}
	
	public String getCus_name(){
		return  cus_name;
	}
	public void setCus_name(String cus_name ){
		this.cus_name = cus_name;
	}
	

}
