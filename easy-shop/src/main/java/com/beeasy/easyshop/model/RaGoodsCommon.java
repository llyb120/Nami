package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_goods_common")
public class RaGoodsCommon   {
	
	// alias
	public static final String ALIAS_goods_commonid = "goods_commonid";
	public static final String ALIAS_agree_distribute = "agree_distribute";
	public static final String ALIAS_appoint_satedate = "appoint_satedate";
	public static final String ALIAS_areaid_1 = "areaid_1";
	public static final String ALIAS_areaid_2 = "areaid_2";
	public static final String ALIAS_brand_id = "brand_id";
	public static final String ALIAS_distribute_special = "distribute_special";
	public static final String ALIAS_from_place = "from_place";
	public static final String ALIAS_gc_id = "gc_id";
	public static final String ALIAS_gc_id_1 = "gc_id_1";
	public static final String ALIAS_gc_id_2 = "gc_id_2";
	public static final String ALIAS_gc_id_3 = "gc_id_3";
	public static final String ALIAS_goods_addtime = "goods_addtime";
	public static final String ALIAS_goods_commend = "goods_commend";
	public static final String ALIAS_goods_lock = "goods_lock";
	public static final String ALIAS_goods_selltime = "goods_selltime";
	public static final String ALIAS_goods_state = "goods_state";
	public static final String ALIAS_goods_storage_alarm = "goods_storage_alarm";
	public static final String ALIAS_goods_vat = "goods_vat";
	public static final String ALIAS_goods_verify = "goods_verify";
	public static final String ALIAS_index_recommend = "index_recommend";
	public static final String ALIAS_is_appoint = "is_appoint";
	public static final String ALIAS_is_fcode = "is_fcode";
	public static final String ALIAS_is_own_shop = "is_own_shop";
	public static final String ALIAS_is_presell = "is_presell";
	public static final String ALIAS_is_pull_kjy = "is_pull_kjy";
	public static final String ALIAS_is_virtual = "is_virtual";
	public static final String ALIAS_is_zhiyou = "is_zhiyou";
	public static final String ALIAS_mao_weight = "mao_weight";
	public static final String ALIAS_open_tax = "open_tax";
	public static final String ALIAS_plateid_bottom = "plateid_bottom";
	public static final String ALIAS_plateid_top = "plateid_top";
	public static final String ALIAS_presell_deliverdate = "presell_deliverdate";
	public static final String ALIAS_shenzhen_audit_status = "shenzhen_audit_status";
	public static final String ALIAS_shenzhen_record_status = "shenzhen_record_status";
	public static final String ALIAS_store_id = "store_id";
	public static final String ALIAS_transport_id = "transport_id";
	public static final String ALIAS_type_id = "type_id";
	public static final String ALIAS_virtual_indate = "virtual_indate";
	public static final String ALIAS_virtual_invalid_refund = "virtual_invalid_refund";
	public static final String ALIAS_virtual_limit = "virtual_limit";
	public static final String ALIAS_weight = "weight";
	public static final String ALIAS_brand_name = "brand_name";
	public static final String ALIAS_dis_inv_rate = "dis_inv_rate";
	public static final String ALIAS_dis_spec_rate = "dis_spec_rate";
	public static final String ALIAS_distribute_price = "distribute_price";
	public static final String ALIAS_distribute_rate = "distribute_rate";
	public static final String ALIAS_gc_name = "gc_name";
	public static final String ALIAS_gextends = "gextends";
	public static final String ALIAS_goods_attr = "goods_attr";
	public static final String ALIAS_goods_body = "goods_body";
	public static final String ALIAS_goods_costprice = "goods_costprice";
	public static final String ALIAS_goods_discount = "goods_discount";
	public static final String ALIAS_goods_freight = "goods_freight";
	public static final String ALIAS_goods_image = "goods_image";
	public static final String ALIAS_goods_jingle = "goods_jingle";
	public static final String ALIAS_goods_marketprice = "goods_marketprice";
	public static final String ALIAS_goods_name = "goods_name";
	public static final String ALIAS_goods_price = "goods_price";
	public static final String ALIAS_goods_serial = "goods_serial";
	public static final String ALIAS_goods_specname = "goods_specname";
	public static final String ALIAS_goods_stateremark = "goods_stateremark";
	public static final String ALIAS_goods_stcids = "goods_stcids";
	public static final String ALIAS_goods_verifyremark = "goods_verifyremark";
	public static final String ALIAS_mobile_body = "mobile_body";
	public static final String ALIAS_sharp = "sharp";
	public static final String ALIAS_shipName = "shipName";
	public static final String ALIAS_spec_name = "spec_name";
	public static final String ALIAS_spec_value = "spec_value";
	public static final String ALIAS_store_name = "store_name";
	public static final String ALIAS_tax = "tax";
	public static final String ALIAS_trafMode = "trafMode";
	public static final String ALIAS_transport_title = "transport_title";
	
