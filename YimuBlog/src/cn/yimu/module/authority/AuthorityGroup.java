package cn.yimu.module.authority;

public class AuthorityGroup {
	private String id = "";
	private String name = "";
	private String[] userId = new String[0];
	private Authority[] authorities = new Authority[0];
	
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
	
	public Authority[] getAuthorities() {
		return authorities;
	}
	
	public void setAuthorities(Authority[] authorities) {
		this.authorities = authorities;
	}
	
}
