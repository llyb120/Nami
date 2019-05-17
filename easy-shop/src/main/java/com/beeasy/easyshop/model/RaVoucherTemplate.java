package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_voucher_template")
public class RaVoucherTemplate   {
	
	/*
	代金券模版编号
	*/
	private Integer voucherTId ;
	/*
	模版的创建时间
	*/
	private Integer voucherTAddDate ;
	/*
	代金券模版的创建者id
	*/
	private Integer voucherTCreatorId ;
	/*
	每人限领张数
	*/
	private Integer voucherTEachlimit ;
	/*
	代金券模版有效期结束时间
	*/
	private Integer voucherTEndDate ;
	/*
	模版已发放的代金券数量
	*/
	private Integer voucherTGiveout ;
	/*
	兑换所需积分
	*/
	private Integer voucherTPoints ;
	/*
	代金券模版面额
	*/
	private Integer voucherTPrice ;
	/*
	套餐编号
	*/
	private Integer voucherTQuotaid ;
	/*
	是否推荐 0不推荐 1推荐
	*/
	private Integer voucherTRecommend ;
	/*
	所属店铺分类ID
	*/
	private Integer voucherTScId ;
	/*
	代金券模版有效期开始时间
	*/
	private Integer voucherTStartDate ;
	/*
	代金券模版状态(1-有效,2-失效)
	*/
	private Integer voucherTState ;
	/*
	代金券模版的店铺id
	*/
	private Integer voucherTStoreId ;
	/*
	模版可发放的代金券总数
	*/
	private Integer voucherTTotal ;
	/*
	模版已经使用过的代金券
	*/
	private Integer voucherTUsed ;
	/*
	自定义代金券模板图片
	*/
	private String voucherTCustomimg ;
	/*
	代金券模版描述
	*/
	private String voucherTDesc ;
	/*
	代金券使用时的订单限额
	*/
	private BigDecimal voucherTLimit ;
	/*
	店铺名称
	*/
	private String voucherTStorename ;
	/*
	样式模版图片
	*/
	private String voucherTStyleimg ;
	/*
	代金券模版名称
	*/
	private String voucherTTitle ;
	
	public RaVoucherTemplate() {
	}
	
	/**
	* 代金券模版编号
	*@return 
	*/
	public Integer getVoucherTId(){
		return  voucherTId;
	}
	/**
	* 代金券模版编号
	*@param  voucherTId
	*/
	public void setVoucherTId(Integer voucherTId ){
		this.voucherTId = voucherTId;
	}
	
	/**
	* 模版的创建时间
	*@return 
	*/
	public Integer getVoucherTAddDate(){
		return  voucherTAddDate;
	}
	/**
	* 模版的创建时间
	*@param  voucherTAddDate
	*/
	public void setVoucherTAddDate(Integer voucherTAddDate ){
		this.voucherTAddDate = voucherTAddDate;
	}
	
	/**
	* 代金券模版的创建者id
	*@return 
	*/
	public Integer getVoucherTCreatorId(){
		return  voucherTCreatorId;
	}
	/**
	* 代金券模版的创建者id
	*@param  voucherTCreatorId
	*/
	public void setVoucherTCreatorId(Integer voucherTCreatorId ){
		this.voucherTCreatorId = voucherTCreatorId;
	}
	
	/**
	* 每人限领张数
	*@return 
	*/
	public Integer getVoucherTEachlimit(){
		return  voucherTEachlimit;
	}
	/**
	* 每人限领张数
	*@param  voucherTEachlimit
	*/
	public void setVoucherTEachlimit(Integer voucherTEachlimit ){
		this.voucherTEachlimit = voucherTEachlimit;
	}
	
	/**
	* 代金券模版有效期结束时间
	*@return 
	*/
	public Integer getVoucherTEndDate(){
		return  voucherTEndDate;
	}
	/**
	* 代金券模版有效期结束时间
	*@param  voucherTEndDate
	*/
	public void setVoucherTEndDate(Integer voucherTEndDate ){
		this.voucherTEndDate = voucherTEndDate;
	}
	
	/**
	* 模版已发放的代金券数量
	*@return 
	*/
	public Integer getVoucherTGiveout(){
		return  voucherTGiveout;
	}
	/**
	* 模版已发放的代金券数量
	*@param  voucherTGiveout
	*/
	public void setVoucherTGiveout(Integer voucherTGiveout ){
		this.voucherTGiveout = voucherTGiveout;
	}
	
	/**
	* 兑换所需积分
	*@return 
	*/
	public Integer getVoucherTPoints(){
		return  voucherTPoints;
	}
	/**
	* 兑换所需积分
	*@param  voucherTPoints
	*/
	public void setVoucherTPoints(Integer voucherTPoints ){
		this.voucherTPoints = voucherTPoints;
	}
	
	/**
	* 代金券模版面额
	*@return 
	*/
	public Integer getVoucherTPrice(){
		return  voucherTPrice;
	}
	/**
	* 代金券模版面额
	*@param  voucherTPrice
	*/
	public void setVoucherTPrice(Integer voucherTPrice ){
		this.voucherTPrice = voucherTPrice;
	}
	
