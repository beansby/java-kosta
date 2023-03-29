package vo;

public class Article {

	private Integer num;
	private String title;
	private String content;
	private String writer;
	
	public Article() {}
	public Article(Integer num, String title, String content, String writer) {
		this.num = num;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	
	//getter, setter
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	@Override
	public String toString() {
		return "글번호:"+getNum()+", 제목:"+getTitle()+", 내용:"+getContent()+", 작성자:"+getWriter();
				
	}
	
	
	
	
	
	
}
