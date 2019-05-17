package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_groupbuy")
public class RaGroupbuy   {
	
	/*
	团购ID
	*/
	private Integer groupbuyId ;
	/*
	购买数量
	*/
	private Integer buyQuantity ;
	/*
	已购买人数
	*/
	private Integer buyerCount ;
	/*
	团购类别编号
	*/
	private Integer classId ;
	/*
	结束时间
	*/
	private Integer endTime ;
	/*
	商品公共表ID
	*/
	private Integer goodsCommonid ;
	/*
	商品ID
	*/
	private Integer goodsId ;
	/*
	是否虚拟团购 1是0否
	*/
	private Integer isVr ;
	/*
	是否推荐 0.未推荐 1.已推荐
	*/
	private Integer recommended ;
	/*
	团购2级分类id
	*/
	private Integer sClassId ;
	/*
	开始时间
	*/
	private Integer startTime ;
	/*
	团购状态 10-审核中 20-正常 30-审核失败 31-管理员关闭 32-已结束
	*/
	private Integer state ;
	/*
	店铺ID
	*/
	private Integer storeId ;
	/*
	购买上限
	*/
	private Integer upperLimit ;
	/*
	查看次数
	*/
	private Integer views ;
	/*
	虚拟购买数量
	*/
	private Integer virtualQuantity ;
	/*
	虚拟团购区域id
	*/
	private Integer vrAreaId ;
	/*
	虚拟团购城市id
	*/
	private Integer vrCityId ;
	/*
	虚拟团购大分类id
	*/
	private Integer vrClassId ;
	/*
	虚拟团购商区id
	*/
	private Integer vrMallId ;
	/*
	虚拟团购小分类id
	*/
	private Integer vrSClassId ;
	/*
	商品名称
	*/
	private String goodsName ;
	/*
	商品原价
	*/
	private BigDecimal goodsPrice ;
	/*
	团购图片
	*/
	private String groupbuyImage ;
	/*
	团购图片1
	*/
	private String groupbuyImage1 ;
	/*
	本团介绍
	*/
	private String groupbuyIntro ;
	/*
	活动名称
	*/
	private String groupbuyName ;
	/*
	团购价格
	*/
	private BigDecimal groupbuyPrice ;
	/*
	折扣
	*/
	private BigDecimal groupbuyRebate ;
	/*
	备注
	*/
	private String remark ;
	/*
	店铺名称
	*/
	private String storeName ;
	
	public RaGroupbuy() {
	}
	
	/**
	* 团购ID
	*@return 
	*/
	public Integer getGroupbuyId(){
		return  groupbuyId;
	}
	/**
	* 团购ID
	*@param  groupbuyId
	*/
	public void setGroupbuyId(Integer groupbuyId ){
		this.groupbuyId = groupbuyId;
	}
	
	/**
	* 购买数量
	*@return 
	*/
	public Integer getBuyQuantity(){
		return  buyQuantity;
	}
	/**
	* 购买数量
	*@param  buyQuantity
	*/
	public void setBuyQuantity(Integer buyQuantity ){
		this.buyQuantity = buyQuantity;
	}
	
	/**
	* 已购买人数
	*@return 
	*/
	public Integer getBuyerCount(){
		return  buyerCount;
	}
	/**
	* 已购买人数
	*@param  buyerCount
	*/
	public void setBuyerCount(Integer buyerCount ){
		this.buyerCount = buyerCount;
	}
	
	/**
	* 团购类别编号
	*@return 
	*/
	public Integer getClassId(){
		return  classId;
	}
	/**
	* 团购类别编号
	*@param  classId
	*/
	public void setClassId(Integer classId ){
		this.classId = classId;
	}
	
	/**
	* 结束时间
	*@return 
	*/
	public Integer getEndTime(){
		return  endTime;
	}
	/**
	* 结束时间
	*@param  endTime
	*/
	public void setEndTime(Integer endTime ){
		this.endTime = endTime;
	}
	
