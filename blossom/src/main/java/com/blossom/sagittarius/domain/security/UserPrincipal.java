package com.blossom.sagittarius.domain.security;

import java.util.Collection;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.blossom.sagittarius.domain.UserDO;

public class UserPrincipal implements UserDetails {
	
	private static final long serialVersionUID = -3807328371370559457L;

	private UserDO userDO;
	
	private Set<Authority> authorities;
	
	public void setUserDO(UserDO userDO) {
		this.userDO = userDO;
	}
	
	public void setAuthorities(Set<Authority> authorities) {
		this.authorities = authorities;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	@Override
	public String getPassword() {
		return userDO.getPassword();
	}

	@Override
	public String getUsername() {
		return userDO.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
