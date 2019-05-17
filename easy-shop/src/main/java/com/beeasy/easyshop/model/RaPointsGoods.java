package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_points_goods")
public class RaPointsGoods   {
	
	/*
	积分礼品索引id
	*/
	private Integer pgoodsId ;
	/*
	积分礼品添加时间
	*/
	private Integer pgoodsAddTime ;
	/*
	积分礼品推荐
	*/
	private Integer pgoodsCommend ;
	/*
	兑换结束时间
	*/
	private Integer pgoodsEndtime ;
	/*
	是否限制每会员兑换数量
	*/
	private Integer pgoodsIslimit ;
	/*
	是否限制兑换时间 0为不限制 1为限制
	*/
	private Integer pgoodsIslimittime ;
	/*
	限制参与兑换的会员级别
	*/
	private Integer pgoodsLimitmgrade ;
	/*
	每会员限制兑换数量
	*/
	private Integer pgoodsLimitnum ;
	/*
	积分礼品兑换所需积分
	*/
	private Integer pgoodsPoints ;
	/*
	积分礼品售出数量
	*/
	private Integer pgoodsSalenum ;
	/*
	积分礼品上架 0表示下架 1表示上架
	*/
	private Integer pgoodsShow ;
	/*
	礼品排序
	*/
	private Integer pgoodsSort ;
	/*
	兑换开始时间
	*/
	private Integer pgoodsStarttime ;
	/*
	积分礼品状态，0开启，1禁售
	*/
	private Integer pgoodsState ;
	/*
	积分礼品库存数
	*/
	private Integer pgoodsStorage ;
	/*
	积分商品浏览次数
	*/
	private Integer pgoodsView ;
	/*
	积分礼品详细内容
	*/
	private String pgoodsBody ;
	/*
	积分礼品禁售原因
	*/
	private String pgoodsCloseReason ;
	/*
	积分礼品描述
	*/
	private String pgoodsDescription ;
	/*
	积分礼品默认封面图片
	*/
	private String pgoodsImage ;
	/*
	积分礼品关键字
	*/
	private String pgoodsKeywords ;
	/*
	积分礼品名称
	*/
	private String pgoodsName ;
	/*
	积分礼品原价
	*/
	private BigDecimal pgoodsPrice ;
	/*
	积分礼品货号
	*/
	private String pgoodsSerial ;
	/*
	积分礼品标签
	*/
	private String pgoodsTag ;
	
	public RaPointsGoods() {
	}
	
	/**
	* 积分礼品索引id
	*@return 
	*/
	public Integer getPgoodsId(){
		return  pgoodsId;
	}
	/**
	* 积分礼品索引id
	*@param  pgoodsId
	*/
	public void setPgoodsId(Integer pgoodsId ){
		this.pgoodsId = pgoodsId;
	}
	
	/**
	* 积分礼品添加时间
	*@return 
	*/
	public Integer getPgoodsAddTime(){
		return  pgoodsAddTime;
	}
	/**
	* 积分礼品添加时间
	*@param  pgoodsAddTime
	*/
	public void setPgoodsAddTime(Integer pgoodsAddTime ){
		this.pgoodsAddTime = pgoodsAddTime;
	}
	
	/**
	* 积分礼品推荐
	*@return 
	*/
	public Integer getPgoodsCommend(){
		return  pgoodsCommend;
	}
	/**
	* 积分礼品推荐
	*@param  pgoodsCommend
	*/
	public void setPgoodsCommend(Integer pgoodsCommend ){
		this.pgoodsCommend = pgoodsCommend;
	}
	
	/**
	* 兑换结束时间
	*@return 
	*/
	public Integer getPgoodsEndtime(){
		return  pgoodsEndtime;
	}
	/**
	* 兑换结束时间
	*@param  pgoodsEndtime
	*/
	public void setPgoodsEndtime(Integer pgoodsEndtime ){
		this.pgoodsEndtime = pgoodsEndtime;
	}
	
