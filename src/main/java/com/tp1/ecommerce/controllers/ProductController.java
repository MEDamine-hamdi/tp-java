package com.tp1.ecommerce.controllers;

import com.tp1.ecommerce.entities.Product;
import com.tp1.ecommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("/addProduct")
    public String addProduct(Model model) {
        Product product = new Product();
        model.addAttribute("ProductForm", product);
        return "new_product";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute("ProductForm") Product product) {
        productService.createProduct(product);
        return "redirect:/all";
    }

    @RequestMapping("/all")
    public String getAllProducts(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "all_products";
    }
}
