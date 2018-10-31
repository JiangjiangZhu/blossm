package com.blossom.sagittarius.domain.security;

import com.blossom.sagittarius.domain.BaseDO;

public class UserRole extends BaseDO {
	
	private String username;
	
	private Integer roleId;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

}
