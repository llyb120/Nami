package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_custom_shenzhen_goods")
public class RaCustomShenzhenGoods   {
	
	// alias
	public static final String ALIAS_goods_commonid = "goods_commonid";
	public static final String ALIAS_AttachmentList = "AttachmentList";
	public static final String ALIAS_ImageList = "ImageList";
	public static final String ALIAS_beianhao = "beianhao";
	public static final String ALIAS_brand = "brand";
	public static final String ALIAS_certification = "certification";
	public static final String ALIAS_ciqGmodel = "ciqGmodel";
	public static final String ALIAS_ciqGno = "ciqGno";
	public static final String ALIAS_codeTs = "codeTs";
	public static final String ALIAS_currency = "currency";
	public static final String ALIAS_element = "element";
	public static final String ALIAS_enterprisesCountry = "enterprisesCountry";
	public static final String ALIAS_enterprisesName = "enterprisesName";
	public static final String ALIAS_flight_number = "flight_number";
	public static final String ALIAS_foodEnterpriseNumber = "foodEnterpriseNumber";
	public static final String ALIAS_gcode = "gcode";
	public static final String ALIAS_giftFlag = "giftFlag";
	public static final String ALIAS_gmodel = "gmodel";
	public static final String ALIAS_gno = "gno";
	public static final String ALIAS_hCount = "hCount";
	public static final String ALIAS_hCount2 = "hCount2";
	public static final String ALIAS_hUnit = "hUnit";
	public static final String ALIAS_hUnit2 = "hUnit2";
	public static final String ALIAS_inspectionFlag = "inspectionFlag";
	public static final String ALIAS_originCountry = "originCountry";
	public static final String ALIAS_pick_number = "pick_number";
	public static final String ALIAS_postTaxCode = "postTaxCode";
	public static final String ALIAS_shipName = "shipName";
	public static final String ALIAS_standards = "standards";
	public static final String ALIAS_supervisionFlag = "supervisionFlag";
	public static final String ALIAS_supplierCountry = "supplierCountry";
	public static final String ALIAS_supplierName = "supplierName";
	public static final String ALIAS_tax_rate = "tax_rate";
	public static final String ALIAS_trafMode = "trafMode";
	public static final String ALIAS_tran_type_code = "tran_type_code";
	public static final String ALIAS_unit = "unit";
	public static final String ALIAS_warningFlag = "warningFlag";
	
	private Integer goods_commonid ;
	private String attachmentlist ;
	private String imagelist ;
	/*
	保税商品备案名称
	*/
	private String beianhao ;
	private String brand ;
	private String certification ;
	private String ciqgmodel ;
	private String ciqgno ;
	private String codets ;
	private String currency ;
	private String element ;
	private String enterprisescountry ;
	private String enterprisesname ;
	private String flight_number ;
	private String foodenterprisenumber ;
	private String gcode ;
	private String giftflag ;
	private String gmodel ;
	private String gno ;
	private BigDecimal hcount ;
	private BigDecimal hcount2 ;
	private String hunit ;
	private String hunit2 ;
	private String inspectionflag ;
	private String origincountry ;
	private String pick_number ;
	private String posttaxcode ;
	private String shipname ;
	private String standards ;
	private String supervisionflag ;
	private String suppliercountry ;
	private String suppliername ;
	private String tax_rate ;
	private String trafmode ;
	private String tran_type_code ;
	private String unit ;
	private String warningflag ;
	
	public RaCustomShenzhenGoods() {
	}
	
	public Integer getGoods_commonid(){
		return  goods_commonid;
	}
	public void setGoods_commonid(Integer goods_commonid ){
		this.goods_commonid = goods_commonid;
	}
	
	public String getAttachmentlist(){
		return  attachmentlist;
	}
	public void setAttachmentlist(String attachmentlist ){
		this.attachmentlist = attachmentlist;
	}
	
	public String getImagelist(){
		return  imagelist;
	}
	public void setImagelist(String imagelist ){
		this.imagelist = imagelist;
	}
	
	/**
	* 保税商品备案名称
	*@return 
	*/
	public String getBeianhao(){
		return  beianhao;
	}
	/**
	* 保税商品备案名称
	*@param  beianhao
	*/
	public void setBeianhao(String beianhao ){
		this.beianhao = beianhao;
	}
	
	public String getBrand(){
		return  brand;
	}
	public void setBrand(String brand ){
		this.brand = brand;
	}
	
	public String getCertification(){
		return  certification;
	}
	public void setCertification(String certification ){
		this.certification = certification;
	}
	
	public String getCiqgmodel(){
		return  ciqgmodel;
	}
	public void setCiqgmodel(String ciqgmodel ){
		this.ciqgmodel = ciqgmodel;
	}
	
