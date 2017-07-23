package com.aylson.dc.cfdb.po;

import java.io.Serializable;

public class ImUsers implements Serializable{

	private static final long serialVersionUID = 6724807026829015944L;

	private String phoneId;		//手机唯一标识码
	private Integer balance;	//个人余额
	private String createDate;	//创建时间-注册
	private String updateDate;	//更新时间
	
	public String getPhoneId() {
		return phoneId;
	}
	public void setPhoneId(String phoneId) {
		this.phoneId = phoneId;
	}
	public Integer getBalance() {
		return balance;
	}
	public void setBalance(Integer balance) {
		this.balance = balance;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
}
