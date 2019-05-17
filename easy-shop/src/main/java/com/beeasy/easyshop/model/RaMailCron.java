package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_mail_cron")
public class RaMailCron   {
	
	// alias
	public static final String ALIAS_mail_id = "mail_id";
	public static final String ALIAS_contnet = "contnet";
	public static final String ALIAS_mail = "mail";
	public static final String ALIAS_subject = "subject";
	
	/*
	消息任务计划id
	*/
	private Integer mail_id ;
	/*
	邮件内容
	*/
	private String contnet ;
	/*
	邮箱地址
	*/
	private String mail ;
	/*
	邮件标题
	*/
	private String subject ;
	
	public RaMailCron() {
	}
	
	/**
	* 消息任务计划id
	*@return 
	*/
	public Integer getMail_id(){
		return  mail_id;
	}
	/**
	* 消息任务计划id
	*@param  mail_id
	*/
	public void setMail_id(Integer mail_id ){
		this.mail_id = mail_id;
	}
	
	/**
	* 邮件内容
	*@return 
	*/
	public String getContnet(){
		return  contnet;
	}
	/**
	* 邮件内容
	*@param  contnet
	*/
	public void setContnet(String contnet ){
		this.contnet = contnet;
	}
	
	/**
	* 邮箱地址
	*@return 
	*/
	public String getMail(){
		return  mail;
	}
	/**
	* 邮箱地址
	*@param  mail
	*/
	public void setMail(String mail ){
		this.mail = mail;
	}
	
	/**
	* 邮件标题
	*@return 
	*/
	public String getSubject(){
		return  subject;
	}
	/**
	* 邮件标题
	*@param  subject
	*/
	public void setSubject(String subject ){
		this.subject = subject;
	}
	

}
