package com.mkyong.common;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mkyong.customer.dao.CustomerDAO;
import com.mkyong.customer.model.Customer;
import com.mkyong.designs.MyButtonListener;
import com.mkyong.designs.Login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App 
{
	
	private static final Logger log = LoggerFactory.getLogger(App.class);
	//private static ApplicationContext context;
	// TODO Auto-generated method stub
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
    	 
        CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDAO");
        
        Login w1 = new Login();
        w1.run();

	//	loginButton.action(evt, click)
	
		//placeComponents(panel);

       // Customer customer = new Customer(3, "Aruni",24);
       // customerDAO.insert(customer);
		
        log.info("inserted");
       
		//frame.setVisible(true);
		
	//	@SuppressWarnings("deprecation")
	
		
    
        
       // Customer customer1 = customerDAO.findByCustomerId(1);
       /// log.info(" "+customer1);login window in swing java
    }
}

