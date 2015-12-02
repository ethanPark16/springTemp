package com.pidotech.mari.cmm.service;

import java.io.Serializable;

/**
 * LoginVO.java
 *
 * @author ethan
 * @since 2015. 11. 17.
 * @etc 
 *
 */
public class LoginVO implements Serializable {
	
	private static final long serialVersionUID = -8274004534207618049L;
	
	/** ���̵� */
	private String id;
	/** �̸� */
	private String name;
	/** �ֹε�Ϲ�ȣ */
	private String ihidNum;
	/** �̸����ּ� */
	private String email;
	/** ��й�ȣ */
	private String password;
	/** ��й�ȣ ��Ʈ */
	private String passwordHint;
	/** ��й�ȣ ���� */
	private String passwordCnsr;
	/** ����(�μ�)ID */
	private String orgnztId;
	/** ����(�μ�)�� */
	private String orgnztNm;
	/** �α��� �� �̵��� ������ */
	private String url;
	/** ����� IP���� */
	private String ip;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIhidNum() {
		return ihidNum;
	}
	public void setIhidNum(String ihidNum) {
		this.ihidNum = ihidNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPasswordHint() {
		return passwordHint;
	}
	public void setPasswordHint(String passwordHint) {
		this.passwordHint = passwordHint;
	}
	public String getPasswordCnsr() {
		return passwordCnsr;
	}
	public void setPasswordCnsr(String passwordCnsr) {
		this.passwordCnsr = passwordCnsr;
	}
	public String getOrgnztId() {
		return orgnztId;
	}
	public void setOrgnztId(String orgnztId) {
		this.orgnztId = orgnztId;
	}
	public String getOrgnztNm() {
		return orgnztNm;
	}
	public void setOrgnztNm(String orgnztNm) {
		this.orgnztNm = orgnztNm;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
}
