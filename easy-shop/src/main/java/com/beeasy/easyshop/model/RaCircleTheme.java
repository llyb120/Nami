package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_circle_theme")
public class RaCircleTheme   {
	
	// alias
	public static final String ALIAS_theme_id = "theme_id";
	public static final String ALIAS_circle_id = "circle_id";
	public static final String ALIAS_has_affix = "has_affix";
	public static final String ALIAS_has_goods = "has_goods";
	public static final String ALIAS_is_closed = "is_closed";
	public static final String ALIAS_is_digest = "is_digest";
	public static final String ALIAS_is_identity = "is_identity";
	public static final String ALIAS_is_recommend = "is_recommend";
	public static final String ALIAS_is_shut = "is_shut";
	public static final String ALIAS_is_stick = "is_stick";
	public static final String ALIAS_lastspeak_id = "lastspeak_id";
	public static final String ALIAS_member_id = "member_id";
	public static final String ALIAS_thclass_id = "thclass_id";
	public static final String ALIAS_theme_browsecount = "theme_browsecount";
	public static final String ALIAS_theme_commentcount = "theme_commentcount";
	public static final String ALIAS_theme_exp = "theme_exp";
	public static final String ALIAS_theme_likecount = "theme_likecount";
	public static final String ALIAS_theme_readperm = "theme_readperm";
	public static final String ALIAS_theme_sharecount = "theme_sharecount";
	public static final String ALIAS_theme_special = "theme_special";
	public static final String ALIAS_circle_name = "circle_name";
	public static final String ALIAS_lastspeak_name = "lastspeak_name";
	public static final String ALIAS_lastspeak_time = "lastspeak_time";
	public static final String ALIAS_member_name = "member_name";
	public static final String ALIAS_thclass_name = "thclass_name";
	public static final String ALIAS_theme_addtime = "theme_addtime";
	public static final String ALIAS_theme_content = "theme_content";
	public static final String ALIAS_theme_editname = "theme_editname";
	public static final String ALIAS_theme_edittime = "theme_edittime";
	public static final String ALIAS_theme_name = "theme_name";
	
	/*
	主题id
	*/
	private Integer theme_id ;
	/*
	圈子id
	*/
	private Integer circle_id ;
	/*
	附件标记 1是 0 否
	*/
	private Integer has_affix ;
	/*
	商品标记 1是 0否
	*/
	private Integer has_goods ;
	/*
	屏蔽 1是 0否
	*/
	private Integer is_closed ;
	/*
	是否加精 1是 0否
	*/
	private Integer is_digest ;
	/*
	1圈主 2管理 3成员
	*/
	private Integer is_identity ;
	/*
	是否推荐 1是 0否
	*/
	private Integer is_recommend ;
	/*
	主题是否关闭 1是 0否
	*/
	private Integer is_shut ;
	/*
	是否置顶 1是  0否
	*/
	private Integer is_stick ;
	/*
	最后发言人id
	*/
	private Integer lastspeak_id ;
	/*
	会员id
	*/
	private Integer member_id ;
	/*
	主题分类id
	*/
	private Integer thclass_id ;
	/*
	浏览数量
	*/
	private Integer theme_browsecount ;
	/*
	评论数量
	*/
	private Integer theme_commentcount ;
	/*
	获得经验
	*/
	private Integer theme_exp ;
	/*
	喜欢数量
	*/
	private Integer theme_likecount ;
	/*
	阅读权限
	*/
	private Integer theme_readperm ;
	/*
	分享数量
	*/
	private Integer theme_sharecount ;
	/*
	特殊话题 0普通 1投票
	*/
	private Integer theme_special ;
	/*
	圈子名称
	*/
	private String circle_name ;
	/*
	最后发言人名称
	*/
	private String lastspeak_name ;
	/*
	最后发言时间
	*/
	private String lastspeak_time ;
	/*
	会员名称
	*/
	private String member_name ;
	/*
	主题分类名称
	*/
	private String thclass_name ;
	/*
	主题发表时间
	*/
	private String theme_addtime ;
	/*
	主题内容
	*/
	private String theme_content ;
	/*
	编辑人名称
	*/
	private String theme_editname ;
	/*
	主题编辑时间
	*/
	private String theme_edittime ;
	/*
	主题名称
	*/
	private String theme_name ;
	
