package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_exppoints_log")
public class RaExppointsLog   {
	
	// alias
	public static final String ALIAS_exp_id = "exp_id";
	public static final String ALIAS_exp_addtime = "exp_addtime";
	public static final String ALIAS_exp_memberid = "exp_memberid";
	public static final String ALIAS_exp_points = "exp_points";
	public static final String ALIAS_exp_desc = "exp_desc";
	public static final String ALIAS_exp_membername = "exp_membername";
	public static final String ALIAS_exp_stage = "exp_stage";
	
	/*
	经验值日志编号
	*/
	private Integer exp_id ;
	/*
	添加时间
	*/
	private Integer exp_addtime ;
	/*
	会员编号
	*/
	private Integer exp_memberid ;
	/*
	经验值负数表示扣除
	*/
	private Integer exp_points ;
	/*
	操作描述
	*/
	private String exp_desc ;
	/*
	会员名称
	*/
	private String exp_membername ;
	/*
	操作阶段
	*/
	private String exp_stage ;
	
	public RaExppointsLog() {
	}
	
	/**
	* 经验值日志编号
	*@return 
	*/
	public Integer getExp_id(){
		return  exp_id;
	}
	/**
	* 经验值日志编号
	*@param  exp_id
	*/
	public void setExp_id(Integer exp_id ){
		this.exp_id = exp_id;
	}
	
	/**
	* 添加时间
	*@return 
	*/
	public Integer getExp_addtime(){
		return  exp_addtime;
	}
	/**
	* 添加时间
	*@param  exp_addtime
	*/
	public void setExp_addtime(Integer exp_addtime ){
		this.exp_addtime = exp_addtime;
	}
	
	/**
	* 会员编号
	*@return 
	*/
	public Integer getExp_memberid(){
		return  exp_memberid;
	}
	/**
	* 会员编号
	*@param  exp_memberid
	*/
	public void setExp_memberid(Integer exp_memberid ){
		this.exp_memberid = exp_memberid;
	}
	
	/**
	* 经验值负数表示扣除
	*@return 
	*/
	public Integer getExp_points(){
		return  exp_points;
	}
	/**
	* 经验值负数表示扣除
	*@param  exp_points
	*/
	public void setExp_points(Integer exp_points ){
		this.exp_points = exp_points;
	}
	
	/**
	* 操作描述
	*@return 
	*/
	public String getExp_desc(){
		return  exp_desc;
	}
	/**
	* 操作描述
	*@param  exp_desc
	*/
	public void setExp_desc(String exp_desc ){
		this.exp_desc = exp_desc;
	}
	
	/**
	* 会员名称
	*@return 
	*/
	public String getExp_membername(){
		return  exp_membername;
	}
	/**
	* 会员名称
	*@param  exp_membername
	*/
	public void setExp_membername(String exp_membername ){
		this.exp_membername = exp_membername;
	}
	
	/**
	* 操作阶段
	*@return 
	*/
	public String getExp_stage(){
		return  exp_stage;
	}
	/**
	* 操作阶段
	*@param  exp_stage
	*/
	public void setExp_stage(String exp_stage ){
		this.exp_stage = exp_stage;
	}
	

}
