package com.tp1.ecommerce.repository;

import com.tp1.ecommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findBySubcategoryId(Long subcategoryId);

    List<Product> findByProviderId(Long providerId);
}