	/*
	商品公共表id
	*/
	private Integer goods_commonid ;
	private Integer agree_distribute ;
	/*
	预约商品出售时间
	*/
	private Integer appoint_satedate ;
	/*
	一级地区id
	*/
	private Integer areaid_1 ;
	/*
	二级地区id
	*/
	private Integer areaid_2 ;
	/*
	品牌id
	*/
	private Integer brand_id ;
	private Integer distribute_special ;
	private Integer from_place ;
	/*
	商品分类
	*/
	private Integer gc_id ;
	/*
	一级分类id
	*/
	private Integer gc_id_1 ;
	/*
	二级分类id
	*/
	private Integer gc_id_2 ;
	/*
	三级分类id
	*/
	private Integer gc_id_3 ;
	/*
	商品添加时间
	*/
	private Integer goods_addtime ;
	/*
	商品推荐 1是，0否，默认为0
	*/
	private Integer goods_commend ;
	/*
	商品锁定 0未锁，1已锁
	*/
	private Integer goods_lock ;
	/*
	上架时间
	*/
	private Integer goods_selltime ;
	/*
	商品状态 0下架，1正常，10违规（禁售）
	*/
	private Integer goods_state ;
	/*
	库存报警值
	*/
	private Integer goods_storage_alarm ;
	/*
	是否开具增值税发票 1是，0否
	*/
	private Integer goods_vat ;
	/*
	商品审核 1通过，0未通过，10审核中
	*/
	private Integer goods_verify ;
	private Integer index_recommend ;
	/*
	是否是预约商品 1是，0否
	*/
	private Integer is_appoint ;
	/*
	是否为F码商品 1是，0否
	*/
	private Integer is_fcode ;
	/*
	是否为平台自营
	*/
	private Integer is_own_shop ;
	/*
	是否是预售商品 1是，0否
	*/
	private Integer is_presell ;
	/*
	是否已经推送跨境易
	*/
	private Integer is_pull_kjy ;
	/*
	是否为虚拟商品 1是，0否
	*/
	private Integer is_virtual ;
	private Integer is_zhiyou ;
	private Integer mao_weight ;
	private Integer open_tax ;
	/*
	底部关联板式
	*/
	private Integer plateid_bottom ;
	/*
	顶部关联板式
	*/
	private Integer plateid_top ;
	/*
	预售商品发货时间
	*/
	private Integer presell_deliverdate ;
	private Integer shenzhen_audit_status ;
	private Integer shenzhen_record_status ;
	/*
	店铺id
	*/
	private Integer store_id ;
	/*
	运费模板
	*/
	private Integer transport_id ;
	/*
	类型id
	*/
	private Integer type_id ;
	/*
	虚拟商品有效期
	*/
	private Integer virtual_indate ;
	/*
	是否允许过期退款， 1是，0否
	*/
	private Integer virtual_invalid_refund ;
	/*
	虚拟商品购买上限
	*/
	private Integer virtual_limit ;
	private Integer weight ;
	/*
	品牌名称
	*/
	private String brand_name ;
	private String dis_inv_rate ;
	private BigDecimal dis_spec_rate ;
	private BigDecimal distribute_price ;
	private String distribute_rate ;
	/*
	商品分类
	*/
	private String gc_name ;
	private String gextends ;
	/*
	商品属性
	*/
	private String goods_attr ;
	/*
	商品内容
	*/
	private String goods_body ;
	/*
	成本价
	*/
	private BigDecimal goods_costprice ;
	/*
	折扣
	*/
	private BigDecimal goods_discount ;
	/*
	运费 0为免运费
	*/
	private BigDecimal goods_freight ;
	/*
	商品主图
	*/
	private String goods_image ;
	/*
	商品广告词
	*/
	private String goods_jingle ;
	/*
	市场价
	*/
	private BigDecimal goods_marketprice ;
	/*
	商品名称
	*/
	private String goods_name ;
	/*
	商品价格
	*/
	private BigDecimal goods_price ;
	/*
	商家编号
	*/
	private String goods_serial ;
	/*
	规格名称序列化（下标为规格id）
	*/
	private String goods_specname ;
	/*
	违规原因
	*/
	private String goods_stateremark ;
	/*
	店铺分类id 首尾用,隔开
	*/
	private String goods_stcids ;
	/*
	审核失败原因
	*/
	private String goods_verifyremark ;
	/*
	手机端商品描述
	*/
	private String mobile_body ;
	private String sharp ;
	private String shipname ;
	/*
	规格名称
	*/
	private String spec_name ;
	/*
	规格值
	*/
	private String spec_value ;
	/*
	店铺名称
	*/
	private String store_name ;
	private BigDecimal tax ;
	private String trafmode ;
	/*
	运费模板名称
	*/
	private String transport_title ;
	
