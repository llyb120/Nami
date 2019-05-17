package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_member")
public class RaMember   {
	
	/*
	会员id
	*/
	private Integer memberId ;
	/*
	是否允许转单
	*/
	private Integer allowPush ;
	/*
	是否允许举报(1可以/2不可以)
	*/
	private Integer informAllow ;
	/*
	会员是否有咨询和发送站内信的权限 1为开启 0为关闭
	*/
	private Integer isAllowtalk ;
	/*
	会员是否有购买权限 1为开启 0为关闭
	*/
	private Integer isBuy ;
	private Integer isWhole ;
	/*
	地区ID
	*/
	private Integer memberAreaid ;
	/*
	城市ID
	*/
	private Integer memberCityid ;
	/*
	0未绑定1已绑定
	*/
	private Integer memberEmailBind ;
	/*
	会员经验值
	*/
	private Integer memberExppoints ;
	/*
	登录次数
	*/
	private Integer memberLoginNum ;
	/*
	0未绑定1已绑定
	*/
	private Integer memberMobileBind ;
	/*
	会员积分
	*/
	private Integer memberPoints ;
	/*
	省份ID
	*/
	private Integer memberProvinceid ;
	/*
	会员性别
	*/
	private Integer memberSex ;
	/*
	sns空间访问次数
	*/
	private Integer memberSnsvisitnum ;
	/*
	会员的开启状态 1为开启 0为关闭
	*/
	private Integer memberState ;
	private Integer proxyId ;
	/*
	预存款可用金额
	*/
	private BigDecimal availablePredeposit ;
	/*
	可用充值卡余额
	*/
	private BigDecimal availableRcBalance ;
	private String fpic ;
	/*
	预存款冻结金额
	*/
	private BigDecimal freezePredeposit ;
	/*
	冻结充值卡余额
	*/
	private BigDecimal freezeRcBalance ;
	private String idcard ;
	/*
	地区内容
	*/
	private String memberAreainfo ;
	/*
	会员头像
	*/
	private String memberAvatar ;
	/*
	会员邮箱
	*/
	private String memberEmail ;
	/*
	当前登录ip
	*/
	private String memberLoginIp ;
	/*
	当前登录时间
	*/
	private String memberLoginTime ;
	/*
	手机号
	*/
	private String memberMobile ;
	/*
	会员名称
	*/
	private String memberName ;
	/*
	上次登录ip
	*/
	private String memberOldLoginIp ;
	/*
	上次登录时间
	*/
	private String memberOldLoginTime ;
	/*
	会员密码
	*/
	private String memberPasswd ;
	/*
	支付密码
	*/
	private String memberPaypwd ;
	/*
	隐私设定
	*/
	private String memberPrivacy ;
	/*
	qq
	*/
	private String memberQq ;
	/*
	qq账号相关信息
	*/
	private String memberQqinfo ;
	/*
	qq互联id
	*/
	private String memberQqopenid ;
	/*
	会员常用操作
	*/
	private String memberQuicklink ;
	/*
	新浪账号相关信息序列化值
	*/
	private String memberSinainfo ;
	/*
	新浪微博登录id
	*/
	private String memberSinaopenid ;
	/*
	会员注册时间
	*/
	private String memberTime ;
	/*
	真实姓名
	*/
	private String memberTruename ;
	/*
	阿里旺旺
	*/
	private String memberWw ;
	private String miniWechatOpenid ;
	private String nickname ;
	private String storedress ;
	private String wechatOpenid ;
	private String zpic ;
	/*
	生日
	*/
	private Date memberBirthday ;
	
