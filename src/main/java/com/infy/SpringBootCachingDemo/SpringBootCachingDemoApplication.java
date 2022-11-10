package com.infy.SpringBootCachingDemo;

import com.infy.SpringBootCachingDemo.dto.CustomerDTO;
import com.infy.SpringBootCachingDemo.service.CustomerService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableCaching
public class SpringBootCachingDemoApplication {

	@Autowired
	CustomerService customerService;

	@Autowired
	Environment environment;

	private static final Log LOGGER = LogFactory.getLog(SpringBootCachingDemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCachingDemoApplication.class, args);
	}

	public void run(String... args) throws Exception {
		getCustomer();
		getCustomer();
		getCustomer();
	}

	public void getCustomer(){
		try{
			CustomerDTO customer = customerService.getCustomerDetails(1);
			LOGGER.info("\n" +customer);
		} catch (Exception e){
			if(e.getMessage() != null)
				LOGGER.info(environment.getProperty(e.getMessage()));
		}
	}

}
