package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_weproxy_order_goods_margin")
public class RaWeproxyOrderGoodsMargin   {
	
	// alias
	public static final String ALIAS_id = "id";
	public static final String ALIAS_goods_id = "goods_id";
	public static final String ALIAS_level = "level";
	public static final String ALIAS_member_id = "member_id";
	public static final String ALIAS_order_id = "order_id";
	public static final String ALIAS_rec_id = "rec_id";
	public static final String ALIAS_goods_price = "goods_price";
	public static final String ALIAS_margin = "margin";
	
	private Integer id ;
	private Integer goods_id ;
	private Integer level ;
	private Integer member_id ;
	private Integer order_id ;
	private Integer rec_id ;
	private BigDecimal goods_price ;
	private BigDecimal margin ;
	
	public RaWeproxyOrderGoodsMargin() {
	}
	
	public Integer getId(){
		return  id;
	}
	public void setId(Integer id ){
		this.id = id;
	}
	
	public Integer getGoods_id(){
		return  goods_id;
	}
	public void setGoods_id(Integer goods_id ){
		this.goods_id = goods_id;
	}
	
	public Integer getLevel(){
		return  level;
	}
	public void setLevel(Integer level ){
		this.level = level;
	}
	
	public Integer getMember_id(){
		return  member_id;
	}
	public void setMember_id(Integer member_id ){
		this.member_id = member_id;
	}
	
	public Integer getOrder_id(){
		return  order_id;
	}
	public void setOrder_id(Integer order_id ){
		this.order_id = order_id;
	}
	
	public Integer getRec_id(){
		return  rec_id;
	}
	public void setRec_id(Integer rec_id ){
		this.rec_id = rec_id;
	}
	
	public BigDecimal getGoods_price(){
		return  goods_price;
	}
	public void setGoods_price(BigDecimal goods_price ){
		this.goods_price = goods_price;
	}
	
	public BigDecimal getMargin(){
		return  margin;
	}
	public void setMargin(BigDecimal margin ){
		this.margin = margin;
	}
	

}
