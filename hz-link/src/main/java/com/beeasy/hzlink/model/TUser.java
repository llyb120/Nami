package com.beeasy.hzlink.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;

import org.beetl.sql.core.annotatoin.AssignID;

/*
* 
* gen by beetlsql 2019-06-10
*/
@Table(name="T_USER")
public class TUser   {

    @AssignID()
	private Long id ;
	private Integer baned ;
	private Integer new_user ;
	private Integer su ;
	private String acc_code ;
	private String avatar ;
	private String cloud_password ;
	private String cloud_username ;
	private String email ;
	private String letter ;
	private String password ;
	private String phone ;
	private String private_key ;
	private String public_key ;
	private String true_name ;
	private String username ;
	private Date add_time ;

	public TUser() {
	}

	public Long getId(){
		return  id;
	}
	public void setId(Long id ){
		this.id = id;
	}

	public Integer getBaned(){
		return  baned;
	}
	public void setBaned(Integer baned ){
		this.baned = baned;
	}

	public Integer getNew_user(){
		return  new_user;
	}
	public void setNew_user(Integer new_user ){
		this.new_user = new_user;
	}

	public Integer getSu(){
		return  su;
	}
	public void setSu(Integer su ){
		this.su = su;
	}

	public String getAcc_code(){
		return  acc_code;
	}
	public void setAcc_code(String acc_code ){
		this.acc_code = acc_code;
	}

	public String getAvatar(){
		return  avatar;
	}
	public void setAvatar(String avatar ){
		this.avatar = avatar;
	}

	public String getCloud_password(){
		return  cloud_password;
	}
	public void setCloud_password(String cloud_password ){
		this.cloud_password = cloud_password;
	}

	public String getCloud_username(){
		return  cloud_username;
	}
	public void setCloud_username(String cloud_username ){
		this.cloud_username = cloud_username;
	}

	public String getEmail(){
		return  email;
	}
	public void setEmail(String email ){
		this.email = email;
	}

	public String getLetter(){
		return  letter;
	}
	public void setLetter(String letter ){
		this.letter = letter;
	}

	public String getPassword(){
		return  password;
	}
	public void setPassword(String password ){
		this.password = password;
	}

	public String getPhone(){
		return  phone;
	}
	public void setPhone(String phone ){
		this.phone = phone;
	}

	public String getPrivate_key(){
		return  private_key;
	}
	public void setPrivate_key(String private_key ){
		this.private_key = private_key;
	}

	public String getPublic_key(){
		return  public_key;
	}
	public void setPublic_key(String public_key ){
		this.public_key = public_key;
	}

	public String getTrue_name(){
		return  true_name;
	}
	public void setTrue_name(String true_name ){
		this.true_name = true_name;
	}

	public String getUsername(){
		return  username;
	}
	public void setUsername(String username ){
		this.username = username;
	}

	public Date getAdd_time(){
		return  add_time;
	}
	public void setAdd_time(Date add_time ){
		this.add_time = add_time;
	}


}
