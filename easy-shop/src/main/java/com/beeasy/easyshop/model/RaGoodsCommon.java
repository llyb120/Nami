package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_goods_common")
public class RaGoodsCommon   {
	
	/*
	商品公共表id
	*/
	private Integer goodsCommonid ;
	private Integer agreeDistribute ;
	/*
	预约商品出售时间
	*/
	private Integer appointSatedate ;
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
	private Integer distributeSpecial ;
	private Integer fromPlace ;
	/*
	商品分类
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
	商品推荐 1是，0否，默认为0
	*/
	private Integer goodsCommend ;
	/*
	商品锁定 0未锁，1已锁
	*/
	private Integer goodsLock ;
	/*
	上架时间
	*/
	private Integer goodsSelltime ;
	/*
	商品状态 0下架，1正常，10违规（禁售）
	*/
	private Integer goodsState ;
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
	private Integer indexRecommend ;
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
	是否已经推送跨境易
	*/
	private Integer isPullKjy ;
	/*
	是否为虚拟商品 1是，0否
	*/
	private Integer isVirtual ;
	private Integer isZhiyou ;
	private Integer maoWeight ;
	private Integer openTax ;
	/*
	底部关联板式
	*/
	private Integer plateidBottom ;
	/*
	顶部关联板式
	*/
	private Integer plateidTop ;
	/*
	预售商品发货时间
	*/
	private Integer presellDeliverdate ;
	private Integer shenzhenAuditStatus ;
	private Integer shenzhenRecordStatus ;
	/*
	店铺id
	*/
	private Integer storeId ;
	/*
	运费模板
	*/
	private Integer transportId ;
	/*
	类型id
	*/
	private Integer typeId ;
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
	private Integer weight ;
	/*
	品牌名称
	*/
	private String brandName ;
	private String disInvRate ;
	private BigDecimal disSpecRate ;
	private BigDecimal distributePrice ;
	private String distributeRate ;
	/*
	商品分类
	*/
	private String gcName ;
	private String gextends ;
	/*
	商品属性
	*/
	private String goodsAttr ;
	/*
	商品内容
	*/
	private String goodsBody ;
	/*
	成本价
	*/
	private BigDecimal goodsCostprice ;
	/*
	折扣
	*/
	private BigDecimal goodsDiscount ;
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
	商品名称
	*/
	private String goodsName ;
	/*
	商品价格
	*/
	private BigDecimal goodsPrice ;
	/*
	商家编号
	*/
	private String goodsSerial ;
	/*
	规格名称序列化（下标为规格id）
	*/
	private String goodsSpecname ;
	/*
	违规原因
	*/
	private String goodsStateremark ;
	/*
	店铺分类id 首尾用,隔开
	*/
	private String goodsStcids ;
	/*
	审核失败原因
	*/
	private String goodsVerifyremark ;
	/*
	手机端商品描述
	*/
	private String mobileBody ;
	private String sharp ;
	private String shipname ;
	/*
	规格名称
	*/
	private String specName ;
	/*
	规格值
	*/
	private String specValue ;
	/*
	店铺名称
	*/
	private String storeName ;
	private BigDecimal tax ;
	private String trafmode ;
	/*
	运费模板名称
	*/
	private String transportTitle ;
	
