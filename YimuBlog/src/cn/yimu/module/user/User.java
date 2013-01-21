package cn.yimu.module.user;

import java.util.Calendar;

import cn.yimu.util.CommonUtil;

public class User {
	private String id = "";
	private String username = "";
	private String password = "";
	private String email = "";
	private Calendar registerTime = CommonUtil.getBlankTime();
	private Calendar lastLoginTime = CommonUtil.getBlankTime();
	private UserType type = UserType.NULL;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Calendar getRegisterTime() {
		return registerTime;
	}
	
	public void setRegisterTime(Calendar registerTime) {
		this.registerTime = registerTime;
	}
	
	public Calendar getLastLoginTime() {
		return lastLoginTime;
	}
	
	public void setLastLoginTime(Calendar lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	
	public UserType getType() {
		return type;
	}
	
	public void setType(UserType type) {
		this.type = type;
	}
}
