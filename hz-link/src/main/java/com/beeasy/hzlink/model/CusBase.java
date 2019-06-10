package com.beeasy.hzlink.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;

import org.beetl.sql.core.annotatoin.AssignID;

/*
* 
* gen by beetlsql 2019-06-10
*/
@Table(name="CUS_BASE")
public class CusBase   {

	/*
	客户代码
	*/
    @AssignID()
	private String cus_id ;
	/*
	证件号码
	*/
	private String cert_code ;
	/*
	证件类型
	*/
	private String cert_type ;
	/*
	联系人
	*/
	private String contact_name ;
	/*
	法人代码
	*/
	private String creunit_no ;
	/*
	客户名称
	*/
	private String cus_name ;
	/*
	客户简称
	*/
	private String cus_short_name ;
	/*
	客户类型
	*/
	private String cus_type ;
	/*
	数据中心代码
	*/
	private String data_center_no ;
	/*
	最早开户日期
	*/
	private String open_date ;
	/*
	联系电话
	*/
	private String phone ;
	/*
	银行号
	*/
	private String soc_no ;
	/*
	源系统代码
	*/
	private String src_sys_cd ;
	/*
	源系统日期
	*/
	private String src_sys_date ;
	/*
	平台日期
	*/
	private String sys_biz_date ;
	private String trans_cus_id ;

	public CusBase() {
	}

	/**
	* 客户代码
	*@return
	*/
	public String getCus_id(){
		return  cus_id;
	}
	/**
	* 客户代码
	*@param  cus_id
	*/
	public void setCus_id(String cus_id ){
		this.cus_id = cus_id;
	}

	/**
	* 证件号码
	*@return
	*/
	public String getCert_code(){
		return  cert_code;
	}
	/**
	* 证件号码
	*@param  cert_code
	*/
	public void setCert_code(String cert_code ){
		this.cert_code = cert_code;
	}

	/**
	* 证件类型
	*@return
	*/
	public String getCert_type(){
		return  cert_type;
	}
	/**
	* 证件类型
	*@param  cert_type
	*/
	public void setCert_type(String cert_type ){
		this.cert_type = cert_type;
	}

	/**
	* 联系人
	*@return
	*/
	public String getContact_name(){
		return  contact_name;
	}
	/**
	* 联系人
	*@param  contact_name
	*/
	public void setContact_name(String contact_name ){
		this.contact_name = contact_name;
	}

	/**
	* 法人代码
	*@return
	*/
	public String getCreunit_no(){
		return  creunit_no;
	}
	/**
	* 法人代码
	*@param  creunit_no
	*/
	public void setCreunit_no(String creunit_no ){
		this.creunit_no = creunit_no;
	}

	/**
	* 客户名称
	*@return
	*/
	public String getCus_name(){
		return  cus_name;
	}
	/**
	* 客户名称
	*@param  cus_name
	*/
	public void setCus_name(String cus_name ){
		this.cus_name = cus_name;
	}

	/**
	* 客户简称
	*@return
	*/
	public String getCus_short_name(){
		return  cus_short_name;
	}
	/**
	* 客户简称
	*@param  cus_short_name
	*/
	public void setCus_short_name(String cus_short_name ){
		this.cus_short_name = cus_short_name;
	}

	/**
	* 客户类型
	*@return
	*/
	public String getCus_type(){
		return  cus_type;
	}
	/**
	* 客户类型
	*@param  cus_type
	*/
	public void setCus_type(String cus_type ){
		this.cus_type = cus_type;
	}

	/**
	* 数据中心代码
	*@return
	*/
	public String getData_center_no(){
		return  data_center_no;
	}
	/**
	* 数据中心代码
	*@param  data_center_no
	*/
	public void setData_center_no(String data_center_no ){
		this.data_center_no = data_center_no;
	}

	/**
	* 最早开户日期
	*@return
	*/
	public String getOpen_date(){
		return  open_date;
	}
	/**
	* 最早开户日期
	*@param  open_date
	*/
	public void setOpen_date(String open_date ){
		this.open_date = open_date;
	}

	/**
	* 联系电话
	*@return
	*/
	public String getPhone(){
		return  phone;
	}
	/**
	* 联系电话
	*@param  phone
	*/
	public void setPhone(String phone ){
		this.phone = phone;
	}

	/**
	* 银行号
	*@return
	*/
	public String getSoc_no(){
		return  soc_no;
	}
	/**
	* 银行号
	*@param  soc_no
	*/
	public void setSoc_no(String soc_no ){
		this.soc_no = soc_no;
	}

	/**
	* 源系统代码
	*@return
	*/
	public String getSrc_sys_cd(){
		return  src_sys_cd;
	}
	/**
	* 源系统代码
	*@param  src_sys_cd
	*/
	public void setSrc_sys_cd(String src_sys_cd ){
		this.src_sys_cd = src_sys_cd;
	}

	/**
	* 源系统日期
	*@return
	*/
	public String getSrc_sys_date(){
		return  src_sys_date;
	}
	/**
	* 源系统日期
	*@param  src_sys_date
	*/
	public void setSrc_sys_date(String src_sys_date ){
		this.src_sys_date = src_sys_date;
	}

	/**
	* 平台日期
	*@return
	*/
	public String getSys_biz_date(){
		return  sys_biz_date;
	}
	/**
	* 平台日期
	*@param  sys_biz_date
	*/
	public void setSys_biz_date(String sys_biz_date ){
		this.sys_biz_date = sys_biz_date;
	}

	public String getTrans_cus_id(){
		return  trans_cus_id;
	}
	public void setTrans_cus_id(String trans_cus_id ){
		this.trans_cus_id = trans_cus_id;
	}


}
