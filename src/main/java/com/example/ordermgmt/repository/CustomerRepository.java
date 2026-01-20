package com.example.ordermgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ordermgmt.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
