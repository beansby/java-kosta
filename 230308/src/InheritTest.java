
public class InheritTest {
	public static void main(String[] args) {
		Student s1 = new Student(20, "홍길동", "010-1233-4567","서울시 성동구 ", 4, "경영학");
		System.out.println(s1);
		
		Student s2 = new Student();
		s2.name = "김길동";
		s2.age = 23;
		s2.tel = "010-2222-2222";
		s2.address = "서울시 관악구 ";
		s2.major = "컴퓨터공학";
		s2.grade = 3;
		//setter, getter 로 데이터 접근 
		s2.setName("이길동");
		s2.setGrade(2);
		System.out.println(s2);
	}
}

class Person {
	int age;
	String name;
	String tel;
	String address;
	
	public Person() {
	}

	public Person(int age, String name, String tel, String address) {
		this.age = age;
		this.name = name;
		this.tel = tel;
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "이름 : " + name + "\t 나이 : " + age + "\t 전화번호 : " + tel + "\t 주소 : " + address;
	}	
}



class Student extends Person {
	int grade;
	String major;
	
	Student() {
		
	}
	
	//부모클래스 변수의 초기화는 자식클래스 책임
	public Student(int age, String name, String tel, String address, int grade, String major) {
		//부모의 생성자 명시적 지정 호출 
		super(age, name, tel, address);
		this.grade = grade;
		this.major = major;
	}
	

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return super.toString()+"\t 학년 : " + grade + "학년 \t 전공 : " + major +"과";
	}
}