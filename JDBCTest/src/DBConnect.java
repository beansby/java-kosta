import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnect {
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Properties db = new Properties();
			db.load(new FileInputStream("db.properties"));
			Class.forName(db.getProperty("driver"));
			conn = DriverManager.getConnection(db.getProperty("url"), 
					db.getProperty("username"), db.getProperty("password"));
		} catch(Exception e) {
			e.printStackTrace();
		} 
		return conn;
	}
	
	public static void close(Connection conn) {
		try {
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void insertAccount(Connection conn, Account acc) {
		PreparedStatement pstmt = null;
		String sql = "insert into account (id, name, balance) values(?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setNString(1, acc.getId());
			pstmt.setNString(2, acc.getName());
			pstmt.setInt(3, acc.getBalance());
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
	}
	
	public static int updateAccount(Connection conn, String id, int money) {
		PreparedStatement pstmt = null;
		int cnt = 0;
		try {
			String sql = "update account set balance=? where id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, money);
			pstmt.setNString(2, id);
			cnt = pstmt.executeUpdate();  //update한 행의 갯수 반환
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null) pstmt.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		return cnt;
	}
	
	public static Account selectAccount(Connection conn, String id) {
		Account acc = null;
		PreparedStatement pstmt = null;
		try {
			String sql = "select * from account where id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setNString(1, id);
			ResultSet rs = pstmt.executeQuery();
			if(rs!=null && rs.next()) {
				String rid = rs.getString("id");
				String name = rs.getString("name");
				int balance = rs.getInt("balance");
				acc = new Account(rid,name,balance);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null) pstmt.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		return acc;
	}
	
	public static void deleteAccount(Connection conn, String id) {
		PreparedStatement pstmt = null;
		try {
			String sql = "delete from account where id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
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
	}
	
	public static void transfer(Connection conn, String sid, String rid, int money) {
		try {
			conn.setAutoCommit(false);
			//1. 보내는 계좌번호로 계좌 조회 : select
			Account acc = selectAccount(conn, sid);
			if(acc==null) throw new Exception("출금계좌번호 오류");
			//2. 출금 : update
			acc.withdraw(money);
			int cnt = updateAccount(conn, acc.getId(), acc.getBalance());
			if(cnt==0) throw new Exception("출금 실패");
			//3. 받는 계좌번호로 계좌 조회 : select, 계좌조회 실패시 rollback
			acc = selectAccount(conn, rid);
			if(acc==null) {
				conn.rollback(); //보내는 계좌 출금 원상복구작업
				throw new Exception("입금계좌 오류");
			}
			//4. 입금 : update, 입금 실패시 rollback
			acc.deposit(money);
			cnt = updateAccount(conn, acc.getId(), acc.getBalance());
			if(cnt==0) {
				conn.rollback();
				throw new Exception("입금오류");
			}
			//5. commit
			conn.commit();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.setAutoCommit(true);
			} catch(Exception e) {
				e.printStackTrace();
			}
		} 
	}
}












