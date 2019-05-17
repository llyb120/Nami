package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_circle_inform")
public class RaCircleInform   {
	
	/*
	举报id
	*/
	private Integer informId ;
	/*
	圈子id
	*/
	private Integer circleId ;
	/*
	操作经验
	*/
	private Integer informOpexp ;
	/*
	操作人id
	*/
	private Integer informOpid ;
	/*
	状态 0未处理、1已处理
	*/
	private Integer informState ;
	/*
	类型 0话题、1回复
	*/
	private Integer informType ;
	/*
	会员id
	*/
	private Integer memberId ;
	/*
	回复id
	*/
	private Integer replyId ;
	/*
	话题id
	*/
	private Integer themeId ;
	/*
	圈子名称
	*/
	private String circleName ;
	/*
	举报内容
	*/
	private String informContent ;
	/*
	操作人名称
	*/
	private String informOpname ;
	/*
	处理结果
	*/
	private String informOpresult ;
	/*
	举报时间
	*/
	private String informTime ;
	/*
	会员名称
	*/
	private String memberName ;
	/*
	主题名称
	*/
	private String themeName ;
	
	public RaCircleInform() {
	}
	
	/**
	* 举报id
	*@return 
	*/
	public Integer getInformId(){
		return  informId;
	}
	/**
	* 举报id
	*@param  informId
	*/
	public void setInformId(Integer informId ){
		this.informId = informId;
	}
	
	/**
	* 圈子id
	*@return 
	*/
	public Integer getCircleId(){
		return  circleId;
	}
	/**
	* 圈子id
	*@param  circleId
	*/
	public void setCircleId(Integer circleId ){
		this.circleId = circleId;
	}
	
	/**
	* 操作经验
	*@return 
	*/
	public Integer getInformOpexp(){
		return  informOpexp;
	}
	/**
	* 操作经验
	*@param  informOpexp
	*/
	public void setInformOpexp(Integer informOpexp ){
		this.informOpexp = informOpexp;
	}
	
	/**
	* 操作人id
	*@return 
	*/
	public Integer getInformOpid(){
		return  informOpid;
	}
	/**
	* 操作人id
	*@param  informOpid
	*/
	public void setInformOpid(Integer informOpid ){
		this.informOpid = informOpid;
	}
	
	/**
	* 状态 0未处理、1已处理
	*@return 
	*/
	public Integer getInformState(){
		return  informState;
	}
	/**
	* 状态 0未处理、1已处理
	*@param  informState
	*/
	public void setInformState(Integer informState ){
		this.informState = informState;
	}
	
	/**
	* 类型 0话题、1回复
	*@return 
	*/
	public Integer getInformType(){
		return  informType;
	}
	/**
	* 类型 0话题、1回复
	*@param  informType
	*/
	public void setInformType(Integer informType ){
		this.informType = informType;
	}
	
	/**
	* 会员id
	*@return 
	*/
	public Integer getMemberId(){
		return  memberId;
	}
	/**
	* 会员id
	*@param  memberId
	*/
	public void setMemberId(Integer memberId ){
		this.memberId = memberId;
	}
	
	/**
	* 回复id
	*@return 
	*/
	public Integer getReplyId(){
		return  replyId;
	}
	/**
	* 回复id
	*@param  replyId
	*/
	public void setReplyId(Integer replyId ){
		this.replyId = replyId;
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
	* 圈子名称
	*@return 
	*/
	public String getCircleName(){
		return  circleName;
	}
	/**
	* 圈子名称
	*@param  circleName
	*/
	public void setCircleName(String circleName ){
		this.circleName = circleName;
	}
	
	/**
	* 举报内容
	*@return 
	*/
	public String getInformContent(){
		return  informContent;
	}
	/**
	* 举报内容
	*@param  informContent
	*/
	public void setInformContent(String informContent ){
		this.informContent = informContent;
	}
	
	/**
	* 操作人名称
	*@return 
	*/
	public String getInformOpname(){
		return  informOpname;
	}
	/**
	* 操作人名称
	*@param  informOpname
	*/
	public void setInformOpname(String informOpname ){
		this.informOpname = informOpname;
	}
	
	/**
	* 处理结果
	*@return 
	*/
	public String getInformOpresult(){
		return  informOpresult;
	}
	/**
	* 处理结果
	*@param  informOpresult
	*/
	public void setInformOpresult(String informOpresult ){
		this.informOpresult = informOpresult;
	}
	
	/**
	* 举报时间
	*@return 
	*/
	public String getInformTime(){
		return  informTime;
	}
	/**
	* 举报时间
	*@param  informTime
	*/
	public void setInformTime(String informTime ){
		this.informTime = informTime;
	}
	
	/**
	* 会员名称
	*@return 
	*/
	public String getMemberName(){
		return  memberName;
	}
	/**
	* 会员名称
	*@param  memberName
	*/
	public void setMemberName(String memberName ){
		this.memberName = memberName;
	}
	
	/**
	* 主题名称
	*@return 
	*/
	public String getThemeName(){
		return  themeName;
	}
	/**
	* 主题名称
	*@param  themeName
	*/
	public void setThemeName(String themeName ){
		this.themeName = themeName;
	}
	

}
