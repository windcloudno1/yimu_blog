package cn.yimu.module.entity;

import java.util.Calendar;

import cn.yimu.module.action.ActionFactory;
import cn.yimu.module.action.UserAction;
import cn.yimu.util.CommonUtil;
import cn.yimu.util.UserType;

public class User {
	private String id = "";
	private String username = "";
	private String password = "";
	private String email = "";
	private Calendar registerTime = CommonUtil.getBlankTime();
	private UserType type = UserType.GUEST;
	private UserAction action = ActionFactory.NULLUserAction;

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

	public UserType getType() {
		return type;
	}

	public void setType(UserType type) {
		this.type = type;
	}

	public UserAction getAction() {
		return action;
	}

	public void setAction(UserAction action) {
		this.action = action;
	}

}
