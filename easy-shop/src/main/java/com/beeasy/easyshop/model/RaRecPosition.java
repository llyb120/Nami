package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_rec_position")
public class RaRecPosition   {
	
	// alias
	public static final String ALIAS_rec_id = "rec_id";
	public static final String ALIAS_content = "content";
	public static final String ALIAS_pic_type = "pic_type";
	public static final String ALIAS_title = "title";
	
	private Integer rec_id ;
	/*
	序列化推荐位内容
	*/
	private String content ;
	/*
	0文字1本地图片2远程
	*/
	private String pic_type ;
	/*
	标题
	*/
	private String title ;
	
	public RaRecPosition() {
	}
	
	public Integer getRec_id(){
		return  rec_id;
	}
	public void setRec_id(Integer rec_id ){
		this.rec_id = rec_id;
	}
	
	/**
	* 序列化推荐位内容
	*@return 
	*/
	public String getContent(){
		return  content;
	}
	/**
	* 序列化推荐位内容
	*@param  content
	*/
	public void setContent(String content ){
		this.content = content;
	}
	
	/**
	* 0文字1本地图片2远程
	*@return 
	*/
	public String getPic_type(){
		return  pic_type;
	}
	/**
	* 0文字1本地图片2远程
	*@param  pic_type
	*/
	public void setPic_type(String pic_type ){
		this.pic_type = pic_type;
	}
	
	/**
	* 标题
	*@return 
	*/
	public String getTitle(){
		return  title;
	}
	/**
	* 标题
	*@param  title
	*/
	public void setTitle(String title ){
		this.title = title;
	}
	

}
