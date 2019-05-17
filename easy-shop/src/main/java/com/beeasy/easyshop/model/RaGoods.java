package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_goods")
public class RaGoods   {
	
	/*
	商品id(SKU)
	*/
	private Integer goodsId ;
	/*
	一级地区id
	*/
	private Integer areaid1 ;
	/*
	二级地区id
	*/
	private Integer areaid2 ;
	/*
	品牌id
	*/
	private Integer brandId ;
	/*
	颜色规格id
	*/
	private Integer colorId ;
	/*
	评价数
	*/
	private Integer evaluationCount ;
	/*
	好评星级
	*/
	private Integer evaluationGoodStar ;
	/*
	商品分类id
	*/
	private Integer gcId ;
	/*
	一级分类id
	*/
	private Integer gcId1 ;
	/*
	二级分类id
	*/
	private Integer gcId2 ;
	/*
	三级分类id
	*/
	private Integer gcId3 ;
	/*
	商品添加时间
	*/
	private Integer goodsAddtime ;
	/*
	商品点击数量
	*/
	private Integer goodsClick ;
	/*
	收藏数量
	*/
	private Integer goodsCollect ;
	/*
	商品推荐 1是，0否 默认0
	*/
	private Integer goodsCommend ;
	/*
	商品公共表id
	*/
	private Integer goodsCommonid ;
	/*
	商品编辑时间
	*/
	private Integer goodsEdittime ;
	/*
	促销类型 0无促销，1团购，2限时折扣
	*/
	private Integer goodsPromotionType ;
	/*
	销售数量
	*/
	private Integer goodsSalenum ;
	/*
	商品状态 0下架，1正常，10违规（禁售）
	*/
	private Integer goodsState ;
	/*
	商品库存
	*/
	private Integer goodsStorage ;
	/*
	库存报警值
	*/
	private Integer goodsStorageAlarm ;
	/*
	是否开具增值税发票 1是，0否
	*/
	private Integer goodsVat ;
	/*
	商品审核 1通过，0未通过，10审核中
	*/
	private Integer goodsVerify ;
	/*
	是否拥有赠品
	*/
	private Integer haveGift ;
	/*
	是否是预约商品 1是，0否
	*/
	private Integer isAppoint ;
	/*
	是否为F码商品 1是，0否
	*/
	private Integer isFcode ;
	/*
	是否为平台自营
	*/
	private Integer isOwnShop ;
	/*
	是否是预售商品 1是，0否
	*/
	private Integer isPresell ;
	/*
	是否为虚拟商品 1是，0否
	*/
	private Integer isVirtual ;
	private Integer isWhole ;
	private Integer openTax ;
	/*
	店铺id
	*/
	private Integer storeId ;
	/*
	运费模板id
	*/
	private Integer transportId ;
	/*
	虚拟商品有效期
	*/
	private Integer virtualIndate ;
	/*
	是否允许过期退款， 1是，0否
	*/
	private Integer virtualInvalidRefund ;
	/*
	虚拟商品购买上限
	*/
	private Integer virtualLimit ;
	/*
	起批量
	*/
	private Integer wholeMin ;
	private String gextends ;
	/*
	运费 0为免运费
	*/
	private BigDecimal goodsFreight ;
	/*
	商品主图
	*/
	private String goodsImage ;
	/*
	商品广告词
	*/
	private String goodsJingle ;
	/*
	市场价
	*/
	private BigDecimal goodsMarketprice ;
	/*
	商品名称（+规格名称）
	*/
	private String goodsName ;
	/*
	商品价格
	*/
	private BigDecimal goodsPrice ;
	/*
	商品促销价格
	*/
	private BigDecimal goodsPromotionPrice ;
	/*
	商家编号
	*/
	private String goodsSerial ;
	/*
	商品规格序列化
	*/
	private String goodsSpec ;
	/*
	店铺分类id 首尾用,隔开
	*/
	private String goodsStcids ;
	private String linkGoods ;
	private String proxyFactor ;
	private String proxyGoldFormula ;
	private String sharp ;
	private String specName ;
	/*
	店铺名称
	*/
	private String storeName ;
	private BigDecimal tax ;
	private Long wholePrice ;
	
	public RaGoods() {
	}
	
