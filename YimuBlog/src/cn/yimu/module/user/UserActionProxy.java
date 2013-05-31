package cn.yimu.module.user;

import cn.yimu.module.permission.PermissionGroup;
import cn.yimu.module.user.actionimpl.UserActionImpl;

public class UserActionProxy implements UserAction {

	private static UserActionProxy instance = null;
	private UserAction action = UserActionImpl.getInstance();
	
	private UserActionProxy() {
		super();
	}
	
	synchronized public static UserAction getInstance() {
		if(instance == null)
			instance = new UserActionProxy();
		return instance;
	}
	
	@Override
	public User login(String username, String password) {
		return action.login(username, password);
	}

	@Override
	public void register(User user) {
		action.register(user);
	}

	@Override
	public void add(User user) {
		action.add(user);
	}

	@Override
	public void remove(String[] usersId) {
		action.remove(usersId);
	}

	@Override
	public void modify(User user) {
		action.modify(user);
	}

	@Override
	public void addAuthorityGroup(PermissionGroup group) {
		action.addAuthorityGroup(group);
	}

	@Override
	public void removeAuthorityGroup(String[] groupsId) {
		action.removeAuthorityGroup(groupsId);
	}

	@Override
	public void modifyAuthorityGroup(PermissionGroup group) {
		action.modifyAuthorityGroup(group);
	}

	@Override
	public void addUserToAuthorityGroup(String[] usersId, String groupId) {
		action.addUserToAuthorityGroup(usersId, groupId);
	}

	@Override
	public void removeUserFromAuthorityGroup(String[] usersId, String groupId) {
		action.removeUserFromAuthorityGroup(usersId, groupId);
	}

}
