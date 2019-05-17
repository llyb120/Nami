package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
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
	private Integer store_id ;
	/*
	自营店是否绑定全部分类 0否1是
	*/
	private Integer bind_all_gc ;
	/*
	店铺等级
	*/
	private Integer grade_id ;
	/*
	是否自营店铺 1是 0否
	*/
	private Integer is_own_shop ;
	private Integer is_whole ;
	/*
	会员id
	*/
	private Integer member_id ;
	/*
	店铺所在省份ID
	*/
	private Integer province_id ;
	/*
	店铺分类
	*/
	private Integer sc_id ;
	/*
	店铺收藏数量
	*/
	private Integer store_collect ;
	/*
	店铺信用
	*/
	private Integer store_credit ;
	/*
	店铺装修相册图片数量
	*/
	private Integer store_decoration_image_count ;
	/*
	开启店铺装修时，仅显示店铺装修(1-是 0-否
	*/
	private Integer store_decoration_only ;
	/*
	店铺装修开关(0-关闭 装修编号-开启)
	*/
	private Integer store_decoration_switch ;
	/*
	二级域名修改次数
	*/
	private Integer store_domain_times ;
	/*
	推荐，0为否，1为是，默认为0
	*/
	private Integer store_recommend ;
	/*
	店铺销量
	*/
	private Integer store_sales ;
	/*
	店铺排序
	*/
	private Integer store_sort ;
	/*
	店铺状态，0关闭，1开启，2审核中
	*/
	private Integer store_state ;
	private Integer useietapi ;
	/*
	地区内容，冗余数据
	*/
	private String area_info ;
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
	private String live_store_address ;
	/*
	公交线路
	*/
	private String live_store_bus ;
	/*
	商铺名称
	*/
	private String live_store_name ;
	/*
	商铺电话
	*/
	private String live_store_tel ;
	/*
	会员名称
	*/
	private String member_name ;
	/*
	新店铺头像
	*/
	private String n_avatar ;
	/*
	新店铺条幅
	*/
	private String n_banner ;
	/*
	新店铺logo
	*/
	private String n_logo ;
	/*
	店主卖家用户名
	*/
	private String seller_name ;
	/*
	详细地区
	*/
	private String store_address ;
	/*
	售后客服
	*/
	private String store_aftersales ;
	/*
	店铺头像
	*/
	private String store_avatar ;
	/*
	店铺横幅
	*/
	private String store_banner ;
	/*
	店铺关闭原因
	*/
	private String store_close_info ;
	/*
	店铺公司名称
	*/
	private String store_company_name ;
	/*
	发货速度分数
	*/
	private BigDecimal store_deliverycredit ;
	/*
	描述相符度分数
	*/
	private BigDecimal store_desccredit ;
	/*
	店铺seo描述
	*/
	private String store_description ;
	/*
	店铺二级域名
	*/
	private String store_domain ;
	/*
	店铺关闭时间
	*/
	private String store_end_time ;
	/*
	超出该金额免运费，大于0才表示该值有效
	*/
	private BigDecimal store_free_price ;
	/*
	店铺seo关键字
	*/
	private String store_keywords ;
	/*
	店铺logo
	*/
	private String store_label ;
	/*
	店铺名称
	*/
	private String store_name ;
	/*
	商家电话
	*/
	private String store_phone ;
	/*
	售前客服
	*/
	private String store_presales ;
	/*
	打印订单页面下方说明文字
	*/
	private String store_printdesc ;
	/*
	QQ
	*/
	private String store_qq ;
	/*
	服务态度分数
	*/
	private BigDecimal store_servicecredit ;
	/*
	店铺幻灯片
	*/
	private String store_slide ;
	/*
	店铺幻灯片链接
	*/
	private String store_slide_url ;
	/*
	店铺印章
	*/
	private String store_stamp ;
	/*
	店铺当前主题
	*/
	private String store_theme ;
	/*
	店铺时间
	*/
	private String store_time ;
	/*
	商家兑换码前缀
	*/
	private String store_vrcode_prefix ;
	/*
	工作时间
	*/
	private String store_workingtime ;
	/*
	阿里旺旺
	*/
	private String store_ww ;
	/*
	邮政编码
	*/
	private String store_zip ;
	/*
	主营商品
	*/
	private String store_zy ;
	
	public RaStore() {
	}
	
	/**
	* 店铺索引id
	*@return 
	*/
	public Integer getStore_id(){
		return  store_id;
	}
	/**
	* 店铺索引id
	*@param  store_id
	*/
	public void setStore_id(Integer store_id ){
		this.store_id = store_id;
	}
	
	/**
	* 自营店是否绑定全部分类 0否1是
	*@return 
	*/
	public Integer getBind_all_gc(){
		return  bind_all_gc;
	}
	/**
	* 自营店是否绑定全部分类 0否1是
	*@param  bind_all_gc
	*/
	public void setBind_all_gc(Integer bind_all_gc ){
		this.bind_all_gc = bind_all_gc;
	}
	
	/**
	* 店铺等级
	*@return 
	*/
	public Integer getGrade_id(){
		return  grade_id;
	}
	/**
	* 店铺等级
	*@param  grade_id
	*/
	public void setGrade_id(Integer grade_id ){
		this.grade_id = grade_id;
	}
	
	/**
	* 是否自营店铺 1是 0否
	*@return 
	*/
	public Integer getIs_own_shop(){
		return  is_own_shop;
	}
	/**
	* 是否自营店铺 1是 0否
	*@param  is_own_shop
	*/
	public void setIs_own_shop(Integer is_own_shop ){
		this.is_own_shop = is_own_shop;
	}
	
	public Integer getIs_whole(){
		return  is_whole;
	}
	public void setIs_whole(Integer is_whole ){
		this.is_whole = is_whole;
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
	* 店铺所在省份ID
	*@return 
	*/
	public Integer getProvince_id(){
		return  province_id;
	}
	/**
	* 店铺所在省份ID
	*@param  province_id
	*/
	public void setProvince_id(Integer province_id ){
		this.province_id = province_id;
	}
	
	/**
	* 店铺分类
	*@return 
	*/
	public Integer getSc_id(){
		return  sc_id;
	}
	/**
	* 店铺分类
	*@param  sc_id
	*/
	public void setSc_id(Integer sc_id ){
		this.sc_id = sc_id;
	}
	
	/**
	* 店铺收藏数量
	*@return 
	*/
	public Integer getStore_collect(){
		return  store_collect;
	}
	/**
	* 店铺收藏数量
	*@param  store_collect
	*/
	public void setStore_collect(Integer store_collect ){
		this.store_collect = store_collect;
	}
	
	/**
	* 店铺信用
	*@return 
	*/
	public Integer getStore_credit(){
		return  store_credit;
	}
	/**
	* 店铺信用
	*@param  store_credit
	*/
	public void setStore_credit(Integer store_credit ){
		this.store_credit = store_credit;
	}
	
	/**
	* 店铺装修相册图片数量
	*@return 
	*/
	public Integer getStore_decoration_image_count(){
		return  store_decoration_image_count;
	}
	/**
	* 店铺装修相册图片数量
	*@param  store_decoration_image_count
	*/
	public void setStore_decoration_image_count(Integer store_decoration_image_count ){
		this.store_decoration_image_count = store_decoration_image_count;
	}
	
	/**
	* 开启店铺装修时，仅显示店铺装修(1-是 0-否
	*@return 
	*/
	public Integer getStore_decoration_only(){
		return  store_decoration_only;
	}
	/**
	* 开启店铺装修时，仅显示店铺装修(1-是 0-否
	*@param  store_decoration_only
	*/
	public void setStore_decoration_only(Integer store_decoration_only ){
		this.store_decoration_only = store_decoration_only;
	}
	
	/**
	* 店铺装修开关(0-关闭 装修编号-开启)
	*@return 
	*/
	public Integer getStore_decoration_switch(){
		return  store_decoration_switch;
	}
	/**
	* 店铺装修开关(0-关闭 装修编号-开启)
	*@param  store_decoration_switch
	*/
	public void setStore_decoration_switch(Integer store_decoration_switch ){
		this.store_decoration_switch = store_decoration_switch;
	}
	
	/**
	* 二级域名修改次数
	*@return 
	*/
	public Integer getStore_domain_times(){
		return  store_domain_times;
	}
	/**
	* 二级域名修改次数
	*@param  store_domain_times
	*/
	public void setStore_domain_times(Integer store_domain_times ){
		this.store_domain_times = store_domain_times;
	}
	
	/**
	* 推荐，0为否，1为是，默认为0
	*@return 
	*/
	public Integer getStore_recommend(){
		return  store_recommend;
	}
	/**
	* 推荐，0为否，1为是，默认为0
	*@param  store_recommend
	*/
	public void setStore_recommend(Integer store_recommend ){
		this.store_recommend = store_recommend;
	}
	
	/**
	* 店铺销量
	*@return 
	*/
	public Integer getStore_sales(){
		return  store_sales;
	}
	/**
	* 店铺销量
	*@param  store_sales
	*/
	public void setStore_sales(Integer store_sales ){
		this.store_sales = store_sales;
	}
	
	/**
	* 店铺排序
	*@return 
	*/
	public Integer getStore_sort(){
		return  store_sort;
	}
	/**
	* 店铺排序
	*@param  store_sort
	*/
	public void setStore_sort(Integer store_sort ){
		this.store_sort = store_sort;
	}
	
	/**
	* 店铺状态，0关闭，1开启，2审核中
	*@return 
	*/
	public Integer getStore_state(){
		return  store_state;
	}
	/**
	* 店铺状态，0关闭，1开启，2审核中
	*@param  store_state
	*/
	public void setStore_state(Integer store_state ){
		this.store_state = store_state;
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
	public String getArea_info(){
		return  area_info;
	}
	/**
	* 地区内容，冗余数据
	*@param  area_info
	*/
	public void setArea_info(String area_info ){
		this.area_info = area_info;
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
	public String getLive_store_address(){
		return  live_store_address;
	}
	/**
	* 商家地址
	*@param  live_store_address
	*/
	public void setLive_store_address(String live_store_address ){
		this.live_store_address = live_store_address;
	}
	
	/**
	* 公交线路
	*@return 
	*/
	public String getLive_store_bus(){
		return  live_store_bus;
	}
	/**
	* 公交线路
	*@param  live_store_bus
	*/
	public void setLive_store_bus(String live_store_bus ){
		this.live_store_bus = live_store_bus;
	}
	
	/**
	* 商铺名称
	*@return 
	*/
	public String getLive_store_name(){
		return  live_store_name;
	}
	/**
	* 商铺名称
	*@param  live_store_name
	*/
	public void setLive_store_name(String live_store_name ){
		this.live_store_name = live_store_name;
	}
	
	/**
	* 商铺电话
	*@return 
	*/
	public String getLive_store_tel(){
		return  live_store_tel;
	}
	/**
	* 商铺电话
	*@param  live_store_tel
	*/
	public void setLive_store_tel(String live_store_tel ){
		this.live_store_tel = live_store_tel;
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
	* 新店铺头像
	*@return 
	*/
	public String getN_avatar(){
		return  n_avatar;
	}
	/**
	* 新店铺头像
	*@param  n_avatar
	*/
	public void setN_avatar(String n_avatar ){
		this.n_avatar = n_avatar;
	}
	
	/**
	* 新店铺条幅
	*@return 
	*/
	public String getN_banner(){
		return  n_banner;
	}
	/**
	* 新店铺条幅
	*@param  n_banner
	*/
	public void setN_banner(String n_banner ){
		this.n_banner = n_banner;
	}
	
	/**
	* 新店铺logo
	*@return 
	*/
	public String getN_logo(){
		return  n_logo;
	}
	/**
	* 新店铺logo
	*@param  n_logo
	*/
	public void setN_logo(String n_logo ){
		this.n_logo = n_logo;
	}
	
	/**
	* 店主卖家用户名
	*@return 
	*/
	public String getSeller_name(){
		return  seller_name;
	}
	/**
	* 店主卖家用户名
	*@param  seller_name
	*/
	public void setSeller_name(String seller_name ){
		this.seller_name = seller_name;
	}
	
	/**
	* 详细地区
	*@return 
	*/
	public String getStore_address(){
		return  store_address;
	}
	/**
	* 详细地区
	*@param  store_address
	*/
	public void setStore_address(String store_address ){
		this.store_address = store_address;
	}
	
	/**
	* 售后客服
	*@return 
	*/
	public String getStore_aftersales(){
		return  store_aftersales;
	}
	/**
	* 售后客服
	*@param  store_aftersales
	*/
	public void setStore_aftersales(String store_aftersales ){
		this.store_aftersales = store_aftersales;
	}
	
	/**
	* 店铺头像
	*@return 
	*/
	public String getStore_avatar(){
		return  store_avatar;
	}
	/**
	* 店铺头像
	*@param  store_avatar
	*/
	public void setStore_avatar(String store_avatar ){
		this.store_avatar = store_avatar;
	}
	
	/**
	* 店铺横幅
	*@return 
	*/
	public String getStore_banner(){
		return  store_banner;
	}
	/**
	* 店铺横幅
	*@param  store_banner
	*/
	public void setStore_banner(String store_banner ){
		this.store_banner = store_banner;
	}
	
	/**
	* 店铺关闭原因
	*@return 
	*/
	public String getStore_close_info(){
		return  store_close_info;
	}
	/**
	* 店铺关闭原因
	*@param  store_close_info
	*/
	public void setStore_close_info(String store_close_info ){
		this.store_close_info = store_close_info;
	}
	
	/**
	* 店铺公司名称
	*@return 
	*/
	public String getStore_company_name(){
		return  store_company_name;
	}
	/**
	* 店铺公司名称
	*@param  store_company_name
	*/
	public void setStore_company_name(String store_company_name ){
		this.store_company_name = store_company_name;
	}
	
	/**
	* 发货速度分数
	*@return 
	*/
	public BigDecimal getStore_deliverycredit(){
		return  store_deliverycredit;
	}
	/**
	* 发货速度分数
	*@param  store_deliverycredit
	*/
	public void setStore_deliverycredit(BigDecimal store_deliverycredit ){
		this.store_deliverycredit = store_deliverycredit;
	}
	
	/**
	* 描述相符度分数
	*@return 
	*/
	public BigDecimal getStore_desccredit(){
		return  store_desccredit;
	}
	/**
	* 描述相符度分数
	*@param  store_desccredit
	*/
	public void setStore_desccredit(BigDecimal store_desccredit ){
		this.store_desccredit = store_desccredit;
	}
	
	/**
	* 店铺seo描述
	*@return 
	*/
	public String getStore_description(){
		return  store_description;
	}
	/**
	* 店铺seo描述
	*@param  store_description
	*/
	public void setStore_description(String store_description ){
		this.store_description = store_description;
	}
	
	/**
	* 店铺二级域名
	*@return 
	*/
	public String getStore_domain(){
		return  store_domain;
	}
	/**
	* 店铺二级域名
	*@param  store_domain
	*/
	public void setStore_domain(String store_domain ){
		this.store_domain = store_domain;
	}
	
	/**
	* 店铺关闭时间
	*@return 
	*/
	public String getStore_end_time(){
		return  store_end_time;
	}
	/**
	* 店铺关闭时间
	*@param  store_end_time
	*/
	public void setStore_end_time(String store_end_time ){
		this.store_end_time = store_end_time;
	}
	
	/**
	* 超出该金额免运费，大于0才表示该值有效
	*@return 
	*/
	public BigDecimal getStore_free_price(){
		return  store_free_price;
	}
	/**
	* 超出该金额免运费，大于0才表示该值有效
	*@param  store_free_price
	*/
	public void setStore_free_price(BigDecimal store_free_price ){
		this.store_free_price = store_free_price;
	}
	
	/**
	* 店铺seo关键字
	*@return 
	*/
	public String getStore_keywords(){
		return  store_keywords;
	}
	/**
	* 店铺seo关键字
	*@param  store_keywords
	*/
	public void setStore_keywords(String store_keywords ){
		this.store_keywords = store_keywords;
	}
	
	/**
	* 店铺logo
	*@return 
	*/
	public String getStore_label(){
		return  store_label;
	}
	/**
	* 店铺logo
	*@param  store_label
	*/
	public void setStore_label(String store_label ){
		this.store_label = store_label;
	}
	
	/**
	* 店铺名称
	*@return 
	*/
	public String getStore_name(){
		return  store_name;
	}
	/**
	* 店铺名称
	*@param  store_name
	*/
	public void setStore_name(String store_name ){
		this.store_name = store_name;
	}
	
	/**
	* 商家电话
	*@return 
	*/
	public String getStore_phone(){
		return  store_phone;
	}
	/**
	* 商家电话
	*@param  store_phone
	*/
	public void setStore_phone(String store_phone ){
		this.store_phone = store_phone;
	}
	
	/**
	* 售前客服
	*@return 
	*/
	public String getStore_presales(){
		return  store_presales;
	}
	/**
	* 售前客服
	*@param  store_presales
	*/
	public void setStore_presales(String store_presales ){
		this.store_presales = store_presales;
	}
	
	/**
	* 打印订单页面下方说明文字
	*@return 
	*/
	public String getStore_printdesc(){
		return  store_printdesc;
	}
	/**
	* 打印订单页面下方说明文字
	*@param  store_printdesc
	*/
	public void setStore_printdesc(String store_printdesc ){
		this.store_printdesc = store_printdesc;
	}
	
	/**
	* QQ
	*@return 
	*/
	public String getStore_qq(){
		return  store_qq;
	}
	/**
	* QQ
	*@param  store_qq
	*/
	public void setStore_qq(String store_qq ){
		this.store_qq = store_qq;
	}
	
	/**
	* 服务态度分数
	*@return 
	*/
	public BigDecimal getStore_servicecredit(){
		return  store_servicecredit;
	}
	/**
	* 服务态度分数
	*@param  store_servicecredit
	*/
	public void setStore_servicecredit(BigDecimal store_servicecredit ){
		this.store_servicecredit = store_servicecredit;
	}
	
	/**
	* 店铺幻灯片
	*@return 
	*/
	public String getStore_slide(){
		return  store_slide;
	}
	/**
	* 店铺幻灯片
	*@param  store_slide
	*/
	public void setStore_slide(String store_slide ){
		this.store_slide = store_slide;
	}
	
	/**
	* 店铺幻灯片链接
	*@return 
	*/
	public String getStore_slide_url(){
		return  store_slide_url;
	}
	/**
	* 店铺幻灯片链接
	*@param  store_slide_url
	*/
	public void setStore_slide_url(String store_slide_url ){
		this.store_slide_url = store_slide_url;
	}
	
	/**
	* 店铺印章
	*@return 
	*/
	public String getStore_stamp(){
		return  store_stamp;
	}
	/**
	* 店铺印章
	*@param  store_stamp
	*/
	public void setStore_stamp(String store_stamp ){
		this.store_stamp = store_stamp;
	}
	
	/**
	* 店铺当前主题
	*@return 
	*/
	public String getStore_theme(){
		return  store_theme;
	}
	/**
	* 店铺当前主题
	*@param  store_theme
	*/
	public void setStore_theme(String store_theme ){
		this.store_theme = store_theme;
	}
	
	/**
	* 店铺时间
	*@return 
	*/
	public String getStore_time(){
		return  store_time;
	}
	/**
	* 店铺时间
	*@param  store_time
	*/
	public void setStore_time(String store_time ){
		this.store_time = store_time;
	}
	
	/**
	* 商家兑换码前缀
	*@return 
	*/
	public String getStore_vrcode_prefix(){
		return  store_vrcode_prefix;
	}
	/**
	* 商家兑换码前缀
	*@param  store_vrcode_prefix
	*/
	public void setStore_vrcode_prefix(String store_vrcode_prefix ){
		this.store_vrcode_prefix = store_vrcode_prefix;
	}
	
	/**
	* 工作时间
	*@return 
	*/
	public String getStore_workingtime(){
		return  store_workingtime;
	}
	/**
	* 工作时间
	*@param  store_workingtime
	*/
	public void setStore_workingtime(String store_workingtime ){
		this.store_workingtime = store_workingtime;
	}
	
	/**
	* 阿里旺旺
	*@return 
	*/
	public String getStore_ww(){
		return  store_ww;
	}
	/**
	* 阿里旺旺
	*@param  store_ww
	*/
	public void setStore_ww(String store_ww ){
		this.store_ww = store_ww;
	}
	
	/**
	* 邮政编码
	*@return 
	*/
	public String getStore_zip(){
		return  store_zip;
	}
	/**
	* 邮政编码
	*@param  store_zip
	*/
	public void setStore_zip(String store_zip ){
		this.store_zip = store_zip;
	}
	
	/**
	* 主营商品
	*@return 
	*/
	public String getStore_zy(){
		return  store_zy;
	}
	/**
	* 主营商品
	*@param  store_zy
	*/
	public void setStore_zy(String store_zy ){
		this.store_zy = store_zy;
	}
	

}