	/**
	* 是否限制每会员兑换数量
	*@return 
	*/
	public Integer getPgoodsIslimit(){
		return  pgoodsIslimit;
	}
	/**
	* 是否限制每会员兑换数量
	*@param  pgoodsIslimit
	*/
	public void setPgoodsIslimit(Integer pgoodsIslimit ){
		this.pgoodsIslimit = pgoodsIslimit;
	}
	
	/**
	* 是否限制兑换时间 0为不限制 1为限制
	*@return 
	*/
	public Integer getPgoodsIslimittime(){
		return  pgoodsIslimittime;
	}
	/**
	* 是否限制兑换时间 0为不限制 1为限制
	*@param  pgoodsIslimittime
	*/
	public void setPgoodsIslimittime(Integer pgoodsIslimittime ){
		this.pgoodsIslimittime = pgoodsIslimittime;
	}
	
	/**
	* 限制参与兑换的会员级别
	*@return 
	*/
	public Integer getPgoodsLimitmgrade(){
		return  pgoodsLimitmgrade;
	}
	/**
	* 限制参与兑换的会员级别
	*@param  pgoodsLimitmgrade
	*/
	public void setPgoodsLimitmgrade(Integer pgoodsLimitmgrade ){
		this.pgoodsLimitmgrade = pgoodsLimitmgrade;
	}
	
	/**
	* 每会员限制兑换数量
	*@return 
	*/
	public Integer getPgoodsLimitnum(){
		return  pgoodsLimitnum;
	}
	/**
	* 每会员限制兑换数量
	*@param  pgoodsLimitnum
	*/
	public void setPgoodsLimitnum(Integer pgoodsLimitnum ){
		this.pgoodsLimitnum = pgoodsLimitnum;
	}
	
	/**
	* 积分礼品兑换所需积分
	*@return 
	*/
	public Integer getPgoodsPoints(){
		return  pgoodsPoints;
	}
	/**
	* 积分礼品兑换所需积分
	*@param  pgoodsPoints
	*/
	public void setPgoodsPoints(Integer pgoodsPoints ){
		this.pgoodsPoints = pgoodsPoints;
	}
	
	/**
	* 积分礼品售出数量
	*@return 
	*/
	public Integer getPgoodsSalenum(){
		return  pgoodsSalenum;
	}
	/**
	* 积分礼品售出数量
	*@param  pgoodsSalenum
	*/
	public void setPgoodsSalenum(Integer pgoodsSalenum ){
		this.pgoodsSalenum = pgoodsSalenum;
	}
	
	/**
	* 积分礼品上架 0表示下架 1表示上架
	*@return 
	*/
	public Integer getPgoodsShow(){
		return  pgoodsShow;
	}
	/**
	* 积分礼品上架 0表示下架 1表示上架
	*@param  pgoodsShow
	*/
	public void setPgoodsShow(Integer pgoodsShow ){
		this.pgoodsShow = pgoodsShow;
	}
	
	/**
	* 礼品排序
	*@return 
	*/
	public Integer getPgoodsSort(){
		return  pgoodsSort;
	}
	/**
	* 礼品排序
	*@param  pgoodsSort
	*/
	public void setPgoodsSort(Integer pgoodsSort ){
		this.pgoodsSort = pgoodsSort;
	}
	
	/**
	* 兑换开始时间
	*@return 
	*/
	public Integer getPgoodsStarttime(){
		return  pgoodsStarttime;
	}
	/**
	* 兑换开始时间
	*@param  pgoodsStarttime
	*/
	public void setPgoodsStarttime(Integer pgoodsStarttime ){
		this.pgoodsStarttime = pgoodsStarttime;
	}
	
	/**
	* 积分礼品状态，0开启，1禁售
	*@return 
	*/
	public Integer getPgoodsState(){
		return  pgoodsState;
	}
	/**
	* 积分礼品状态，0开启，1禁售
	*@param  pgoodsState
	*/
	public void setPgoodsState(Integer pgoodsState ){
		this.pgoodsState = pgoodsState;
	}
	
