package com.mkyong.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mkyong.customer.dao.CustomerDAO;
import com.mkyong.customer.model.Customer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App 
{
	
	private static final Logger log = LoggerFactory.getLogger(App.class);
	//private static ApplicationContext context;
	
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
    	 
        CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDAO");
        Customer customer = new Customer(1, "kasun",28);
        customerDAO.insert(customer);
        
        log.info("inserted");
        
        Customer customer1 = customerDAO.findByCustomerId(1);
        log.info(" "+customer1);
    }
}
