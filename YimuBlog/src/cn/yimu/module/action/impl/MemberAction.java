package cn.yimu.module.action.impl;

import cn.yimu.module.action.UserAction;
import cn.yimu.module.entity.User;

public class MemberAction implements UserAction {

	@Override
	public boolean login(String username, String password) {
		return false;
	}

	@Override
	public boolean register(User user) {
		return false;
	}

	@Override
	public boolean modify(User user) {
		return false;
	}

}
