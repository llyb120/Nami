package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_hangzhou_order_goods")
public class RaHangzhouOrderGoods   {
	
	// alias
	public static final String ALIAS_id = "id";
	public static final String ALIAS_goods_commonid = "goods_commonid";
	public static final String ALIAS_order_id = "order_id";
	public static final String ALIAS_RealInQty = "RealInQty";
	public static final String ALIAS_commodityBarcode = "commodityBarcode";
	public static final String ALIAS_commodityName = "commodityName";
	public static final String ALIAS_commodityPrice = "commodityPrice";
	public static final String ALIAS_damageNum = "damageNum";
	public static final String ALIAS_shouldInQty = "shouldInQty";
	
	private Integer id ;
	private Integer goods_commonid ;
	private Integer order_id ;
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
	
	public Integer getGoods_commonid(){
		return  goods_commonid;
	}
	public void setGoods_commonid(Integer goods_commonid ){
		this.goods_commonid = goods_commonid;
	}
	
	public Integer getOrder_id(){
		return  order_id;
	}
	public void setOrder_id(Integer order_id ){
		this.order_id = order_id;
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
