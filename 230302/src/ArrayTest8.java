
public class ArrayTest8 {
	public static void main(String[] args) {
		int[] arr1 = {10,20,30};
		
		/**
		 * 얕은 복사 (swallow copy)
		 */
		int[] arr2 = new int[3];	//0으로 초기화된 메모리를 참조 중인 상태 
		arr2 = arr1;				//참조번지 변경
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+"\t");
		}
		
		System.out.println();
		
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+"\t");
		}
		System.out.println();
		
		/**
		 * 깊은 복사 (deep copy)
		 */
		//1) for문 
		int[] arr3 = new int[3];
		for(int i=0; i<arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		
		//2) System.arraycopy() 메소드 
		//원본, 원본의 n번째 것을, 복사할곳, 복사할 곳 n번째에, n개 만큼
		int[] arr4 = new int[3];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		
		arr1[0] = 100;
		System.out.println(arr1[0]);
		System.out.println(arr4[0]);
		
		//3) clone() 메소드
		int[] arr5 = arr1.clone();
		arr1[1] = 200;
		System.out.println(arr1[1]);
		System.out.println(arr5[1]);
	}
}
