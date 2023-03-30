package dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.kosta.dto.Order;

public class ShopDAO {
	
	/**
	 * DB 연결 
	 * @return Connection
	 */
	public static Connection dbConnect() {
		Connection conn = null;
		try {
			Properties db = new Properties();
			db.load(new FileInputStream("db.properties")); 	//db.load : key, value 쌍으로 가짐 
	
			Class.forName(db.getProperty("driver"));		//getProperty(key) : key의 value를 가져옴
			conn = DriverManager.getConnection(db.getProperty("url"), 
					db.getProperty("username"), db.getProperty("password"));
			
		} catch(Exception e) {
			e.printStackTrace();
		} 
		return conn;
	}
	
	/**
	 * DB 닫기 
	 * @param conn
	 */
	public static void close(Connection conn) {
		try {
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 주문 추가.
	 * @param conn
	 * @param order
	 * @return
	 */
	public static int insertOrder(Connection conn, Order order) {
		return 0;
	}
	
	
	
}
