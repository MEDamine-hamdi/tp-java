package com.tp1.ecommerce.controllers;

import com.tp1.ecommerce.entities.Provider;
import com.tp1.ecommerce.services.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProviderController {

    @Autowired
    ProviderService providerService;

    @RequestMapping("/addProvider")
    public String addProvider(Model model) {
        Provider provider = new Provider();
        model.addAttribute("ProviderForm", provider);
        return "new_provider";
    }

    @RequestMapping(value = "/saveProvider", method = RequestMethod.POST)
    public String saveProvider(@ModelAttribute("ProviderForm") Provider provider) {
        providerService.createProvider(provider);
        return "redirect:/allProviders";
    }
}
