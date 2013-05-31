package cn.yimu.module.permission;

public class PermissionGroup {
	private String id = "";
	private String name = "";
	private String[] userId = new String[0];
	private Permission[] authorities = new Permission[0];
	
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
	
	public String[] getUserId() {
		return userId;
	}
	
	public void setUserId(String[] userId) {
		this.userId = userId;
	}
	
	public Permission[] getAuthorities() {
		return authorities;
	}
	
	public void setAuthorities(Permission[] authorities) {
		this.authorities = authorities;
	}
	
}
