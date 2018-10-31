package com.niit.shopbackend.model;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Authorize {

	
	private String roleName="ROLE_USER";
	private int roleId;
	private String userName;
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	
}

