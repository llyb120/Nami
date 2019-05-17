package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_stat_member")
public class RaStatMember   {
	
	// alias
	public static final String ALIAS_statm_id = "statm_id";
	public static final String ALIAS_statm_goodsnum = "statm_goodsnum";
	public static final String ALIAS_statm_memberid = "statm_memberid";
	public static final String ALIAS_statm_ordernum = "statm_ordernum";
	public static final String ALIAS_statm_pointsincrease = "statm_pointsincrease";
	public static final String ALIAS_statm_pointsreduce = "statm_pointsreduce";
	public static final String ALIAS_statm_time = "statm_time";
	public static final String ALIAS_statm_updatetime = "statm_updatetime";
	public static final String ALIAS_statm_membername = "statm_membername";
	public static final String ALIAS_statm_orderamount = "statm_orderamount";
	public static final String ALIAS_statm_predincrease = "statm_predincrease";
	public static final String ALIAS_statm_predreduce = "statm_predreduce";
	
	/*
	自增ID
	*/
	private Integer statm_id ;
	/*
	下单商品件数
	*/
	private Integer statm_goodsnum ;
	/*
	会员ID
	*/
	private Integer statm_memberid ;
	/*
	下单量
	*/
	private Integer statm_ordernum ;
	/*
	积分增加额
	*/
	private Integer statm_pointsincrease ;
	/*
	积分减少额
	*/
	private Integer statm_pointsreduce ;
	/*
	统计时间，当前按照最小时间单位为天
	*/
	private Integer statm_time ;
	/*
	记录更新时间
	*/
	private Integer statm_updatetime ;
	/*
	会员名称
	*/
	private String statm_membername ;
	/*
	下单金额
	*/
	private BigDecimal statm_orderamount ;
	/*
	预存款增加额
	*/
	private BigDecimal statm_predincrease ;
	/*
	预存款减少额
	*/
	private BigDecimal statm_predreduce ;
	
	public RaStatMember() {
	}
	
	/**
	* 自增ID
	*@return 
	*/
	public Integer getStatm_id(){
		return  statm_id;
	}
	/**
	* 自增ID
	*@param  statm_id
	*/
	public void setStatm_id(Integer statm_id ){
		this.statm_id = statm_id;
	}
	
	/**
	* 下单商品件数
	*@return 
	*/
	public Integer getStatm_goodsnum(){
		return  statm_goodsnum;
	}
	/**
	* 下单商品件数
	*@param  statm_goodsnum
	*/
	public void setStatm_goodsnum(Integer statm_goodsnum ){
		this.statm_goodsnum = statm_goodsnum;
	}
	
	/**
	* 会员ID
	*@return 
	*/
	public Integer getStatm_memberid(){
		return  statm_memberid;
	}
	/**
	* 会员ID
	*@param  statm_memberid
	*/
	public void setStatm_memberid(Integer statm_memberid ){
		this.statm_memberid = statm_memberid;
	}
	
	/**
	* 下单量
	*@return 
	*/
	public Integer getStatm_ordernum(){
		return  statm_ordernum;
	}
	/**
	* 下单量
	*@param  statm_ordernum
	*/
	public void setStatm_ordernum(Integer statm_ordernum ){
		this.statm_ordernum = statm_ordernum;
	}
	
	/**
	* 积分增加额
	*@return 
	*/
	public Integer getStatm_pointsincrease(){
		return  statm_pointsincrease;
	}
	/**
	* 积分增加额
	*@param  statm_pointsincrease
	*/
	public void setStatm_pointsincrease(Integer statm_pointsincrease ){
		this.statm_pointsincrease = statm_pointsincrease;
	}
	
	/**
	* 积分减少额
	*@return 
	*/
	public Integer getStatm_pointsreduce(){
		return  statm_pointsreduce;
	}
	/**
	* 积分减少额
	*@param  statm_pointsreduce
	*/
	public void setStatm_pointsreduce(Integer statm_pointsreduce ){
		this.statm_pointsreduce = statm_pointsreduce;
	}
	
	/**
	* 统计时间，当前按照最小时间单位为天
	*@return 
	*/
	public Integer getStatm_time(){
		return  statm_time;
	}
	/**
	* 统计时间，当前按照最小时间单位为天
	*@param  statm_time
	*/
	public void setStatm_time(Integer statm_time ){
		this.statm_time = statm_time;
	}
	
	/**
	* 记录更新时间
	*@return 
	*/
	public Integer getStatm_updatetime(){
		return  statm_updatetime;
	}
	/**
	* 记录更新时间
	*@param  statm_updatetime
	*/
	public void setStatm_updatetime(Integer statm_updatetime ){
		this.statm_updatetime = statm_updatetime;
	}
	
	/**
	* 会员名称
	*@return 
	*/
	public String getStatm_membername(){
		return  statm_membername;
	}
	/**
	* 会员名称
	*@param  statm_membername
	*/
	public void setStatm_membername(String statm_membername ){
		this.statm_membername = statm_membername;
	}
	
	/**
	* 下单金额
	*@return 
	*/
	public BigDecimal getStatm_orderamount(){
		return  statm_orderamount;
	}
	/**
	* 下单金额
	*@param  statm_orderamount
	*/
	public void setStatm_orderamount(BigDecimal statm_orderamount ){
		this.statm_orderamount = statm_orderamount;
	}
	
	/**
	* 预存款增加额
	*@return 
	*/
	public BigDecimal getStatm_predincrease(){
		return  statm_predincrease;
	}
	/**
	* 预存款增加额
	*@param  statm_predincrease
	*/
	public void setStatm_predincrease(BigDecimal statm_predincrease ){
		this.statm_predincrease = statm_predincrease;
	}
	
	/**
	* 预存款减少额
	*@return 
	*/
	public BigDecimal getStatm_predreduce(){
		return  statm_predreduce;
	}
	/**
	* 预存款减少额
	*@param  statm_predreduce
	*/
	public void setStatm_predreduce(BigDecimal statm_predreduce ){
		this.statm_predreduce = statm_predreduce;
	}
	

}
