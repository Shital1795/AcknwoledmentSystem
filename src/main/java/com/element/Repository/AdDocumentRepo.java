package com.element.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.element.Entity.AdDocuments;

@Repository
public interface AdDocumentRepo extends JpaRepository<AdDocuments, Serializable> {
	

}
