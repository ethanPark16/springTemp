package com.pidotech.mari.sample.service;

/**
 * SampleVO.java
 * Sample 용 VO
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
	private String reg_id;
	private String reg_dt;
	
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
	public String getReg_id() {
		return reg_id;
	}
	public void setReg_id(String reg_id) {
		this.reg_id = reg_id;
	}
	public String getReg_dt() {
		return reg_dt;
	}
	public void setReg_dt(String reg_dt) {
		this.reg_dt = reg_dt;
	}
}
