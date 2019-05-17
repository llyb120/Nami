package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_member")
public class RaMember   {
	
	// alias
	public static final String ALIAS_member_id = "member_id";
	public static final String ALIAS_allow_push = "allow_push";
	public static final String ALIAS_inform_allow = "inform_allow";
	public static final String ALIAS_is_allowtalk = "is_allowtalk";
	public static final String ALIAS_is_buy = "is_buy";
	public static final String ALIAS_is_whole = "is_whole";
	public static final String ALIAS_member_areaid = "member_areaid";
	public static final String ALIAS_member_cityid = "member_cityid";
	public static final String ALIAS_member_email_bind = "member_email_bind";
	public static final String ALIAS_member_exppoints = "member_exppoints";
	public static final String ALIAS_member_login_num = "member_login_num";
	public static final String ALIAS_member_mobile_bind = "member_mobile_bind";
	public static final String ALIAS_member_points = "member_points";
	public static final String ALIAS_member_provinceid = "member_provinceid";
	public static final String ALIAS_member_sex = "member_sex";
	public static final String ALIAS_member_snsvisitnum = "member_snsvisitnum";
	public static final String ALIAS_member_state = "member_state";
	public static final String ALIAS_proxy_id = "proxy_id";
	public static final String ALIAS_available_predeposit = "available_predeposit";
	public static final String ALIAS_available_rc_balance = "available_rc_balance";
	public static final String ALIAS_fpic = "fpic";
	public static final String ALIAS_freeze_predeposit = "freeze_predeposit";
	public static final String ALIAS_freeze_rc_balance = "freeze_rc_balance";
	public static final String ALIAS_idcard = "idcard";
	public static final String ALIAS_member_areainfo = "member_areainfo";
	public static final String ALIAS_member_avatar = "member_avatar";
	public static final String ALIAS_member_email = "member_email";
	public static final String ALIAS_member_login_ip = "member_login_ip";
	public static final String ALIAS_member_login_time = "member_login_time";
	public static final String ALIAS_member_mobile = "member_mobile";
	public static final String ALIAS_member_name = "member_name";
	public static final String ALIAS_member_old_login_ip = "member_old_login_ip";
	public static final String ALIAS_member_old_login_time = "member_old_login_time";
	public static final String ALIAS_member_passwd = "member_passwd";
	public static final String ALIAS_member_paypwd = "member_paypwd";
	public static final String ALIAS_member_privacy = "member_privacy";
	public static final String ALIAS_member_qq = "member_qq";
	public static final String ALIAS_member_qqinfo = "member_qqinfo";
	public static final String ALIAS_member_qqopenid = "member_qqopenid";
	public static final String ALIAS_member_quicklink = "member_quicklink";
	public static final String ALIAS_member_sinainfo = "member_sinainfo";
	public static final String ALIAS_member_sinaopenid = "member_sinaopenid";
	public static final String ALIAS_member_time = "member_time";
	public static final String ALIAS_member_truename = "member_truename";
	public static final String ALIAS_member_ww = "member_ww";
	public static final String ALIAS_mini_wechat_openid = "mini_wechat_openid";
	public static final String ALIAS_nickname = "nickname";
	public static final String ALIAS_storeDress = "storeDress";
	public static final String ALIAS_wechat_openid = "wechat_openid";
	public static final String ALIAS_zpic = "zpic";
	public static final String ALIAS_member_birthday = "member_birthday";
	
