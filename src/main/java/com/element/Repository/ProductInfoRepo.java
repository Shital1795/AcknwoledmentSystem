package com.element.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.element.Entity.ProductInfo;

@Repository
public interface ProductInfoRepo extends JpaRepository<ProductInfo, Integer> {

	public ProductInfo findByProductNumber(Long proNumber);
	
}
