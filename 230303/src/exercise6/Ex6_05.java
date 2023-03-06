package exercise6;
/**
 * 다음과 같은 실행결과를 얻도록 Student클래스에 생성자와 info()를 추가
 * @author ebina
 *
 */
public class Ex6_05 {
	public static void main(String[] args) {
		Student2 s = new Student2("홍길동",1,1,100,60,76); 
		System.out.println(s.info());
	}
}

class Student2 {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	
	
	public Student2(String name, int ban, int no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() {
		return kor+eng+math;
	}
	
	float getAverage() {
		int sum = getTotal();
		float avg = Math.round(((float)(sum/3f)));
		return avg;
	}

	String info() {
		int sum = getTotal();
		float avg = getAverage();
		return name +","+ ban +","+ no +","+ kor +","+ eng +","+ math +","+ sum +"," + avg;
	}
}