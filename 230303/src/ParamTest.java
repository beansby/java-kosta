
public class ParamTest {
	public static void main(String[] args) {
		Data data = new Data();	//참조 주소를 가지고 있는 변수 data
		data.n = 10;
		
		increment1(data.n);
		System.out.println(data.n);
		System.out.println();
		
		increment2(data);	//주소값을 넘겨줌, 원본 데이터에 접근하여 값 변경 가능 
		System.out.println(data.n);
		System.out.println();
		
		int[] arr = new int[] {1,2,3,};
		increment3(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println();
		
		int m = 10;
		func(m);	//m의 값인 10을 복사해서 넘겨줌, m은 여전히 10
	}
	
	//기본형 매개변수 : read only
	public static void increment1(int data) {
		data++;
	}
	
	//참조형 매개변수 : read & write, 원본에 접근 
	public static void increment2(Data data) {
		data.n++;
	}
	
	public static void increment3(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i]++;
		}
	}
	
	public static void func(int n) {
		n++;
	}
}

class Data {
	int n;
} 

