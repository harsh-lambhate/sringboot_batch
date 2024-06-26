package com.springbatch.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbatch.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Serializable> {

}
