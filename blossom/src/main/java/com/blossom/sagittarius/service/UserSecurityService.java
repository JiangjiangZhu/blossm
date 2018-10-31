package com.blossom.sagittarius.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.blossom.sagittarius.dao.RoleDao;
import com.blossom.sagittarius.dao.UserDao;
import com.blossom.sagittarius.domain.UserDO;
import com.blossom.sagittarius.domain.security.Authority;
import com.blossom.sagittarius.domain.security.Role;
import com.blossom.sagittarius.domain.security.UserPrincipal;

@Service
public class UserSecurityService implements UserDetailsService {
	
	private static final Logger logger = LoggerFactory.getLogger(UserSecurityService.class);
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private RoleDao roleDao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserPrincipal userDetail = new UserPrincipal();
		UserDO userDO = null;
		if (username != null && username.length() > 0) {
			userDO = userDao.getByUsername(username);
		} else {
			logger.info("username is empty!");
		}
		userDetail.setUserDO(userDO);
		List<Role> roles = roleDao.listByUsername(username);
		Set<Authority> authorities = new HashSet<>();
		for (Role role : roles) {
			authorities.add(new Authority(role.getName()));
		}
		userDetail.setAuthorities(authorities);
		return userDetail;
	}

}
