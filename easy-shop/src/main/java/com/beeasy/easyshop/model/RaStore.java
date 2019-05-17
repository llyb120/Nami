package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-15
*/
@Table(name="yoehi.ra_store")
public class RaStore   {
	
	// alias
	public static final String ALIAS_store_id = "store_id";
	public static final String ALIAS_bind_all_gc = "bind_all_gc";
	public static final String ALIAS_grade_id = "grade_id";
	public static final String ALIAS_is_own_shop = "is_own_shop";
	public static final String ALIAS_is_whole = "is_whole";
	public static final String ALIAS_member_id = "member_id";
	public static final String ALIAS_province_id = "province_id";
	public static final String ALIAS_sc_id = "sc_id";
	public static final String ALIAS_store_collect = "store_collect";
	public static final String ALIAS_store_credit = "store_credit";
	public static final String ALIAS_store_decoration_image_count = "store_decoration_image_count";
	public static final String ALIAS_store_decoration_only = "store_decoration_only";
	public static final String ALIAS_store_decoration_switch = "store_decoration_switch";
	public static final String ALIAS_store_domain_times = "store_domain_times";
	public static final String ALIAS_store_recommend = "store_recommend";
	public static final String ALIAS_store_sales = "store_sales";
	public static final String ALIAS_store_sort = "store_sort";
	public static final String ALIAS_store_state = "store_state";
	public static final String ALIAS_useIETAPI = "useIETAPI";
	public static final String ALIAS_area_info = "area_info";
	public static final String ALIAS_dressData = "dressData";
	public static final String ALIAS_ebcCode = "ebcCode";
	public static final String ALIAS_ebcName = "ebcName";
	public static final String ALIAS_joinPayAlloc = "joinPayAlloc";
	public static final String ALIAS_live_store_address = "live_store_address";
	public static final String ALIAS_live_store_bus = "live_store_bus";
	public static final String ALIAS_live_store_name = "live_store_name";
	public static final String ALIAS_live_store_tel = "live_store_tel";
	public static final String ALIAS_member_name = "member_name";
	public static final String ALIAS_n_avatar = "n_avatar";
	public static final String ALIAS_n_banner = "n_banner";
	public static final String ALIAS_n_logo = "n_logo";
	public static final String ALIAS_seller_name = "seller_name";
	public static final String ALIAS_store_address = "store_address";
	public static final String ALIAS_store_aftersales = "store_aftersales";
	public static final String ALIAS_store_avatar = "store_avatar";
	public static final String ALIAS_store_banner = "store_banner";
	public static final String ALIAS_store_close_info = "store_close_info";
	public static final String ALIAS_store_company_name = "store_company_name";
	public static final String ALIAS_store_deliverycredit = "store_deliverycredit";
	public static final String ALIAS_store_desccredit = "store_desccredit";
	public static final String ALIAS_store_description = "store_description";
	public static final String ALIAS_store_domain = "store_domain";
	public static final String ALIAS_store_end_time = "store_end_time";
	public static final String ALIAS_store_free_price = "store_free_price";
	public static final String ALIAS_store_keywords = "store_keywords";
	public static final String ALIAS_store_label = "store_label";
	public static final String ALIAS_store_name = "store_name";
	public static final String ALIAS_store_phone = "store_phone";
	public static final String ALIAS_store_presales = "store_presales";
	public static final String ALIAS_store_printdesc = "store_printdesc";
	public static final String ALIAS_store_qq = "store_qq";
	public static final String ALIAS_store_servicecredit = "store_servicecredit";
	public static final String ALIAS_store_slide = "store_slide";
	public static final String ALIAS_store_slide_url = "store_slide_url";
	public static final String ALIAS_store_stamp = "store_stamp";
	public static final String ALIAS_store_theme = "store_theme";
	public static final String ALIAS_store_time = "store_time";
	public static final String ALIAS_store_vrcode_prefix = "store_vrcode_prefix";
	public static final String ALIAS_store_workingtime = "store_workingtime";
	public static final String ALIAS_store_ww = "store_ww";
	public static final String ALIAS_store_zip = "store_zip";
	public static final String ALIAS_store_zy = "store_zy";
	
