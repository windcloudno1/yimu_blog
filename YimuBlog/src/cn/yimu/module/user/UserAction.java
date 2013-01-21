package cn.yimu.module.user;

import cn.yimu.module.authority.AuthorityGroup;


public interface UserAction {

	/**
	 * 
	 * @param username
	 * @param password 调用者不负责秘密加密/解密
	 * @return
	 */
	public User login(String username, String password);

	public void register(User user);

	public void add(User user);
	
	/**
	 * 
	 * @param usersId 调用者保证数组长度不为0
	 */
	public void remove(String[] usersId);

	public void modify(User user);
	
	public void addAuthorityGroup(AuthorityGroup group);
	
	/**
	 * 
	 * @param groupsId	调用者保证数组长度不为0
	 */
	public void removeAuthorityGroup(String[] groupsId);

	public void modifyAuthorityGroup(AuthorityGroup group);

	/**
	 * 
	 * @param usersId 调用者保证数组长度不为0
	 * @param groupId
	 */
	public void addUserToAuthorityGroup(String[] usersId, String groupId);
	
	/**
	 * 
	 * @param usersId 调用者保证数组长度不为0
	 * @param groupId
	 */
	public void removeUserFromAuthorityGroup(String[] usersId, String groupId);

}
