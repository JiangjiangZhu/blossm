package com.blossom.sagittarius.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.blossom.sagittarius.domain.security.Role;
import com.blossom.sagittarius.domain.security.UserRole;

@Mapper
public interface RoleDao {
	
	List<Role> listByUsername(String username);
	
	int createRole(Role role);
	
	void createRoleForUser(UserRole userRole);

}
