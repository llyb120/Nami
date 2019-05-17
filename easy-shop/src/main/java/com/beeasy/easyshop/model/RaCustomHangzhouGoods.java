package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_custom_hangzhou_goods")
public class RaCustomHangzhouGoods   {
	
	private Integer goodsCommonid ;
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
	
	public Integer getGoodsCommonid(){
		return  goodsCommonid;
	}
	public void setGoodsCommonid(Integer goodsCommonid ){
		this.goodsCommonid = goodsCommonid;
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
