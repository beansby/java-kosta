

import java.util.Scanner;

public class Board {
	Scanner sc = new Scanner(System.in);
	int menu() {
		System.out.println("[코스타 게시판]");
		System.out.println("0.종료");
		System.out.println("1.회원가입");		//user -> insert
		System.out.println("2.회원정보");		//user -> select
		System.out.println("3.게시글작성");	//article -> insert
		System.out.println("4.게시글상세");	//article -> select (no)
		System.out.println("5.게시글삭제");	//article -> delete	(no)
		System.out.println("6.게시글목록");	//article -> select (*)
		System.out.print("선택>>");
		return Integer.parseInt(sc.nextLine());
	}
	void joinUser() {
		System.out.println("[회원 가입]");
		System.out.print("아이디:");
		String id = sc.nextLine();
		System.out.print("이름:");
		String name = sc.nextLine();
	}
	void writeArticle() {
		System.out.println("[게시글 작성]");
		System.out.print("제목:");
		String title = sc.nextLine();
		System.out.print("내용:");
		String content = sc.nextLine();
		System.out.print("작성자:");
		String id = sc.nextLine();
	}
	void userInfo() {
		System.out.println("[회원 정보]");
		System.out.print("아이디:");
		String id = sc.nextLine();
	}
	void userList() {
		System.out.println("[전체 회원 정보]");
	}
	void articleDetail() {
		System.out.println("[게시글 상세]");
		System.out.print("글번호:");
		int num = Integer.parseInt(sc.nextLine());
	}
	void articleModify() {
		System.out.println("[게시글 수정]");
		System.out.print("글번호:");
		int num = Integer.parseInt(sc.nextLine());
		System.out.print("제목:");
		String title = sc.nextLine();
		System.out.print("내용:");
		String content = sc.nextLine();
		
	}
	void articleRemove() {
		System.out.println("[게시글 삭제]");
		System.out.print("글번호:");
		int num = Integer.parseInt(sc.nextLine());
		
	}
	void articleList() {
		System.out.println("[게시글 목록]");
		
	}
	public static void main(String[] args) {
		Board board = new Board();
		while(true) {
			int sel=board.menu();
			if(sel==0) break;
			switch(sel) {
			case 1: board.joinUser(); break;
			case 2: board.userInfo(); break;
			case 3: board.writeArticle(); break;
			case 4: board.articleDetail(); break;
			case 5: board.articleRemove(); break;
			case 6: board.articleList(); break;
			}
		}

	}
}