	/**
	* 积分礼品库存数
	*@return 
	*/
	public Integer getPgoodsStorage(){
		return  pgoodsStorage;
	}
	/**
	* 积分礼品库存数
	*@param  pgoodsStorage
	*/
	public void setPgoodsStorage(Integer pgoodsStorage ){
		this.pgoodsStorage = pgoodsStorage;
	}
	
	/**
	* 积分商品浏览次数
	*@return 
	*/
	public Integer getPgoodsView(){
		return  pgoodsView;
	}
	/**
	* 积分商品浏览次数
	*@param  pgoodsView
	*/
	public void setPgoodsView(Integer pgoodsView ){
		this.pgoodsView = pgoodsView;
	}
	
	/**
	* 积分礼品详细内容
	*@return 
	*/
	public String getPgoodsBody(){
		return  pgoodsBody;
	}
	/**
	* 积分礼品详细内容
	*@param  pgoodsBody
	*/
	public void setPgoodsBody(String pgoodsBody ){
		this.pgoodsBody = pgoodsBody;
	}
	
	/**
	* 积分礼品禁售原因
	*@return 
	*/
	public String getPgoodsCloseReason(){
		return  pgoodsCloseReason;
	}
	/**
	* 积分礼品禁售原因
	*@param  pgoodsCloseReason
	*/
	public void setPgoodsCloseReason(String pgoodsCloseReason ){
		this.pgoodsCloseReason = pgoodsCloseReason;
	}
	
	/**
	* 积分礼品描述
	*@return 
	*/
	public String getPgoodsDescription(){
		return  pgoodsDescription;
	}
	/**
	* 积分礼品描述
	*@param  pgoodsDescription
	*/
	public void setPgoodsDescription(String pgoodsDescription ){
		this.pgoodsDescription = pgoodsDescription;
	}
	
	/**
	* 积分礼品默认封面图片
	*@return 
	*/
	public String getPgoodsImage(){
		return  pgoodsImage;
	}
	/**
	* 积分礼品默认封面图片
	*@param  pgoodsImage
	*/
	public void setPgoodsImage(String pgoodsImage ){
		this.pgoodsImage = pgoodsImage;
	}
	
	/**
	* 积分礼品关键字
	*@return 
	*/
	public String getPgoodsKeywords(){
		return  pgoodsKeywords;
	}
	/**
	* 积分礼品关键字
	*@param  pgoodsKeywords
	*/
	public void setPgoodsKeywords(String pgoodsKeywords ){
		this.pgoodsKeywords = pgoodsKeywords;
	}
	
	/**
	* 积分礼品名称
	*@return 
	*/
	public String getPgoodsName(){
		return  pgoodsName;
	}
	/**
	* 积分礼品名称
	*@param  pgoodsName
	*/
	public void setPgoodsName(String pgoodsName ){
		this.pgoodsName = pgoodsName;
	}
	
	/**
	* 积分礼品原价
	*@return 
	*/
	public BigDecimal getPgoodsPrice(){
		return  pgoodsPrice;
	}
	/**
	* 积分礼品原价
	*@param  pgoodsPrice
	*/
	public void setPgoodsPrice(BigDecimal pgoodsPrice ){
		this.pgoodsPrice = pgoodsPrice;
	}
	
	/**
	* 积分礼品货号
	*@return 
	*/
	public String getPgoodsSerial(){
		return  pgoodsSerial;
	}
	/**
	* 积分礼品货号
	*@param  pgoodsSerial
	*/
	public void setPgoodsSerial(String pgoodsSerial ){
		this.pgoodsSerial = pgoodsSerial;
	}
	
	/**
	* 积分礼品标签
	*@return 
	*/
	public String getPgoodsTag(){
		return  pgoodsTag;
	}
	/**
	* 积分礼品标签
	*@param  pgoodsTag
	*/
	public void setPgoodsTag(String pgoodsTag ){
		this.pgoodsTag = pgoodsTag;
	}
	

}
