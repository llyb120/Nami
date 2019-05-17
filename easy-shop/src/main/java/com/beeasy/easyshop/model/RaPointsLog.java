package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_points_log")
public class RaPointsLog   {
	
	/*
	积分日志编号
	*/
	private Integer plId ;
	/*
	添加时间
	*/
	private Integer plAddtime ;
	/*
	管理员编号
	*/
	private Integer plAdminid ;
	/*
	会员编号
	*/
	private Integer plMemberid ;
	/*
	积分数负数表示扣除
	*/
	private Integer plPoints ;
	/*
	管理员名称
	*/
	private String plAdminname ;
	/*
	操作描述
	*/
	private String plDesc ;
	/*
	会员名称
	*/
	private String plMembername ;
	/*
	操作阶段
	*/
	private String plStage ;
	
	public RaPointsLog() {
	}
	
	/**
	* 积分日志编号
	*@return 
	*/
	public Integer getPlId(){
		return  plId;
	}
	/**
	* 积分日志编号
	*@param  plId
	*/
	public void setPlId(Integer plId ){
		this.plId = plId;
	}
	
	/**
	* 添加时间
	*@return 
	*/
	public Integer getPlAddtime(){
		return  plAddtime;
	}
	/**
	* 添加时间
	*@param  plAddtime
	*/
	public void setPlAddtime(Integer plAddtime ){
		this.plAddtime = plAddtime;
	}
	
	/**
	* 管理员编号
	*@return 
	*/
	public Integer getPlAdminid(){
		return  plAdminid;
	}
	/**
	* 管理员编号
	*@param  plAdminid
	*/
	public void setPlAdminid(Integer plAdminid ){
		this.plAdminid = plAdminid;
	}
	
	/**
	* 会员编号
	*@return 
	*/
	public Integer getPlMemberid(){
		return  plMemberid;
	}
	/**
	* 会员编号
	*@param  plMemberid
	*/
	public void setPlMemberid(Integer plMemberid ){
		this.plMemberid = plMemberid;
	}
	
	/**
	* 积分数负数表示扣除
	*@return 
	*/
	public Integer getPlPoints(){
		return  plPoints;
	}
	/**
	* 积分数负数表示扣除
	*@param  plPoints
	*/
	public void setPlPoints(Integer plPoints ){
		this.plPoints = plPoints;
	}
	
	/**
	* 管理员名称
	*@return 
	*/
	public String getPlAdminname(){
		return  plAdminname;
	}
	/**
	* 管理员名称
	*@param  plAdminname
	*/
	public void setPlAdminname(String plAdminname ){
		this.plAdminname = plAdminname;
	}
	
	/**
	* 操作描述
	*@return 
	*/
	public String getPlDesc(){
		return  plDesc;
	}
	/**
	* 操作描述
	*@param  plDesc
	*/
	public void setPlDesc(String plDesc ){
		this.plDesc = plDesc;
	}
	
	/**
	* 会员名称
	*@return 
	*/
	public String getPlMembername(){
		return  plMembername;
	}
	/**
	* 会员名称
	*@param  plMembername
	*/
	public void setPlMembername(String plMembername ){
		this.plMembername = plMembername;
	}
	
	/**
	* 操作阶段
	*@return 
	*/
	public String getPlStage(){
		return  plStage;
	}
	/**
	* 操作阶段
	*@param  plStage
	*/
	public void setPlStage(String plStage ){
		this.plStage = plStage;
	}
	

}