	/*
	店铺索引id
	*/
	private Integer storeId ;
	/*
	自营店是否绑定全部分类 0否1是
	*/
	private Integer bindAllGc ;
	/*
	店铺等级
	*/
	private Integer gradeId ;
	/*
	是否自营店铺 1是 0否
	*/
	private Integer isOwnShop ;
	private Integer isWhole ;
	/*
	会员id
	*/
	private Integer memberId ;
	/*
	店铺所在省份ID
	*/
	private Integer provinceId ;
	/*
	店铺分类
	*/
	private Integer scId ;
	/*
	店铺收藏数量
	*/
	private Integer storeCollect ;
	/*
	店铺信用
	*/
	private Integer storeCredit ;
	/*
	店铺装修相册图片数量
	*/
	private Integer storeDecorationImageCount ;
	/*
	开启店铺装修时，仅显示店铺装修(1-是 0-否
	*/
	private Integer storeDecorationOnly ;
	/*
	店铺装修开关(0-关闭 装修编号-开启)
	*/
	private Integer storeDecorationSwitch ;
	/*
	二级域名修改次数
	*/
	private Integer storeDomainTimes ;
	/*
	推荐，0为否，1为是，默认为0
	*/
	private Integer storeRecommend ;
	/*
	店铺销量
	*/
	private Integer storeSales ;
	/*
	店铺排序
	*/
	private Integer storeSort ;
	/*
	店铺状态，0关闭，1开启，2审核中
	*/
	private Integer storeState ;
	private Integer useietapi ;
	/*
	地区内容，冗余数据
	*/
	private String areaInfo ;
	/*
	装修数据
	*/
	private String dressdata ;
	private String ebccode ;
	private String ebcname ;
	private String joinpayalloc ;
	/*
	商家地址
	*/
	private String liveStoreAddress ;
	/*
	公交线路
	*/
	private String liveStoreBus ;
	/*
	商铺名称
	*/
	private String liveStoreName ;
	/*
	商铺电话
	*/
	private String liveStoreTel ;
	/*
	会员名称
	*/
	private String memberName ;
	/*
	新店铺头像
	*/
	private String nAvatar ;
	/*
	新店铺条幅
	*/
	private String nBanner ;
	/*
	新店铺logo
	*/
	private String nLogo ;
	/*
	店主卖家用户名
	*/
	private String sellerName ;
	/*
	详细地区
	*/
	private String storeAddress ;
	/*
	售后客服
	*/
	private String storeAftersales ;
	/*
	店铺头像
	*/
	private String storeAvatar ;
	/*
	店铺横幅
	*/
	private String storeBanner ;
	/*
	店铺关闭原因
	*/
	private String storeCloseInfo ;
	/*
	店铺公司名称
	*/
	private String storeCompanyName ;
	/*
	发货速度分数
	*/
	private BigDecimal storeDeliverycredit ;
	/*
	描述相符度分数
	*/
	private BigDecimal storeDesccredit ;
	/*
	店铺seo描述
	*/
	private String storeDescription ;
	/*
	店铺二级域名
	*/
	private String storeDomain ;
	/*
	店铺关闭时间
	*/
	private String storeEndTime ;
	/*
	超出该金额免运费，大于0才表示该值有效
	*/
	private BigDecimal storeFreePrice ;
	/*
	店铺seo关键字
	*/
	private String storeKeywords ;
	/*
	店铺logo
	*/
	private String storeLabel ;
	/*
	店铺名称
	*/
	private String storeName ;
	/*
	商家电话
	*/
	private String storePhone ;
	/*
	售前客服
	*/
	private String storePresales ;
	/*
	打印订单页面下方说明文字
	*/
	private String storePrintdesc ;
	/*
	QQ
	*/
	private String storeQq ;
	/*
	服务态度分数
	*/
	private BigDecimal storeServicecredit ;
	/*
	店铺幻灯片
	*/
	private String storeSlide ;
	/*
	店铺幻灯片链接
	*/
	private String storeSlideUrl ;
	/*
	店铺印章
	*/
	private String storeStamp ;
	/*
	店铺当前主题
	*/
	private String storeTheme ;
	/*
	店铺时间
	*/
	private String storeTime ;
	/*
	商家兑换码前缀
	*/
	private String storeVrcodePrefix ;
	/*
	工作时间
	*/
	private String storeWorkingtime ;
	/*
	阿里旺旺
	*/
	private String storeWw ;
	/*
	邮政编码
	*/
	private String storeZip ;
	/*
	主营商品
	*/
	private String storeZy ;
	
