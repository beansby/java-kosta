package dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.mysql.cj.exceptions.RSAException;

import vo.Article;
import vo.User;

public class BoardDAO {
	
	/**
	 * DB 연결 
	 * @return
	 */
	public static Connection dbConnect() {
		Connection conn = null;
		try {
			Properties db = new Properties();
			db.load(new FileInputStream("db.properties")); 	//db.load : key, value 쌍으로 가짐 
			
			//방법 1)
			String driver = db.getProperty("driver");
			String url = db.getProperty("url");
			String username = db.getProperty("username");
			String password = db.getProperty("password");
			//실제 DB 연결 코드 2줄 
			Class.forName(driver);		
			conn = DriverManager.getConnection(url, username, password);
			
			//방법 2)
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
	 * 회원가입.
	 * @param conn
	 * @param user
	 * @return 사용자 수 
	 */
	public static int insertUser(Connection conn, User user) {
		PreparedStatement pstmt = null;
		int cnt = 0;
		try {
			String sql = "insert into user (id, name) values(?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setNString(1, user.getId());
			pstmt.setNString(2, user.getName());
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
		return cnt;
	}
	
	
	/**
	 * 회원정보.
	 * @param conn
	 * @param id
	 * @return 사용자 
	 */
	public static User selectUser(Connection conn, String id) {
		User user = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select * from user where id=?";
			pstmt = conn.prepareStatement(sql);		
			pstmt.setNString(1, id);
			rs = pstmt.executeQuery();
			if(rs != null && rs.next()) {
//				String rid = rs.getString("id");
//				String name = rs.getString("name");
//				user = new User(rid, name);
				user = new User(rs.getString("id"), rs.getString("name"));
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
		return user;
	}
	
	/**
	 * 회원 목록 조회 
	 * @param conn
	 * @return
	 */
	public static List<User> selectUserList(Connection conn){
		List<User> userList = new ArrayList<>();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			String sql = "select * from user";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			if(rs != null) {
				while(rs.next()) {
					userList.add(new User(rs.getString("id"), rs.getString("name")));
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
		return userList;
	}
	
	
	/**
	 * 게시글 작성.
	 * @param conn
	 * @param article
	 * @return
	 */
	public static int insertArticle(Connection conn, Article article) {
		PreparedStatement pstmt = null;
		int cnt = 0;
		try {
			String sql = "insert into article (title, content, writer) values(?,?,?)";
			pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			pstmt.setNString(1, article.getTitle());
			pstmt.setNString(2, article.getContent());
			pstmt.setNString(3, article.getWriter());
			cnt = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null) pstmt.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return cnt;
	}
	
	
	/**
	 * 게시글 상세 조회. 
	 * @param conn
	 * @param num
	 * @return
	 */
	public static Article selectArticle(Connection conn, int num) {
		Article article = null;
		ResultSet res = null;
		PreparedStatement pstmt = null;
		try {
			String sql = "select * from article where num=?";
			pstmt = conn.prepareStatement(sql);		
			pstmt.setInt(1, num);
			res = pstmt.executeQuery();
			
			if(res != null && res.next()) {
				article = new Article(res.getInt("num"), res.getString("title"), res.getString("content"), res.getString("writer"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(res != null) res.close();
				if(pstmt != null) pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return article;
	}
	
	/**
	 * 게시글 목록 조회.
	 * @param conn
	 * @return List<Article>
	 */
	public static List<Article> selectArticleList (Connection conn){
		List<Article> articleList = new ArrayList<>();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			String sql = "select * from article";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			if(rs != null) {
				while(rs.next()) {
					Integer num = rs.getInt("num");
					String title = rs.getString("title");
					String content = rs.getString("content");
					String writer = rs.getString("writer");
					articleList.add(new Article(num, title, content, writer));
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
		return articleList;
	}
	
	
	/**
	 * 게시글 수정.
	 * 번호 일치시에 수정 (호출시 처리)
	 * @param conn
	 * @param article
	 * @return
	 */
	public static int updateArticle(Connection conn, Article article) {
		
		PreparedStatement pstmt = null;
		int cnt = 0;
		
		try {
			String sql = "update article set title=?, content=? where num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setNString(1, article.getTitle());
			pstmt.setNString(2, article.getContent());
			pstmt.setInt(3, article.getNum());
			cnt = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return cnt;
	}
	
	/**
	 * 게시글 삭제.
	 * @param conn
	 * @param article
	 * @return
	 */
	public static int deleteArticle(Connection conn, Article article) {
		PreparedStatement pstmt = null;
		int cnt = 0;
		
		try {
			String sql = "delete from article where num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, article.getNum());
			cnt = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return cnt;
	}
	
	

	
}
