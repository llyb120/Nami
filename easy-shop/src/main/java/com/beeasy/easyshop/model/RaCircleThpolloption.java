package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_circle_thpolloption")
public class RaCircleThpolloption   {
	
	/*
	投票选项id
	*/
	private Integer pollopId ;
	/*
	排序
	*/
	private Integer pollopSort ;
	/*
	得票数
	*/
	private Integer pollopVotes ;
	/*
	话题id
	*/
	private Integer themeId ;
	/*
	投票选项
	*/
	private String pollopOption ;
	/*
	投票者名称
	*/
	private String pollopVotername ;
	
	public RaCircleThpolloption() {
	}
	
	/**
	* 投票选项id
	*@return 
	*/
	public Integer getPollopId(){
		return  pollopId;
	}
	/**
	* 投票选项id
	*@param  pollopId
	*/
	public void setPollopId(Integer pollopId ){
		this.pollopId = pollopId;
	}
	
	/**
	* 排序
	*@return 
	*/
	public Integer getPollopSort(){
		return  pollopSort;
	}
	/**
	* 排序
	*@param  pollopSort
	*/
	public void setPollopSort(Integer pollopSort ){
		this.pollopSort = pollopSort;
	}
	
	/**
	* 得票数
	*@return 
	*/
	public Integer getPollopVotes(){
		return  pollopVotes;
	}
	/**
	* 得票数
	*@param  pollopVotes
	*/
	public void setPollopVotes(Integer pollopVotes ){
		this.pollopVotes = pollopVotes;
	}
	
	/**
	* 话题id
	*@return 
	*/
	public Integer getThemeId(){
		return  themeId;
	}
	/**
	* 话题id
	*@param  themeId
	*/
	public void setThemeId(Integer themeId ){
		this.themeId = themeId;
	}
	
	/**
	* 投票选项
	*@return 
	*/
	public String getPollopOption(){
		return  pollopOption;
	}
	/**
	* 投票选项
	*@param  pollopOption
	*/
	public void setPollopOption(String pollopOption ){
		this.pollopOption = pollopOption;
	}
	
	/**
	* 投票者名称
	*@return 
	*/
	public String getPollopVotername(){
		return  pollopVotername;
	}
	/**
	* 投票者名称
	*@param  pollopVotername
	*/
	public void setPollopVotername(String pollopVotername ){
		this.pollopVotername = pollopVotername;
	}
	

}
