package com.mkyong.designs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MyButtonListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton) e.getSource();
		JOptionPane.showMessageDialog(source, source.getText() + " Clicked ....");
		
		
	}
	
	public boolean checkAuthenticate(String username){
		if (username.equals("kasun")){
			return true;
		}
		return false;
	}
}
