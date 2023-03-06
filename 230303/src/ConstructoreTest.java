
public class ConstructoreTest {
	public static void main(String[] args) {
		Student student = new Student();
		student.id = 100;
		student.grade = 3;
		student.name = "hong";
		student.info();
		
		Student student2 = new Student(101, 4, "song");
		student2.info();
		
		Student student3 = new Student(102);
		student3.info();
		
		Student student4 = new Student(103, "park");
		student4.info();
		
		Student student5 = new Student(104, 4);
		student5.info();
	}
}

class Student {
	int id;
	int grade;
	String name;
	
	Student(){
		System.out.println("student");
	}

	public Student(int id, int grade, String name) {	//지역 변수 
		//인스턴스 변수 = 지역 변수 
		this.id = id;
		this.grade = grade;
		this.name = name;
	}
	
	public Student(int id) {
		this(id, 1, "none"); //전체를 초기화해주는 생성자를 호출 
//		this.id = id;
//		this.name = "none";
//		this.grade = 1;
		
	}
	
	public Student(int id, String name) {
		this(id, 3, name);
//		this.id = id;
//		this.name = name;
	}
	
	public Student(int id, int grade) {
		super();
		this.id = id;
		this.grade = grade;
	}

	void info() {
		System.out.printf("학번:%d, 이름:%s, 학년:%d\n", id, name, grade);	//인스턴스 변수 
	}
}
