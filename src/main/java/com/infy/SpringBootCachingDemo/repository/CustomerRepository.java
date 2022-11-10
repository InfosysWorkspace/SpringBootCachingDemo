package com.infy.SpringBootCachingDemo.repository;

import com.infy.SpringBootCachingDemo.dto.CustomerDTO;

public interface CustomerRepository {
    public CustomerDTO getCustomerDetails(Integer customerId);
}
