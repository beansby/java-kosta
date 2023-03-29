package vo;

public class User {

	private String id;
	private String name;
	
	public User() {
	}
	
	public User(String id, String name) {
		this.id = id;
		this.name = name;
	}


	//getter, setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "아이디:"+getId()+", 이름:"+getName();
	}
	
	
	
	
	
}
