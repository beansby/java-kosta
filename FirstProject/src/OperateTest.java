
public class OperateTest {
	public static void main(String[] args) {
		/**
		 * 증감 연산자
		 */
		int n = 10, m = 10;
		System.out.println("n : "+n+" m : "+m);
		
		//연산결과 리턴 + 자신의 값 증가 
		//연산의 결과에서 차이 발생 
		int result = ++n;
		System.out.println("++n : "+result);	//11
		System.out.println("n : "+n);			//11
		
		int result2 = m++;
		System.out.println("m++ : "+result2);	//10
		System.out.println("m : "+m);			//11
		
		//변수 값 리턴 후 증가 
		System.out.println(n++);	//11
		//증가된 변수 값 리턴 
		System.out.println(++m);	//12
		
		System.out.println(n); 		//12
		System.out.println();
		
		
		/**
		 * 연산 시 형변환 
		 */
		byte a = 10, b = 20;
		//a+b = int : 컴파일 에러
		//byte c = a + b;	 
		byte c2 = (byte)(a+b);
		int c3 = a+b;
		
		int i = 1000000, i2 = 2000000;
		//int*int = int : long으로 형변환 필요 
		long r = i*i2;
		long r2 = (long)i*i2;
		System.out.println(r);		//-1454759936
		System.out.println(r2);		//2000000000000
		
		System.out.println();
		
		/**
		 * Math 함수 
		 */
		
		// Math.round() : 소수점 첫째자리에서 반올림 -> 정수 변환 
		float pi = 3.141592f;
		System.out.println(Math.round(pi));		//3
		
		//소수 넷째자리에서 반올림 -> 셋째자리까지 나타냄 
		float pi2 = Math.round(pi*1000)/1000f;
		System.out.println(pi2);				//3142 -> 3.142
		
		System.out.println();
		
	}
}
