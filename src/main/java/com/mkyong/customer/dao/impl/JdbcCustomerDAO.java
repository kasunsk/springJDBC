package com.mkyong.customer.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import com.mkyong.common.App;
import com.mkyong.customer.dao.CustomerDAO;
import com.mkyong.customer.model.Customer;

public class JdbcCustomerDAO implements CustomerDAO
{
	private static final Logger log = LoggerFactory.getLogger(JdbcCustomerDAO.class);
	
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public void insert(Customer customer){
		
		String sql = "INSERT INTO customer " +
				"(CUST_ID, NAME, AGE) VALUES (?, ?, ?)";
		
		log.info("sql: "+sql);
		
		Connection conn = null;
		
		try {
			log.info("Entered to (try) in insert mathod");
			
			conn = dataSource.getConnection();
			log.info("Make connection");
			
			PreparedStatement ps = conn.prepareStatement(sql);
			log.info("prepareStatement(sql)");
			
			ps.setInt(1, customer.getCustId());
			log.info("1 for customer");
			ps.setString(2, customer.getName());
			log.info("2 for customer");
			ps.setInt(3, customer.getAge());
			log.info("3 for customer");
			
			
			
			log.info("object : "+ ps);
			
			ps.executeUpdate();
			log.info("Data inserted");
			
			ps.close();
			log.info("closed");
			
		} catch (SQLException e) {
			log.error("Error in connection 1");
			throw new RuntimeException(e);
			
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					log.error("Error in connection 2...",e);
				}
			}
		}
	}
	
	public Customer findByCustomerId(int custId){
		
		log.info("Entered to findByCustomerId");
		
		String sql = "SELECT * FROM customer WHERE CUST_ID = ?";
		
		log.info("sql is "+sql);
		
		Connection conn = null;
		
		try {
			
			log.info("Entered to findByCustomerId");
			
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, custId);
			Customer customer = null;
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				customer = new Customer(
						rs.getInt("CUST_ID"),
						rs.getString("NAME"), 
						rs.getInt("Age")
				);
			}
			rs.close();
			ps.close();
			return customer;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
				conn.close();
				} catch (SQLException e) {
					log.error("Error in connection...");
				}
			}
		}
	}
}




