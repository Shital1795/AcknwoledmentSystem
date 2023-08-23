package com.element.Entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class AdDocuments {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String userName;
	private Long purchaseOrderNumber;
	private LocalDate documentsCreatedDate;
	private String acknowledgmentType;
	
	@OneToOne
	private OrderItems orderItems;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Long getPurchaseOrderNumber() {
		return purchaseOrderNumber;
	}

	public void setPurchaseOrderNumber(Long purchaseOrderNumber) {
		this.purchaseOrderNumber = purchaseOrderNumber;
	}

	public LocalDate getDocumentsCreatedDate() {
		return documentsCreatedDate;
	}

	public void setDocumentsCreatedDate(LocalDate documentsCreatedDate) {
		this.documentsCreatedDate = documentsCreatedDate;
	}

	public String getAcknowledgmentType() {
		return acknowledgmentType;
	}

	public void setAcknowledgmentType(String acknowledgmentType) {
		this.acknowledgmentType = acknowledgmentType;
	}

	public OrderItems getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(OrderItems orderItems) {
		this.orderItems = orderItems;
	}

	public AdDocuments() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdDocuments(Long id, String userName, Long purchaseOrderNumber, LocalDate documentsCreatedDate,
			String acknowledgmentType, OrderItems orderItems) {
		super();
		this.id = id;
		this.userName = userName;
		this.purchaseOrderNumber = purchaseOrderNumber;
		this.documentsCreatedDate = documentsCreatedDate;
		this.acknowledgmentType = acknowledgmentType;
		this.orderItems = orderItems;
	}

	@Override
	public String toString() {
		return "AdDocuments [id=" + id + ", userName=" + userName + ", purchaseOrderNumber=" + purchaseOrderNumber
				+ ", documentsCreatedDate=" + documentsCreatedDate + ", acknowledgmentType=" + acknowledgmentType
				+ ", orderItems=" + orderItems + "]";
	}
	
	
	

}
