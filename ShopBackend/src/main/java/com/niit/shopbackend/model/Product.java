package com.niit.shopbackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Component;
@Component
@Entity
public class Product {
	
	@Id  
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int productId;
	private String  productName;
	private String  productDescription;
	private int productPrice;
	private int productQuantity;
	private int categoryId;
	
	@ManyToOne
	@JoinColumn(name="categoryId",insertable=false,updatable=false,nullable=false)
	private Category category;
	
	public int getProductId() {
		return  productId;
	}
	
	public void setProductId(int productId) {
		this. productId = productId;
	}
	public String getProductName() {
		return  productName;
	}
	public void setProductName(String  productName) {
		this. productName =  productName;
	}
	public String getProductDescription() {
		return  productDescription;
	}
	public void setProductDescription(String  productDescription) {
		this.productDescription =  productDescription;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

}