	/**
	* 商品id(SKU)
	*@return 
	*/
	public Integer getGoodsId(){
		return  goodsId;
	}
	/**
	* 商品id(SKU)
	*@param  goodsId
	*/
	public void setGoodsId(Integer goodsId ){
		this.goodsId = goodsId;
	}
	
	/**
	* 一级地区id
	*@return 
	*/
	public Integer getAreaid1(){
		return  areaid1;
	}
	/**
	* 一级地区id
	*@param  areaid1
	*/
	public void setAreaid1(Integer areaid1 ){
		this.areaid1 = areaid1;
	}
	
	/**
	* 二级地区id
	*@return 
	*/
	public Integer getAreaid2(){
		return  areaid2;
	}
	/**
	* 二级地区id
	*@param  areaid2
	*/
	public void setAreaid2(Integer areaid2 ){
		this.areaid2 = areaid2;
	}
	
	/**
	* 品牌id
	*@return 
	*/
	public Integer getBrandId(){
		return  brandId;
	}
	/**
	* 品牌id
	*@param  brandId
	*/
	public void setBrandId(Integer brandId ){
		this.brandId = brandId;
	}
	
	/**
	* 颜色规格id
	*@return 
	*/
	public Integer getColorId(){
		return  colorId;
	}
	/**
	* 颜色规格id
	*@param  colorId
	*/
	public void setColorId(Integer colorId ){
		this.colorId = colorId;
	}
	
	/**
	* 评价数
	*@return 
	*/
	public Integer getEvaluationCount(){
		return  evaluationCount;
	}
	/**
	* 评价数
	*@param  evaluationCount
	*/
	public void setEvaluationCount(Integer evaluationCount ){
		this.evaluationCount = evaluationCount;
	}
	
	/**
	* 好评星级
	*@return 
	*/
	public Integer getEvaluationGoodStar(){
		return  evaluationGoodStar;
	}
	/**
	* 好评星级
	*@param  evaluationGoodStar
	*/
	public void setEvaluationGoodStar(Integer evaluationGoodStar ){
		this.evaluationGoodStar = evaluationGoodStar;
	}
	
	/**
	* 商品分类id
	*@return 
	*/
	public Integer getGcId(){
		return  gcId;
	}
	/**
	* 商品分类id
	*@param  gcId
	*/
	public void setGcId(Integer gcId ){
		this.gcId = gcId;
	}
	
	/**
	* 一级分类id
	*@return 
	*/
	public Integer getGcId1(){
		return  gcId1;
	}
	/**
	* 一级分类id
	*@param  gcId1
	*/
	public void setGcId1(Integer gcId1 ){
		this.gcId1 = gcId1;
	}
	
	/**
	* 二级分类id
	*@return 
	*/
	public Integer getGcId2(){
		return  gcId2;
	}
	/**
	* 二级分类id
	*@param  gcId2
	*/
	public void setGcId2(Integer gcId2 ){
		this.gcId2 = gcId2;
	}
	
	/**
	* 三级分类id
	*@return 
	*/
	public Integer getGcId3(){
		return  gcId3;
	}
	/**
	* 三级分类id
	*@param  gcId3
	*/
	public void setGcId3(Integer gcId3 ){
		this.gcId3 = gcId3;
	}
	
	/**
	* 商品添加时间
	*@return 
	*/
	public Integer getGoodsAddtime(){
		return  goodsAddtime;
	}
	/**
	* 商品添加时间
	*@param  goodsAddtime
	*/
	public void setGoodsAddtime(Integer goodsAddtime ){
		this.goodsAddtime = goodsAddtime;
	}
	
	/**
	* 商品点击数量
	*@return 
	*/
	public Integer getGoodsClick(){
		return  goodsClick;
	}
	/**
	* 商品点击数量
	*@param  goodsClick
	*/
	public void setGoodsClick(Integer goodsClick ){
		this.goodsClick = goodsClick;
	}
	
	/**
	* 收藏数量
	*@return 
	*/
	public Integer getGoodsCollect(){
		return  goodsCollect;
	}
	/**
	* 收藏数量
	*@param  goodsCollect
	*/
	public void setGoodsCollect(Integer goodsCollect ){
		this.goodsCollect = goodsCollect;
	}
	
