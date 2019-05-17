package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_hangzhou_goods")
public class RaHangzhouGoods   {
	
	// alias
	public static final String ALIAS_id = "id";
	public static final String ALIAS_goods_commonid = "goods_commonid";
	public static final String ALIAS_commodityCode = "commodityCode";
	public static final String ALIAS_status = "status";
	
	private Integer id ;
	private Integer goods_commonid ;
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
	
	public Integer getGoods_commonid(){
		return  goods_commonid;
	}
	public void setGoods_commonid(Integer goods_commonid ){
		this.goods_commonid = goods_commonid;
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