	public RaGoodsCommon() {
	}
	
	/**
	* 商品公共表id
	*@return 
	*/
	public Integer getGoods_commonid(){
		return  goods_commonid;
	}
	/**
	* 商品公共表id
	*@param  goods_commonid
	*/
	public void setGoods_commonid(Integer goods_commonid ){
		this.goods_commonid = goods_commonid;
	}
	
	public Integer getAgree_distribute(){
		return  agree_distribute;
	}
	public void setAgree_distribute(Integer agree_distribute ){
		this.agree_distribute = agree_distribute;
	}
	
	/**
	* 预约商品出售时间
	*@return 
	*/
	public Integer getAppoint_satedate(){
		return  appoint_satedate;
	}
	/**
	* 预约商品出售时间
	*@param  appoint_satedate
	*/
	public void setAppoint_satedate(Integer appoint_satedate ){
		this.appoint_satedate = appoint_satedate;
	}
	
	/**
	* 一级地区id
	*@return 
	*/
	public Integer getAreaid_1(){
		return  areaid_1;
	}
	/**
	* 一级地区id
	*@param  areaid_1
	*/
	public void setAreaid_1(Integer areaid_1 ){
		this.areaid_1 = areaid_1;
	}
	
	/**
	* 二级地区id
	*@return 
	*/
	public Integer getAreaid_2(){
		return  areaid_2;
	}
	/**
	* 二级地区id
	*@param  areaid_2
	*/
	public void setAreaid_2(Integer areaid_2 ){
		this.areaid_2 = areaid_2;
	}
	
	/**
	* 品牌id
	*@return 
	*/
	public Integer getBrand_id(){
		return  brand_id;
	}
	/**
	* 品牌id
	*@param  brand_id
	*/
	public void setBrand_id(Integer brand_id ){
		this.brand_id = brand_id;
	}
	
	public Integer getDistribute_special(){
		return  distribute_special;
	}
	public void setDistribute_special(Integer distribute_special ){
		this.distribute_special = distribute_special;
	}
	
	public Integer getFrom_place(){
		return  from_place;
	}
	public void setFrom_place(Integer from_place ){
		this.from_place = from_place;
	}
	
	/**
	* 商品分类
	*@return 
	*/
	public Integer getGc_id(){
		return  gc_id;
	}
	/**
	* 商品分类
	*@param  gc_id
	*/
	public void setGc_id(Integer gc_id ){
		this.gc_id = gc_id;
	}
	
	/**
	* 一级分类id
	*@return 
	*/
	public Integer getGc_id_1(){
		return  gc_id_1;
	}
	/**
	* 一级分类id
	*@param  gc_id_1
	*/
	public void setGc_id_1(Integer gc_id_1 ){
		this.gc_id_1 = gc_id_1;
	}
	
