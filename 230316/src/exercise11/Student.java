package exercise11;


public class Student implements Comparable {
	String name;
	int ban;
	int no;
	int kor, eng, math;
	
	int total;		//총점 
	int schoolRank; 	//전교등수 
	int classRank; 	//반등수 
	
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	
		total = kor+eng+math;
	}

	int getTotal() {		
		return total;
	}
	
	float getAverage() {
		return (int)((getTotal()/ 3f)*10+0.5)/10f;
	}

	@Override
	public String toString() {
		return name +","+ban +","+no +","+kor
				+","+eng +","+math
				+","+getTotal() +","+getAverage()
				+", 전교등수: "+schoolRank // 새로추가
				+", 반등수: "+classRank;
	}

	//1~7 : 오름차순 이름 
//	@Override
//	public int compareTo(Object o) {
//		if(o instanceof Student) {
//			Student s = (Student) o;
//			return name.compareTo(s.name);
//		} else return -1;
//	}
	
	//8~9 : 내림차순 총점 
	@Override
	public int compareTo(Object o) {
		if(o instanceof Student) {
			Student s = (Student) o;
			return (int)(s.getTotal() - getTotal());
		} else return -1;
	}
}