package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_custom_hangzhou_goods")
public class RaCustomHangzhouGoods   {
	
	// alias
	public static final String ALIAS_goods_commonid = "goods_commonid";
	public static final String ALIAS_HScode = "HScode";
	public static final String ALIAS_brandId = "brandId";
	public static final String ALIAS_brandName = "brandName";
	public static final String ALIAS_codeTs = "codeTs";
	public static final String ALIAS_commodityArtNo = "commodityArtNo";
	public static final String ALIAS_commodityBarcode = "commodityBarcode";
	public static final String ALIAS_commodityMadeTime = "commodityMadeTime";
	public static final String ALIAS_commoditySpec = "commoditySpec";
	public static final String ALIAS_remark = "remark";
	public static final String ALIAS_tradeCountryCode = "tradeCountryCode";
	public static final String ALIAS_tradeCountryName = "tradeCountryName";
	public static final String ALIAS_unit = "unit";
	public static final String ALIAS_weight = "weight";
	
	private Integer goods_commonid ;
	private String hscode ;
	private String brandid ;
	private String brandname ;
	private String codets ;
	private String commodityartno ;
	private String commoditybarcode ;
	private String commoditymadetime ;
	private String commodityspec ;
	private String remark ;
	private String tradecountrycode ;
	private String tradecountryname ;
	private String unit ;
	private String weight ;
	
	public RaCustomHangzhouGoods() {
	}
	
	public Integer getGoods_commonid(){
		return  goods_commonid;
	}
	public void setGoods_commonid(Integer goods_commonid ){
		this.goods_commonid = goods_commonid;
	}
	
	public String getHscode(){
		return  hscode;
	}
	public void setHscode(String hscode ){
		this.hscode = hscode;
	}
	
	public String getBrandid(){
		return  brandid;
	}
	public void setBrandid(String brandid ){
		this.brandid = brandid;
	}
	
	public String getBrandname(){
		return  brandname;
	}
	public void setBrandname(String brandname ){
		this.brandname = brandname;
	}
	
	public String getCodets(){
		return  codets;
	}
	public void setCodets(String codets ){
		this.codets = codets;
	}
	
	public String getCommodityartno(){
		return  commodityartno;
	}
	public void setCommodityartno(String commodityartno ){
		this.commodityartno = commodityartno;
	}
	
	public String getCommoditybarcode(){
		return  commoditybarcode;
	}
	public void setCommoditybarcode(String commoditybarcode ){
		this.commoditybarcode = commoditybarcode;
	}
	
	public String getCommoditymadetime(){
		return  commoditymadetime;
	}
	public void setCommoditymadetime(String commoditymadetime ){
		this.commoditymadetime = commoditymadetime;
	}
	
	public String getCommodityspec(){
		return  commodityspec;
	}
	public void setCommodityspec(String commodityspec ){
		this.commodityspec = commodityspec;
	}
	
	public String getRemark(){
		return  remark;
	}
	public void setRemark(String remark ){
		this.remark = remark;
	}
	
	public String getTradecountrycode(){
		return  tradecountrycode;
	}
	public void setTradecountrycode(String tradecountrycode ){
		this.tradecountrycode = tradecountrycode;
	}
	
	public String getTradecountryname(){
		return  tradecountryname;
	}
	public void setTradecountryname(String tradecountryname ){
		this.tradecountryname = tradecountryname;
	}
	
	public String getUnit(){
		return  unit;
	}
	public void setUnit(String unit ){
		this.unit = unit;
	}
	
	public String getWeight(){
		return  weight;
	}
	public void setWeight(String weight ){
		this.weight = weight;
	}
	

}
