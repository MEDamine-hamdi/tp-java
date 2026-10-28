package com.tp1.ecommerce.controllers;

import com.tp1.ecommerce.entities.Category;
import com.tp1.ecommerce.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @RequestMapping("/addCategory")
    public String addCategory(Model model) {
        Category category = new Category();
        model.addAttribute("CategoryForm", category);
        return "new_category";
    }

    @RequestMapping(value = "/saveCategory", method = RequestMethod.POST)
    public String saveCategory(@ModelAttribute("CategoryForm") Category category) {
        categoryService.createCategory(category);
        return "redirect:/allCategories";
    }
}
