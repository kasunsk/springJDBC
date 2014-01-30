package com.mkyong.designs;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.mkyong.designs.MyButtonListener;

public class Login {
	

	public static void run() {
		JFrame frame = new JFrame("Vilage Data Master");
		frame.setSize(300, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		placeComponents(frame);
		frame.setVisible(true);
	}
	
    private static void placeComponents(JFrame frame) {
    	frame.setLayout(null);

		JLabel userLabel = new JLabel("User");
		userLabel.setBounds(10, 10, 80, 25);
		frame.add(userLabel);

		JTextField userText = new JTextField(20);
		userText.setBounds(100, 10, 160, 25);
		frame.add(userText);

		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 40, 80, 25);
		frame.add(passwordLabel);

		JPasswordField passwordText = new JPasswordField(20);
		passwordText.setBounds(100, 40, 160, 25);
		frame.add(passwordText);

		JButton loginButton = new JButton("Login");
		loginButton.setBounds(10, 80, 80, 25);
		frame.add(loginButton);
	
		JButton registerButton = new JButton("Clear");
		registerButton.setBounds(180, 80, 80, 25);
		frame.add(registerButton);
		
		ActionListener myButtonListener = new MyButtonListener();
		loginButton.addActionListener(myButtonListener);
		registerButton.addActionListener(myButtonListener);
	}
}
