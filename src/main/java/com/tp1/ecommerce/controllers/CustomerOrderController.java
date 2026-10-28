package com.tp1.ecommerce.controllers;

import com.tp1.ecommerce.entities.CustomerOrder;
import com.tp1.ecommerce.services.CustomerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomerOrderController {

    @Autowired
    CustomerOrderService customerOrderService;

    @RequestMapping("/addOrder")
    public String addOrder(Model model) {
        CustomerOrder order = new CustomerOrder();
        model.addAttribute("OrderForm", order);
        return "new_order";
    }

    @RequestMapping(value = "/saveOrder", method = RequestMethod.POST)
    public String saveOrder(@ModelAttribute("OrderForm") CustomerOrder order) {
        customerOrderService.createOrder(order);
        return "redirect:/allOrders";
    }
}
