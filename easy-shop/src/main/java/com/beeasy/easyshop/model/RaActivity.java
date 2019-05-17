package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_activity")
public class RaActivity   {
	
	// alias
	public static final String ALIAS_activity_id = "activity_id";
	public static final String ALIAS_activity_end_date = "activity_end_date";
	public static final String ALIAS_activity_sort = "activity_sort";
	public static final String ALIAS_activity_start_date = "activity_start_date";
	public static final String ALIAS_activity_state = "activity_state";
	public static final String ALIAS_activity_banner = "activity_banner";
	public static final String ALIAS_activity_desc = "activity_desc";
	public static final String ALIAS_activity_style = "activity_style";
	public static final String ALIAS_activity_title = "activity_title";
	public static final String ALIAS_activity_type = "activity_type";
	
	/*
	id
	*/
	private Integer activity_id ;
	/*
	结束时间
	*/
	private Integer activity_end_date ;
	/*
	排序
	*/
	private Integer activity_sort ;
	/*
	开始时间
	*/
	private Integer activity_start_date ;
	/*
	活动状态 0为关闭 1为开启
	*/
	private Integer activity_state ;
	/*
	活动横幅大图片
	*/
	private String activity_banner ;
	/*
	描述
	*/
	private String activity_desc ;
	/*
	活动页面模板样式标识码
	*/
	private String activity_style ;
	/*
	标题
	*/
	private String activity_title ;
	/*
	活动类型 1:商品 2:团购
	*/
	private String activity_type ;
	
	public RaActivity() {
	}
	
	/**
	* id
	*@return 
	*/
	public Integer getActivity_id(){
		return  activity_id;
	}
	/**
	* id
	*@param  activity_id
	*/
	public void setActivity_id(Integer activity_id ){
		this.activity_id = activity_id;
	}
	
	/**
	* 结束时间
	*@return 
	*/
	public Integer getActivity_end_date(){
		return  activity_end_date;
	}
	/**
	* 结束时间
	*@param  activity_end_date
	*/
	public void setActivity_end_date(Integer activity_end_date ){
		this.activity_end_date = activity_end_date;
	}
	
	/**
	* 排序
	*@return 
	*/
	public Integer getActivity_sort(){
		return  activity_sort;
	}
	/**
	* 排序
	*@param  activity_sort
	*/
	public void setActivity_sort(Integer activity_sort ){
		this.activity_sort = activity_sort;
	}
	
	/**
	* 开始时间
	*@return 
	*/
	public Integer getActivity_start_date(){
		return  activity_start_date;
	}
	/**
	* 开始时间
	*@param  activity_start_date
	*/
	public void setActivity_start_date(Integer activity_start_date ){
		this.activity_start_date = activity_start_date;
	}
	
	/**
	* 活动状态 0为关闭 1为开启
	*@return 
	*/
	public Integer getActivity_state(){
		return  activity_state;
	}
	/**
	* 活动状态 0为关闭 1为开启
	*@param  activity_state
	*/
	public void setActivity_state(Integer activity_state ){
		this.activity_state = activity_state;
	}
	
	/**
	* 活动横幅大图片
	*@return 
	*/
	public String getActivity_banner(){
		return  activity_banner;
	}
	/**
	* 活动横幅大图片
	*@param  activity_banner
	*/
	public void setActivity_banner(String activity_banner ){
		this.activity_banner = activity_banner;
	}
	
	/**
	* 描述
	*@return 
	*/
	public String getActivity_desc(){
		return  activity_desc;
	}
	/**
	* 描述
	*@param  activity_desc
	*/
	public void setActivity_desc(String activity_desc ){
		this.activity_desc = activity_desc;
	}
	
	/**
	* 活动页面模板样式标识码
	*@return 
	*/
	public String getActivity_style(){
		return  activity_style;
	}
	/**
	* 活动页面模板样式标识码
	*@param  activity_style
	*/
	public void setActivity_style(String activity_style ){
		this.activity_style = activity_style;
	}
	
	/**
	* 标题
	*@return 
	*/
	public String getActivity_title(){
		return  activity_title;
	}
	/**
	* 标题
	*@param  activity_title
	*/
	public void setActivity_title(String activity_title ){
		this.activity_title = activity_title;
	}
	
	/**
	* 活动类型 1:商品 2:团购
	*@return 
	*/
	public String getActivity_type(){
		return  activity_type;
	}
	/**
	* 活动类型 1:商品 2:团购
	*@param  activity_type
	*/
	public void setActivity_type(String activity_type ){
		this.activity_type = activity_type;
	}
	

}
