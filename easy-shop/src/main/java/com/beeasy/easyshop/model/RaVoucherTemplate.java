package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_voucher_template")
public class RaVoucherTemplate   {
	
	// alias
	public static final String ALIAS_voucher_t_id = "voucher_t_id";
	public static final String ALIAS_voucher_t_add_date = "voucher_t_add_date";
	public static final String ALIAS_voucher_t_creator_id = "voucher_t_creator_id";
	public static final String ALIAS_voucher_t_eachlimit = "voucher_t_eachlimit";
	public static final String ALIAS_voucher_t_end_date = "voucher_t_end_date";
	public static final String ALIAS_voucher_t_giveout = "voucher_t_giveout";
	public static final String ALIAS_voucher_t_points = "voucher_t_points";
	public static final String ALIAS_voucher_t_price = "voucher_t_price";
	public static final String ALIAS_voucher_t_quotaid = "voucher_t_quotaid";
	public static final String ALIAS_voucher_t_recommend = "voucher_t_recommend";
	public static final String ALIAS_voucher_t_sc_id = "voucher_t_sc_id";
	public static final String ALIAS_voucher_t_start_date = "voucher_t_start_date";
	public static final String ALIAS_voucher_t_state = "voucher_t_state";
	public static final String ALIAS_voucher_t_store_id = "voucher_t_store_id";
	public static final String ALIAS_voucher_t_total = "voucher_t_total";
	public static final String ALIAS_voucher_t_used = "voucher_t_used";
	public static final String ALIAS_voucher_t_customimg = "voucher_t_customimg";
	public static final String ALIAS_voucher_t_desc = "voucher_t_desc";
	public static final String ALIAS_voucher_t_limit = "voucher_t_limit";
	public static final String ALIAS_voucher_t_storename = "voucher_t_storename";
	public static final String ALIAS_voucher_t_styleimg = "voucher_t_styleimg";
	public static final String ALIAS_voucher_t_title = "voucher_t_title";
	
	/*
	代金券模版编号
	*/
	private Integer voucher_t_id ;
	/*
	模版的创建时间
	*/
	private Integer voucher_t_add_date ;
	/*
	代金券模版的创建者id
	*/
	private Integer voucher_t_creator_id ;
	/*
	每人限领张数
	*/
	private Integer voucher_t_eachlimit ;
	/*
	代金券模版有效期结束时间
	*/
	private Integer voucher_t_end_date ;
	/*
	模版已发放的代金券数量
	*/
	private Integer voucher_t_giveout ;
	/*
	兑换所需积分
	*/
	private Integer voucher_t_points ;
	/*
	代金券模版面额
	*/
	private Integer voucher_t_price ;
	/*
	套餐编号
	*/
	private Integer voucher_t_quotaid ;
	/*
	是否推荐 0不推荐 1推荐
	*/
	private Integer voucher_t_recommend ;
	/*
	所属店铺分类ID
	*/
	private Integer voucher_t_sc_id ;
	/*
	代金券模版有效期开始时间
	*/
	private Integer voucher_t_start_date ;
	/*
	代金券模版状态(1-有效,2-失效)
	*/
	private Integer voucher_t_state ;
	/*
	代金券模版的店铺id
	*/
	private Integer voucher_t_store_id ;
	/*
	模版可发放的代金券总数
	*/
	private Integer voucher_t_total ;
	/*
	模版已经使用过的代金券
	*/
	private Integer voucher_t_used ;
	/*
	自定义代金券模板图片
	*/
	private String voucher_t_customimg ;
	/*
	代金券模版描述
	*/
	private String voucher_t_desc ;
	/*
	代金券使用时的订单限额
	*/
	private BigDecimal voucher_t_limit ;
	/*
	店铺名称
	*/
	private String voucher_t_storename ;
	/*
	样式模版图片
	*/
	private String voucher_t_styleimg ;
	/*
	代金券模版名称
	*/
	private String voucher_t_title ;
	
	public RaVoucherTemplate() {
	}
	
	/**
	* 代金券模版编号
	*@return 
	*/
	public Integer getVoucher_t_id(){
		return  voucher_t_id;
	}
	/**
	* 代金券模版编号
	*@param  voucher_t_id
	*/
	public void setVoucher_t_id(Integer voucher_t_id ){
		this.voucher_t_id = voucher_t_id;
	}
	
