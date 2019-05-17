package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_exppoints_log")
public class RaExppointsLog   {
	
	/*
	经验值日志编号
	*/
	private Integer expId ;
	/*
	添加时间
	*/
	private Integer expAddtime ;
	/*
	会员编号
	*/
	private Integer expMemberid ;
	/*
	经验值负数表示扣除
	*/
	private Integer expPoints ;
	/*
	操作描述
	*/
	private String expDesc ;
	/*
	会员名称
	*/
	private String expMembername ;
	/*
	操作阶段
	*/
	private String expStage ;
	
	public RaExppointsLog() {
	}
	
	/**
	* 经验值日志编号
	*@return 
	*/
	public Integer getExpId(){
		return  expId;
	}
	/**
	* 经验值日志编号
	*@param  expId
	*/
	public void setExpId(Integer expId ){
		this.expId = expId;
	}
	
	/**
	* 添加时间
	*@return 
	*/
	public Integer getExpAddtime(){
		return  expAddtime;
	}
	/**
	* 添加时间
	*@param  expAddtime
	*/
	public void setExpAddtime(Integer expAddtime ){
		this.expAddtime = expAddtime;
	}
	
	/**
	* 会员编号
	*@return 
	*/
	public Integer getExpMemberid(){
		return  expMemberid;
	}
	/**
	* 会员编号
	*@param  expMemberid
	*/
	public void setExpMemberid(Integer expMemberid ){
		this.expMemberid = expMemberid;
	}
	
	/**
	* 经验值负数表示扣除
	*@return 
	*/
	public Integer getExpPoints(){
		return  expPoints;
	}
	/**
	* 经验值负数表示扣除
	*@param  expPoints
	*/
	public void setExpPoints(Integer expPoints ){
		this.expPoints = expPoints;
	}
	
	/**
	* 操作描述
	*@return 
	*/
	public String getExpDesc(){
		return  expDesc;
	}
	/**
	* 操作描述
	*@param  expDesc
	*/
	public void setExpDesc(String expDesc ){
		this.expDesc = expDesc;
	}
	
	/**
	* 会员名称
	*@return 
	*/
	public String getExpMembername(){
		return  expMembername;
	}
	/**
	* 会员名称
	*@param  expMembername
	*/
	public void setExpMembername(String expMembername ){
		this.expMembername = expMembername;
	}
	
	/**
	* 操作阶段
	*@return 
	*/
	public String getExpStage(){
		return  expStage;
	}
	/**
	* 操作阶段
	*@param  expStage
	*/
	public void setExpStage(String expStage ){
		this.expStage = expStage;
	}
	

}
