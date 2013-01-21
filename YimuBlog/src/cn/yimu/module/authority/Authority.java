package cn.yimu.module.authority;

public enum Authority {
	
	MODULE_USER_MANAGER(0, "用户管理"),
	MODULE_AUTHORITY_MANAGER(1, "权限管理");
	
	private int num;
	private String name;

	private Authority(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getNum() {
		return this.num;
	}
	
	public String[] getAllName() {
		Authority[] authorities = Authority.values();
		String[] rlt = new String[authorities.length];
		
		for (int i = 0; i < authorities.length; i++)
			rlt[i] = authorities[i].getName();
		
		return rlt;
	}
	
	public int[] getAllNum() {
		Authority[] authorities = Authority.values();
		int[] rlt = new int[authorities.length];
		
		for (int i = 0; i < authorities.length; i++)
			rlt[i] = authorities[i].getNum();
		
		return rlt;
	}
	
}