	/**
	* 模版的创建时间
	*@return 
	*/
	public Integer getVoucher_t_add_date(){
		return  voucher_t_add_date;
	}
	/**
	* 模版的创建时间
	*@param  voucher_t_add_date
	*/
	public void setVoucher_t_add_date(Integer voucher_t_add_date ){
		this.voucher_t_add_date = voucher_t_add_date;
	}
	
	/**
	* 代金券模版的创建者id
	*@return 
	*/
	public Integer getVoucher_t_creator_id(){
		return  voucher_t_creator_id;
	}
	/**
	* 代金券模版的创建者id
	*@param  voucher_t_creator_id
	*/
	public void setVoucher_t_creator_id(Integer voucher_t_creator_id ){
		this.voucher_t_creator_id = voucher_t_creator_id;
	}
	
	/**
	* 每人限领张数
	*@return 
	*/
	public Integer getVoucher_t_eachlimit(){
		return  voucher_t_eachlimit;
	}
	/**
	* 每人限领张数
	*@param  voucher_t_eachlimit
	*/
	public void setVoucher_t_eachlimit(Integer voucher_t_eachlimit ){
		this.voucher_t_eachlimit = voucher_t_eachlimit;
	}
	
	/**
	* 代金券模版有效期结束时间
	*@return 
	*/
	public Integer getVoucher_t_end_date(){
		return  voucher_t_end_date;
	}
	/**
	* 代金券模版有效期结束时间
	*@param  voucher_t_end_date
	*/
	public void setVoucher_t_end_date(Integer voucher_t_end_date ){
		this.voucher_t_end_date = voucher_t_end_date;
	}
	
	/**
	* 模版已发放的代金券数量
	*@return 
	*/
	public Integer getVoucher_t_giveout(){
		return  voucher_t_giveout;
	}
	/**
	* 模版已发放的代金券数量
	*@param  voucher_t_giveout
	*/
	public void setVoucher_t_giveout(Integer voucher_t_giveout ){
		this.voucher_t_giveout = voucher_t_giveout;
	}
	
	/**
	* 兑换所需积分
	*@return 
	*/
	public Integer getVoucher_t_points(){
		return  voucher_t_points;
	}
	/**
	* 兑换所需积分
	*@param  voucher_t_points
	*/
	public void setVoucher_t_points(Integer voucher_t_points ){
		this.voucher_t_points = voucher_t_points;
	}
	
	/**
	* 代金券模版面额
	*@return 
	*/
	public Integer getVoucher_t_price(){
		return  voucher_t_price;
	}
	/**
	* 代金券模版面额
	*@param  voucher_t_price
	*/
	public void setVoucher_t_price(Integer voucher_t_price ){
		this.voucher_t_price = voucher_t_price;
	}
	
	/**
	* 套餐编号
	*@return 
	*/
	public Integer getVoucher_t_quotaid(){
		return  voucher_t_quotaid;
	}
	/**
	* 套餐编号
	*@param  voucher_t_quotaid
	*/
	public void setVoucher_t_quotaid(Integer voucher_t_quotaid ){
		this.voucher_t_quotaid = voucher_t_quotaid;
	}
	
	/**
	* 是否推荐 0不推荐 1推荐
	*@return 
	*/
	public Integer getVoucher_t_recommend(){
		return  voucher_t_recommend;
	}
	/**
	* 是否推荐 0不推荐 1推荐
	*@param  voucher_t_recommend
	*/
	public void setVoucher_t_recommend(Integer voucher_t_recommend ){
		this.voucher_t_recommend = voucher_t_recommend;
	}
	
	/**
	* 所属店铺分类ID
	*@return 
	*/
	public Integer getVoucher_t_sc_id(){
		return  voucher_t_sc_id;
	}
	/**
	* 所属店铺分类ID
	*@param  voucher_t_sc_id
	*/
	public void setVoucher_t_sc_id(Integer voucher_t_sc_id ){
		this.voucher_t_sc_id = voucher_t_sc_id;
	}
	
