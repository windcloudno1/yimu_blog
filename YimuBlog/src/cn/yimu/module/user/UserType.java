package cn.yimu.module.user;

public enum UserType {
	
	DESIGNER(0),NULL(1),APPLIED(2),APPROVED(3);

	private int code;
	
	private UserType(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return this.code;
	}
	
}