	public RaMember() {
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
	* 是否允许转单
	*@return 
	*/
	public Integer getAllowPush(){
		return  allowPush;
	}
	/**
	* 是否允许转单
	*@param  allowPush
	*/
	public void setAllowPush(Integer allowPush ){
		this.allowPush = allowPush;
	}
	
	/**
	* 是否允许举报(1可以/2不可以)
	*@return 
	*/
	public Integer getInformAllow(){
		return  informAllow;
	}
	/**
	* 是否允许举报(1可以/2不可以)
	*@param  informAllow
	*/
	public void setInformAllow(Integer informAllow ){
		this.informAllow = informAllow;
	}
	
	/**
	* 会员是否有咨询和发送站内信的权限 1为开启 0为关闭
	*@return 
	*/
	public Integer getIsAllowtalk(){
		return  isAllowtalk;
	}
	/**
	* 会员是否有咨询和发送站内信的权限 1为开启 0为关闭
	*@param  isAllowtalk
	*/
	public void setIsAllowtalk(Integer isAllowtalk ){
		this.isAllowtalk = isAllowtalk;
	}
	
	/**
	* 会员是否有购买权限 1为开启 0为关闭
	*@return 
	*/
	public Integer getIsBuy(){
		return  isBuy;
	}
	/**
	* 会员是否有购买权限 1为开启 0为关闭
	*@param  isBuy
	*/
	public void setIsBuy(Integer isBuy ){
		this.isBuy = isBuy;
	}
	
	public Integer getIsWhole(){
		return  isWhole;
	}
	public void setIsWhole(Integer isWhole ){
		this.isWhole = isWhole;
	}
	
	/**
	* 地区ID
	*@return 
	*/
	public Integer getMemberAreaid(){
		return  memberAreaid;
	}
	/**
	* 地区ID
	*@param  memberAreaid
	*/
	public void setMemberAreaid(Integer memberAreaid ){
		this.memberAreaid = memberAreaid;
	}
	
	/**
	* 城市ID
	*@return 
	*/
	public Integer getMemberCityid(){
		return  memberCityid;
	}
	/**
	* 城市ID
	*@param  memberCityid
	*/
	public void setMemberCityid(Integer memberCityid ){
		this.memberCityid = memberCityid;
	}
	
	/**
	* 0未绑定1已绑定
	*@return 
	*/
	public Integer getMemberEmailBind(){
		return  memberEmailBind;
	}
	/**
	* 0未绑定1已绑定
	*@param  memberEmailBind
	*/
	public void setMemberEmailBind(Integer memberEmailBind ){
		this.memberEmailBind = memberEmailBind;
	}
	
	/**
	* 会员经验值
	*@return 
	*/
	public Integer getMemberExppoints(){
		return  memberExppoints;
	}
	/**
	* 会员经验值
	*@param  memberExppoints
	*/
	public void setMemberExppoints(Integer memberExppoints ){
		this.memberExppoints = memberExppoints;
	}
	
	/**
	* 登录次数
	*@return 
	*/
	public Integer getMemberLoginNum(){
		return  memberLoginNum;
	}
	/**
	* 登录次数
	*@param  memberLoginNum
	*/
	public void setMemberLoginNum(Integer memberLoginNum ){
		this.memberLoginNum = memberLoginNum;
	}
	
	/**
	* 0未绑定1已绑定
	*@return 
	*/
	public Integer getMemberMobileBind(){
		return  memberMobileBind;
	}
	/**
	* 0未绑定1已绑定
	*@param  memberMobileBind
	*/
	public void setMemberMobileBind(Integer memberMobileBind ){
		this.memberMobileBind = memberMobileBind;
	}
	
	/**
	* 会员积分
	*@return 
	*/
	public Integer getMemberPoints(){
		return  memberPoints;
	}
	/**
	* 会员积分
	*@param  memberPoints
	*/
	public void setMemberPoints(Integer memberPoints ){
		this.memberPoints = memberPoints;
	}
	
	/**
	* 省份ID
	*@return 
	*/
	public Integer getMemberProvinceid(){
		return  memberProvinceid;
	}
	/**
	* 省份ID
	*@param  memberProvinceid
	*/
	public void setMemberProvinceid(Integer memberProvinceid ){
		this.memberProvinceid = memberProvinceid;
	}
	
	/**
	* 会员性别
	*@return 
	*/
	public Integer getMemberSex(){
		return  memberSex;
	}
	/**
	* 会员性别
	*@param  memberSex
	*/
	public void setMemberSex(Integer memberSex ){
		this.memberSex = memberSex;
	}
	
	/**
	* sns空间访问次数
	*@return 
	*/
	public Integer getMemberSnsvisitnum(){
		return  memberSnsvisitnum;
	}
	/**
	* sns空间访问次数
	*@param  memberSnsvisitnum
	*/
	public void setMemberSnsvisitnum(Integer memberSnsvisitnum ){
		this.memberSnsvisitnum = memberSnsvisitnum;
	}
	
	/**
	* 会员的开启状态 1为开启 0为关闭
	*@return 
	*/
	public Integer getMemberState(){
		return  memberState;
	}
	/**
	* 会员的开启状态 1为开启 0为关闭
	*@param  memberState
	*/
	public void setMemberState(Integer memberState ){
		this.memberState = memberState;
	}
	
	public Integer getProxyId(){
		return  proxyId;
	}
	public void setProxyId(Integer proxyId ){
		this.proxyId = proxyId;
	}
	
	/**
	* 预存款可用金额
	*@return 
	*/
	public BigDecimal getAvailablePredeposit(){
		return  availablePredeposit;
	}
	/**
	* 预存款可用金额
	*@param  availablePredeposit
	*/
	public void setAvailablePredeposit(BigDecimal availablePredeposit ){
		this.availablePredeposit = availablePredeposit;
	}
	
	/**
	* 可用充值卡余额
	*@return 
	*/
	public BigDecimal getAvailableRcBalance(){
		return  availableRcBalance;
	}
	/**
	* 可用充值卡余额
	*@param  availableRcBalance
	*/
	public void setAvailableRcBalance(BigDecimal availableRcBalance ){
		this.availableRcBalance = availableRcBalance;
	}
	
	public String getFpic(){
		return  fpic;
	}
	public void setFpic(String fpic ){
		this.fpic = fpic;
	}
	
	/**
	* 预存款冻结金额
	*@return 
	*/
	public BigDecimal getFreezePredeposit(){
		return  freezePredeposit;
	}
	/**
	* 预存款冻结金额
	*@param  freezePredeposit
	*/
	public void setFreezePredeposit(BigDecimal freezePredeposit ){
		this.freezePredeposit = freezePredeposit;
	}
	
	/**
	* 冻结充值卡余额
	*@return 
	*/
	public BigDecimal getFreezeRcBalance(){
		return  freezeRcBalance;
	}
	/**
	* 冻结充值卡余额
	*@param  freezeRcBalance
	*/
	public void setFreezeRcBalance(BigDecimal freezeRcBalance ){
		this.freezeRcBalance = freezeRcBalance;
	}
	
	public String getIdcard(){
		return  idcard;
	}
	public void setIdcard(String idcard ){
		this.idcard = idcard;
	}
	
	/**
	* 地区内容
	*@return 
	*/
	public String getMemberAreainfo(){
		return  memberAreainfo;
	}
	/**
	* 地区内容
	*@param  memberAreainfo
	*/
	public void setMemberAreainfo(String memberAreainfo ){
		this.memberAreainfo = memberAreainfo;
	}
	
	/**
	* 会员头像
	*@return 
	*/
	public String getMemberAvatar(){
		return  memberAvatar;
	}
	/**
	* 会员头像
	*@param  memberAvatar
	*/
	public void setMemberAvatar(String memberAvatar ){
		this.memberAvatar = memberAvatar;
	}
	
	/**
	* 会员邮箱
	*@return 
	*/
	public String getMemberEmail(){
		return  memberEmail;
	}
	/**
	* 会员邮箱
	*@param  memberEmail
	*/
	public void setMemberEmail(String memberEmail ){
		this.memberEmail = memberEmail;
	}
	
	/**
	* 当前登录ip
	*@return 
	*/
	public String getMemberLoginIp(){
		return  memberLoginIp;
	}
	/**
	* 当前登录ip
	*@param  memberLoginIp
	*/
	public void setMemberLoginIp(String memberLoginIp ){
		this.memberLoginIp = memberLoginIp;
	}
	
	/**
	* 当前登录时间
	*@return 
	*/
	public String getMemberLoginTime(){
		return  memberLoginTime;
	}
	/**
	* 当前登录时间
	*@param  memberLoginTime
	*/
	public void setMemberLoginTime(String memberLoginTime ){
		this.memberLoginTime = memberLoginTime;
	}
	
	/**
	* 手机号
	*@return 
	*/
	public String getMemberMobile(){
		return  memberMobile;
	}
	/**
	* 手机号
	*@param  memberMobile
	*/
	public void setMemberMobile(String memberMobile ){
		this.memberMobile = memberMobile;
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
	* 上次登录ip
	*@return 
	*/
	public String getMemberOldLoginIp(){
		return  memberOldLoginIp;
	}
	/**
	* 上次登录ip
	*@param  memberOldLoginIp
	*/
	public void setMemberOldLoginIp(String memberOldLoginIp ){
		this.memberOldLoginIp = memberOldLoginIp;
	}
	
	/**
	* 上次登录时间
	*@return 
	*/
	public String getMemberOldLoginTime(){
		return  memberOldLoginTime;
	}
	/**
	* 上次登录时间
	*@param  memberOldLoginTime
	*/
	public void setMemberOldLoginTime(String memberOldLoginTime ){
		this.memberOldLoginTime = memberOldLoginTime;
	}
	
	/**
	* 会员密码
	*@return 
	*/
	public String getMemberPasswd(){
		return  memberPasswd;
	}
	/**
	* 会员密码
	*@param  memberPasswd
	*/
	public void setMemberPasswd(String memberPasswd ){
		this.memberPasswd = memberPasswd;
	}
	
	/**
	* 支付密码
	*@return 
	*/
	public String getMemberPaypwd(){
		return  memberPaypwd;
	}
	/**
	* 支付密码
	*@param  memberPaypwd
	*/
	public void setMemberPaypwd(String memberPaypwd ){
		this.memberPaypwd = memberPaypwd;
	}
	
	/**
	* 隐私设定
	*@return 
	*/
	public String getMemberPrivacy(){
		return  memberPrivacy;
	}
	/**
	* 隐私设定
	*@param  memberPrivacy
	*/
	public void setMemberPrivacy(String memberPrivacy ){
		this.memberPrivacy = memberPrivacy;
	}
	
	/**
	* qq
	*@return 
	*/
	public String getMemberQq(){
		return  memberQq;
	}
	/**
	* qq
	*@param  memberQq
	*/
	public void setMemberQq(String memberQq ){
		this.memberQq = memberQq;
	}
	
	/**
	* qq账号相关信息
	*@return 
	*/
	public String getMemberQqinfo(){
		return  memberQqinfo;
	}
	/**
	* qq账号相关信息
	*@param  memberQqinfo
	*/
	public void setMemberQqinfo(String memberQqinfo ){
		this.memberQqinfo = memberQqinfo;
	}
	
	/**
	* qq互联id
	*@return 
	*/
	public String getMemberQqopenid(){
		return  memberQqopenid;
	}
	/**
	* qq互联id
	*@param  memberQqopenid
	*/
	public void setMemberQqopenid(String memberQqopenid ){
		this.memberQqopenid = memberQqopenid;
	}
	
	/**
	* 会员常用操作
	*@return 
	*/
	public String getMemberQuicklink(){
		return  memberQuicklink;
	}
	/**
	* 会员常用操作
	*@param  memberQuicklink
	*/
	public void setMemberQuicklink(String memberQuicklink ){
		this.memberQuicklink = memberQuicklink;
	}
	
	/**
	* 新浪账号相关信息序列化值
	*@return 
	*/
	public String getMemberSinainfo(){
		return  memberSinainfo;
	}
	/**
	* 新浪账号相关信息序列化值
	*@param  memberSinainfo
	*/
	public void setMemberSinainfo(String memberSinainfo ){
		this.memberSinainfo = memberSinainfo;
	}
	
	/**
	* 新浪微博登录id
	*@return 
	*/
	public String getMemberSinaopenid(){
		return  memberSinaopenid;
	}
	/**
	* 新浪微博登录id
	*@param  memberSinaopenid
	*/
	public void setMemberSinaopenid(String memberSinaopenid ){
		this.memberSinaopenid = memberSinaopenid;
	}
	
	/**
	* 会员注册时间
	*@return 
	*/
	public String getMemberTime(){
		return  memberTime;
	}
	/**
	* 会员注册时间
	*@param  memberTime
	*/
	public void setMemberTime(String memberTime ){
		this.memberTime = memberTime;
	}
	
	/**
	* 真实姓名
	*@return 
	*/
	public String getMemberTruename(){
		return  memberTruename;
	}
	/**
	* 真实姓名
	*@param  memberTruename
	*/
	public void setMemberTruename(String memberTruename ){
		this.memberTruename = memberTruename;
	}
	
	/**
	* 阿里旺旺
	*@return 
	*/
	public String getMemberWw(){
		return  memberWw;
	}
	/**
	* 阿里旺旺
	*@param  memberWw
	*/
	public void setMemberWw(String memberWw ){
		this.memberWw = memberWw;
	}
	
	public String getMiniWechatOpenid(){
		return  miniWechatOpenid;
	}
	public void setMiniWechatOpenid(String miniWechatOpenid ){
		this.miniWechatOpenid = miniWechatOpenid;
	}
	
	public String getNickname(){
		return  nickname;
	}
	public void setNickname(String nickname ){
		this.nickname = nickname;
	}
	
	public String getStoredress(){
		return  storedress;
	}
	public void setStoredress(String storedress ){
		this.storedress = storedress;
	}
	
	public String getWechatOpenid(){
		return  wechatOpenid;
	}
	public void setWechatOpenid(String wechatOpenid ){
		this.wechatOpenid = wechatOpenid;
	}
	
	public String getZpic(){
		return  zpic;
	}
	public void setZpic(String zpic ){
		this.zpic = zpic;
	}
	
	/**
	* 生日
	*@return 
	*/
	public Date getMemberBirthday(){
		return  memberBirthday;
	}
	/**
	* 生日
	*@param  memberBirthday
	*/
	public void setMemberBirthday(Date memberBirthday ){
		this.memberBirthday = memberBirthday;
	}
	

}
