package cn.yimu.module.action;

import cn.yimu.module.action.impl.AdminAction;
import cn.yimu.module.action.impl.GuestAction;
import cn.yimu.module.action.impl.MemberAction;
import cn.yimu.module.entity.User;
import cn.yimu.util.UserType;

public abstract class ActionFactory {
	public static UserAction NULLUserAction = new UserAction() {

		@Override
		public boolean register(User user) {
			return false;
		}

		@Override
		public boolean modify(User user) {
			return false;
		}

		@Override
		public boolean login(String username, String password) {
			return false;
		}
	};
	
	public static UserAction getUserAction(UserType type) {
		UserAction rlt = NULLUserAction;
		switch (type) {
		case ADMIN:
			rlt = new AdminAction();
			break;
		case MEMBER:
			rlt = new MemberAction();
			break;
		case GUEST:
			rlt = new GuestAction();
			break;
		default:
			assert false : "undefine UserType [" + type.name() + "]";
			break;
		}
		return rlt;
	}

}
