package com.infy.SpringBootCachingDemo.service;


import com.infy.SpringBootCachingDemo.dto.CustomerDTO;
import com.infy.SpringBootCachingDemo.exception.InfyBankException;
import com.infy.SpringBootCachingDemo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;

    public CustomerDTO getCustomerDetails(Integer customerId) throws InfyBankException {
        return customerRepository.getCustomerDetails(customerId);
    }
}
