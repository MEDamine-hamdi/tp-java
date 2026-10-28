package com.tp1.ecommerce.services;

import com.tp1.ecommerce.entities.Product;
import com.tp1.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).get();
    }

    public Product updateProduct(Product product) {
        return productRepository.saveAndFlush(product);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