	/**
	* 商品公共表ID
	*@return 
	*/
	public Integer getGoodsCommonid(){
		return  goodsCommonid;
	}
	/**
	* 商品公共表ID
	*@param  goodsCommonid
	*/
	public void setGoodsCommonid(Integer goodsCommonid ){
		this.goodsCommonid = goodsCommonid;
	}
	
	/**
	* 商品ID
	*@return 
	*/
	public Integer getGoodsId(){
		return  goodsId;
	}
	/**
	* 商品ID
	*@param  goodsId
	*/
	public void setGoodsId(Integer goodsId ){
		this.goodsId = goodsId;
	}
	
	/**
	* 是否虚拟团购 1是0否
	*@return 
	*/
	public Integer getIsVr(){
		return  isVr;
	}
	/**
	* 是否虚拟团购 1是0否
	*@param  isVr
	*/
	public void setIsVr(Integer isVr ){
		this.isVr = isVr;
	}
	
	/**
	* 是否推荐 0.未推荐 1.已推荐
	*@return 
	*/
	public Integer getRecommended(){
		return  recommended;
	}
	/**
	* 是否推荐 0.未推荐 1.已推荐
	*@param  recommended
	*/
	public void setRecommended(Integer recommended ){
		this.recommended = recommended;
	}
	
	/**
	* 团购2级分类id
	*@return 
	*/
	public Integer getsClassId(){
		return  sClassId;
	}
	/**
	* 团购2级分类id
	*@param  sClassId
	*/
	public void setsClassId(Integer sClassId ){
		this.sClassId = sClassId;
	}
	
	/**
	* 开始时间
	*@return 
	*/
	public Integer getStartTime(){
		return  startTime;
	}
	/**
	* 开始时间
	*@param  startTime
	*/
	public void setStartTime(Integer startTime ){
		this.startTime = startTime;
	}
	
	/**
	* 团购状态 10-审核中 20-正常 30-审核失败 31-管理员关闭 32-已结束
	*@return 
	*/
	public Integer getState(){
		return  state;
	}
	/**
	* 团购状态 10-审核中 20-正常 30-审核失败 31-管理员关闭 32-已结束
	*@param  state
	*/
	public void setState(Integer state ){
		this.state = state;
	}
	
	/**
	* 店铺ID
	*@return 
	*/
	public Integer getStoreId(){
		return  storeId;
	}
	/**
	* 店铺ID
	*@param  storeId
	*/
	public void setStoreId(Integer storeId ){
		this.storeId = storeId;
	}
	
	/**
	* 购买上限
	*@return 
	*/
	public Integer getUpperLimit(){
		return  upperLimit;
	}
	/**
	* 购买上限
	*@param  upperLimit
	*/
	public void setUpperLimit(Integer upperLimit ){
		this.upperLimit = upperLimit;
	}
	
	/**
	* 查看次数
	*@return 
	*/
	public Integer getViews(){
		return  views;
	}
	/**
	* 查看次数
	*@param  views
	*/
	public void setViews(Integer views ){
		this.views = views;
	}
	
	/**
	* 虚拟购买数量
	*@return 
	*/
	public Integer getVirtualQuantity(){
		return  virtualQuantity;
	}
	/**
	* 虚拟购买数量
	*@param  virtualQuantity
	*/
	public void setVirtualQuantity(Integer virtualQuantity ){
		this.virtualQuantity = virtualQuantity;
	}
	
	/**
	* 虚拟团购区域id
	*@return 
	*/
	public Integer getVrAreaId(){
		return  vrAreaId;
	}
	/**
	* 虚拟团购区域id
	*@param  vrAreaId
	*/
	public void setVrAreaId(Integer vrAreaId ){
		this.vrAreaId = vrAreaId;
	}
	
	/**
	* 虚拟团购城市id
	*@return 
	*/
	public Integer getVrCityId(){
		return  vrCityId;
	}
	/**
	* 虚拟团购城市id
	*@param  vrCityId
	*/
	public void setVrCityId(Integer vrCityId ){
		this.vrCityId = vrCityId;
	}
	
