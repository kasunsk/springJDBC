package com.kasun.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kasun.customer.dao.PersionDAO;
import com.kasun.customer.model.Persion;
import com.kasun.ui.Welcome;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App 
{
	
	private static final Logger log = LoggerFactory.getLogger(App.class);
	
	static Welcome welcome = new Welcome();

    public static void main( String[] args )
    {        
        welcome.setVisible(true);
        
    }
}