	/*
	会员id
	*/
	private Integer member_id ;
	/*
	是否允许转单
	*/
	private Integer allow_push ;
	/*
	是否允许举报(1可以/2不可以)
	*/
	private Integer inform_allow ;
	/*
	会员是否有咨询和发送站内信的权限 1为开启 0为关闭
	*/
	private Integer is_allowtalk ;
	/*
	会员是否有购买权限 1为开启 0为关闭
	*/
	private Integer is_buy ;
	private Integer is_whole ;
	/*
	地区ID
	*/
	private Integer member_areaid ;
	/*
	城市ID
	*/
	private Integer member_cityid ;
	/*
	0未绑定1已绑定
	*/
	private Integer member_email_bind ;
	/*
	会员经验值
	*/
	private Integer member_exppoints ;
	/*
	登录次数
	*/
	private Integer member_login_num ;
	/*
	0未绑定1已绑定
	*/
	private Integer member_mobile_bind ;
	/*
	会员积分
	*/
	private Integer member_points ;
	/*
	省份ID
	*/
	private Integer member_provinceid ;
	/*
	会员性别
	*/
	private Integer member_sex ;
	/*
	sns空间访问次数
	*/
	private Integer member_snsvisitnum ;
	/*
	会员的开启状态 1为开启 0为关闭
	*/
	private Integer member_state ;
	private Integer proxy_id ;
	/*
	预存款可用金额
	*/
	private BigDecimal available_predeposit ;
	/*
	可用充值卡余额
	*/
	private BigDecimal available_rc_balance ;
	private String fpic ;
	/*
	预存款冻结金额
	*/
	private BigDecimal freeze_predeposit ;
	/*
	冻结充值卡余额
	*/
	private BigDecimal freeze_rc_balance ;
	private String idcard ;
	/*
	地区内容
	*/
	private String member_areainfo ;
	/*
	会员头像
	*/
	private String member_avatar ;
	/*
	会员邮箱
	*/
	private String member_email ;
	/*
	当前登录ip
	*/
	private String member_login_ip ;
	/*
	当前登录时间
	*/
	private String member_login_time ;
	/*
	手机号
	*/
	private String member_mobile ;
	/*
	会员名称
	*/
	private String member_name ;
	/*
	上次登录ip
	*/
	private String member_old_login_ip ;
	/*
	上次登录时间
	*/
	private String member_old_login_time ;
	/*
	会员密码
	*/
	private String member_passwd ;
	/*
	支付密码
	*/
	private String member_paypwd ;
	/*
	隐私设定
	*/
	private String member_privacy ;
	/*
	qq
	*/
	private String member_qq ;
	/*
	qq账号相关信息
	*/
	private String member_qqinfo ;
	/*
	qq互联id
	*/
	private String member_qqopenid ;
	/*
	会员常用操作
	*/
	private String member_quicklink ;
	/*
	新浪账号相关信息序列化值
	*/
	private String member_sinainfo ;
	/*
	新浪微博登录id
	*/
	private String member_sinaopenid ;
	/*
	会员注册时间
	*/
	private String member_time ;
	/*
	真实姓名
	*/
	private String member_truename ;
	/*
	阿里旺旺
	*/
	private String member_ww ;
	private String mini_wechat_openid ;
	private String nickname ;
	private String storedress ;
	private String wechat_openid ;
	private String zpic ;
	/*
	生日
	*/
	private Date member_birthday ;
	
