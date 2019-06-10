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
@Table(name="CUS_INDIV")
public class CusIndiv   {

	/*
	内部客户号
	*/
    @AssignID()
	private String inner_cus_id ;
	/*
	授权状态
	*/
	private String accredit_status ;
	/*
	是否农户
	*/
	private String agri_flg ;
	/*
	区域编码
	*/
	private String area_code ;
	/*
	区域名称
	*/
	private String area_name ;
	/*
	在我行职务
	*/
	private String bank_duty ;
	/*
	证件号码
	*/
	private String cert_code ;
	/*
	证件类型
	*/
	private String cert_type ;
	/*
	修改时间
	*/
	private String chg_time ;
	/*
	拥有我行股份金额
	*/
	private BigDecimal com_hold_stk_amt ;
	/*
	建立信贷关系时间
	*/
	private String com_init_loan_date ;
	/*
	与我行合作关系
	*/
	private String com_rel_dgr ;
	/*
	信用评定日期
	*/
	private String crd_date ;
	/*
	信用评定到期日期
	*/
	private String crd_end_dt ;
	/*
	信用等级
	*/
	private String crd_grade ;
	/*
	法人代码
	*/
	private String creunit_no ;
	/*
	客户经理
	*/
	private String cust_mgr ;
	/*
	客户与我行关系
	*/
	private String cus_bank_rel ;
	/*
	客户代码
	*/
	private String cus_id ;
	/*
	CUS_ID_REL
	*/
	private String cus_id_rel ;
	/*
	姓名
	*/
	private String cus_name ;
	/*
	状态
	*/
	private String cus_status ;
	/*
	客户类型
	*/
	private String cus_type ;
	/*
	数据中心代码
	*/
	private String data_center_no ;
	/*
	Email地址
	*/
	private String email ;
	/*
	传真
	*/
	private String fax_code ;
	/*
	FORMER_NAME
	*/
	private String former_name ;
	/*
	家庭电话
	*/
	private String fphone ;
	/*
	港澳台身份证号
	*/
	private String gat_cert_code ;
	/*
	持卡情况
	*/
	private String hold_card ;
	/*
	年收入情况
	*/
	private BigDecimal indiv_ann_incm ;
	/*
	籍贯
	*/
	private String indiv_brt_place ;
	/*
	单位地址
	*/
	private String indiv_com_addr ;
	/*
	单位联系人
	*/
	private String indiv_com_cnt_name ;
	/*
	单位传真
	*/
	private String indiv_com_fax ;
	/*
	单位所属行业
	*/
	private String indiv_com_fld ;
	/*
	所属行业名称
	*/
	private String indiv_com_fld_name ;
	/*
	职务
	*/
	private String indiv_com_job_ttl ;
	/*
	工作单位
	*/
	private String indiv_com_name ;
	/*
	单位电话
	*/
	private String indiv_com_phn ;
	/*
	单位性质
	*/
	private String indiv_com_typ ;
	/*
	单位邮编
	*/
	private String indiv_com_zip_code ;
	/*
	客户国籍
	*/
	private String indiv_country ;
	/*
	职称
	*/
	private String indiv_crtfctn ;
	/*
	最高学位
	*/
	private String indiv_dgr ;
	/*
	出生年月日
	*/
	private String indiv_dt_of_birth ;
	/*
	文化程度（最高学历）
	*/
	private String indiv_edt ;
	/*
	健康状况
	*/
	private String indiv_heal_st ;
	/*
	在我行开立账户情况
	*/
	private String indiv_hld_acnt ;
	/*
	爱好
	*/
	private String indiv_hobby ;
	/*
	户籍地址
	*/
	private String indiv_houh_reg_add ;
	/*
	证件到期日
	*/
	private String indiv_id_exp_dt ;
	/*
	婚姻状况
	*/
	private String indiv_mar_st ;
	/*
	民族
	*/
	private String indiv_ntn ;
	/*
	从事职业
	*/
	private String indiv_occ ;
	/*
	政治面貌
	*/
	private String indiv_pol_st ;
	/*
	INDIV_PSP_CRTFCTN
	*/
	private String indiv_psp_crtfctn ;
	/*
	居住地址
	*/
	private String indiv_rsd_addr ;
	/*
	居住状况
	*/
	private String indiv_rsd_st ;
	/*
	工资账户开户行
	*/
	private String indiv_sal_acc_bank ;
	/*
	工资账号
	*/
	private String indiv_sal_acc_no ;
	/*
	配偶工作单位
	*/
	private String indiv_scom_name ;
	/*
	性别
	*/
	private String indiv_sex ;
	/*
	社会保障情况
	*/
	private String indiv_soc_scr ;
	/*
	配偶职务
	*/
	private String indiv_sps_duty ;
	/*
	配偶证件号码
	*/
	private String indiv_sps_id_code ;
	/*
	配偶证件类型
	*/
	private String indiv_sps_id_typ ;
	/*
	配偶参加工作时间
	*/
	private String indiv_sps_job_dt ;
	/*
	INDIV_SPS_MAR_CODE
	*/
	private String indiv_sps_mar_code ;
	/*
	配偶年收入
	*/
	private BigDecimal indiv_sps_mincm ;
	/*
	配偶手机号码
	*/
	private String indiv_sps_mphn ;
	/*
	配偶姓名
	*/
	private String indiv_sps_name ;
	/*
	配偶职业
	*/
	private String indiv_sps_occ ;
	/*
	配偶单位联系电话
	*/
	private String indiv_sps_phn ;
	/*
	单位工作起始年
	*/
	private String indiv_work_job_y ;
	/*
	居住地邮政编码
	*/
	private String indiv_zip_code ;
	/*
	登记机构
	*/
	private String input_br_id ;
	/*
	登记日期
	*/
	private String input_date ;
	/*
	登记人
	*/
	private String input_id ;
	/*
	更新日期
	*/
	private String last_upd_date ;
	/*
	更新人
	*/
	private String last_upd_id ;
	/*
	LAY_OFF_CODE
	*/
	private String lay_off_code ;
	/*
	LAY_OFF_FLAG
	*/
	private String lay_off_flag ;
	/*
	贷款卡最近年审日期
	*/
	private String loan_card_audit_dt ;
	/*
	贷款卡有效标志
	*/
	private String loan_card_eff_flg ;
	/*
	有无贷款卡
	*/
	private String loan_card_flg ;
	/*
	贷款卡
	*/
	private String loan_card_id ;
	/*
	贷款卡密码
	*/
	private String loan_card_pwd ;
	/*
	主管机构
	*/
	private String main_br_id ;
	/*
	所属法人机构
	*/
	private String mng_br_id ;
	/*
	手机
	*/
	private String mobile ;
	/*
	开立日期
	*/
	private String openday ;
	/*
	其他年收入（元）
	*/
	private BigDecimal other_annual_incm ;
	/*
	其他收入渠道
	*/
	private String other_rev_incm ;
	/*
	是否拥有外国护照或居住权
	*/
	private String passport_flg ;
	/*
	联系电话
	*/
	private String phone ;
	/*
	通讯地址
	*/
	private String post_addr ;
	/*
	邮政编码
	*/
	private String post_code ;
	/*
	备注
	*/
	private String remark ;
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
	/*
	WORK_RESUME
	*/
	private String work_resume ;

