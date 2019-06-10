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
@Table(name="RPT_M_RPT_SLS_ACCT")
public class RptMRptSlsAcct   {

	/*
	贷款账号
	*/
    @AssignID()
	private String loan_account ;
	/*
	从业人数
	*/
	private Integer com_employee ;
	/*
	贷款展期次数
	*/
	private Integer extension_times ;
	/*
	贷款剩余期限
	*/
	private Integer rem_repays ;
	/*
	贷款账户状态
	*/
	private String account_status ;
	/*
	03新帐标志
	*/
	private String acct_flg_03 ;
	/*
	05新帐标志
	*/
	private String acct_flg_05 ;
	/*
	本年累计收息
	*/
	private BigDecimal actual_int_cumu ;
	/*
	涉农情况
	*/
	private String agriculture_type ;
	/*
	涉农用途
	*/
	private String agriculture_use ;
	/*
	是否农户标志
	*/
	private String agri_flg ;
	/*
	区域
	*/
	private String area_code ;
	/*
	珠三角标志
	*/
	private String area_ind ;
	/*
	借款人地址
	*/
	private String arer_addr ;
	private String assure_means2 ;
	private String assure_means3 ;
	/*
	主担保方式
	*/
	private String assure_means_main ;
	/*
	借据号
	*/
	private String bill_no ;
	/*
	信贷产品号
	*/
	private String biz_type ;
	/*
	产品细分类名
	*/
	private String biz_type_detail ;
	/*
	“三法一引”分类
	*/
	private String biz_type_flg ;
	/*
	产品细分
	*/
	private String biz_type_sub ;
	/*
	本息逾期日
	*/
	private String capint_overdue_date ;
	/*
	本金逾期起始日期
	*/
	private String cap_overdue_date ;
	/*
	客户证件类型
	*/
	private String cert_type ;
	/*
	五级分类
	*/
	private String cla ;
	private String col1 ;
	private String col10 ;
	private String col11 ;
	private String col12 ;
	private String col13 ;
	private String col14 ;
	private String col15 ;
	private String col2 ;
	private String col3 ;
	private String col4 ;
	private String col5 ;
	private String col6 ;
	private String col7 ;
	private String col8 ;
	private String col9 ;
	/*
	城乡类型
	*/
	private String com_city_flg ;
	/*
	企业行业分类4层
	*/
	private String com_cll_type ;
	/*
	国别
	*/
	private String com_country ;
	/*
	其中属于公共企业
	*/
	private String com_enterprise ;
	/*
	龙头企业
	*/
	private String com_hd_enterprise ;
	/*
	控股类型
	*/
	private String com_hold_type ;
	/*
	企业机构代码
	*/
	private String com_ins_code ;
	/*
	是否异地企业
	*/
	private String com_lcl_flg ;
	/*
	上市公司标志
	*/
	private String com_mrk_flg ;
	/*
	优势企业
	*/
	private String com_prep_flg ;
	/*
	企业规模
	*/
	private String com_scale ;
	/*
	隶属关系
	*/
	private String com_sub_typ ;
	/*
	贷款合同金额
	*/
	private BigDecimal cont_amt ;
	/*
	合同到期日
	*/
	private String cont_end_date ;
	/*
	合同号
	*/
	private String cont_no ;
	/*
	合同类型
	*/
	private String cont_type ;
	/*
	法人代码
	*/
	private String creunit_no ;
	/*
	币种
	*/
	private String currency ;
	/*
	客户与我行关系
	*/
	private String cust_bank_rel ;
	/*
	客户经理
	*/
	private String cust_mgr ;
	/*
	客户类型
	*/
	private String cust_type ;
	/*
	客户代码
	*/
	private String cus_id ;
	/*
	关联客户代码
	*/
	private String cus_id_rel ;
	/*
	户名
	*/
	private String cus_name ;
	/*
	数据中心代码
	*/
	private String data_center_no ;
	/*
	累计欠息
	*/
	private BigDecimal delay_int_cumu ;
	/*
	委托贷款标志
	*/
	private String entrust_ind ;
	/*
	对公开户证件号码
	*/
	private String ent_cert_code ;
	private String exit_high_risk_time ;
	/*
	账务机构
	*/
	private String fina_br_id ;
	/*
	首次放款日
	*/
	private String first_disb_date ;
	/*
	利率浮动值
	*/
	private BigDecimal floating_rate ;
	/*
	核销日期
	*/
	private String gent_date ;
	/*
	科目
	*/
	private String gl_class ;
	/*
	涉政类型
	*/
	private String government_ind ;
	/*
	涉政属性
	*/
	private String government_org_attribute ;
	/*
	政府融资平台标志
	*/
	private String government_platform ;
	/*
	集团名称
	*/
	private String grp_name ;
	/*
	集团客户编号
	*/
	private String grp_no ;
	/*
	联保标志
	*/
	private String guarantora_grp_ind ;
	/*
	担保合同编号
	*/
	private String guar_cont_no ;
	/*
	担保方式
	*/
	private String guar_way ;
	private String high_risk_sign ;
	private String high_risk_time ;
	/*
	单位所属行业
	*/
	private String indiv_com_fld ;
	/*
	工作单位
	*/
	private String indiv_com_name ;
	/*
	单位性质
	*/
	private String indiv_com_typ ;
	/*
	贷款个人居住地址
	*/
	private String indiv_rsd_addr ;
	/*
	法人机构号
	*/
	private String inst_no ;
	/*
	利息逾期起始日期
	*/
	private String interest_overdue_date ;
	/*
	利率浮动比
	*/
	private BigDecimal int_rate_inc ;
	/*
	利率类型
	*/
	private String int_rate_type ;
	/*
	投资主体
	*/
	private String invest_type ;
	/*
	公积金贷款标志
	*/
	private String ispaf ;
	/*
	是否下岗人员标志
	*/
	private String lay_off_flag ;
	/*
	授信额度使用标志
	*/
	private String limit_ind ;
	/*
	授信协议编号
	*/
	private String lmt_cont_no ;
	/*
	贷款分类
	*/
	private String ln_type ;
	/*
	借据金额
	*/
	private BigDecimal loan_amount ;
	/*
	余额
	*/
	private BigDecimal loan_balance ;
	/*
	使用农户贷款证标志
	*/
	private String loan_card_ind ;
	/*
	四级分类
	*/
	private String loan_cla4 ;
	/*
	贷款减值
	*/
	private BigDecimal loan_devalue ;
	/*
	行业投向4层
	*/
	private String loan_direction ;
	/*
	到期日
	*/
	private String loan_end_date ;
	/*
	贷款类型
	*/
	private String loan_form ;
	/*
	贷款性质
	*/
	private String loan_nature ;
	/*
	借款日
	*/
	private String loan_start_date ;
	/*
	贷款期限
	*/
	private String loan_term ;
	/*
	林权贷款标志
	*/
	private String lq_type ;
	/*
	主管机构
	*/
	private String main_br_id ;
	/*
	投向背景主体标识
	*/
	private String main_flag ;
	/*
	主产品号
	*/
	private String main_prod_cd ;
	/*
	特色产品编码
	*/
	private String main_pro_type ;
	/*
	本年累计收本
	*/
	private BigDecimal nor_rec_accu ;
	/*
	原到期日
	*/
	private String orig_expi_date ;
	/*
	集团客户证件号码
	*/
	private String parent_org_code ;
	/*
	受托支付方式
	*/
	private String pay_way ;
	/*
	产品类别
	*/
	private String prd_type ;
	/*
	个人证件号码
	*/
	private String psn_cert_code ;
	/*
	年利率
	*/
	private BigDecimal reality_ir_y ;
	/*
	工商户名称/企业名称
	*/
	private String register_name ;
	/*
	注册号/社会代码
	*/
	private String register_no ;
	/*
	注册登记地址
	*/
	private String reg_addr ;
	/*
	注册资本（万元）
	*/
	private BigDecimal reg_cap_amt ;
	/*
	行政区域号
	*/
	private String reg_state_code ;
	/*
	注册登记类型
	*/
	private String reg_type ;
	/*
	还款方式
	*/
	private String repayment_mode ;
	/*
	置换类型
	*/
	private String repla_type ;
	/*
	贷款基准利率
	*/
	private BigDecimal ruling_ir ;
	/*
	融资担保贷款标志
	*/
	private String rzdb_type ;
	/*
	结清日期
	*/
	private String settl_date ;
	/*
	七级分类
	*/
	private String seven_result ;
	/*
	三农专营
	*/
	private String sn_type ;
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
	首套房标志
	*/
	private String stf_type ;
	/*
	子产品号
	*/
	private String sub_prod_cd ;
	/*
	账户累计收本
	*/
	private BigDecimal sum_repay_amt ;
	/*
	自营贷款标志
	*/
	private String syndicated_ind ;
	/*
	银团类型
	*/
	private String syndicated_type ;
	/*
	平台日期
	*/
	private String sys_biz_date ;
	/*
	期限类型
	*/
	private String term_type ;
	/*
	资产规模（万元）
	*/
	private BigDecimal total_assets ;
	/*
	销售总额（万元）
	*/
	private BigDecimal total_sales ;
	/*
	拖欠本金
	*/
	private BigDecimal unpd_prin_bal ;
	/*
	上年末五级分类状态
	*/
	private String up_cla ;
	/*
	用途
	*/
	private String use_dec ;
	/*
	小企业专营
	*/
	private String xqy_type ;
	/*
	应收账款质押贷款标志
	*/
	private String yszy_type ;
	/*
	银社团参与行标志
	*/
	private String ytcy_type ;

