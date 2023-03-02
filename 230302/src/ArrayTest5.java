
public class ArrayTest5 {
	public static void main(String[] args) {
		/**
		 * 마지막 행, 열에 각 행과 열의 합계를 저장하고 출력하는 코드 작성 
		 */
		int[][] arr1 = {
			{10,11,12,0},
			{20,21,22,0},
			{30,31,32,0},
			{40,41,42,0},
			{50,51,52,0},
			{0,0,0,0}
		};
		
		int sum1 = 0;	//가로 
		int sum2 = 0;	//세로 
		
//		//가로(행) 합 
//		for(int i=0; i<arr1.length-1; i++) {		//열의 길이 - 1
//			for(int j=0; j<arr1[i].length-1; j++) {	//행의 길이 - 1 
//				sum1 += arr1[i][j];
//				//arr1[i][3] 저장 
//				arr1[i][arr1[i].length-1] = sum1;
//				
//			}
//		}
//		
//		//세로(열) 합
//		for(int j=0; j<arr1[0].length; j++) { 		//행의 길이 
//			for (int i=0; i<arr1.length-1; i++) { 	//열의 길이 - 1
//				sum2 += arr1[i][j];
//				arr1[arr1.length-1][j] = sum2;	
//			}
//		}
	
		
		/**
		 * 다른 풀이 
		 */
		for (int i=0; i<arr1.length-1; i++) {
			for (int j=0; j<arr1[i].length-1; j++) {
				arr1[i][3] += arr1[i][j];
				arr1[5][j] += arr1[i][j];
				arr1[5][3] += arr1[i][j];
			}
		}
		
		//배열 출력 
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				System.out.print(arr1[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
