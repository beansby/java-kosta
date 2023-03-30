package com.kosta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.kosta.dto.Order;
import com.kosta.dto.Product;

import dao.ShopDAO;
import vo.Article;

public class Shop {
	
	/**
	 * 상품 추가.
	 * table item
	 * @param product
	 */
	public void addProduct(Product product) {
		Connection conn = ShopDAO.dbConnect();	//DB 연결 
			
		PreparedStatement pstmt = null;
		try {
			String sql = "insert into item (name, price, stock, category) values(?,?,?,?)";
			pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			
			pstmt.setNString(1, product.getName());
			pstmt.setInt(2, product.getPrice());
			pstmt.setInt(3, product.getStock());
			pstmt.setNString(4, product.getCategory());
			pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null) pstmt.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		ShopDAO.close(conn);	
	}
	
	
	/**
	 * 주문 추가.
	 * table indent
	 * @param order
	 * @return
	 */
	public int order(Order order) {
		Connection conn = ShopDAO.dbConnect();	//DB 연결 
		int cnt = 0;
		PreparedStatement pstmt = null;
		try {
			String sql = "insert into indent (customer, productCode, amount) values(?,?,?)";
			pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			pstmt.setNString(1, order.getCustomer());
			pstmt.setNString(2, order.getProductCode());
			pstmt.setInt(3, order.getAmount());
			cnt = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null) pstmt.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		ShopDAO.close(conn);	
		return cnt;
	}


	/**
	 * 상품 정보 조회.
	 * @param code
	 * @return Product
	 */
	public Product findProductByCode(String code) {
		Connection conn = ShopDAO.dbConnect();
		
		Product product = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		try {
			String sql = "select * from item where code=?";
			pstmt = conn.prepareStatement(sql);		
			pstmt.setNString(1, code);
			rs = pstmt.executeQuery();
			
			if(rs != null && rs.next()) {
				String code2 = rs.getString("code");
				String name = rs.getString("name");
				Integer price = rs.getInt("price");
				Integer stock = rs.getInt("stock");
				String category = rs.getString("category");
				product = new Product(code2, name, price, stock, category);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		ShopDAO.close(conn);
		return product;
	}
	

	/**
	 * 전체 상품 정보 조회.
	 */
	public void printAllProductInfo() {
		Connection conn = ShopDAO.dbConnect();
		List<Product> itemList = new ArrayList<>();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			String sql = "select * from item";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			if(rs != null) {
				while(rs.next()) {
					
					String code2 = rs.getString("code");
					String name = rs.getString("name");
					Integer price = rs.getInt("price");
					Integer stock = rs.getInt("stock");
					String category = rs.getString("category");
					itemList.add(new Product(code2, name, price, stock, category));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		for (Product product : itemList) {
			System.out.println(product);
		}
		ShopDAO.close(conn);
	}


	/**
	 * 전체 주문 정보 조회.
	 */
	public void printAllOrderInfo() {
		Connection conn = ShopDAO.dbConnect();
		List<Order> orderList = new ArrayList<>();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			String sql = "select * from indent";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			if(rs != null) {
				while(rs.next()) {
					Integer no = rs.getInt("no");
					String customer = rs.getString("customer");
					String productcode = rs.getString("productcode");
					Integer amount = rs.getInt("amount");
					Boolean canceled = rs.getBoolean("canceled");
					orderList.add(new Order(no, customer, productcode, amount, canceled));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		for (Order order : orderList) {
			System.out.println(order);
		}
		ShopDAO.close(conn);
	}

	/**
	 * 주문번호로 주문 정보 조회. 
	 * @param orderNo
	 * @return
	 */
	public Order findOrderByNo(int orderNo) {
		Connection conn = ShopDAO.dbConnect();
	
		Order order = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		try {
			String sql = "select * from indent where no=?";
			pstmt = conn.prepareStatement(sql);		
			pstmt.setInt(1, orderNo);
			rs = pstmt.executeQuery();
			
			if(rs != null && rs.next()) {
				Integer no = rs.getInt("no");
				String customer = rs.getString("customer");
				String productcode = rs.getString("productcode");
				Integer amount = rs.getInt("amount");
				Boolean canceled = rs.getBoolean("canceled");
				order = new Order(no, customer, productcode, amount, canceled);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		ShopDAO.close(conn);
		return order;
	}


	/**
	 * 주문번호로 주문 취소.
	 * set
	 * @param orderNo 주문번호 
	 * @return
	 */
	public Order cancelOrder(int orderNo) {
		Connection conn = ShopDAO.dbConnect();
		
		Order order = findOrderByNo(orderNo);
		order.setCanceled(!(order.getCanceled()));	//상태 변경
		
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		
		try {
			String sql = "update indent set canceled=? where no=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setBoolean(1, order.getCanceled());
			pstmt.setInt(2, order.getNo());
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		ShopDAO.close(conn);
		return order;
	}
	

	public void printOrderDetailsByCustomerAndIsCanceled(String customer, String status) {
		Connection conn = ShopDAO.dbConnect();
		
		Order order = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		Boolean cancel;
		if(status.equals("취소")) cancel = true;
		else cancel = false;
		
		try {
			String sql = "select * from indent where customer=? and canceled=?";
			pstmt = conn.prepareStatement(sql);		
			pstmt.setNString(1, customer);
			pstmt.setBoolean(2, cancel);
			rs = pstmt.executeQuery();
			
			if(rs != null && rs.next()) {
				Integer no = rs.getInt("no");
				String customer2 = rs.getString("customer");
				String productcode = rs.getString("productcode");
				Integer amount = rs.getInt("amount");
				Boolean canceled = rs.getBoolean("canceled");
				order = new Order(no, customer2, productcode, amount, canceled);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		ShopDAO.close(conn);
		
	}	
}
