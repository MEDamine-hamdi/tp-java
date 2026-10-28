package com.tp1.ecommerce.services;

import com.tp1.ecommerce.entities.CustomerOrder;
import com.tp1.ecommerce.repository.CustomerOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerOrderService {

    @Autowired
    private CustomerOrderRepository customerOrderRepository;

    public CustomerOrder  createOrder(CustomerOrder order) {
        return customerOrderRepository.save(order);
    }

    public List<CustomerOrder> getAllOrders() {
        return customerOrderRepository.findAll();
    }

    public CustomerOrder getOrderById(Long id) {
        return customerOrderRepository.findById(id).get();
    }

    public CustomerOrder updateOrder(CustomerOrder order) {
        return customerOrderRepository.saveAndFlush(order);
    }

    public void deleteOrder(Long id) {
        customerOrderRepository.deleteById(id);
    }
}
