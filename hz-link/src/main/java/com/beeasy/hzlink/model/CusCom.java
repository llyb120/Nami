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
@Table(name="CUS_COM")
public class CusCom   {

	/*
	内部客户号
	*/
    @AssignID()
	private String inner_cus_id ;
	private String accredit_status ;
	private String acu_addr ;
	/*
	主管单位
	*/
	private String admin_org ;
	/*
	批准文号
	*/
	private String appr_doc_no ;
	/*
	审批机关
	*/
	private String appr_org ;
	/*
	基本存款账户开户行
	*/
	private String bas_acc_bank ;
	/*
	基本存款账户开户日期
	*/
	private String bas_acc_date ;
	/*
	基本存款账户是否在本机构
	*/
	private String bas_acc_flg ;
	/*
	基本存款账户开户许可证核准号
	*/
	private String bas_acc_licence ;
	/*
	基本存款账户帐号
	*/
	private String bas_acc_no ;
	/*
	开户证件号码
	*/
	private String cert_code ;
	/*
	开户证件类型
	*/
	private String cert_type ;
	private String chg_time ;
	/*
	本机构一般结算账户开户日期
	*/
	private String com_acc_date ;
	/*
	本机构一般结算账户帐号
	*/
	private String com_acc_no ;
	/*
	城乡类型
	*/
	private String com_city_flg ;
	/*
	行业名称
	*/
	private String com_cll_name ;
	/*
	行业类型
	*/
	private String com_cll_type ;
	/*
	国家宏观调控限控行业
	*/
	private String com_cl_entp ;
	/*
	国别
	*/
	private String com_country ;
	/*
	信用评定日期
	*/
	private String com_crd_dt ;
	/*
	信用等级
	*/
	private String com_crd_grade ;
	/*
	信用等级企业分类
	*/
	private String com_crd_typ ;
	/*
	我行客户分类
	*/
	private String com_cus_rank ;
	/*
	是否两高一剩企业
	*/
	private String com_dhgh_flg ;
	/*
	从业人数
	*/
	private String com_employee ;
	/*
	实际生产能力
	*/
	private String com_fact_prod ;
	/*
	外汇许可证号码
	*/
	private String com_fexc_prm_code ;
	/*
	财务报表类型
	*/
	private String com_fin_rep_type ;
	/*
	集团客户类型
	*/
	private String com_grp_mode ;
	/*
	龙头企业
	*/
	private String com_hd_enterprise ;
	/*
	拥有我行股份金额
	*/
	private BigDecimal com_hold_stk_amt ;
	/*
	控股类型
	*/
	private String com_hold_type ;
	/*
	地区重点企业
	*/
	private String com_imptt_flg ;
	/*
	进出口权标识
	*/
	private String com_imp_exp_flg ;
	/*
	建立信贷关系时间
	*/
	private String com_init_loan_date ;
	/*
	组织机构代码证年检到期日
	*/
	private String com_ins_ann_date ;
	/*
	组织机构代码
	*/
	private String com_ins_code ;
	/*
	组织机构有效日期
	*/
	private String com_ins_exp_date ;
	/*
	组织机构代码证颁发机关
	*/
	private String com_ins_org ;
	/*
	组织代码颁发日
	*/
	private String com_ins_pub_date ;
	/*
	组织机构登记日期
	*/
	private String com_ins_reg_date ;
	/*
	登记信息更新日期
	*/
	private String com_ins_upd_date ;
	/*
	是否异地企业
	*/
	private String com_lcl_flg ;
	/*
	主营范围/宗旨与业务范围
	*/
	private String com_main_opt_scp ;
	/*
	主要产品情况
	*/
	private String com_main_product ;
	/*
	上级主管单位
	*/
	private String com_mng_org ;
	/*
	上市市场
	*/
	private String com_mrk ;
	/*
	上市地
	*/
	private String com_mrk_area ;
	/*
	上市地国别
	*/
	private String com_mrk_country ;
	/*
	上市公司标志
	*/
	private String com_mrk_flg ;
	/*
	企业经办人
	*/
	private String com_operator ;
	/*
	经营场地面积(平方米)
	*/
	private BigDecimal com_opt_aera ;
	/*
	经营场地所有权
	*/
	private String com_opt_owner ;
	/*
	经营状况
	*/
	private String com_opt_st ;
	/*
	信用等级评定日期(外部)
	*/
	private String com_out_crd_dt ;
	/*
	信用等级(外部)
	*/
	private String com_out_crd_grade ;
	/*
	信用等级评定机构(外部)
	*/
	private String com_out_crd_org ;
	/*
	兼营范围
	*/
	private String com_part_opt_scp ;
	/*
	优势企业
	*/
	private String com_prep_flg ;
	/*
	主要生产设备
	*/
	private String com_prod_equip ;
	/*
	与我行合作关系
	*/
	private String com_rel_dgr ;
	/*
	企业规模
	*/
	private String com_scale ;
	/*
	特种经营标识
	*/
	private String com_sp_business ;
	/*
	特种经营情况
	*/
	private String com_sp_detail ;
	/*
	特种经营到期日期
	*/
	private String com_sp_end_date ;
	/*
	特种经营许可证编号
	*/
	private String com_sp_lic_no ;
	/*
	特种许可证颁发机关
	*/
	private String com_sp_lic_org ;
	/*
	特种经营起始日期
	*/
	private String com_sp_str_date ;
	/*
	股票代码
	*/
	private String com_stock_id ;
	/*
	成立日期
	*/
	private String com_str_date ;
	/*
	隶属关系
	*/
	private String com_sub_typ ;
	/*
	关注事件代码
	*/
	private String conc_code ;
	/*
	信用评定到期日期
	*/
	private String crd_end_dt ;
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
	外文名称
	*/
	private String cus_en_name ;
	/*
	客户代码
	*/
	private String cus_id ;
	private String cus_id_rel ;
	/*
	客户名称
	*/
	private String cus_name ;
	/*
	客户简称
	*/
	private String cus_short_name ;
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
	违约概率
	*/
	private BigDecimal default_rate ;
	/*
	Email地址
	*/
	private String email ;
	/*
	环境和社会风险分类
	*/
	private String env_risk ;
	/*
	外文注册登记地址
	*/
	private String en_reg_addr ;
	/*
	传真
	*/
	private String fax_code ;
	private String finance_cd ;
	/*
	财务负责人
	*/
	private String fna_mgr ;
	/*
	经费来源
	*/
	private String fun_source ;
	/*
	集团编号
	*/
	private String grp_no ;
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
	投资主体
	*/
	private String invest_type ;
	private String in_cll_type ;
	/*
	更新日期
	*/
	private String last_upd_date ;
	/*
	更新人
	*/
	private String last_upd_id ;
	/*
	法定代表人/负责人证件号码
	*/
	private String legal_cert_code ;
	/*
	法定代表人/负责人证件类型
	*/
	private String legal_cert_type ;
	/*
	法定代表人国别
	*/
	private String legal_country ;
	private String legal_end_init_date ;
	/*
	法人代表户籍地址
	*/
	private String legal_houh_reg_add ;
	/*
	法定代表人/负责人姓名
	*/
	private String legal_name ;
	/*
	法定代表人/负责人联系电话
	*/
	private String legal_phone ;
	/*
	法定代表人性别
	*/
	private String legal_sex ;
	private String legal_sign_init_date ;
	private String legal_sps_id_code ;
	private String legal_sps_id_type ;
	private String legal_sps_name ;
	private String legal_sps_no ;
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
	贷款卡编号
	*/
	private String loan_card_id ;
	/*
	地税登记证年检到期日
	*/
	private String loc_tax_ann_date ;
	/*
	地税税务登记代码
	*/
	private String loc_tax_reg_code ;
	/*
	地税税务登记日期
	*/
	private String loc_tax_reg_dt ;
	/*
	地税登记有效期
	*/
	private String loc_tax_reg_end_dt ;
	/*
	地税税务登记机关
	*/
	private String loc_tax_reg_org ;
	/*
	主管机构
	*/
	private String main_br_id ;
	/*
	所属法人机构
	*/
	private String mng_br_id ;
	/*
	国税登记证年检到期日
	*/
	private String nat_tax_ann_date ;
	/*
	国税税务登记代码
	*/
	private String nat_tax_reg_code ;
	/*
	国税税务登记日期
	*/
	private String nat_tax_reg_dt ;
	/*
	国税登记有效期
	*/
	private String nat_tax_reg_end_dt ;
	/*
	国税税务登记机关
	*/
	private String nat_tax_reg_org ;
	private String new_com_fin_rep_type ;
	private String openday ;
	/*
	实收资本（万元）
	*/
	private BigDecimal paid_cap_amt ;
	/*
	实收资本币种
	*/
	private String paid_cap_cur_type ;
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
	private String reality_controler_id_code ;
	private String reality_controler_id_type ;
	private String reality_controler_name ;
	private String reality_controler_no ;
	private String reality_id_code ;
	private String reality_sps_id_type ;
	private String reality_sps_name ;
	private String reality_sps_no ;
	private String real_accredit_end_date ;
	private String real_accredit_init_date ;
	private String real_sign_end_date ;
	private String real_sign_init_date ;
	private String real_work_resume ;
	/*
	注册登记地址
	*/
	private String reg_addr ;
	/*
	注册地区域编码2
	*/
	private String reg_area_code2 ;
	/*
	注册地区域编码3
	*/
	private String reg_area_code3 ;
	/*
	行政区划名称
	*/
	private String reg_area_name ;
	/*
	注册登记年审结论
	*/
	private String reg_audit ;
	/*
	注册登记年审日期
	*/
	private String reg_audit_date ;
	/*
	注册登记年审到期日
	*/
	private String reg_audit_end_date ;
	/*
	注册资本（万元）
	*/
	private BigDecimal reg_cap_amt ;
	/*
	登记注册号
	*/
	private String reg_code ;
	/*
	注册资本/开办资金币种
	*/
	private String reg_cur_type ;
	/*
	注册登记到期日期
	*/
	private String reg_end_date ;
	/*
	注册登记机关
	*/
	private String reg_org ;
	/*
	注册登记日期
	*/
	private String reg_start_date ;
	/*
	注册地行政区划
	*/
	private String reg_state_code ;
	/*
	注册登记类型
	*/
	private String reg_type ;
	/*
	更新注册信息日期
	*/
	private String reg_upd_date ;
	private String remark ;
	/*
	风险预警信号
	*/
	private String risc_code ;
	private String risk_des ;
	/*
	银行号
	*/
	private String soc_no ;
	/*
	法定代表人配偶证件号码
	*/
	private String spouse_cert_code ;
	/*
	法定代表人配偶证件类型
	*/
	private String spouse_cert_type ;
	/*
	法定代表人配偶名称
	*/
	private String spouse_name ;
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
	资产规模（万元）
	*/
	private BigDecimal total_assets ;
	/*
	销售总额（万元）
	*/
	private BigDecimal total_sales ;
	/*
	网址
	*/
	private String web_url ;
	/*
	办公地址行政代码
	*/
	private String wrk_state_code ;
	/*
	办公地址行政区域名称
	*/
	private String wrk_state_name ;
	/*
	更新办公地址日期
	*/
	private String wrk_upd_date ;

