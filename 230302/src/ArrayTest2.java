
public class ArrayTest2 {
	public static void main(String[] args) {
		/**
		 * 배열의 평균 구하기 
		 */
		int[] score = {98, 85, 77, 89, 100};
		int sum = 0;
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		double avg = (double)sum / score.length;
		System.out.println("총점 : "+sum);
		System.out.println("평균점수 : "+avg);
	}
}