	/**
	* 套餐编号
	*@return 
	*/
	public Integer getVoucherTQuotaid(){
		return  voucherTQuotaid;
	}
	/**
	* 套餐编号
	*@param  voucherTQuotaid
	*/
	public void setVoucherTQuotaid(Integer voucherTQuotaid ){
		this.voucherTQuotaid = voucherTQuotaid;
	}
	
	/**
	* 是否推荐 0不推荐 1推荐
	*@return 
	*/
	public Integer getVoucherTRecommend(){
		return  voucherTRecommend;
	}
	/**
	* 是否推荐 0不推荐 1推荐
	*@param  voucherTRecommend
	*/
	public void setVoucherTRecommend(Integer voucherTRecommend ){
		this.voucherTRecommend = voucherTRecommend;
	}
	
	/**
	* 所属店铺分类ID
	*@return 
	*/
	public Integer getVoucherTScId(){
		return  voucherTScId;
	}
	/**
	* 所属店铺分类ID
	*@param  voucherTScId
	*/
	public void setVoucherTScId(Integer voucherTScId ){
		this.voucherTScId = voucherTScId;
	}
	
	/**
	* 代金券模版有效期开始时间
	*@return 
	*/
	public Integer getVoucherTStartDate(){
		return  voucherTStartDate;
	}
	/**
	* 代金券模版有效期开始时间
	*@param  voucherTStartDate
	*/
	public void setVoucherTStartDate(Integer voucherTStartDate ){
		this.voucherTStartDate = voucherTStartDate;
	}
	
	/**
	* 代金券模版状态(1-有效,2-失效)
	*@return 
	*/
	public Integer getVoucherTState(){
		return  voucherTState;
	}
	/**
	* 代金券模版状态(1-有效,2-失效)
	*@param  voucherTState
	*/
	public void setVoucherTState(Integer voucherTState ){
		this.voucherTState = voucherTState;
	}
	
	/**
	* 代金券模版的店铺id
	*@return 
	*/
	public Integer getVoucherTStoreId(){
		return  voucherTStoreId;
	}
	/**
	* 代金券模版的店铺id
	*@param  voucherTStoreId
	*/
	public void setVoucherTStoreId(Integer voucherTStoreId ){
		this.voucherTStoreId = voucherTStoreId;
	}
	
	/**
	* 模版可发放的代金券总数
	*@return 
	*/
	public Integer getVoucherTTotal(){
		return  voucherTTotal;
	}
	/**
	* 模版可发放的代金券总数
	*@param  voucherTTotal
	*/
	public void setVoucherTTotal(Integer voucherTTotal ){
		this.voucherTTotal = voucherTTotal;
	}
	
	/**
	* 模版已经使用过的代金券
	*@return 
	*/
	public Integer getVoucherTUsed(){
		return  voucherTUsed;
	}
	/**
	* 模版已经使用过的代金券
	*@param  voucherTUsed
	*/
	public void setVoucherTUsed(Integer voucherTUsed ){
		this.voucherTUsed = voucherTUsed;
	}
	
	/**
	* 自定义代金券模板图片
	*@return 
	*/
	public String getVoucherTCustomimg(){
		return  voucherTCustomimg;
	}
	/**
	* 自定义代金券模板图片
	*@param  voucherTCustomimg
	*/
	public void setVoucherTCustomimg(String voucherTCustomimg ){
		this.voucherTCustomimg = voucherTCustomimg;
	}
	
	/**
	* 代金券模版描述
	*@return 
	*/
	public String getVoucherTDesc(){
		return  voucherTDesc;
	}
	/**
	* 代金券模版描述
	*@param  voucherTDesc
	*/
	public void setVoucherTDesc(String voucherTDesc ){
		this.voucherTDesc = voucherTDesc;
	}
	
	/**
	* 代金券使用时的订单限额
	*@return 
	*/
	public BigDecimal getVoucherTLimit(){
		return  voucherTLimit;
	}
	/**
	* 代金券使用时的订单限额
	*@param  voucherTLimit
	*/
	public void setVoucherTLimit(BigDecimal voucherTLimit ){
		this.voucherTLimit = voucherTLimit;
	}
	
	/**
	* 店铺名称
	*@return 
	*/
	public String getVoucherTStorename(){
		return  voucherTStorename;
	}
	/**
	* 店铺名称
	*@param  voucherTStorename
	*/
	public void setVoucherTStorename(String voucherTStorename ){
		this.voucherTStorename = voucherTStorename;
	}
	
	/**
	* 样式模版图片
	*@return 
	*/
	public String getVoucherTStyleimg(){
		return  voucherTStyleimg;
	}
	/**
	* 样式模版图片
	*@param  voucherTStyleimg
	*/
	public void setVoucherTStyleimg(String voucherTStyleimg ){
		this.voucherTStyleimg = voucherTStyleimg;
	}
	
	/**
	* 代金券模版名称
	*@return 
	*/
	public String getVoucherTTitle(){
		return  voucherTTitle;
	}
	/**
	* 代金券模版名称
	*@param  voucherTTitle
	*/
	public void setVoucherTTitle(String voucherTTitle ){
		this.voucherTTitle = voucherTTitle;
	}
	

}
