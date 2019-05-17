package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_hangzhou_goods")
public class RaHangzhouGoods   {
	
	private Integer id ;
	private Integer goodsCommonid ;
	private String commoditycode ;
	private String status ;
	
	public RaHangzhouGoods() {
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
	
	public String getCommoditycode(){
		return  commoditycode;
	}
	public void setCommoditycode(String commoditycode ){
		this.commoditycode = commoditycode;
	}
	
	public String getStatus(){
		return  status;
	}
	public void setStatus(String status ){
		this.status = status;
	}
	

}
