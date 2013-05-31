package cn.yimu.module.user.actionimpl;

import cn.yimu.module.permission.PermissionGroup;
import cn.yimu.module.user.User;
import cn.yimu.module.user.UserAction;

public class UserActionImpl implements UserAction {
	
	private static UserAction instance = null;
	
	private UserActionImpl(){
		super();
	}
	
	synchronized public static UserAction getInstance() {
		if(instance == null)
			instance = new UserActionImpl();
		
		return instance;
	}

	@Override
	public User login(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(String[] usersId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addAuthorityGroup(PermissionGroup group) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeAuthorityGroup(String[] groupsId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyAuthorityGroup(PermissionGroup group) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addUserToAuthorityGroup(String[] usersId, String groupId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeUserFromAuthorityGroup(String[] usersId, String groupId) {
		// TODO Auto-generated method stub
		
	}}
