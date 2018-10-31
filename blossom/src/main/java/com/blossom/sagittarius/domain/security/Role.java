package com.blossom.sagittarius.domain.security;

import com.blossom.sagittarius.domain.BaseDO;

public class Role extends BaseDO {
	
	private Integer roldId;
	
	private String name;

	public Integer getRoldId() {
		return roldId;
	}

	public void setRoldId(Integer roldId) {
		this.roldId = roldId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
