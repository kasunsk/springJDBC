package com.mkyong.customer.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import com.mkyong.common.App;
import com.mkyong.customer.dao.PersionDAO;
import com.mkyong.customer.model.Persion;


public class JdbcPersionDAO implements PersionDAO
{
	private static final Logger log = LoggerFactory.getLogger(JdbcPersionDAO.class);
	
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public void insert(Persion persion){
		
		String sql = "INSERT INTO persion " +
				"(Name, ID, Sex, Address, TPNum) VALUES (?, ?, ?, ?, ?)";
		
		log.info("sql: "+sql);
		
		Connection conn = null;
		
		try {
			log.info("Entered to (try) in insert mathod");
			
			conn = dataSource.getConnection();
			log.info("Make connection");
			
			PreparedStatement ps = conn.prepareStatement(sql);
			log.info("prepareStatement(sql)");
			
			ps.setString(1, persion.getId());
			ps.setString(2, persion.getName());
			ps.setString(3, persion.getSex());
			ps.setString(3, persion.getAddress());
			ps.setString(3, persion.getTpnum());
			
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
	
	public Persion findByCustomerId(int custId){
		
		log.info("Entered to findByCustomerId");
		
		String sql = "SELECT * FROM persion WHERE ID = ?";
		
		log.info("sql is "+sql);
		
		Connection conn = null;
		
		try {
			
			log.info("Entered to findByCustomerId");
			
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, custId);
			Persion persion = null;
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				persion = new Persion(
						rs.getString("ID"),
						rs.getString("Name"),
						rs.getString("Sex"),
						rs.getString("Address"),
						rs.getString("TPNum")
						
				);
			}
			rs.close();
			ps.close();
			return persion;
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




