package cn.yimu.module;

import cn.yimu.module.user.UserAction;
import cn.yimu.module.user.UserActionProxy;

public abstract class ActionFactory {
	
	public static UserAction getUserAction() {
		return UserActionProxy.getInstance();
	}

}
