package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_weproxy_order_goods_margin")
public class RaWeproxyOrderGoodsMargin   {
	
	private Integer id ;
	private Integer goodsId ;
	private Integer level ;
	private Integer memberId ;
	private Integer orderId ;
	private Integer recId ;
	private BigDecimal goodsPrice ;
	private BigDecimal margin ;
	
	public RaWeproxyOrderGoodsMargin() {
	}
	
	public Integer getId(){
		return  id;
	}
	public void setId(Integer id ){
		this.id = id;
	}
	
	public Integer getGoodsId(){
		return  goodsId;
	}
	public void setGoodsId(Integer goodsId ){
		this.goodsId = goodsId;
	}
	
	public Integer getLevel(){
		return  level;
	}
	public void setLevel(Integer level ){
		this.level = level;
	}
	
	public Integer getMemberId(){
		return  memberId;
	}
	public void setMemberId(Integer memberId ){
		this.memberId = memberId;
	}
	
	public Integer getOrderId(){
		return  orderId;
	}
	public void setOrderId(Integer orderId ){
		this.orderId = orderId;
	}
	
	public Integer getRecId(){
		return  recId;
	}
	public void setRecId(Integer recId ){
		this.recId = recId;
	}
	
	public BigDecimal getGoodsPrice(){
		return  goodsPrice;
	}
	public void setGoodsPrice(BigDecimal goodsPrice ){
		this.goodsPrice = goodsPrice;
	}
	
	public BigDecimal getMargin(){
		return  margin;
	}
	public void setMargin(BigDecimal margin ){
		this.margin = margin;
	}
	

}