	public RptMRptSlsAcct() {
	}

	/**
	* 贷款账号
	*@return
	*/
	public String getLoan_account(){
		return  loan_account;
	}
	/**
	* 贷款账号
	*@param  loan_account
	*/
	public void setLoan_account(String loan_account ){
		this.loan_account = loan_account;
	}

	/**
	* 从业人数
	*@return
	*/
	public Integer getCom_employee(){
		return  com_employee;
	}
	/**
	* 从业人数
	*@param  com_employee
	*/
	public void setCom_employee(Integer com_employee ){
		this.com_employee = com_employee;
	}

	/**
	* 贷款展期次数
	*@return
	*/
	public Integer getExtension_times(){
		return  extension_times;
	}
	/**
	* 贷款展期次数
	*@param  extension_times
	*/
	public void setExtension_times(Integer extension_times ){
		this.extension_times = extension_times;
	}

	/**
	* 贷款剩余期限
	*@return
	*/
	public Integer getRem_repays(){
		return  rem_repays;
	}
	/**
	* 贷款剩余期限
	*@param  rem_repays
	*/
	public void setRem_repays(Integer rem_repays ){
		this.rem_repays = rem_repays;
	}

	/**
	* 贷款账户状态
	*@return
	*/
	public String getAccount_status(){
		return  account_status;
	}
	/**
	* 贷款账户状态
	*@param  account_status
	*/
	public void setAccount_status(String account_status ){
		this.account_status = account_status;
	}