	public CusIndiv() {
	}

	/**
	* 内部客户号
	*@return
	*/
	public String getInner_cus_id(){
		return  inner_cus_id;
	}
	/**
	* 内部客户号
	*@param  inner_cus_id
	*/
	public void setInner_cus_id(String inner_cus_id ){
		this.inner_cus_id = inner_cus_id;
	}

	/**
	* 授权状态
	*@return
	*/
	public String getAccredit_status(){
		return  accredit_status;
	}
	/**
	* 授权状态
	*@param  accredit_status
	*/
	public void setAccredit_status(String accredit_status ){
		this.accredit_status = accredit_status;
	}

	/**
	* 是否农户
	*@return
	*/
	public String getAgri_flg(){
		return  agri_flg;
	}
	/**
	* 是否农户
	*@param  agri_flg
	*/
	public void setAgri_flg(String agri_flg ){
		this.agri_flg = agri_flg;
	}

	/**
	* 区域编码
	*@return
	*/
	public String getArea_code(){
		return  area_code;
	}
	/**
	* 区域编码
	*@param  area_code
	*/
	public void setArea_code(String area_code ){
		this.area_code = area_code;
	}

	/**
	* 区域名称
	*@return
	*/
	public String getArea_name(){
		return  area_name;
	}
	/**
	* 区域名称
	*@param  area_name
	*/
	public void setArea_name(String area_name ){
		this.area_name = area_name;
	}

