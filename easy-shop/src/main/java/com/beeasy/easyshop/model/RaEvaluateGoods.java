package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_evaluate_goods")
public class RaEvaluateGoods   {
	
	/*
	评价ID
	*/
	private Integer gevalId ;
	/*
	评价时间
	*/
	private Integer gevalAddtime ;
	/*
	评价人编号
	*/
	private Integer gevalFrommemberid ;
	/*
	商品表编号
	*/
	private Integer gevalGoodsid ;
	/*
	0表示不是 1表示是匿名评价
	*/
	private Integer gevalIsanonymous ;
	/*
	订单商品表编号
	*/
	private Integer gevalOrdergoodsid ;
	/*
	订单表自增ID
	*/
	private Integer gevalOrderid ;
	/*
	1-5分
	*/
	private Integer gevalScores ;
	/*
	评价信息的状态 0为正常 1为禁止显示
	*/
	private Integer gevalState ;
	/*
	店铺编号
	*/
	private Integer gevalStoreid ;
	/*
	信誉评价内容
	*/
	private String gevalContent ;
	/*
	解释内容
	*/
	private String gevalExplain ;
	/*
	评价人名称
	*/
	private String gevalFrommembername ;
	/*
	商品图片
	*/
	private String gevalGoodsimage ;
	/*
	商品名称
	*/
	private String gevalGoodsname ;
	/*
	商品价格
	*/
	private BigDecimal gevalGoodsprice ;
	/*
	晒单图片
	*/
	private String gevalImage ;
	/*
	订单编号
	*/
	private Long gevalOrderno ;
	/*
	管理员对评价的处理备注
	*/
	private String gevalRemark ;
	/*
	店铺名称
	*/
	private String gevalStorename ;
	
	public RaEvaluateGoods() {
	}
	
	/**
	* 评价ID
	*@return 
	*/
	public Integer getGevalId(){
		return  gevalId;
	}
	/**
	* 评价ID
	*@param  gevalId
	*/
	public void setGevalId(Integer gevalId ){
		this.gevalId = gevalId;
	}
	
	/**
	* 评价时间
	*@return 
	*/
	public Integer getGevalAddtime(){
		return  gevalAddtime;
	}
	/**
	* 评价时间
	*@param  gevalAddtime
	*/
	public void setGevalAddtime(Integer gevalAddtime ){
		this.gevalAddtime = gevalAddtime;
	}
	
	/**
	* 评价人编号
	*@return 
	*/
	public Integer getGevalFrommemberid(){
		return  gevalFrommemberid;
	}
	/**
	* 评价人编号
	*@param  gevalFrommemberid
	*/
	public void setGevalFrommemberid(Integer gevalFrommemberid ){
		this.gevalFrommemberid = gevalFrommemberid;
	}
	
	/**
	* 商品表编号
	*@return 
	*/
	public Integer getGevalGoodsid(){
		return  gevalGoodsid;
	}
	/**
	* 商品表编号
	*@param  gevalGoodsid
	*/
	public void setGevalGoodsid(Integer gevalGoodsid ){
		this.gevalGoodsid = gevalGoodsid;
	}
	
	/**
	* 0表示不是 1表示是匿名评价
	*@return 
	*/
	public Integer getGevalIsanonymous(){
		return  gevalIsanonymous;
	}
	/**
	* 0表示不是 1表示是匿名评价
	*@param  gevalIsanonymous
	*/
	public void setGevalIsanonymous(Integer gevalIsanonymous ){
		this.gevalIsanonymous = gevalIsanonymous;
	}
	
	/**
	* 订单商品表编号
	*@return 
	*/
	public Integer getGevalOrdergoodsid(){
		return  gevalOrdergoodsid;
	}
	/**
	* 订单商品表编号
	*@param  gevalOrdergoodsid
	*/
	public void setGevalOrdergoodsid(Integer gevalOrdergoodsid ){
		this.gevalOrdergoodsid = gevalOrdergoodsid;
	}
	
	/**
	* 订单表自增ID
	*@return 
	*/
	public Integer getGevalOrderid(){
		return  gevalOrderid;
	}
	/**
	* 订单表自增ID
	*@param  gevalOrderid
	*/
	public void setGevalOrderid(Integer gevalOrderid ){
		this.gevalOrderid = gevalOrderid;
	}
	