	/**
	* 03新帐标志
	*@return
	*/
	public String getAcct_flg_03(){
		return  acct_flg_03;
	}
	/**
	* 03新帐标志
	*@param  acct_flg_03
	*/
	public void setAcct_flg_03(String acct_flg_03 ){
		this.acct_flg_03 = acct_flg_03;
	}

	/**
	* 05新帐标志
	*@return
	*/
	public String getAcct_flg_05(){
		return  acct_flg_05;
	}
	/**
	* 05新帐标志
	*@param  acct_flg_05
	*/
	public void setAcct_flg_05(String acct_flg_05 ){
		this.acct_flg_05 = acct_flg_05;
	}

	/**
	* 本年累计收息
	*@return
	*/
	public BigDecimal getActual_int_cumu(){
		return  actual_int_cumu;
	}
	/**
	* 本年累计收息
	*@param  actual_int_cumu
	*/
	public void setActual_int_cumu(BigDecimal actual_int_cumu ){
		this.actual_int_cumu = actual_int_cumu;
	}

	/**
	* 涉农情况
	*@return
	*/
	public String getAgriculture_type(){
		return  agriculture_type;
	}
	/**
	* 涉农情况
	*@param  agriculture_type
	*/
	public void setAgriculture_type(String agriculture_type ){
		this.agriculture_type = agriculture_type;
	}

	/**
	* 涉农用途
	*@return
	*/
	public String getAgriculture_use(){
		return  agriculture_use;
	}
	/**
	* 涉农用途
	*@param  agriculture_use
	*/
	public void setAgriculture_use(String agriculture_use ){
		this.agriculture_use = agriculture_use;
	}

	/**
	* 是否农户标志
	*@return
	*/
	public String getAgri_flg(){
		return  agri_flg;
	}
	/**
	* 是否农户标志
	*@param  agri_flg
	*/
	public void setAgri_flg(String agri_flg ){
		this.agri_flg = agri_flg;
	}

	/**
	* 区域
	*@return
	*/
	public String getArea_code(){
		return  area_code;
	}
	/**
	* 区域
	*@param  area_code
	*/
	public void setArea_code(String area_code ){
		this.area_code = area_code;
	}

	/**
	* 珠三角标志
	*@return
	*/
	public String getArea_ind(){
		return  area_ind;
	}
	/**
	* 珠三角标志
	*@param  area_ind
	*/
	public void setArea_ind(String area_ind ){
		this.area_ind = area_ind;
	}

	/**
	* 借款人地址
	*@return
	*/
	public String getArer_addr(){
		return  arer_addr;
	}
	/**
	* 借款人地址
	*@param  arer_addr
	*/
	public void setArer_addr(String arer_addr ){
		this.arer_addr = arer_addr;
	}

	public String getAssure_means2(){
		return  assure_means2;
	}
	public void setAssure_means2(String assure_means2 ){
		this.assure_means2 = assure_means2;
	}

	public String getAssure_means3(){
		return  assure_means3;
	}
	public void setAssure_means3(String assure_means3 ){
		this.assure_means3 = assure_means3;
	}

	/**
	* 主担保方式
	*@return
	*/
	public String getAssure_means_main(){
		return  assure_means_main;
	}
	/**
	* 主担保方式
	*@param  assure_means_main
	*/
	public void setAssure_means_main(String assure_means_main ){
		this.assure_means_main = assure_means_main;
	}

	/**
	* 借据号
	*@return
	*/
	public String getBill_no(){
		return  bill_no;
	}
	/**
	* 借据号
	*@param  bill_no
	*/
	public void setBill_no(String bill_no ){
		this.bill_no = bill_no;
	}

	/**
	* 信贷产品号
	*@return
	*/
	public String getBiz_type(){
		return  biz_type;
	}
	/**
	* 信贷产品号
	*@param  biz_type
	*/
	public void setBiz_type(String biz_type ){
		this.biz_type = biz_type;
	}

	/**
	* 产品细分类名
	*@return
	*/
	public String getBiz_type_detail(){
		return  biz_type_detail;
	}
	/**
	* 产品细分类名
	*@param  biz_type_detail
	*/
	public void setBiz_type_detail(String biz_type_detail ){
		this.biz_type_detail = biz_type_detail;
	}

	/**
	* “三法一引”分类
	*@return
	*/
	public String getBiz_type_flg(){
		return  biz_type_flg;
	}
	/**
	* “三法一引”分类
	*@param  biz_type_flg
	*/
	public void setBiz_type_flg(String biz_type_flg ){
		this.biz_type_flg = biz_type_flg;
	}

	/**
	* 产品细分
	*@return
	*/
	public String getBiz_type_sub(){
		return  biz_type_sub;
	}
	/**
	* 产品细分
	*@param  biz_type_sub
	*/
	public void setBiz_type_sub(String biz_type_sub ){
		this.biz_type_sub = biz_type_sub;
	}

	/**
	* 本息逾期日
	*@return
	*/
	public String getCapint_overdue_date(){
		return  capint_overdue_date;
	}
	/**
	* 本息逾期日
	*@param  capint_overdue_date
	*/
	public void setCapint_overdue_date(String capint_overdue_date ){
		this.capint_overdue_date = capint_overdue_date;
	}

	/**
	* 本金逾期起始日期
	*@return
	*/
	public String getCap_overdue_date(){
		return  cap_overdue_date;
	}
	/**
	* 本金逾期起始日期
	*@param  cap_overdue_date
	*/
	public void setCap_overdue_date(String cap_overdue_date ){
		this.cap_overdue_date = cap_overdue_date;
	}