	/**
	* 二级分类id
	*@return 
	*/
	public Integer getGc_id_2(){
		return  gc_id_2;
	}
	/**
	* 二级分类id
	*@param  gc_id_2
	*/
	public void setGc_id_2(Integer gc_id_2 ){
		this.gc_id_2 = gc_id_2;
	}
	
	/**
	* 三级分类id
	*@return 
	*/
	public Integer getGc_id_3(){
		return  gc_id_3;
	}
	/**
	* 三级分类id
	*@param  gc_id_3
	*/
	public void setGc_id_3(Integer gc_id_3 ){
		this.gc_id_3 = gc_id_3;
	}
	
	/**
	* 商品添加时间
	*@return 
	*/
	public Integer getGoods_addtime(){
		return  goods_addtime;
	}
	/**
	* 商品添加时间
	*@param  goods_addtime
	*/
	public void setGoods_addtime(Integer goods_addtime ){
		this.goods_addtime = goods_addtime;
	}
	
	/**
	* 商品推荐 1是，0否，默认为0
	*@return 
	*/
	public Integer getGoods_commend(){
		return  goods_commend;
	}
	/**
	* 商品推荐 1是，0否，默认为0
	*@param  goods_commend
	*/
	public void setGoods_commend(Integer goods_commend ){
		this.goods_commend = goods_commend;
	}
	
	/**
	* 商品锁定 0未锁，1已锁
	*@return 
	*/
	public Integer getGoods_lock(){
		return  goods_lock;
	}
	/**
	* 商品锁定 0未锁，1已锁
	*@param  goods_lock
	*/
	public void setGoods_lock(Integer goods_lock ){
		this.goods_lock = goods_lock;
	}
	
	/**
	* 上架时间
	*@return 
	*/
	public Integer getGoods_selltime(){
		return  goods_selltime;
	}
	/**
	* 上架时间
	*@param  goods_selltime
	*/
	public void setGoods_selltime(Integer goods_selltime ){
		this.goods_selltime = goods_selltime;
	}
	
	/**
	* 商品状态 0下架，1正常，10违规（禁售）
	*@return 
	*/
	public Integer getGoods_state(){
		return  goods_state;
	}
	/**
	* 商品状态 0下架，1正常，10违规（禁售）
	*@param  goods_state
	*/
	public void setGoods_state(Integer goods_state ){
		this.goods_state = goods_state;
	}
	
	/**
	* 库存报警值
	*@return 
	*/
	public Integer getGoods_storage_alarm(){
		return  goods_storage_alarm;
	}
	/**
	* 库存报警值
	*@param  goods_storage_alarm
	*/
	public void setGoods_storage_alarm(Integer goods_storage_alarm ){
		this.goods_storage_alarm = goods_storage_alarm;
	}
	
	/**
	* 是否开具增值税发票 1是，0否
	*@return 
	*/
	public Integer getGoods_vat(){
		return  goods_vat;
	}
	/**
	* 是否开具增值税发票 1是，0否
	*@param  goods_vat
	*/
	public void setGoods_vat(Integer goods_vat ){
		this.goods_vat = goods_vat;
	}
	
	/**
	* 商品审核 1通过，0未通过，10审核中
	*@return 
	*/
	public Integer getGoods_verify(){
		return  goods_verify;
	}
	/**
	* 商品审核 1通过，0未通过，10审核中
	*@param  goods_verify
	*/
	public void setGoods_verify(Integer goods_verify ){
		this.goods_verify = goods_verify;
	}
	
	public Integer getIndex_recommend(){
		return  index_recommend;
	}
	public void setIndex_recommend(Integer index_recommend ){
		this.index_recommend = index_recommend;
	}
	
	/**
	* 是否是预约商品 1是，0否
	*@return 
	*/
	public Integer getIs_appoint(){
		return  is_appoint;
	}
	/**
	* 是否是预约商品 1是，0否
	*@param  is_appoint
	*/
	public void setIs_appoint(Integer is_appoint ){
		this.is_appoint = is_appoint;
	}
	
	/**
	* 是否为F码商品 1是，0否
	*@return 
	*/
	public Integer getIs_fcode(){
		return  is_fcode;
	}
	/**
	* 是否为F码商品 1是，0否
	*@param  is_fcode
	*/
	public void setIs_fcode(Integer is_fcode ){
		this.is_fcode = is_fcode;
	}
	
