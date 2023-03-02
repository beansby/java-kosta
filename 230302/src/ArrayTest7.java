
public class ArrayTest7 {
	public static void main(String[] args) {
		int[] arr = {10,20,30};
		
		//복사 
		int[] arr2 = arr;
		
		System.out.println("arr 값 바꾸기 전 ");
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		
		System.out.println();
		
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+"\t");
		}
		System.out.println();
		
		
		arr[0] = 100;
		
		System.out.println("arr 값 바꾼 후 ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		
		System.out.println();
		
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+"\t");
		}
		System.out.println();
		
		arr2[0] = 200;
		System.out.println("arr2 값 바꾼 후 ");
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		
		System.out.println();
		
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+"\t");
		}
		
	}
}