	public RaStore() {
	}
	
	/**
	* 店铺索引id
	*@return 
	*/
	public Integer getStoreId(){
		return  storeId;
	}
	/**
	* 店铺索引id
	*@param  storeId
	*/
	public void setStoreId(Integer storeId ){
		this.storeId = storeId;
	}
	
	/**
	* 自营店是否绑定全部分类 0否1是
	*@return 
	*/
	public Integer getBindAllGc(){
		return  bindAllGc;
	}
	/**
	* 自营店是否绑定全部分类 0否1是
	*@param  bindAllGc
	*/
	public void setBindAllGc(Integer bindAllGc ){
		this.bindAllGc = bindAllGc;
	}
	
	/**
	* 店铺等级
	*@return 
	*/
	public Integer getGradeId(){
		return  gradeId;
	}
	/**
	* 店铺等级
	*@param  gradeId
	*/
	public void setGradeId(Integer gradeId ){
		this.gradeId = gradeId;
	}
	
	/**
	* 是否自营店铺 1是 0否
	*@return 
	*/
	public Integer getIsOwnShop(){
		return  isOwnShop;
	}
	/**
	* 是否自营店铺 1是 0否
	*@param  isOwnShop
	*/
	public void setIsOwnShop(Integer isOwnShop ){
		this.isOwnShop = isOwnShop;
	}
	
