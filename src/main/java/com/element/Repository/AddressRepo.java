package com.element.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.element.Entity.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address, String>{

}