	/**
	* 虚拟团购大分类id
	*@return 
	*/
	public Integer getVrClassId(){
		return  vrClassId;
	}
	/**
	* 虚拟团购大分类id
	*@param  vrClassId
	*/
	public void setVrClassId(Integer vrClassId ){
		this.vrClassId = vrClassId;
	}
	
	/**
	* 虚拟团购商区id
	*@return 
	*/
	public Integer getVrMallId(){
		return  vrMallId;
	}
	/**
	* 虚拟团购商区id
	*@param  vrMallId
	*/
	public void setVrMallId(Integer vrMallId ){
		this.vrMallId = vrMallId;
	}
	
	/**
	* 虚拟团购小分类id
	*@return 
	*/
	public Integer getVrSClassId(){
		return  vrSClassId;
	}
	/**
	* 虚拟团购小分类id
	*@param  vrSClassId
	*/
	public void setVrSClassId(Integer vrSClassId ){
		this.vrSClassId = vrSClassId;
	}
	
	/**
	* 商品名称
	*@return 
	*/
	public String getGoodsName(){
		return  goodsName;
	}
	/**
	* 商品名称
	*@param  goodsName
	*/
	public void setGoodsName(String goodsName ){
		this.goodsName = goodsName;
	}
	
	/**
	* 商品原价
	*@return 
	*/
	public BigDecimal getGoodsPrice(){
		return  goodsPrice;
	}
	/**
	* 商品原价
	*@param  goodsPrice
	*/
	public void setGoodsPrice(BigDecimal goodsPrice ){
		this.goodsPrice = goodsPrice;
	}
	
	/**
	* 团购图片
	*@return 
	*/
	public String getGroupbuyImage(){
		return  groupbuyImage;
	}
	/**
	* 团购图片
	*@param  groupbuyImage
	*/
	public void setGroupbuyImage(String groupbuyImage ){
		this.groupbuyImage = groupbuyImage;
	}
	
	/**
	* 团购图片1
	*@return 
	*/
	public String getGroupbuyImage1(){
		return  groupbuyImage1;
	}
	/**
	* 团购图片1
	*@param  groupbuyImage1
	*/
	public void setGroupbuyImage1(String groupbuyImage1 ){
		this.groupbuyImage1 = groupbuyImage1;
	}
	
	/**
	* 本团介绍
	*@return 
	*/
	public String getGroupbuyIntro(){
		return  groupbuyIntro;
	}
	/**
	* 本团介绍
	*@param  groupbuyIntro
	*/
	public void setGroupbuyIntro(String groupbuyIntro ){
		this.groupbuyIntro = groupbuyIntro;
	}
	
	/**
	* 活动名称
	*@return 
	*/
	public String getGroupbuyName(){
		return  groupbuyName;
	}
	/**
	* 活动名称
	*@param  groupbuyName
	*/
	public void setGroupbuyName(String groupbuyName ){
		this.groupbuyName = groupbuyName;
	}
	
	/**
	* 团购价格
	*@return 
	*/
	public BigDecimal getGroupbuyPrice(){
		return  groupbuyPrice;
	}
	/**
	* 团购价格
	*@param  groupbuyPrice
	*/
	public void setGroupbuyPrice(BigDecimal groupbuyPrice ){
		this.groupbuyPrice = groupbuyPrice;
	}
	
	/**
	* 折扣
	*@return 
	*/
	public BigDecimal getGroupbuyRebate(){
		return  groupbuyRebate;
	}
	/**
	* 折扣
	*@param  groupbuyRebate
	*/
	public void setGroupbuyRebate(BigDecimal groupbuyRebate ){
		this.groupbuyRebate = groupbuyRebate;
	}
	
	/**
	* 备注
	*@return 
	*/
	public String getRemark(){
		return  remark;
	}
	/**
	* 备注
	*@param  remark
	*/
	public void setRemark(String remark ){
		this.remark = remark;
	}
	
	/**
	* 店铺名称
	*@return 
	*/
	public String getStoreName(){
		return  storeName;
	}
	/**
	* 店铺名称
	*@param  storeName
	*/
	public void setStoreName(String storeName ){
		this.storeName = storeName;
	}
	

}