	public Integer getIsWhole(){
		return  isWhole;
	}
	public void setIsWhole(Integer isWhole ){
		this.isWhole = isWhole;
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
	* 店铺所在省份ID
	*@return 
	*/
	public Integer getProvinceId(){
		return  provinceId;
	}
	/**
	* 店铺所在省份ID
	*@param  provinceId
	*/
	public void setProvinceId(Integer provinceId ){
		this.provinceId = provinceId;
	}
	
	/**
	* 店铺分类
	*@return 
	*/
	public Integer getScId(){
		return  scId;
	}
	/**
	* 店铺分类
	*@param  scId
	*/
	public void setScId(Integer scId ){
		this.scId = scId;
	}
	
	/**
	* 店铺收藏数量
	*@return 
	*/
	public Integer getStoreCollect(){
		return  storeCollect;
	}
	/**
	* 店铺收藏数量
	*@param  storeCollect
	*/
	public void setStoreCollect(Integer storeCollect ){
		this.storeCollect = storeCollect;
	}
	
	/**
	* 店铺信用
	*@return 
	*/
	public Integer getStoreCredit(){
		return  storeCredit;
	}
	/**
	* 店铺信用
	*@param  storeCredit
	*/
	public void setStoreCredit(Integer storeCredit ){
		this.storeCredit = storeCredit;
	}
	
	/**
	* 店铺装修相册图片数量
	*@return 
	*/
	public Integer getStoreDecorationImageCount(){
		return  storeDecorationImageCount;
	}
	/**
	* 店铺装修相册图片数量
	*@param  storeDecorationImageCount
	*/
	public void setStoreDecorationImageCount(Integer storeDecorationImageCount ){
		this.storeDecorationImageCount = storeDecorationImageCount;
	}
	
	/**
	* 开启店铺装修时，仅显示店铺装修(1-是 0-否
	*@return 
	*/
	public Integer getStoreDecorationOnly(){
		return  storeDecorationOnly;
	}
	/**
	* 开启店铺装修时，仅显示店铺装修(1-是 0-否
	*@param  storeDecorationOnly
	*/
	public void setStoreDecorationOnly(Integer storeDecorationOnly ){
		this.storeDecorationOnly = storeDecorationOnly;
	}
	
	/**
	* 店铺装修开关(0-关闭 装修编号-开启)
	*@return 
	*/
	public Integer getStoreDecorationSwitch(){
		return  storeDecorationSwitch;
	}
	/**
	* 店铺装修开关(0-关闭 装修编号-开启)
	*@param  storeDecorationSwitch
	*/
	public void setStoreDecorationSwitch(Integer storeDecorationSwitch ){
		this.storeDecorationSwitch = storeDecorationSwitch;
	}
	
	/**
	* 二级域名修改次数
	*@return 
	*/
	public Integer getStoreDomainTimes(){
		return  storeDomainTimes;
	}
	/**
	* 二级域名修改次数
	*@param  storeDomainTimes
	*/
	public void setStoreDomainTimes(Integer storeDomainTimes ){
		this.storeDomainTimes = storeDomainTimes;
	}
	
	/**
	* 推荐，0为否，1为是，默认为0
	*@return 
	*/
	public Integer getStoreRecommend(){
		return  storeRecommend;
	}
	/**
	* 推荐，0为否，1为是，默认为0
	*@param  storeRecommend
	*/
	public void setStoreRecommend(Integer storeRecommend ){
		this.storeRecommend = storeRecommend;
	}
	
	/**
	* 店铺销量
	*@return 
	*/
	public Integer getStoreSales(){
		return  storeSales;
	}
	/**
	* 店铺销量
	*@param  storeSales
	*/
	public void setStoreSales(Integer storeSales ){
		this.storeSales = storeSales;
	}
	
	/**
	* 店铺排序
	*@return 
	*/
	public Integer getStoreSort(){
		return  storeSort;
	}
	/**
	* 店铺排序
	*@param  storeSort
	*/
	public void setStoreSort(Integer storeSort ){
		this.storeSort = storeSort;
	}
	
	/**
	* 店铺状态，0关闭，1开启，2审核中
	*@return 
	*/
	public Integer getStoreState(){
		return  storeState;
	}
	/**
	* 店铺状态，0关闭，1开启，2审核中
	*@param  storeState
	*/
	public void setStoreState(Integer storeState ){
		this.storeState = storeState;
	}
	
	public Integer getUseietapi(){
		return  useietapi;
	}
	public void setUseietapi(Integer useietapi ){
		this.useietapi = useietapi;
	}
	
	/**
	* 地区内容，冗余数据
	*@return 
	*/
	public String getAreaInfo(){
		return  areaInfo;
	}
	/**
	* 地区内容，冗余数据
	*@param  areaInfo
	*/
	public void setAreaInfo(String areaInfo ){
		this.areaInfo = areaInfo;
	}
	
	/**
	* 装修数据
	*@return 
	*/
	public String getDressdata(){
		return  dressdata;
	}
	/**
	* 装修数据
	*@param  dressdata
	*/
	public void setDressdata(String dressdata ){
		this.dressdata = dressdata;
	}
	
	public String getEbccode(){
		return  ebccode;
	}
	public void setEbccode(String ebccode ){
		this.ebccode = ebccode;
	}
	
	public String getEbcname(){
		return  ebcname;
	}
	public void setEbcname(String ebcname ){
		this.ebcname = ebcname;
	}
	
	public String getJoinpayalloc(){
		return  joinpayalloc;
	}
	public void setJoinpayalloc(String joinpayalloc ){
		this.joinpayalloc = joinpayalloc;
	}
	
	/**
	* 商家地址
	*@return 
	*/
	public String getLiveStoreAddress(){
		return  liveStoreAddress;
	}
	/**
	* 商家地址
	*@param  liveStoreAddress
	*/
	public void setLiveStoreAddress(String liveStoreAddress ){
		this.liveStoreAddress = liveStoreAddress;
	}
	
	/**
	* 公交线路
	*@return 
	*/
	public String getLiveStoreBus(){
		return  liveStoreBus;
	}
	/**
	* 公交线路
	*@param  liveStoreBus
	*/
	public void setLiveStoreBus(String liveStoreBus ){
		this.liveStoreBus = liveStoreBus;
	}
	
	/**
	* 商铺名称
	*@return 
	*/
	public String getLiveStoreName(){
		return  liveStoreName;
	}
	/**
	* 商铺名称
	*@param  liveStoreName
	*/
	public void setLiveStoreName(String liveStoreName ){
		this.liveStoreName = liveStoreName;
	}
	
	/**
	* 商铺电话
	*@return 
	*/
	public String getLiveStoreTel(){
		return  liveStoreTel;
	}
	/**
	* 商铺电话
	*@param  liveStoreTel
	*/
	public void setLiveStoreTel(String liveStoreTel ){
		this.liveStoreTel = liveStoreTel;
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
	* 新店铺头像
	*@return 
	*/
	public String getnAvatar(){
		return  nAvatar;
	}
	/**
	* 新店铺头像
	*@param  nAvatar
	*/
	public void setnAvatar(String nAvatar ){
		this.nAvatar = nAvatar;
	}
	
	/**
	* 新店铺条幅
	*@return 
	*/
	public String getnBanner(){
		return  nBanner;
	}
	/**
	* 新店铺条幅
	*@param  nBanner
	*/
	public void setnBanner(String nBanner ){
		this.nBanner = nBanner;
	}
	
	/**
	* 新店铺logo
	*@return 
	*/
	public String getnLogo(){
		return  nLogo;
	}
	/**
	* 新店铺logo
	*@param  nLogo
	*/
	public void setnLogo(String nLogo ){
		this.nLogo = nLogo;
	}
	
	/**
	* 店主卖家用户名
	*@return 
	*/
	public String getSellerName(){
		return  sellerName;
	}
	/**
	* 店主卖家用户名
	*@param  sellerName
	*/
	public void setSellerName(String sellerName ){
		this.sellerName = sellerName;
	}
	
	/**
	* 详细地区
	*@return 
	*/
	public String getStoreAddress(){
		return  storeAddress;
	}
	/**
	* 详细地区
	*@param  storeAddress
	*/
	public void setStoreAddress(String storeAddress ){
		this.storeAddress = storeAddress;
	}
	
	/**
	* 售后客服
	*@return 
	*/
	public String getStoreAftersales(){
		return  storeAftersales;
	}
	/**
	* 售后客服
	*@param  storeAftersales
	*/
	public void setStoreAftersales(String storeAftersales ){
		this.storeAftersales = storeAftersales;
	}
	
	/**
	* 店铺头像
	*@return 
	*/
	public String getStoreAvatar(){
		return  storeAvatar;
	}
	/**
	* 店铺头像
	*@param  storeAvatar
	*/
	public void setStoreAvatar(String storeAvatar ){
		this.storeAvatar = storeAvatar;
	}
	
	/**
	* 店铺横幅
	*@return 
	*/
	public String getStoreBanner(){
		return  storeBanner;
	}
	/**
	* 店铺横幅
	*@param  storeBanner
	*/
	public void setStoreBanner(String storeBanner ){
		this.storeBanner = storeBanner;
	}
	
	/**
	* 店铺关闭原因
	*@return 
	*/
	public String getStoreCloseInfo(){
		return  storeCloseInfo;
	}
	/**
	* 店铺关闭原因
	*@param  storeCloseInfo
	*/
	public void setStoreCloseInfo(String storeCloseInfo ){
		this.storeCloseInfo = storeCloseInfo;
	}
	
	/**
	* 店铺公司名称
	*@return 
	*/
	public String getStoreCompanyName(){
		return  storeCompanyName;
	}
	/**
	* 店铺公司名称
	*@param  storeCompanyName
	*/
	public void setStoreCompanyName(String storeCompanyName ){
		this.storeCompanyName = storeCompanyName;
	}
	
	/**
	* 发货速度分数
	*@return 
	*/
	public BigDecimal getStoreDeliverycredit(){
		return  storeDeliverycredit;
	}
	/**
	* 发货速度分数
	*@param  storeDeliverycredit
	*/
	public void setStoreDeliverycredit(BigDecimal storeDeliverycredit ){
		this.storeDeliverycredit = storeDeliverycredit;
	}
	
	/**
	* 描述相符度分数
	*@return 
	*/
	public BigDecimal getStoreDesccredit(){
		return  storeDesccredit;
	}
	/**
	* 描述相符度分数
	*@param  storeDesccredit
	*/
	public void setStoreDesccredit(BigDecimal storeDesccredit ){
		this.storeDesccredit = storeDesccredit;
	}
	
	/**
	* 店铺seo描述
	*@return 
	*/
	public String getStoreDescription(){
		return  storeDescription;
	}
	/**
	* 店铺seo描述
	*@param  storeDescription
	*/
	public void setStoreDescription(String storeDescription ){
		this.storeDescription = storeDescription;
	}
	
	/**
	* 店铺二级域名
	*@return 
	*/
	public String getStoreDomain(){
		return  storeDomain;
	}
	/**
	* 店铺二级域名
	*@param  storeDomain
	*/
	public void setStoreDomain(String storeDomain ){
		this.storeDomain = storeDomain;
	}
	
	/**
	* 店铺关闭时间
	*@return 
	*/
	public String getStoreEndTime(){
		return  storeEndTime;
	}
	/**
	* 店铺关闭时间
	*@param  storeEndTime
	*/
	public void setStoreEndTime(String storeEndTime ){
		this.storeEndTime = storeEndTime;
	}
	
	/**
	* 超出该金额免运费，大于0才表示该值有效
	*@return 
	*/
	public BigDecimal getStoreFreePrice(){
		return  storeFreePrice;
	}
	/**
	* 超出该金额免运费，大于0才表示该值有效
	*@param  storeFreePrice
	*/
	public void setStoreFreePrice(BigDecimal storeFreePrice ){
		this.storeFreePrice = storeFreePrice;
	}
	
	/**
	* 店铺seo关键字
	*@return 
	*/
	public String getStoreKeywords(){
		return  storeKeywords;
	}
	/**
	* 店铺seo关键字
	*@param  storeKeywords
	*/
	public void setStoreKeywords(String storeKeywords ){
		this.storeKeywords = storeKeywords;
	}
	
	/**
	* 店铺logo
	*@return 
	*/
	public String getStoreLabel(){
		return  storeLabel;
	}
	/**
	* 店铺logo
	*@param  storeLabel
	*/
	public void setStoreLabel(String storeLabel ){
		this.storeLabel = storeLabel;
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
	
	/**
	* 商家电话
	*@return 
	*/
	public String getStorePhone(){
		return  storePhone;
	}
	/**
	* 商家电话
	*@param  storePhone
	*/
	public void setStorePhone(String storePhone ){
		this.storePhone = storePhone;
	}
	
	/**
	* 售前客服
	*@return 
	*/
	public String getStorePresales(){
		return  storePresales;
	}
	/**
	* 售前客服
	*@param  storePresales
	*/
	public void setStorePresales(String storePresales ){
		this.storePresales = storePresales;
	}
	
	/**
	* 打印订单页面下方说明文字
	*@return 
	*/
	public String getStorePrintdesc(){
		return  storePrintdesc;
	}
	/**
	* 打印订单页面下方说明文字
	*@param  storePrintdesc
	*/
	public void setStorePrintdesc(String storePrintdesc ){
		this.storePrintdesc = storePrintdesc;
	}
	
	/**
	* QQ
	*@return 
	*/
	public String getStoreQq(){
		return  storeQq;
	}
	/**
	* QQ
	*@param  storeQq
	*/
	public void setStoreQq(String storeQq ){
		this.storeQq = storeQq;
	}
	
	/**
	* 服务态度分数
	*@return 
	*/
	public BigDecimal getStoreServicecredit(){
		return  storeServicecredit;
	}
	/**
	* 服务态度分数
	*@param  storeServicecredit
	*/
	public void setStoreServicecredit(BigDecimal storeServicecredit ){
		this.storeServicecredit = storeServicecredit;
	}
	
	/**
	* 店铺幻灯片
	*@return 
	*/
	public String getStoreSlide(){
		return  storeSlide;
	}
	/**
	* 店铺幻灯片
	*@param  storeSlide
	*/
	public void setStoreSlide(String storeSlide ){
		this.storeSlide = storeSlide;
	}
	
	/**
	* 店铺幻灯片链接
	*@return 
	*/
	public String getStoreSlideUrl(){
		return  storeSlideUrl;
	}
	/**
	* 店铺幻灯片链接
	*@param  storeSlideUrl
	*/
	public void setStoreSlideUrl(String storeSlideUrl ){
		this.storeSlideUrl = storeSlideUrl;
	}
	
	/**
	* 店铺印章
	*@return 
	*/
	public String getStoreStamp(){
		return  storeStamp;
	}
	/**
	* 店铺印章
	*@param  storeStamp
	*/
	public void setStoreStamp(String storeStamp ){
		this.storeStamp = storeStamp;
	}
	
	/**
	* 店铺当前主题
	*@return 
	*/
	public String getStoreTheme(){
		return  storeTheme;
	}
	/**
	* 店铺当前主题
	*@param  storeTheme
	*/
	public void setStoreTheme(String storeTheme ){
		this.storeTheme = storeTheme;
	}
	
	/**
	* 店铺时间
	*@return 
	*/
	public String getStoreTime(){
		return  storeTime;
	}
	/**
	* 店铺时间
	*@param  storeTime
	*/
	public void setStoreTime(String storeTime ){
		this.storeTime = storeTime;
	}
	
	/**
	* 商家兑换码前缀
	*@return 
	*/
	public String getStoreVrcodePrefix(){
		return  storeVrcodePrefix;
	}
	/**
	* 商家兑换码前缀
	*@param  storeVrcodePrefix
	*/
	public void setStoreVrcodePrefix(String storeVrcodePrefix ){
		this.storeVrcodePrefix = storeVrcodePrefix;
	}
	
	/**
	* 工作时间
	*@return 
	*/
	public String getStoreWorkingtime(){
		return  storeWorkingtime;
	}
	/**
	* 工作时间
	*@param  storeWorkingtime
	*/
	public void setStoreWorkingtime(String storeWorkingtime ){
		this.storeWorkingtime = storeWorkingtime;
	}
	
	/**
	* 阿里旺旺
	*@return 
	*/
	public String getStoreWw(){
		return  storeWw;
	}
	/**
	* 阿里旺旺
	*@param  storeWw
	*/
	public void setStoreWw(String storeWw ){
		this.storeWw = storeWw;
	}
	
	/**
	* 邮政编码
	*@return 
	*/
	public String getStoreZip(){
		return  storeZip;
	}
	/**
	* 邮政编码
	*@param  storeZip
	*/
	public void setStoreZip(String storeZip ){
		this.storeZip = storeZip;
	}
	
	/**
	* 主营商品
	*@return 
	*/
	public String getStoreZy(){
		return  storeZy;
	}
	/**
	* 主营商品
	*@param  storeZy
	*/
	public void setStoreZy(String storeZy ){
		this.storeZy = storeZy;
	}
	

}