	public String getCiqgno(){
		return  ciqgno;
	}
	public void setCiqgno(String ciqgno ){
		this.ciqgno = ciqgno;
	}
	
	public String getCodets(){
		return  codets;
	}
	public void setCodets(String codets ){
		this.codets = codets;
	}
	
	public String getCurrency(){
		return  currency;
	}
	public void setCurrency(String currency ){
		this.currency = currency;
	}
	
	public String getElement(){
		return  element;
	}
	public void setElement(String element ){
		this.element = element;
	}
	
	public String getEnterprisescountry(){
		return  enterprisescountry;
	}
	public void setEnterprisescountry(String enterprisescountry ){
		this.enterprisescountry = enterprisescountry;
	}
	
	public String getEnterprisesname(){
		return  enterprisesname;
	}
	public void setEnterprisesname(String enterprisesname ){
		this.enterprisesname = enterprisesname;
	}
	
	public String getFlight_number(){
		return  flight_number;
	}
	public void setFlight_number(String flight_number ){
		this.flight_number = flight_number;
	}
	
	public String getFoodenterprisenumber(){
		return  foodenterprisenumber;
	}
	public void setFoodenterprisenumber(String foodenterprisenumber ){
		this.foodenterprisenumber = foodenterprisenumber;
	}
	
	public String getGcode(){
		return  gcode;
	}
	public void setGcode(String gcode ){
		this.gcode = gcode;
	}
	
	public String getGiftflag(){
		return  giftflag;
	}
	public void setGiftflag(String giftflag ){
		this.giftflag = giftflag;
	}
	
	public String getGmodel(){
		return  gmodel;
	}
	public void setGmodel(String gmodel ){
		this.gmodel = gmodel;
	}
	
	public String getGno(){
		return  gno;
	}
	public void setGno(String gno ){
		this.gno = gno;
	}
	
	public BigDecimal getHcount(){
		return  hcount;
	}
	public void setHcount(BigDecimal hcount ){
		this.hcount = hcount;
	}
	
	public BigDecimal getHcount2(){
		return  hcount2;
	}
	public void setHcount2(BigDecimal hcount2 ){
		this.hcount2 = hcount2;
	}
	
	public String getHunit(){
		return  hunit;
	}
	public void setHunit(String hunit ){
		this.hunit = hunit;
	}
	
	public String getHunit2(){
		return  hunit2;
	}
	public void setHunit2(String hunit2 ){
		this.hunit2 = hunit2;
	}
	
	public String getInspectionflag(){
		return  inspectionflag;
	}
	public void setInspectionflag(String inspectionflag ){
		this.inspectionflag = inspectionflag;
	}
	
	public String getOrigincountry(){
		return  origincountry;
	}
	public void setOrigincountry(String origincountry ){
		this.origincountry = origincountry;
	}
	
	public String getPick_number(){
		return  pick_number;
	}
	public void setPick_number(String pick_number ){
		this.pick_number = pick_number;
	}
	
	public String getPosttaxcode(){
		return  posttaxcode;
	}
	public void setPosttaxcode(String posttaxcode ){
		this.posttaxcode = posttaxcode;
	}
	
	public String getShipname(){
		return  shipname;
	}
	public void setShipname(String shipname ){
		this.shipname = shipname;
	}
	
	public String getStandards(){
		return  standards;
	}
	public void setStandards(String standards ){
		this.standards = standards;
	}
	
	public String getSupervisionflag(){
		return  supervisionflag;
	}
	public void setSupervisionflag(String supervisionflag ){
		this.supervisionflag = supervisionflag;
	}
	
	public String getSuppliercountry(){
		return  suppliercountry;
	}
	public void setSuppliercountry(String suppliercountry ){
		this.suppliercountry = suppliercountry;
	}
	
	public String getSuppliername(){
		return  suppliername;
	}
	public void setSuppliername(String suppliername ){
		this.suppliername = suppliername;
	}
	
	public String getTax_rate(){
		return  tax_rate;
	}
	public void setTax_rate(String tax_rate ){
		this.tax_rate = tax_rate;
	}
	
	public String getTrafmode(){
		return  trafmode;
	}
	public void setTrafmode(String trafmode ){
		this.trafmode = trafmode;
	}
	
	public String getTran_type_code(){
		return  tran_type_code;
	}
	public void setTran_type_code(String tran_type_code ){
		this.tran_type_code = tran_type_code;
	}
	
	public String getUnit(){
		return  unit;
	}
	public void setUnit(String unit ){
		this.unit = unit;
	}
	
	public String getWarningflag(){
		return  warningflag;
	}
	public void setWarningflag(String warningflag ){
		this.warningflag = warningflag;
	}
	

}