	public CusCom() {
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

	public String getAccredit_status(){
		return  accredit_status;
	}
	public void setAccredit_status(String accredit_status ){
		this.accredit_status = accredit_status;
	}

	public String getAcu_addr(){
		return  acu_addr;
	}
	public void setAcu_addr(String acu_addr ){
		this.acu_addr = acu_addr;
	}

	/**
	* 主管单位
	*@return
	*/
	public String getAdmin_org(){
		return  admin_org;
	}
	/**
	* 主管单位
	*@param  admin_org
	*/
	public void setAdmin_org(String admin_org ){
		this.admin_org = admin_org;
	}

	/**
	* 批准文号
	*@return
	*/
	public String getAppr_doc_no(){
		return  appr_doc_no;
	}
	/**
	* 批准文号
	*@param  appr_doc_no
	*/
	public void setAppr_doc_no(String appr_doc_no ){
		this.appr_doc_no = appr_doc_no;
	}

	/**
	* 审批机关
	*@return
	*/
	public String getAppr_org(){
		return  appr_org;
	}
	/**
	* 审批机关
	*@param  appr_org
	*/
	public void setAppr_org(String appr_org ){
		this.appr_org = appr_org;
	}

	/**
	* 基本存款账户开户行
	*@return
	*/
	public String getBas_acc_bank(){
		return  bas_acc_bank;
	}
	/**
	* 基本存款账户开户行
	*@param  bas_acc_bank
	*/
	public void setBas_acc_bank(String bas_acc_bank ){
		this.bas_acc_bank = bas_acc_bank;
	}

	/**
	* 基本存款账户开户日期
	*@return
	*/
	public String getBas_acc_date(){
		return  bas_acc_date;
	}
	/**
	* 基本存款账户开户日期
	*@param  bas_acc_date
	*/
	public void setBas_acc_date(String bas_acc_date ){
		this.bas_acc_date = bas_acc_date;
	}

	/**
	* 基本存款账户是否在本机构
	*@return
	*/
	public String getBas_acc_flg(){
		return  bas_acc_flg;
	}
	/**
	* 基本存款账户是否在本机构
	*@param  bas_acc_flg
	*/
	public void setBas_acc_flg(String bas_acc_flg ){
		this.bas_acc_flg = bas_acc_flg;
	}

	/**
	* 基本存款账户开户许可证核准号
	*@return
	*/
	public String getBas_acc_licence(){
		return  bas_acc_licence;
	}
	/**
	* 基本存款账户开户许可证核准号
	*@param  bas_acc_licence
	*/
	public void setBas_acc_licence(String bas_acc_licence ){
		this.bas_acc_licence = bas_acc_licence;
	}

	/**
	* 基本存款账户帐号
	*@return
	*/
	public String getBas_acc_no(){
		return  bas_acc_no;
	}
	/**
	* 基本存款账户帐号
	*@param  bas_acc_no
	*/
	public void setBas_acc_no(String bas_acc_no ){
		this.bas_acc_no = bas_acc_no;
	}

	/**
	* 开户证件号码
	*@return
	*/
	public String getCert_code(){
		return  cert_code;
	}
	/**
	* 开户证件号码
	*@param  cert_code
	*/
	public void setCert_code(String cert_code ){
		this.cert_code = cert_code;
	}

	/**
	* 开户证件类型
	*@return
	*/
	public String getCert_type(){
		return  cert_type;
	}
	/**
	* 开户证件类型
	*@param  cert_type
	*/
	public void setCert_type(String cert_type ){
		this.cert_type = cert_type;
	}

	public String getChg_time(){
		return  chg_time;
	}
	public void setChg_time(String chg_time ){
		this.chg_time = chg_time;
	}

	/**
	* 本机构一般结算账户开户日期
	*@return
	*/
	public String getCom_acc_date(){
		return  com_acc_date;
	}
	/**
	* 本机构一般结算账户开户日期
	*@param  com_acc_date
	*/
	public void setCom_acc_date(String com_acc_date ){
		this.com_acc_date = com_acc_date;
	}

	/**
	* 本机构一般结算账户帐号
	*@return
	*/
	public String getCom_acc_no(){
		return  com_acc_no;
	}
	/**
	* 本机构一般结算账户帐号
	*@param  com_acc_no
	*/
	public void setCom_acc_no(String com_acc_no ){
		this.com_acc_no = com_acc_no;
	}

	/**
	* 城乡类型
	*@return
	*/
	public String getCom_city_flg(){
		return  com_city_flg;
	}
	/**
	* 城乡类型
	*@param  com_city_flg
	*/
	public void setCom_city_flg(String com_city_flg ){
		this.com_city_flg = com_city_flg;
	}

	/**
	* 行业名称
	*@return
	*/
	public String getCom_cll_name(){
		return  com_cll_name;
	}
	/**
	* 行业名称
	*@param  com_cll_name
	*/
	public void setCom_cll_name(String com_cll_name ){
		this.com_cll_name = com_cll_name;
	}

	/**
	* 行业类型
	*@return
	*/
	public String getCom_cll_type(){
		return  com_cll_type;
	}
	/**
	* 行业类型
	*@param  com_cll_type
	*/
	public void setCom_cll_type(String com_cll_type ){
		this.com_cll_type = com_cll_type;
	}

	/**
	* 国家宏观调控限控行业
	*@return
	*/
	public String getCom_cl_entp(){
		return  com_cl_entp;
	}
	/**
	* 国家宏观调控限控行业
	*@param  com_cl_entp
	*/
	public void setCom_cl_entp(String com_cl_entp ){
		this.com_cl_entp = com_cl_entp;
	}

	/**
	* 国别
	*@return
	*/
	public String getCom_country(){
		return  com_country;
	}
	/**
	* 国别
	*@param  com_country
	*/
	public void setCom_country(String com_country ){
		this.com_country = com_country;
	}

	/**
	* 信用评定日期
	*@return
	*/
	public String getCom_crd_dt(){
		return  com_crd_dt;
	}
	/**
	* 信用评定日期
	*@param  com_crd_dt
	*/
	public void setCom_crd_dt(String com_crd_dt ){
		this.com_crd_dt = com_crd_dt;
	}

	/**
	* 信用等级
	*@return
	*/
	public String getCom_crd_grade(){
		return  com_crd_grade;
	}
	/**
	* 信用等级
	*@param  com_crd_grade
	*/
	public void setCom_crd_grade(String com_crd_grade ){
		this.com_crd_grade = com_crd_grade;
	}

	/**
	* 信用等级企业分类
	*@return
	*/
	public String getCom_crd_typ(){
		return  com_crd_typ;
	}
	/**
	* 信用等级企业分类
	*@param  com_crd_typ
	*/
	public void setCom_crd_typ(String com_crd_typ ){
		this.com_crd_typ = com_crd_typ;
	}

	/**
	* 我行客户分类
	*@return
	*/
	public String getCom_cus_rank(){
		return  com_cus_rank;
	}
	/**
	* 我行客户分类
	*@param  com_cus_rank
	*/
	public void setCom_cus_rank(String com_cus_rank ){
		this.com_cus_rank = com_cus_rank;
	}

	/**
	* 是否两高一剩企业
	*@return
	*/
	public String getCom_dhgh_flg(){
		return  com_dhgh_flg;
	}
	/**
	* 是否两高一剩企业
	*@param  com_dhgh_flg
	*/
	public void setCom_dhgh_flg(String com_dhgh_flg ){
		this.com_dhgh_flg = com_dhgh_flg;
	}

	/**
	* 从业人数
	*@return
	*/
	public String getCom_employee(){
		return  com_employee;
	}
	/**
	* 从业人数
	*@param  com_employee
	*/
	public void setCom_employee(String com_employee ){
		this.com_employee = com_employee;
	}

	/**
	* 实际生产能力
	*@return
	*/
	public String getCom_fact_prod(){
		return  com_fact_prod;
	}
	/**
	* 实际生产能力
	*@param  com_fact_prod
	*/
	public void setCom_fact_prod(String com_fact_prod ){
		this.com_fact_prod = com_fact_prod;
	}

	/**
	* 外汇许可证号码
	*@return
	*/
	public String getCom_fexc_prm_code(){
		return  com_fexc_prm_code;
	}
	/**
	* 外汇许可证号码
	*@param  com_fexc_prm_code
	*/
	public void setCom_fexc_prm_code(String com_fexc_prm_code ){
		this.com_fexc_prm_code = com_fexc_prm_code;
	}

	/**
	* 财务报表类型
	*@return
	*/
	public String getCom_fin_rep_type(){
		return  com_fin_rep_type;
	}
	/**
	* 财务报表类型
	*@param  com_fin_rep_type
	*/
	public void setCom_fin_rep_type(String com_fin_rep_type ){
		this.com_fin_rep_type = com_fin_rep_type;
	}

	/**
	* 集团客户类型
	*@return
	*/
	public String getCom_grp_mode(){
		return  com_grp_mode;
	}
	/**
	* 集团客户类型
	*@param  com_grp_mode
	*/
	public void setCom_grp_mode(String com_grp_mode ){
		this.com_grp_mode = com_grp_mode;
	}

	/**
	* 龙头企业
	*@return
	*/
	public String getCom_hd_enterprise(){
		return  com_hd_enterprise;
	}
	/**
	* 龙头企业
	*@param  com_hd_enterprise
	*/
	public void setCom_hd_enterprise(String com_hd_enterprise ){
		this.com_hd_enterprise = com_hd_enterprise;
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
	* 控股类型
	*@return
	*/
	public String getCom_hold_type(){
		return  com_hold_type;
	}
	/**
	* 控股类型
	*@param  com_hold_type
	*/
	public void setCom_hold_type(String com_hold_type ){
		this.com_hold_type = com_hold_type;
	}

	/**
	* 地区重点企业
	*@return
	*/
	public String getCom_imptt_flg(){
		return  com_imptt_flg;
	}
	/**
	* 地区重点企业
	*@param  com_imptt_flg
	*/
	public void setCom_imptt_flg(String com_imptt_flg ){
		this.com_imptt_flg = com_imptt_flg;
	}

	/**
	* 进出口权标识
	*@return
	*/
	public String getCom_imp_exp_flg(){
		return  com_imp_exp_flg;
	}
	/**
	* 进出口权标识
	*@param  com_imp_exp_flg
	*/
	public void setCom_imp_exp_flg(String com_imp_exp_flg ){
		this.com_imp_exp_flg = com_imp_exp_flg;
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
	* 组织机构代码证年检到期日
	*@return
	*/
	public String getCom_ins_ann_date(){
		return  com_ins_ann_date;
	}
	/**
	* 组织机构代码证年检到期日
	*@param  com_ins_ann_date
	*/
	public void setCom_ins_ann_date(String com_ins_ann_date ){
		this.com_ins_ann_date = com_ins_ann_date;
	}

	/**
	* 组织机构代码
	*@return
	*/
	public String getCom_ins_code(){
		return  com_ins_code;
	}
	/**
	* 组织机构代码
	*@param  com_ins_code
	*/
	public void setCom_ins_code(String com_ins_code ){
		this.com_ins_code = com_ins_code;
	}

	/**
	* 组织机构有效日期
	*@return
	*/
	public String getCom_ins_exp_date(){
		return  com_ins_exp_date;
	}
	/**
	* 组织机构有效日期
	*@param  com_ins_exp_date
	*/
	public void setCom_ins_exp_date(String com_ins_exp_date ){
		this.com_ins_exp_date = com_ins_exp_date;
	}

	/**
	* 组织机构代码证颁发机关
	*@return
	*/
	public String getCom_ins_org(){
		return  com_ins_org;
	}
	/**
	* 组织机构代码证颁发机关
	*@param  com_ins_org
	*/
	public void setCom_ins_org(String com_ins_org ){
		this.com_ins_org = com_ins_org;
	}

	/**
	* 组织代码颁发日
	*@return
	*/
	public String getCom_ins_pub_date(){
		return  com_ins_pub_date;
	}
	/**
	* 组织代码颁发日
	*@param  com_ins_pub_date
	*/
	public void setCom_ins_pub_date(String com_ins_pub_date ){
		this.com_ins_pub_date = com_ins_pub_date;
	}

	/**
	* 组织机构登记日期
	*@return
	*/
	public String getCom_ins_reg_date(){
		return  com_ins_reg_date;
	}
	/**
	* 组织机构登记日期
	*@param  com_ins_reg_date
	*/
	public void setCom_ins_reg_date(String com_ins_reg_date ){
		this.com_ins_reg_date = com_ins_reg_date;
	}

	/**
	* 登记信息更新日期
	*@return
	*/
	public String getCom_ins_upd_date(){
		return  com_ins_upd_date;
	}
	/**
	* 登记信息更新日期
	*@param  com_ins_upd_date
	*/
	public void setCom_ins_upd_date(String com_ins_upd_date ){
		this.com_ins_upd_date = com_ins_upd_date;
	}

	/**
	* 是否异地企业
	*@return
	*/
	public String getCom_lcl_flg(){
		return  com_lcl_flg;
	}
	/**
	* 是否异地企业
	*@param  com_lcl_flg
	*/
	public void setCom_lcl_flg(String com_lcl_flg ){
		this.com_lcl_flg = com_lcl_flg;
	}

	/**
	* 主营范围/宗旨与业务范围
	*@return
	*/
	public String getCom_main_opt_scp(){
		return  com_main_opt_scp;
	}
	/**
	* 主营范围/宗旨与业务范围
	*@param  com_main_opt_scp
	*/
	public void setCom_main_opt_scp(String com_main_opt_scp ){
		this.com_main_opt_scp = com_main_opt_scp;
	}

	/**
	* 主要产品情况
	*@return
	*/
	public String getCom_main_product(){
		return  com_main_product;
	}
	/**
	* 主要产品情况
	*@param  com_main_product
	*/
	public void setCom_main_product(String com_main_product ){
		this.com_main_product = com_main_product;
	}

	/**
	* 上级主管单位
	*@return
	*/
	public String getCom_mng_org(){
		return  com_mng_org;
	}
	/**
	* 上级主管单位
	*@param  com_mng_org
	*/
	public void setCom_mng_org(String com_mng_org ){
		this.com_mng_org = com_mng_org;
	}

	/**
	* 上市市场
	*@return
	*/
	public String getCom_mrk(){
		return  com_mrk;
	}
	/**
	* 上市市场
	*@param  com_mrk
	*/
	public void setCom_mrk(String com_mrk ){
		this.com_mrk = com_mrk;
	}

	/**
	* 上市地
	*@return
	*/
	public String getCom_mrk_area(){
		return  com_mrk_area;
	}
	/**
	* 上市地
	*@param  com_mrk_area
	*/
	public void setCom_mrk_area(String com_mrk_area ){
		this.com_mrk_area = com_mrk_area;
	}

	/**
	* 上市地国别
	*@return
	*/
	public String getCom_mrk_country(){
		return  com_mrk_country;
	}
	/**
	* 上市地国别
	*@param  com_mrk_country
	*/
	public void setCom_mrk_country(String com_mrk_country ){
		this.com_mrk_country = com_mrk_country;
	}

	/**
	* 上市公司标志
	*@return
	*/
	public String getCom_mrk_flg(){
		return  com_mrk_flg;
	}
	/**
	* 上市公司标志
	*@param  com_mrk_flg
	*/
	public void setCom_mrk_flg(String com_mrk_flg ){
		this.com_mrk_flg = com_mrk_flg;
	}

	/**
	* 企业经办人
	*@return
	*/
	public String getCom_operator(){
		return  com_operator;
	}
	/**
	* 企业经办人
	*@param  com_operator
	*/
	public void setCom_operator(String com_operator ){
		this.com_operator = com_operator;
	}

	/**
	* 经营场地面积(平方米)
	*@return
	*/
	public BigDecimal getCom_opt_aera(){
		return  com_opt_aera;
	}
	/**
	* 经营场地面积(平方米)
	*@param  com_opt_aera
	*/
	public void setCom_opt_aera(BigDecimal com_opt_aera ){
		this.com_opt_aera = com_opt_aera;
	}

	/**
	* 经营场地所有权
	*@return
	*/
	public String getCom_opt_owner(){
		return  com_opt_owner;
	}
	/**
	* 经营场地所有权
	*@param  com_opt_owner
	*/
	public void setCom_opt_owner(String com_opt_owner ){
		this.com_opt_owner = com_opt_owner;
	}

	/**
	* 经营状况
	*@return
	*/
	public String getCom_opt_st(){
		return  com_opt_st;
	}
	/**
	* 经营状况
	*@param  com_opt_st
	*/
	public void setCom_opt_st(String com_opt_st ){
		this.com_opt_st = com_opt_st;
	}

	/**
	* 信用等级评定日期(外部)
	*@return
	*/
	public String getCom_out_crd_dt(){
		return  com_out_crd_dt;
	}
	/**
	* 信用等级评定日期(外部)
	*@param  com_out_crd_dt
	*/
	public void setCom_out_crd_dt(String com_out_crd_dt ){
		this.com_out_crd_dt = com_out_crd_dt;
	}

	/**
	* 信用等级(外部)
	*@return
	*/
	public String getCom_out_crd_grade(){
		return  com_out_crd_grade;
	}
	/**
	* 信用等级(外部)
	*@param  com_out_crd_grade
	*/
	public void setCom_out_crd_grade(String com_out_crd_grade ){
		this.com_out_crd_grade = com_out_crd_grade;
	}

	/**
	* 信用等级评定机构(外部)
	*@return
	*/
	public String getCom_out_crd_org(){
		return  com_out_crd_org;
	}
	/**
	* 信用等级评定机构(外部)
	*@param  com_out_crd_org
	*/
	public void setCom_out_crd_org(String com_out_crd_org ){
		this.com_out_crd_org = com_out_crd_org;
	}

	/**
	* 兼营范围
	*@return
	*/
	public String getCom_part_opt_scp(){
		return  com_part_opt_scp;
	}
	/**
	* 兼营范围
	*@param  com_part_opt_scp
	*/
	public void setCom_part_opt_scp(String com_part_opt_scp ){
		this.com_part_opt_scp = com_part_opt_scp;
	}

	/**
	* 优势企业
	*@return
	*/
	public String getCom_prep_flg(){
		return  com_prep_flg;
	}
	/**
	* 优势企业
	*@param  com_prep_flg
	*/
	public void setCom_prep_flg(String com_prep_flg ){
		this.com_prep_flg = com_prep_flg;
	}

	/**
	* 主要生产设备
	*@return
	*/
	public String getCom_prod_equip(){
		return  com_prod_equip;
	}
	/**
	* 主要生产设备
	*@param  com_prod_equip
	*/
	public void setCom_prod_equip(String com_prod_equip ){
		this.com_prod_equip = com_prod_equip;
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
	* 企业规模
	*@return
	*/
	public String getCom_scale(){
		return  com_scale;
	}
	/**
	* 企业规模
	*@param  com_scale
	*/
	public void setCom_scale(String com_scale ){
		this.com_scale = com_scale;
	}

	/**
	* 特种经营标识
	*@return
	*/
	public String getCom_sp_business(){
		return  com_sp_business;
	}
	/**
	* 特种经营标识
	*@param  com_sp_business
	*/
	public void setCom_sp_business(String com_sp_business ){
		this.com_sp_business = com_sp_business;
	}

	/**
	* 特种经营情况
	*@return
	*/
	public String getCom_sp_detail(){
		return  com_sp_detail;
	}
	/**
	* 特种经营情况
	*@param  com_sp_detail
	*/
	public void setCom_sp_detail(String com_sp_detail ){
		this.com_sp_detail = com_sp_detail;
	}

	/**
	* 特种经营到期日期
	*@return
	*/
	public String getCom_sp_end_date(){
		return  com_sp_end_date;
	}
	/**
	* 特种经营到期日期
	*@param  com_sp_end_date
	*/
	public void setCom_sp_end_date(String com_sp_end_date ){
		this.com_sp_end_date = com_sp_end_date;
	}

	/**
	* 特种经营许可证编号
	*@return
	*/
	public String getCom_sp_lic_no(){
		return  com_sp_lic_no;
	}
	/**
	* 特种经营许可证编号
	*@param  com_sp_lic_no
	*/
	public void setCom_sp_lic_no(String com_sp_lic_no ){
		this.com_sp_lic_no = com_sp_lic_no;
	}

	/**
	* 特种许可证颁发机关
	*@return
	*/
	public String getCom_sp_lic_org(){
		return  com_sp_lic_org;
	}
	/**
	* 特种许可证颁发机关
	*@param  com_sp_lic_org
	*/
	public void setCom_sp_lic_org(String com_sp_lic_org ){
		this.com_sp_lic_org = com_sp_lic_org;
	}

	/**
	* 特种经营起始日期
	*@return
	*/
	public String getCom_sp_str_date(){
		return  com_sp_str_date;
	}
	/**
	* 特种经营起始日期
	*@param  com_sp_str_date
	*/
	public void setCom_sp_str_date(String com_sp_str_date ){
		this.com_sp_str_date = com_sp_str_date;
	}

	/**
	* 股票代码
	*@return
	*/
	public String getCom_stock_id(){
		return  com_stock_id;
	}
	/**
	* 股票代码
	*@param  com_stock_id
	*/
	public void setCom_stock_id(String com_stock_id ){
		this.com_stock_id = com_stock_id;
	}

	/**
	* 成立日期
	*@return
	*/
	public String getCom_str_date(){
		return  com_str_date;
	}
	/**
	* 成立日期
	*@param  com_str_date
	*/
	public void setCom_str_date(String com_str_date ){
		this.com_str_date = com_str_date;
	}

	/**
	* 隶属关系
	*@return
	*/
	public String getCom_sub_typ(){
		return  com_sub_typ;
	}
	/**
	* 隶属关系
	*@param  com_sub_typ
	*/
	public void setCom_sub_typ(String com_sub_typ ){
		this.com_sub_typ = com_sub_typ;
	}

	/**
	* 关注事件代码
	*@return
	*/
	public String getConc_code(){
		return  conc_code;
	}
	/**
	* 关注事件代码
	*@param  conc_code
	*/
	public void setConc_code(String conc_code ){
		this.conc_code = conc_code;
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
	* 外文名称
	*@return
	*/
	public String getCus_en_name(){
		return  cus_en_name;
	}
	/**
	* 外文名称
	*@param  cus_en_name
	*/
	public void setCus_en_name(String cus_en_name ){
		this.cus_en_name = cus_en_name;
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

	public String getCus_id_rel(){
		return  cus_id_rel;
	}
	public void setCus_id_rel(String cus_id_rel ){
		this.cus_id_rel = cus_id_rel;
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
	* 违约概率
	*@return
	*/
	public BigDecimal getDefault_rate(){
		return  default_rate;
	}
	/**
	* 违约概率
	*@param  default_rate
	*/
	public void setDefault_rate(BigDecimal default_rate ){
		this.default_rate = default_rate;
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
	* 环境和社会风险分类
	*@return
	*/
	public String getEnv_risk(){
		return  env_risk;
	}
	/**
	* 环境和社会风险分类
	*@param  env_risk
	*/
	public void setEnv_risk(String env_risk ){
		this.env_risk = env_risk;
	}

	/**
	* 外文注册登记地址
	*@return
	*/
	public String getEn_reg_addr(){
		return  en_reg_addr;
	}
	/**
	* 外文注册登记地址
	*@param  en_reg_addr
	*/
	public void setEn_reg_addr(String en_reg_addr ){
		this.en_reg_addr = en_reg_addr;
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

	public String getFinance_cd(){
		return  finance_cd;
	}
	public void setFinance_cd(String finance_cd ){
		this.finance_cd = finance_cd;
	}

	/**
	* 财务负责人
	*@return
	*/
	public String getFna_mgr(){
		return  fna_mgr;
	}
	/**
	* 财务负责人
	*@param  fna_mgr
	*/
	public void setFna_mgr(String fna_mgr ){
		this.fna_mgr = fna_mgr;
	}

	/**
	* 经费来源
	*@return
	*/
	public String getFun_source(){
		return  fun_source;
	}
	/**
	* 经费来源
	*@param  fun_source
	*/
	public void setFun_source(String fun_source ){
		this.fun_source = fun_source;
	}

	/**
	* 集团编号
	*@return
	*/
	public String getGrp_no(){
		return  grp_no;
	}
	/**
	* 集团编号
	*@param  grp_no
	*/
	public void setGrp_no(String grp_no ){
		this.grp_no = grp_no;
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
	* 投资主体
	*@return
	*/
	public String getInvest_type(){
		return  invest_type;
	}
	/**
	* 投资主体
	*@param  invest_type
	*/
	public void setInvest_type(String invest_type ){
		this.invest_type = invest_type;
	}

	public String getIn_cll_type(){
		return  in_cll_type;
	}
	public void setIn_cll_type(String in_cll_type ){
		this.in_cll_type = in_cll_type;
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
	* 法定代表人/负责人证件号码
	*@return
	*/
	public String getLegal_cert_code(){
		return  legal_cert_code;
	}
	/**
	* 法定代表人/负责人证件号码
	*@param  legal_cert_code
	*/
	public void setLegal_cert_code(String legal_cert_code ){
		this.legal_cert_code = legal_cert_code;
	}

	/**
	* 法定代表人/负责人证件类型
	*@return
	*/
	public String getLegal_cert_type(){
		return  legal_cert_type;
	}
	/**
	* 法定代表人/负责人证件类型
	*@param  legal_cert_type
	*/
	public void setLegal_cert_type(String legal_cert_type ){
		this.legal_cert_type = legal_cert_type;
	}

	/**
	* 法定代表人国别
	*@return
	*/
	public String getLegal_country(){
		return  legal_country;
	}
	/**
	* 法定代表人国别
	*@param  legal_country
	*/
	public void setLegal_country(String legal_country ){
		this.legal_country = legal_country;
	}

	public String getLegal_end_init_date(){
		return  legal_end_init_date;
	}
	public void setLegal_end_init_date(String legal_end_init_date ){
		this.legal_end_init_date = legal_end_init_date;
	}

	/**
	* 法人代表户籍地址
	*@return
	*/
	public String getLegal_houh_reg_add(){
		return  legal_houh_reg_add;
	}
	/**
	* 法人代表户籍地址
	*@param  legal_houh_reg_add
	*/
	public void setLegal_houh_reg_add(String legal_houh_reg_add ){
		this.legal_houh_reg_add = legal_houh_reg_add;
	}

	/**
	* 法定代表人/负责人姓名
	*@return
	*/
	public String getLegal_name(){
		return  legal_name;
	}
	/**
	* 法定代表人/负责人姓名
	*@param  legal_name
	*/
	public void setLegal_name(String legal_name ){
		this.legal_name = legal_name;
	}

	/**
	* 法定代表人/负责人联系电话
	*@return
	*/
	public String getLegal_phone(){
		return  legal_phone;
	}
	/**
	* 法定代表人/负责人联系电话
	*@param  legal_phone
	*/
	public void setLegal_phone(String legal_phone ){
		this.legal_phone = legal_phone;
	}

	/**
	* 法定代表人性别
	*@return
	*/
	public String getLegal_sex(){
		return  legal_sex;
	}
	/**
	* 法定代表人性别
	*@param  legal_sex
	*/
	public void setLegal_sex(String legal_sex ){
		this.legal_sex = legal_sex;
	}

	public String getLegal_sign_init_date(){
		return  legal_sign_init_date;
	}
	public void setLegal_sign_init_date(String legal_sign_init_date ){
		this.legal_sign_init_date = legal_sign_init_date;
	}

	public String getLegal_sps_id_code(){
		return  legal_sps_id_code;
	}
	public void setLegal_sps_id_code(String legal_sps_id_code ){
		this.legal_sps_id_code = legal_sps_id_code;
	}

	public String getLegal_sps_id_type(){
		return  legal_sps_id_type;
	}
	public void setLegal_sps_id_type(String legal_sps_id_type ){
		this.legal_sps_id_type = legal_sps_id_type;
	}

	public String getLegal_sps_name(){
		return  legal_sps_name;
	}
	public void setLegal_sps_name(String legal_sps_name ){
		this.legal_sps_name = legal_sps_name;
	}

	public String getLegal_sps_no(){
		return  legal_sps_no;
	}
	public void setLegal_sps_no(String legal_sps_no ){
		this.legal_sps_no = legal_sps_no;
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
	* 贷款卡编号
	*@return
	*/
	public String getLoan_card_id(){
		return  loan_card_id;
	}
	/**
	* 贷款卡编号
	*@param  loan_card_id
	*/
	public void setLoan_card_id(String loan_card_id ){
		this.loan_card_id = loan_card_id;
	}

	/**
	* 地税登记证年检到期日
	*@return
	*/
	public String getLoc_tax_ann_date(){
		return  loc_tax_ann_date;
	}
	/**
	* 地税登记证年检到期日
	*@param  loc_tax_ann_date
	*/
	public void setLoc_tax_ann_date(String loc_tax_ann_date ){
		this.loc_tax_ann_date = loc_tax_ann_date;
	}

	/**
	* 地税税务登记代码
	*@return
	*/
	public String getLoc_tax_reg_code(){
		return  loc_tax_reg_code;
	}
	/**
	* 地税税务登记代码
	*@param  loc_tax_reg_code
	*/
	public void setLoc_tax_reg_code(String loc_tax_reg_code ){
		this.loc_tax_reg_code = loc_tax_reg_code;
	}

	/**
	* 地税税务登记日期
	*@return
	*/
	public String getLoc_tax_reg_dt(){
		return  loc_tax_reg_dt;
	}
	/**
	* 地税税务登记日期
	*@param  loc_tax_reg_dt
	*/
	public void setLoc_tax_reg_dt(String loc_tax_reg_dt ){
		this.loc_tax_reg_dt = loc_tax_reg_dt;
	}

	/**
	* 地税登记有效期
	*@return
	*/
	public String getLoc_tax_reg_end_dt(){
		return  loc_tax_reg_end_dt;
	}
	/**
	* 地税登记有效期
	*@param  loc_tax_reg_end_dt
	*/
	public void setLoc_tax_reg_end_dt(String loc_tax_reg_end_dt ){
		this.loc_tax_reg_end_dt = loc_tax_reg_end_dt;
	}

	/**
	* 地税税务登记机关
	*@return
	*/
	public String getLoc_tax_reg_org(){
		return  loc_tax_reg_org;
	}
	/**
	* 地税税务登记机关
	*@param  loc_tax_reg_org
	*/
	public void setLoc_tax_reg_org(String loc_tax_reg_org ){
		this.loc_tax_reg_org = loc_tax_reg_org;
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
	* 国税登记证年检到期日
	*@return
	*/
	public String getNat_tax_ann_date(){
		return  nat_tax_ann_date;
	}
	/**
	* 国税登记证年检到期日
	*@param  nat_tax_ann_date
	*/
	public void setNat_tax_ann_date(String nat_tax_ann_date ){
		this.nat_tax_ann_date = nat_tax_ann_date;
	}

	/**
	* 国税税务登记代码
	*@return
	*/
	public String getNat_tax_reg_code(){
		return  nat_tax_reg_code;
	}
	/**
	* 国税税务登记代码
	*@param  nat_tax_reg_code
	*/
	public void setNat_tax_reg_code(String nat_tax_reg_code ){
		this.nat_tax_reg_code = nat_tax_reg_code;
	}

	/**
	* 国税税务登记日期
	*@return
	*/
	public String getNat_tax_reg_dt(){
		return  nat_tax_reg_dt;
	}
	/**
	* 国税税务登记日期
	*@param  nat_tax_reg_dt
	*/
	public void setNat_tax_reg_dt(String nat_tax_reg_dt ){
		this.nat_tax_reg_dt = nat_tax_reg_dt;
	}

	/**
	* 国税登记有效期
	*@return
	*/
	public String getNat_tax_reg_end_dt(){
		return  nat_tax_reg_end_dt;
	}
	/**
	* 国税登记有效期
	*@param  nat_tax_reg_end_dt
	*/
	public void setNat_tax_reg_end_dt(String nat_tax_reg_end_dt ){
		this.nat_tax_reg_end_dt = nat_tax_reg_end_dt;
	}

	/**
	* 国税税务登记机关
	*@return
	*/
	public String getNat_tax_reg_org(){
		return  nat_tax_reg_org;
	}
	/**
	* 国税税务登记机关
	*@param  nat_tax_reg_org
	*/
	public void setNat_tax_reg_org(String nat_tax_reg_org ){
		this.nat_tax_reg_org = nat_tax_reg_org;
	}

	public String getNew_com_fin_rep_type(){
		return  new_com_fin_rep_type;
	}
	public void setNew_com_fin_rep_type(String new_com_fin_rep_type ){
		this.new_com_fin_rep_type = new_com_fin_rep_type;
	}

	public String getOpenday(){
		return  openday;
	}
	public void setOpenday(String openday ){
		this.openday = openday;
	}

	/**
	* 实收资本（万元）
	*@return
	*/
	public BigDecimal getPaid_cap_amt(){
		return  paid_cap_amt;
	}
	/**
	* 实收资本（万元）
	*@param  paid_cap_amt
	*/
	public void setPaid_cap_amt(BigDecimal paid_cap_amt ){
		this.paid_cap_amt = paid_cap_amt;
	}

	/**
	* 实收资本币种
	*@return
	*/
	public String getPaid_cap_cur_type(){
		return  paid_cap_cur_type;
	}
	/**
	* 实收资本币种
	*@param  paid_cap_cur_type
	*/
	public void setPaid_cap_cur_type(String paid_cap_cur_type ){
		this.paid_cap_cur_type = paid_cap_cur_type;
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

	public String getReality_controler_id_code(){
		return  reality_controler_id_code;
	}
	public void setReality_controler_id_code(String reality_controler_id_code ){
		this.reality_controler_id_code = reality_controler_id_code;
	}

	public String getReality_controler_id_type(){
		return  reality_controler_id_type;
	}
	public void setReality_controler_id_type(String reality_controler_id_type ){
		this.reality_controler_id_type = reality_controler_id_type;
	}

	public String getReality_controler_name(){
		return  reality_controler_name;
	}
	public void setReality_controler_name(String reality_controler_name ){
		this.reality_controler_name = reality_controler_name;
	}

	public String getReality_controler_no(){
		return  reality_controler_no;
	}
	public void setReality_controler_no(String reality_controler_no ){
		this.reality_controler_no = reality_controler_no;
	}

	public String getReality_id_code(){
		return  reality_id_code;
	}
	public void setReality_id_code(String reality_id_code ){
		this.reality_id_code = reality_id_code;
	}

	public String getReality_sps_id_type(){
		return  reality_sps_id_type;
	}
	public void setReality_sps_id_type(String reality_sps_id_type ){
		this.reality_sps_id_type = reality_sps_id_type;
	}

	public String getReality_sps_name(){
		return  reality_sps_name;
	}
	public void setReality_sps_name(String reality_sps_name ){
		this.reality_sps_name = reality_sps_name;
	}

	public String getReality_sps_no(){
		return  reality_sps_no;
	}
	public void setReality_sps_no(String reality_sps_no ){
		this.reality_sps_no = reality_sps_no;
	}

	public String getReal_accredit_end_date(){
		return  real_accredit_end_date;
	}
	public void setReal_accredit_end_date(String real_accredit_end_date ){
		this.real_accredit_end_date = real_accredit_end_date;
	}

	public String getReal_accredit_init_date(){
		return  real_accredit_init_date;
	}
	public void setReal_accredit_init_date(String real_accredit_init_date ){
		this.real_accredit_init_date = real_accredit_init_date;
	}

	public String getReal_sign_end_date(){
		return  real_sign_end_date;
	}
	public void setReal_sign_end_date(String real_sign_end_date ){
		this.real_sign_end_date = real_sign_end_date;
	}

	public String getReal_sign_init_date(){
		return  real_sign_init_date;
	}
	public void setReal_sign_init_date(String real_sign_init_date ){
		this.real_sign_init_date = real_sign_init_date;
	}

	public String getReal_work_resume(){
		return  real_work_resume;
	}
	public void setReal_work_resume(String real_work_resume ){
		this.real_work_resume = real_work_resume;
	}

	/**
	* 注册登记地址
	*@return
	*/
	public String getReg_addr(){
		return  reg_addr;
	}
	/**
	* 注册登记地址
	*@param  reg_addr
	*/
	public void setReg_addr(String reg_addr ){
		this.reg_addr = reg_addr;
	}

	/**
	* 注册地区域编码2
	*@return
	*/
	public String getReg_area_code2(){
		return  reg_area_code2;
	}
	/**
	* 注册地区域编码2
	*@param  reg_area_code2
	*/
	public void setReg_area_code2(String reg_area_code2 ){
		this.reg_area_code2 = reg_area_code2;
	}

	/**
	* 注册地区域编码3
	*@return
	*/
	public String getReg_area_code3(){
		return  reg_area_code3;
	}
	/**
	* 注册地区域编码3
	*@param  reg_area_code3
	*/
	public void setReg_area_code3(String reg_area_code3 ){
		this.reg_area_code3 = reg_area_code3;
	}

	/**
	* 行政区划名称
	*@return
	*/
	public String getReg_area_name(){
		return  reg_area_name;
	}
	/**
	* 行政区划名称
	*@param  reg_area_name
	*/
	public void setReg_area_name(String reg_area_name ){
		this.reg_area_name = reg_area_name;
	}

	/**
	* 注册登记年审结论
	*@return
	*/
	public String getReg_audit(){
		return  reg_audit;
	}
	/**
	* 注册登记年审结论
	*@param  reg_audit
	*/
	public void setReg_audit(String reg_audit ){
		this.reg_audit = reg_audit;
	}

	/**
	* 注册登记年审日期
	*@return
	*/
	public String getReg_audit_date(){
		return  reg_audit_date;
	}
	/**
	* 注册登记年审日期
	*@param  reg_audit_date
	*/
	public void setReg_audit_date(String reg_audit_date ){
		this.reg_audit_date = reg_audit_date;
	}

	/**
	* 注册登记年审到期日
	*@return
	*/
	public String getReg_audit_end_date(){
		return  reg_audit_end_date;
	}
	/**
	* 注册登记年审到期日
	*@param  reg_audit_end_date
	*/
	public void setReg_audit_end_date(String reg_audit_end_date ){
		this.reg_audit_end_date = reg_audit_end_date;
	}

	/**
	* 注册资本（万元）
	*@return
	*/
	public BigDecimal getReg_cap_amt(){
		return  reg_cap_amt;
	}
	/**
	* 注册资本（万元）
	*@param  reg_cap_amt
	*/
	public void setReg_cap_amt(BigDecimal reg_cap_amt ){
		this.reg_cap_amt = reg_cap_amt;
	}

	/**
	* 登记注册号
	*@return
	*/
	public String getReg_code(){
		return  reg_code;
	}
	/**
	* 登记注册号
	*@param  reg_code
	*/
	public void setReg_code(String reg_code ){
		this.reg_code = reg_code;
	}

	/**
	* 注册资本/开办资金币种
	*@return
	*/
	public String getReg_cur_type(){
		return  reg_cur_type;
	}
	/**
	* 注册资本/开办资金币种
	*@param  reg_cur_type
	*/
	public void setReg_cur_type(String reg_cur_type ){
		this.reg_cur_type = reg_cur_type;
	}

	/**
	* 注册登记到期日期
	*@return
	*/
	public String getReg_end_date(){
		return  reg_end_date;
	}
	/**
	* 注册登记到期日期
	*@param  reg_end_date
	*/
	public void setReg_end_date(String reg_end_date ){
		this.reg_end_date = reg_end_date;
	}

	/**
	* 注册登记机关
	*@return
	*/
	public String getReg_org(){
		return  reg_org;
	}
	/**
	* 注册登记机关
	*@param  reg_org
	*/
	public void setReg_org(String reg_org ){
		this.reg_org = reg_org;
	}

	/**
	* 注册登记日期
	*@return
	*/
	public String getReg_start_date(){
		return  reg_start_date;
	}
	/**
	* 注册登记日期
	*@param  reg_start_date
	*/
	public void setReg_start_date(String reg_start_date ){
		this.reg_start_date = reg_start_date;
	}

	/**
	* 注册地行政区划
	*@return
	*/
	public String getReg_state_code(){
		return  reg_state_code;
	}
	/**
	* 注册地行政区划
	*@param  reg_state_code
	*/
	public void setReg_state_code(String reg_state_code ){
		this.reg_state_code = reg_state_code;
	}

	/**
	* 注册登记类型
	*@return
	*/
	public String getReg_type(){
		return  reg_type;
	}
	/**
	* 注册登记类型
	*@param  reg_type
	*/
	public void setReg_type(String reg_type ){
		this.reg_type = reg_type;
	}

	/**
	* 更新注册信息日期
	*@return
	*/
	public String getReg_upd_date(){
		return  reg_upd_date;
	}
	/**
	* 更新注册信息日期
	*@param  reg_upd_date
	*/
	public void setReg_upd_date(String reg_upd_date ){
		this.reg_upd_date = reg_upd_date;
	}

	public String getRemark(){
		return  remark;
	}
	public void setRemark(String remark ){
		this.remark = remark;
	}

	/**
	* 风险预警信号
	*@return
	*/
	public String getRisc_code(){
		return  risc_code;
	}
	/**
	* 风险预警信号
	*@param  risc_code
	*/
	public void setRisc_code(String risc_code ){
		this.risc_code = risc_code;
	}

	public String getRisk_des(){
		return  risk_des;
	}
	public void setRisk_des(String risk_des ){
		this.risk_des = risk_des;
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
	* 法定代表人配偶证件号码
	*@return
	*/
	public String getSpouse_cert_code(){
		return  spouse_cert_code;
	}
	/**
	* 法定代表人配偶证件号码
	*@param  spouse_cert_code
	*/
	public void setSpouse_cert_code(String spouse_cert_code ){
		this.spouse_cert_code = spouse_cert_code;
	}

	/**
	* 法定代表人配偶证件类型
	*@return
	*/
	public String getSpouse_cert_type(){
		return  spouse_cert_type;
	}
	/**
	* 法定代表人配偶证件类型
	*@param  spouse_cert_type
	*/
	public void setSpouse_cert_type(String spouse_cert_type ){
		this.spouse_cert_type = spouse_cert_type;
	}

	/**
	* 法定代表人配偶名称
	*@return
	*/
	public String getSpouse_name(){
		return  spouse_name;
	}
	/**
	* 法定代表人配偶名称
	*@param  spouse_name
	*/
	public void setSpouse_name(String spouse_name ){
		this.spouse_name = spouse_name;
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
	* 资产规模（万元）
	*@return
	*/
	public BigDecimal getTotal_assets(){
		return  total_assets;
	}
	/**
	* 资产规模（万元）
	*@param  total_assets
	*/
	public void setTotal_assets(BigDecimal total_assets ){
		this.total_assets = total_assets;
	}

	/**
	* 销售总额（万元）
	*@return
	*/
	public BigDecimal getTotal_sales(){
		return  total_sales;
	}
	/**
	* 销售总额（万元）
	*@param  total_sales
	*/
	public void setTotal_sales(BigDecimal total_sales ){
		this.total_sales = total_sales;
	}

	/**
	* 网址
	*@return
	*/
	public String getWeb_url(){
		return  web_url;
	}
	/**
	* 网址
	*@param  web_url
	*/
	public void setWeb_url(String web_url ){
		this.web_url = web_url;
	}

	/**
	* 办公地址行政代码
	*@return
	*/
	public String getWrk_state_code(){
		return  wrk_state_code;
	}
	/**
	* 办公地址行政代码
	*@param  wrk_state_code
	*/
	public void setWrk_state_code(String wrk_state_code ){
		this.wrk_state_code = wrk_state_code;
	}

	/**
	* 办公地址行政区域名称
	*@return
	*/
	public String getWrk_state_name(){
		return  wrk_state_name;
	}
	/**
	* 办公地址行政区域名称
	*@param  wrk_state_name
	*/
	public void setWrk_state_name(String wrk_state_name ){
		this.wrk_state_name = wrk_state_name;
	}

	/**
	* 更新办公地址日期
	*@return
	*/
	public String getWrk_upd_date(){
		return  wrk_upd_date;
	}
	/**
	* 更新办公地址日期
	*@param  wrk_upd_date
	*/
	public void setWrk_upd_date(String wrk_upd_date ){
		this.wrk_upd_date = wrk_upd_date;
	}


}