	/**
	* 1-5分
	*@return 
	*/
	public Integer getGevalScores(){
		return  gevalScores;
	}
	/**
	* 1-5分
	*@param  gevalScores
	*/
	public void setGevalScores(Integer gevalScores ){
		this.gevalScores = gevalScores;
	}
	
	/**
	* 评价信息的状态 0为正常 1为禁止显示
	*@return 
	*/
	public Integer getGevalState(){
		return  gevalState;
	}
	/**
	* 评价信息的状态 0为正常 1为禁止显示
	*@param  gevalState
	*/
	public void setGevalState(Integer gevalState ){
		this.gevalState = gevalState;
	}
	
	/**
	* 店铺编号
	*@return 
	*/
	public Integer getGevalStoreid(){
		return  gevalStoreid;
	}
	/**
	* 店铺编号
	*@param  gevalStoreid
	*/
	public void setGevalStoreid(Integer gevalStoreid ){
		this.gevalStoreid = gevalStoreid;
	}
	
	/**
	* 信誉评价内容
	*@return 
	*/
	public String getGevalContent(){
		return  gevalContent;
	}
	/**
	* 信誉评价内容
	*@param  gevalContent
	*/
	public void setGevalContent(String gevalContent ){
		this.gevalContent = gevalContent;
	}
	
	/**
	* 解释内容
	*@return 
	*/
	public String getGevalExplain(){
		return  gevalExplain;
	}
	/**
	* 解释内容
	*@param  gevalExplain
	*/
	public void setGevalExplain(String gevalExplain ){
		this.gevalExplain = gevalExplain;
	}
	
	/**
	* 评价人名称
	*@return 
	*/
	public String getGevalFrommembername(){
		return  gevalFrommembername;
	}
	/**
	* 评价人名称
	*@param  gevalFrommembername
	*/
	public void setGevalFrommembername(String gevalFrommembername ){
		this.gevalFrommembername = gevalFrommembername;
	}
	
	/**
	* 商品图片
	*@return 
	*/
	public String getGevalGoodsimage(){
		return  gevalGoodsimage;
	}
	/**
	* 商品图片
	*@param  gevalGoodsimage
	*/
	public void setGevalGoodsimage(String gevalGoodsimage ){
		this.gevalGoodsimage = gevalGoodsimage;
	}
	
	/**
	* 商品名称
	*@return 
	*/
	public String getGevalGoodsname(){
		return  gevalGoodsname;
	}
	/**
	* 商品名称
	*@param  gevalGoodsname
	*/
	public void setGevalGoodsname(String gevalGoodsname ){
		this.gevalGoodsname = gevalGoodsname;
	}
	
	/**
	* 商品价格
	*@return 
	*/
	public BigDecimal getGevalGoodsprice(){
		return  gevalGoodsprice;
	}
	/**
	* 商品价格
	*@param  gevalGoodsprice
	*/
	public void setGevalGoodsprice(BigDecimal gevalGoodsprice ){
		this.gevalGoodsprice = gevalGoodsprice;
	}
	
	/**
	* 晒单图片
	*@return 
	*/
	public String getGevalImage(){
		return  gevalImage;
	}
	/**
	* 晒单图片
	*@param  gevalImage
	*/
	public void setGevalImage(String gevalImage ){
		this.gevalImage = gevalImage;
	}
	
	/**
	* 订单编号
	*@return 
	*/
	public Long getGevalOrderno(){
		return  gevalOrderno;
	}
	/**
	* 订单编号
	*@param  gevalOrderno
	*/
	public void setGevalOrderno(Long gevalOrderno ){
		this.gevalOrderno = gevalOrderno;
	}
	
	/**
	* 管理员对评价的处理备注
	*@return 
	*/
	public String getGevalRemark(){
		return  gevalRemark;
	}
	/**
	* 管理员对评价的处理备注
	*@param  gevalRemark
	*/
	public void setGevalRemark(String gevalRemark ){
		this.gevalRemark = gevalRemark;
	}
	
	/**
	* 店铺名称
	*@return 
	*/
	public String getGevalStorename(){
		return  gevalStorename;
	}
	/**
	* 店铺名称
	*@param  gevalStorename
	*/
	public void setGevalStorename(String gevalStorename ){
		this.gevalStorename = gevalStorename;
	}
	

}
