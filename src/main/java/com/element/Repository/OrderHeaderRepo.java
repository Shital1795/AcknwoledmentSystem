package com.element.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.element.Entity.OrderHeader;



@Repository
public interface OrderHeaderRepo extends JpaRepository<OrderHeader, Long>{	
}
