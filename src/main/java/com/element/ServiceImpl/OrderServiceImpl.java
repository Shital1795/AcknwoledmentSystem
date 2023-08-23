package com.element.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.element.Entity.AdDocuments;
import com.element.Entity.OrderHeader;
import com.element.Entity.ProductInfo;
import com.element.Repository.AdDocumentRepo;
import com.element.Repository.OrderHeaderRepo;
import com.element.Repository.ProductInfoRepo;
import com.element.Service.OrderService;



@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderHeaderRepo orderRepo;
	
	@Autowired
	private ProductInfoRepo productRepo;
	
	@Autowired
	private AdDocumentRepo adRepo;
	
	@Override
	public OrderHeader AddOrder(OrderHeader orderheader) {
		
		
		OrderHeader save = orderRepo.save(orderheader);
		return save;
		
	}
	
	@Override
	public ProductInfo AddProduct(ProductInfo product) {
		
		 ProductInfo save = productRepo.save(product);
		return save;
	}
	
	

	@Override
	public AdDocuments AddDocumentGeneratedAndPersist(OrderHeader order) {
		AdDocuments adDocument = new AdDocuments();
		ProductInfo storeProductInfo = productRepo.findByProductNumber(order.getOrderItems().getProductNumber());
		
		if(storeProductInfo.getProductQty() >= order.getOrderItems().getProductQty())
		{
		adDocument.setAcknowledgmentType("AD");
		adDocument.setUserName(order.getUserName());
		adDocument.setPurchaseOrderNumber(order.getPurchaseOrderNumber());
		adDocument.setOrderItems(order.getOrderItems());
		
		AdDocuments saveAdDoc = adRepo.save(adDocument);
		
		System.out.println(saveAdDoc);
		
		}
        return adDocument;
	}
}
