package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_custom__goods")
public class RaCustomGoods   {
	
	// alias
	public static final String ALIAS_goods_commonid = "goods_commonid";
	
	private Integer goods_commonid ;
	
	public RaCustomGoods() {
	}
	
	public Integer getGoods_commonid(){
		return  goods_commonid;
	}
	public void setGoods_commonid(Integer goods_commonid ){
		this.goods_commonid = goods_commonid;
	}
	

}