	/**
	* 商品推荐 1是，0否 默认0
	*@return 
	*/
	public Integer getGoodsCommend(){
		return  goodsCommend;
	}
	/**
	* 商品推荐 1是，0否 默认0
	*@param  goodsCommend
	*/
	public void setGoodsCommend(Integer goodsCommend ){
		this.goodsCommend = goodsCommend;
	}
	
	/**
	* 商品公共表id
	*@return 
	*/
	public Integer getGoodsCommonid(){
		return  goodsCommonid;
	}
	/**
	* 商品公共表id
	*@param  goodsCommonid
	*/
	public void setGoodsCommonid(Integer goodsCommonid ){
		this.goodsCommonid = goodsCommonid;
	}
	
	/**
	* 商品编辑时间
	*@return 
	*/
	public Integer getGoodsEdittime(){
		return  goodsEdittime;
	}
	/**
	* 商品编辑时间
	*@param  goodsEdittime
	*/
	public void setGoodsEdittime(Integer goodsEdittime ){
		this.goodsEdittime = goodsEdittime;
	}
	
	/**
	* 促销类型 0无促销，1团购，2限时折扣
	*@return 
	*/
	public Integer getGoodsPromotionType(){
		return  goodsPromotionType;
	}
	/**
	* 促销类型 0无促销，1团购，2限时折扣
	*@param  goodsPromotionType
	*/
	public void setGoodsPromotionType(Integer goodsPromotionType ){
		this.goodsPromotionType = goodsPromotionType;
	}
	
	/**
	* 销售数量
	*@return 
	*/
	public Integer getGoodsSalenum(){
		return  goodsSalenum;
	}
	/**
	* 销售数量
	*@param  goodsSalenum
	*/
	public void setGoodsSalenum(Integer goodsSalenum ){
		this.goodsSalenum = goodsSalenum;
	}
	
	/**
	* 商品状态 0下架，1正常，10违规（禁售）
	*@return 
	*/
	public Integer getGoodsState(){
		return  goodsState;
	}
	/**
	* 商品状态 0下架，1正常，10违规（禁售）
	*@param  goodsState
	*/
	public void setGoodsState(Integer goodsState ){
		this.goodsState = goodsState;
	}
	
	/**
	* 商品库存
	*@return 
	*/
	public Integer getGoodsStorage(){
		return  goodsStorage;
	}
	/**
	* 商品库存
	*@param  goodsStorage
	*/
	public void setGoodsStorage(Integer goodsStorage ){
		this.goodsStorage = goodsStorage;
	}
	
	/**
	* 库存报警值
	*@return 
	*/
	public Integer getGoodsStorageAlarm(){
		return  goodsStorageAlarm;
	}
	/**
	* 库存报警值
	*@param  goodsStorageAlarm
	*/
	public void setGoodsStorageAlarm(Integer goodsStorageAlarm ){
		this.goodsStorageAlarm = goodsStorageAlarm;
	}
	
	/**
	* 是否开具增值税发票 1是，0否
	*@return 
	*/
	public Integer getGoodsVat(){
		return  goodsVat;
	}
	/**
	* 是否开具增值税发票 1是，0否
	*@param  goodsVat
	*/
	public void setGoodsVat(Integer goodsVat ){
		this.goodsVat = goodsVat;
	}
	
	/**
	* 商品审核 1通过，0未通过，10审核中
	*@return 
	*/
	public Integer getGoodsVerify(){
		return  goodsVerify;
	}
	/**
	* 商品审核 1通过，0未通过，10审核中
	*@param  goodsVerify
	*/
	public void setGoodsVerify(Integer goodsVerify ){
		this.goodsVerify = goodsVerify;
	}
	
	/**
	* 是否拥有赠品
	*@return 
	*/
	public Integer getHaveGift(){
		return  haveGift;
	}
	/**
	* 是否拥有赠品
	*@param  haveGift
	*/
	public void setHaveGift(Integer haveGift ){
		this.haveGift = haveGift;
	}
	
	/**
	* 是否是预约商品 1是，0否
	*@return 
	*/
	public Integer getIsAppoint(){
		return  isAppoint;
	}
	/**
	* 是否是预约商品 1是，0否
	*@param  isAppoint
	*/
	public void setIsAppoint(Integer isAppoint ){
		this.isAppoint = isAppoint;
	}
	