	public RaGoodsCommon() {
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
	
	public Integer getAgreeDistribute(){
		return  agreeDistribute;
	}
	public void setAgreeDistribute(Integer agreeDistribute ){
		this.agreeDistribute = agreeDistribute;
	}
	
	/**
	* 预约商品出售时间
	*@return 
	*/
	public Integer getAppointSatedate(){
		return  appointSatedate;
	}
	/**
	* 预约商品出售时间
	*@param  appointSatedate
	*/
	public void setAppointSatedate(Integer appointSatedate ){
		this.appointSatedate = appointSatedate;
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
	
	public Integer getDistributeSpecial(){
		return  distributeSpecial;
	}
	public void setDistributeSpecial(Integer distributeSpecial ){
		this.distributeSpecial = distributeSpecial;
	}
	
	public Integer getFromPlace(){
		return  fromPlace;
	}
	public void setFromPlace(Integer fromPlace ){
		this.fromPlace = fromPlace;
	}
	
	/**
	* 商品分类
	*@return 
	*/
	public Integer getGcId(){
		return  gcId;
	}
	/**
	* 商品分类
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
	* 商品推荐 1是，0否，默认为0
	*@return 
	*/
	public Integer getGoodsCommend(){
		return  goodsCommend;
	}
	/**
	* 商品推荐 1是，0否，默认为0
	*@param  goodsCommend
	*/
	public void setGoodsCommend(Integer goodsCommend ){
		this.goodsCommend = goodsCommend;
	}
	
	/**
	* 商品锁定 0未锁，1已锁
	*@return 
	*/
	public Integer getGoodsLock(){
		return  goodsLock;
	}
	/**
	* 商品锁定 0未锁，1已锁
	*@param  goodsLock
	*/
	public void setGoodsLock(Integer goodsLock ){
		this.goodsLock = goodsLock;
	}
	
	/**
	* 上架时间
	*@return 
	*/
	public Integer getGoodsSelltime(){
		return  goodsSelltime;
	}
	/**
	* 上架时间
	*@param  goodsSelltime
	*/
	public void setGoodsSelltime(Integer goodsSelltime ){
		this.goodsSelltime = goodsSelltime;
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
	
	public Integer getIndexRecommend(){
		return  indexRecommend;
	}
	public void setIndexRecommend(Integer indexRecommend ){
		this.indexRecommend = indexRecommend;
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
	* 是否已经推送跨境易
	*@return 
	*/
	public Integer getIsPullKjy(){
		return  isPullKjy;
	}
	/**
	* 是否已经推送跨境易
	*@param  isPullKjy
	*/
	public void setIsPullKjy(Integer isPullKjy ){
		this.isPullKjy = isPullKjy;
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
	
	public Integer getIsZhiyou(){
		return  isZhiyou;
	}
	public void setIsZhiyou(Integer isZhiyou ){
		this.isZhiyou = isZhiyou;
	}
	
	public Integer getMaoWeight(){
		return  maoWeight;
	}
	public void setMaoWeight(Integer maoWeight ){
		this.maoWeight = maoWeight;
	}
	
	public Integer getOpenTax(){
		return  openTax;
	}
	public void setOpenTax(Integer openTax ){
		this.openTax = openTax;
	}
	
	/**
	* 底部关联板式
	*@return 
	*/
	public Integer getPlateidBottom(){
		return  plateidBottom;
	}
	/**
	* 底部关联板式
	*@param  plateidBottom
	*/
	public void setPlateidBottom(Integer plateidBottom ){
		this.plateidBottom = plateidBottom;
	}
	
	/**
	* 顶部关联板式
	*@return 
	*/
	public Integer getPlateidTop(){
		return  plateidTop;
	}
	/**
	* 顶部关联板式
	*@param  plateidTop
	*/
	public void setPlateidTop(Integer plateidTop ){
		this.plateidTop = plateidTop;
	}
	
	/**
	* 预售商品发货时间
	*@return 
	*/
	public Integer getPresellDeliverdate(){
		return  presellDeliverdate;
	}
	/**
	* 预售商品发货时间
	*@param  presellDeliverdate
	*/
	public void setPresellDeliverdate(Integer presellDeliverdate ){
		this.presellDeliverdate = presellDeliverdate;
	}
	
	public Integer getShenzhenAuditStatus(){
		return  shenzhenAuditStatus;
	}
	public void setShenzhenAuditStatus(Integer shenzhenAuditStatus ){
		this.shenzhenAuditStatus = shenzhenAuditStatus;
	}
	
	public Integer getShenzhenRecordStatus(){
		return  shenzhenRecordStatus;
	}
	public void setShenzhenRecordStatus(Integer shenzhenRecordStatus ){
		this.shenzhenRecordStatus = shenzhenRecordStatus;
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
	* 运费模板
	*@return 
	*/
	public Integer getTransportId(){
		return  transportId;
	}
	/**
	* 运费模板
	*@param  transportId
	*/
	public void setTransportId(Integer transportId ){
		this.transportId = transportId;
	}
	
	/**
	* 类型id
	*@return 
	*/
	public Integer getTypeId(){
		return  typeId;
	}
	/**
	* 类型id
	*@param  typeId
	*/
	public void setTypeId(Integer typeId ){
		this.typeId = typeId;
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
	
	public Integer getWeight(){
		return  weight;
	}
	public void setWeight(Integer weight ){
		this.weight = weight;
	}
	
	/**
	* 品牌名称
	*@return 
	*/
	public String getBrandName(){
		return  brandName;
	}
	/**
	* 品牌名称
	*@param  brandName
	*/
	public void setBrandName(String brandName ){
		this.brandName = brandName;
	}
	
	public String getDisInvRate(){
		return  disInvRate;
	}
	public void setDisInvRate(String disInvRate ){
		this.disInvRate = disInvRate;
	}
	
	public BigDecimal getDisSpecRate(){
		return  disSpecRate;
	}
	public void setDisSpecRate(BigDecimal disSpecRate ){
		this.disSpecRate = disSpecRate;
	}
	
	public BigDecimal getDistributePrice(){
		return  distributePrice;
	}
	public void setDistributePrice(BigDecimal distributePrice ){
		this.distributePrice = distributePrice;
	}
	
	public String getDistributeRate(){
		return  distributeRate;
	}
	public void setDistributeRate(String distributeRate ){
		this.distributeRate = distributeRate;
	}
	
	/**
	* 商品分类
	*@return 
	*/
	public String getGcName(){
		return  gcName;
	}
	/**
	* 商品分类
	*@param  gcName
	*/
	public void setGcName(String gcName ){
		this.gcName = gcName;
	}
	
	public String getGextends(){
		return  gextends;
	}
	public void setGextends(String gextends ){
		this.gextends = gextends;
	}
	
	/**
	* 商品属性
	*@return 
	*/
	public String getGoodsAttr(){
		return  goodsAttr;
	}
	/**
	* 商品属性
	*@param  goodsAttr
	*/
	public void setGoodsAttr(String goodsAttr ){
		this.goodsAttr = goodsAttr;
	}
	
	/**
	* 商品内容
	*@return 
	*/
	public String getGoodsBody(){
		return  goodsBody;
	}
	/**
	* 商品内容
	*@param  goodsBody
	*/
	public void setGoodsBody(String goodsBody ){
		this.goodsBody = goodsBody;
	}
	
	/**
	* 成本价
	*@return 
	*/
	public BigDecimal getGoodsCostprice(){
		return  goodsCostprice;
	}
	/**
	* 成本价
	*@param  goodsCostprice
	*/
	public void setGoodsCostprice(BigDecimal goodsCostprice ){
		this.goodsCostprice = goodsCostprice;
	}
	
	/**
	* 折扣
	*@return 
	*/
	public BigDecimal getGoodsDiscount(){
		return  goodsDiscount;
	}
	/**
	* 折扣
	*@param  goodsDiscount
	*/
	public void setGoodsDiscount(BigDecimal goodsDiscount ){
		this.goodsDiscount = goodsDiscount;
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
	* 规格名称序列化（下标为规格id）
	*@return 
	*/
	public String getGoodsSpecname(){
		return  goodsSpecname;
	}
	/**
	* 规格名称序列化（下标为规格id）
	*@param  goodsSpecname
	*/
	public void setGoodsSpecname(String goodsSpecname ){
		this.goodsSpecname = goodsSpecname;
	}
	
	/**
	* 违规原因
	*@return 
	*/
	public String getGoodsStateremark(){
		return  goodsStateremark;
	}
	/**
	* 违规原因
	*@param  goodsStateremark
	*/
	public void setGoodsStateremark(String goodsStateremark ){
		this.goodsStateremark = goodsStateremark;
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
	
	/**
	* 审核失败原因
	*@return 
	*/
	public String getGoodsVerifyremark(){
		return  goodsVerifyremark;
	}
	/**
	* 审核失败原因
	*@param  goodsVerifyremark
	*/
	public void setGoodsVerifyremark(String goodsVerifyremark ){
		this.goodsVerifyremark = goodsVerifyremark;
	}
	
	/**
	* 手机端商品描述
	*@return 
	*/
	public String getMobileBody(){
		return  mobileBody;
	}
	/**
	* 手机端商品描述
	*@param  mobileBody
	*/
	public void setMobileBody(String mobileBody ){
		this.mobileBody = mobileBody;
	}
	
	public String getSharp(){
		return  sharp;
	}
	public void setSharp(String sharp ){
		this.sharp = sharp;
	}
	
	public String getShipname(){
		return  shipname;
	}
	public void setShipname(String shipname ){
		this.shipname = shipname;
	}
	
	/**
	* 规格名称
	*@return 
	*/
	public String getSpecName(){
		return  specName;
	}
	/**
	* 规格名称
	*@param  specName
	*/
	public void setSpecName(String specName ){
		this.specName = specName;
	}
	
	/**
	* 规格值
	*@return 
	*/
	public String getSpecValue(){
		return  specValue;
	}
	/**
	* 规格值
	*@param  specValue
	*/
	public void setSpecValue(String specValue ){
		this.specValue = specValue;
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
	
	public String getTrafmode(){
		return  trafmode;
	}
	public void setTrafmode(String trafmode ){
		this.trafmode = trafmode;
	}
	
	/**
	* 运费模板名称
	*@return 
	*/
	public String getTransportTitle(){
		return  transportTitle;
	}
	/**
	* 运费模板名称
	*@param  transportTitle
	*/
	public void setTransportTitle(String transportTitle ){
		this.transportTitle = transportTitle;
	}
	

}
