import java.util.Iterator;

public class ArrayTest6 {
	public static void main(String[] args) {
		/**
		 * 2차원 배열의 길이가 다른 다차원 배열 = 가변길이 다차원 배열 
		 */
		int[][] arr = new int[2][];
		arr[0] = new int[] {1,2,3};
		arr[1] = new int[] {4,5};
		
		int[][] arr2 = {
				{1,2,3},
				{4,5}
		};
		
		int[] arr3[];
		int[][] arr4;
		int arr5[][];
		
		
		for (int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
