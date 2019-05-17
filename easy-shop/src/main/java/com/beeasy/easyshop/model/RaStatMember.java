package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_stat_member")
public class RaStatMember   {
	
	/*
	自增ID
	*/
	private Integer statmId ;
	/*
	下单商品件数
	*/
	private Integer statmGoodsnum ;
	/*
	会员ID
	*/
	private Integer statmMemberid ;
	/*
	下单量
	*/
	private Integer statmOrdernum ;
	/*
	积分增加额
	*/
	private Integer statmPointsincrease ;
	/*
	积分减少额
	*/
	private Integer statmPointsreduce ;
	/*
	统计时间，当前按照最小时间单位为天
	*/
	private Integer statmTime ;
	/*
	记录更新时间
	*/
	private Integer statmUpdatetime ;
	/*
	会员名称
	*/
	private String statmMembername ;
	/*
	下单金额
	*/
	private BigDecimal statmOrderamount ;
	/*
	预存款增加额
	*/
	private BigDecimal statmPredincrease ;
	/*
	预存款减少额
	*/
	private BigDecimal statmPredreduce ;
	
	public RaStatMember() {
	}
	
	/**
	* 自增ID
	*@return 
	*/
	public Integer getStatmId(){
		return  statmId;
	}
	/**
	* 自增ID
	*@param  statmId
	*/
	public void setStatmId(Integer statmId ){
		this.statmId = statmId;
	}
	
	/**
	* 下单商品件数
	*@return 
	*/
	public Integer getStatmGoodsnum(){
		return  statmGoodsnum;
	}
	/**
	* 下单商品件数
	*@param  statmGoodsnum
	*/
	public void setStatmGoodsnum(Integer statmGoodsnum ){
		this.statmGoodsnum = statmGoodsnum;
	}
	
	/**
	* 会员ID
	*@return 
	*/
	public Integer getStatmMemberid(){
		return  statmMemberid;
	}
	/**
	* 会员ID
	*@param  statmMemberid
	*/
	public void setStatmMemberid(Integer statmMemberid ){
		this.statmMemberid = statmMemberid;
	}
	
	/**
	* 下单量
	*@return 
	*/
	public Integer getStatmOrdernum(){
		return  statmOrdernum;
	}
	/**
	* 下单量
	*@param  statmOrdernum
	*/
	public void setStatmOrdernum(Integer statmOrdernum ){
		this.statmOrdernum = statmOrdernum;
	}
	
	/**
	* 积分增加额
	*@return 
	*/
	public Integer getStatmPointsincrease(){
		return  statmPointsincrease;
	}
	/**
	* 积分增加额
	*@param  statmPointsincrease
	*/
	public void setStatmPointsincrease(Integer statmPointsincrease ){
		this.statmPointsincrease = statmPointsincrease;
	}
	
	/**
	* 积分减少额
	*@return 
	*/
	public Integer getStatmPointsreduce(){
		return  statmPointsreduce;
	}
	/**
	* 积分减少额
	*@param  statmPointsreduce
	*/
	public void setStatmPointsreduce(Integer statmPointsreduce ){
		this.statmPointsreduce = statmPointsreduce;
	}
	
	/**
	* 统计时间，当前按照最小时间单位为天
	*@return 
	*/
	public Integer getStatmTime(){
		return  statmTime;
	}
	/**
	* 统计时间，当前按照最小时间单位为天
	*@param  statmTime
	*/
	public void setStatmTime(Integer statmTime ){
		this.statmTime = statmTime;
	}
	
	/**
	* 记录更新时间
	*@return 
	*/
	public Integer getStatmUpdatetime(){
		return  statmUpdatetime;
	}
	/**
	* 记录更新时间
	*@param  statmUpdatetime
	*/
	public void setStatmUpdatetime(Integer statmUpdatetime ){
		this.statmUpdatetime = statmUpdatetime;
	}
	
	/**
	* 会员名称
	*@return 
	*/
	public String getStatmMembername(){
		return  statmMembername;
	}
	/**
	* 会员名称
	*@param  statmMembername
	*/
	public void setStatmMembername(String statmMembername ){
		this.statmMembername = statmMembername;
	}
	
	/**
	* 下单金额
	*@return 
	*/
	public BigDecimal getStatmOrderamount(){
		return  statmOrderamount;
	}
	/**
	* 下单金额
	*@param  statmOrderamount
	*/
	public void setStatmOrderamount(BigDecimal statmOrderamount ){
		this.statmOrderamount = statmOrderamount;
	}
	
	/**
	* 预存款增加额
	*@return 
	*/
	public BigDecimal getStatmPredincrease(){
		return  statmPredincrease;
	}
	/**
	* 预存款增加额
	*@param  statmPredincrease
	*/
	public void setStatmPredincrease(BigDecimal statmPredincrease ){
		this.statmPredincrease = statmPredincrease;
	}
	
	/**
	* 预存款减少额
	*@return 
	*/
	public BigDecimal getStatmPredreduce(){
		return  statmPredreduce;
	}
	/**
	* 预存款减少额
	*@param  statmPredreduce
	*/
	public void setStatmPredreduce(BigDecimal statmPredreduce ){
		this.statmPredreduce = statmPredreduce;
	}
	

}
