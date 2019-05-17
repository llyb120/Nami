package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_hangzhou_order_goods")
public class RaHangzhouOrderGoods   {
	
	private Integer id ;
	private Integer goodsCommonid ;
	private Integer orderId ;
	private String realinqty ;
	private String commoditybarcode ;
	private String commodityname ;
	private String commodityprice ;
	private String damagenum ;
	private String shouldinqty ;
	
	public RaHangzhouOrderGoods() {
	}
	
	public Integer getId(){
		return  id;
	}
	public void setId(Integer id ){
		this.id = id;
	}
	
	public Integer getGoodsCommonid(){
		return  goodsCommonid;
	}
	public void setGoodsCommonid(Integer goodsCommonid ){
		this.goodsCommonid = goodsCommonid;
	}
	
	public Integer getOrderId(){
		return  orderId;
	}
	public void setOrderId(Integer orderId ){
		this.orderId = orderId;
	}
	
	public String getRealinqty(){
		return  realinqty;
	}
	public void setRealinqty(String realinqty ){
		this.realinqty = realinqty;
	}
	
	public String getCommoditybarcode(){
		return  commoditybarcode;
	}
	public void setCommoditybarcode(String commoditybarcode ){
		this.commoditybarcode = commoditybarcode;
	}
	
	public String getCommodityname(){
		return  commodityname;
	}
	public void setCommodityname(String commodityname ){
		this.commodityname = commodityname;
	}
	
	public String getCommodityprice(){
		return  commodityprice;
	}
	public void setCommodityprice(String commodityprice ){
		this.commodityprice = commodityprice;
	}
	
	public String getDamagenum(){
		return  damagenum;
	}
	public void setDamagenum(String damagenum ){
		this.damagenum = damagenum;
	}
	
	public String getShouldinqty(){
		return  shouldinqty;
	}
	public void setShouldinqty(String shouldinqty ){
		this.shouldinqty = shouldinqty;
	}
	

}
