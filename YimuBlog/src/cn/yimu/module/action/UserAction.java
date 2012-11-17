package cn.yimu.module.action;

import cn.yimu.module.entity.User;

public interface UserAction {

	public boolean login(String username, String password);

	public boolean register(User user);

	public boolean modify(User user);
}