	/**
	* 代金券模版有效期开始时间
	*@return 
	*/
	public Integer getVoucher_t_start_date(){
		return  voucher_t_start_date;
	}
	/**
	* 代金券模版有效期开始时间
	*@param  voucher_t_start_date
	*/
	public void setVoucher_t_start_date(Integer voucher_t_start_date ){
		this.voucher_t_start_date = voucher_t_start_date;
	}
	
	/**
	* 代金券模版状态(1-有效,2-失效)
	*@return 
	*/
	public Integer getVoucher_t_state(){
		return  voucher_t_state;
	}
	/**
	* 代金券模版状态(1-有效,2-失效)
	*@param  voucher_t_state
	*/
	public void setVoucher_t_state(Integer voucher_t_state ){
		this.voucher_t_state = voucher_t_state;
	}
	
	/**
	* 代金券模版的店铺id
	*@return 
	*/
	public Integer getVoucher_t_store_id(){
		return  voucher_t_store_id;
	}
	/**
	* 代金券模版的店铺id
	*@param  voucher_t_store_id
	*/
	public void setVoucher_t_store_id(Integer voucher_t_store_id ){
		this.voucher_t_store_id = voucher_t_store_id;
	}
	
	/**
	* 模版可发放的代金券总数
	*@return 
	*/
	public Integer getVoucher_t_total(){
		return  voucher_t_total;
	}
	/**
	* 模版可发放的代金券总数
	*@param  voucher_t_total
	*/
	public void setVoucher_t_total(Integer voucher_t_total ){
		this.voucher_t_total = voucher_t_total;
	}
	
	/**
	* 模版已经使用过的代金券
	*@return 
	*/
	public Integer getVoucher_t_used(){
		return  voucher_t_used;
	}
	/**
	* 模版已经使用过的代金券
	*@param  voucher_t_used
	*/
	public void setVoucher_t_used(Integer voucher_t_used ){
		this.voucher_t_used = voucher_t_used;
	}
	
	/**
	* 自定义代金券模板图片
	*@return 
	*/
	public String getVoucher_t_customimg(){
		return  voucher_t_customimg;
	}
	/**
	* 自定义代金券模板图片
	*@param  voucher_t_customimg
	*/
	public void setVoucher_t_customimg(String voucher_t_customimg ){
		this.voucher_t_customimg = voucher_t_customimg;
	}
	
	/**
	* 代金券模版描述
	*@return 
	*/
	public String getVoucher_t_desc(){
		return  voucher_t_desc;
	}
	/**
	* 代金券模版描述
	*@param  voucher_t_desc
	*/
	public void setVoucher_t_desc(String voucher_t_desc ){
		this.voucher_t_desc = voucher_t_desc;
	}
	
	/**
	* 代金券使用时的订单限额
	*@return 
	*/
	public BigDecimal getVoucher_t_limit(){
		return  voucher_t_limit;
	}
	/**
	* 代金券使用时的订单限额
	*@param  voucher_t_limit
	*/
	public void setVoucher_t_limit(BigDecimal voucher_t_limit ){
		this.voucher_t_limit = voucher_t_limit;
	}
	
	/**
	* 店铺名称
	*@return 
	*/
	public String getVoucher_t_storename(){
		return  voucher_t_storename;
	}
	/**
	* 店铺名称
	*@param  voucher_t_storename
	*/
	public void setVoucher_t_storename(String voucher_t_storename ){
		this.voucher_t_storename = voucher_t_storename;
	}
	
	/**
	* 样式模版图片
	*@return 
	*/
	public String getVoucher_t_styleimg(){
		return  voucher_t_styleimg;
	}
	/**
	* 样式模版图片
	*@param  voucher_t_styleimg
	*/
	public void setVoucher_t_styleimg(String voucher_t_styleimg ){
		this.voucher_t_styleimg = voucher_t_styleimg;
	}
	
	/**
	* 代金券模版名称
	*@return 
	*/
	public String getVoucher_t_title(){
		return  voucher_t_title;
	}
	/**
	* 代金券模版名称
	*@param  voucher_t_title
	*/
	public void setVoucher_t_title(String voucher_t_title ){
		this.voucher_t_title = voucher_t_title;
	}
	

}
