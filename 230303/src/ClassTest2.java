
public class ClassTest2 {
	public static void main(String[] args) {
		
		//클래스 배열 != 클래스 객체, == 배열 객체 
		//각 배열요소에 객체를 생성해서 사용 
		Person[] pers = new Person[3];
		
		//NullPointerException 
		//pers[0].info();
		
		pers[0] = new Person();
		pers[0].age = 20;
		pers[0].name = "홍길동";
		pers[0].info();
		
		pers[1] = new Person("가나다", 30);
		pers[2] = new Person("jordan", 23);
		
		System.out.println();
		
		for(int i=0; i<pers.length; i++) {
			pers[i].info();
		}
	}
}
