
public class CloneTest {
	public static void main(String[] args) {
		int[] arr = new int[] {10,20,30};
		int[] cpy = arr.clone();
		printArr(arr);
		System.out.println();
		printArr(cpy);
		System.out.println();
		
		//메모리를 분리해서 복제, cpy[0] 값은 변경되지 않음 
		arr[0] = 100;
		printArr(arr);
		System.out.println();
		printArr(cpy);
		
		
	}
	
	static void printArr(int[] arr){
		for(int n: arr) {
			System.out.print(n+",");
		}
	}
}
