package com.blossom.sagittarius.domain.security;

import com.blossom.sagittarius.domain.BaseDO;

public class Role extends BaseDO {
	
	private Integer roleId;
	
	private String name;
	
	public Role(String name) {
		this.name = name;
	}
	
	public Role() {
		
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
