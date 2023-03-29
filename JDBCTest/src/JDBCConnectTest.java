import java.sql.Connection;
import java.sql.PreparedStatement;

public class JDBCConnectTest {
	public static void main(String[] args) {
		Connection conn = DBConnect.getConnection();

		//계좌개설
//		Account acc = new Account("1001","홍길동",100000);
//		DBConnect.insertAccount(conn, acc);
		
		//조회
//		Account acc = DBConnect.selectAccount(conn, "1001");
//		System.out.println(acc.info());
		
		//입금
//		Account acc = DBConnect.selectAccount(conn, "1001");
//		acc.deposit(10000);
//		DBConnect.updateAccount(conn, acc.getId(), acc.getBalance());
		
		//출금
//		Account acc = DBConnect.selectAccount(conn, "1001");
//		acc.withdraw(5000);
//		DBConnect.updateAccount(conn, acc.getId(), acc.getBalance());		
		
//		DBConnect.deleteAccount(conn, "1001");

		DBConnect.transfer(conn, "1001", "9999", 10000);
		
		DBConnect.close(conn);
	}
}