	/**
	* 客户证件类型
	*@return
	*/
	public String getCert_type(){
		return  cert_type;
	}
	/**
	* 客户证件类型
	*@param  cert_type
	*/
	public void setCert_type(String cert_type ){
		this.cert_type = cert_type;
	}

	/**
	* 五级分类
	*@return
	*/
	public String getCla(){
		return  cla;
	}
	/**
	* 五级分类
	*@param  cla
	*/
	public void setCla(String cla ){
		this.cla = cla;
	}

	public String getCol1(){
		return  col1;
	}
	public void setCol1(String col1 ){
		this.col1 = col1;
	}

	public String getCol10(){
		return  col10;
	}
	public void setCol10(String col10 ){
		this.col10 = col10;
	}

	public String getCol11(){
		return  col11;
	}
	public void setCol11(String col11 ){
		this.col11 = col11;
	}

	public String getCol12(){
		return  col12;
	}
	public void setCol12(String col12 ){
		this.col12 = col12;
	}

	public String getCol13(){
		return  col13;
	}
	public void setCol13(String col13 ){
		this.col13 = col13;
	}

	public String getCol14(){
		return  col14;
	}
	public void setCol14(String col14 ){
		this.col14 = col14;
	}

	public String getCol15(){
		return  col15;
	}
	public void setCol15(String col15 ){
		this.col15 = col15;
	}

	public String getCol2(){
		return  col2;
	}
	public void setCol2(String col2 ){
		this.col2 = col2;
	}

	public String getCol3(){
		return  col3;
	}
	public void setCol3(String col3 ){
		this.col3 = col3;
	}

	public String getCol4(){
		return  col4;
	}
	public void setCol4(String col4 ){
		this.col4 = col4;
	}

	public String getCol5(){
		return  col5;
	}
	public void setCol5(String col5 ){
		this.col5 = col5;
	}

	public String getCol6(){
		return  col6;
	}
	public void setCol6(String col6 ){
		this.col6 = col6;
	}

	public String getCol7(){
		return  col7;
	}
	public void setCol7(String col7 ){
		this.col7 = col7;
	}

	public String getCol8(){
		return  col8;
	}
	public void setCol8(String col8 ){
		this.col8 = col8;
	}

