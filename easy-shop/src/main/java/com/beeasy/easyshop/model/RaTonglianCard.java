package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_tonglian_card")
public class RaTonglianCard   {
	
	private Integer id ;
	private BigDecimal balance ;
	private String idcard ;
	private String name ;
	private String tonglianCard ;
	
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
	
	public String getTonglianCard(){
		return  tonglianCard;
	}
	public void setTonglianCard(String tonglianCard ){
		this.tonglianCard = tonglianCard;
	}
	

}
