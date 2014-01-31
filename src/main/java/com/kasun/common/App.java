package com.kasun.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kasun.customer.dao.PersionDAO;
import com.kasun.customer.model.Persion;

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
    	 
        PersionDAO persionDAO = (PersionDAO) context.getBean("persionDAO");
        
        
    }
}