	public RaCircleTheme() {
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
	* 附件标记 1是 0 否
	*@return 
	*/
	public Integer getHas_affix(){
		return  has_affix;
	}
	/**
	* 附件标记 1是 0 否
	*@param  has_affix
	*/
	public void setHas_affix(Integer has_affix ){
		this.has_affix = has_affix;
	}
	
	/**
	* 商品标记 1是 0否
	*@return 
	*/
	public Integer getHas_goods(){
		return  has_goods;
	}
	/**
	* 商品标记 1是 0否
	*@param  has_goods
	*/
	public void setHas_goods(Integer has_goods ){
		this.has_goods = has_goods;
	}
	
	/**
	* 屏蔽 1是 0否
	*@return 
	*/
	public Integer getIs_closed(){
		return  is_closed;
	}
	/**
	* 屏蔽 1是 0否
	*@param  is_closed
	*/
	public void setIs_closed(Integer is_closed ){
		this.is_closed = is_closed;
	}
	
	/**
	* 是否加精 1是 0否
	*@return 
	*/
	public Integer getIs_digest(){
		return  is_digest;
	}
	/**
	* 是否加精 1是 0否
	*@param  is_digest
	*/
	public void setIs_digest(Integer is_digest ){
		this.is_digest = is_digest;
	}
	
	/**
	* 1圈主 2管理 3成员
	*@return 
	*/
	public Integer getIs_identity(){
		return  is_identity;
	}
	/**
	* 1圈主 2管理 3成员
	*@param  is_identity
	*/
	public void setIs_identity(Integer is_identity ){
		this.is_identity = is_identity;
	}
	
	/**
	* 是否推荐 1是 0否
	*@return 
	*/
	public Integer getIs_recommend(){
		return  is_recommend;
	}
	/**
	* 是否推荐 1是 0否
	*@param  is_recommend
	*/
	public void setIs_recommend(Integer is_recommend ){
		this.is_recommend = is_recommend;
	}
	
	/**
	* 主题是否关闭 1是 0否
	*@return 
	*/
	public Integer getIs_shut(){
		return  is_shut;
	}
	/**
	* 主题是否关闭 1是 0否
	*@param  is_shut
	*/
	public void setIs_shut(Integer is_shut ){
		this.is_shut = is_shut;
	}
	
	/**
	* 是否置顶 1是  0否
	*@return 
	*/
	public Integer getIs_stick(){
		return  is_stick;
	}
	/**
	* 是否置顶 1是  0否
	*@param  is_stick
	*/
	public void setIs_stick(Integer is_stick ){
		this.is_stick = is_stick;
	}
	
	/**
	* 最后发言人id
	*@return 
	*/
	public Integer getLastspeak_id(){
		return  lastspeak_id;
	}
	/**
	* 最后发言人id
	*@param  lastspeak_id
	*/
	public void setLastspeak_id(Integer lastspeak_id ){
		this.lastspeak_id = lastspeak_id;
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
	* 主题分类id
	*@return 
	*/
	public Integer getThclass_id(){
		return  thclass_id;
	}
	/**
	* 主题分类id
	*@param  thclass_id
	*/
	public void setThclass_id(Integer thclass_id ){
		this.thclass_id = thclass_id;
	}
	
	/**
	* 浏览数量
	*@return 
	*/
	public Integer getTheme_browsecount(){
		return  theme_browsecount;
	}
	/**
	* 浏览数量
	*@param  theme_browsecount
	*/
	public void setTheme_browsecount(Integer theme_browsecount ){
		this.theme_browsecount = theme_browsecount;
	}
	
	/**
	* 评论数量
	*@return 
	*/
	public Integer getTheme_commentcount(){
		return  theme_commentcount;
	}
	/**
	* 评论数量
	*@param  theme_commentcount
	*/
	public void setTheme_commentcount(Integer theme_commentcount ){
		this.theme_commentcount = theme_commentcount;
	}
	
	/**
	* 获得经验
	*@return 
	*/
	public Integer getTheme_exp(){
		return  theme_exp;
	}
	/**
	* 获得经验
	*@param  theme_exp
	*/
	public void setTheme_exp(Integer theme_exp ){
		this.theme_exp = theme_exp;
	}
	
	/**
	* 喜欢数量
	*@return 
	*/
	public Integer getTheme_likecount(){
		return  theme_likecount;
	}
	/**
	* 喜欢数量
	*@param  theme_likecount
	*/
	public void setTheme_likecount(Integer theme_likecount ){
		this.theme_likecount = theme_likecount;
	}
	
	/**
	* 阅读权限
	*@return 
	*/
	public Integer getTheme_readperm(){
		return  theme_readperm;
	}
	/**
	* 阅读权限
	*@param  theme_readperm
	*/
	public void setTheme_readperm(Integer theme_readperm ){
		this.theme_readperm = theme_readperm;
	}
	
	/**
	* 分享数量
	*@return 
	*/
	public Integer getTheme_sharecount(){
		return  theme_sharecount;
	}
	/**
	* 分享数量
	*@param  theme_sharecount
	*/
	public void setTheme_sharecount(Integer theme_sharecount ){
		this.theme_sharecount = theme_sharecount;
	}
	
	/**
	* 特殊话题 0普通 1投票
	*@return 
	*/
	public Integer getTheme_special(){
		return  theme_special;
	}
	/**
	* 特殊话题 0普通 1投票
	*@param  theme_special
	*/
	public void setTheme_special(Integer theme_special ){
		this.theme_special = theme_special;
	}
	
	/**
	* 圈子名称
	*@return 
	*/
	public String getCircle_name(){
		return  circle_name;
	}
	/**
	* 圈子名称
	*@param  circle_name
	*/
	public void setCircle_name(String circle_name ){
		this.circle_name = circle_name;
	}
	
	/**
	* 最后发言人名称
	*@return 
	*/
	public String getLastspeak_name(){
		return  lastspeak_name;
	}
	/**
	* 最后发言人名称
	*@param  lastspeak_name
	*/
	public void setLastspeak_name(String lastspeak_name ){
		this.lastspeak_name = lastspeak_name;
	}
	
	/**
	* 最后发言时间
	*@return 
	*/
	public String getLastspeak_time(){
		return  lastspeak_time;
	}
	/**
	* 最后发言时间
	*@param  lastspeak_time
	*/
	public void setLastspeak_time(String lastspeak_time ){
		this.lastspeak_time = lastspeak_time;
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
	* 主题分类名称
	*@return 
	*/
	public String getThclass_name(){
		return  thclass_name;
	}
	/**
	* 主题分类名称
	*@param  thclass_name
	*/
	public void setThclass_name(String thclass_name ){
		this.thclass_name = thclass_name;
	}
	
	/**
	* 主题发表时间
	*@return 
	*/
	public String getTheme_addtime(){
		return  theme_addtime;
	}
	/**
	* 主题发表时间
	*@param  theme_addtime
	*/
	public void setTheme_addtime(String theme_addtime ){
		this.theme_addtime = theme_addtime;
	}
	
	/**
	* 主题内容
	*@return 
	*/
	public String getTheme_content(){
		return  theme_content;
	}
	/**
	* 主题内容
	*@param  theme_content
	*/
	public void setTheme_content(String theme_content ){
		this.theme_content = theme_content;
	}
	
	/**
	* 编辑人名称
	*@return 
	*/
	public String getTheme_editname(){
		return  theme_editname;
	}
	/**
	* 编辑人名称
	*@param  theme_editname
	*/
	public void setTheme_editname(String theme_editname ){
		this.theme_editname = theme_editname;
	}
	
	/**
	* 主题编辑时间
	*@return 
	*/
	public String getTheme_edittime(){
		return  theme_edittime;
	}
	/**
	* 主题编辑时间
	*@param  theme_edittime
	*/
	public void setTheme_edittime(String theme_edittime ){
		this.theme_edittime = theme_edittime;
	}
	
	/**
	* 主题名称
	*@return 
	*/
	public String getTheme_name(){
		return  theme_name;
	}
	/**
	* 主题名称
	*@param  theme_name
	*/
	public void setTheme_name(String theme_name ){
		this.theme_name = theme_name;
	}
	

}
