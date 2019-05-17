package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_evaluate_store")
public class RaEvaluateStore   {
	
	/*
	评价ID
	*/
	private Integer sevalId ;
	/*
	评价时间
	*/
	private Integer sevalAddtime ;
	/*
	发货速度评分
	*/
	private Integer sevalDeliverycredit ;
	/*
	描述相符评分
	*/
	private Integer sevalDesccredit ;
	/*
	买家编号
	*/
	private Integer sevalMemberid ;
	/*
	订单ID
	*/
	private Integer sevalOrderid ;
	/*
	服务态度评分
	*/
	private Integer sevalServicecredit ;
	/*
	店铺编号
	*/
	private Integer sevalStoreid ;
	/*
	买家名称
	*/
	private String sevalMembername ;
	/*
	订单编号
	*/
	private String sevalOrderno ;
	/*
	店铺名称
	*/
	private String sevalStorename ;
	
	public RaEvaluateStore() {
	}
	
	/**
	* 评价ID
	*@return 
	*/
	public Integer getSevalId(){
		return  sevalId;
	}
	/**
	* 评价ID
	*@param  sevalId
	*/
	public void setSevalId(Integer sevalId ){
		this.sevalId = sevalId;
	}
	
	/**
	* 评价时间
	*@return 
	*/
	public Integer getSevalAddtime(){
		return  sevalAddtime;
	}
	/**
	* 评价时间
	*@param  sevalAddtime
	*/
	public void setSevalAddtime(Integer sevalAddtime ){
		this.sevalAddtime = sevalAddtime;
	}
	
	/**
	* 发货速度评分
	*@return 
	*/
	public Integer getSevalDeliverycredit(){
		return  sevalDeliverycredit;
	}
	/**
	* 发货速度评分
	*@param  sevalDeliverycredit
	*/
	public void setSevalDeliverycredit(Integer sevalDeliverycredit ){
		this.sevalDeliverycredit = sevalDeliverycredit;
	}
	
	/**
	* 描述相符评分
	*@return 
	*/
	public Integer getSevalDesccredit(){
		return  sevalDesccredit;
	}
	/**
	* 描述相符评分
	*@param  sevalDesccredit
	*/
	public void setSevalDesccredit(Integer sevalDesccredit ){
		this.sevalDesccredit = sevalDesccredit;
	}
	
	/**
	* 买家编号
	*@return 
	*/
	public Integer getSevalMemberid(){
		return  sevalMemberid;
	}
	/**
	* 买家编号
	*@param  sevalMemberid
	*/
	public void setSevalMemberid(Integer sevalMemberid ){
		this.sevalMemberid = sevalMemberid;
	}
	
	/**
	* 订单ID
	*@return 
	*/
	public Integer getSevalOrderid(){
		return  sevalOrderid;
	}
	/**
	* 订单ID
	*@param  sevalOrderid
	*/
	public void setSevalOrderid(Integer sevalOrderid ){
		this.sevalOrderid = sevalOrderid;
	}
	
	/**
	* 服务态度评分
	*@return 
	*/
	public Integer getSevalServicecredit(){
		return  sevalServicecredit;
	}
	/**
	* 服务态度评分
	*@param  sevalServicecredit
	*/
	public void setSevalServicecredit(Integer sevalServicecredit ){
		this.sevalServicecredit = sevalServicecredit;
	}
	
	/**
	* 店铺编号
	*@return 
	*/
	public Integer getSevalStoreid(){
		return  sevalStoreid;
	}
	/**
	* 店铺编号
	*@param  sevalStoreid
	*/
	public void setSevalStoreid(Integer sevalStoreid ){
		this.sevalStoreid = sevalStoreid;
	}
	
	/**
	* 买家名称
	*@return 
	*/
	public String getSevalMembername(){
		return  sevalMembername;
	}
	/**
	* 买家名称
	*@param  sevalMembername
	*/
	public void setSevalMembername(String sevalMembername ){
		this.sevalMembername = sevalMembername;
	}
	
	/**
	* 订单编号
	*@return 
	*/
	public String getSevalOrderno(){
		return  sevalOrderno;
	}
	/**
	* 订单编号
	*@param  sevalOrderno
	*/
	public void setSevalOrderno(String sevalOrderno ){
		this.sevalOrderno = sevalOrderno;
	}
	
	/**
	* 店铺名称
	*@return 
	*/
	public String getSevalStorename(){
		return  sevalStorename;
	}
	/**
	* 店铺名称
	*@param  sevalStorename
	*/
	public void setSevalStorename(String sevalStorename ){
		this.sevalStorename = sevalStorename;
	}
	

}
