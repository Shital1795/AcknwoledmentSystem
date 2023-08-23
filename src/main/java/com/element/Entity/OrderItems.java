package com.element.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class OrderItems {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int productId;
	private long productNumber;
	private String productDescription;
	private int productQty;
	private long productPrice;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public long getProductNumber() {
		return productNumber;
	}
	public void setProductNumber(long productNumber) {
		this.productNumber = productNumber;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public int getProductQty() {
		return productQty;
	}
	public void setProductQty(int productQty) {
		this.productQty = productQty;
	}
	public long getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(long productPrice) {
		this.productPrice = productPrice;
	}
	public OrderItems(int productId, long productNumber, String productDescription, int productQty, long productPrice) {
		super();
		this.productId = productId;
		this.productNumber = productNumber;
		this.productDescription = productDescription;
		this.productQty = productQty;
		this.productPrice = productPrice;
	}
	public OrderItems() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "OrderItems [productId=" + productId + ", productNumber=" + productNumber + ", productDescription="
				+ productDescription + ", productQty=" + productQty + ", productPrice=" + productPrice + "]";
	}
	
	
	
	

}
