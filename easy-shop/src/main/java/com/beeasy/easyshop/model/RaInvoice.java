package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_invoice")
public class RaInvoice   {
	
	// alias
	public static final String ALIAS_inv_id = "inv_id";
	public static final String ALIAS_member_id = "member_id";
	public static final String ALIAS_inv_code = "inv_code";
	public static final String ALIAS_inv_company = "inv_company";
	public static final String ALIAS_inv_content = "inv_content";
	public static final String ALIAS_inv_goto_addr = "inv_goto_addr";
	public static final String ALIAS_inv_rec_mobphone = "inv_rec_mobphone";
	public static final String ALIAS_inv_rec_name = "inv_rec_name";
	public static final String ALIAS_inv_rec_province = "inv_rec_province";
	public static final String ALIAS_inv_reg_addr = "inv_reg_addr";
	public static final String ALIAS_inv_reg_baccount = "inv_reg_baccount";
	public static final String ALIAS_inv_reg_bname = "inv_reg_bname";
	public static final String ALIAS_inv_reg_phone = "inv_reg_phone";
	public static final String ALIAS_inv_state = "inv_state";
	public static final String ALIAS_inv_title = "inv_title";
	
	/*
	索引id
	*/
	private Integer inv_id ;
	/*
	会员ID
	*/
	private Integer member_id ;
	/*
	纳税人识别号
	*/
	private String inv_code ;
	/*
	单位名称
	*/
	private String inv_company ;
	/*
	发票内容[普通发票]
	*/
	private String inv_content ;
	/*
	送票地址
	*/
	private String inv_goto_addr ;
	/*
	收票人手机号
	*/
	private String inv_rec_mobphone ;
	/*
	收票人姓名
	*/
	private String inv_rec_name ;
	/*
	收票人省份
	*/
	private String inv_rec_province ;
	/*
	注册地址
	*/
	private String inv_reg_addr ;
	/*
	银行帐户
	*/
	private String inv_reg_baccount ;
	/*
	开户银行
	*/
	private String inv_reg_bname ;
	/*
	注册电话
	*/
	private String inv_reg_phone ;
	/*
	1普通发票2增值税发票
	*/
	private String inv_state ;
	/*
	发票抬头[普通发票]
	*/
	private String inv_title ;
	
	public RaInvoice() {
	}
	
	/**
	* 索引id
	*@return 
	*/
	public Integer getInv_id(){
		return  inv_id;
	}
	/**
	* 索引id
	*@param  inv_id
	*/
	public void setInv_id(Integer inv_id ){
		this.inv_id = inv_id;
	}
	
	/**
	* 会员ID
	*@return 
	*/
	public Integer getMember_id(){
		return  member_id;
	}
	/**
	* 会员ID
	*@param  member_id
	*/
	public void setMember_id(Integer member_id ){
		this.member_id = member_id;
	}
	
	/**
	* 纳税人识别号
	*@return 
	*/
	public String getInv_code(){
		return  inv_code;
	}
	/**
	* 纳税人识别号
	*@param  inv_code
	*/
	public void setInv_code(String inv_code ){
		this.inv_code = inv_code;
	}
	
	/**
	* 单位名称
	*@return 
	*/
	public String getInv_company(){
		return  inv_company;
	}
	/**
	* 单位名称
	*@param  inv_company
	*/
	public void setInv_company(String inv_company ){
		this.inv_company = inv_company;
	}
	
	/**
	* 发票内容[普通发票]
	*@return 
	*/
	public String getInv_content(){
		return  inv_content;
	}
	/**
	* 发票内容[普通发票]
	*@param  inv_content
	*/
	public void setInv_content(String inv_content ){
		this.inv_content = inv_content;
	}
	
	/**
	* 送票地址
	*@return 
	*/
	public String getInv_goto_addr(){
		return  inv_goto_addr;
	}
	/**
	* 送票地址
	*@param  inv_goto_addr
	*/
	public void setInv_goto_addr(String inv_goto_addr ){
		this.inv_goto_addr = inv_goto_addr;
	}
	
	/**
	* 收票人手机号
	*@return 
	*/
	public String getInv_rec_mobphone(){
		return  inv_rec_mobphone;
	}
	/**
	* 收票人手机号
	*@param  inv_rec_mobphone
	*/
	public void setInv_rec_mobphone(String inv_rec_mobphone ){
		this.inv_rec_mobphone = inv_rec_mobphone;
	}
	
	/**
	* 收票人姓名
	*@return 
	*/
	public String getInv_rec_name(){
		return  inv_rec_name;
	}
	/**
	* 收票人姓名
	*@param  inv_rec_name
	*/
	public void setInv_rec_name(String inv_rec_name ){
		this.inv_rec_name = inv_rec_name;
	}
	
	/**
	* 收票人省份
	*@return 
	*/
	public String getInv_rec_province(){
		return  inv_rec_province;
	}
	/**
	* 收票人省份
	*@param  inv_rec_province
	*/
	public void setInv_rec_province(String inv_rec_province ){
		this.inv_rec_province = inv_rec_province;
	}
	
	/**
	* 注册地址
	*@return 
	*/
	public String getInv_reg_addr(){
		return  inv_reg_addr;
	}
	/**
	* 注册地址
	*@param  inv_reg_addr
	*/
	public void setInv_reg_addr(String inv_reg_addr ){
		this.inv_reg_addr = inv_reg_addr;
	}
	
	/**
	* 银行帐户
	*@return 
	*/
	public String getInv_reg_baccount(){
		return  inv_reg_baccount;
	}
	/**
	* 银行帐户
	*@param  inv_reg_baccount
	*/
	public void setInv_reg_baccount(String inv_reg_baccount ){
		this.inv_reg_baccount = inv_reg_baccount;
	}
	
	/**
	* 开户银行
	*@return 
	*/
	public String getInv_reg_bname(){
		return  inv_reg_bname;
	}
	/**
	* 开户银行
	*@param  inv_reg_bname
	*/
	public void setInv_reg_bname(String inv_reg_bname ){
		this.inv_reg_bname = inv_reg_bname;
	}
	
	/**
	* 注册电话
	*@return 
	*/
	public String getInv_reg_phone(){
		return  inv_reg_phone;
	}
	/**
	* 注册电话
	*@param  inv_reg_phone
	*/
	public void setInv_reg_phone(String inv_reg_phone ){
		this.inv_reg_phone = inv_reg_phone;
	}
	
	/**
	* 1普通发票2增值税发票
	*@return 
	*/
	public String getInv_state(){
		return  inv_state;
	}
	/**
	* 1普通发票2增值税发票
	*@param  inv_state
	*/
	public void setInv_state(String inv_state ){
		this.inv_state = inv_state;
	}
	
	/**
	* 发票抬头[普通发票]
	*@return 
	*/
	public String getInv_title(){
		return  inv_title;
	}
	/**
	* 发票抬头[普通发票]
	*@param  inv_title
	*/
	public void setInv_title(String inv_title ){
		this.inv_title = inv_title;
	}
	

}
