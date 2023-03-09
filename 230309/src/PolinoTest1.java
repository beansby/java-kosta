import java.lang.ProcessHandle.Info;

public class PolinoTest1 {
	public static void main(String[] args) {
		SpecialAccount sacc = new SpecialAccount("1001", "홍길동", 100000, "VIP");
		sacc.deposit(10000);
		System.out.print(sacc.info());
		System.out.println("\t ========> 자식 클래스 Info()");
		sacc.withdraw(5000);
		System.out.println(sacc.info());
		
		//upcasting : 자식 객체를 부모 타입 변수에 할당 
		Account acc = new SpecialAccount("1002", "김길동", 200000, "Gold");
		//오버라이딩한 자식의 메소드 호출 
		acc.deposit(10000);
		System.out.print(acc.info());
		System.out.println("\t ========> 자식 클래스 Info()");
		//부모 타입의 변수로 자식이 가지고 있는 속성, 메소드 접근 불가 
//		String grade = acc.getGrade();
		
		Account acc2 = new Account("1003", "차길동", 300000);
		System.out.print(acc2.info());
		System.out.println("\t\t\t ========> 부모 클래스 Info()");
		
		//자식 객체로 생성한 부모 타입의 변수를 자식 타입의 변수에 강제타입변환을 통해 할당 가능 
		SpecialAccount sacc2 = (SpecialAccount) acc;
		
	}
}
