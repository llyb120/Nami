package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_proxy_store_goods")
public class RaProxyStoreGoods   {
	
	// alias
	public static final String ALIAS_id = "id";
	public static final String ALIAS_goods_commonid = "goods_commonid";
	public static final String ALIAS_member_id = "member_id";
	
	private Integer id ;
	private Integer goods_commonid ;
	private Integer member_id ;
	
	public RaProxyStoreGoods() {
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
	
	public Integer getMember_id(){
		return  member_id;
	}
	public void setMember_id(Integer member_id ){
		this.member_id = member_id;
	}
	

}
