package exercise;

public class Ex5_04 {
	public static void main(String[] args) {
		int[][] arr = {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
		};
		
		int total = 0;
		float avg = 0;
		int count = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				total += arr[i][j];
			};
			count = arr.length * arr[i].length;
		}
		avg = (float) total / count;
		
		
		System.out.println("total = "+total);	//total = 325
		System.out.println("average = "+avg);	//average = 16.25
	}
}
