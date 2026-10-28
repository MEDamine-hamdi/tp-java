package com.tp1.ecommerce.controllers;

import com.tp1.ecommerce.entities.Subcategory;
import com.tp1.ecommerce.services.SubcategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SubcategoryController {

    @Autowired
    SubcategoryService subcategoryService;

    @RequestMapping("/addSubcategory")
    public String addSubcategory(Model model) {
        Subcategory subcategory = new Subcategory();
        model.addAttribute("SubcategoryForm", subcategory);
        return "new_subcategory";
    }

    @RequestMapping(value = "/saveSubcategory", method = RequestMethod.POST)
    public String saveSubcategory(@ModelAttribute("SubcategoryForm") Subcategory subcategory) {
        subcategoryService.createSubcategory(subcategory);
        return "redirect:/allSubcategories";
    }
}
