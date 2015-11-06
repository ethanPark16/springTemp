package com.pidotech.mobility.sample.service;

/**
 * SampleVO.java
 * Sample ¿ë VO
 *
 * @author ethan
 * @since 2015. 10. 27.
 * @etc 
 *
 */
public class SampleVO {
	
	private String user_id;
	private String user_name;
	private String user_pw;
	private String regist_user;
	private String regist_dt;
	
	public String getRegist_dt() {
		return regist_dt;
	}
	public void setRegist_dt(String regist_dt) {
		this.regist_dt = regist_dt;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_pw() {
		return user_pw;
	}
	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}
	public String getRegist_user() {
		return regist_user;
	}
	public void setRegist_user(String regist_user) {
		this.regist_user = regist_user;
	}
	
}
