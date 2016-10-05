package com.pulppy.user.bean;

import java.util.Date;

public class AccountDTO {
	private String id__p;
	private String username__p;
	private String password__p;
	private String role__p;
	private String datetime__p;
	private String email__p;
	private int mobilephone__p;
	private int bitcoin__p;
	private boolean isValid;
	public boolean isValid() {
		return isValid;
	}
	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}
	public String getId__p() {
		return id__p;
	}
	public void setId__p(String id__p) {
		this.id__p = id__p;
	}
	public String getUsername__p() {
		return username__p;
	}
	public void setUsername__p(String username__p) {
		this.username__p = username__p;
	}
	public String getPassword__p() {
		return password__p;
	}
	public void setPassword__p(String password__p) {
		this.password__p = password__p;
	}
	public String getRole__p() {
		return role__p;
	}
	public void setRole__p(String role__p) {
		this.role__p = role__p;
	}
	public String getDatetime__p() {
		return datetime__p;
	}
	public void setDatetime__p(String datetime__p) {
		this.datetime__p = datetime__p;
	}
	public String getEmail__p() {
		return email__p;
	}
	public void setEmail__p(String email__p) {
		this.email__p = email__p;
	}
	public int getMobilephone__p() {
		return mobilephone__p;
	}
	public void setMobilephone__p(int mobilephone__p) {
		this.mobilephone__p = mobilephone__p;
	}
	public int getBitcoin__p() {
		return bitcoin__p;
	}
	public void setBitcoin__p(int bitcoin__p) {
		this.bitcoin__p = bitcoin__p;
	}
	
	public AccountDTO(String id__p, String username__p, String password__p, String role__p, String datetime__p,
			String email__p, int mobilephone__p, int bitcoin__p, boolean isValid) {
		super();
		this.id__p = id__p;
		this.username__p = username__p;
		this.password__p = password__p;
		this.role__p = role__p;
		this.datetime__p = datetime__p;
		this.email__p = email__p;
		this.mobilephone__p = mobilephone__p;
		this.bitcoin__p = bitcoin__p;
		this.isValid = isValid;
	}
	public AccountDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
}
