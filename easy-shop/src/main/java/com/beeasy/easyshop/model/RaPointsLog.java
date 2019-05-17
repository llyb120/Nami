package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_points_log")
public class RaPointsLog   {
	
	// alias
	public static final String ALIAS_pl_id = "pl_id";
	public static final String ALIAS_pl_addtime = "pl_addtime";
	public static final String ALIAS_pl_adminid = "pl_adminid";
	public static final String ALIAS_pl_memberid = "pl_memberid";
	public static final String ALIAS_pl_points = "pl_points";
	public static final String ALIAS_pl_adminname = "pl_adminname";
	public static final String ALIAS_pl_desc = "pl_desc";
	public static final String ALIAS_pl_membername = "pl_membername";
	public static final String ALIAS_pl_stage = "pl_stage";
	
	/*
	积分日志编号
	*/
	private Integer pl_id ;
	/*
	添加时间
	*/
	private Integer pl_addtime ;
	/*
	管理员编号
	*/
	private Integer pl_adminid ;
	/*
	会员编号
	*/
	private Integer pl_memberid ;
	/*
	积分数负数表示扣除
	*/
	private Integer pl_points ;
	/*
	管理员名称
	*/
	private String pl_adminname ;
	/*
	操作描述
	*/
	private String pl_desc ;
	/*
	会员名称
	*/
	private String pl_membername ;
	/*
	操作阶段
	*/
	private String pl_stage ;
	
	public RaPointsLog() {
	}
	
	/**
	* 积分日志编号
	*@return 
	*/
	public Integer getPl_id(){
		return  pl_id;
	}
	/**
	* 积分日志编号
	*@param  pl_id
	*/
	public void setPl_id(Integer pl_id ){
		this.pl_id = pl_id;
	}
	
	/**
	* 添加时间
	*@return 
	*/
	public Integer getPl_addtime(){
		return  pl_addtime;
	}
	/**
	* 添加时间
	*@param  pl_addtime
	*/
	public void setPl_addtime(Integer pl_addtime ){
		this.pl_addtime = pl_addtime;
	}
	
	/**
	* 管理员编号
	*@return 
	*/
	public Integer getPl_adminid(){
		return  pl_adminid;
	}
	/**
	* 管理员编号
	*@param  pl_adminid
	*/
	public void setPl_adminid(Integer pl_adminid ){
		this.pl_adminid = pl_adminid;
	}
	
	/**
	* 会员编号
	*@return 
	*/
	public Integer getPl_memberid(){
		return  pl_memberid;
	}
	/**
	* 会员编号
	*@param  pl_memberid
	*/
	public void setPl_memberid(Integer pl_memberid ){
		this.pl_memberid = pl_memberid;
	}
	
	/**
	* 积分数负数表示扣除
	*@return 
	*/
	public Integer getPl_points(){
		return  pl_points;
	}
	/**
	* 积分数负数表示扣除
	*@param  pl_points
	*/
	public void setPl_points(Integer pl_points ){
		this.pl_points = pl_points;
	}
	
	/**
	* 管理员名称
	*@return 
	*/
	public String getPl_adminname(){
		return  pl_adminname;
	}
	/**
	* 管理员名称
	*@param  pl_adminname
	*/
	public void setPl_adminname(String pl_adminname ){
		this.pl_adminname = pl_adminname;
	}
	
	/**
	* 操作描述
	*@return 
	*/
	public String getPl_desc(){
		return  pl_desc;
	}
	/**
	* 操作描述
	*@param  pl_desc
	*/
	public void setPl_desc(String pl_desc ){
		this.pl_desc = pl_desc;
	}
	
	/**
	* 会员名称
	*@return 
	*/
	public String getPl_membername(){
		return  pl_membername;
	}
	/**
	* 会员名称
	*@param  pl_membername
	*/
	public void setPl_membername(String pl_membername ){
		this.pl_membername = pl_membername;
	}
	
	/**
	* 操作阶段
	*@return 
	*/
	public String getPl_stage(){
		return  pl_stage;
	}
	/**
	* 操作阶段
	*@param  pl_stage
	*/
	public void setPl_stage(String pl_stage ){
		this.pl_stage = pl_stage;
	}
	

}
