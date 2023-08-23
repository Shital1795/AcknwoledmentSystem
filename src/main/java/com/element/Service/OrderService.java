package com.element.Service;

import com.element.Entity.AdDocuments;
import com.element.Entity.OrderHeader;
import com.element.Entity.ProductInfo;

public interface OrderService {

	public OrderHeader AddOrder(OrderHeader orderheader); 
	
	public ProductInfo AddProduct(ProductInfo productinfo);

	public AdDocuments AddDocumentGeneratedAndPersist(OrderHeader order);
	
}