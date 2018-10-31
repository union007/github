package com.niit.shopbackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
@Component
@Entity
public class UserDetail {
	
	@Id  
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int userdetailId;
	private String userdetailName;
	private String userdetailDescription;
	public int getUserDetailId() {
		return userdetailId;
	}
	public void setUserDetailId(int userdetailId) {
		this.userdetailId = userdetailId;
	}
	public String getUserDetailName() {
		return userdetailName;
	}
	public void setUserDetailName(String userdetailName) {
		this.userdetailName = userdetailName;
	}
	public String getUserDetailDescription() {
		return userdetailDescription;
	}
	public void setUserDetailDescription(String userdetailDescription) {
		this.userdetailDescription = userdetailDescription;
	}

}
