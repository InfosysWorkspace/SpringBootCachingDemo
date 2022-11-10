package com.infy.SpringBootCachingDemo.repository;

import com.infy.SpringBootCachingDemo.dto.CustomerDTO;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository(value = "customerRepository")
public class CustomerRepositoryImpl implements CustomerRepository{

    @Cacheable("customer")
    public CustomerDTO getCustomerDetails(Integer customerId){

        CustomerDTO customer = null;
        List<CustomerDTO> customerList = new ArrayList<>();

        CustomerDTO customer1 = new CustomerDTO();
        customer1.setCustomerId(1);
        customer1.setName("Buhari");
        customer1.setEmailId("buhari@infosys.com");
        customerList.add(customer1);

        CustomerDTO customer2 = new CustomerDTO();
        customer2.setCustomerId(1);
        customer2.setName("Maryam");
        customer2.setEmailId("maryam@infosys.com");
        customerList.add(customer2);

        CustomerDTO customer3 = new CustomerDTO();
        customer3.setCustomerId(1);
        customer3.setName("Aisha");
        customer3.setEmailId("aisha@infosys.com");
        customerList.add(customer1);

        for(CustomerDTO cust : customerList){
            if(cust.getCustomerId().equals(customerId)){
                customer = cust;
            }
        }
        return customer;
    }

}
