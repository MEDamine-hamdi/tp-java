package com.tp1.ecommerce.services;

import com.tp1.ecommerce.entities.Category;
import com.tp1.ecommerce.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id).get();
    }

    public Category updateCategory(Category category) {
        return categoryRepository.saveAndFlush(category);
    }

    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}