	/**
	* 是否为平台自营
	*@return 
	*/
	public Integer getIs_own_shop(){
		return  is_own_shop;
	}
	/**
	* 是否为平台自营
	*@param  is_own_shop
	*/
	public void setIs_own_shop(Integer is_own_shop ){
		this.is_own_shop = is_own_shop;
	}
	
	/**
	* 是否是预售商品 1是，0否
	*@return 
	*/
	public Integer getIs_presell(){
		return  is_presell;
	}
	/**
	* 是否是预售商品 1是，0否
	*@param  is_presell
	*/
	public void setIs_presell(Integer is_presell ){
		this.is_presell = is_presell;
	}
	
	/**
	* 是否已经推送跨境易
	*@return 
	*/
	public Integer getIs_pull_kjy(){
		return  is_pull_kjy;
	}
	/**
	* 是否已经推送跨境易
	*@param  is_pull_kjy
	*/
	public void setIs_pull_kjy(Integer is_pull_kjy ){
		this.is_pull_kjy = is_pull_kjy;
	}
	
	/**
	* 是否为虚拟商品 1是，0否
	*@return 
	*/
	public Integer getIs_virtual(){
		return  is_virtual;
	}
	/**
	* 是否为虚拟商品 1是，0否
	*@param  is_virtual
	*/
	public void setIs_virtual(Integer is_virtual ){
		this.is_virtual = is_virtual;
	}
	
	public Integer getIs_zhiyou(){
		return  is_zhiyou;
	}
	public void setIs_zhiyou(Integer is_zhiyou ){
		this.is_zhiyou = is_zhiyou;
	}
	
	public Integer getMao_weight(){
		return  mao_weight;
	}
	public void setMao_weight(Integer mao_weight ){
		this.mao_weight = mao_weight;
	}
	
	public Integer getOpen_tax(){
		return  open_tax;
	}
	public void setOpen_tax(Integer open_tax ){
		this.open_tax = open_tax;
	}
	
	/**
	* 底部关联板式
	*@return 
	*/
	public Integer getPlateid_bottom(){
		return  plateid_bottom;
	}
	/**
	* 底部关联板式
	*@param  plateid_bottom
	*/
	public void setPlateid_bottom(Integer plateid_bottom ){
		this.plateid_bottom = plateid_bottom;
	}
	
	/**
	* 顶部关联板式
	*@return 
	*/
	public Integer getPlateid_top(){
		return  plateid_top;
	}
	/**
	* 顶部关联板式
	*@param  plateid_top
	*/
	public void setPlateid_top(Integer plateid_top ){
		this.plateid_top = plateid_top;
	}
	
	/**
	* 预售商品发货时间
	*@return 
	*/
	public Integer getPresell_deliverdate(){
		return  presell_deliverdate;
	}
	/**
	* 预售商品发货时间
	*@param  presell_deliverdate
	*/
	public void setPresell_deliverdate(Integer presell_deliverdate ){
		this.presell_deliverdate = presell_deliverdate;
	}
	
	public Integer getShenzhen_audit_status(){
		return  shenzhen_audit_status;
	}
	public void setShenzhen_audit_status(Integer shenzhen_audit_status ){
		this.shenzhen_audit_status = shenzhen_audit_status;
	}
	
	public Integer getShenzhen_record_status(){
		return  shenzhen_record_status;
	}
	public void setShenzhen_record_status(Integer shenzhen_record_status ){
		this.shenzhen_record_status = shenzhen_record_status;
	}
	
	/**
	* 店铺id
	*@return 
	*/
	public Integer getStore_id(){
		return  store_id;
	}
	/**
	* 店铺id
	*@param  store_id
	*/
	public void setStore_id(Integer store_id ){
		this.store_id = store_id;
	}
	
	/**
	* 运费模板
	*@return 
	*/
	public Integer getTransport_id(){
		return  transport_id;
	}
	/**
	* 运费模板
	*@param  transport_id
	*/
	public void setTransport_id(Integer transport_id ){
		this.transport_id = transport_id;
	}
	
