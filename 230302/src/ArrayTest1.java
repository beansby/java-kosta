
public class ArrayTest1 {
	public static void main(String[] args) {
		/**
		 * int 배열 생성 & 초기화 
		 */
		int[] arr1 = new int[5];
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		arr1[3] = 40;
		arr1[4] = 50;
		//arr1[5] = 60; //컴파일 에러 ArrayIndexOutOfBoundsException
		
		//배열 생성과 동시 초기화할시 배열의 길이[] 생략해야 함 
		int[] arr2 = new int[] {10,20,30,40,50};
		
		//배열 생성과 동시 초기화시 new int[] 생략 가능 
		int[] arr4 = {10,20,30,40,50};
		
		//배열 선언 후 생성&초기화 시 new int[] 생략 불
		int[] arr3;
		arr3 = new int[] {10,20,30,40,50};
		
		//컴파일 에러 
//		int[] arr4;
//		arr4 = {10,20,30,40,50};
		
		int sum = 0;
		for(int i=0; i<arr2.length; i++) {
			sum += arr2[i];
		}
		System.out.println(sum);
		
		int n,m;
		// 변수 n에 10 담기 
		n = 10;
		// 변수 m에 n값 복사 
		m = n;
		System.out.println(n);
		// 리터럴 값은 readonly 
//		10 = 20;
	}
}
