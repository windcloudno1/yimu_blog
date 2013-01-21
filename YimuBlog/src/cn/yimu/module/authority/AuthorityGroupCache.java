package cn.yimu.module.authority;

public class AuthorityGroupCache {
	private static AuthorityGroup[] groups = new AuthorityGroup[0];

	public void init() {

	}

	public AuthorityGroup[] getAllAuthorityGroups() {
		return groups;
	}

	public AuthorityGroup getAuthorityGroup(String groupId) {
		for (AuthorityGroup group : groups) {
			if(groupId.equals(group.getId())) {
				return group;
			}
		}
	}

}
