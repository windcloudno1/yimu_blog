package cn.yimu.module.permission;

import cn.yimu.module.EntityFactory;

public class PermissionGroupCache {
	private static PermissionGroup[] groups = new PermissionGroup[0];

	public void init() {

	}

	public PermissionGroup[] getAllAuthorityGroups() {
		return groups;
	}

	public PermissionGroup getAuthorityGroup(String groupId) {
		for (PermissionGroup group : groups) {
			if(groupId.equals(group.getId())) {
				return group;
			}
		}
		return EntityFactory.NULL_PERMISSION_GROUP;
	}

}
