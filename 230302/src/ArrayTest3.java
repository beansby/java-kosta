
public class ArrayTest3 {
	public static void main(String[] args) {
		/**
		 * 다차원 배열 
		 */
		int[][] arr1 = new int[5][3];
		System.out.println(arr1.length);	//5 : 1차원 배열의 갯수, 행의 갯수
		System.out.println(arr1[0].length); //3 : 열의 갯수
		
		//데이터 넣기 
		arr1[0][0] = 10;
		arr1[0][1] = 11;
		arr1[0][2] = 12;
		
		for (int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				arr1[i][j] = (i*10)+10+j;
				System.out.print(arr1[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
