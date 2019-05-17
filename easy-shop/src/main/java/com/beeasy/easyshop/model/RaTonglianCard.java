package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_tonglian_card")
public class RaTonglianCard   {
	
	// alias
	public static final String ALIAS_id = "id";
	public static final String ALIAS_balance = "balance";
	public static final String ALIAS_idcard = "idcard";
	public static final String ALIAS_name = "name";
	public static final String ALIAS_tonglian_card = "tonglian_card";
	
	private Integer id ;
	private BigDecimal balance ;
	private String idcard ;
	private String name ;
	private String tonglian_card ;
	
	public RaTonglianCard() {
	}
	
	public Integer getId(){
		return  id;
	}
	public void setId(Integer id ){
		this.id = id;
	}
	
	public BigDecimal getBalance(){
		return  balance;
	}
	public void setBalance(BigDecimal balance ){
		this.balance = balance;
	}
	
	public String getIdcard(){
		return  idcard;
	}
	public void setIdcard(String idcard ){
		this.idcard = idcard;
	}
	
	public String getName(){
		return  name;
	}
	public void setName(String name ){
		this.name = name;
	}
	
	public String getTonglian_card(){
		return  tonglian_card;
	}
	public void setTonglian_card(String tonglian_card ){
		this.tonglian_card = tonglian_card;
	}
	

}
