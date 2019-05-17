package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_circle_affix")
public class RaCircleAffix   {
	
	// alias
	public static final String ALIAS_affix_id = "affix_id";
	public static final String ALIAS_affix_filesize = "affix_filesize";
	public static final String ALIAS_affix_type = "affix_type";
	public static final String ALIAS_circle_id = "circle_id";
	public static final String ALIAS_member_id = "member_id";
	public static final String ALIAS_reply_id = "reply_id";
	public static final String ALIAS_theme_id = "theme_id";
	public static final String ALIAS_affix_addtime = "affix_addtime";
	public static final String ALIAS_affix_filename = "affix_filename";
	public static final String ALIAS_affix_filethumb = "affix_filethumb";
	
	/*
	附件id
	*/
	private Integer affix_id ;
	/*
	文件大小，单位字节
	*/
	private Integer affix_filesize ;
	/*
	文件类型 0无 1主题 2评论
	*/
	private Integer affix_type ;
	/*
	圈子id
	*/
	private Integer circle_id ;
	/*
	会员id
	*/
	private Integer member_id ;
	/*
	评论id
	*/
	private Integer reply_id ;
	/*
	主题id
	*/
	private Integer theme_id ;
	/*
	上传时间
	*/
	private String affix_addtime ;
	/*
	文件名称
	*/
	private String affix_filename ;
	/*
	缩略图名称
	*/
	private String affix_filethumb ;
	
	public RaCircleAffix() {
	}
	
	/**
	* 附件id
	*@return 
	*/
	public Integer getAffix_id(){
		return  affix_id;
	}
	/**
	* 附件id
	*@param  affix_id
	*/
	public void setAffix_id(Integer affix_id ){
		this.affix_id = affix_id;
	}
	
	/**
	* 文件大小，单位字节
	*@return 
	*/
	public Integer getAffix_filesize(){
		return  affix_filesize;
	}
	/**
	* 文件大小，单位字节
	*@param  affix_filesize
	*/
	public void setAffix_filesize(Integer affix_filesize ){
		this.affix_filesize = affix_filesize;
	}
	
	/**
	* 文件类型 0无 1主题 2评论
	*@return 
	*/
	public Integer getAffix_type(){
		return  affix_type;
	}
	/**
	* 文件类型 0无 1主题 2评论
	*@param  affix_type
	*/
	public void setAffix_type(Integer affix_type ){
		this.affix_type = affix_type;
	}
	
	/**
	* 圈子id
	*@return 
	*/
	public Integer getCircle_id(){
		return  circle_id;
	}
	/**
	* 圈子id
	*@param  circle_id
	*/
	public void setCircle_id(Integer circle_id ){
		this.circle_id = circle_id;
	}
	
	/**
	* 会员id
	*@return 
	*/
	public Integer getMember_id(){
		return  member_id;
	}
	/**
	* 会员id
	*@param  member_id
	*/
	public void setMember_id(Integer member_id ){
		this.member_id = member_id;
	}
	
	/**
	* 评论id
	*@return 
	*/
	public Integer getReply_id(){
		return  reply_id;
	}
	/**
	* 评论id
	*@param  reply_id
	*/
	public void setReply_id(Integer reply_id ){
		this.reply_id = reply_id;
	}
	
	/**
	* 主题id
	*@return 
	*/
	public Integer getTheme_id(){
		return  theme_id;
	}
	/**
	* 主题id
	*@param  theme_id
	*/
	public void setTheme_id(Integer theme_id ){
		this.theme_id = theme_id;
	}
	
	/**
	* 上传时间
	*@return 
	*/
	public String getAffix_addtime(){
		return  affix_addtime;
	}
	/**
	* 上传时间
	*@param  affix_addtime
	*/
	public void setAffix_addtime(String affix_addtime ){
		this.affix_addtime = affix_addtime;
	}
	
	/**
	* 文件名称
	*@return 
	*/
	public String getAffix_filename(){
		return  affix_filename;
	}
	/**
	* 文件名称
	*@param  affix_filename
	*/
	public void setAffix_filename(String affix_filename ){
		this.affix_filename = affix_filename;
	}
	
	/**
	* 缩略图名称
	*@return 
	*/
	public String getAffix_filethumb(){
		return  affix_filethumb;
	}
	/**
	* 缩略图名称
	*@param  affix_filethumb
	*/
	public void setAffix_filethumb(String affix_filethumb ){
		this.affix_filethumb = affix_filethumb;
	}
	

}