	public String getCol9(){
		return  col9;
	}
	public void setCol9(String col9 ){
		this.col9 = col9;
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
	* 企业行业分类4层
	*@return
	*/
	public String getCom_cll_type(){
		return  com_cll_type;
	}
	/**
	* 企业行业分类4层
	*@param  com_cll_type
	*/
	public void setCom_cll_type(String com_cll_type ){
		this.com_cll_type = com_cll_type;
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
	* 其中属于公共企业
	*@return
	*/
	public String getCom_enterprise(){
		return  com_enterprise;
	}
	/**
	* 其中属于公共企业
	*@param  com_enterprise
	*/
	public void setCom_enterprise(String com_enterprise ){
		this.com_enterprise = com_enterprise;
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
	* 企业机构代码
	*@return
	*/
	public String getCom_ins_code(){
		return  com_ins_code;
	}
	/**
	* 企业机构代码
	*@param  com_ins_code
	*/
	public void setCom_ins_code(String com_ins_code ){
		this.com_ins_code = com_ins_code;
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
	* 贷款合同金额
	*@return
	*/
	public BigDecimal getCont_amt(){
		return  cont_amt;
	}
	/**
	* 贷款合同金额
	*@param  cont_amt
	*/
	public void setCont_amt(BigDecimal cont_amt ){
		this.cont_amt = cont_amt;
	}

	/**
	* 合同到期日
	*@return
	*/
	public String getCont_end_date(){
		return  cont_end_date;
	}
	/**
	* 合同到期日
	*@param  cont_end_date
	*/
	public void setCont_end_date(String cont_end_date ){
		this.cont_end_date = cont_end_date;
	}

	/**
	* 合同号
	*@return
	*/
	public String getCont_no(){
		return  cont_no;
	}
	/**
	* 合同号
	*@param  cont_no
	*/
	public void setCont_no(String cont_no ){
		this.cont_no = cont_no;
	}

	/**
	* 合同类型
	*@return
	*/
	public String getCont_type(){
		return  cont_type;
	}
	/**
	* 合同类型
	*@param  cont_type
	*/
	public void setCont_type(String cont_type ){
		this.cont_type = cont_type;
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
	* 币种
	*@return
	*/
	public String getCurrency(){
		return  currency;
	}
	/**
	* 币种
	*@param  currency
	*/
	public void setCurrency(String currency ){
		this.currency = currency;
	}

	/**
	* 客户与我行关系
	*@return
	*/
	public String getCust_bank_rel(){
		return  cust_bank_rel;
	}
	/**
	* 客户与我行关系
	*@param  cust_bank_rel
	*/
	public void setCust_bank_rel(String cust_bank_rel ){
		this.cust_bank_rel = cust_bank_rel;
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
	* 客户类型
	*@return
	*/
	public String getCust_type(){
		return  cust_type;
	}
	/**
	* 客户类型
	*@param  cust_type
	*/
	public void setCust_type(String cust_type ){
		this.cust_type = cust_type;
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
	* 关联客户代码
	*@return
	*/
	public String getCus_id_rel(){
		return  cus_id_rel;
	}
	/**
	* 关联客户代码
	*@param  cus_id_rel
	*/
	public void setCus_id_rel(String cus_id_rel ){
		this.cus_id_rel = cus_id_rel;
	}

	/**
	* 户名
	*@return
	*/
	public String getCus_name(){
		return  cus_name;
	}
	/**
	* 户名
	*@param  cus_name
	*/
	public void setCus_name(String cus_name ){
		this.cus_name = cus_name;
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
	* 累计欠息
	*@return
	*/
	public BigDecimal getDelay_int_cumu(){
		return  delay_int_cumu;
	}
	/**
	* 累计欠息
	*@param  delay_int_cumu
	*/
	public void setDelay_int_cumu(BigDecimal delay_int_cumu ){
		this.delay_int_cumu = delay_int_cumu;
	}

	/**
	* 委托贷款标志
	*@return
	*/
	public String getEntrust_ind(){
		return  entrust_ind;
	}
	/**
	* 委托贷款标志
	*@param  entrust_ind
	*/
	public void setEntrust_ind(String entrust_ind ){
		this.entrust_ind = entrust_ind;
	}

	/**
	* 对公开户证件号码
	*@return
	*/
	public String getEnt_cert_code(){
		return  ent_cert_code;
	}
	/**
	* 对公开户证件号码
	*@param  ent_cert_code
	*/
	public void setEnt_cert_code(String ent_cert_code ){
		this.ent_cert_code = ent_cert_code;
	}

	public String getExit_high_risk_time(){
		return  exit_high_risk_time;
	}
	public void setExit_high_risk_time(String exit_high_risk_time ){
		this.exit_high_risk_time = exit_high_risk_time;
	}

	/**
	* 账务机构
	*@return
	*/
	public String getFina_br_id(){
		return  fina_br_id;
	}
	/**
	* 账务机构
	*@param  fina_br_id
	*/
	public void setFina_br_id(String fina_br_id ){
		this.fina_br_id = fina_br_id;
	}

	/**
	* 首次放款日
	*@return
	*/
	public String getFirst_disb_date(){
		return  first_disb_date;
	}
	/**
	* 首次放款日
	*@param  first_disb_date
	*/
	public void setFirst_disb_date(String first_disb_date ){
		this.first_disb_date = first_disb_date;
	}

	/**
	* 利率浮动值
	*@return
	*/
	public BigDecimal getFloating_rate(){
		return  floating_rate;
	}
	/**
	* 利率浮动值
	*@param  floating_rate
	*/
	public void setFloating_rate(BigDecimal floating_rate ){
		this.floating_rate = floating_rate;
	}

	/**
	* 核销日期
	*@return
	*/
	public String getGent_date(){
		return  gent_date;
	}
	/**
	* 核销日期
	*@param  gent_date
	*/
	public void setGent_date(String gent_date ){
		this.gent_date = gent_date;
	}

	/**
	* 科目
	*@return
	*/
	public String getGl_class(){
		return  gl_class;
	}
	/**
	* 科目
	*@param  gl_class
	*/
	public void setGl_class(String gl_class ){
		this.gl_class = gl_class;
	}

	/**
	* 涉政类型
	*@return
	*/
	public String getGovernment_ind(){
		return  government_ind;
	}
	/**
	* 涉政类型
	*@param  government_ind
	*/
	public void setGovernment_ind(String government_ind ){
		this.government_ind = government_ind;
	}

	/**
	* 涉政属性
	*@return
	*/
	public String getGovernment_org_attribute(){
		return  government_org_attribute;
	}
	/**
	* 涉政属性
	*@param  government_org_attribute
	*/
	public void setGovernment_org_attribute(String government_org_attribute ){
		this.government_org_attribute = government_org_attribute;
	}

	/**
	* 政府融资平台标志
	*@return
	*/
	public String getGovernment_platform(){
		return  government_platform;
	}
	/**
	* 政府融资平台标志
	*@param  government_platform
	*/
	public void setGovernment_platform(String government_platform ){
		this.government_platform = government_platform;
	}

	/**
	* 集团名称
	*@return
	*/
	public String getGrp_name(){
		return  grp_name;
	}
	/**
	* 集团名称
	*@param  grp_name
	*/
	public void setGrp_name(String grp_name ){
		this.grp_name = grp_name;
	}

	/**
	* 集团客户编号
	*@return
	*/
	public String getGrp_no(){
		return  grp_no;
	}
	/**
	* 集团客户编号
	*@param  grp_no
	*/
	public void setGrp_no(String grp_no ){
		this.grp_no = grp_no;
	}

	/**
	* 联保标志
	*@return
	*/
	public String getGuarantora_grp_ind(){
		return  guarantora_grp_ind;
	}
	/**
	* 联保标志
	*@param  guarantora_grp_ind
	*/
	public void setGuarantora_grp_ind(String guarantora_grp_ind ){
		this.guarantora_grp_ind = guarantora_grp_ind;
	}

	/**
	* 担保合同编号
	*@return
	*/
	public String getGuar_cont_no(){
		return  guar_cont_no;
	}
	/**
	* 担保合同编号
	*@param  guar_cont_no
	*/
	public void setGuar_cont_no(String guar_cont_no ){
		this.guar_cont_no = guar_cont_no;
	}

	/**
	* 担保方式
	*@return
	*/
	public String getGuar_way(){
		return  guar_way;
	}
	/**
	* 担保方式
	*@param  guar_way
	*/
	public void setGuar_way(String guar_way ){
		this.guar_way = guar_way;
	}

	public String getHigh_risk_sign(){
		return  high_risk_sign;
	}
	public void setHigh_risk_sign(String high_risk_sign ){
		this.high_risk_sign = high_risk_sign;
	}

	public String getHigh_risk_time(){
		return  high_risk_time;
	}
	public void setHigh_risk_time(String high_risk_time ){
		this.high_risk_time = high_risk_time;
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
	* 贷款个人居住地址
	*@return
	*/
	public String getIndiv_rsd_addr(){
		return  indiv_rsd_addr;
	}
	/**
	* 贷款个人居住地址
	*@param  indiv_rsd_addr
	*/
	public void setIndiv_rsd_addr(String indiv_rsd_addr ){
		this.indiv_rsd_addr = indiv_rsd_addr;
	}

	/**
	* 法人机构号
	*@return
	*/
	public String getInst_no(){
		return  inst_no;
	}
	/**
	* 法人机构号
	*@param  inst_no
	*/
	public void setInst_no(String inst_no ){
		this.inst_no = inst_no;
	}

	/**
	* 利息逾期起始日期
	*@return
	*/
	public String getInterest_overdue_date(){
		return  interest_overdue_date;
	}
	/**
	* 利息逾期起始日期
	*@param  interest_overdue_date
	*/
	public void setInterest_overdue_date(String interest_overdue_date ){
		this.interest_overdue_date = interest_overdue_date;
	}

	/**
	* 利率浮动比
	*@return
	*/
	public BigDecimal getInt_rate_inc(){
		return  int_rate_inc;
	}
	/**
	* 利率浮动比
	*@param  int_rate_inc
	*/
	public void setInt_rate_inc(BigDecimal int_rate_inc ){
		this.int_rate_inc = int_rate_inc;
	}

	/**
	* 利率类型
	*@return
	*/
	public String getInt_rate_type(){
		return  int_rate_type;
	}
	/**
	* 利率类型
	*@param  int_rate_type
	*/
	public void setInt_rate_type(String int_rate_type ){
		this.int_rate_type = int_rate_type;
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

	/**
	* 公积金贷款标志
	*@return
	*/
	public String getIspaf(){
		return  ispaf;
	}
	/**
	* 公积金贷款标志
	*@param  ispaf
	*/
	public void setIspaf(String ispaf ){
		this.ispaf = ispaf;
	}

	/**
	* 是否下岗人员标志
	*@return
	*/
	public String getLay_off_flag(){
		return  lay_off_flag;
	}
	/**
	* 是否下岗人员标志
	*@param  lay_off_flag
	*/
	public void setLay_off_flag(String lay_off_flag ){
		this.lay_off_flag = lay_off_flag;
	}

	/**
	* 授信额度使用标志
	*@return
	*/
	public String getLimit_ind(){
		return  limit_ind;
	}
	/**
	* 授信额度使用标志
	*@param  limit_ind
	*/
	public void setLimit_ind(String limit_ind ){
		this.limit_ind = limit_ind;
	}

	/**
	* 授信协议编号
	*@return
	*/
	public String getLmt_cont_no(){
		return  lmt_cont_no;
	}
	/**
	* 授信协议编号
	*@param  lmt_cont_no
	*/
	public void setLmt_cont_no(String lmt_cont_no ){
		this.lmt_cont_no = lmt_cont_no;
	}

	/**
	* 贷款分类
	*@return
	*/
	public String getLn_type(){
		return  ln_type;
	}
	/**
	* 贷款分类
	*@param  ln_type
	*/
	public void setLn_type(String ln_type ){
		this.ln_type = ln_type;
	}

	/**
	* 借据金额
	*@return
	*/
	public BigDecimal getLoan_amount(){
		return  loan_amount;
	}
	/**
	* 借据金额
	*@param  loan_amount
	*/
	public void setLoan_amount(BigDecimal loan_amount ){
		this.loan_amount = loan_amount;
	}

	/**
	* 余额
	*@return
	*/
	public BigDecimal getLoan_balance(){
		return  loan_balance;
	}
	/**
	* 余额
	*@param  loan_balance
	*/
	public void setLoan_balance(BigDecimal loan_balance ){
		this.loan_balance = loan_balance;
	}

	/**
	* 使用农户贷款证标志
	*@return
	*/
	public String getLoan_card_ind(){
		return  loan_card_ind;
	}
	/**
	* 使用农户贷款证标志
	*@param  loan_card_ind
	*/
	public void setLoan_card_ind(String loan_card_ind ){
		this.loan_card_ind = loan_card_ind;
	}

	/**
	* 四级分类
	*@return
	*/
	public String getLoan_cla4(){
		return  loan_cla4;
	}
	/**
	* 四级分类
	*@param  loan_cla4
	*/
	public void setLoan_cla4(String loan_cla4 ){
		this.loan_cla4 = loan_cla4;
	}

	/**
	* 贷款减值
	*@return
	*/
	public BigDecimal getLoan_devalue(){
		return  loan_devalue;
	}
	/**
	* 贷款减值
	*@param  loan_devalue
	*/
	public void setLoan_devalue(BigDecimal loan_devalue ){
		this.loan_devalue = loan_devalue;
	}

	/**
	* 行业投向4层
	*@return
	*/
	public String getLoan_direction(){
		return  loan_direction;
	}
	/**
	* 行业投向4层
	*@param  loan_direction
	*/
	public void setLoan_direction(String loan_direction ){
		this.loan_direction = loan_direction;
	}

	/**
	* 到期日
	*@return
	*/
	public String getLoan_end_date(){
		return  loan_end_date;
	}
	/**
	* 到期日
	*@param  loan_end_date
	*/
	public void setLoan_end_date(String loan_end_date ){
		this.loan_end_date = loan_end_date;
	}

	/**
	* 贷款类型
	*@return
	*/
	public String getLoan_form(){
		return  loan_form;
	}
	/**
	* 贷款类型
	*@param  loan_form
	*/
	public void setLoan_form(String loan_form ){
		this.loan_form = loan_form;
	}

	/**
	* 贷款性质
	*@return
	*/
	public String getLoan_nature(){
		return  loan_nature;
	}
	/**
	* 贷款性质
	*@param  loan_nature
	*/
	public void setLoan_nature(String loan_nature ){
		this.loan_nature = loan_nature;
	}

	/**
	* 借款日
	*@return
	*/
	public String getLoan_start_date(){
		return  loan_start_date;
	}
	/**
	* 借款日
	*@param  loan_start_date
	*/
	public void setLoan_start_date(String loan_start_date ){
		this.loan_start_date = loan_start_date;
	}

	/**
	* 贷款期限
	*@return
	*/
	public String getLoan_term(){
		return  loan_term;
	}
	/**
	* 贷款期限
	*@param  loan_term
	*/
	public void setLoan_term(String loan_term ){
		this.loan_term = loan_term;
	}

	/**
	* 林权贷款标志
	*@return
	*/
	public String getLq_type(){
		return  lq_type;
	}
	/**
	* 林权贷款标志
	*@param  lq_type
	*/
	public void setLq_type(String lq_type ){
		this.lq_type = lq_type;
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
	* 投向背景主体标识
	*@return
	*/
	public String getMain_flag(){
		return  main_flag;
	}
	/**
	* 投向背景主体标识
	*@param  main_flag
	*/
	public void setMain_flag(String main_flag ){
		this.main_flag = main_flag;
	}

	/**
	* 主产品号
	*@return
	*/
	public String getMain_prod_cd(){
		return  main_prod_cd;
	}
	/**
	* 主产品号
	*@param  main_prod_cd
	*/
	public void setMain_prod_cd(String main_prod_cd ){
		this.main_prod_cd = main_prod_cd;
	}

	/**
	* 特色产品编码
	*@return
	*/
	public String getMain_pro_type(){
		return  main_pro_type;
	}
	/**
	* 特色产品编码
	*@param  main_pro_type
	*/
	public void setMain_pro_type(String main_pro_type ){
		this.main_pro_type = main_pro_type;
	}

	/**
	* 本年累计收本
	*@return
	*/
	public BigDecimal getNor_rec_accu(){
		return  nor_rec_accu;
	}
	/**
	* 本年累计收本
	*@param  nor_rec_accu
	*/
	public void setNor_rec_accu(BigDecimal nor_rec_accu ){
		this.nor_rec_accu = nor_rec_accu;
	}

	/**
	* 原到期日
	*@return
	*/
	public String getOrig_expi_date(){
		return  orig_expi_date;
	}
	/**
	* 原到期日
	*@param  orig_expi_date
	*/
	public void setOrig_expi_date(String orig_expi_date ){
		this.orig_expi_date = orig_expi_date;
	}

	/**
	* 集团客户证件号码
	*@return
	*/
	public String getParent_org_code(){
		return  parent_org_code;
	}
	/**
	* 集团客户证件号码
	*@param  parent_org_code
	*/
	public void setParent_org_code(String parent_org_code ){
		this.parent_org_code = parent_org_code;
	}

	/**
	* 受托支付方式
	*@return
	*/
	public String getPay_way(){
		return  pay_way;
	}
	/**
	* 受托支付方式
	*@param  pay_way
	*/
	public void setPay_way(String pay_way ){
		this.pay_way = pay_way;
	}

	/**
	* 产品类别
	*@return
	*/
	public String getPrd_type(){
		return  prd_type;
	}
	/**
	* 产品类别
	*@param  prd_type
	*/
	public void setPrd_type(String prd_type ){
		this.prd_type = prd_type;
	}

	/**
	* 个人证件号码
	*@return
	*/
	public String getPsn_cert_code(){
		return  psn_cert_code;
	}
	/**
	* 个人证件号码
	*@param  psn_cert_code
	*/
	public void setPsn_cert_code(String psn_cert_code ){
		this.psn_cert_code = psn_cert_code;
	}

	/**
	* 年利率
	*@return
	*/
	public BigDecimal getReality_ir_y(){
		return  reality_ir_y;
	}
	/**
	* 年利率
	*@param  reality_ir_y
	*/
	public void setReality_ir_y(BigDecimal reality_ir_y ){
		this.reality_ir_y = reality_ir_y;
	}

	/**
	* 工商户名称/企业名称
	*@return
	*/
	public String getRegister_name(){
		return  register_name;
	}
	/**
	* 工商户名称/企业名称
	*@param  register_name
	*/
	public void setRegister_name(String register_name ){
		this.register_name = register_name;
	}

	/**
	* 注册号/社会代码
	*@return
	*/
	public String getRegister_no(){
		return  register_no;
	}
	/**
	* 注册号/社会代码
	*@param  register_no
	*/
	public void setRegister_no(String register_no ){
		this.register_no = register_no;
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
	* 行政区域号
	*@return
	*/
	public String getReg_state_code(){
		return  reg_state_code;
	}
	/**
	* 行政区域号
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
	* 还款方式
	*@return
	*/
	public String getRepayment_mode(){
		return  repayment_mode;
	}
	/**
	* 还款方式
	*@param  repayment_mode
	*/
	public void setRepayment_mode(String repayment_mode ){
		this.repayment_mode = repayment_mode;
	}

	/**
	* 置换类型
	*@return
	*/
	public String getRepla_type(){
		return  repla_type;
	}
	/**
	* 置换类型
	*@param  repla_type
	*/
	public void setRepla_type(String repla_type ){
		this.repla_type = repla_type;
	}

	/**
	* 贷款基准利率
	*@return
	*/
	public BigDecimal getRuling_ir(){
		return  ruling_ir;
	}
	/**
	* 贷款基准利率
	*@param  ruling_ir
	*/
	public void setRuling_ir(BigDecimal ruling_ir ){
		this.ruling_ir = ruling_ir;
	}

	/**
	* 融资担保贷款标志
	*@return
	*/
	public String getRzdb_type(){
		return  rzdb_type;
	}
	/**
	* 融资担保贷款标志
	*@param  rzdb_type
	*/
	public void setRzdb_type(String rzdb_type ){
		this.rzdb_type = rzdb_type;
	}

	/**
	* 结清日期
	*@return
	*/
	public String getSettl_date(){
		return  settl_date;
	}
	/**
	* 结清日期
	*@param  settl_date
	*/
	public void setSettl_date(String settl_date ){
		this.settl_date = settl_date;
	}

	/**
	* 七级分类
	*@return
	*/
	public String getSeven_result(){
		return  seven_result;
	}
	/**
	* 七级分类
	*@param  seven_result
	*/
	public void setSeven_result(String seven_result ){
		this.seven_result = seven_result;
	}

	/**
	* 三农专营
	*@return
	*/
	public String getSn_type(){
		return  sn_type;
	}
	/**
	* 三农专营
	*@param  sn_type
	*/
	public void setSn_type(String sn_type ){
		this.sn_type = sn_type;
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
	* 首套房标志
	*@return
	*/
	public String getStf_type(){
		return  stf_type;
	}
	/**
	* 首套房标志
	*@param  stf_type
	*/
	public void setStf_type(String stf_type ){
		this.stf_type = stf_type;
	}

	/**
	* 子产品号
	*@return
	*/
	public String getSub_prod_cd(){
		return  sub_prod_cd;
	}
	/**
	* 子产品号
	*@param  sub_prod_cd
	*/
	public void setSub_prod_cd(String sub_prod_cd ){
		this.sub_prod_cd = sub_prod_cd;
	}

	/**
	* 账户累计收本
	*@return
	*/
	public BigDecimal getSum_repay_amt(){
		return  sum_repay_amt;
	}
	/**
	* 账户累计收本
	*@param  sum_repay_amt
	*/
	public void setSum_repay_amt(BigDecimal sum_repay_amt ){
		this.sum_repay_amt = sum_repay_amt;
	}

	/**
	* 自营贷款标志
	*@return
	*/
	public String getSyndicated_ind(){
		return  syndicated_ind;
	}
	/**
	* 自营贷款标志
	*@param  syndicated_ind
	*/
	public void setSyndicated_ind(String syndicated_ind ){
		this.syndicated_ind = syndicated_ind;
	}

	/**
	* 银团类型
	*@return
	*/
	public String getSyndicated_type(){
		return  syndicated_type;
	}
	/**
	* 银团类型
	*@param  syndicated_type
	*/
	public void setSyndicated_type(String syndicated_type ){
		this.syndicated_type = syndicated_type;
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
	* 期限类型
	*@return
	*/
	public String getTerm_type(){
		return  term_type;
	}
	/**
	* 期限类型
	*@param  term_type
	*/
	public void setTerm_type(String term_type ){
		this.term_type = term_type;
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
	* 拖欠本金
	*@return
	*/
	public BigDecimal getUnpd_prin_bal(){
		return  unpd_prin_bal;
	}
	/**
	* 拖欠本金
	*@param  unpd_prin_bal
	*/
	public void setUnpd_prin_bal(BigDecimal unpd_prin_bal ){
		this.unpd_prin_bal = unpd_prin_bal;
	}

	/**
	* 上年末五级分类状态
	*@return
	*/
	public String getUp_cla(){
		return  up_cla;
	}
	/**
	* 上年末五级分类状态
	*@param  up_cla
	*/
	public void setUp_cla(String up_cla ){
		this.up_cla = up_cla;
	}

	/**
	* 用途
	*@return
	*/
	public String getUse_dec(){
		return  use_dec;
	}
	/**
	* 用途
	*@param  use_dec
	*/
	public void setUse_dec(String use_dec ){
		this.use_dec = use_dec;
	}

	/**
	* 小企业专营
	*@return
	*/
	public String getXqy_type(){
		return  xqy_type;
	}
	/**
	* 小企业专营
	*@param  xqy_type
	*/
	public void setXqy_type(String xqy_type ){
		this.xqy_type = xqy_type;
	}

	/**
	* 应收账款质押贷款标志
	*@return
	*/
	public String getYszy_type(){
		return  yszy_type;
	}
	/**
	* 应收账款质押贷款标志
	*@param  yszy_type
	*/
	public void setYszy_type(String yszy_type ){
		this.yszy_type = yszy_type;
	}

	/**
	* 银社团参与行标志
	*@return
	*/
	public String getYtcy_type(){
		return  ytcy_type;
	}
	/**
	* 银社团参与行标志
	*@param  ytcy_type
	*/
	public void setYtcy_type(String ytcy_type ){
		this.ytcy_type = ytcy_type;
	}


}
