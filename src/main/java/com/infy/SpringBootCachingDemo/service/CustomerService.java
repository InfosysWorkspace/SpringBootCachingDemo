package com.infy.SpringBootCachingDemo.service;

import com.infy.SpringBootCachingDemo.dto.CustomerDTO;
import com.infy.SpringBootCachingDemo.exception.InfyBankException;

public interface CustomerService {

    public CustomerDTO getCustomerDetails(Integer customerId) throws InfyBankException;
}
