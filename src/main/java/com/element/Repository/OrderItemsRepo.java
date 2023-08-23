package com.element.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.element.Entity.OrderItems;

@Repository
public interface OrderItemsRepo extends JpaRepository<OrderItems, Integer> {

}
