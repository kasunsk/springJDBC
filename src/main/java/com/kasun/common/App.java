package com.kasun.common;

import com.kasun.ui.Welcome;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

public class App 
{
	
	//private static final Logger log = LoggerFactory.getLogger(App.class);
	
	static Welcome welcome = new Welcome();

    public static void main( String[] args )
    {        
        welcome.setVisible(true);
        
    }
}

