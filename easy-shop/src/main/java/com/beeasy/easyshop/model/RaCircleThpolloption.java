package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_circle_thpolloption")
public class RaCircleThpolloption   {
	
	// alias
	public static final String ALIAS_pollop_id = "pollop_id";
	public static final String ALIAS_pollop_sort = "pollop_sort";
	public static final String ALIAS_pollop_votes = "pollop_votes";
	public static final String ALIAS_theme_id = "theme_id";
	public static final String ALIAS_pollop_option = "pollop_option";
	public static final String ALIAS_pollop_votername = "pollop_votername";
	
	/*
	投票选项id
	*/
	private Integer pollop_id ;
	/*
	排序
	*/
	private Integer pollop_sort ;
	/*
	得票数
	*/
	private Integer pollop_votes ;
	/*
	话题id
	*/
	private Integer theme_id ;
	/*
	投票选项
	*/
	private String pollop_option ;
	/*
	投票者名称
	*/
	private String pollop_votername ;
	
	public RaCircleThpolloption() {
	}
	
	/**
	* 投票选项id
	*@return 
	*/
	public Integer getPollop_id(){
		return  pollop_id;
	}
	/**
	* 投票选项id
	*@param  pollop_id
	*/
	public void setPollop_id(Integer pollop_id ){
		this.pollop_id = pollop_id;
	}
	
	/**
	* 排序
	*@return 
	*/
	public Integer getPollop_sort(){
		return  pollop_sort;
	}
	/**
	* 排序
	*@param  pollop_sort
	*/
	public void setPollop_sort(Integer pollop_sort ){
		this.pollop_sort = pollop_sort;
	}
	
	/**
	* 得票数
	*@return 
	*/
	public Integer getPollop_votes(){
		return  pollop_votes;
	}
	/**
	* 得票数
	*@param  pollop_votes
	*/
	public void setPollop_votes(Integer pollop_votes ){
		this.pollop_votes = pollop_votes;
	}
	
	/**
	* 话题id
	*@return 
	*/
	public Integer getTheme_id(){
		return  theme_id;
	}
	/**
	* 话题id
	*@param  theme_id
	*/
	public void setTheme_id(Integer theme_id ){
		this.theme_id = theme_id;
	}
	
	/**
	* 投票选项
	*@return 
	*/
	public String getPollop_option(){
		return  pollop_option;
	}
	/**
	* 投票选项
	*@param  pollop_option
	*/
	public void setPollop_option(String pollop_option ){
		this.pollop_option = pollop_option;
	}
	
	/**
	* 投票者名称
	*@return 
	*/
	public String getPollop_votername(){
		return  pollop_votername;
	}
	/**
	* 投票者名称
	*@param  pollop_votername
	*/
	public void setPollop_votername(String pollop_votername ){
		this.pollop_votername = pollop_votername;
	}
	

}
