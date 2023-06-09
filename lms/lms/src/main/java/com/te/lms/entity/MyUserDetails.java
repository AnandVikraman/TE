package com.te.lms.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MyUserDetails implements UserDetails {

	private Authentication authentication;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		SimpleGrantedAuthority authority = new SimpleGrantedAuthority(authentication.getRoles());
		List<SimpleGrantedAuthority> authorities = new ArrayList<>();
		authorities.add(authority);
		return authorities;
	}       

	@Override
	public String getPassword() {

		return authentication.getPassword();
	}

	@Override
	public String getUsername() {

		return authentication.getEmployeeId();
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
