package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_evaluate_goods")
public class RaEvaluateGoods   {
	
	// alias
	public static final String ALIAS_geval_id = "geval_id";
	public static final String ALIAS_geval_addtime = "geval_addtime";
	public static final String ALIAS_geval_frommemberid = "geval_frommemberid";
	public static final String ALIAS_geval_goodsid = "geval_goodsid";
	public static final String ALIAS_geval_isanonymous = "geval_isanonymous";
	public static final String ALIAS_geval_ordergoodsid = "geval_ordergoodsid";
	public static final String ALIAS_geval_orderid = "geval_orderid";
	public static final String ALIAS_geval_scores = "geval_scores";
	public static final String ALIAS_geval_state = "geval_state";
	public static final String ALIAS_geval_storeid = "geval_storeid";
	public static final String ALIAS_geval_content = "geval_content";
	public static final String ALIAS_geval_explain = "geval_explain";
	public static final String ALIAS_geval_frommembername = "geval_frommembername";
	public static final String ALIAS_geval_goodsimage = "geval_goodsimage";
	public static final String ALIAS_geval_goodsname = "geval_goodsname";
	public static final String ALIAS_geval_goodsprice = "geval_goodsprice";
	public static final String ALIAS_geval_image = "geval_image";
	public static final String ALIAS_geval_orderno = "geval_orderno";
	public static final String ALIAS_geval_remark = "geval_remark";
	public static final String ALIAS_geval_storename = "geval_storename";
	
	/*
	评价ID
	*/
	private Integer geval_id ;
	/*
	评价时间
	*/
	private Integer geval_addtime ;
	/*
	评价人编号
	*/
	private Integer geval_frommemberid ;
	/*
	商品表编号
	*/
	private Integer geval_goodsid ;
	/*
	0表示不是 1表示是匿名评价
	*/
	private Integer geval_isanonymous ;
	/*
	订单商品表编号
	*/
	private Integer geval_ordergoodsid ;
	/*
	订单表自增ID
	*/
	private Integer geval_orderid ;
	/*
	1-5分
	*/
	private Integer geval_scores ;
	/*
	评价信息的状态 0为正常 1为禁止显示
	*/
	private Integer geval_state ;
	/*
	店铺编号
	*/
	private Integer geval_storeid ;
	/*
	信誉评价内容
	*/
	private String geval_content ;
	/*
	解释内容
	*/
	private String geval_explain ;
	/*
	评价人名称
	*/
	private String geval_frommembername ;
	/*
	商品图片
	*/
	private String geval_goodsimage ;
	/*
	商品名称
	*/
	private String geval_goodsname ;
	/*
	商品价格
	*/
	private BigDecimal geval_goodsprice ;
	/*
	晒单图片
	*/
	private String geval_image ;
	/*
	订单编号
	*/
	private Long geval_orderno ;
	/*
	管理员对评价的处理备注
	*/
	private String geval_remark ;
	/*
	店铺名称
	*/
	private String geval_storename ;
	
	public RaEvaluateGoods() {
	}
	
	/**
	* 评价ID
	*@return 
	*/
	public Integer getGeval_id(){
		return  geval_id;
	}
	/**
	* 评价ID
	*@param  geval_id
	*/
	public void setGeval_id(Integer geval_id ){
		this.geval_id = geval_id;
	}
	
	/**
	* 评价时间
	*@return 
	*/
	public Integer getGeval_addtime(){
		return  geval_addtime;
	}
	/**
	* 评价时间
	*@param  geval_addtime
	*/
	public void setGeval_addtime(Integer geval_addtime ){
		this.geval_addtime = geval_addtime;
	}
	
	/**
	* 评价人编号
	*@return 
	*/
	public Integer getGeval_frommemberid(){
		return  geval_frommemberid;
	}
	/**
	* 评价人编号
	*@param  geval_frommemberid
	*/
	public void setGeval_frommemberid(Integer geval_frommemberid ){
		this.geval_frommemberid = geval_frommemberid;
	}
	
	/**
	* 商品表编号
	*@return 
	*/
	public Integer getGeval_goodsid(){
		return  geval_goodsid;
	}
	/**
	* 商品表编号
	*@param  geval_goodsid
	*/
	public void setGeval_goodsid(Integer geval_goodsid ){
		this.geval_goodsid = geval_goodsid;
	}
	
	/**
	* 0表示不是 1表示是匿名评价
	*@return 
	*/
	public Integer getGeval_isanonymous(){
		return  geval_isanonymous;
	}
	/**
	* 0表示不是 1表示是匿名评价
	*@param  geval_isanonymous
	*/
	public void setGeval_isanonymous(Integer geval_isanonymous ){
		this.geval_isanonymous = geval_isanonymous;
	}
	
