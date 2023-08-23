package com.element.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.element.Entity.OrderHeader;
import com.element.Entity.ProductInfo;
import com.element.Service.OrderService;


@RestController
public class MainController {
	
	
	@Autowired
	private OrderService service;
	
	@PostMapping(value ="/Saveorder")
	public OrderHeader Saveorder(@RequestBody OrderHeader order)
	{
		
		OrderHeader addOrder = service.AddOrder(order);
		
		service.AddDocumentGeneratedAndPersist(order);
		
		
		return addOrder;

	}
	
    
	@PostMapping("/Saveproduct")
	public  ProductInfo saveProduct(@RequestBody ProductInfo product)
	{
		ProductInfo addProduct = service.AddProduct(product);
		return addProduct;
		
	}
}
