package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_lock")
public class RaLock   {
	
	// alias
	public static final String ALIAS_pid = "pid";
	public static final String ALIAS_expiretime = "expiretime";
	public static final String ALIAS_pvalue = "pvalue";
	
	/*
	IP+TYPE
	*/
	private Long pid ;
	/*
	锁定截止时间
	*/
	private Integer expiretime ;
	/*
	次数
	*/
	private Integer pvalue ;
	
	public RaLock() {
	}
	
	/**
	* IP+TYPE
	*@return 
	*/
	public Long getPid(){
		return  pid;
	}
	/**
	* IP+TYPE
	*@param  pid
	*/
	public void setPid(Long pid ){
		this.pid = pid;
	}
	
	/**
	* 锁定截止时间
	*@return 
	*/
	public Integer getExpiretime(){
		return  expiretime;
	}
	/**
	* 锁定截止时间
	*@param  expiretime
	*/
	public void setExpiretime(Integer expiretime ){
		this.expiretime = expiretime;
	}
	
	/**
	* 次数
	*@return 
	*/
	public Integer getPvalue(){
		return  pvalue;
	}
	/**
	* 次数
	*@param  pvalue
	*/
	public void setPvalue(Integer pvalue ){
		this.pvalue = pvalue;
	}
	

}
