package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_evaluate_store")
public class RaEvaluateStore   {
	
	// alias
	public static final String ALIAS_seval_id = "seval_id";
	public static final String ALIAS_seval_addtime = "seval_addtime";
	public static final String ALIAS_seval_deliverycredit = "seval_deliverycredit";
	public static final String ALIAS_seval_desccredit = "seval_desccredit";
	public static final String ALIAS_seval_memberid = "seval_memberid";
	public static final String ALIAS_seval_orderid = "seval_orderid";
	public static final String ALIAS_seval_servicecredit = "seval_servicecredit";
	public static final String ALIAS_seval_storeid = "seval_storeid";
	public static final String ALIAS_seval_membername = "seval_membername";
	public static final String ALIAS_seval_orderno = "seval_orderno";
	public static final String ALIAS_seval_storename = "seval_storename";
	
	/*
	评价ID
	*/
	private Integer seval_id ;
	/*
	评价时间
	*/
	private Integer seval_addtime ;
	/*
	发货速度评分
	*/
	private Integer seval_deliverycredit ;
	/*
	描述相符评分
	*/
	private Integer seval_desccredit ;
	/*
	买家编号
	*/
	private Integer seval_memberid ;
	/*
	订单ID
	*/
	private Integer seval_orderid ;
	/*
	服务态度评分
	*/
	private Integer seval_servicecredit ;
	/*
	店铺编号
	*/
	private Integer seval_storeid ;
	/*
	买家名称
	*/
	private String seval_membername ;
	/*
	订单编号
	*/
	private String seval_orderno ;
	/*
	店铺名称
	*/
	private String seval_storename ;
	
	public RaEvaluateStore() {
	}
	
	/**
	* 评价ID
	*@return 
	*/
	public Integer getSeval_id(){
		return  seval_id;
	}
	/**
	* 评价ID
	*@param  seval_id
	*/
	public void setSeval_id(Integer seval_id ){
		this.seval_id = seval_id;
	}
	
	/**
	* 评价时间
	*@return 
	*/
	public Integer getSeval_addtime(){
		return  seval_addtime;
	}
	/**
	* 评价时间
	*@param  seval_addtime
	*/
	public void setSeval_addtime(Integer seval_addtime ){
		this.seval_addtime = seval_addtime;
	}
	
	/**
	* 发货速度评分
	*@return 
	*/
	public Integer getSeval_deliverycredit(){
		return  seval_deliverycredit;
	}
	/**
	* 发货速度评分
	*@param  seval_deliverycredit
	*/
	public void setSeval_deliverycredit(Integer seval_deliverycredit ){
		this.seval_deliverycredit = seval_deliverycredit;
	}
	
	/**
	* 描述相符评分
	*@return 
	*/
	public Integer getSeval_desccredit(){
		return  seval_desccredit;
	}
	/**
	* 描述相符评分
	*@param  seval_desccredit
	*/
	public void setSeval_desccredit(Integer seval_desccredit ){
		this.seval_desccredit = seval_desccredit;
	}
	
	/**
	* 买家编号
	*@return 
	*/
	public Integer getSeval_memberid(){
		return  seval_memberid;
	}
	/**
	* 买家编号
	*@param  seval_memberid
	*/
	public void setSeval_memberid(Integer seval_memberid ){
		this.seval_memberid = seval_memberid;
	}
	
	/**
	* 订单ID
	*@return 
	*/
	public Integer getSeval_orderid(){
		return  seval_orderid;
	}
	/**
	* 订单ID
	*@param  seval_orderid
	*/
	public void setSeval_orderid(Integer seval_orderid ){
		this.seval_orderid = seval_orderid;
	}
	
	/**
	* 服务态度评分
	*@return 
	*/
	public Integer getSeval_servicecredit(){
		return  seval_servicecredit;
	}
	/**
	* 服务态度评分
	*@param  seval_servicecredit
	*/
	public void setSeval_servicecredit(Integer seval_servicecredit ){
		this.seval_servicecredit = seval_servicecredit;
	}
	
	/**
	* 店铺编号
	*@return 
	*/
	public Integer getSeval_storeid(){
		return  seval_storeid;
	}
	/**
	* 店铺编号
	*@param  seval_storeid
	*/
	public void setSeval_storeid(Integer seval_storeid ){
		this.seval_storeid = seval_storeid;
	}
	
	/**
	* 买家名称
	*@return 
	*/
	public String getSeval_membername(){
		return  seval_membername;
	}
	/**
	* 买家名称
	*@param  seval_membername
	*/
	public void setSeval_membername(String seval_membername ){
		this.seval_membername = seval_membername;
	}
	
	/**
	* 订单编号
	*@return 
	*/
	public String getSeval_orderno(){
		return  seval_orderno;
	}
	/**
	* 订单编号
	*@param  seval_orderno
	*/
	public void setSeval_orderno(String seval_orderno ){
		this.seval_orderno = seval_orderno;
	}
	
	/**
	* 店铺名称
	*@return 
	*/
	public String getSeval_storename(){
		return  seval_storename;
	}
	/**
	* 店铺名称
	*@param  seval_storename
	*/
	public void setSeval_storename(String seval_storename ){
		this.seval_storename = seval_storename;
	}
	

}
