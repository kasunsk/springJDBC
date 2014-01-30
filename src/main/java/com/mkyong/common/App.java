package com.mkyong.common;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

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
	// TODO Auto-generated method stub
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
    	 
        CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDAO");

        JFrame frame = new JFrame("Vilage Data Maneger");
		frame.setSize(300, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.add(panel);
		panel.setLayout(null);

		JLabel userLabel = new JLabel("User");
		userLabel.setBounds(10, 10, 80, 25);
		panel.add(userLabel);

		JTextField userText = new JTextField(20);
		userText.setBounds(100, 10, 160, 25);
		panel.add(userText);

		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 40, 80, 25);
		panel.add(passwordLabel);

		JPasswordField passwordText = new JPasswordField(20);
		passwordText.setBounds(100, 40, 160, 25);
		panel.add(passwordText);

		JButton loginButton = new JButton("Login");
		loginButton.setBounds(10, 80, 80, 25);
		panel.add(loginButton);
	//	loginButton.action(evt, click)
	
		JButton registerButton = new JButton("Clear");
		registerButton.setBounds(180, 80, 80, 25);
		panel.add(registerButton);
		//placeComponents(panel);

		frame.setVisible(true);
       // Customer customer = new Customer(3, "Aruni",24);
       // customerDAO.insert(customer);
        
        log.info("inserted");
        }
        
       // Customer customer1 = customerDAO.findByCustomerId(1);
       /// log.info(" "+customer1);
    private static void placeComponents(JPanel panel) {

		panel.setLayout(null);

		JLabel userLabel = new JLabel("User");
		userLabel.setBounds(10, 10, 80, 25);
		panel.add(userLabel);

		JTextField userText = new JTextField(20);
		userText.setBounds(100, 10, 160, 25);
		panel.add(userText);

		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 40, 80, 25);
		panel.add(passwordLabel);

		JPasswordField passwordText = new JPasswordField(20);
		passwordText.setBounds(100, 40, 160, 25);
		panel.add(passwordText);

		JButton loginButton = new JButton("Login");
		loginButton.setBounds(10, 80, 80, 25);
		panel.add(loginButton);
	
		JButton registerButton = new JButton("Clear");
		registerButton.setBounds(180, 80, 80, 25);
		panel.add(registerButton);
	}
}