	public RaMember() {
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
	* 是否允许转单
	*@return 
	*/
	public Integer getAllow_push(){
		return  allow_push;
	}
	/**
	* 是否允许转单
	*@param  allow_push
	*/
	public void setAllow_push(Integer allow_push ){
		this.allow_push = allow_push;
	}
	
	/**
	* 是否允许举报(1可以/2不可以)
	*@return 
	*/
	public Integer getInform_allow(){
		return  inform_allow;
	}
	/**
	* 是否允许举报(1可以/2不可以)
	*@param  inform_allow
	*/
	public void setInform_allow(Integer inform_allow ){
		this.inform_allow = inform_allow;
	}
	
	/**
	* 会员是否有咨询和发送站内信的权限 1为开启 0为关闭
	*@return 
	*/
	public Integer getIs_allowtalk(){
		return  is_allowtalk;
	}
	/**
	* 会员是否有咨询和发送站内信的权限 1为开启 0为关闭
	*@param  is_allowtalk
	*/
	public void setIs_allowtalk(Integer is_allowtalk ){
		this.is_allowtalk = is_allowtalk;
	}
	
	/**
	* 会员是否有购买权限 1为开启 0为关闭
	*@return 
	*/
	public Integer getIs_buy(){
		return  is_buy;
	}
	/**
	* 会员是否有购买权限 1为开启 0为关闭
	*@param  is_buy
	*/
	public void setIs_buy(Integer is_buy ){
		this.is_buy = is_buy;
	}
	
	public Integer getIs_whole(){
		return  is_whole;
	}
	public void setIs_whole(Integer is_whole ){
		this.is_whole = is_whole;
	}
	
	/**
	* 地区ID
	*@return 
	*/
	public Integer getMember_areaid(){
		return  member_areaid;
	}
	/**
	* 地区ID
	*@param  member_areaid
	*/
	public void setMember_areaid(Integer member_areaid ){
		this.member_areaid = member_areaid;
	}
	
	/**
	* 城市ID
	*@return 
	*/
	public Integer getMember_cityid(){
		return  member_cityid;
	}
	/**
	* 城市ID
	*@param  member_cityid
	*/
	public void setMember_cityid(Integer member_cityid ){
		this.member_cityid = member_cityid;
	}
	
	/**
	* 0未绑定1已绑定
	*@return 
	*/
	public Integer getMember_email_bind(){
		return  member_email_bind;
	}
	/**
	* 0未绑定1已绑定
	*@param  member_email_bind
	*/
	public void setMember_email_bind(Integer member_email_bind ){
		this.member_email_bind = member_email_bind;
	}
	
	/**
	* 会员经验值
	*@return 
	*/
	public Integer getMember_exppoints(){
		return  member_exppoints;
	}
	/**
	* 会员经验值
	*@param  member_exppoints
	*/
	public void setMember_exppoints(Integer member_exppoints ){
		this.member_exppoints = member_exppoints;
	}
	
	/**
	* 登录次数
	*@return 
	*/
	public Integer getMember_login_num(){
		return  member_login_num;
	}
	/**
	* 登录次数
	*@param  member_login_num
	*/
	public void setMember_login_num(Integer member_login_num ){
		this.member_login_num = member_login_num;
	}
	
	/**
	* 0未绑定1已绑定
	*@return 
	*/
	public Integer getMember_mobile_bind(){
		return  member_mobile_bind;
	}
	/**
	* 0未绑定1已绑定
	*@param  member_mobile_bind
	*/
	public void setMember_mobile_bind(Integer member_mobile_bind ){
		this.member_mobile_bind = member_mobile_bind;
	}
	
	/**
	* 会员积分
	*@return 
	*/
	public Integer getMember_points(){
		return  member_points;
	}
	/**
	* 会员积分
	*@param  member_points
	*/
	public void setMember_points(Integer member_points ){
		this.member_points = member_points;
	}
	
	/**
	* 省份ID
	*@return 
	*/
	public Integer getMember_provinceid(){
		return  member_provinceid;
	}
	/**
	* 省份ID
	*@param  member_provinceid
	*/
	public void setMember_provinceid(Integer member_provinceid ){
		this.member_provinceid = member_provinceid;
	}
	
	/**
	* 会员性别
	*@return 
	*/
	public Integer getMember_sex(){
		return  member_sex;
	}
	/**
	* 会员性别
	*@param  member_sex
	*/
	public void setMember_sex(Integer member_sex ){
		this.member_sex = member_sex;
	}
	
	/**
	* sns空间访问次数
	*@return 
	*/
	public Integer getMember_snsvisitnum(){
		return  member_snsvisitnum;
	}
	/**
	* sns空间访问次数
	*@param  member_snsvisitnum
	*/
	public void setMember_snsvisitnum(Integer member_snsvisitnum ){
		this.member_snsvisitnum = member_snsvisitnum;
	}
	
	/**
	* 会员的开启状态 1为开启 0为关闭
	*@return 
	*/
	public Integer getMember_state(){
		return  member_state;
	}
	/**
	* 会员的开启状态 1为开启 0为关闭
	*@param  member_state
	*/
	public void setMember_state(Integer member_state ){
		this.member_state = member_state;
	}
	
	public Integer getProxy_id(){
		return  proxy_id;
	}
	public void setProxy_id(Integer proxy_id ){
		this.proxy_id = proxy_id;
	}
	
	/**
	* 预存款可用金额
	*@return 
	*/
	public BigDecimal getAvailable_predeposit(){
		return  available_predeposit;
	}
	/**
	* 预存款可用金额
	*@param  available_predeposit
	*/
	public void setAvailable_predeposit(BigDecimal available_predeposit ){
		this.available_predeposit = available_predeposit;
	}
	
	/**
	* 可用充值卡余额
	*@return 
	*/
	public BigDecimal getAvailable_rc_balance(){
		return  available_rc_balance;
	}
	/**
	* 可用充值卡余额
	*@param  available_rc_balance
	*/
	public void setAvailable_rc_balance(BigDecimal available_rc_balance ){
		this.available_rc_balance = available_rc_balance;
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
	public BigDecimal getFreeze_predeposit(){
		return  freeze_predeposit;
	}
	/**
	* 预存款冻结金额
	*@param  freeze_predeposit
	*/
	public void setFreeze_predeposit(BigDecimal freeze_predeposit ){
		this.freeze_predeposit = freeze_predeposit;
	}
	
	/**
	* 冻结充值卡余额
	*@return 
	*/
	public BigDecimal getFreeze_rc_balance(){
		return  freeze_rc_balance;
	}
	/**
	* 冻结充值卡余额
	*@param  freeze_rc_balance
	*/
	public void setFreeze_rc_balance(BigDecimal freeze_rc_balance ){
		this.freeze_rc_balance = freeze_rc_balance;
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
	public String getMember_areainfo(){
		return  member_areainfo;
	}
	/**
	* 地区内容
	*@param  member_areainfo
	*/
	public void setMember_areainfo(String member_areainfo ){
		this.member_areainfo = member_areainfo;
	}
	
	/**
	* 会员头像
	*@return 
	*/
	public String getMember_avatar(){
		return  member_avatar;
	}
	/**
	* 会员头像
	*@param  member_avatar
	*/
	public void setMember_avatar(String member_avatar ){
		this.member_avatar = member_avatar;
	}
	
	/**
	* 会员邮箱
	*@return 
	*/
	public String getMember_email(){
		return  member_email;
	}
	/**
	* 会员邮箱
	*@param  member_email
	*/
	public void setMember_email(String member_email ){
		this.member_email = member_email;
	}
	
	/**
	* 当前登录ip
	*@return 
	*/
	public String getMember_login_ip(){
		return  member_login_ip;
	}
	/**
	* 当前登录ip
	*@param  member_login_ip
	*/
	public void setMember_login_ip(String member_login_ip ){
		this.member_login_ip = member_login_ip;
	}
	
	/**
	* 当前登录时间
	*@return 
	*/
	public String getMember_login_time(){
		return  member_login_time;
	}
	/**
	* 当前登录时间
	*@param  member_login_time
	*/
	public void setMember_login_time(String member_login_time ){
		this.member_login_time = member_login_time;
	}
	
	/**
	* 手机号
	*@return 
	*/
	public String getMember_mobile(){
		return  member_mobile;
	}
	/**
	* 手机号
	*@param  member_mobile
	*/
	public void setMember_mobile(String member_mobile ){
		this.member_mobile = member_mobile;
	}
	
	/**
	* 会员名称
	*@return 
	*/
	public String getMember_name(){
		return  member_name;
	}
	/**
	* 会员名称
	*@param  member_name
	*/
	public void setMember_name(String member_name ){
		this.member_name = member_name;
	}
	
	/**
	* 上次登录ip
	*@return 
	*/
	public String getMember_old_login_ip(){
		return  member_old_login_ip;
	}
	/**
	* 上次登录ip
	*@param  member_old_login_ip
	*/
	public void setMember_old_login_ip(String member_old_login_ip ){
		this.member_old_login_ip = member_old_login_ip;
	}
	
	/**
	* 上次登录时间
	*@return 
	*/
	public String getMember_old_login_time(){
		return  member_old_login_time;
	}
	/**
	* 上次登录时间
	*@param  member_old_login_time
	*/
	public void setMember_old_login_time(String member_old_login_time ){
		this.member_old_login_time = member_old_login_time;
	}
	
	/**
	* 会员密码
	*@return 
	*/
	public String getMember_passwd(){
		return  member_passwd;
	}
	/**
	* 会员密码
	*@param  member_passwd
	*/
	public void setMember_passwd(String member_passwd ){
		this.member_passwd = member_passwd;
	}
	
	/**
	* 支付密码
	*@return 
	*/
	public String getMember_paypwd(){
		return  member_paypwd;
	}
	/**
	* 支付密码
	*@param  member_paypwd
	*/
	public void setMember_paypwd(String member_paypwd ){
		this.member_paypwd = member_paypwd;
	}
	
	/**
	* 隐私设定
	*@return 
	*/
	public String getMember_privacy(){
		return  member_privacy;
	}
	/**
	* 隐私设定
	*@param  member_privacy
	*/
	public void setMember_privacy(String member_privacy ){
		this.member_privacy = member_privacy;
	}
	
	/**
	* qq
	*@return 
	*/
	public String getMember_qq(){
		return  member_qq;
	}
	/**
	* qq
	*@param  member_qq
	*/
	public void setMember_qq(String member_qq ){
		this.member_qq = member_qq;
	}
	
	/**
	* qq账号相关信息
	*@return 
	*/
	public String getMember_qqinfo(){
		return  member_qqinfo;
	}
	/**
	* qq账号相关信息
	*@param  member_qqinfo
	*/
	public void setMember_qqinfo(String member_qqinfo ){
		this.member_qqinfo = member_qqinfo;
	}
	
	/**
	* qq互联id
	*@return 
	*/
	public String getMember_qqopenid(){
		return  member_qqopenid;
	}
	/**
	* qq互联id
	*@param  member_qqopenid
	*/
	public void setMember_qqopenid(String member_qqopenid ){
		this.member_qqopenid = member_qqopenid;
	}
	
	/**
	* 会员常用操作
	*@return 
	*/
	public String getMember_quicklink(){
		return  member_quicklink;
	}
	/**
	* 会员常用操作
	*@param  member_quicklink
	*/
	public void setMember_quicklink(String member_quicklink ){
		this.member_quicklink = member_quicklink;
	}
	
	/**
	* 新浪账号相关信息序列化值
	*@return 
	*/
	public String getMember_sinainfo(){
		return  member_sinainfo;
	}
	/**
	* 新浪账号相关信息序列化值
	*@param  member_sinainfo
	*/
	public void setMember_sinainfo(String member_sinainfo ){
		this.member_sinainfo = member_sinainfo;
	}
	
	/**
	* 新浪微博登录id
	*@return 
	*/
	public String getMember_sinaopenid(){
		return  member_sinaopenid;
	}
	/**
	* 新浪微博登录id
	*@param  member_sinaopenid
	*/
	public void setMember_sinaopenid(String member_sinaopenid ){
		this.member_sinaopenid = member_sinaopenid;
	}
	
	/**
	* 会员注册时间
	*@return 
	*/
	public String getMember_time(){
		return  member_time;
	}
	/**
	* 会员注册时间
	*@param  member_time
	*/
	public void setMember_time(String member_time ){
		this.member_time = member_time;
	}
	
	/**
	* 真实姓名
	*@return 
	*/
	public String getMember_truename(){
		return  member_truename;
	}
	/**
	* 真实姓名
	*@param  member_truename
	*/
	public void setMember_truename(String member_truename ){
		this.member_truename = member_truename;
	}
	
	/**
	* 阿里旺旺
	*@return 
	*/
	public String getMember_ww(){
		return  member_ww;
	}
	/**
	* 阿里旺旺
	*@param  member_ww
	*/
	public void setMember_ww(String member_ww ){
		this.member_ww = member_ww;
	}
	
	public String getMini_wechat_openid(){
		return  mini_wechat_openid;
	}
	public void setMini_wechat_openid(String mini_wechat_openid ){
		this.mini_wechat_openid = mini_wechat_openid;
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
	
	public String getWechat_openid(){
		return  wechat_openid;
	}
	public void setWechat_openid(String wechat_openid ){
		this.wechat_openid = wechat_openid;
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
	public Date getMember_birthday(){
		return  member_birthday;
	}
	/**
	* 生日
	*@param  member_birthday
	*/
	public void setMember_birthday(Date member_birthday ){
		this.member_birthday = member_birthday;
	}
	

}