	/**
	* 类型id
	*@return 
	*/
	public Integer getType_id(){
		return  type_id;
	}
	/**
	* 类型id
	*@param  type_id
	*/
	public void setType_id(Integer type_id ){
		this.type_id = type_id;
	}
	
	/**
	* 虚拟商品有效期
	*@return 
	*/
	public Integer getVirtual_indate(){
		return  virtual_indate;
	}
	/**
	* 虚拟商品有效期
	*@param  virtual_indate
	*/
	public void setVirtual_indate(Integer virtual_indate ){
		this.virtual_indate = virtual_indate;
	}
	
	/**
	* 是否允许过期退款， 1是，0否
	*@return 
	*/
	public Integer getVirtual_invalid_refund(){
		return  virtual_invalid_refund;
	}
	/**
	* 是否允许过期退款， 1是，0否
	*@param  virtual_invalid_refund
	*/
	public void setVirtual_invalid_refund(Integer virtual_invalid_refund ){
		this.virtual_invalid_refund = virtual_invalid_refund;
	}
	
	/**
	* 虚拟商品购买上限
	*@return 
	*/
	public Integer getVirtual_limit(){
		return  virtual_limit;
	}
	/**
	* 虚拟商品购买上限
	*@param  virtual_limit
	*/
	public void setVirtual_limit(Integer virtual_limit ){
		this.virtual_limit = virtual_limit;
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
	public String getBrand_name(){
		return  brand_name;
	}
	/**
	* 品牌名称
	*@param  brand_name
	*/
	public void setBrand_name(String brand_name ){
		this.brand_name = brand_name;
	}
	
	public String getDis_inv_rate(){
		return  dis_inv_rate;
	}
	public void setDis_inv_rate(String dis_inv_rate ){
		this.dis_inv_rate = dis_inv_rate;
	}
	
	public BigDecimal getDis_spec_rate(){
		return  dis_spec_rate;
	}
	public void setDis_spec_rate(BigDecimal dis_spec_rate ){
		this.dis_spec_rate = dis_spec_rate;
	}
	
	public BigDecimal getDistribute_price(){
		return  distribute_price;
	}
	public void setDistribute_price(BigDecimal distribute_price ){
		this.distribute_price = distribute_price;
	}
	
	public String getDistribute_rate(){
		return  distribute_rate;
	}
	public void setDistribute_rate(String distribute_rate ){
		this.distribute_rate = distribute_rate;
	}
	
	/**
	* 商品分类
	*@return 
	*/
	public String getGc_name(){
		return  gc_name;
	}
	/**
	* 商品分类
	*@param  gc_name
	*/
	public void setGc_name(String gc_name ){
		this.gc_name = gc_name;
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
	public String getGoods_attr(){
		return  goods_attr;
	}
	/**
	* 商品属性
	*@param  goods_attr
	*/
	public void setGoods_attr(String goods_attr ){
		this.goods_attr = goods_attr;
	}
	
	/**
	* 商品内容
	*@return 
	*/
	public String getGoods_body(){
		return  goods_body;
	}
	/**
	* 商品内容
	*@param  goods_body
	*/
	public void setGoods_body(String goods_body ){
		this.goods_body = goods_body;
	}
	
	/**
	* 成本价
	*@return 
	*/
	public BigDecimal getGoods_costprice(){
		return  goods_costprice;
	}
	/**
	* 成本价
	*@param  goods_costprice
	*/
	public void setGoods_costprice(BigDecimal goods_costprice ){
		this.goods_costprice = goods_costprice;
	}
	
	/**
	* 折扣
	*@return 
	*/
	public BigDecimal getGoods_discount(){
		return  goods_discount;
	}
	/**
	* 折扣
	*@param  goods_discount
	*/
	public void setGoods_discount(BigDecimal goods_discount ){
		this.goods_discount = goods_discount;
	}
	
	/**
	* 运费 0为免运费
	*@return 
	*/
	public BigDecimal getGoods_freight(){
		return  goods_freight;
	}
	/**
	* 运费 0为免运费
	*@param  goods_freight
	*/
	public void setGoods_freight(BigDecimal goods_freight ){
		this.goods_freight = goods_freight;
	}
	
	/**
	* 商品主图
	*@return 
	*/
	public String getGoods_image(){
		return  goods_image;
	}
	/**
	* 商品主图
	*@param  goods_image
	*/
	public void setGoods_image(String goods_image ){
		this.goods_image = goods_image;
	}
	
	/**
	* 商品广告词
	*@return 
	*/
	public String getGoods_jingle(){
		return  goods_jingle;
	}
	/**
	* 商品广告词
	*@param  goods_jingle
	*/
	public void setGoods_jingle(String goods_jingle ){
		this.goods_jingle = goods_jingle;
	}
	
	/**
	* 市场价
	*@return 
	*/
	public BigDecimal getGoods_marketprice(){
		return  goods_marketprice;
	}
	/**
	* 市场价
	*@param  goods_marketprice
	*/
	public void setGoods_marketprice(BigDecimal goods_marketprice ){
		this.goods_marketprice = goods_marketprice;
	}
	
	/**
	* 商品名称
	*@return 
	*/
	public String getGoods_name(){
		return  goods_name;
	}
	/**
	* 商品名称
	*@param  goods_name
	*/
	public void setGoods_name(String goods_name ){
		this.goods_name = goods_name;
	}
	
	/**
	* 商品价格
	*@return 
	*/
	public BigDecimal getGoods_price(){
		return  goods_price;
	}
	/**
	* 商品价格
	*@param  goods_price
	*/
	public void setGoods_price(BigDecimal goods_price ){
		this.goods_price = goods_price;
	}
	
	/**
	* 商家编号
	*@return 
	*/
	public String getGoods_serial(){
		return  goods_serial;
	}
	/**
	* 商家编号
	*@param  goods_serial
	*/
	public void setGoods_serial(String goods_serial ){
		this.goods_serial = goods_serial;
	}
	
	/**
	* 规格名称序列化（下标为规格id）
	*@return 
	*/
	public String getGoods_specname(){
		return  goods_specname;
	}
	/**
	* 规格名称序列化（下标为规格id）
	*@param  goods_specname
	*/
	public void setGoods_specname(String goods_specname ){
		this.goods_specname = goods_specname;
	}
	
	/**
	* 违规原因
	*@return 
	*/
	public String getGoods_stateremark(){
		return  goods_stateremark;
	}
	/**
	* 违规原因
	*@param  goods_stateremark
	*/
	public void setGoods_stateremark(String goods_stateremark ){
		this.goods_stateremark = goods_stateremark;
	}
	
	/**
	* 店铺分类id 首尾用,隔开
	*@return 
	*/
	public String getGoods_stcids(){
		return  goods_stcids;
	}
	/**
	* 店铺分类id 首尾用,隔开
	*@param  goods_stcids
	*/
	public void setGoods_stcids(String goods_stcids ){
		this.goods_stcids = goods_stcids;
	}
	
	/**
	* 审核失败原因
	*@return 
	*/
	public String getGoods_verifyremark(){
		return  goods_verifyremark;
	}
	/**
	* 审核失败原因
	*@param  goods_verifyremark
	*/
	public void setGoods_verifyremark(String goods_verifyremark ){
		this.goods_verifyremark = goods_verifyremark;
	}
	
	/**
	* 手机端商品描述
	*@return 
	*/
	public String getMobile_body(){
		return  mobile_body;
	}
	/**
	* 手机端商品描述
	*@param  mobile_body
	*/
	public void setMobile_body(String mobile_body ){
		this.mobile_body = mobile_body;
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
	public String getSpec_name(){
		return  spec_name;
	}
	/**
	* 规格名称
	*@param  spec_name
	*/
	public void setSpec_name(String spec_name ){
		this.spec_name = spec_name;
	}
	
	/**
	* 规格值
	*@return 
	*/
	public String getSpec_value(){
		return  spec_value;
	}
	/**
	* 规格值
	*@param  spec_value
	*/
	public void setSpec_value(String spec_value ){
		this.spec_value = spec_value;
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
	public String getTransport_title(){
		return  transport_title;
	}
	/**
	* 运费模板名称
	*@param  transport_title
	*/
	public void setTransport_title(String transport_title ){
		this.transport_title = transport_title;
	}
	

}
