package com.example.ordermgmt.util;

import java.util.Comparator;

import com.example.ordermgmt.entity.Order;

public class OrderComparator implements Comparator<Order> {

    @Override
    public int compare(Order o1, Order o2) {
        if (o1.getOrderDate() == null || o2.getOrderDate() == null) {
            return 0;
        }
        return o2.getOrderDate().compareTo(o1.getOrderDate());
    }
}