	/**
	* 订单商品表编号
	*@return 
	*/
	public Integer getGeval_ordergoodsid(){
		return  geval_ordergoodsid;
	}
	/**
	* 订单商品表编号
	*@param  geval_ordergoodsid
	*/
	public void setGeval_ordergoodsid(Integer geval_ordergoodsid ){
		this.geval_ordergoodsid = geval_ordergoodsid;
	}
	
	/**
	* 订单表自增ID
	*@return 
	*/
	public Integer getGeval_orderid(){
		return  geval_orderid;
	}
	/**
	* 订单表自增ID
	*@param  geval_orderid
	*/
	public void setGeval_orderid(Integer geval_orderid ){
		this.geval_orderid = geval_orderid;
	}
	
	/**
	* 1-5分
	*@return 
	*/
	public Integer getGeval_scores(){
		return  geval_scores;
	}
	/**
	* 1-5分
	*@param  geval_scores
	*/
	public void setGeval_scores(Integer geval_scores ){
		this.geval_scores = geval_scores;
	}
	
	/**
	* 评价信息的状态 0为正常 1为禁止显示
	*@return 
	*/
	public Integer getGeval_state(){
		return  geval_state;
	}
	/**
	* 评价信息的状态 0为正常 1为禁止显示
	*@param  geval_state
	*/
	public void setGeval_state(Integer geval_state ){
		this.geval_state = geval_state;
	}
	
	/**
	* 店铺编号
	*@return 
	*/
	public Integer getGeval_storeid(){
		return  geval_storeid;
	}
	/**
	* 店铺编号
	*@param  geval_storeid
	*/
	public void setGeval_storeid(Integer geval_storeid ){
		this.geval_storeid = geval_storeid;
	}
	
	/**
	* 信誉评价内容
	*@return 
	*/
	public String getGeval_content(){
		return  geval_content;
	}
	/**
	* 信誉评价内容
	*@param  geval_content
	*/
	public void setGeval_content(String geval_content ){
		this.geval_content = geval_content;
	}
	
	/**
	* 解释内容
	*@return 
	*/
	public String getGeval_explain(){
		return  geval_explain;
	}
	/**
	* 解释内容
	*@param  geval_explain
	*/
	public void setGeval_explain(String geval_explain ){
		this.geval_explain = geval_explain;
	}
	
	/**
	* 评价人名称
	*@return 
	*/
	public String getGeval_frommembername(){
		return  geval_frommembername;
	}
	/**
	* 评价人名称
	*@param  geval_frommembername
	*/
	public void setGeval_frommembername(String geval_frommembername ){
		this.geval_frommembername = geval_frommembername;
	}
	
	/**
	* 商品图片
	*@return 
	*/
	public String getGeval_goodsimage(){
		return  geval_goodsimage;
	}
	/**
	* 商品图片
	*@param  geval_goodsimage
	*/
	public void setGeval_goodsimage(String geval_goodsimage ){
		this.geval_goodsimage = geval_goodsimage;
	}
	
	/**
	* 商品名称
	*@return 
	*/
	public String getGeval_goodsname(){
		return  geval_goodsname;
	}
	/**
	* 商品名称
	*@param  geval_goodsname
	*/
	public void setGeval_goodsname(String geval_goodsname ){
		this.geval_goodsname = geval_goodsname;
	}
	
	/**
	* 商品价格
	*@return 
	*/
	public BigDecimal getGeval_goodsprice(){
		return  geval_goodsprice;
	}
	/**
	* 商品价格
	*@param  geval_goodsprice
	*/
	public void setGeval_goodsprice(BigDecimal geval_goodsprice ){
		this.geval_goodsprice = geval_goodsprice;
	}
	
	/**
	* 晒单图片
	*@return 
	*/
	public String getGeval_image(){
		return  geval_image;
	}
	/**
	* 晒单图片
	*@param  geval_image
	*/
	public void setGeval_image(String geval_image ){
		this.geval_image = geval_image;
	}
	
	/**
	* 订单编号
	*@return 
	*/
	public Long getGeval_orderno(){
		return  geval_orderno;
	}
	/**
	* 订单编号
	*@param  geval_orderno
	*/
	public void setGeval_orderno(Long geval_orderno ){
		this.geval_orderno = geval_orderno;
	}
	
	/**
	* 管理员对评价的处理备注
	*@return 
	*/
	public String getGeval_remark(){
		return  geval_remark;
	}
	/**
	* 管理员对评价的处理备注
	*@param  geval_remark
	*/
	public void setGeval_remark(String geval_remark ){
		this.geval_remark = geval_remark;
	}
	
	/**
	* 店铺名称
	*@return 
	*/
	public String getGeval_storename(){
		return  geval_storename;
	}
	/**
	* 店铺名称
	*@param  geval_storename
	*/
	public void setGeval_storename(String geval_storename ){
		this.geval_storename = geval_storename;
	}
	

}