	/**
	* 在我行职务
	*@return
	*/
	public String getBank_duty(){
		return  bank_duty;
	}
	/**
	* 在我行职务
	*@param  bank_duty
	*/
	public void setBank_duty(String bank_duty ){
		this.bank_duty = bank_duty;
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
	* 修改时间
	*@return
	*/
	public String getChg_time(){
		return  chg_time;
	}
	/**
	* 修改时间
	*@param  chg_time
	*/
	public void setChg_time(String chg_time ){
		this.chg_time = chg_time;
	}

	/**
	* 拥有我行股份金额
	*@return
	*/
	public BigDecimal getCom_hold_stk_amt(){
		return  com_hold_stk_amt;
	}
	/**
	* 拥有我行股份金额
	*@param  com_hold_stk_amt
	*/
	public void setCom_hold_stk_amt(BigDecimal com_hold_stk_amt ){
		this.com_hold_stk_amt = com_hold_stk_amt;
	}

	/**
	* 建立信贷关系时间
	*@return
	*/
	public String getCom_init_loan_date(){
		return  com_init_loan_date;
	}
	/**
	* 建立信贷关系时间
	*@param  com_init_loan_date
	*/
	public void setCom_init_loan_date(String com_init_loan_date ){
		this.com_init_loan_date = com_init_loan_date;
	}

	/**
	* 与我行合作关系
	*@return
	*/
	public String getCom_rel_dgr(){
		return  com_rel_dgr;
	}
	/**
	* 与我行合作关系
	*@param  com_rel_dgr
	*/
	public void setCom_rel_dgr(String com_rel_dgr ){
		this.com_rel_dgr = com_rel_dgr;
	}

	/**
	* 信用评定日期
	*@return
	*/
	public String getCrd_date(){
		return  crd_date;
	}
	/**
	* 信用评定日期
	*@param  crd_date
	*/
	public void setCrd_date(String crd_date ){
		this.crd_date = crd_date;
	}

	/**
	* 信用评定到期日期
	*@return
	*/
	public String getCrd_end_dt(){
		return  crd_end_dt;
	}
	/**
	* 信用评定到期日期
	*@param  crd_end_dt
	*/
	public void setCrd_end_dt(String crd_end_dt ){
		this.crd_end_dt = crd_end_dt;
	}

	/**
	* 信用等级
	*@return
	*/
	public String getCrd_grade(){
		return  crd_grade;
	}
	/**
	* 信用等级
	*@param  crd_grade
	*/
	public void setCrd_grade(String crd_grade ){
		this.crd_grade = crd_grade;
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
	* 客户经理
	*@return
	*/
	public String getCust_mgr(){
		return  cust_mgr;
	}
	/**
	* 客户经理
	*@param  cust_mgr
	*/
	public void setCust_mgr(String cust_mgr ){
		this.cust_mgr = cust_mgr;
	}

	/**
	* 客户与我行关系
	*@return
	*/
	public String getCus_bank_rel(){
		return  cus_bank_rel;
	}
	/**
	* 客户与我行关系
	*@param  cus_bank_rel
	*/
	public void setCus_bank_rel(String cus_bank_rel ){
		this.cus_bank_rel = cus_bank_rel;
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
	* CUS_ID_REL
	*@return
	*/
	public String getCus_id_rel(){
		return  cus_id_rel;
	}
	/**
	* CUS_ID_REL
	*@param  cus_id_rel
	*/
	public void setCus_id_rel(String cus_id_rel ){
		this.cus_id_rel = cus_id_rel;
	}

	/**
	* 姓名
	*@return
	*/
	public String getCus_name(){
		return  cus_name;
	}
	/**
	* 姓名
	*@param  cus_name
	*/
	public void setCus_name(String cus_name ){
		this.cus_name = cus_name;
	}

	/**
	* 状态
	*@return
	*/
	public String getCus_status(){
		return  cus_status;
	}
	/**
	* 状态
	*@param  cus_status
	*/
	public void setCus_status(String cus_status ){
		this.cus_status = cus_status;
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
	* Email地址
	*@return
	*/
	public String getEmail(){
		return  email;
	}
	/**
	* Email地址
	*@param  email
	*/
	public void setEmail(String email ){
		this.email = email;
	}

	/**
	* 传真
	*@return
	*/
	public String getFax_code(){
		return  fax_code;
	}
	/**
	* 传真
	*@param  fax_code
	*/
	public void setFax_code(String fax_code ){
		this.fax_code = fax_code;
	}

	/**
	* FORMER_NAME
	*@return
	*/
	public String getFormer_name(){
		return  former_name;
	}
	/**
	* FORMER_NAME
	*@param  former_name
	*/
	public void setFormer_name(String former_name ){
		this.former_name = former_name;
	}

	/**
	* 家庭电话
	*@return
	*/
	public String getFphone(){
		return  fphone;
	}
	/**
	* 家庭电话
	*@param  fphone
	*/
	public void setFphone(String fphone ){
		this.fphone = fphone;
	}

	/**
	* 港澳台身份证号
	*@return
	*/
	public String getGat_cert_code(){
		return  gat_cert_code;
	}
	/**
	* 港澳台身份证号
	*@param  gat_cert_code
	*/
	public void setGat_cert_code(String gat_cert_code ){
		this.gat_cert_code = gat_cert_code;
	}

	/**
	* 持卡情况
	*@return
	*/
	public String getHold_card(){
		return  hold_card;
	}
	/**
	* 持卡情况
	*@param  hold_card
	*/
	public void setHold_card(String hold_card ){
		this.hold_card = hold_card;
	}

	/**
	* 年收入情况
	*@return
	*/
	public BigDecimal getIndiv_ann_incm(){
		return  indiv_ann_incm;
	}
	/**
	* 年收入情况
	*@param  indiv_ann_incm
	*/
	public void setIndiv_ann_incm(BigDecimal indiv_ann_incm ){
		this.indiv_ann_incm = indiv_ann_incm;
	}

	/**
	* 籍贯
	*@return
	*/
	public String getIndiv_brt_place(){
		return  indiv_brt_place;
	}
	/**
	* 籍贯
	*@param  indiv_brt_place
	*/
	public void setIndiv_brt_place(String indiv_brt_place ){
		this.indiv_brt_place = indiv_brt_place;
	}

	/**
	* 单位地址
	*@return
	*/
	public String getIndiv_com_addr(){
		return  indiv_com_addr;
	}
	/**
	* 单位地址
	*@param  indiv_com_addr
	*/
	public void setIndiv_com_addr(String indiv_com_addr ){
		this.indiv_com_addr = indiv_com_addr;
	}

	/**
	* 单位联系人
	*@return
	*/
	public String getIndiv_com_cnt_name(){
		return  indiv_com_cnt_name;
	}
	/**
	* 单位联系人
	*@param  indiv_com_cnt_name
	*/
	public void setIndiv_com_cnt_name(String indiv_com_cnt_name ){
		this.indiv_com_cnt_name = indiv_com_cnt_name;
	}

	/**
	* 单位传真
	*@return
	*/
	public String getIndiv_com_fax(){
		return  indiv_com_fax;
	}
	/**
	* 单位传真
	*@param  indiv_com_fax
	*/
	public void setIndiv_com_fax(String indiv_com_fax ){
		this.indiv_com_fax = indiv_com_fax;
	}

	/**
	* 单位所属行业
	*@return
	*/
	public String getIndiv_com_fld(){
		return  indiv_com_fld;
	}
	/**
	* 单位所属行业
	*@param  indiv_com_fld
	*/
	public void setIndiv_com_fld(String indiv_com_fld ){
		this.indiv_com_fld = indiv_com_fld;
	}

	/**
	* 所属行业名称
	*@return
	*/
	public String getIndiv_com_fld_name(){
		return  indiv_com_fld_name;
	}
	/**
	* 所属行业名称
	*@param  indiv_com_fld_name
	*/
	public void setIndiv_com_fld_name(String indiv_com_fld_name ){
		this.indiv_com_fld_name = indiv_com_fld_name;
	}

	/**
	* 职务
	*@return
	*/
	public String getIndiv_com_job_ttl(){
		return  indiv_com_job_ttl;
	}
	/**
	* 职务
	*@param  indiv_com_job_ttl
	*/
	public void setIndiv_com_job_ttl(String indiv_com_job_ttl ){
		this.indiv_com_job_ttl = indiv_com_job_ttl;
	}

	/**
	* 工作单位
	*@return
	*/
	public String getIndiv_com_name(){
		return  indiv_com_name;
	}
	/**
	* 工作单位
	*@param  indiv_com_name
	*/
	public void setIndiv_com_name(String indiv_com_name ){
		this.indiv_com_name = indiv_com_name;
	}

	/**
	* 单位电话
	*@return
	*/
	public String getIndiv_com_phn(){
		return  indiv_com_phn;
	}
	/**
	* 单位电话
	*@param  indiv_com_phn
	*/
	public void setIndiv_com_phn(String indiv_com_phn ){
		this.indiv_com_phn = indiv_com_phn;
	}

	/**
	* 单位性质
	*@return
	*/
	public String getIndiv_com_typ(){
		return  indiv_com_typ;
	}
	/**
	* 单位性质
	*@param  indiv_com_typ
	*/
	public void setIndiv_com_typ(String indiv_com_typ ){
		this.indiv_com_typ = indiv_com_typ;
	}

	/**
	* 单位邮编
	*@return
	*/
	public String getIndiv_com_zip_code(){
		return  indiv_com_zip_code;
	}
	/**
	* 单位邮编
	*@param  indiv_com_zip_code
	*/
	public void setIndiv_com_zip_code(String indiv_com_zip_code ){
		this.indiv_com_zip_code = indiv_com_zip_code;
	}

	/**
	* 客户国籍
	*@return
	*/
	public String getIndiv_country(){
		return  indiv_country;
	}
	/**
	* 客户国籍
	*@param  indiv_country
	*/
	public void setIndiv_country(String indiv_country ){
		this.indiv_country = indiv_country;
	}

	/**
	* 职称
	*@return
	*/
	public String getIndiv_crtfctn(){
		return  indiv_crtfctn;
	}
	/**
	* 职称
	*@param  indiv_crtfctn
	*/
	public void setIndiv_crtfctn(String indiv_crtfctn ){
		this.indiv_crtfctn = indiv_crtfctn;
	}

	/**
	* 最高学位
	*@return
	*/
	public String getIndiv_dgr(){
		return  indiv_dgr;
	}
	/**
	* 最高学位
	*@param  indiv_dgr
	*/
	public void setIndiv_dgr(String indiv_dgr ){
		this.indiv_dgr = indiv_dgr;
	}

	/**
	* 出生年月日
	*@return
	*/
	public String getIndiv_dt_of_birth(){
		return  indiv_dt_of_birth;
	}
	/**
	* 出生年月日
	*@param  indiv_dt_of_birth
	*/
	public void setIndiv_dt_of_birth(String indiv_dt_of_birth ){
		this.indiv_dt_of_birth = indiv_dt_of_birth;
	}

	/**
	* 文化程度（最高学历）
	*@return
	*/
	public String getIndiv_edt(){
		return  indiv_edt;
	}
	/**
	* 文化程度（最高学历）
	*@param  indiv_edt
	*/
	public void setIndiv_edt(String indiv_edt ){
		this.indiv_edt = indiv_edt;
	}

	/**
	* 健康状况
	*@return
	*/
	public String getIndiv_heal_st(){
		return  indiv_heal_st;
	}
	/**
	* 健康状况
	*@param  indiv_heal_st
	*/
	public void setIndiv_heal_st(String indiv_heal_st ){
		this.indiv_heal_st = indiv_heal_st;
	}

	/**
	* 在我行开立账户情况
	*@return
	*/
	public String getIndiv_hld_acnt(){
		return  indiv_hld_acnt;
	}
	/**
	* 在我行开立账户情况
	*@param  indiv_hld_acnt
	*/
	public void setIndiv_hld_acnt(String indiv_hld_acnt ){
		this.indiv_hld_acnt = indiv_hld_acnt;
	}

	/**
	* 爱好
	*@return
	*/
	public String getIndiv_hobby(){
		return  indiv_hobby;
	}
	/**
	* 爱好
	*@param  indiv_hobby
	*/
	public void setIndiv_hobby(String indiv_hobby ){
		this.indiv_hobby = indiv_hobby;
	}

	/**
	* 户籍地址
	*@return
	*/
	public String getIndiv_houh_reg_add(){
		return  indiv_houh_reg_add;
	}
	/**
	* 户籍地址
	*@param  indiv_houh_reg_add
	*/
	public void setIndiv_houh_reg_add(String indiv_houh_reg_add ){
		this.indiv_houh_reg_add = indiv_houh_reg_add;
	}

	/**
	* 证件到期日
	*@return
	*/
	public String getIndiv_id_exp_dt(){
		return  indiv_id_exp_dt;
	}
	/**
	* 证件到期日
	*@param  indiv_id_exp_dt
	*/
	public void setIndiv_id_exp_dt(String indiv_id_exp_dt ){
		this.indiv_id_exp_dt = indiv_id_exp_dt;
	}

	/**
	* 婚姻状况
	*@return
	*/
	public String getIndiv_mar_st(){
		return  indiv_mar_st;
	}
	/**
	* 婚姻状况
	*@param  indiv_mar_st
	*/
	public void setIndiv_mar_st(String indiv_mar_st ){
		this.indiv_mar_st = indiv_mar_st;
	}

	/**
	* 民族
	*@return
	*/
	public String getIndiv_ntn(){
		return  indiv_ntn;
	}
	/**
	* 民族
	*@param  indiv_ntn
	*/
	public void setIndiv_ntn(String indiv_ntn ){
		this.indiv_ntn = indiv_ntn;
	}

	/**
	* 从事职业
	*@return
	*/
	public String getIndiv_occ(){
		return  indiv_occ;
	}
	/**
	* 从事职业
	*@param  indiv_occ
	*/
	public void setIndiv_occ(String indiv_occ ){
		this.indiv_occ = indiv_occ;
	}

	/**
	* 政治面貌
	*@return
	*/
	public String getIndiv_pol_st(){
		return  indiv_pol_st;
	}
	/**
	* 政治面貌
	*@param  indiv_pol_st
	*/
	public void setIndiv_pol_st(String indiv_pol_st ){
		this.indiv_pol_st = indiv_pol_st;
	}

	/**
	* INDIV_PSP_CRTFCTN
	*@return
	*/
	public String getIndiv_psp_crtfctn(){
		return  indiv_psp_crtfctn;
	}
	/**
	* INDIV_PSP_CRTFCTN
	*@param  indiv_psp_crtfctn
	*/
	public void setIndiv_psp_crtfctn(String indiv_psp_crtfctn ){
		this.indiv_psp_crtfctn = indiv_psp_crtfctn;
	}

	/**
	* 居住地址
	*@return
	*/
	public String getIndiv_rsd_addr(){
		return  indiv_rsd_addr;
	}
	/**
	* 居住地址
	*@param  indiv_rsd_addr
	*/
	public void setIndiv_rsd_addr(String indiv_rsd_addr ){
		this.indiv_rsd_addr = indiv_rsd_addr;
	}

	/**
	* 居住状况
	*@return
	*/
	public String getIndiv_rsd_st(){
		return  indiv_rsd_st;
	}
	/**
	* 居住状况
	*@param  indiv_rsd_st
	*/
	public void setIndiv_rsd_st(String indiv_rsd_st ){
		this.indiv_rsd_st = indiv_rsd_st;
	}

	/**
	* 工资账户开户行
	*@return
	*/
	public String getIndiv_sal_acc_bank(){
		return  indiv_sal_acc_bank;
	}
	/**
	* 工资账户开户行
	*@param  indiv_sal_acc_bank
	*/
	public void setIndiv_sal_acc_bank(String indiv_sal_acc_bank ){
		this.indiv_sal_acc_bank = indiv_sal_acc_bank;
	}

	/**
	* 工资账号
	*@return
	*/
	public String getIndiv_sal_acc_no(){
		return  indiv_sal_acc_no;
	}
	/**
	* 工资账号
	*@param  indiv_sal_acc_no
	*/
	public void setIndiv_sal_acc_no(String indiv_sal_acc_no ){
		this.indiv_sal_acc_no = indiv_sal_acc_no;
	}

	/**
	* 配偶工作单位
	*@return
	*/
	public String getIndiv_scom_name(){
		return  indiv_scom_name;
	}
	/**
	* 配偶工作单位
	*@param  indiv_scom_name
	*/
	public void setIndiv_scom_name(String indiv_scom_name ){
		this.indiv_scom_name = indiv_scom_name;
	}

	/**
	* 性别
	*@return
	*/
	public String getIndiv_sex(){
		return  indiv_sex;
	}
	/**
	* 性别
	*@param  indiv_sex
	*/
	public void setIndiv_sex(String indiv_sex ){
		this.indiv_sex = indiv_sex;
	}

	/**
	* 社会保障情况
	*@return
	*/
	public String getIndiv_soc_scr(){
		return  indiv_soc_scr;
	}
	/**
	* 社会保障情况
	*@param  indiv_soc_scr
	*/
	public void setIndiv_soc_scr(String indiv_soc_scr ){
		this.indiv_soc_scr = indiv_soc_scr;
	}

	/**
	* 配偶职务
	*@return
	*/
	public String getIndiv_sps_duty(){
		return  indiv_sps_duty;
	}
	/**
	* 配偶职务
	*@param  indiv_sps_duty
	*/
	public void setIndiv_sps_duty(String indiv_sps_duty ){
		this.indiv_sps_duty = indiv_sps_duty;
	}

	/**
	* 配偶证件号码
	*@return
	*/
	public String getIndiv_sps_id_code(){
		return  indiv_sps_id_code;
	}
	/**
	* 配偶证件号码
	*@param  indiv_sps_id_code
	*/
	public void setIndiv_sps_id_code(String indiv_sps_id_code ){
		this.indiv_sps_id_code = indiv_sps_id_code;
	}

	/**
	* 配偶证件类型
	*@return
	*/
	public String getIndiv_sps_id_typ(){
		return  indiv_sps_id_typ;
	}
	/**
	* 配偶证件类型
	*@param  indiv_sps_id_typ
	*/
	public void setIndiv_sps_id_typ(String indiv_sps_id_typ ){
		this.indiv_sps_id_typ = indiv_sps_id_typ;
	}

	/**
	* 配偶参加工作时间
	*@return
	*/
	public String getIndiv_sps_job_dt(){
		return  indiv_sps_job_dt;
	}
	/**
	* 配偶参加工作时间
	*@param  indiv_sps_job_dt
	*/
	public void setIndiv_sps_job_dt(String indiv_sps_job_dt ){
		this.indiv_sps_job_dt = indiv_sps_job_dt;
	}

	/**
	* INDIV_SPS_MAR_CODE
	*@return
	*/
	public String getIndiv_sps_mar_code(){
		return  indiv_sps_mar_code;
	}
	/**
	* INDIV_SPS_MAR_CODE
	*@param  indiv_sps_mar_code
	*/
	public void setIndiv_sps_mar_code(String indiv_sps_mar_code ){
		this.indiv_sps_mar_code = indiv_sps_mar_code;
	}

	/**
	* 配偶年收入
	*@return
	*/
	public BigDecimal getIndiv_sps_mincm(){
		return  indiv_sps_mincm;
	}
	/**
	* 配偶年收入
	*@param  indiv_sps_mincm
	*/
	public void setIndiv_sps_mincm(BigDecimal indiv_sps_mincm ){
		this.indiv_sps_mincm = indiv_sps_mincm;
	}

	/**
	* 配偶手机号码
	*@return
	*/
	public String getIndiv_sps_mphn(){
		return  indiv_sps_mphn;
	}
	/**
	* 配偶手机号码
	*@param  indiv_sps_mphn
	*/
	public void setIndiv_sps_mphn(String indiv_sps_mphn ){
		this.indiv_sps_mphn = indiv_sps_mphn;
	}

	/**
	* 配偶姓名
	*@return
	*/
	public String getIndiv_sps_name(){
		return  indiv_sps_name;
	}
	/**
	* 配偶姓名
	*@param  indiv_sps_name
	*/
	public void setIndiv_sps_name(String indiv_sps_name ){
		this.indiv_sps_name = indiv_sps_name;
	}

	/**
	* 配偶职业
	*@return
	*/
	public String getIndiv_sps_occ(){
		return  indiv_sps_occ;
	}
	/**
	* 配偶职业
	*@param  indiv_sps_occ
	*/
	public void setIndiv_sps_occ(String indiv_sps_occ ){
		this.indiv_sps_occ = indiv_sps_occ;
	}

	/**
	* 配偶单位联系电话
	*@return
	*/
	public String getIndiv_sps_phn(){
		return  indiv_sps_phn;
	}
	/**
	* 配偶单位联系电话
	*@param  indiv_sps_phn
	*/
	public void setIndiv_sps_phn(String indiv_sps_phn ){
		this.indiv_sps_phn = indiv_sps_phn;
	}

	/**
	* 单位工作起始年
	*@return
	*/
	public String getIndiv_work_job_y(){
		return  indiv_work_job_y;
	}
	/**
	* 单位工作起始年
	*@param  indiv_work_job_y
	*/
	public void setIndiv_work_job_y(String indiv_work_job_y ){
		this.indiv_work_job_y = indiv_work_job_y;
	}

	/**
	* 居住地邮政编码
	*@return
	*/
	public String getIndiv_zip_code(){
		return  indiv_zip_code;
	}
	/**
	* 居住地邮政编码
	*@param  indiv_zip_code
	*/
	public void setIndiv_zip_code(String indiv_zip_code ){
		this.indiv_zip_code = indiv_zip_code;
	}

	/**
	* 登记机构
	*@return
	*/
	public String getInput_br_id(){
		return  input_br_id;
	}
	/**
	* 登记机构
	*@param  input_br_id
	*/
	public void setInput_br_id(String input_br_id ){
		this.input_br_id = input_br_id;
	}

	/**
	* 登记日期
	*@return
	*/
	public String getInput_date(){
		return  input_date;
	}
	/**
	* 登记日期
	*@param  input_date
	*/
	public void setInput_date(String input_date ){
		this.input_date = input_date;
	}

	/**
	* 登记人
	*@return
	*/
	public String getInput_id(){
		return  input_id;
	}
	/**
	* 登记人
	*@param  input_id
	*/
	public void setInput_id(String input_id ){
		this.input_id = input_id;
	}

	/**
	* 更新日期
	*@return
	*/
	public String getLast_upd_date(){
		return  last_upd_date;
	}
	/**
	* 更新日期
	*@param  last_upd_date
	*/
	public void setLast_upd_date(String last_upd_date ){
		this.last_upd_date = last_upd_date;
	}

	/**
	* 更新人
	*@return
	*/
	public String getLast_upd_id(){
		return  last_upd_id;
	}
	/**
	* 更新人
	*@param  last_upd_id
	*/
	public void setLast_upd_id(String last_upd_id ){
		this.last_upd_id = last_upd_id;
	}

	/**
	* LAY_OFF_CODE
	*@return
	*/
	public String getLay_off_code(){
		return  lay_off_code;
	}
	/**
	* LAY_OFF_CODE
	*@param  lay_off_code
	*/
	public void setLay_off_code(String lay_off_code ){
		this.lay_off_code = lay_off_code;
	}

	/**
	* LAY_OFF_FLAG
	*@return
	*/
	public String getLay_off_flag(){
		return  lay_off_flag;
	}
	/**
	* LAY_OFF_FLAG
	*@param  lay_off_flag
	*/
	public void setLay_off_flag(String lay_off_flag ){
		this.lay_off_flag = lay_off_flag;
	}

	/**
	* 贷款卡最近年审日期
	*@return
	*/
	public String getLoan_card_audit_dt(){
		return  loan_card_audit_dt;
	}
	/**
	* 贷款卡最近年审日期
	*@param  loan_card_audit_dt
	*/
	public void setLoan_card_audit_dt(String loan_card_audit_dt ){
		this.loan_card_audit_dt = loan_card_audit_dt;
	}

	/**
	* 贷款卡有效标志
	*@return
	*/
	public String getLoan_card_eff_flg(){
		return  loan_card_eff_flg;
	}
	/**
	* 贷款卡有效标志
	*@param  loan_card_eff_flg
	*/
	public void setLoan_card_eff_flg(String loan_card_eff_flg ){
		this.loan_card_eff_flg = loan_card_eff_flg;
	}

	/**
	* 有无贷款卡
	*@return
	*/
	public String getLoan_card_flg(){
		return  loan_card_flg;
	}
	/**
	* 有无贷款卡
	*@param  loan_card_flg
	*/
	public void setLoan_card_flg(String loan_card_flg ){
		this.loan_card_flg = loan_card_flg;
	}

	/**
	* 贷款卡
	*@return
	*/
	public String getLoan_card_id(){
		return  loan_card_id;
	}
	/**
	* 贷款卡
	*@param  loan_card_id
	*/
	public void setLoan_card_id(String loan_card_id ){
		this.loan_card_id = loan_card_id;
	}

	/**
	* 贷款卡密码
	*@return
	*/
	public String getLoan_card_pwd(){
		return  loan_card_pwd;
	}
	/**
	* 贷款卡密码
	*@param  loan_card_pwd
	*/
	public void setLoan_card_pwd(String loan_card_pwd ){
		this.loan_card_pwd = loan_card_pwd;
	}

	/**
	* 主管机构
	*@return
	*/
	public String getMain_br_id(){
		return  main_br_id;
	}
	/**
	* 主管机构
	*@param  main_br_id
	*/
	public void setMain_br_id(String main_br_id ){
		this.main_br_id = main_br_id;
	}

	/**
	* 所属法人机构
	*@return
	*/
	public String getMng_br_id(){
		return  mng_br_id;
	}
	/**
	* 所属法人机构
	*@param  mng_br_id
	*/
	public void setMng_br_id(String mng_br_id ){
		this.mng_br_id = mng_br_id;
	}

	/**
	* 手机
	*@return
	*/
	public String getMobile(){
		return  mobile;
	}
	/**
	* 手机
	*@param  mobile
	*/
	public void setMobile(String mobile ){
		this.mobile = mobile;
	}

	/**
	* 开立日期
	*@return
	*/
	public String getOpenday(){
		return  openday;
	}
	/**
	* 开立日期
	*@param  openday
	*/
	public void setOpenday(String openday ){
		this.openday = openday;
	}

	/**
	* 其他年收入（元）
	*@return
	*/
	public BigDecimal getOther_annual_incm(){
		return  other_annual_incm;
	}
	/**
	* 其他年收入（元）
	*@param  other_annual_incm
	*/
	public void setOther_annual_incm(BigDecimal other_annual_incm ){
		this.other_annual_incm = other_annual_incm;
	}

	/**
	* 其他收入渠道
	*@return
	*/
	public String getOther_rev_incm(){
		return  other_rev_incm;
	}
	/**
	* 其他收入渠道
	*@param  other_rev_incm
	*/
	public void setOther_rev_incm(String other_rev_incm ){
		this.other_rev_incm = other_rev_incm;
	}

	/**
	* 是否拥有外国护照或居住权
	*@return
	*/
	public String getPassport_flg(){
		return  passport_flg;
	}
	/**
	* 是否拥有外国护照或居住权
	*@param  passport_flg
	*/
	public void setPassport_flg(String passport_flg ){
		this.passport_flg = passport_flg;
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
	* 通讯地址
	*@return
	*/
	public String getPost_addr(){
		return  post_addr;
	}
	/**
	* 通讯地址
	*@param  post_addr
	*/
	public void setPost_addr(String post_addr ){
		this.post_addr = post_addr;
	}

	/**
	* 邮政编码
	*@return
	*/
	public String getPost_code(){
		return  post_code;
	}
	/**
	* 邮政编码
	*@param  post_code
	*/
	public void setPost_code(String post_code ){
		this.post_code = post_code;
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

	/**
	* WORK_RESUME
	*@return
	*/
	public String getWork_resume(){
		return  work_resume;
	}
	/**
	* WORK_RESUME
	*@param  work_resume
	*/
	public void setWork_resume(String work_resume ){
		this.work_resume = work_resume;
	}


}
