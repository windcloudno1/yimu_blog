package cn.yimu.module;

import cn.yimu.module.permission.PermissionGroup;
import cn.yimu.module.user.User;

public abstract class EntityFactory {
	public static User NULL_USER = new User();
	public static PermissionGroup NULL_PERMISSION_GROUP = new PermissionGroup();
}
