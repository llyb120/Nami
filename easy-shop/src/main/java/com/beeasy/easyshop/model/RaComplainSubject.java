package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_complain_subject")
public class RaComplainSubject   {
	
	/*
	投诉主题id
	*/
	private Integer complainSubjectId ;
	/*
	投诉主题状态(1-有效/2-失效)
	*/
	private Integer complainSubjectState ;
	/*
	投诉主题
	*/
	private String complainSubjectContent ;
	/*
	投诉主题描述
	*/
	private String complainSubjectDesc ;
	
	public RaComplainSubject() {
	}
	
	/**
	* 投诉主题id
	*@return 
	*/
	public Integer getComplainSubjectId(){
		return  complainSubjectId;
	}
	/**
	* 投诉主题id
	*@param  complainSubjectId
	*/
	public void setComplainSubjectId(Integer complainSubjectId ){
		this.complainSubjectId = complainSubjectId;
	}
	
	/**
	* 投诉主题状态(1-有效/2-失效)
	*@return 
	*/
	public Integer getComplainSubjectState(){
		return  complainSubjectState;
	}
	/**
	* 投诉主题状态(1-有效/2-失效)
	*@param  complainSubjectState
	*/
	public void setComplainSubjectState(Integer complainSubjectState ){
		this.complainSubjectState = complainSubjectState;
	}
	
	/**
	* 投诉主题
	*@return 
	*/
	public String getComplainSubjectContent(){
		return  complainSubjectContent;
	}
	/**
	* 投诉主题
	*@param  complainSubjectContent
	*/
	public void setComplainSubjectContent(String complainSubjectContent ){
		this.complainSubjectContent = complainSubjectContent;
	}
	
	/**
	* 投诉主题描述
	*@return 
	*/
	public String getComplainSubjectDesc(){
		return  complainSubjectDesc;
	}
	/**
	* 投诉主题描述
	*@param  complainSubjectDesc
	*/
	public void setComplainSubjectDesc(String complainSubjectDesc ){
		this.complainSubjectDesc = complainSubjectDesc;
	}
	

}