	/**
	* 是否为F码商品 1是，0否
	*@return 
	*/
	public Integer getIsFcode(){
		return  isFcode;
	}
	/**
	* 是否为F码商品 1是，0否
	*@param  isFcode
	*/
	public void setIsFcode(Integer isFcode ){
		this.isFcode = isFcode;
	}
	
	/**
	* 是否为平台自营
	*@return 
	*/
	public Integer getIsOwnShop(){
		return  isOwnShop;
	}
	/**
	* 是否为平台自营
	*@param  isOwnShop
	*/
	public void setIsOwnShop(Integer isOwnShop ){
		this.isOwnShop = isOwnShop;
	}
	
	/**
	* 是否是预售商品 1是，0否
	*@return 
	*/
	public Integer getIsPresell(){
		return  isPresell;
	}
	/**
	* 是否是预售商品 1是，0否
	*@param  isPresell
	*/
	public void setIsPresell(Integer isPresell ){
		this.isPresell = isPresell;
	}
	
	/**
	* 是否为虚拟商品 1是，0否
	*@return 
	*/
	public Integer getIsVirtual(){
		return  isVirtual;
	}
	/**
	* 是否为虚拟商品 1是，0否
	*@param  isVirtual
	*/
	public void setIsVirtual(Integer isVirtual ){
		this.isVirtual = isVirtual;
	}
	
	public Integer getIsWhole(){
		return  isWhole;
	}
	public void setIsWhole(Integer isWhole ){
		this.isWhole = isWhole;
	}
	
	public Integer getOpenTax(){
		return  openTax;
	}
	public void setOpenTax(Integer openTax ){
		this.openTax = openTax;
	}
	
	/**
	* 店铺id
	*@return 
	*/
	public Integer getStoreId(){
		return  storeId;
	}
	/**
	* 店铺id
	*@param  storeId
	*/
	public void setStoreId(Integer storeId ){
		this.storeId = storeId;
	}
	
	/**
	* 运费模板id
	*@return 
	*/
	public Integer getTransportId(){
		return  transportId;
	}
	/**
	* 运费模板id
	*@param  transportId
	*/
	public void setTransportId(Integer transportId ){
		this.transportId = transportId;
	}
	
	/**
	* 虚拟商品有效期
	*@return 
	*/
	public Integer getVirtualIndate(){
		return  virtualIndate;
	}
	/**
	* 虚拟商品有效期
	*@param  virtualIndate
	*/
	public void setVirtualIndate(Integer virtualIndate ){
		this.virtualIndate = virtualIndate;
	}
	
	/**
	* 是否允许过期退款， 1是，0否
	*@return 
	*/
	public Integer getVirtualInvalidRefund(){
		return  virtualInvalidRefund;
	}
	/**
	* 是否允许过期退款， 1是，0否
	*@param  virtualInvalidRefund
	*/
	public void setVirtualInvalidRefund(Integer virtualInvalidRefund ){
		this.virtualInvalidRefund = virtualInvalidRefund;
	}
	
	/**
	* 虚拟商品购买上限
	*@return 
	*/
	public Integer getVirtualLimit(){
		return  virtualLimit;
	}
	/**
	* 虚拟商品购买上限
	*@param  virtualLimit
	*/
	public void setVirtualLimit(Integer virtualLimit ){
		this.virtualLimit = virtualLimit;
	}
	
	/**
	* 起批量
	*@return 
	*/
	public Integer getWholeMin(){
		return  wholeMin;
	}
	/**
	* 起批量
	*@param  wholeMin
	*/
	public void setWholeMin(Integer wholeMin ){
		this.wholeMin = wholeMin;
	}
	
	public String getGextends(){
		return  gextends;
	}
	public void setGextends(String gextends ){
		this.gextends = gextends;
	}
	
	/**
	* 运费 0为免运费
	*@return 
	*/
	public BigDecimal getGoodsFreight(){
		return  goodsFreight;
	}
	/**
	* 运费 0为免运费
	*@param  goodsFreight
	*/
	public void setGoodsFreight(BigDecimal goodsFreight ){
		this.goodsFreight = goodsFreight;
	}
	
