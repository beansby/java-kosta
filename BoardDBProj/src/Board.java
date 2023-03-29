

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

import dao.BoardDAO;
import vo.Article;
import vo.User;

public class Board {
	Scanner sc = new Scanner(System.in);
	private final static int END = 0;
	private final static int USER_REGISTER = 1;
	private final static int USER_INFO = 2;
	private final static int USER_LIST = 3;
	private final static int ARTICLE_WRITE = 4;
	private final static int ARTICLE_DETAIL= 5;
	private final static int ARTICLE_UPDATE = 6;
	private final static int ARTICLE_DELETE = 7;
	private final static int ARTICLE_LIST = 8;
	
	
	int menu() {
		System.out.println("[코스타 게시판]");
		System.out.println("0.종료");
		System.out.println("1.회원가입");		//user -> insert
		System.out.println("2.회원정보");		//user -> select
		System.out.println("3.회원목록");
		System.out.println("4.게시글 작성");	//article -> insert
		System.out.println("5.게시글 상세");	//article -> select (no)
		System.out.println("6.게시글 수정");
		System.out.println("7.게시글 삭제");	//article -> delete	(no)
		System.out.println("8.게시글 목록");	//article -> select (*)
		
		System.out.print("선택>>");
		return Integer.parseInt(sc.nextLine());
	}
	
	void joinUser() {
		System.out.println("[회원 가입]");
		System.out.print("아이디:");
		String id = sc.nextLine();
		System.out.print("이름:");
		String name = sc.nextLine();
		
		User user = new User(id, name);
		
		Connection connection = BoardDAO.dbConnect();	//DB 연결 
		BoardDAO.insertUser(connection, user);			
		BoardDAO.close(connection);						//DB 닫기 
	}
	
	
	void writeArticle() {
		System.out.println("[게시글 작성]");
		System.out.print("제목:");
		String title = sc.nextLine();
		System.out.print("내용:");
		String content = sc.nextLine();
		System.out.print("작성자:");
		String id = sc.nextLine();
		
		
		Connection connection = BoardDAO.dbConnect();	
		
		User user = BoardDAO.selectUser(connection, id);
		if(user == null) {
			System.out.println("사용자 정보에 없는 작성자입니다.");
		} else {
			Article article = new Article(title, content, id);
			BoardDAO.insertArticle(connection, article);						
		}
		
		BoardDAO.close(connection);	
	}
	
	void userInfo() {
		System.out.println("[회원 정보]");
		System.out.print("아이디:");
		String id = sc.nextLine();

		Connection connection = BoardDAO.dbConnect();	
//		System.out.println(BoardDAO.selectUser(connection, id));
		User user = BoardDAO.selectUser(connection, id);
		if(user == null) {
			System.out.println("아이디가 틀립니다.");
		} else {
			System.out.println(user);
		}
		BoardDAO.close(connection);	
	}
	
	void userList() {
		System.out.println("[전체 회원 정보]");
		
		Connection connection = BoardDAO.dbConnect();	
		List<User> list = BoardDAO.selectUserList(connection);
		for(User user : list) {
			System.out.println(user);
		}
		BoardDAO.close(connection);	
	}
	
	void articleDetail() {
		System.out.println("[게시글 상세]");
		System.out.print("글번호:");
		int num = Integer.parseInt(sc.nextLine());
		
		Connection connection = BoardDAO.dbConnect();	
		Article article = BoardDAO.selectArticle(connection, num);
		if(article == null) {
			System.out.println("없는 글번호입니다.");
		} else {
			System.out.println(article);
		}
		BoardDAO.close(connection);
	}
	
	void articleModify() {
		System.out.println("[게시글 수정]");
		System.out.print("글번호:");
		int num = Integer.parseInt(sc.nextLine());
		System.out.print("제목:");
		String title = sc.nextLine();
		System.out.print("내용:");
		String content = sc.nextLine();
		
	
		Connection connection = BoardDAO.dbConnect();
		Article article = BoardDAO.selectArticle(connection, num);
		if(article == null) {
			System.out.println("없는 글번호입니다.");
		} else {
			article.setTitle(title);
			article.setContent(content);
			BoardDAO.updateArticle(connection, article);
		}
		BoardDAO.close(connection);
	}
	
	void articleRemove() {
		System.out.println("[게시글 삭제]");
		System.out.print("글번호:");
		int num = Integer.parseInt(sc.nextLine());
		
		Connection connection = BoardDAO.dbConnect();	
		Article article = BoardDAO.selectArticle(connection, num);
		if(article == null) {
			System.out.println("없는 글번호입니다.");
		} else {
			BoardDAO.deleteArticle(connection, article);
		}
		BoardDAO.close(connection);
	}
	
	void articleList() {
		System.out.println("[게시글 목록]");
		
		Connection connection = BoardDAO.dbConnect();	
		List<Article> list = BoardDAO.selectArticleList(connection);
		for(Article article : list) {
			System.out.println(article);
		}
		BoardDAO.close(connection);	
		
	}
	
	public static void main(String[] args) {
		Board board = new Board();
		while(true) {
			int sel=board.menu();
			if(sel==END) break;
			switch(sel) {
			case USER_REGISTER: board.joinUser(); break;
			case USER_INFO: board.userInfo(); break;
			case ARTICLE_WRITE: board.writeArticle(); break;
			case ARTICLE_DETAIL: board.articleDetail(); break;
			case ARTICLE_DELETE: board.articleRemove(); break;
			case ARTICLE_UPDATE: board.articleModify(); break;
			case ARTICLE_LIST: board.articleList(); break;
			case USER_LIST: board.userList(); break;
			}
		}

	}
}
