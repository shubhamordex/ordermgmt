package com.example.ordermgmt.service;

import java.util.List;

import com.example.ordermgmt.entity.Order;

public interface OrderService {

    Order createOrder(Order order);

    Order getOrderById(Long id);

    List<Order> getAllOrders();

    Order updateOrderStatus(Long id, String status);

    void deleteOrder(Long id);
}