	/**
	* 商品主图
	*@return 
	*/
	public String getGoodsImage(){
		return  goodsImage;
	}
	/**
	* 商品主图
	*@param  goodsImage
	*/
	public void setGoodsImage(String goodsImage ){
		this.goodsImage = goodsImage;
	}
	
	/**
	* 商品广告词
	*@return 
	*/
	public String getGoodsJingle(){
		return  goodsJingle;
	}
	/**
	* 商品广告词
	*@param  goodsJingle
	*/
	public void setGoodsJingle(String goodsJingle ){
		this.goodsJingle = goodsJingle;
	}
	
	/**
	* 市场价
	*@return 
	*/
	public BigDecimal getGoodsMarketprice(){
		return  goodsMarketprice;
	}
	/**
	* 市场价
	*@param  goodsMarketprice
	*/
	public void setGoodsMarketprice(BigDecimal goodsMarketprice ){
		this.goodsMarketprice = goodsMarketprice;
	}
	
	/**
	* 商品名称（+规格名称）
	*@return 
	*/
	public String getGoodsName(){
		return  goodsName;
	}
	/**
	* 商品名称（+规格名称）
	*@param  goodsName
	*/
	public void setGoodsName(String goodsName ){
		this.goodsName = goodsName;
	}
	
	/**
	* 商品价格
	*@return 
	*/
	public BigDecimal getGoodsPrice(){
		return  goodsPrice;
	}
	/**
	* 商品价格
	*@param  goodsPrice
	*/
	public void setGoodsPrice(BigDecimal goodsPrice ){
		this.goodsPrice = goodsPrice;
	}
	
	/**
	* 商品促销价格
	*@return 
	*/
	public BigDecimal getGoodsPromotionPrice(){
		return  goodsPromotionPrice;
	}
	/**
	* 商品促销价格
	*@param  goodsPromotionPrice
	*/
	public void setGoodsPromotionPrice(BigDecimal goodsPromotionPrice ){
		this.goodsPromotionPrice = goodsPromotionPrice;
	}
	
	/**
	* 商家编号
	*@return 
	*/
	public String getGoodsSerial(){
		return  goodsSerial;
	}
	/**
	* 商家编号
	*@param  goodsSerial
	*/
	public void setGoodsSerial(String goodsSerial ){
		this.goodsSerial = goodsSerial;
	}
	
	/**
	* 商品规格序列化
	*@return 
	*/
	public String getGoodsSpec(){
		return  goodsSpec;
	}
	/**
	* 商品规格序列化
	*@param  goodsSpec
	*/
	public void setGoodsSpec(String goodsSpec ){
		this.goodsSpec = goodsSpec;
	}
	
	/**
	* 店铺分类id 首尾用,隔开
	*@return 
	*/
	public String getGoodsStcids(){
		return  goodsStcids;
	}
	/**
	* 店铺分类id 首尾用,隔开
	*@param  goodsStcids
	*/
	public void setGoodsStcids(String goodsStcids ){
		this.goodsStcids = goodsStcids;
	}
	
	public String getLinkGoods(){
		return  linkGoods;
	}
	public void setLinkGoods(String linkGoods ){
		this.linkGoods = linkGoods;
	}
	
	public String getProxyFactor(){
		return  proxyFactor;
	}
	public void setProxyFactor(String proxyFactor ){
		this.proxyFactor = proxyFactor;
	}
	
	public String getProxyGoldFormula(){
		return  proxyGoldFormula;
	}
	public void setProxyGoldFormula(String proxyGoldFormula ){
		this.proxyGoldFormula = proxyGoldFormula;
	}
	
	public String getSharp(){
		return  sharp;
	}
	public void setSharp(String sharp ){
		this.sharp = sharp;
	}
	
	public String getSpecName(){
		return  specName;
	}
	public void setSpecName(String specName ){
		this.specName = specName;
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
	
	public BigDecimal getTax(){
		return  tax;
	}
	public void setTax(BigDecimal tax ){
		this.tax = tax;
	}
	
	public Long getWholePrice(){
		return  wholePrice;
	}
	public void setWholePrice(Long wholePrice ){
		this.wholePrice = wholePrice;
	}
	

}
